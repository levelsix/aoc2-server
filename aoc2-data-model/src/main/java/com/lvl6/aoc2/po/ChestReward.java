package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class ChestReward extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	//we'll set this manually
	@Column(name="chest_id")
	protected UUID chest_id = null;
	
	@Column(name="chest_drop_rate")
	protected double chestDropRate = 0.0d;
	
	@Column(name="equip_id")
	protected UUID equipId = UUID.randomUUID();
	
	@Column(name="equip_weight")
	protected double equipWeight = 0.0;
	



	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getChest_id() {
		return chest_id;
	}


	public void setChest_id(UUID chest_id) {
		this.chest_id = chest_id;
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


	public double getEquipWeight() {
		return equipWeight;
	}


	public void setEquipWeight(double equipWeight) {
		this.equipWeight = equipWeight;
	}




	@Override
	public String toString() {
		return "ChestReward [id=" + id + ", chest_id=" + chest_id
				+ ", chestDropRate=" + chestDropRate + ", equipId=" + equipId
				+ ", equipWeight=" + equipWeight + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table chest_reward (" +
				" id uuid," +
				" chest_id uuid," +
				" chest_drop_rate double," +
				" equip_id uuid," +
				" equip_weight double," +
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
		indexes.add("create index chest_reward_chest_id_index on chest_reward (chest_id);");
		indexes.add("create index chest_reward_equip_id_index on chest_reward (equip_id);");
		return indexes;
	}
	
	
	
	
	
}
