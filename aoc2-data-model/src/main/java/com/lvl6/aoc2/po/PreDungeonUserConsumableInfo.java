package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class PreDungeonUserConsumableInfo extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = UUID.randomUUID();
	
	//the 'equip_id' column in equipment table, not the 'id' column
	@Column(name="name")
	protected String name = "";
	
	@Column(name="quantity")
	protected int quantity = 0;
	

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getUserId() {
		return userId;
	}


	public void setUserId(UUID userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "PreDungeonUserConsumableInfo [id=" + id + ", userId=" + userId
				+ ", name=" + name + ", quantity=" + quantity + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create pre_dungeon_user_consumable_info (" +
				" id uuid," +
				" user_id uuid," +
				" name varchar," +
				" quantity int," +
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
		indexes.add("create index room_reward_chest_id_index on room_reward (chest_id);");
		indexes.add("create index room_reward_equip_id_index on room_reward (equip_id);");
		return indexes;
	}
	
	
}
