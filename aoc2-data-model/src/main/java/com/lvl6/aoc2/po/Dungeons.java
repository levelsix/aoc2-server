package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Dungeons extends BasePersistentObject{

	@Id
	protected int id = 0;
	
	@Column(name="level_requirement")
	protected int levelRequirement = 0;
	
	@Column(name="time_limit")
	protected int timeLimit = 0;
	
	@Column(name="number_of_rooms")
	protected int numberOfRooms = 0;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
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


	public int getNumberOfRooms() {
		return numberOfRooms;
	}


	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + levelRequirement;
		result = prime * result + numberOfRooms;
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
		Dungeons other = (Dungeons) obj;
		if (id != other.id)
			return false;
		if (levelRequirement != other.levelRequirement)
			return false;
		if (numberOfRooms != other.numberOfRooms)
			return false;
		if (timeLimit != other.timeLimit)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Dungeons [id=" + id + ", levelRequirement=" + levelRequirement
				+ ", timeLimit=" + timeLimit + ", numberOfRooms="
				+ numberOfRooms + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user (" +
				" id int," +
				" level_requirement int," +
				" time_limit int," +
				" number_of_rooms int," +
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
		indexes.add("create index level_requirement on dungeons(level_requirement);");
		return indexes;
	}
	

	
	
	
	
	
}
