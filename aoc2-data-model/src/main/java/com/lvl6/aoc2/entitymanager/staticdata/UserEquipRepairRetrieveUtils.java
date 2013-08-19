package com.lvl6.aoc2.entitymanager.staticdata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvl6.aoc2.entitymanager.UserEquipRepairEntityManager;
import com.lvl6.aoc2.entitymanager.EquipmentEntityManager;
import com.lvl6.aoc2.po.Equipment;
import com.lvl6.aoc2.po.UserEquipRepair;
import com.lvl6.aoc2.po.Spell;
import com.lvl6.aoc2.po.UserEquipRepair;

@Component public class UserEquipRepairRetrieveUtils {

	private  Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

	private  Map<UUID, UserEquipRepair> idsToUserEquipRepairs;
	
	private Map<UUID, UserEquipRepair> userIdsToUserEquipRepairs;
	//private  final String TABLE_NAME = DBConstants.UserEquipRepair;

	@Autowired
	protected UserEquipRepairEntityManager UserEquipRepairEntityManager;
	
	@Autowired
	protected EquipmentEntityManager EquipmentEntityManager;
	

	public  UserEquipRepair getUserEquipRepairForId(UUID id) {
		log.debug("retrieve UserEquipRepair data for id " + id);
		if (idsToUserEquipRepairs == null) {
			setStaticIdsToUserEquipRepairs();      
		}
		return idsToUserEquipRepairs.get(id);
	}

	public  Map<UUID, UserEquipRepair> getUserEquipRepairsForIds(List<UUID> ids) {
		log.debug("retrieve UserEquipRepairs data for ids " + ids);
		if (idsToUserEquipRepairs == null) {
			setStaticIdsToUserEquipRepairs();      
		}
		Map<UUID, UserEquipRepair> toreturn = new HashMap<UUID, UserEquipRepair>();
		for (UUID id : ids) {
			toreturn.put(id,  idsToUserEquipRepairs.get(id));
		}
		return toreturn;
	}

	private  void setStaticIdsToUserEquipRepairs() {
		log.debug("setting  map of UserEquipRepairIds to UserEquipRepairs");

		String cqlquery = "select * from user_equip_repair;"; 
		List <UserEquipRepair> list = getUserEquipRepairEntityManager().get().find(cqlquery);
		idsToUserEquipRepairs = new HashMap<UUID, UserEquipRepair>();
		for(UserEquipRepair us : list) {
			UUID id= us.getId();
			idsToUserEquipRepairs.put(id, us);
		}
					
	}

	public  List<UserEquipRepair> getAllUserEquipRepairsForUser(UUID userId) {
		String cqlquery = "select * from user_equip_repair where user_id=" + userId + ";"; 
		List <UserEquipRepair> list = getUserEquipRepairEntityManager().get().find(cqlquery);
		return list;
	}
	
	public Equipment getEquipmentCorrespondingToUserEquipRepair(UserEquipRepair ue) {
		UUID equipId = ue.getEquipId();
		String cqlquery = "select * from user_equip_repair where equipId= " + equipId + ";";
		List<Equipment> e = getEquipmentEntityManager().get().find(cqlquery);
		return e.get(0);
	}
	
	
	
	
	public  void reload() {
		setStaticIdsToUserEquipRepairs();
	}
	
	
	public UserEquipRepairEntityManager getUserEquipRepairEntityManager() {
		return UserEquipRepairEntityManager;
	}

	public void setUserEquipRepairEntityManager(
			UserEquipRepairEntityManager UserEquipRepairEntityManager) {
		this.UserEquipRepairEntityManager = UserEquipRepairEntityManager;
	}

	public EquipmentEntityManager getEquipmentEntityManager() {
		return EquipmentEntityManager;
	}

	public void setEquipmentEntityManager(
			EquipmentEntityManager equipmentEntityManager) {
		EquipmentEntityManager = equipmentEntityManager;
	}
	
}
