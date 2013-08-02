package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserEquip extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = null;
	
	//the 'equip_id' column in equipment table, not the 'id' column
	@Column(name="equip_id")
	protected UUID equipId = null;
	
	@Column(name="equip_level")
	protected int equipLevel = 0;
	
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


	public UUID getUserId() {
		return userId;
	}


	public void setUserId(UUID userId) {
		this.userId = userId;
	}


	public UUID getEquipId() {
		return equipId;
	}


	public void setEquipId(UUID equipId) {
		this.equipId = equipId;
	}


	public int getEquipLevel() {
		return equipLevel;
	}


	public void setEquipLevel(int equipLevel) {
		this.equipLevel = equipLevel;
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
		result = prime * result + ((equipId == null) ? 0 : equipId.hashCode());
		result = prime * result + equipLevel;
		result = prime * result + (equipped ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		UserEquip other = (UserEquip) obj;
		if (Double.doubleToLongBits(durability) != Double
				.doubleToLongBits(other.durability))
			return false;
		if (equipId == null) {
			if (other.equipId != null)
				return false;
		} else if (!equipId.equals(other.equipId))
			return false;
		if (equipLevel != other.equipLevel)
			return false;
		if (equipped != other.equipped)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "UserEquip [id=" + id + ", userId=" + userId + ", equipId="
				+ equipId + ", equipLevel=" + equipLevel + ", durability="
				+ durability + ", equipped=" + equipped + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user_equip (" +
				" id uuid," +
				" user_id uuid," +
				" equip_id uuid," +
				" equip_level int," +
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
		indexes.add("create index user_equip_user_id_index on user_equip (user_id);");
		indexes.add("create index user_equip_equip_id_index on user_equip (equip_id);");
		indexes.add("create index user_equip_equip_level_index on user_equip (equip_level);");
		indexes.add("create index user_equip_equipped_index on user_equip (equipped);");
		return indexes;
	}
	
	
}
