package com.lvl6.aoc2.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvl6.aoc2.controller.utils.TimeUtils;
import com.lvl6.aoc2.entitymanager.UserEntityManager;
import com.lvl6.aoc2.entitymanager.UserEquipRepairEntityManager;
import com.lvl6.aoc2.entitymanager.staticdata.EquipmentRetrieveUtils;
import com.lvl6.aoc2.eventprotos.RepairEquipEventProto.RepairEquipRequestProto;
import com.lvl6.aoc2.eventprotos.RepairEquipEventProto.RepairEquipResponseProto;
import com.lvl6.aoc2.eventprotos.RepairEquipEventProto.RepairEquipResponseProto.Builder;
import com.lvl6.aoc2.eventprotos.RepairEquipEventProto.RepairEquipResponseProto.RepairEquipStatus;
import com.lvl6.aoc2.events.RequestEvent;
import com.lvl6.aoc2.events.request.RepairEquipRequestEvent;
import com.lvl6.aoc2.events.response.RepairEquipResponseEvent;
import com.lvl6.aoc2.noneventprotos.AocTwoEventProtocolProto.AocTwoEventProtocolRequest;
import com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto;
import com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto;
import com.lvl6.aoc2.po.UserEquipRepair;


@Component
public class RepairEquipController extends EventController {

	private static Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

	@Autowired
	protected EquipmentRetrieveUtils equipmentRetrieveUtils; 

	@Autowired
	protected UserEquipRepairEntityManager userEquipmentRepairEntityManager;

	@Autowired
	protected UserEntityManager userEntityManager;
	
	@Autowired
	protected TimeUtils timeUtils;

	@Override
	public RequestEvent createRequestEvent() {
		return new RepairEquipRequestEvent();
	}

	@Override
	public int getEventType() {
		return AocTwoEventProtocolRequest.C_REPAIR_EQUIP_EVENT_VALUE;
	}

	@Override
	protected void processRequestEvent(RequestEvent event) throws Exception {
		//stuff client sent
		RepairEquipRequestProto reqProto = 
				((RepairEquipRequestEvent) event).getRepairEquipRequestProto();

		//get the values client sent
		MinimumUserProto sender = reqProto.getMup();
		List<UserEquipRepairProto> uerpDelete = reqProto.getUerpDeleteList();
		List<UserEquipRepairProto> uerpUpdate = reqProto.getUerpUpdateList();
		List<UserEquipRepairProto> uerpNew = reqProto.getUerpNewList();
		Date clientDate = new Date(reqProto.getClientTimeMillis());

		//uuid's are not strings, need to convert from string to uuid, vice versa
		String userIdString = sender.getUserID();
		
		
		//response to send back to client
		Builder responseBuilder = RepairEquipResponseProto.newBuilder();
		responseBuilder.setStatus(RepairEquipStatus.FAIL_OTHER);
		RepairEquipResponseEvent resEvent =
				new RepairEquipResponseEvent(userIdString);
		resEvent.setTag(event.getTag());

		try {
			//get whatever we need from the database
			//User inDb = getUserEntityManager().get().get(userId);
			Map<UUID, UserEquipRepair> inDbMap = getEquipsBeingRepaired(userIdString);
					
			//validate request
			boolean validRequest = isValidRequest(responseBuilder, sender,
					uerpDelete, uerpUpdate, uerpNew, inDbMap, clientDate);

			boolean successful = false;
			if (validRequest) {
				successful = writeChangesToDb(uerpDelete, uerpUpdate,
						uerpNew, inDbMap);
			}

			if (successful) {
				responseBuilder.setStatus(RepairEquipStatus.SUCCESS);
			}

			//write to client
			resEvent.setRepairEquipResponseProto(responseBuilder.build());
			log.info("Writing event: " + resEvent);
			getEventWriter().handleEvent(resEvent);

		} catch (Exception e) {
			log.error("exception in RepairEquipController processRequestEvent", e);

			try {
				//try to tell client that something failed
				responseBuilder.setStatus(RepairEquipStatus.FAIL_OTHER);
				resEvent.setRepairEquipResponseProto(responseBuilder.build());
				getEventWriter().handleEvent(resEvent);

			} catch (Exception e2) {
				log.error("exception in RepairEquipController processRequestEvent", e2);
			}
		}
	}
	
	private Map<UUID, UserEquipRepair> getEquipsBeingRepaired(String userIdString) {
		Map<UUID, UserEquipRepair> returnVal = new HashMap<UUID, UserEquipRepair>();
		
		//all the equips that are in repair
		String cqlQuery = "select * " +
						  "from user_equip_repair " +
						  "where user_id = " + userIdString;
		List<UserEquipRepair> inDbMap = 
				getUserEquipmentRepairEntityManager().get().find(cqlQuery);
		
		for (UserEquipRepair uer : inDbMap) {
			UUID id = uer.getId();
			
			returnVal.put(id, uer);
		}
		return returnVal;
	}

	private boolean isValidRequest(Builder responseBuilder, MinimumUserProto sender,
			List<UserEquipRepairProto> uerpDelete, List<UserEquipRepairProto> uerpUpdate,
			List<UserEquipRepairProto> uerpNew, Map<UUID, UserEquipRepair> inDbMap,
			Date clientDate) throws Exception {
		boolean inDbEmpty = (null == inDbMap || inDbMap.isEmpty());
		boolean uerpDeleteNonEmpty = (null != uerpDelete && !uerpDelete.isEmpty());
		boolean uerpUpdateNonEmpty = null != uerpUpdate && !uerpUpdate.isEmpty(); 
		
		//mismatch between what's recorded on the server and what client
		//thinks is recorded
		if ((uerpDeleteNonEmpty || uerpUpdateNonEmpty) && inDbEmpty) {
			log.error("unexpected error: either server did not save equips-to-" +
					"be-repaired, or client is sending incorrectly.");
			return false;
		}
		
		Set<UUID> inDbKeys = inDbMap.keySet();
		
		//check if what client deletes/updates are in the db.
		Set<UUID> uerDeleteIds = getUerIds(uerpDelete);
		if (!inDbKeys.containsAll(uerDeleteIds)) {
			log.error("unexpected error: either server did not modify" +
					"equips-to-be-repaired, or client is sending incorrectly. " +
					"uerDeleteIds=" + uerDeleteIds);
			return false;
		}
		Set<UUID> uerUpdateIds = getUerIds(uerpUpdate);
		if (!inDbKeys.containsAll(uerUpdateIds)) {
			log.error("unexpected error: either server did not modify" +
					"equips-to-be-repaired, or client is sending incorrectly. " +
					"uerUpdateIds=" + uerUpdateIds);
			return false;
		}
		
		//CHECK IF TIMES ARE IN SYNC
		if (!getTimeUtils().isSynchronizedWithServerTime(clientDate)) {
		    log.error("user error: client time diverges from server time. clientTime="
			    + clientDate + ", approximateServerTime=" + new Date());
		    responseBuilder.setStatus(RepairEquipStatus.FAIL_UNSYNCHRONIZED_TIMES);
		    return false;
		}
		
		return true;
	}
	
	
	private Set<UUID> getUerIds(List<UserEquipRepairProto> aList) throws Exception {
		Set<UUID> ids = new HashSet<UUID>();
		for(UserEquipRepairProto uerp : aList) {
			String uerIdString = uerp.getId();
			UUID uerId = UUID.fromString(uerIdString);
			if(ids.contains(uerIdString)) {
				String msg = "client error: duplicate id=" + uerIdString; 
				log.error(msg);
				throw new Exception(msg);
			}
			ids.add(uerId);
		}
		return ids;
	}

	private boolean writeChangesToDb(List<UserEquipRepairProto> uerpDelete,
			List<UserEquipRepairProto> uerpUpdate, List<UserEquipRepairProto> uerpNew,
			Map<UUID, UserEquipRepair> inDbMap) {
		try {
			deleteExisting(uerpDelete, inDbMap);
			
			updateExisting(uerpUpdate, inDbMap);
			
			addNew(uerpNew);
			return true;

		} catch (Exception e) {
			log.error("unexpected error: problem with saving to db.", e);
		}
		return false;
	}

	//GET THE EQUIPS TO DELETE AND DELETE THEM
	private void deleteExisting(List<UserEquipRepairProto> uerp,
			Map<UUID, UserEquipRepair> inDbMap) throws Exception {
		
		Set<UUID> idsToBeDeleted = getUerIds(uerp);
		getUserEquipmentRepairEntityManager().get().delete(idsToBeDeleted);
		
		for(UUID id : idsToBeDeleted) {
			inDbMap.remove(id);
		}
	}
	
	//UPDATE THE ONES THAT CLIENT WANTS UPDATED
	private void updateExisting(List<UserEquipRepairProto> uerpList, 
			Map<UUID, UserEquipRepair> inDbMap) throws Exception {
		List<UserEquipRepair> updated = new ArrayList<UserEquipRepair>();
		
		//go though inDb objects and replace its values with the
		//proto values (only expectedStartMillis should change)
		for (UserEquipRepairProto uer : uerpList) {
			long millis = uer.getExpectedStartMillis();
			Date newDate = new Date(millis);
			
			String idString = uer.getId();
			UUID id = UUID.fromString(idString);
			
			UserEquipRepair inDb = inDbMap.get(id);
			inDb.setExpectedStart(newDate);
			
			updated.add(inDb);
		}
		
		getUserEquipmentRepairEntityManager().get().put(updated);
	}
	
	private void addNew(List<UserEquipRepairProto> uerpList) {
		List<UserEquipRepair> newStuff = new ArrayList<UserEquipRepair>();
		
		for(UserEquipRepairProto uerp : uerpList) {
			UserEquipRepair uer = new UserEquipRepair();
			UUID userId = UUID.fromString(uerp.getUserID());
			uer.setUserId(userId);
			
			UUID equipId = UUID.fromString(uerp.getEquipID());
			uer.setEquipId(equipId);
			
			uer.setEquipLevel(uerp.getEquipLevel());
			uer.setDurability(uerp.getDurability());
			Date expectedStart = new Date(uerp.getExpectedStartMillis());
			uer.setExpectedStart(expectedStart);
			Date enteredQueue = new Date(uerp.getQueuedTimeMillis());
			uer.setEnteredQueue(enteredQueue);
			
			newStuff.add(uer);
		}
		
		getUserEquipmentRepairEntityManager().get().put(newStuff);
	}
	

	
	
	
	public EquipmentRetrieveUtils getEquipmentRetrieveUtils() {
		return equipmentRetrieveUtils;
	}

	public void setEquipmentRetrieveUtils(
			EquipmentRetrieveUtils equipmentRetrieveUtils) {
		this.equipmentRetrieveUtils = equipmentRetrieveUtils;
	}

	public UserEquipRepairEntityManager getUserEquipmentRepairEntityManager() {
		return userEquipmentRepairEntityManager;
	}

	public void setUserEquipmentRepairEntityManager(
			UserEquipRepairEntityManager userEquipmentRepairEntityManager) {
		this.userEquipmentRepairEntityManager = userEquipmentRepairEntityManager;
	}

	public UserEntityManager getUserEntityManager() {
		return userEntityManager;
	}

	public void setUserEntityManager(UserEntityManager userEntityManager) {
		this.userEntityManager = userEntityManager;
	}

	public TimeUtils getTimeUtils() {
		return timeUtils;
	}

	public void setTimeUtils(TimeUtils timeUtils) {
		this.timeUtils = timeUtils;
	}


}