package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserEquip extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = null;
	
	//the 'equip_id' column in equipment table, not the 'id' column
	@Column(name="equip_id")
	protected UUID equipId = null;
	
	@Column(name="equip_level")
	protected int equipLevel = 0;
	
	@Column(name="durability")
	protected double durability = 0.0;
	
	@Column(name="equipped")
	protected boolean equipped = false;
	
	@Column(name="time_acquired")
	protected Date timeAcquired = new Date();
	
	@Column(name="level_of_user_when_acquired")
	protected int levelOfUserWhenAcquired = 0;
	
	@Column(name="dungeon_room_or_chest_acquired_from")
	protected String dungeonRoomOrChestAcquiredFrom = "";



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


	public int getEquipLevel() {
		return equipLevel;
	}


	public void setEquipLevel(int equipLevel) {
		this.equipLevel = equipLevel;
	}


	public double getDurability() {
		return durability;
	}


	public void setDurability(double durability) {
		this.durability = durability;
	}


	public boolean isEquipped() {
		return equipped;
	}


	public void setEquipped(boolean equipped) {
		this.equipped = equipped;
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


	public String getDungeonRoomOrChestAcquiredFrom() {
		return dungeonRoomOrChestAcquiredFrom;
	}


	public void setDungeonRoomOrChestAcquiredFrom(
			String dungeonRoomOrChestAcquiredFrom) {
		this.dungeonRoomOrChestAcquiredFrom = dungeonRoomOrChestAcquiredFrom;
	}
	
	


	@Override
	public String toString() {
		return "UserEquip [id=" + id + ", userId=" + userId + ", equipId="
				+ equipId + ", equipLevel=" + equipLevel + ", durability="
				+ durability + ", equipped=" + equipped + ", timeAcquired="
				+ timeAcquired + ", levelOfUserWhenAcquired="
				+ levelOfUserWhenAcquired + ", dungeonRoomOrChestAcquiredFrom="
				+ dungeonRoomOrChestAcquiredFrom + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" user_id uuid," +
				" equip_id uuid," +
				" equip_level int," +
				" durability double," +
				" equipped boolean," +
				" time_acquired timestamp," +
				" level_of_user_when_acquired int," +
				" dungeon_room_or_chest_acquired_from varchar," +
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
		indexes.add("create index user_equip_user_id_index "+tableName()+" user_equip (user_id);");
		indexes.add("create index user_equip_equip_id_index "+tableName()+" user_equip (equip_id);");
		indexes.add("create index user_equip_equip_level_index "+tableName()+" user_equip (equip_level);");
		indexes.add("create index user_equip_equipped_index "+tableName()+" user_equip (equipped);");
		return indexes;
	}
	
	
}
