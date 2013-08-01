package com.lvl6.aoc2.entitymanager.staticdata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvl6.aoc2.entitymanager.ConsumableEntityManager;
import com.lvl6.aoc2.po.Consumable;

@Component public class ConsumableRetrieveUtils {

	private  Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

	private  Map<UUID, Consumable> idsToConsumables;

	//private  final String TABLE_NAME = DBConstants.CONSUMABLE;

	@Autowired
	protected ConsumableEntityManager consumableEntityManager;

	public  Consumable getConsumableForId(UUID id) {
		log.debug("retrieve consumable data for id " + id);
		if (idsToConsumables == null) {
			setStaticIdsToConsumables();      
		}
		return idsToConsumables.get(id);
	}

	public  Map<UUID, Consumable> getConsumablesForIds(List<UUID> ids) {
		log.debug("retrieve consumables data for ids " + ids);
		if (idsToConsumables == null) {
			setStaticIdsToConsumables();      
		}
		Map<UUID, Consumable> toreturn = new HashMap<UUID, Consumable>();
		for (UUID id : ids) {
			toreturn.put(id,  idsToConsumables.get(id));
		}
		return toreturn;
	}

	private  void setStaticIdsToConsumables() {
		log.debug("setting  map of consumableIds to consumables");

		String cqlquery = "select * from consumable;"; 
		List <Consumable> list = getConsumableEntityManager().get().find(cqlquery);
		idsToConsumables = new HashMap<UUID, Consumable>();
		for(Consumable c : list) {
			UUID id= c.getId();
			idsToConsumables.put(id, c);
		}
	}



	public  void reload() {
		setStaticIdsToConsumables();
	}
	
	

	public ConsumableEntityManager getConsumableEntityManager() {
		return consumableEntityManager;
	}

	public void setConsumableEntityManager(
			ConsumableEntityManager consumableEntityManager) {
		this.consumableEntityManager = consumableEntityManager;
	}
}
