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
	
	@Column(name="name")
	protected String name = "";
	
	@Column(name="equip_level")
	protected int equipLevel = 0;
	
	@Column(name="durability")
	protected double durability = 0;
	
	@Column(name="expected_start")
	protected Date expectedStart = null;
	
	@Column(name="entered_queue")
	protected Date enteredQueue = null;
	
	@Column(name="time_acquired")
	protected Date timeAcquired = new Date();
	
	@Column(name="level_of_user_when_acquired")
	protected int levelOfUserWhenAcquired = 0;
	
	@Column(name="dungeon_room_or_chest_acquired_from")
	protected String dungeonRoomOrChestAcquiredFrom = "";




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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public Date getTimeAcquired() {
		return timeAcquired;
	}


	public void setTimeAcquired(Date timeAcquired) {
		this.timeAcquired = timeAcquired;
	}


	public int getLevelOfUserWhenAcquired() {
		return levelOfUserWhenAcquired;
	}


	public void setLevelOfUserWhenAcquired(int levelOfUserWhenAcquired) {
		this.levelOfUserWhenAcquired = levelOfUserWhenAcquired;
	}


	public String getDungeonRoomOrChestAcquiredFrom() {
		return dungeonRoomOrChestAcquiredFrom;
	}


	public void setDungeonRoomOrChestAcquiredFrom(
			String dungeonRoomOrChestAcquiredFrom) {
		this.dungeonRoomOrChestAcquiredFrom = dungeonRoomOrChestAcquiredFrom;
	}



	@Override
	public String toString() {
		return "UserEquipRepair [id=" + id + ", userId=" + userId + ", name="
				+ name + ", equipLevel=" + equipLevel + ", durability="
				+ durability + ", expectedStart=" + expectedStart
				+ ", enteredQueue=" + enteredQueue + ", timeAcquired="
				+ timeAcquired + ", levelOfUserWhenAcquired="
				+ levelOfUserWhenAcquired + ", dungeonRoomOrChestAcquiredFrom="
				+ dungeonRoomOrChestAcquiredFrom + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" user_id uuid," +
				" name varchar," +
				" equip_level int," +
				" durability double," +
				" expected_start timestamp," +
				" entered_queue timestamp," +
				" time_acquired timestamp," +
				" level_of_user_when_acquired int," +
				" dungeon_room_or_chest_acquired_from varchar," +
				" primary key(id))" +
				" with compact storage;";
	}
	
	
	@Override
	public Set<String> getTableUpdateStatements() {
		Set<String> indexes = new HashSet<String>();
		
		return indexes;
	}
	
	
/*	@Override
	public Set<String> getIndexCreateStatements() {
		Set<String> indexes = new HashSet<String>();
<<<<<<< HEAD
		indexes.add("create index user_equip_repair_user_id_index "+tableName()+" (user_id);");
		indexes.add("create index user_equip_repair_equip_id_index "+tableName()+" (equip_id);");
		indexes.add("create index user_equip_repair_equip_level_index "+tableName()+" (equip_level);");
		indexes.add("create index user_equip_repair_expected_start_index "+tableName()+" (expected_start);");
		indexes.add("create index user_equip_repair_entered_queue_index "+tableName()+" (entered_queue);");
=======
		indexes.add("create index user_equip_repair_user_id_index on user_equip_repair (user_id);");
		indexes.add("create index user_equip_repair_name_index on user_equip_repair (name);");
		indexes.add("create index user_equip_repair_equip_level_index on user_equip_repair (equip_level);");
		indexes.add("create index user_equip_repair_expected_start_index on user_equip_repair (expected_start);");
		indexes.add("create index user_equip_repair_entered_queue_index on user_equip_repair (entered_queue);");
>>>>>>> 62d75ceb56adbd358ff3954dbdd8c79911563c5e
		return indexes;
	}*/
	
	
}
