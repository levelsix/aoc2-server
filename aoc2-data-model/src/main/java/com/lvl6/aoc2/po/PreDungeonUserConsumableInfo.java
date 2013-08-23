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
	
	@Column(name="consumable_id")
	protected UUID consumableId = UUID.randomUUID();;
	
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


	public UUID getConsumableId() {
		return consumableId;
	}


	public void setConsumableId(UUID consumableId) {
		this.consumableId = consumableId;
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
				+ ", consumableId=" + consumableId + ", quantity=" + quantity
				+ "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+tableName()+" (" +
				" id uuid," +
				" user_id uuid," +
				" consumable_id uuid," +
				" quantity int," +
				" primary key(id))" +
				" with compact storage;";
	}
	
	
	@Override
	public Set<String> getTableUpdateStatements() {
		Set<String> indexes = new HashSet<String>();
		
		return indexes;
	}
	
	
/*	@Override
	public Set<String> getIndexCreateStatements() {
		Set<String> indexes = new HashSet<String>();
		indexes.add("create index pre_dungeon_user_consumable_info_user_id_index "+tableName()+" (user_id);");
		indexes.add("create index pre_dungeon_user_consumable_info_name_index "+tableName()+" (name);");
//		indexes.add("create index pre_dungeon_user_consumable_info_user_id_index on pre_dungeon_user_consumable_info (user_id);");
	//	indexes.add("create index pre_dungeon_user_consumable_info_consumable_id_index on pre_dungeon_user_consumable_info (consumable_id);");
		return indexes;
	}
	*/
	
}
