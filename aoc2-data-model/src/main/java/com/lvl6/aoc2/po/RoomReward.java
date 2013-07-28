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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(chestDropRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((chestId == null) ? 0 : chestId.hashCode());
		temp = Double.doubleToLongBits(equipDropRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((equipId == null) ? 0 : equipId.hashCode());
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
		RoomReward other = (RoomReward) obj;
		if (Double.doubleToLongBits(chestDropRate) != Double
				.doubleToLongBits(other.chestDropRate))
			return false;
		if (chestId == null) {
			if (other.chestId != null)
				return false;
		} else if (!chestId.equals(other.chestId))
			return false;
		if (Double.doubleToLongBits(equipDropRate) != Double
				.doubleToLongBits(other.equipDropRate))
			return false;
		if (equipId == null) {
			if (other.equipId != null)
				return false;
		} else if (!equipId.equals(other.equipId))
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
		return "RoomReward [id=" + id + ", chestId=" + chestId
				+ ", chestDropRate=" + chestDropRate + ", equipId=" + equipId
				+ ", equipDropRate=" + equipDropRate + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table room_reward (" +
				" id uuid," +
				" chest_id int," +
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
		indexes.add("create index room_reward_equip_id_index on room_reward (equip_id);");
		return indexes;
	}
	
	
}
