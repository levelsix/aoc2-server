package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Boss extends BasePersistentObject{

	@Id
	protected int id = 0;
	
	@Column(name="boss_name")
	protected String boss_name = "";
	
	@Column(name="health")
	protected int health = 0;
	
	@Column(name="mana")
	protected int mana = 0;
	
	@Column(name="experience")
	protected int experience = 0;

	@Column(name="dungeon_id")
	protected int dungeonId = 0;
	
	//in minutes?
	@Column(name="time_limit")
	protected int timeLimit = 0;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBoss_name() {
		return boss_name;
	}


	public void setBoss_name(String boss_name) {
		this.boss_name = boss_name;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getMana() {
		return mana;
	}


	public void setMana(int mana) {
		this.mana = mana;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public int getDungeonId() {
		return dungeonId;
	}


	public void setDungeonId(int dungeonId) {
		this.dungeonId = dungeonId;
	}


	public int getTimeLimit() {
		return timeLimit;
	}


	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((boss_name == null) ? 0 : boss_name.hashCode());
		result = prime * result + dungeonId;
		result = prime * result + experience;
		result = prime * result + health;
		result = prime * result + id;
		result = prime * result + mana;
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
		Boss other = (Boss) obj;
		if (boss_name == null) {
			if (other.boss_name != null)
				return false;
		} else if (!boss_name.equals(other.boss_name))
			return false;
		if (dungeonId != other.dungeonId)
			return false;
		if (experience != other.experience)
			return false;
		if (health != other.health)
			return false;
		if (id != other.id)
			return false;
		if (mana != other.mana)
			return false;
		if (timeLimit != other.timeLimit)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Boss [id=" + id + ", boss_name=" + boss_name + ", health="
				+ health + ", mana=" + mana + ", experience=" + experience
				+ ", dungeonId=" + dungeonId + ", timeLimit=" + timeLimit + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table boss (" +
				" id int," +
				" boss_name varchar," +
				" health int," +
				" mana int," +
				" experience int," +
				" dungeon_id int," +
				" time_limit int," +
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
		indexes.add("create index dungeon_id_index on boss (dungeon_id);");
		return indexes;
	}
	

	
	
	
	
	
}
