package com.lvl6.aoc2.po;

import java.util.Date;
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
	
	@Column(name="chest_drop_percentage")
	protected double chestDropPercentage = 0.0;
	
	@Column(name="equip_id")
	protected UUID equipId = UUID.randomUUID();

	@Column(name="equip_drop_percentage")
	protected double equipDropPercentage = 0.0;

	
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


	public double getChestDropPercentage() {
		return chestDropPercentage;
	}


	public void setChestDropPercentage(double chestDropPercentage) {
		this.chestDropPercentage = chestDropPercentage;
	}


	public UUID getEquipId() {
		return equipId;
	}


	public void setEquipId(UUID equipId) {
		this.equipId = equipId;
	}


	public double getEquipDropPercentage() {
		return equipDropPercentage;
	}


	public void setEquipDropPercentage(double equipDropPercentage) {
		this.equipDropPercentage = equipDropPercentage;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(chestDropPercentage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((chestId == null) ? 0 : chestId.hashCode());
		temp = Double.doubleToLongBits(equipDropPercentage);
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
		if (Double.doubleToLongBits(chestDropPercentage) != Double
				.doubleToLongBits(other.chestDropPercentage))
			return false;
		if (chestId == null) {
			if (other.chestId != null)
				return false;
		} else if (!chestId.equals(other.chestId))
			return false;
		if (Double.doubleToLongBits(equipDropPercentage) != Double
				.doubleToLongBits(other.equipDropPercentage))
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
				+ ", chestDropPercentage=" + chestDropPercentage + ", equipId="
				+ equipId + ", equipDropPercentage=" + equipDropPercentage
				+ "]";
	}


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
