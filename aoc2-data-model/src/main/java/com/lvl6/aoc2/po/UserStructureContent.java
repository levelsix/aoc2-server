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

	@Column(name="queue_time")
	protected Date queueTime = new Date();

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


	public Date getQueueTime() {
		return queueTime;
	}


	public void setQueueTime(Date queueTime) {
		this.queueTime = queueTime;
	}


	public Date getStartTime() {
		return startTime;
	}


	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contentId == null) ? 0 : contentId.hashCode());
		result = prime * result + contentType;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((queueTime == null) ? 0 : queueTime.hashCode());
		result = prime * result
				+ ((startTime == null) ? 0 : startTime.hashCode());
		result = prime * result
				+ ((userStructureId == null) ? 0 : userStructureId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserStructureContent other = (UserStructureContent) obj;
		if (contentId == null) {
			if (other.contentId != null)
				return false;
		} else if (!contentId.equals(other.contentId))
			return false;
		if (contentType != other.contentType)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (queueTime == null) {
			if (other.queueTime != null)
				return false;
		} else if (!queueTime.equals(other.queueTime))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		if (userStructureId == null) {
			if (other.userStructureId != null)
				return false;
		} else if (!userStructureId.equals(other.userStructureId))
			return false;
		return true;
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
				" queue_time timestamp," +
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
