package com.lvl6.aoc2.entitymanager;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.google.common.collect.ImmutableMap;
import com.lvl6.aoc2.po.UserEquipRepair;

@Component
public class UserEquipRepairEntityManager extends BaseEntityManager<UserEquipRepair, UUID>{

	
	
	
	
	public UserEquipRepairEntityManager() {
		super(UserEquipRepair.class, UUID.class);
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