package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class MonsterPersistentDrop extends BasePersistentObject{
	
	//explicit values are useless, I just made random values

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="monster_name")
	protected String monsterName = "";
	
	@Column(name="equip_name")
	protected String equipName = "";
	
	@Column(name="equip_drop_rate")
	protected double equipDropRate = 0.5;
	
	@Column(name="min_gold")
	protected int minGold = 10;
	
	@Column(name="max_gold")
	protected int maxGold = 100;
	
	@Column(name="min_tonic")
	protected int minTonic = 10;
	
	@Column(name="max_tonic")
	protected int maxTonic = 100;


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}



	public String getMonsterName() {
		return monsterName;
	}


	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}


	public String getEquipName() {
		return equipName;
	}


	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}


	public double getEquipDropRate() {
		return equipDropRate;
	}


	public void setEquipDropRate(double equipDropRate) {
		this.equipDropRate = equipDropRate;
	}


	public int getMinGold() {
		return minGold;
	}


	public void setMinGold(int minGold) {
		this.minGold = minGold;
	}


	public int getMaxGold() {
		return maxGold;
	}


	public void setMaxGold(int maxGold) {
		this.maxGold = maxGold;
	}


	public int getMinTonic() {
		return minTonic;
	}


	public void setMinTonic(int minTonic) {
		this.minTonic = minTonic;
	}


	public int getMaxTonic() {
		return maxTonic;
	}


	public void setMaxTonic(int maxTonic) {
		this.maxTonic = maxTonic;
	}



	@Override
	public String toString() {
		return "MonsterPersistentDrop [id=" + id + ", monsterName="
				+ monsterName + ", equipName=" + equipName + ", equipDropRate="
				+ equipDropRate + ", minGold=" + minGold + ", maxGold="
				+ maxGold + ", minTonic=" + minTonic + ", maxTonic=" + maxTonic
				+ "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table monster_persistent_drop (" +
				" id uuid," +
				" monster_name varchar," +
				" equip_name varchar," +
				" equip_drop_rate double," +
				" min_gold int," +
				" max_gold int," +
				" min_tonic int," +
				" max_tonic int," +
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
		indexes.add("create index monster_persistent_drop_monster_name_index on monster_persistent_drop (monster_name);");
		indexes.add("create index monster_persistent_drop_equip_name_index on monster_persistent_drop (equip_name);");

		return indexes;
	}
	
}
