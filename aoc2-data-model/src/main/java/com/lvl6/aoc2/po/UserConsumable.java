package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserConsumable extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = null;
	
	@Column(name="consumable_id")
	protected UUID consumableId = null;
	
	@Column(name="quantity")
	protected int quantity = 0;

	


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


	public UUID getConsumableId() {
		return consumableId;
	}


	public void setConsumable_id(UUID consumableId) {
		this.consumableId = consumableId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((consumableId == null) ? 0 : consumableId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + quantity;
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
		UserConsumable other = (UserConsumable) obj;
		if (consumableId == null) {
			if (other.consumableId != null)
				return false;
		} else if (!consumableId.equals(other.consumableId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (quantity != other.quantity)
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
		return "UserConsumable [id=" + id + ", userId=" + userId
				+ ", consumableId=" + consumableId + ", quantity=" + quantity
				+ "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user_consumable (" +
				" id uuid," +
				" user_id uuid," +
				" consumable_id uuid," +
				" quantity int," +
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
		indexes.add("create index user_consumable_user_id_index on user_consumable (user_id);");
		indexes.add("create index user_consumable_consumable_id_index on user_consumable (consumable_id);");
		return indexes;
	}
	
	
	
	
	
}
