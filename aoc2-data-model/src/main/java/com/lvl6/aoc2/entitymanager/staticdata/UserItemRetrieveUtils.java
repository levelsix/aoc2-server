package com.lvl6.aoc2.entitymanager.staticdata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvl6.aoc2.entitymanager.ItemEntityManager;
import com.lvl6.aoc2.entitymanager.UserItemEntityManager;
import com.lvl6.aoc2.po.Item;
import com.lvl6.aoc2.po.UserItem;

@Component public class UserItemRetrieveUtils {

	private  Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

	private  Map<UUID, UserItem> idsToUserItems;
		
	@Autowired
	protected UserItemEntityManager UserItemEntityManager;
	
	@Autowired
	protected ItemEntityManager itemEntityManager;

	
	public  UserItem getUserItemForId(UUID id) {
		log.debug("retrieve UserItem data for id " + id);
		if (idsToUserItems == null) {
			setStaticIdsToUserItems();      
		}
		return idsToUserItems.get(id);
	}

	public  Map<UUID, UserItem> getUserItemsForIds(List<UUID> ids) {
		log.debug("retrieve UserItems data for ids " + ids);
		if (idsToUserItems == null) {
			setStaticIdsToUserItems();      
		}
		Map<UUID, UserItem> toreturn = new HashMap<UUID, UserItem>();
		for (UUID id : ids) {
			toreturn.put(id,  idsToUserItems.get(id));
		}
		return toreturn;
	}

	private  void setStaticIdsToUserItems() {
		log.debug("setting  map of UserItemIds to UserItems");

		String cqlquery = "select * from user_item;"; 
		List <UserItem> list = getUserItemEntityManager().get().find(cqlquery);
		idsToUserItems = new HashMap<UUID, UserItem>();
		for(UserItem us : list) {
			UUID id= us.getId();
			idsToUserItems.put(id, us);
		}
					
	}

	public  List<UserItem> getAllUserItemsForUser(UUID userId) {
		String cqlquery = "select * from user_item where user_id=" + userId + ";"; 
		List <UserItem> list = getUserItemEntityManager().get().find(cqlquery);
		return list;
	}
	
	public Item getItemCorrespondingToUserItem(UserItem ui) {
		UUID itemId = ui.getItemId();
		String cqlquery = "select * from Item where itemId= " + itemId + ";";
		List<Item> i = getItemEntityManager().get().find(cqlquery);
		return i.get(0);
	}
	
	
	public  void reload() {
		setStaticIdsToUserItems();
	}
	
	
	public UserItemEntityManager getUserItemEntityManager() {
		return UserItemEntityManager;
	}

	public void setUserItemEntityManager(
			UserItemEntityManager UserItemEntityManager) {
		this.UserItemEntityManager = UserItemEntityManager;
	}

	public ItemEntityManager getItemEntityManager() {
		return itemEntityManager;
	}

	public void setItemEntityManager(ItemEntityManager itemEntityManager) {
		this.itemEntityManager = itemEntityManager;
	}
	
}
