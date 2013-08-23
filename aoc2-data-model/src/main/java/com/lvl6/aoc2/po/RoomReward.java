package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class RoomReward extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="chest_id")
	protected UUID chestId = UUID.randomUUID();
	
	@Column(name="chest_drop_rate")
	protected double chestDropRate = 0.0;
	
	@Column(name="equip_id")
	protected UUID equipId = UUID.randomUUID();

	@Column(name="equip_drop_rate")
	protected double equipDropRate = 0.0;

	


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getChestId() {
		return chestId;
	}


	public void setChestId(UUID chestId) {
		this.chestId = chestId;
	}


	public double getChestDropRate() {
		return chestDropRate;
	}


	public void setChestDropRate(double chestDropRate) {
		this.chestDropRate = chestDropRate;
	}


	public UUID getEquipId() {
		return equipId;
	}


	public void setEquipId(UUID equipId) {
		this.equipId = equipId;
	}


	public double getEquipDropRate() {
		return equipDropRate;
	}


	public void setEquipDropRate(double equipDropRate) {
		this.equipDropRate = equipDropRate;
	}


	@Override
	public String toString() {
		return "RoomReward [id=" + id + ", chestId=" + chestId
				+ ", chestDropRate=" + chestDropRate + ", equipId=" + equipId
				+ ", equipDropRate=" + equipDropRate + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table room_reward (" +
				" id uuid," +
				" chest_id uuid," +
				" chest_drop_rate double," +
				" equip_id int," +
				" equip_drop_rate double," +
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
		indexes.add("create index room_reward_chest_drop_rate_index on room_reward (chest_drop_rate);");
		indexes.add("create index room_reward_equip_id_index on room_reward (equip_id);");
		return indexes;
	}
	
	
}
