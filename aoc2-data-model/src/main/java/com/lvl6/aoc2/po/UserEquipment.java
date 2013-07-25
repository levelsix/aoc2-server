package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserEquipment extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="durability")
	protected double durability = 0.0;
	
	@Column(name="equipped")
	protected boolean equipped = false;
	

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public double getDurability() {
		return durability;
	}


	public void setDurability(double durability) {
		this.durability = durability;
	}


	public boolean isEquipped() {
		return equipped;
	}


	public void setEquipped(boolean equipped) {
		this.equipped = equipped;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(durability);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (equipped ? 1231 : 1237);
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
		UserEquipment other = (UserEquipment) obj;
		if (Double.doubleToLongBits(durability) != Double
				.doubleToLongBits(other.durability))
			return false;
		if (equipped != other.equipped)
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
		return "UserEquipment [id=" + id + ", durability=" + durability
				+ ", equipped=" + equipped + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table userEquip (" +
				" id uuid," +
				" equip_id uuid," +
				" durability double," +
				" equipped boolean," +
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
		indexes.add("create index equipped_index on userEquip (equipped);");
		return indexes;
	}
	
	
	
	
	
}
