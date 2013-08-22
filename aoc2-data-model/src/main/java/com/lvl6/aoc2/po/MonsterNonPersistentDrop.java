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
	
	@Column(name="monster_id")
	protected UUID monsterId = null;
	
	@Column(name="drop_type")
	protected int dropType = 0;
	
	@Column(name="corresponding_id")
	protected UUID correspondingId = null;
	
	@Column(name="item_id")
	protected UUID itemId = null;
	
	@Column(name="item_drop_rate")
	protected double itemDropRate = 0.5;
	

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getMonsterId() {
		return monsterId;
	}


	public void setMonsterId(UUID monsterId) {
		this.monsterId = monsterId;
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


	public UUID getItemId() {
		return itemId;
	}


	public void setItemId(UUID itemId) {
		this.itemId = itemId;
	}


	public double getItemDropRate() {
		return itemDropRate;
	}


	public void setItemDropRate(double itemDropRate) {
		this.itemDropRate = itemDropRate;
	}
	
	
	@Override
	public String toString() {
		return "MonsterNonPersistentDrop [id=" + id + ", monsterId="
				+ monsterId + ", dropType=" + dropType + ", correspondingId="
				+ correspondingId + ", itemId=" + itemId + ", itemDropRate="
				+ itemDropRate + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" monster_id uuid," +
				" drop_type int," +
				" corresponding_id uuid," +
				" item_id uuid," +
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
		indexes.add("create index monster_non_persistent_drop_monster_id_index "+tableName()+" (monster_id);");
		return indexes;
	}
	
}








