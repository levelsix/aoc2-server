package com.lvl6.aoc2.services.userequip;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.lvl6.aoc2.entitymanager.UserEquipEntityManager;
import com.lvl6.aoc2.po.UserEquip;

public class UserEquipServiceImpl implements UserEquipService {
	
	@Autowired
	protected UserEquipEntityManager userEquipEntityManager;

	
	@Override
	public Map<UUID, UserEquip> getUserEquipsByUserEquipIds(Collection<UUID> ids) {
		Map<UUID, UserEquip> returnVal = new HashMap<UUID, UserEquip>();
		
		List<UserEquip> ueList = userEquipEntityManager.get().get(ids);
		for (UserEquip ue : ueList) {
			UUID id = ue.getId();
			returnVal.put(id, ue);
		}
		
		return returnVal;
	}
	
	@Override
	public void saveEquips(Collection<UserEquip> newEquips) {
		getUserEquipEntityManager().get().put(newEquips);
	}
	
	
	

	
	
	@Override
	public UserEquipEntityManager getUserEquipEntityManager() {
		return userEquipEntityManager;
	}

	@Override
	public void setUserEquipEntityManager(
			UserEquipEntityManager userEquipEntityManager) {
		this.userEquipEntityManager = userEquipEntityManager;
	}
	
}