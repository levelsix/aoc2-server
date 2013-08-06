package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserEquipRepair extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = null;
	
	@Column(name="equip_id")
	protected UUID equipId = null;
	
	@Column(name="equip_level")
	protected int equipLevel = 0;
	
	@Column(name="durability")
	protected int durability = 0;
	
	@Column(name="expected_start")
	protected Date expectedStart = null;
	
	@Column(name="entered_queue")
	protected Date enteredQueue = null;




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


	public int getDurability() {
		return durability;
	}


	public void setDurability(int durability) {
		this.durability = durability;
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



	@Override
	public String toString() {
		return "UserEquipRepair [id=" + id + ", userId=" + userId
				+ ", equipId=" + equipId + ", equipLevel=" + equipLevel
				+ ", durability=" + durability + ", expectedStart="
				+ expectedStart + ", enteredQueue=" + enteredQueue + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user_equip_repair (" +
				" id uuid," +
				" user_id uuid," +
				" equip_id uuid," +
				" equip_level int," +
				" durability int," +
				" expected_start timestamp" +
				" entered_queue timestamp," +
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
		indexes.add("create index user_equip_repair_user_id_index on user_equip_repair (user_id);");
		indexes.add("create index user_equip_repair_equip_id_index on user_equip_repair (equip_id);");
		indexes.add("create index user_equip_repair_equip_level_index on user_equip_repair (equip_level);");
		indexes.add("create index user_equip_repair_expected_start_index on user_equip_repair (expected_start);");
		indexes.add("create index user_equip_repair_entered_queue_index on user_equip_repair (entered_queue);");
		return indexes;
	}
	
	
}
