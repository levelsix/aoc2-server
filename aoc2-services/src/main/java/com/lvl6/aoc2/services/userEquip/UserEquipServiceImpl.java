package com.lvl6.aoc2.services.userEquip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvl6.aoc2.entitymanager.UserEquipEntityManager;
import com.lvl6.aoc2.entitymanager.staticdata.UserEquipRetrieveUtils;
import com.lvl6.aoc2.po.UserEquip;

@Component
public class UserEquipServiceImpl implements UserEquipService {
	
	@Autowired
	protected UserEquipEntityManager UserEquipEntityManager;
	
	@Autowired
	protected UserEquipRetrieveUtils UserEquipRetrieveUtils;

	public List<UserEquip> getEquippedUserEquips(List<UserEquip> ueList, List<UserEquip> equippedEquips) {
		for(UserEquip ue : ueList) {
			if(ue.isEquipped() == true)
				equippedEquips.add(ue);
		}
		return equippedEquips;
	}
	
	
	@Override
	public UserEquipEntityManager getUserEquipEntityManager() {
		return UserEquipEntityManager;
	}
	
	@Override
	public void setUserEquipEntityManager(
			UserEquipEntityManager UserEquipEntityManager) {
		this.UserEquipEntityManager = UserEquipEntityManager;
	}

	@Override
	public UserEquipRetrieveUtils getUserEquipRetrieveUtils() {
		return UserEquipRetrieveUtils;
	}

	@Override
	public void setUserEquipRetrieveUtils(
			UserEquipRetrieveUtils UserEquipRetrieveUtils) {
		this.UserEquipRetrieveUtils = UserEquipRetrieveUtils;
	}
	
	
}