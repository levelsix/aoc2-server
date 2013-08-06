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
import com.lvl6.aoc2.entitymanager.SpellEntityManager;
import com.lvl6.aoc2.entitymanager.UserEntityManager;
import com.lvl6.aoc2.entitymanager.UserSpellEntityManager;
import com.lvl6.aoc2.entitymanager.staticdata.SpellRetrieveUtils;
import com.lvl6.aoc2.entitymanager.staticdata.UserSpellRetrieveUtils;
//import com.lvl6.aoc2.entitymanager.staticdata.UserSpellRetrieveUtils;
import com.lvl6.aoc2.eventprotos.TrainOrUpgradeSpellEventProto.TrainOrUpgradeSpellRequestProto;
import com.lvl6.aoc2.eventprotos.TrainOrUpgradeSpellEventProto.TrainOrUpgradeSpellResponseProto;
import com.lvl6.aoc2.eventprotos.TrainOrUpgradeSpellEventProto.TrainOrUpgradeSpellResponseProto.TrainOrUpgradeSpellStatus;
import com.lvl6.aoc2.eventprotos.TrainOrUpgradeSpellEventProto.TrainOrUpgradeSpellResponseProto.Builder;
import com.lvl6.aoc2.eventprotos.TrainOrUpgradeSpellEventProto.ResourceCostType;
import com.lvl6.aoc2.events.RequestEvent;
import com.lvl6.aoc2.events.request.TrainOrUpgradeSpellRequestEvent;
import com.lvl6.aoc2.events.response.TrainOrUpgradeSpellResponseEvent;
import com.lvl6.aoc2.noneventprotos.AocTwoEventProtocolProto.AocTwoEventProtocolRequest;
import com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto;
import com.lvl6.aoc2.po.Spell;
import com.lvl6.aoc2.po.Structure;
import com.lvl6.aoc2.po.User;
import com.lvl6.aoc2.po.UserSpell;
import com.lvl6.aoc2.po.UserStructure;
import com.netflix.astyanax.connectionpool.exceptions.ConnectionException;


@Component
public class TrainOrUpgradeSpellController extends EventController {

	private static Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

	@Autowired
	protected SpellRetrieveUtils spellRetrieveUtils; 
	
	@Autowired
	protected UserEntityManager userEntityManager; 

	@Autowired
	protected UserSpellRetrieveUtils userSpellRetrieveUtils; 
	
	@Autowired
	protected UserSpellEntityManager userSpellEntityManager;

	@Override
	public RequestEvent createRequestEvent() {
		return new TrainOrUpgradeSpellRequestEvent();
	}

	@Override
	public int getEventType() {
		return AocTwoEventProtocolRequest.C_TRAIN_OR_UPGRADE_SPELL_EVENT_VALUE;
	}

	@Override
	protected void processRequestEvent(RequestEvent event) throws Exception {
		//stuff client sent
		TrainOrUpgradeSpellRequestProto reqProto = 
				((TrainOrUpgradeSpellRequestEvent) event).getTrainOrUpgradeSpellRequestProto();

		//get the values client sent
		MinimumUserProto sender = reqProto.getMup();

		//uuid's are not strings, need to convert from string to uuid, vice versa
		String userIdString = sender.getUserID();
		UUID userId = UUID.fromString(userIdString);
		Date clientDate = new Date();
		String userSpellIdString = reqProto.getSpellId();
		UUID userSpellId = UUID.fromString(userSpellIdString);

		//response to send back to client
		Builder responseBuilder = TrainOrUpgradeSpellResponseProto.newBuilder();
		responseBuilder.setStatus(TrainOrUpgradeSpellStatus.FAIL_OTHER);
		TrainOrUpgradeSpellResponseEvent resEvent =
				new TrainOrUpgradeSpellResponseEvent(userIdString);
		resEvent.setTag(event.getTag());

		try {
			//get whatever we need from the database
			User inDb = getUserEntityManager().get().get(userId);
			UserSpell us = getUserSpellEntityManager().get().get(userSpellId);
			List<Spell> sList = new ArrayList<Spell>();

			//validate request
			boolean validRequest = isValidRequest(responseBuilder, sender, inDb,
					us, sList, clientDate);

			boolean successful = false;
			if (validRequest) {
				Spell s = sList.get(0);
				successful = writeChangesToDb(inDb, us, s, clientDate);
			}

			if (successful) {
				responseBuilder.setStatus(TrainOrUpgradeSpellStatus.SUCCESS);
			}

			//write to client
			resEvent.setTrainOrUpgradeSpellResponseProto(responseBuilder.build());
			log.info("Writing event: " + resEvent);
			getEventWriter().handleEvent(resEvent);

		} catch (Exception e) {
			log.error("exception in TrainOrUpgradeSpellController processRequestEvent", e);

			try {
				//try to tell client that something failed
				responseBuilder.setStatus(TrainOrUpgradeSpellStatus.FAIL_OTHER);
				resEvent.setTrainOrUpgradeSpellResponseProto(responseBuilder.build());
				getEventWriter().handleEvent(resEvent);

			} catch (Exception e2) {
				log.error("exception in TrainOrUpgradeSpellController processRequestEvent", e2);
			}
		}
	}

	private boolean isValidRequest(Builder responseBuilder, MinimumUserProto sender,
			User inDb, UserSpell us, List<Spell> sList, Date clientDate) throws ConnectionException {
		if (null == inDb || null == us) {
			log.error("unexpected error: no user exists. sender=" + sender +
					"\t inDb=" + inDb + "\t us=" + us);
			return false;
		}

		UUID id = us.getId();
		UUID spellId = us.getId();
		Spell s = getSpellRetrieveUtils().getSpellForId(id);

		if (null == s) {
			log.error("unexpected error: no spell with id exists. id=" + spellId);
			responseBuilder.setStatus(TrainOrUpgradeSpellStatus.FAIL_OTHER);
			return false;
		}

		//check if user meets level requirement of spell
		if(inDb.getLevel() < s.getUserLevelRequired()) {
			log.error("user is not high enough level to train/upgrade. user level=" + inDb.getLevel() + 
					", required level: " + s.getUserLevelRequired());
			responseBuilder.setStatus(TrainOrUpgradeSpellStatus.FAIL_NOT_AT_REQUIRED_LEVEL);
			return false;
		}
			
		//check if user's spell has a further upgrade
		if(spellRetrieveUtils.getUpgradedSpell(s) == null) {
			log.error("no upgrade of user's spell with id: " + id + "exists");
			responseBuilder.setStatus(TrainOrUpgradeSpellStatus.FAIL_SPELL_AT_MAX_LEVEL);
			return false;
		}
		
		if(!trainingIsCompleteBeforeAttemptingUpgrade(s, us, clientDate)) {
			log.error("user trying to upgrade before training is complete");
			responseBuilder.setStatus(TrainOrUpgradeSpellStatus.FAIL_CANT_UPGRADE_WHILE_TRAINING);
			return false;
		}
		
		if(s.getResearchCostResource() == ResourceCostType.GOLD_VALUE) {
			if(inDb.getGold() < s.getResearchCost()) {
				log.error("user doesn't have enough gold to train new spell");
				responseBuilder.setStatus(TrainOrUpgradeSpellStatus.FAIL_INSUFFICIENT_RESOURCES);
				return false;
			}
		} else if(s.getResearchCostResource() == ResourceCostType.TONIC_VALUE) {
			if(inDb.getTonic() < s.getResearchCost()) {
				log.error("user doesn't have enough tonic to train new spell");
				responseBuilder.setStatus(TrainOrUpgradeSpellStatus.FAIL_INSUFFICIENT_RESOURCES);
				return false;
			}
		} else {
			log.error("spell doesn't cost either gold or tonic...strange...Hi Ashwin/Art");
			responseBuilder.setStatus(TrainOrUpgradeSpellStatus.FAIL_OTHER);
			return false;
		}
		
		int count=0;
		List<UserSpell> userSpells = getUserSpellRetrieveUtils().getAllUserSpellsForUser(inDb.getId());
		for(UserSpell us2: userSpells) {
			if(us2.getIsTraining())
				count++;
		}
		
		if(count >= 1) {
			log.error("user already has max training occuring");
			responseBuilder.setStatus(TrainOrUpgradeSpellStatus.FAIL_MAXED_TRAINING);
			return false;
		}
		
		//check class
		if(inDb.getClassType() != s.getClassType()) {
			log.error("user is not appropriate class for spell");
			responseBuilder.setStatus(TrainOrUpgradeSpellStatus.FAIL_WRONG_CLASS_TYPE);
			return false;
		}
		
		sList.add(s);
		responseBuilder.setStatus(TrainOrUpgradeSpellStatus.SUCCESS);
		return true;
	}

	private boolean writeChangesToDb(User inDb, UserSpell us,
			Spell s, Date clientDate) {
		try {
			if(s.getResearchCost() == ResourceCostType.GOLD_VALUE) {
				inDb.setGold(inDb.getGold()-s.getResearchCost());
			}
			else {
				inDb.setTonic(inDb.getTonic()-s.getResearchCost());
			}
			//update user
			getUserEntityManager().get().put(inDb);
			Date rightNow = new Date();
			UUID newId = UUID.randomUUID();
			//and update his user spell rows
			if(s.getLevel() == 1) {
//				String cqlquery = "INSERT INTO user_spell (id, user_id, spell_id, lvl, spell_lvl, time_acquired, " +
//						"is_training, level_of_user_when_upgrading) VALUES (" + newId + "," + inDb.getId() + "," + s.getId() + "," 
//						+ 1 + "," + rightNow + "," + true + "," + inDb.getLevel() + ");"; 
				us.setId(newId);
				us.setUserId(inDb.getId());
				us.setName(s.getName());
				us.setSpellLvl(1);
				us.setTimeAcquired(clientDate);
				us.setIsTraining(true);
				us.setLevelOfUserWhenUpgrading(inDb.getLevel());
				getUserSpellEntityManager().get().put(us);
			}
			else if(s.getLevel() > 1) {
//				String cqlquery = "UPDATE user_spell USING CONSISTENCY QUORUM SET 'spell_lvl' = " + s.getLevel() + ", 'time_acquired' = " 
//						+ rightNow + ", 'is_training' = " + true + ", 'level_of_user_when_upgrading' = " + inDb.getLevel() + ";";
				us.setSpellLvl(s.getLevel());
				us.setTimeAcquired(clientDate);
				us.setIsTraining(true);
				us.setLevelOfUserWhenUpgrading(inDb.getLevel());
				getUserSpellEntityManager().get().put(us);
			}
			return true;

		} catch (Exception e) {
			log.error("unexpected error: problem with saving to db.", e);
		}
		return false;
	}
		
	
	private boolean trainingIsCompleteBeforeAttemptingUpgrade(Spell s, UserSpell us, Date clientDate) {
		int buildTime = s.getResearchTimeMillis();
		long purchaseTime = us.getTimeAcquired().getTime();
		if(buildTime + purchaseTime < clientDate.getTime())
			return true;
		else return false;
	}
	
	
	
	
	public UserSpellRetrieveUtils getUserSpellRetrieveUtils() {
		return userSpellRetrieveUtils;
	}

	public void setUserSpellRetrieveUtils(
			UserSpellRetrieveUtils userSpellRetrieveUtils) {
		this.userSpellRetrieveUtils = userSpellRetrieveUtils;
	}
	
	public SpellRetrieveUtils getSpellRetrieveUtils() {
		return spellRetrieveUtils;
	}

	public void setSpellRetrieveUtils(
			SpellRetrieveUtils spellRetrieveUtils) {
		this.spellRetrieveUtils = spellRetrieveUtils;
	}

	public UserSpellEntityManager getUserSpellEntityManager() {
		return userSpellEntityManager;
	}

	public void setUserSpellEntityManager(
			UserSpellEntityManager userSpellEntityManager) {
		this.userSpellEntityManager = userSpellEntityManager;
	}

	public UserEntityManager getUserEntityManager() {
		return userEntityManager;
	}

	public void setUserEntityManager(UserEntityManager userEntityManager) {
		this.userEntityManager = userEntityManager;
	}


	
	
	
	
	
	
	
	
	
	

}