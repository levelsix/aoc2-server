package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Monster extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="name")
	protected String name = "";
	
	@Column(name="is_boss")
	protected boolean isBoss = false;
	
	@Column(name="max_hp")
	protected int maxHp = 0;
	
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
	
	@Column(name="exp_reward")
	protected int expReward = 0;


	

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isBoss() {
		return isBoss;
	}


	public void setBoss(boolean isBoss) {
		this.isBoss = isBoss;
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


	public void setType(int monsterType) {
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


	public int getExpReward() {
		return expReward;
	}


	public void setExpReward(int expReward) {
		this.expReward = expReward;
	}



	@Override
	public String toString() {
		return "Monster [id=" + id + ", name=" + name + ", isBoss=" + isBoss
				+ ", maxHp=" + maxHp + ", maxMana=" + maxMana + ", attack="
				+ attack + ", defense=" + defense + ", monsterType="
				+ monsterType + ", color=" + color + ", size=" + size
				+ ", expReward=" + expReward + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table monster (" +
				" id udid," +
				" name varchar," +
				" is_boss boolean," +
				" max_hp int," +
				" max_mana int," +
				" attack int," +
				" defense int," +
				" monster_type int," +
				" color int," +
				" size int," +
				" exp_reward int," +
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
		indexes.add("create index monster_name_index on monster (name);");
		indexes.add("create index monster_is_boss_index on monster (is_boss);");
		indexes.add("create index monster_monster_type_index on monster (monster_type)");
		return indexes;
	}
	
	
	
}
