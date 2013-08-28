package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.lvl6.aoc2.entitymanager.Index;



@Entity
public class UserConsumable extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	@Index
	protected UUID userId = null;
	
	@Column(name="consumable_id")
	@Index
	protected String consumable_id = "";
	
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


	public String getConsumable_id() {
		return consumable_id;
	}


	public void setConsumable_id(String consumable_id) {
		this.consumable_id = consumable_id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "UserConsumable [id=" + id + ", userId=" + userId
				+ ", consumable_id=" + consumable_id + ", quantity=" + quantity
				+ "]";
	}

	
	@Override
	public Set<String> getTableUpdateStatements() {
		Set<String> indexes = new HashSet<String>();
		
		return indexes;
	}
	
	
}
