package com.lvl6.aoc2.po;

import java.util.Date;
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
		result = prime * result + ((equipId == null) ? 0 : equipId.hashCode());
		long temp;
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
		return "ChestReward [id=" + id + ", equipId=" + equipId
				+ ", equipWeight=" + equipWeight + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table chestReward (" +
				" id uuid," +
				" equip_id int," +
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
		indexes.add("create index equip_id_index on chestReward (equip_id);");
		return indexes;
	}
	
	
	
	
	
}
