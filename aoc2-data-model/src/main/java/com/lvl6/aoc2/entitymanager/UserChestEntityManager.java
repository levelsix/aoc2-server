package com.lvl6.aoc2.entitymanager;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.google.common.collect.ImmutableMap;
import com.lvl6.aoc2.po.UserChest;

@Component
public class UserChestEntityManager extends BaseEntityManager<UserChest, UUID>{

	
	
	
	
	public UserChestEntityManager() {
		super(UserChest.class, UUID.class);
	}


	@Override
	protected ImmutableMap<String, Object> getIndexes() {
		return ImmutableMap.<String, Object>builder()
			.put("column_metadata", ImmutableMap.<String, Object>builder()
	            //.put("userName", getIndexProps("userName"))
	            //.put("email", getIndexProps("email"))
	         .build())
	    .build();
	}
	


}
