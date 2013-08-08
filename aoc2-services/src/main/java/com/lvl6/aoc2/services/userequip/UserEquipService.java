package com.lvl6.aoc2.services.userequip;

import java.util.List;

import com.lvl6.aoc2.entitymanager.UserEquipEntityManager;
import com.lvl6.aoc2.entitymanager.staticdata.UserEquipRetrieveUtils;
import com.lvl6.aoc2.po.UserEquip;

public interface UserEquipService {
	
	
	
	
	public abstract UserEquipEntityManager getUserEquipEntityManager();
	
	public abstract void setUserEquipEntityManager(UserEquipEntityManager UserEquipEntityManager);
	
	public UserEquipRetrieveUtils getUserEquipRetrieveUtils();

	public void setUserEquipRetrieveUtils(UserEquipRetrieveUtils UserEquipRetrieveUtils);
	
	public List<UserEquip> getEquippedUserEquips(List<UserEquip> ueList, List<UserEquip> equippedEquips);
	
	
}