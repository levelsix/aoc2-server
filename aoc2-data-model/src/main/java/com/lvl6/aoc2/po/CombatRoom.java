package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class CombatRoom extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	//room type = dungeon, specifies to which dungeon this room belongs
	@Column(name="room_type")
	protected int roomType = 1;
	
	//if this room comes first, second, ... in this dungeon
	@Column(name="order")
	protected int order = 1;
	
	@Column(name="level_requirement")
	protected int levelRequirement = 0;
	
	@Column(name="name")
	protected String name = "Inferno";
	
	//for all stars
	@Column(name="time_millis_one")
	protected int timeMillisOne = 120000;
	
	//for two stars
	@Column(name="time_millis_two")
	protected int timeMillisTwo = 180000;
	
	//for one star
	@Column(name="time_millis_three")
	protected int timeMillisThree = 240000;


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public int getRoomType() {
		return roomType;
	}


	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}


	public int getOrder() {
		return order;
	}


	public void setOrder(int order) {
		this.order = order;
	}


	public int getLevelRequirement() {
		return levelRequirement;
	}


	public void setLevelRequirement(int levelRequirement) {
		this.levelRequirement = levelRequirement;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getTimeMillisOne() {
		return timeMillisOne;
	}


	public void setTimeMillisOne(int timeMillisOne) {
		this.timeMillisOne = timeMillisOne;
	}


	public int getTimeMillisTwo() {
		return timeMillisTwo;
	}


	public void setTimeMillisTwo(int timeMillisTwo) {
		this.timeMillisTwo = timeMillisTwo;
	}


	public int getTimeMillisThree() {
		return timeMillisThree;
	}


	public void setTimeMillisThree(int timeMillisThree) {
		this.timeMillisThree = timeMillisThree;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + levelRequirement;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + order;
		result = prime * result + roomType;
		result = prime * result + timeMillisOne;
		result = prime * result + timeMillisThree;
		result = prime * result + timeMillisTwo;
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
		CombatRoom other = (CombatRoom) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (levelRequirement != other.levelRequirement)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (order != other.order)
			return false;
		if (roomType != other.roomType)
			return false;
		if (timeMillisOne != other.timeMillisOne)
			return false;
		if (timeMillisThree != other.timeMillisThree)
			return false;
		if (timeMillisTwo != other.timeMillisTwo)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CombatRoom [id=" + id + ", roomType=" + roomType + ", order="
				+ order + ", levelRequirement=" + levelRequirement + ", name="
				+ name + ", timeMillisOne=" + timeMillisOne
				+ ", timeMillisTwo=" + timeMillisTwo + ", timeMillisThree="
				+ timeMillisThree + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table combat_room (" +
				" id uuid," +
				" room_type int," +
				" order int int," +
				" level_requirement int," +
				" name varchar," +
				" time_milllis_one int," +
				" time_millis_two," +
				" time_millis_three" +
				" num_rooms int," +
				" primary key (id))" +
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
		indexes.add("create index combat_room_room_type_index on combat_room (room_type);");
		
		return indexes;
	}
	
}
