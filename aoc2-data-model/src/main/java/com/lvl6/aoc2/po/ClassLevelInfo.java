package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class ClassLevelInfo extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	//we'll set this manually
	@Column(name="class_type")
	protected int classType = 0;
	
	@Column(name="lvl")
	protected int lvl = 0;
	
	@Column(name="max_hp")
	protected int maxHp = 0;
	
	@Column(name="max_mana")
	protected int maxMana = 0;
	
	//exp required to level up
	@Column(name="max_exp")
	protected int maxExp = 0;
	
	@Column(name="attack")
	protected int attack = 0;
	
	@Column(name="defense")
	protected int defense = 0;
	
	

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public int getClassType() {
		return classType;
	}


	public void setClassType(int classType) {
		this.classType = classType;
	}


	public int getLvl() {
		return lvl;
	}


	public void setLvl(int lvl) {
		this.lvl = lvl;
	}


	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}


	public int getMaxMana() {
		return maxMana;
	}


	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}


	public int getMaxExp() {
		return maxExp;
	}


	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
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


	@Override
	public String toString() {
		return "ClassLevelInfo [id=" + id + ", classType=" + classType
				+ ", lvl=" + lvl + ", maxHp=" + maxHp + ", maxMana=" + maxMana
				+ ", maxExp=" + maxExp + ", attack=" + attack + ", defense="
				+ defense + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" class_type int," +
				" lvl int," +
				" max_hp int," +
				" max_mana int," +
				" max_exp int," +
				" attack int," +
				" defense int," +
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
		indexes.add("create index class_level_info_class_type_index "+tableName()+" class_level_info (class_type);");
		indexes.add("create index class_level_info_lvl_index "+tableName()+" class_level_info (lvl);");
		return indexes;
	}
	
}
