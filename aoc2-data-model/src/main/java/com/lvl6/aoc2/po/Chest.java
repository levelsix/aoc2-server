package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Chest extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="chest_name")
	protected String chestName = "";
	
	@Column(name="chest_drop_rate")
	protected double chestDropRate = 0.0d;
	
	@Column(name="equip_id")
	protected UUID equipId = UUID.randomUUID();
	
	@Column(name="equip_weight")
	protected double equipWeight = 0.0;
	
	@Column(name="chest_type")
	protected int chestType = 0;
	
	@Column(name="gems_required_to_open")
	protected int gemsRequiredToOpen = 0;
	
	@Column(name="keys_required_to_open")
	protected int keysRequiredToOpen = 0;
	
	

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public double getChestDropRate() {
		return chestDropRate;
	}


	public void setChestDropRate(double chestDropRate) {
		this.chestDropRate = chestDropRate;
	}


	public UUID getEquipId() {
		return equipId;
	}


	public void setEquipId(UUID equipId) {
		this.equipId = equipId;
	}


	public double getEquipWeight() {
		return equipWeight;
	}


	public void setEquipWeight(double equipWeight) {
		this.equipWeight = equipWeight;
	}
	

	public int getChestType() {
		return chestType;
	}


	public void setChestType(int chestType) {
		this.chestType = chestType;
	}


	public int getGemsRequiredToOpen() {
		return gemsRequiredToOpen;
	}


	public void setGemsRequiredToOpen(int gemsRequiredToOpen) {
		this.gemsRequiredToOpen = gemsRequiredToOpen;
	}
	
	public int getKeysRequiredToOpen() {
		return keysRequiredToOpen;
	}


	public void setKeysRequiredToOpen(int keysRequiredToOpen) {
		this.keysRequiredToOpen = keysRequiredToOpen;
	}


	public String getChestName() {
		return chestName;
	}


	public void setChestName(String chestName) {
		this.chestName = chestName;
	}



	@Override
	public String toString() {
		return "Chest [id=" + id + ", chestName=" + chestName
				+ ", chestDropRate=" + chestDropRate + ", equipId=" + equipId
				+ ", equipWeight=" + equipWeight + ", chestType=" + chestType
				+ ", gemsRequiredToOpen=" + gemsRequiredToOpen
				+ ", keysRequiredToOpen=" + keysRequiredToOpen + "]";
	}


/*	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" chest_name varchar," +
				" chest_drop_rate double," +
				" equip_id uuid," +
				" equip_weight double," +
				" chest_type int," +
				" gems_required_to_open int," +
				" keys_required_to_open int," +
				" primary key(id))" +
				" with compact storage;";
	}*/
	
	
	@Override
	public Set<String> getTableUpdateStatements() {
		Set<String> indexes = new HashSet<String>();
		
		return indexes;
	}
	
/*	
	@Override
	public Set<String> getIndexCreateStatements() {
		Set<String> indexes = new HashSet<String>();
		indexes.add("create index chest_chest_name_index on chest (chest_name);");
		indexes.add("create index chest_type_index on chest (chest_type);");
		indexes.add("create index chest_equip_id_index on chest (equip_id);");
		return indexes;
	}
	
	*/
	
	
	
}
