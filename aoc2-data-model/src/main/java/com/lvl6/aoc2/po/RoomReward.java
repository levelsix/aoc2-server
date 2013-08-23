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
	
	@Column(name="chest_name")
	protected String chestName = "";
	
	@Column(name="chest_drop_rate")
	protected double chestDropRate = 0.0;
	
	@Column(name="equip_name")
	protected String equipName = "";

	@Column(name="equip_drop_rate")
	protected double equipDropRate = 0.0;


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getChestName() {
		return chestName;
	}


	public void setChestName(String chestName) {
		this.chestName = chestName;
	}


	public double getChestDropRate() {
		return chestDropRate;
	}


	public void setChestDropRate(double chestDropRate) {
		this.chestDropRate = chestDropRate;
	}


	public String getEquipName() {
		return equipName;
	}


	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}


	public double getEquipDropRate() {
		return equipDropRate;
	}


	public void setEquipDropRate(double equipDropRate) {
		this.equipDropRate = equipDropRate;
	}

	

	@Override
	public String toString() {
		return "RoomReward [id=" + id + ", chestName=" + chestName
				+ ", chestDropRate=" + chestDropRate + ", equipName="
				+ equipName + ", equipDropRate=" + equipDropRate + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table room_reward (" +
				" id uuid," +
				" chest_name varchar," +
				" chest_drop_rate double," +
				" equip_name varchar," +
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
		indexes.add("create index room_reward_chest_name_index on room_reward (chest_name);");
		indexes.add("create index room_reward_equip_name_index on room_reward (equip_name);");
		return indexes;
	}
	
	
}
