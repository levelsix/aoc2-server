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
	
	@Column(name="monster_id")
	protected UUID monsterId = UUID.randomUUID();;
	
	@Column(name="equip_id")
	protected UUID equipId = UUID.randomUUID();;
	
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


	public UUID getMonsterId() {
		return monsterId;
	}


	public void setMonsterId(UUID monsterId) {
		this.monsterId = monsterId;
	}


	public UUID getEquipId() {
		return equipId;
	}


	public void setEquipId(UUID equipId) {
		this.equipId = equipId;
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
		return "MonsterPersistentDrop [id=" + id + ", monsterId=" + monsterId
				+ ", equipId=" + equipId + ", equipDropRate=" + equipDropRate
				+ ", minGold=" + minGold + ", maxGold=" + maxGold
				+ ", minTonic=" + minTonic + ", maxTonic=" + maxTonic + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" monster_id uuid," +
				" equip_id uuid," +
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
	
	
/*	@Override
	public Set<String> getIndexCreateStatements() {
		Set<String> indexes = new HashSet<String>();
		indexes.add("create index monster_persistent_drop_monster_id_index "+tableName()+" (monster_id);");
		//indexes.add("create index monster_persistent_drop_equip_id_index on monster_persistent_drop (equip_id);");
		return indexes;
	}*/
	
}
