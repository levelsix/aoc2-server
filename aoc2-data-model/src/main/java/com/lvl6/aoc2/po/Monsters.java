package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Monsters extends BasePersistentObject{

	@Id
	protected int id = 0;
	
	@Column(name="monster_name")
	protected String monsterName = "";
	
	@Column(name="max_health")
	protected int maxHealth = 0;
	
	@Column(name="max_mana")
	protected int maxMana = 0;
	
	@Column(name="attack")
	protected int attack = 0;
	
	@Column(name="defense")
	protected int defense = 0;
	
	@Column(name="monster_type")
	protected int monsterType = 0;
	
	@Column(name="color")
	protected int color = 0;
	
	@Column(name="size")
	protected int size = 0;
	
	@Column(name="experience")
	protected int experience = 0;

	@Column(name="room_id")
	protected int roomId = 0;
	
	//in minutes?
	@Column(name="is_boss")
	protected int isBoss = 0;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMonsterName() {
		return monsterName;
	}


	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}


	public int getMaxHealth() {
		return maxHealth;
	}


	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}


	public int getMaxMana() {
		return maxMana;
	}


	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getMonsterType() {
		return monsterType;
	}


	public void setMonsterType(int monsterType) {
		this.monsterType = monsterType;
	}


	public int getColor() {
		return color;
	}


	public void setColor(int color) {
		this.color = color;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public int getRoomId() {
		return roomId;
	}


	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}


	public int getIsBoss() {
		return isBoss;
	}


	public void setIsBoss(int isBoss) {
		this.isBoss = isBoss;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attack;
		result = prime * result + isBoss;
		result = prime * result + color;
		result = prime * result + defense;
		result = prime * result + experience;
		result = prime * result + id;
		result = prime * result + maxHealth;
		result = prime * result + maxMana;
		result = prime * result
				+ ((monsterName == null) ? 0 : monsterName.hashCode());
		result = prime * result + monsterType;
		result = prime * result + roomId;
		result = prime * result + size;
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
		Monsters other = (Monsters) obj;
		if (attack != other.attack)
			return false;
		if (isBoss != other.isBoss)
			return false;
		if (color != other.color)
			return false;
		if (defense != other.defense)
			return false;
		if (experience != other.experience)
			return false;
		if (id != other.id)
			return false;
		if (maxHealth != other.maxHealth)
			return false;
		if (maxMana != other.maxMana)
			return false;
		if (monsterName == null) {
			if (other.monsterName != null)
				return false;
		} else if (!monsterName.equals(other.monsterName))
			return false;
		if (monsterType != other.monsterType)
			return false;
		if (roomId != other.roomId)
			return false;
		if (size != other.size)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Monsters [id=" + id + ", monsterName=" + monsterName
				+ ", maxHealth=" + maxHealth + ", maxMana=" + maxMana
				+ ", attack=" + attack + ", defense=" + defense
				+ ", monsterType=" + monsterType + ", color=" + color
				+ ", size=" + size + ", experience=" + experience + ", roomId="
				+ roomId + ", isBoss=" + isBoss + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user (" +
				" id int," +
				" monster_name varchar," +
				" max_health int," +
				" max_mana int," +
				" attack int," +
				" defense int," +
				" monster_type int," +
				" color int," +
				" size int," +
				" experience int," +
				" room_id int," +
				" is_boss int," +
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
		indexes.add("create index room_id_index on monsters (room_id);");
		indexes.add("create index is_boss index on monsters (is_boss);");
		return indexes;
	}
	

	
	
	
	
	
}
