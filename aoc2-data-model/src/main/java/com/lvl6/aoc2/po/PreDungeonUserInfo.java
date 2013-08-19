package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class PreDungeonUserInfo extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = UUID.randomUUID();
	
	@Column(name="health")
	protected int health = 0;
	
	@Column(name="mana")
	protected int mana = 0;
	
	@Column(name="combat_room_name")
	protected String combatRoomName = "";
	
	@Column(name="level_of_user")
	protected int levelOfUser = 0;

	@Column(name="time_user_enters_dungeon")
	protected Date timeUserEntersDungeon = new Date();
	

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


	public String getCombatRoomName() {
		return combatRoomName;
	}


	public void setCombatRoomName(String combatRoomName) {
		this.combatRoomName = combatRoomName;
	}


	public int getLevelOfUser() {
		return levelOfUser;
	}


	public void setLevelOfUser(int levelOfUser) {
		this.levelOfUser = levelOfUser;
	}


	public Date getTimeUserEntersDungeon() {
		return timeUserEntersDungeon;
	}


	public void setTimeUserEntersDungeon(Date timeUserEntersDungeon) {
		this.timeUserEntersDungeon = timeUserEntersDungeon;
	}


	@Override
	public String toString() {
		return "PreDungeonUserInfo [id=" + id + ", userId=" + userId
				+ ", health=" + health + ", mana=" + mana + ", combatRoomName="
				+ combatRoomName + ", levelOfUser=" + levelOfUser
				+ ", timeUserEntersDungeon=" + timeUserEntersDungeon + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create pre_dungeon_user_info (" +
				" id uuid," +
				" user_id uuid," +
				" health int," +
				" mana int," +
				" combat_room_name varchar," +
				" level_of_user int," +
				" time_user_enters_dungeon timestamp," +
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
		indexes.add("create index room_reward_chest_id_index on room_reward (chest_id);");
		indexes.add("create index room_reward_equip_id_index on room_reward (equip_id);");
		return indexes;
	}
	
	
}
