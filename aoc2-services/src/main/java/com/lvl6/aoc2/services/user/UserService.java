package com.lvl6.aoc2.services.user;

import java.util.Map;

import com.lvl6.aoc2.entitymanager.UserEntityManager;
import com.lvl6.aoc2.po.User;

public interface UserService {
	
	public abstract User retrieveUser(String gameCenterId, String userId);
	
	public abstract void updateUserResources(User u, Map<Integer, Integer> resourceTypeToChanges);
	
	public abstract void updateUserGold(User u, int goldChange);
	
	public abstract void updateUserTonic(User u, int tonicChange);
	
	public abstract int calculateGemCostForMissingResources(User u, int missingResources, int missingResourcesType);
	
	public abstract int calculateGemCostForPercentageOfResource(User u, double percentage, int maxStorage);
	
	public abstract int calculateGemCostForSpeedUp(int minutes);
		
	public abstract UserEntityManager getUserEntityManager();

	public abstract void setUserEntityManager(UserEntityManager userEntityManager);
}