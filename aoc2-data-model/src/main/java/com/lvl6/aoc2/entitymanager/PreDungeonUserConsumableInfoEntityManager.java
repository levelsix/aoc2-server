package com.lvl6.aoc2.entitymanager;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.google.common.collect.ImmutableMap;
import com.lvl6.aoc2.po.PreDungeonUserConsumableInfo;

@Component
public class PreDungeonUserConsumableInfoEntityManager extends BaseEntityManager<PreDungeonUserConsumableInfo, UUID>{

	
	
	
	
	public PreDungeonUserConsumableInfoEntityManager() {
		super(PreDungeonUserConsumableInfo.class, UUID.class);
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
