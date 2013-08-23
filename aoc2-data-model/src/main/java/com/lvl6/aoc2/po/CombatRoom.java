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
	@Column(name="type")
	protected int type = 1;
	
	//if this room comes first, second, ... in this dungeon
	@Column(name="ordering")
	protected int ordering = 1;
	
	@Column(name="lvl_required")
	protected int lvlRequired = 0;
	
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


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public int getOrdering() {
		return ordering;
	}


	public void setOrdering(int ordering) {
		this.ordering = ordering;
	}


	public int getLvlRequired() {
		return lvlRequired;
	}


	public void setLvlRequired(int lvlRequired) {
		this.lvlRequired = lvlRequired;
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
	public String toString() {
		return "CombatRoom [id=" + id + ", type=" + type + ", ordering="
				+ ordering + ", lvlRequired=" + lvlRequired + ", name=" + name
				+ ", timeMillisOne=" + timeMillisOne + ", timeMillisTwo="
				+ timeMillisTwo + ", timeMillisThree=" + timeMillisThree + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" type int," +
				" ordering int," +
				" lvl_required int," +
				" name varchar," +
				" time_milllis_one int," +
				" time_millis_two int," +
				" time_millis_three int," +
				" num_rooms int," +
				" primary key (id))" +
				" with compact storage;";
	}
	
	
	@Override
	public Set<String> getTableUpdateStatements() {
		Set<String> indexes = new HashSet<String>();
		
		return indexes;
	}
	
/*	
	@Override
	public Set<String> getIndexCreateStatements() {
		Set<String> indexes = new HashSet<String>();
		indexes.add("create index combat_room_type_index "+tableName()+" (type);");
		
		return indexes;
	}*/
	
}
