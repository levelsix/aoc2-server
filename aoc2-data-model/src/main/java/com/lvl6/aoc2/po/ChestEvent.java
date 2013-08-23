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
	
	@Column(name="chest_name")
	protected String chestName = "";
	

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



	public String getChestName() {
		return chestName;
	}


	public void setChestName(String chestName) {
		this.chestName = chestName;
	}

	

	@Override
	public String toString() {
		return "ChestEvent [id=" + id + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", eventName=" + eventName
				+ ", chestName=" + chestName + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table ChestEvent (" +
				" id uuid," +
				" start_time timestamp," +
				" end_time timestamp," +
				" event_name varchar," +
				" chest_name varchar," +
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
		indexes.add("create index ChestEvent_chest_name_index on ChestEvent (chest_name);");
		return indexes;
	}
	
}
