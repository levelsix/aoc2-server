package com.lvl6.aoc2.services.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.lvl6.aoc2.entitymanager.UserEntityManager;
import com.lvl6.aoc2.po.User;
import com.lvl6.aoc2.po.properties.AocTwoTableConstants;

public class UserServiceImpl implements UserService {
	
	@Autowired
	protected UserEntityManager userEntityManager;

	@Override
	public void updateUserResources(User u,
			Map<Integer, Integer> resourceTypeToChanges) {
		
		int gold = AocTwoTableConstants.RESOURCE_TYPE__GOLD;
		int tonic = AocTwoTableConstants.RESOURCE_TYPE__TONIC;
		if (resourceTypeToChanges.containsKey(gold)) {
			int totalGold = u.getGold();
			totalGold += resourceTypeToChanges.get(gold);
			u.setGold(totalGold);
		}
		
		if (resourceTypeToChanges.containsKey(tonic)) {
			int totalTonic = u.getTonic();
			totalTonic += resourceTypeToChanges.get(tonic);
			u.setTonic(totalTonic);
		}
		
		getUserEntityManager().get().put(u);
	}
	
	
	@Override
	public void updateUserGold(User u, int goldChange) {
		if (goldChange > 0) {
			int totalGold = u.getGold();
			totalGold += goldChange;
			u.setGold(totalGold);
		}
		getUserEntityManager().get().put(u);
	}

	@Override
	public void updateUserTonic(User u, int tonicChange) {
		if (tonicChange > 0) {
			int totalTonic = u.getTonic();
			totalTonic += tonicChange;
			u.setTonic(totalTonic);
		}
		getUserEntityManager().get().put(u);
	}
	
	@Override
	public UserEntityManager getUserEntityManager() {
		return userEntityManager;
	}

	@Override
	public void setUserEntityManager(UserEntityManager userEntityManager) {
		this.userEntityManager = userEntityManager;
	}
	
	
}