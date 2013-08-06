package com.lvl6.aoc2.services.userequiprepair;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.lvl6.aoc2.entitymanager.UserEquipRepairEntityManager;
import com.lvl6.aoc2.po.UserEquip;
import com.lvl6.aoc2.po.UserEquipRepair;


public class UserEquipRepairServiceImpl implements UserEquipRepairService {
	
	@Autowired
	protected UserEquipRepairEntityManager userEquipRepairEntityManager;
	
	@Override
	public Map<UUID, UserEquipRepair> getEquipsBeingRepaired(String userIdString) {
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
	
	//multiplier: 1 or -1, ueList or uerList is defined other is null
	@Override
	public Map<Integer, Integer> calculateRepairCost(List<UserEquip> ueList,
			List<UserEquipRepair> uerList, int multiplier) {
		//TODO: IMPLEMENT THIS
		return new HashMap<Integer, Integer>();
	}
	
	@Override
	public void deleteUserEquipRepairs(Collection<UUID> ids) {
		getUserEquipmentRepairEntityManager().get().delete(ids);
	}
	
	@Override
	public void saveUserEquipRepairs(Collection<UserEquipRepair> newStuff) {
		getUserEquipmentRepairEntityManager().get().put(newStuff);
	}
	
	
	
	
	
	
	@Override
	public UserEquipRepairEntityManager getUserEquipmentRepairEntityManager() {
		return userEquipRepairEntityManager;
	}
	
	@Override
	public void setUserEquipmentRepairEntityManager(
			UserEquipRepairEntityManager userEquipRepairEntityManager) {
		this.userEquipRepairEntityManager = userEquipRepairEntityManager;
	}
	
}