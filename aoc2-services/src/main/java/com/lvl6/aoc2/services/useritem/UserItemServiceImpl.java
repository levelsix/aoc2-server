package com.lvl6.aoc2.services.useritem;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.lvl6.aoc2.entitymanager.UserItemEntityManager;
import com.lvl6.aoc2.entitymanager.staticdata.UserItemRetrieveUtils;
import com.lvl6.aoc2.po.Item;
import com.lvl6.aoc2.po.User;
import com.lvl6.aoc2.po.UserItem;

public class UserItemServiceImpl implements UserItemService {
	
	@Autowired
	protected UserItemEntityManager userItemEntityManager;
	
	@Autowired
	protected UserItemRetrieveUtils userItemRetrieveUtils;

	
	@Override
	public Map<UUID, UserItem> getUserItemsByUserItemIds(Collection<UUID> ids) {
		Map<UUID, UserItem> returnVal = new HashMap<UUID, UserItem>();
		
		List<UserItem> ueList = userItemEntityManager.get().get(ids);
		for (UserItem ue : ueList) {
			UUID id = ue.getId();
			returnVal.put(id, ue);
		}
		
		return returnVal;
	}
	
	@Override
	public void saveItems(Collection<UserItem> newItems) {
		getUserItemEntityManager().get().put(newItems);
	}

	@Override
	public int getNumberOfSpecificUserKeys(UUID itemId, UUID userId) {
		List<UserItem> uiList = getUserItemRetrieveUtils().getAllUserItemsForUser(userId);
		int specificKeyCount = 0;
		for(UserItem ui : uiList) {
			if(ui.getItemId() == itemId)
				specificKeyCount++;
		}
		return specificKeyCount;
	}
	
	
	@Override
	public UserItemEntityManager getUserItemEntityManager() {
		return userItemEntityManager;
	}

	@Override
	public void setUserItemEntityManager(
			UserItemEntityManager userItemEntityManager) {
		this.userItemEntityManager = userItemEntityManager;
	}

	public UserItemRetrieveUtils getUserItemRetrieveUtils() {
		return userItemRetrieveUtils;
	}

	public void setUserItemRetrieveUtils(UserItemRetrieveUtils userItemRetrieveUtils) {
		this.userItemRetrieveUtils = userItemRetrieveUtils;
	}
	
}