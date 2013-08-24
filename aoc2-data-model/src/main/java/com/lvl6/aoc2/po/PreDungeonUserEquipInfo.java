package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class PreDungeonUserEquipInfo extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = UUID.randomUUID();
	
	//the 'id' column in equipment table
	@Column(name="equip_id")
	protected UUID equipId = UUID.randomUUID();;
	
	@Column(name="lvl")
	protected int lvl = 0;
	
	@Column(name="durability")
	protected double durability = 0.0;


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getUserId() {
		return userId;
	}


	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public UUID getEquipId() {
		return equipId;
	}


	public void setEquipId(UUID equipId) {
		this.equipId = equipId;
	}


	public int getLvl() {
		return lvl;
	}


	public void setLvl(int lvl) {
		this.lvl = lvl;
	}


	public double getDurability() {
		return durability;
	}


	public void setDurability(double durability) {
		this.durability = durability;
	}


	@Override
	public String toString() {
		return "PreDungeonUserEquipInfo [id=" + id + ", userId=" + userId
				+ ", equipId=" + equipId + ", lvl=" + lvl + ", durability="
				+ durability + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+tableName() +" (" +
				" id uuid," +
				" user_id uuid," +
				" equip_id uuid," +
				" lvl int," +
				" durability double," +
				" primary key(id))" +
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
		indexes.add("create index pre_dungeon_user_equip_info_user_id_index "+tableName()+" (user_id);");
		indexes.add("create index pre_dungeon_user_equip_info_equip_id_index "+tableName()+" (equip_id);");
		return indexes;
	}
	
	*/
}
