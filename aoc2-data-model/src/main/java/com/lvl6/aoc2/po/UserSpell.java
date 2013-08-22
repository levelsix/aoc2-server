package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserSpell extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = null;
	
	@Column(name="name")
	protected String name = "";
	
	@Column(name="spell_lvl")
	protected int spellLvl = 0;
	
	//begin training
	@Column(name="time_acquired")
	protected Date timeAcquired = new Date();

	@Column(name="is_training")
	protected Boolean isTraining = false;
	
	@Column(name="level_of_user_when_upgrading")
	protected int levelOfUserWhenUpgrading = 0;
	



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


	public int getSpellLvl() {
		return spellLvl;
	}


	public void setSpellLvl(int spellLvl) {
		this.spellLvl = spellLvl;
	}


	public Date getTimeAcquired() {
		return timeAcquired;
	}


	public void setTimeAcquired(Date timeAcquired) {
		this.timeAcquired = timeAcquired;
	}


	public Boolean getIsTraining() {
		return isTraining;
	}


	public void setIsTraining(Boolean isTraining) {
		this.isTraining = isTraining;
	}


	public int getLevelOfUserWhenUpgrading() {
		return levelOfUserWhenUpgrading;
	}


	public void setLevelOfUserWhenUpgrading(int levelOfUserWhenUpgrading) {
		this.levelOfUserWhenUpgrading = levelOfUserWhenUpgrading;
	}



	@Override
	public String toString() {
		return "UserSpell [id=" + id + ", userId=" + userId + ", name=" + name
				+ ", spellLvl=" + spellLvl + ", timeAcquired=" + timeAcquired
				+ ", isTraining=" + isTraining + ", levelOfUserWhenUpgrading="
				+ levelOfUserWhenUpgrading + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" user_id uuid," +
				" name varchar," +
				" spell_lvl int," +
				" time_acquired timestamp," +
				" is_training bool," +
				" level_of_user_when_upgrading int," +
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
		indexes.add("create index user_spell_user_id_index "+tableName()+" user_spell (user_id);");
		indexes.add("create index user_spell_spell_id_index "+tableName()+" user_spell (spell_id);");
		return indexes;
	}
	
	
	
	
	
}
