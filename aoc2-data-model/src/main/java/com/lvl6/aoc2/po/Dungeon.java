package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Dungeon extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="level_requirement")
	protected int levelRequirement = 0;
	
	@Column(name="time_limit")
	protected int timeLimit = 0;
	
	@Column(name="num_rooms")
	protected int numRooms = 0;
	
	@Column(name="name")
	protected String name = "Inferno";
	

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public int getLevelRequirement() {
		return levelRequirement;
	}


	public void setLevelRequirement(int levelRequirement) {
		this.levelRequirement = levelRequirement;
	}


	public int getTimeLimit() {
		return timeLimit;
	}


	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}


	public int getNumRooms() {
		return numRooms;
	}


	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + levelRequirement;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numRooms;
		result = prime * result + timeLimit;
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
		Dungeon other = (Dungeon) obj;
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
		if (numRooms != other.numRooms)
			return false;
		if (timeLimit != other.timeLimit)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Dungeon [id=" + id + ", levelRequirement=" + levelRequirement
				+ ", timeLimit=" + timeLimit + ", numRooms=" + numRooms
				+ ", name=" + name + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table dungeon (" +
				" id uuid," +
				" level_requirement int," +
				" time_limit int," +
				" num_rooms int," +
				" name varchar," +
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
		indexes.add("create index level_requirement on dungeon(level_requirement);");
		return indexes;
	}
	
}
