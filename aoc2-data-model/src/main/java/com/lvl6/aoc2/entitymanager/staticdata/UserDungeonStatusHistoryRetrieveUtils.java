package com.lvl6.aoc2.entitymanager.staticdata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvl6.aoc2.entitymanager.UserDungeonStatusHistoryEntityManager;
import com.lvl6.aoc2.po.UserDungeonStatusHistory;

@Component public class UserDungeonStatusHistoryRetrieveUtils {

	private  Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

	private  Map<UUID, UserDungeonStatusHistory> idsToUserDungeonStatusHistorys;
	
	@Autowired
	protected UserDungeonStatusHistoryEntityManager UserDungeonStatusHistoryEntityManager;

	public  UserDungeonStatusHistory getUserDungeonStatusHistoryForId(UUID id) {
		log.debug("retrieve UserDungeonStatusHistory data for id " + id);
		if (idsToUserDungeonStatusHistorys == null) {
			setStaticIdsToUserDungeonStatusHistorys();      
		}
		return idsToUserDungeonStatusHistorys.get(id);
	}

	public  Map<UUID, UserDungeonStatusHistory> getUserDungeonStatusHistorysForIds(List<UUID> ids) {
		log.debug("retrieve UserDungeonStatusHistorys data for ids " + ids);
		if (idsToUserDungeonStatusHistorys == null) {
			setStaticIdsToUserDungeonStatusHistorys();      
		}
		Map<UUID, UserDungeonStatusHistory> toreturn = new HashMap<UUID, UserDungeonStatusHistory>();
		for (UUID id : ids) {
			toreturn.put(id,  idsToUserDungeonStatusHistorys.get(id));
		}
		return toreturn;
	}

	private  void setStaticIdsToUserDungeonStatusHistorys() {
		log.debug("setting  map of UserDungeonStatusHistoryIds to UserDungeonStatusHistorys");

		String cqlquery = "select * from user_dungeon_status_history;"; 
		List <UserDungeonStatusHistory> list = getUserDungeonStatusHistoryEntityManager().get().find(cqlquery);
		idsToUserDungeonStatusHistorys = new HashMap<UUID, UserDungeonStatusHistory>();
		for(UserDungeonStatusHistory us : list) {
			UUID id= us.getId();
			idsToUserDungeonStatusHistorys.put(id, us);
		}
					
	}

//	public  List<UserDungeonStatusHistory> getAllUserDungeonStatusHistorysForUser(UUID userId) {
//		String cqlquery = "select * from user_equip where user_id=" + userId + ";"; 
//		List <UserDungeonStatusHistory> list = getUserDungeonStatusHistoryEntityManager().get().find(cqlquery);
//		return list;
//	}
//	
	
	public  void reload() {
		setStaticIdsToUserDungeonStatusHistorys();
	}
	
	
	public UserDungeonStatusHistoryEntityManager getUserDungeonStatusHistoryEntityManager() {
		return UserDungeonStatusHistoryEntityManager;
	}

	public void setUserDungeonStatusHistoryEntityManager(
			UserDungeonStatusHistoryEntityManager UserDungeonStatusHistoryEntityManager) {
		this.UserDungeonStatusHistoryEntityManager = UserDungeonStatusHistoryEntityManager;
	}
}
