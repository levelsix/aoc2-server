package com.lvl6.aoc2.entitymanager.staticdata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvl6.aoc2.entitymanager.StructureEntityManager;
import com.lvl6.aoc2.po.Consumable;
import com.lvl6.aoc2.po.Structure;

@Component public class StructureRetrieveUtils {

	private  Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

	private  Map<UUID, Map<Integer, Structure>> structIdToLevelsToStructure;

	private  Map<UUID, Structure> idsToStructures;
	//private  final String TABLE_NAME = DBConstants.CONSUMABLE;

	@Autowired
	protected StructureEntityManager structureEntityManager;

	public  Structure getStructureForId(UUID id) {
		log.debug("retrieve structure data for id " + id);
		if (idsToStructures == null) {
			setStaticIdsToStructures();      
		}
		return idsToStructures.get(id);
	}

	public  Map<UUID, Structure> getStructuresForIds(List<UUID> ids) {
		log.debug("retrieve structures data for ids " + ids);
		if (idsToStructures == null) {
			setStaticIdsToStructures();      
		}
		Map<UUID, Structure> toreturn = new HashMap<UUID, Structure>();
		for (UUID id : ids) {
			toreturn.put(id,  idsToStructures.get(id));
		}
		return toreturn;
	}

	private  void setStaticIdsToStructures() {
		log.debug("setting  map of structureIds to structures");

		String cqlquery = "select * from structure;"; 
		List <Structure> list = getStructureEntityManager().get().find(cqlquery);
		structIdToLevelsToStructure = new HashMap<UUID,Map<Integer, Structure>>();
		for(Structure c : list) {
			UUID structId = c.getStructureId();
			Map<Integer, Structure> innerMap = structIdToLevelsToStructure.get(structId);
			if(innerMap == null) {
				innerMap = new HashMap<Integer, Structure>();
				structIdToLevelsToStructure.put(structId, innerMap);
			}
			innerMap.put(c.getLvl(), c);
		}
					
	}
	
	public Structure getUpgradedStructure(Structure s) {
		if(structIdToLevelsToStructure == null) {
			setStaticIdsToStructures();
		}
		Structure upgradedStructure;
		int level = s.getLvl();
		UUID structId = s.getStructureId();
		Map<Integer, Structure> sMap = structIdToLevelsToStructure.get(structId);
		upgradedStructure = sMap.get(level+1);
		if(upgradedStructure != null) {
			return upgradedStructure;
		}
		else return null;
	}
	


	public  void reload() {
		setStaticIdsToStructures();
	}
	
	

	public StructureEntityManager getStructureEntityManager() {
		return structureEntityManager;
	}

	public void setStructureEntityManager(
			StructureEntityManager structureEntityManager) {
		this.structureEntityManager = structureEntityManager;
	}
}
