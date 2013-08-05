package com.lvl6.aoc2.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Iterables;
import com.lvl6.aoc2.entitymanager.UserEntityManager;
import com.lvl6.aoc2.entitymanager.UserStructureEntityManager;
import com.lvl6.aoc2.entitymanager.staticdata.StructureRetrieveUtils;
import com.lvl6.aoc2.entitymanager.staticdata.UserStructureRetrieveUtils;
import com.lvl6.aoc2.eventprotos.BuildOrUpgradeStructureEventProto.BuildOrUpgradeStructureRequestProto;
import com.lvl6.aoc2.eventprotos.BuildOrUpgradeStructureEventProto.BuildOrUpgradeStructureResponseProto;
import com.lvl6.aoc2.eventprotos.BuildOrUpgradeStructureEventProto.BuildOrUpgradeStructureResponseProto.BuildOrUpgradeStructureStatus;
import com.lvl6.aoc2.eventprotos.BuildOrUpgradeStructureEventProto.BuildOrUpgradeStructureResponseProto.Builder;
import com.lvl6.aoc2.eventprotos.BuildOrUpgradeStructureEventProto.ResourceCostType;
import com.lvl6.aoc2.events.RequestEvent;
import com.lvl6.aoc2.events.request.BuildOrUpgradeStructureRequestEvent;
import com.lvl6.aoc2.events.response.BuildOrUpgradeStructureResponseEvent;
import com.lvl6.aoc2.noneventprotos.AocTwoEventProtocolProto.AocTwoEventProtocolRequest;
import com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto;
import com.lvl6.aoc2.po.Consumable;
import com.lvl6.aoc2.po.Structure;
import com.lvl6.aoc2.po.User;
import com.lvl6.aoc2.po.UserStructure;
import com.lvl6.aoc2.widerows.RestrictionOnNumberOfUserStructure;
import com.lvl6.aoc2.widerows.WideRowValue;
import com.netflix.astyanax.connectionpool.exceptions.ConnectionException;


@Component
public class BuildOrUpgradeStructureController extends EventController {

	private static Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

	@Autowired
	protected StructureRetrieveUtils structureRetrieveUtils; 
	
	@Autowired
	protected UserStructureRetrieveUtils userStructureRetrieveUtils; 

	@Autowired
	protected UserStructureEntityManager userStructureEntityManager;

	@Autowired
	protected UserEntityManager userEntityManager;

	@Autowired
	protected RestrictionOnNumberOfUserStructure restrictionOnNumberOfUserStructure;

	@Override
	public RequestEvent createRequestEvent() {
		return new BuildOrUpgradeStructureRequestEvent();
	}

	@Override
	public int getEventType() {
		return AocTwoEventProtocolRequest.C_BUILD_OR_UPGRADE_STRUCTURE_EVENT_VALUE;
	}

	@Override
	protected void processRequestEvent(RequestEvent event) throws Exception {
		//stuff client sent
		BuildOrUpgradeStructureRequestProto reqProto = 
				((BuildOrUpgradeStructureRequestEvent) event).getBuildOrUpgradeStructureRequestProto();

		//get the values client sent
		MinimumUserProto sender = reqProto.getMup();

		//uuid's are not strings, need to convert from string to uuid, vice versa
		String userIdString = sender.getUserID();
		UUID userId = UUID.fromString(userIdString);
		Date clientDate = new Date();
		String userStructureIdString = reqProto.getStructureId();
		UUID userStructureId = UUID.fromString(userStructureIdString);

		//response to send back to client
		Builder responseBuilder = BuildOrUpgradeStructureResponseProto.newBuilder();
		responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_OTHER);
		BuildOrUpgradeStructureResponseEvent resEvent =
				new BuildOrUpgradeStructureResponseEvent(userIdString);
		resEvent.setTag(event.getTag());

		try {
			//get whatever we need from the database
			User inDb = getUserEntityManager().get().get(userId);
			UserStructure us = getUserStructureEntityManager().get().get(userStructureId);
			List<Structure> sList = new ArrayList<Structure>();

			//validate request
			boolean validRequest = isValidRequest(responseBuilder, sender, inDb,
					us, sList, clientDate);

			boolean successful = false;
			if (validRequest) {
				Structure s = sList.get(0);
				successful = writeChangesToDb(inDb, us, s, clientDate);
			}

			if (successful) {
				responseBuilder.setStatus(BuildOrUpgradeStructureStatus.SUCCESS);
			}

			//write to client
			resEvent.setBuildOrUpgradeStructureResponseProto(responseBuilder.build());
			log.info("Writing event: " + resEvent);
			getEventWriter().handleEvent(resEvent);

		} catch (Exception e) {
			log.error("exception in BuildOrUpgradeStructureController processRequestEvent", e);

			try {
				//try to tell client that something failed
				responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_OTHER);
				resEvent.setBuildOrUpgradeStructureResponseProto(responseBuilder.build());
				getEventWriter().handleEvent(resEvent);

			} catch (Exception e2) {
				log.error("exception in BuildOrUpgradeStructureController processRequestEvent", e2);
			}
		}
	}

	private boolean isValidRequest(Builder responseBuilder, MinimumUserProto sender,
			User inDb, UserStructure us, List<Structure> sList, Date clientDate) throws ConnectionException {
		if (null == inDb || null == us) {
			log.error("unexpected error: no user exists. sender=" + sender +
					"\t inDb=" + inDb + "\t us=" + us);
			return false;
		}

		UUID id = us.getId();
		UUID structureId = us.getStructureId();
		Structure s = getStructureRetrieveUtils().getStructureForId(id);

		if (null == s) {
			log.error("unexpected error: no structure with id exists. id=" + structureId);
			responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_NO_STRUCTURE_EXISTS);
			return false;
		}

		//check if user meets level requirement of structure
		if(inDb.getLevel() < s.getUserLvlRequired()) {
			log.error("user is not high enough level to build/upgrade. user level=" + inDb.getLevel() + 
					", required level: " + s.getUserLvlRequired());
			responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_NOT_AT_REQUIRED_LEVEL);
			return false;
		}
			
		//check if user's structure has a further upgrade
		if(structureRetrieveUtils.getUpgradedStructure(s) == null) {
			log.error("no upgrade of user's structure with id: " + id + "exists");
			responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_STRUCTURE_AT_MAX_LEVEL);
			return false;
		}
		
		if(!buildIsCompleteBeforeAttemptingUpgrade(s, us, clientDate)) {
			log.error("user trying to upgrade before building is complete");
			responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_CANT_UPGRADE_WHILE_BUILDING);
			return false;
		}
		
		if(us.getStartUpgradeTime().getTime() < us.getLastCollectTime().getTime()) {
			log.error("the upgrade time " + us.getStartUpgradeTime() + " is before the last time the building was retrieved:"
			          + us.getLastCollectTime());
			responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_OTHER);
			return false;
		}
		
		if(s.getBuildCostResourceType() == ResourceCostType.GOLD_VALUE) {
			if(inDb.getGold() < s.getBuildCost()) {
				log.error("user doesn't have enough gold to build new building");
				responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_INSUFFICIENT_RESOURCES);
				return false;
			}
		} else if(s.getBuildCostResourceType() == ResourceCostType.TONIC_VALUE) {
			if(inDb.getTonic() < s.getBuildCost()) {
				log.error("user doesn't have enough tonic to build new building");
				responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_INSUFFICIENT_RESOURCES);
				return false;
			}
		} else {
			log.error("structure doesn't cost either gold or tonic...strange...Hi Ashwin");
			responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_OTHER);
			return false;
		}
		
		int count=0;
		List<UserStructure> userStructs = getUserStructureRetrieveUtils().getAllUserStructuresForUser(inDb.getId());
		for(UserStructure us2: userStructs) {
			if(us2.isConstructing())
				count++;
		}
		
		if(count >= 2) {
			log.error("user already has max construction occuring");
			responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_MAXED_CONSTRUCTION);
			return false;
		}
		
		int userLevel = inDb.getLevel();
		int numAllowed = 0;
		//check if there's a restriction on the number of a certain structure you can have
		Collection<WideRowValue<Integer, UUID, Integer>> savedValues =
				getRestrictionOnNumberOfUserStructure().getEntireRow(userLevel);
		if(!savedValues.iterator().hasNext()) {
			log.error("restriction on user structure table is janky");
			responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_OTHER);
			return false;
		}
		else {
			while(savedValues.iterator().hasNext()) {
				WideRowValue<Integer, UUID, Integer> wideRow = savedValues.iterator().next();
				if(wideRow.getColumn()==s.getId()) {
					numAllowed = wideRow.getValue();
				}
			}
		}
		//count how many of this specific building the user is trying to
		//build/upgrade he already has
		int count2 = 0;
		for(UserStructure us3: userStructs) {
			if(us3.getId() == s.getId()) {
				count2++;
			}
		}
		
		if(count2 >= numAllowed) {
			log.error("user has greater than or equal to max allowed of this specific structure. Also fuck Ashwin -Byron");
			responseBuilder.setStatus(BuildOrUpgradeStructureStatus.FAIL_RESTRICTION_ON_NUMBER_OF_STRUCTURES);
			return false;
		}
		
		sList.add(s);
		responseBuilder.setStatus(BuildOrUpgradeStructureStatus.SUCCESS);
		return true;
	}

	private boolean writeChangesToDb(User inDb, UserStructure us,
			Structure s, Date clientDate) {
		try {
			if(s.getBuildCostResourceType() == ResourceCostType.GOLD_VALUE) {
				inDb.setGold(inDb.getGold()-s.getBuildCost());
			}
			else {
				inDb.setTonic(inDb.getTonic()-s.getBuildCost());
			}
			//update user
			getUserEntityManager().get().put(inDb);
			Date rightNow = new Date();

			//and update his user structure rows
			UUID newId = UUID.randomUUID();
			if(s.getLvl() == 1) {
				String cqlquery = "INSERT INTO user_structure (id, user_id, structure_id, lvl, purchase_time, is_constructing, level_of_user_when_upgrading) " +
						"VALUES ( " + newId + "," + inDb.getId() + "," + s.getId() + "," + 1 + "," + rightNow + "," + true + "," + inDb.getLevel() + ");"; 
				getUserStructureEntityManager().get().find(cqlquery);
			}
			else if(s.getLvl() > 1) {
				String cqlquery = "UPDATE user_structure USING CONSISTENCY QUORUM SET 'lvl' = 'lvl' + 1, " +
						"'start_upgrade_time' = 'rightNow', 'is_constructing' = 'true', 'level_of_user_when_upgrading' = 'inDb.getLvl()'";
				getUserStructureEntityManager().get().find(cqlquery);
			}
			return true;

		} catch (Exception e) {
			log.error("unexpected error: problem with saving to db.", e);
		}
		return false;
	}
		

	private boolean buildIsCompleteBeforeAttemptingUpgrade(Structure s, UserStructure us, Date clientDate) {
		int buildTime = s.getBuildTimeSeconds()*1000;
		long purchaseTime = us.getPurchaseTime().getTime();
		if(buildTime + purchaseTime < clientDate.getTime())
			return true;
		else return false;
	}
	
	
	public UserStructureRetrieveUtils getUserStructureRetrieveUtils() {
		return userStructureRetrieveUtils;
	}

	public void setUserStructureRetrieveUtils(
			UserStructureRetrieveUtils userStructureRetrieveUtils) {
		this.userStructureRetrieveUtils = userStructureRetrieveUtils;
	}
	
	public StructureRetrieveUtils getStructureRetrieveUtils() {
		return structureRetrieveUtils;
	}

	public void setStructureRetrieveUtils(
			StructureRetrieveUtils structureRetrieveUtils) {
		this.structureRetrieveUtils = structureRetrieveUtils;
	}

	public UserStructureEntityManager getUserStructureEntityManager() {
		return userStructureEntityManager;
	}

	public void setUserStructureEntityManager(
			UserStructureEntityManager userStructureEntityManager) {
		this.userStructureEntityManager = userStructureEntityManager;
	}

	public UserEntityManager getUserEntityManager() {
		return userEntityManager;
	}

	public void setUserEntityManager(UserEntityManager userEntityManager) {
		this.userEntityManager = userEntityManager;
	}
	
	public RestrictionOnNumberOfUserStructure getRestrictionOnNumberOfUserStructure() {
		return restrictionOnNumberOfUserStructure;
	}

	public void setRestrictionOnNumberOfUserStructure(
			RestrictionOnNumberOfUserStructure restrictionOnNumberOfUserStructure) {
		this.restrictionOnNumberOfUserStructure = restrictionOnNumberOfUserStructure;
	}
	
	
	
	
	
	
	
	
	
	
	

}