package com.lvl6.aoc2.services.userequiprepair;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.lvl6.aoc2.entitymanager.UserEquipRepairEntityManager;
import com.lvl6.aoc2.po.UserEquip;
import com.lvl6.aoc2.po.UserEquipRepair;

public interface UserEquipRepairService {
	
	public abstract Map<UUID, UserEquipRepair> getEquipsBeingRepaired(String userIdString);
	
	//returns AocTwoTableConstants.resourceType -> amount
	public abstract Map<Integer, Integer> calculateRepairCost(List<UserEquip> ueList,
			List<UserEquipRepair> uerList, int multiplier);
	
	public abstract void deleteUserEquipRepairs(Collection<UUID> ids);
	
	public abstract void saveUserEquipRepairs(Collection<UserEquipRepair> newStuff);
	
	
	
	
	
	
	
	public abstract UserEquipRepairEntityManager getUserEquipmentRepairEntityManager();
	
	public abstract void setUserEquipmentRepairEntityManager(UserEquipRepairEntityManager userEquipRepairEntityManager);

}