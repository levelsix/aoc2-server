package com.lvl6.aoc2.services.user;

import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lvl6.aoc2.entitymanager.UserEntityManager;
import com.lvl6.aoc2.po.User;
import com.lvl6.aoc2.po.properties.AocTwoTableConstants;
import com.netflix.astyanax.connectionpool.exceptions.ConnectionException;
import com.netflix.astyanax.model.CqlResult;

public class UserServiceImpl implements UserService {
	
	@Autowired
	protected UserEntityManager userEntityManager;

	private static Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());
	
	@Override
	public User retrieveUser(String gameCenterId, String userId) {
		if (null != gameCenterId) {
			String cqlQuery =
					"select * " +
					"from user u " +
					"where u.game_center_id = ?;";
			
			try {
				CqlResult<UUID,String> result =
						getUserEntityManager().getCassandra().getKeyspace()
						.prepareQuery(getUserEntityManager().getColumnFamily())
							.withCql(cqlQuery)
						.asPreparedStatement()
							.withStringValue(gameCenterId)
						.execute().getResult();
				//result.
			} catch (ConnectionException e) {
				// TODO Auto-generated catch block
				log.error("retrieve user db issue", e);
			}
		}
		
		return null;
	}
	
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