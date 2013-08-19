package com.lvl6.aoc2.services.userequiprepair;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.lvl6.aoc2.entitymanager.UserEquipRepairEntityManager;
import com.lvl6.aoc2.entitymanager.staticdata.UserEquipRepairRetrieveUtils;
import com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto;
import com.lvl6.aoc2.po.UserEquip;
import com.lvl6.aoc2.po.UserEquipRepair;


public class UserEquipRepairServiceImpl implements UserEquipRepairService {
	
	@Autowired
	protected UserEquipRepairEntityManager userEquipRepairEntityManager;
	
	@Autowired
	protected UserEquipRepairRetrieveUtils userEquipRepairRetrieveUtils;
	
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
	
	public int calculateSingleUserEquipRepairCost(UserEquip ue) {
		//TODO: implement
		return 1000000;
	}
	
	
	@Override
	public void deleteUserEquipRepairs(Collection<UUID> ids) {
		getUserEquipmentRepairEntityManager().get().delete(ids);
	}
	
	@Override
	public void saveUserEquipRepairs(Collection<UserEquipRepair> newStuff) {
		getUserEquipmentRepairEntityManager().get().put(newStuff);
	}
	
	//returns in seconds
	@Override
	public int calculateTotalTimeOfQueuedUserEquips(List<UserEquipRepairProto> queuedEquips, Date currentTime) {
		List<UserEquipRepair> queuedEquipsList = new ArrayList<>();
		for(UserEquipRepairProto queuedEquip : queuedEquips) {
			UserEquipRepair uer = new UserEquipRepair();
			uer.setDurability(queuedEquip.getDurability());
			Date d = new Date(queuedEquip.getExpectedStartMillis());
			uer.setExpectedStart(d);
			queuedEquipsList.add(uer);
		}
		
		int secondsRemaining = 0;
		for(UserEquipRepair uer2 : queuedEquipsList) {
			double durabilityTimeConstant = getUserEquipRepairRetrieveUtils().getEquipmentCorrespondingToUserEquipRepair(uer2).getDurabilityFixTimeConstant();
			double amountDamaged = 100.0-uer2.getDurability();
			int secondsToRepair = (int)(durabilityTimeConstant * amountDamaged);
			if(uer2.getExpectedStart().getTime() < currentTime.getTime()) {
				int secondsRemainingOnCurrentEquip = secondsToRepair - (int)((currentTime.getTime() - uer2.getExpectedStart().getTime())/1000);
				secondsRemaining +=  secondsRemainingOnCurrentEquip;
			}
			else secondsRemaining += secondsToRepair;
		}
		
		return secondsRemaining;
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

	public UserEquipRepairEntityManager getUserEquipRepairEntityManager() {
		return userEquipRepairEntityManager;
	}

	public void setUserEquipRepairEntityManager(
			UserEquipRepairEntityManager userEquipRepairEntityManager) {
		this.userEquipRepairEntityManager = userEquipRepairEntityManager;
	}

	public UserEquipRepairRetrieveUtils getUserEquipRepairRetrieveUtils() {
		return userEquipRepairRetrieveUtils;
	}

	public void setUserEquipRepairRetrieveUtils(
			UserEquipRepairRetrieveUtils userEquipRepairRetrieveUtils) {
		this.userEquipRepairRetrieveUtils = userEquipRepairRetrieveUtils;
	}
	
	
	
}