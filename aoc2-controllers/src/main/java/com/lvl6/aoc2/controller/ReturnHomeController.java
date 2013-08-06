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
import com.lvl6.aoc2.entitymanager.UserDungeonStatusEntityManager;
import com.lvl6.aoc2.entitymanager.UserDungeonStatusHistoryEntityManager;
import com.lvl6.aoc2.entitymanager.UserEntityManager;
import com.lvl6.aoc2.entitymanager.UserEquipEntityManager;
import com.lvl6.aoc2.entitymanager.staticdata.StructureRetrieveUtils;
import com.lvl6.aoc2.entitymanager.staticdata.UserEquipRetrieveUtils;
import com.lvl6.aoc2.entitymanager.staticdata.UserSpellRetrieveUtils;
import com.lvl6.aoc2.entitymanager.staticdata.UserStructureRetrieveUtils;
import com.lvl6.aoc2.eventprotos.ReturnHomeEventProto.ReturnHomeRequestProto;
import com.lvl6.aoc2.eventprotos.ReturnHomeEventProto.ReturnHomeResponseProto;
import com.lvl6.aoc2.eventprotos.ReturnHomeEventProto.ReturnHomeResponseProto.ReturnHomeStatus;
import com.lvl6.aoc2.eventprotos.ReturnHomeEventProto.ReturnHomeResponseProto.Builder;
import com.lvl6.aoc2.events.RequestEvent;
import com.lvl6.aoc2.events.request.ReturnHomeRequestEvent;
import com.lvl6.aoc2.events.response.ReturnHomeResponseEvent;
import com.lvl6.aoc2.noneventprotos.AocTwoEventProtocolProto.AocTwoEventProtocolRequest;
import com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto;
import com.lvl6.aoc2.po.User;
import com.lvl6.aoc2.po.UserEquip;
import com.lvl6.aoc2.services.userEquip.UserEquipServiceImpl;
import com.netflix.astyanax.connectionpool.exceptions.ConnectionException;


@Component
public class ReturnHomeController extends EventController {

	private static Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());
	

	@Autowired
	protected UserEquipEntityManager userEquipEntityManager;

	@Autowired
	protected UserEntityManager userEntityManager;
	
	@Autowired
	protected UserDungeonStatusEntityManager userDungeonStatusEntityManager;
	
	@Autowired
	protected UserDungeonStatusHistoryEntityManager userDungeonStatusHistoryEntityManager;
	
	@Autowired
	protected UserEquipRetrieveUtils userEquipRetrieveUtils; 

	@Autowired
	protected UserEquipServiceImpl userEquipServiceImpl; 
	
	@Override
	public RequestEvent createRequestEvent() {
		return new ReturnHomeRequestEvent();
	}

	@Override
	public int getEventType() {
		return AocTwoEventProtocolRequest.C_RETURN_HOME_EVENT_VALUE;
	}

	@Override
	protected void processRequestEvent(RequestEvent event) throws Exception {
		//stuff client sent
		ReturnHomeRequestProto reqProto = 
				((ReturnHomeRequestEvent) event).getReturnHomeRequestProto();

		//get the values client sent
		MinimumUserProto sender = reqProto.getMup();
		int userHp = reqProto.getUserHp();
		int userMana = reqProto.getUserMana();
		int actionsPerformed = reqProto.getActionsPerformed();

		//uuid's are not strings, need to convert from string to uuid, vice versa
		String userIdString = sender.getUserID();
		UUID userId = UUID.fromString(userIdString);
		Date clientDate = new Date();

		//response to send back to client
		Builder responseBuilder = ReturnHomeResponseProto.newBuilder();
		responseBuilder.setStatus(ReturnHomeStatus.FAIL_OTHER);
		ReturnHomeResponseEvent resEvent =
				new ReturnHomeResponseEvent(userIdString);
		resEvent.setTag(event.getTag());

		try {
			//get whatever we need from the database
			User inDb = getUserEntityManager().get().get(userId);
			List<UserEquip> ueList = getUserEquipRetrieveUtils().getAllUserEquipsForUser(userId);
			List<UserEquip> equippedEquips = new ArrayList<UserEquip>();
			//List<Structure> sList = new ArrayList<Structure>(); 
			getUserEquipServiceImpl().getEquippedUserEquips(ueList, equippedEquips);
			
			boolean successful = false;
			successful = writeChangesToDb(inDb, userHp, userMana, actionsPerformed, equippedEquips, clientDate);
			
			if (successful) {
				responseBuilder.setStatus(ReturnHomeStatus.SUCCESS);
			}

			//write to client
			resEvent.setReturnHomeResponseProto(responseBuilder.build());
			log.info("Writing event: " + resEvent);
			getEventWriter().handleEvent(resEvent);

		} catch (Exception e) {
			log.error("exception in ReturnHomeController processRequestEvent", e);

			try {
				//try to tell client that something failed
				responseBuilder.setStatus(ReturnHomeStatus.FAIL_OTHER);
				resEvent.setReturnHomeResponseProto(responseBuilder.build());
				getEventWriter().handleEvent(resEvent);

			} catch (Exception e2) {
				log.error("exception in ReturnHomeController processRequestEvent", e2);
			}
		}
	}

	
	private boolean writeChangesToDb(User inDb, int userHp, int userMana, int actionsPerformed, List<UserEquip> equippedEquips, Date clientDate) {

			//update user
			inDb.setHp(userHp);
			inDb.setMana(userMana);
			getUserEntityManager().get().put(inDb);

			//update his user equip rows
			UUID newId = UUID.randomUUID();
			if(s.getLvl() == 1) {
//				String cqlquery = "INSERT INTO user_structure (id, user_id, structure_id, lvl, purchase_time, is_constructing, level_of_user_when_upgrading) " +
//						"VALUES ( " + newId + "," + inDb.getId() + "," + s.getId() + "," + 1 + "," + rightNow + "," + true + "," + inDb.getLevel() + ");"; 
				us.setId(UUID.randomUUID());
				us.setUserId(inDb.getId());
				us.setStructureId(s.getStructureId());
				us.setLvl(1);
				us.setPurchaseTime(clientDate);
				us.setConstructing(true);
				us.setLevelOfUserWhenUpgrading(inDb.getLevel());
				getUserStructureEntityManager().get().put(us);
			}
			else if(s.getLvl() > 1) {
//				String cqlquery = "UPDATE user_structure USING CONSISTENCY QUORUM SET 'lvl' = 'lvl' + 1, " +
//						"'start_upgrade_time' = 'rightNow', 'is_constructing' = 'true', 'level_of_user_when_upgrading' = 'inDb.getLvl()'";
				us.setLvl(s.getLvl());
				us.setStartUpgradeTime(clientDate);
				us.setConstructing(true);
				us.setLevelOfUserWhenUpgrading(inDb.getLevel());
				getUserStructureEntityManager().get().put(us);
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
	
	


	public UserEquipEntityManager getUserEquipEntityManager() {
		return userEquipEntityManager;
	}

	public void setUserEquipEntityManager(
			UserEquipEntityManager userEquipEntityManager) {
		this.userEquipEntityManager = userEquipEntityManager;
	}

	public UserDungeonStatusEntityManager getUserDungeonStatusEntityManager() {
		return userDungeonStatusEntityManager;
	}

	public void setUserDungeonStatusEntityManager(
			UserDungeonStatusEntityManager userDungeonStatusEntityManager) {
		this.userDungeonStatusEntityManager = userDungeonStatusEntityManager;
	}

	public UserDungeonStatusHistoryEntityManager getUserDungeonStatusHistoryEntityManager() {
		return userDungeonStatusHistoryEntityManager;
	}

	public void setUserDungeonStatusHistoryEntityManager(
			UserDungeonStatusHistoryEntityManager userDungeonStatusHistoryEntityManager) {
		this.userDungeonStatusHistoryEntityManager = userDungeonStatusHistoryEntityManager;
	}

	public UserEntityManager getUserEntityManager() {
		return userEntityManager;
	}

	public void setUserEntityManager(UserEntityManager userEntityManager) {
		this.userEntityManager = userEntityManager;
	}
	
	public UserEquipRetrieveUtils getUserEquipRetrieveUtils() {
		return userEquipRetrieveUtils;
	}

	public void setUserEquipRetrieveUtils(
			UserEquipRetrieveUtils userEquipRetrieveUtils) {
		this.userEquipRetrieveUtils = userEquipRetrieveUtils;
	}
	
	public UserEquipServiceImpl getUserEquipServiceImpl() {
		return userEquipServiceImpl;
	}

	public void setUserEquipServiceImpl(UserEquipServiceImpl userEquipServiceImpl) {
		this.userEquipServiceImpl = userEquipServiceImpl;
	}
	
	
	
	
	
	
	
	
	
	

}