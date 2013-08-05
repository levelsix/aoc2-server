package com.lvl6.aoc2.entitymanager.staticdata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvl6.aoc2.entitymanager.UserStructureEntityManager;
import com.lvl6.aoc2.po.UserStructure;
import com.lvl6.aoc2.po.UserStructure;

@Component public class UserStructureRetrieveUtils {

	private  Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

	private  Map<UUID, Map<Integer, UserStructure>> structIdToLevelsToUserStructure;

	private  Map<UUID, UserStructure> idsToUserStructures;
	
	private Map<UUID, UserStructure> userIdsToUserStructures;
	//private  final String TABLE_NAME = DBConstants.UserStructure;

	@Autowired
	protected UserStructureEntityManager UserStructureEntityManager;

	public  UserStructure getUserStructureForId(UUID id) {
		log.debug("retrieve UserStructure data for id " + id);
		if (idsToUserStructures == null) {
			setStaticIdsToUserStructures();      
		}
		return idsToUserStructures.get(id);
	}

	public  Map<UUID, UserStructure> getUserStructuresForIds(List<UUID> ids) {
		log.debug("retrieve UserStructures data for ids " + ids);
		if (idsToUserStructures == null) {
			setStaticIdsToUserStructures();      
		}
		Map<UUID, UserStructure> toreturn = new HashMap<UUID, UserStructure>();
		for (UUID id : ids) {
			toreturn.put(id,  idsToUserStructures.get(id));
		}
		return toreturn;
	}

	private  void setStaticIdsToUserStructures() {
		log.debug("setting  map of UserStructureIds to UserStructures");

		String cqlquery = "select * from UserStructure;"; 
		List <UserStructure> list = getUserStructureEntityManager().get().find(cqlquery);
		idsToUserStructures = new HashMap<UUID, UserStructure>();
		for(UserStructure us : list) {
			UUID id= us.getId();
			idsToUserStructures.put(id, us);
		}
					
	}

	public  List<UserStructure> getAllUserStructuresForUser(UUID userId) {
		String cqlquery = "select * from user_structure where user_id=" + userId + ";"; 
		List <UserStructure> list = getUserStructureEntityManager().get().find(cqlquery);
		return list;
	}
	
	
	public  void reload() {
		setStaticIdsToUserStructures();
	}
	
	

	public UserStructureEntityManager getUserStructureEntityManager() {
		return UserStructureEntityManager;
	}

	public void setUserStructureEntityManager(
			UserStructureEntityManager UserStructureEntityManager) {
		this.UserStructureEntityManager = UserStructureEntityManager;
	}
}
