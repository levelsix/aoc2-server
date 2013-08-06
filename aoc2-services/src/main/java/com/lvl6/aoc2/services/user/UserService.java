package com.lvl6.aoc2.services.user;

import java.util.Map;

import com.lvl6.aoc2.entitymanager.UserEntityManager;
import com.lvl6.aoc2.po.User;

public interface UserService {
	
	public abstract void updateUserResources(User u, Map<Integer, Integer> resourceTypeToChanges);
	
	public abstract void updateUserGold(User u, int goldChange);
	
	public abstract void updateUserTonic(User u, int tonicChange);
	
	
	
	
	
	public abstract UserEntityManager getUserEntityManager();

	public abstract void setUserEntityManager(UserEntityManager userEntityManager);
}