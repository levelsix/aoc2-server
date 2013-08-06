package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserStructureContent extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_structure_id")
	protected UUID userStructureId = UUID.randomUUID();
	
	@Column(name="content_type")
	protected int contentType = 0;
	
	@Column(name="content_id")
	protected UUID contentId = null;

	@Column(name="is_queue")
	protected boolean queueTime = true;

	@Column(name="start_time")
	protected Date startTime = new Date();

	
	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getUserStructureId() {
		return userStructureId;
	}


	public void setUserStructureId(UUID userStructureId) {
		this.userStructureId = userStructureId;
	}


	public int getContentType() {
		return contentType;
	}


	public void setContentType(int contentType) {
		this.contentType = contentType;
	}


	public UUID getContentId() {
		return contentId;
	}


	public void setContentId(UUID contentId) {
		this.contentId = contentId;
	}


	public boolean isQueueTime() {
		return queueTime;
	}


	public void setQueueTime(boolean queueTime) {
		this.queueTime = queueTime;
	}


	public Date getStartTime() {
		return startTime;
	}


	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}




	@Override
	public String toString() {
		return "UserStructureContent [id=" + id + ", userStructureId="
				+ userStructureId + ", contentType=" + contentType
				+ ", contentId=" + contentId + ", queueTime=" + queueTime
				+ ", startTime=" + startTime + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user_structure_content (" +
				" id uuid," +
				" user_structure_id uuid," +
				" content_type int," +
				" content_id uuid," +
				" is_queue boolean," +
				" start_time timestamp," +
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
		indexes.add("create index user_structure_content_content_type_index on user_structure_content (content_type);");
		indexes.add("create index user_structure_content_user_structure_id_index on user_structure_content (user_structure_id);");
		return indexes;
	}
	
	
	
	
	
}
