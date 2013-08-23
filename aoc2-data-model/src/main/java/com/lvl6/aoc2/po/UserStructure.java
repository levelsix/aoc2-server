package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserStructure extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = UUID.randomUUID();
	
	//refers to type of structure, not random generated uuid row key
	@Column(name="name")
	protected String name = "";
	
	@Column(name="lvl")
	protected int lvl = 0;
	
	@Column(name="x_coordinate")
	protected int xCoordinate = 0;
	
	@Column(name="y_coordinate")
	protected int yCoordinate = 0;

	@Column(name="last_collect_time")
	protected Date lastCollectTime = new Date();

	@Column(name="purchase_time")
	protected Date purchaseTime = new Date();

	@Column(name="start_upgrade_time")
	protected Date startUpgradeTime = new Date();

	@Column(name="is_finished_constructing")
	protected boolean isFinishedConstructing = false;

	//for tracking purposes
	@Column(name="level_of_user_when_upgrading")
	protected int levelOfUserWhenUpgrading = 0;
	
	//since user can build more than one of any building,
	//this keeps track of how many of the same building
	//the user has
	@Column(name="nth_copy")
	protected int nthCopy = 1;
	
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




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLvl() {
		return lvl;
	}


	public void setLvl(int lvl) {
		this.lvl = lvl;
	}


	public int getxCoordinate() {
		return xCoordinate;
	}


	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}


	public int getyCoordinate() {
		return yCoordinate;
	}


	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}


	public Date getLastCollectTime() {
		return lastCollectTime;
	}


	public void setLastCollectTime(Date lastCollectTime) {
		this.lastCollectTime = lastCollectTime;
	}


	public Date getPurchaseTime() {
		return purchaseTime;
	}


	public void setPurchaseTime(Date purchaseTime) {
		this.purchaseTime = purchaseTime;
	}


	public Date getStartUpgradeTime() {
		return startUpgradeTime;
	}


	public void setStartUpgradeTime(Date startUpgradeTime) {
		this.startUpgradeTime = startUpgradeTime;
	}

	
	public boolean isFinishedConstructing() {
		return isFinishedConstructing;
	}


	public void setFinishedConstructing(boolean isFinishedConstructing) {
		this.isFinishedConstructing = isFinishedConstructing;
	}


	public int getLevelOfUserWhenUpgrading() {
		return levelOfUserWhenUpgrading;
	}


	public void setLevelOfUserWhenUpgrading(int levelOfUserWhenUpgrading) {
		this.levelOfUserWhenUpgrading = levelOfUserWhenUpgrading;
	}


	public int getNthCopy() {
		return nthCopy;
	}


	public void setNthCopy(int nthCopy) {
		this.nthCopy = nthCopy;
	}



	@Override
	public String toString() {
		return "UserStructure [id=" + id + ", userId=" + userId + ", name="
				+ name + ", lvl=" + lvl + ", xCoordinate=" + xCoordinate
				+ ", yCoordinate=" + yCoordinate + ", lastCollectTime="
				+ lastCollectTime + ", purchaseTime=" + purchaseTime
				+ ", startUpgradeTime=" + startUpgradeTime
				+ ", isFinishedConstructing=" + isFinishedConstructing
				+ ", levelOfUserWhenUpgrading=" + levelOfUserWhenUpgrading
				+ "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" user_id uuid," +
				" name varchar," +
				" lvl int," +
				" x_coordinate int," +
				" y_coordinate int," +
				" last_collect_time timestamp," +
				" purchase_time timestamp," +
				" start_upgrade_time timestamp," +
				" is_finished_constructing boolean," +
				" level_of_user_when_upgrading int," +
				" nth_copy int," +
				" primary key(id))" +
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
<<<<<<< HEAD
		indexes.add("create user_structure_index_is_upgrading_index "+tableName()+" (is_upgrading);");
		indexes.add("create user_structure_index_last_collect_time_index "+tableName()+" (last_collect_time);");
		indexes.add("create user_structure_index_user_id_index "+tableName()+" (user_id);");
		indexes.add("create user_structure_index_structure_id_index "+tableName()+" (structure_id);");
=======
		indexes.add("create index user_structure_user_id_index on user_structure (user_id);");
		indexes.add("create index user_structure_structure_name_index on user_structure (structure_name);");
		indexes.add("create index user_structure_last_collect_time_index on user_structure (last_collect_time);");
		indexes.add("create index user_structure_purchase_time_index on user_structure (purchase_time);");
		indexes.add("create index user_structure_start_upgrade_time_index on user_structure (start_upgrade_time);");
		indexes.add("create index user_structure_is_finished_constructing_index on user_structure (is_finished_constructing);");
>>>>>>> 62d75ceb56adbd358ff3954dbdd8c79911563c5e
		return indexes;
	}*/
	
	
	
	
	
}
