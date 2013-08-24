package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserConsumableQueue extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = null;
	
	@Column(name="consumable_id")
	protected UUID consumableId = null;
	
	@Column(name="quantity")
	protected int quantity = 0;
	
	@Column(name="expected_start")
	protected Date expectedStart = null;
	
	@Column(name="entered_queue")
	protected Date enteredQueue = null;

	@Column(name="is_finished_building")
	protected boolean isFinishedBuilding = false;

	

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


	public void setConsumableId(UUID consumableId) {
		this.consumableId = consumableId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Date getExpectedStart() {
		return expectedStart;
	}


	public void setExpectedStart(Date expectedStart) {
		this.expectedStart = expectedStart;
	}


	public Date getEnteredQueue() {
		return enteredQueue;
	}


	public void setEnteredQueue(Date enteredQueue) {
		this.enteredQueue = enteredQueue;
	}


	public boolean isFinishedBuilding() {
		return isFinishedBuilding;
	}


	public void setFinishedBuilding(boolean isFinishedBuilding) {
		this.isFinishedBuilding = isFinishedBuilding;
	}


	@Override
	public String toString() {
		return "UserConsumableQueue [id=" + id + ", userId=" + userId
				+ ", consumableId=" + consumableId + ", quantity=" + quantity
				+ ", expectedStart=" + expectedStart + ", enteredQueue="
				+ enteredQueue + ", isFinishedBuilding=" + isFinishedBuilding
				+ "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user_consumable_queue (" +
				" id uuid," +
				" user_id uuid," +
				" consumable_id uuid," +
				" quantity int," +
				" expected_start timestamp," +
				" entered_queue timestamp," +
				" is_finished_building boolean," +
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
		indexes.add("create index user_consumable_queue_user_id_index on user_consumable_queue (user_id);");
		indexes.add("create index user_consumable_queue_consumable_id_index on user_consumable_queue (consumable_id);");
		indexes.add("create index user_consumable_queue_expected_start_index on user_consumable_queue (expected_start);");
		indexes.add("create index user_consumable_queue_entered_queue_index on user_consumable_queue (entered_queue);");
		return indexes;
	}
	
	
}
