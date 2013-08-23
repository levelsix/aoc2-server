package com.lvl6.aoc2.services.userstructure;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lvl6.aoc2.entitymanager.StructureEntityManager;
import com.lvl6.aoc2.entitymanager.UserStructureEntityManager;
import com.lvl6.aoc2.entitymanager.staticdata.StructureRetrieveUtils;
import com.lvl6.aoc2.po.Structure;
import com.lvl6.aoc2.po.UserStructure;

public class UserStructureServiceImpl implements UserStructureService {
	
	private  Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

	private  Map<UUID, UserStructure> idsToUserStructures;
	
	@Autowired
	protected UserStructureEntityManager userStructureEntityManager;

	@Autowired
	protected StructureEntityManager structureEntityManager;
	
	@Autowired
	protected StructureRetrieveUtils structureRetrieveUtils;
	
	
	@Override
	public  UserStructure getUserStructureForId(UUID id) {
		log.debug("retrieve UserStructure data for id " + id);
		if (idsToUserStructures == null) {
			setStaticIdsToUserStructures();      
		}
		return idsToUserStructures.get(id);
	}

	@Override
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
	
	@Override
	public  List<UserStructure> getAllUserStructuresForUser(UUID userId) {
		String cqlquery = "select * from user_structure where user_id=" + userId + ";"; 
		List <UserStructure> list = getUserStructureEntityManager().get().find(cqlquery);
		return list;
	}
	
	@Override
	public Structure getStructureCorrespondingToUserStructure(UserStructure us) {
		String structureName = us.getName();
		int level = us.getLvl();
		return getStructureRetrieveUtils().getStructureWithNameAndLevel(structureName, level);
	}
	
	

	public UserStructureEntityManager getUserStructureEntityManager() {
		return userStructureEntityManager;
	}

	public void setUserStructureEntityManager(
			UserStructureEntityManager userStructureEntityManager) {
		this.userStructureEntityManager = userStructureEntityManager;
	}

	public StructureEntityManager getStructureEntityManager() {
		return structureEntityManager;
	}

	public void setStructureEntityManager(
			StructureEntityManager structureEntityManager) {
		this.structureEntityManager = structureEntityManager;
	}

	public StructureRetrieveUtils getStructureRetrieveUtils() {
		return structureRetrieveUtils;
	}

	public void setStructureRetrieveUtils(
			StructureRetrieveUtils structureRetrieveUtils) {
		this.structureRetrieveUtils = structureRetrieveUtils;
	}


	
	
	
	
	
	
	
}