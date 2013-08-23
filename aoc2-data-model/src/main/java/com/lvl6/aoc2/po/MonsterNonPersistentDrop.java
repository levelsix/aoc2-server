package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class MonsterNonPersistentDrop extends BasePersistentObject{
	
	//explicit values are useless, I just made random values

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="monster_name")
	protected String monsterName = "";
	
	@Column(name="drop_type")
	protected int dropType = 0;
	
	@Column(name="corresponding_id")
	protected UUID correspondingId = null;
	
	@Column(name="item_name")
	protected String itemName = "";
	
	@Column(name="item_drop_rate")
	protected double itemDropRate = 0.5;
	

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getMonsterName() {
		return monsterName;
	}


	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}


	public int getDropType() {
		return dropType;
	}


	public void setDropType(int dropType) {
		this.dropType = dropType;
	}


	public UUID getCorrespondingId() {
		return correspondingId;
	}


	public void setCorrespondingId(UUID correspondingId) {
		this.correspondingId = correspondingId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getItemDropRate() {
		return itemDropRate;
	}


	public void setItemDropRate(double itemDropRate) {
		this.itemDropRate = itemDropRate;
	}


	@Override
	public String toString() {
		return "MonsterNonPersistentDrop [id=" + id + ", monsterName="
				+ monsterName + ", dropType=" + dropType + ", correspondingId="
				+ correspondingId + ", itemName=" + itemName
				+ ", itemDropRate=" + itemDropRate + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table monster_non_persistent_drop (" +
				" id uuid," +
				" monster_name varchar," +
				" drop_type int," +
				" corresponding_id uuid," +
				" item_name varchar," +
				" item_drop_rate double," +
				" primary key (id))" +
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
		indexes.add("create index monster_non_persistent_drop_monster_name_index on monster_non_persistent_drop (monster_name);");
		indexes.add("create index monster_non_persistent_drop_item_name_index on monster_non_persistent_drop (item_name);");

		return indexes;
	}
	
}








