package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserItem extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = null;
	
	@Column(name="name")
	protected String name = "";
	
	@Column(name="time_acquired")
	protected Date timeAcquired = new Date();
	
	@Column(name="level_of_user_when_acquired")
	protected int levelOfUserWhenAcquired = 0;
	
	@Column(name="dungeon_room_acquired_in")
	protected String dungeonRoomAcquiredIn = "";


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


	public Date getTimeAcquired() {
		return timeAcquired;
	}


	public void setTimeAcquired(Date timeAcquired) {
		this.timeAcquired = timeAcquired;
	}


	public int getLevelOfUserWhenAcquired() {
		return levelOfUserWhenAcquired;
	}


	public void setLevelOfUserWhenAcquired(int levelOfUserWhenAcquired) {
		this.levelOfUserWhenAcquired = levelOfUserWhenAcquired;
	}


	public String getDungeonRoomAcquiredIn() {
		return dungeonRoomAcquiredIn;
	}


	public void setDungeonRoomAcquiredIn(String dungeonRoomAcquiredIn) {
		this.dungeonRoomAcquiredIn = dungeonRoomAcquiredIn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "UserItem [id=" + id + ", userId=" + userId + ", name=" + name
				+ ", timeAcquired=" + timeAcquired
				+ ", levelOfUserWhenAcquired=" + levelOfUserWhenAcquired
				+ ", dungeonRoomAcquiredIn=" + dungeonRoomAcquiredIn + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user_item (" +
				" id uuid," +
				" user_id uuid," +
				" name varchar," +
				" time_acquired timestamp," +
				" level_of_user_when_acquired int," +
				" dungeon_room_acquired_in int," +
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
		indexes.add("create index user_item_user_id_index on user_item (user_id);");
		indexes.add("create index user_item_item_id_index on user_item (item_id);");

		return indexes;
	}
	
	
}
