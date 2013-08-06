package com.lvl6.aoc2.services.userequip;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

import com.lvl6.aoc2.entitymanager.UserEquipEntityManager;
import com.lvl6.aoc2.po.UserEquip;

public interface UserEquipService {
	
	public abstract Map<UUID, UserEquip> getUserEquipsByUserEquipIds (Collection<UUID> ids);
	
	public abstract void saveEquips(Collection<UserEquip> newEquips);
	
	
	public abstract UserEquipEntityManager getUserEquipEntityManager();
	
	public abstract void setUserEquipEntityManager(UserEquipEntityManager userEquipEntityManager);
	
	
}