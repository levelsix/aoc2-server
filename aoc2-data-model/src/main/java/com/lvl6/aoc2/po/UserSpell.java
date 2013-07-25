package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserSpell extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="spell_id")
	protected UUID spellId = UUID.randomUUID();
	
	@Column(name="spell_level")
	protected UUID spellLevel = UUID.randomUUID();
	


	@Override
	public String getTableCreateStatement() {
		return "create table roomReward (" +
				" id uuid," +
				" chest_id int," +
				" chest_drop_percentage double," +
				" equip_id int," +
				" equip_drop_percentage double," +
				" primary key(id))" +
				" with compact storage;";
	}
	
	
	@Override
	public Set<String> getTableUpdateStatements() {
		Set<String> indexes = new HashSet<String>();
		
		return indexes;
	}
	
	
	@Override
	public Set<String> getIndexCreateStatements() {
		Set<String> indexes = new HashSet<String>();
		indexes.add("create index chest_id_index on roomReward (chest_id);");
		indexes.add("create index equip_id_index on roomReward (equip_id);");
		return indexes;
	}
	
	
	
	
	
}
