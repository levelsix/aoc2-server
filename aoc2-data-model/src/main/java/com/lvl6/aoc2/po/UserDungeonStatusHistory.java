package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserDungeonStatusHistory extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = null;
	
	//the 'equip_id' column in equipment table, not the 'id' column
	@Column(name="hp")
	protected int hp = 0;
	
	@Column(name="mana")
	protected int mana = 0;
	
	@Column(name="actions_performed")
	protected int actionsPerformed = 0;
	
	@Column(name="current_time")
	protected Date currentTime = new Date();
	
	@Column(name="dungeon_room_name")
	protected String dungeonRoomName = "";

//	@Column(name="monsters_remaining")
//	protected int monstersRemaining = 0;
//	
//	
//
//	public int getMonstersRemaining() {
//		return monstersRemaining;
//	}
//
//
//	public void setMonstersRemaining(int monstersRemaining) {
//		this.monstersRemaining = monstersRemaining;
//	}
//

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


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMana() {
		return mana;
	}


	public void setMana(int mana) {
		this.mana = mana;
	}


	public int getActionsPerformed() {
		return actionsPerformed;
	}


	public void setActionsPerformed(int actionsPerformed) {
		this.actionsPerformed = actionsPerformed;
	}


	public Date getCurrentTime() {
		return currentTime;
	}


	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}


	public String getDungeonRoomName() {
		return dungeonRoomName;
	}


	public void setDungeonRoomName(String dungeonRoomName) {
		this.dungeonRoomName = dungeonRoomName;
	}



	@Override
	public String toString() {
		return "UserDungeonStatusHistory [id=" + id + ", userId=" + userId
				+ ", hp=" + hp + ", mana=" + mana + ", actionsPerformed="
				+ actionsPerformed + ", currentTime=" + currentTime
				+ ", dungeonRoomName=" + dungeonRoomName + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user_dungeon_status_history (" +
				" id uuid," +
				" user_id uuid," +
				" hp int," +
				" mana int," +
				" actionsPerformed int," +
				" currentTime timestamp," +
				" dungeon_room_name varchar," +
				" monsters_remaining int," +
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
		indexes.add("create index user_dungeon_status_history_user_id_index on user_dungeon_status_history (user_id);");
		indexes.add("create index user_dungeon_status_history_dungeon_room_name_index on user_dungeon_status_history (dungeon_room_name);");
	
		return indexes;
	}
	
	
}