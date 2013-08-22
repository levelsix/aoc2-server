package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class ChestEvent extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="start_time")
	protected Date startTime = new Date();
	
	@Column(name="end_time")
	protected Date endTime = new Date();
	
	@Column(name="event_name")
	protected String eventName = "";
	
	@Column(name="chest_id")
	protected UUID chestId = null;
	

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public Date getStartTime() {
		return startTime;
	}


	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	public Date getEndTime() {
		return endTime;
	}


	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public UUID getChestId() {
		return chestId;
	}


	public void setChestId(UUID chestId) {
		this.chestId = chestId;
	}


	
	@Override
	public String toString() {
		return "ChestEvent [id=" + id + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", eventName=" + eventName
				+ ", chestId=" + chestId + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" start_time timestamp," +
				" end_time timestamp," +
				" event_name varchar," +
				" chest_id uuid," +
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
		indexes.add("create index ChestEvent_type_index "+tableName()+" ChestEvent (type);");
		indexes.add("create index ChestEvent_rarity_index "+tableName()+" ChestEvent (rarity);");
		indexes.add("create index ChestEvent_class_required_index "+tableName()+" ChestEvent (class_required);");
		indexes.add("create index ChestEvent_lvl_required_index "+tableName()+" ChestEvent (lvl_required);");
		indexes.add("create index ChestEvent_equip_id_index "+tableName()+" ChestEvent (equip_id);");
		return indexes;
	}
	
}
