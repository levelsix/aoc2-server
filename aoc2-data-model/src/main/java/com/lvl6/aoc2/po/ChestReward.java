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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(chestDropRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((chest_id == null) ? 0 : chest_id.hashCode());
		result = prime * result + ((equipId == null) ? 0 : equipId.hashCode());
		temp = Double.doubleToLongBits(equipWeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChestReward other = (ChestReward) obj;
		if (Double.doubleToLongBits(chestDropRate) != Double
				.doubleToLongBits(other.chestDropRate))
			return false;
		if (chest_id == null) {
			if (other.chest_id != null)
				return false;
		} else if (!chest_id.equals(other.chest_id))
			return false;
		if (equipId == null) {
			if (other.equipId != null)
				return false;
		} else if (!equipId.equals(other.equipId))
			return false;
		if (Double.doubleToLongBits(equipWeight) != Double
				.doubleToLongBits(other.equipWeight))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
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
