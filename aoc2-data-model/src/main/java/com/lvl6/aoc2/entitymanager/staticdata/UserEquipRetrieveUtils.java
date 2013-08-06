package com.lvl6.aoc2.entitymanager.staticdata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvl6.aoc2.entitymanager.UserEquipEntityManager;
import com.lvl6.aoc2.po.UserEquip;
import com.lvl6.aoc2.po.Spell;

@Component public class UserEquipRetrieveUtils {

	private  Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

	private  Map<UUID, UserEquip> idsToUserEquips;
	
	private Map<UUID, UserEquip> userIdsToUserEquips;
	//private  final String TABLE_NAME = DBConstants.UserEquip;

	@Autowired
	protected UserEquipEntityManager UserEquipEntityManager;

	public  UserEquip getUserEquipForId(UUID id) {
		log.debug("retrieve UserEquip data for id " + id);
		if (idsToUserEquips == null) {
			setStaticIdsToUserEquips();      
		}
		return idsToUserEquips.get(id);
	}

	public  Map<UUID, UserEquip> getUserEquipsForIds(List<UUID> ids) {
		log.debug("retrieve UserEquips data for ids " + ids);
		if (idsToUserEquips == null) {
			setStaticIdsToUserEquips();      
		}
		Map<UUID, UserEquip> toreturn = new HashMap<UUID, UserEquip>();
		for (UUID id : ids) {
			toreturn.put(id,  idsToUserEquips.get(id));
		}
		return toreturn;
	}

	private  void setStaticIdsToUserEquips() {
		log.debug("setting  map of UserEquipIds to UserEquips");

		String cqlquery = "select * from user_spell;"; 
		List <UserEquip> list = getUserEquipEntityManager().get().find(cqlquery);
		idsToUserEquips = new HashMap<UUID, UserEquip>();
		for(UserEquip us : list) {
			UUID id= us.getId();
			idsToUserEquips.put(id, us);
		}
					
	}

	public  List<UserEquip> getAllUserEquipsForUser(UUID userId) {
		String cqlquery = "select * from user_equip where user_id=" + userId + ";"; 
		List <UserEquip> list = getUserEquipEntityManager().get().find(cqlquery);
		return list;
	}
	
	
	public  void reload() {
		setStaticIdsToUserEquips();
	}
	
	
	public UserEquipEntityManager getUserEquipEntityManager() {
		return UserEquipEntityManager;
	}

	public void setUserEquipEntityManager(
			UserEquipEntityManager UserEquipEntityManager) {
		this.UserEquipEntityManager = UserEquipEntityManager;
	}
}
