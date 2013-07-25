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
	
	@Column(name="structure_id")
	protected UUID structureId = UUID.randomUUID();
	
	@Column(name="x_coordinate")
	protected int xCoordinate = 0;
	
	@Column(name="y_coordinate")
	protected int yCoordinate = 0;

	@Column(name="last_collect_time")
	protected Date lastCollectTime = new Date();

	@Column(name="purchase_time")
	protected Date purchaseTime = new Date();
	
	@Column(name="last_upgrade_time")
	protected Date lastUpgradeTime = new Date();

	@Column(name="start_upgrade_time")
	protected Date startUpgradeTime = new Date();

	@Column(name="is_upgrading")
	protected int isUpgrading = 0;


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


	public UUID getStructureId() {
		return structureId;
	}


	public void setStructureId(UUID structureId) {
		this.structureId = structureId;
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


	public Date getLastUpgradeTime() {
		return lastUpgradeTime;
	}


	public void setLastUpgradeTime(Date lastUpgradeTime) {
		this.lastUpgradeTime = lastUpgradeTime;
	}


	public Date getStartUpgradeTime() {
		return startUpgradeTime;
	}


	public void setStartUpgradeTime(Date startUpgradeTime) {
		this.startUpgradeTime = startUpgradeTime;
	}


	public int getIsUpgrading() {
		return isUpgrading;
	}


	public void setIsUpgrading(int isUpgrading) {
		this.isUpgrading = isUpgrading;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + isUpgrading;
		result = prime * result
				+ ((lastCollectTime == null) ? 0 : lastCollectTime.hashCode());
		result = prime * result
				+ ((lastUpgradeTime == null) ? 0 : lastUpgradeTime.hashCode());
		result = prime * result
				+ ((purchaseTime == null) ? 0 : purchaseTime.hashCode());
		result = prime
				* result
				+ ((startUpgradeTime == null) ? 0 : startUpgradeTime.hashCode());
		result = prime * result
				+ ((structureId == null) ? 0 : structureId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + xCoordinate;
		result = prime * result + yCoordinate;
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
		UserStructure other = (UserStructure) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isUpgrading != other.isUpgrading)
			return false;
		if (lastCollectTime == null) {
			if (other.lastCollectTime != null)
				return false;
		} else if (!lastCollectTime.equals(other.lastCollectTime))
			return false;
		if (lastUpgradeTime == null) {
			if (other.lastUpgradeTime != null)
				return false;
		} else if (!lastUpgradeTime.equals(other.lastUpgradeTime))
			return false;
		if (purchaseTime == null) {
			if (other.purchaseTime != null)
				return false;
		} else if (!purchaseTime.equals(other.purchaseTime))
			return false;
		if (startUpgradeTime == null) {
			if (other.startUpgradeTime != null)
				return false;
		} else if (!startUpgradeTime.equals(other.startUpgradeTime))
			return false;
		if (structureId == null) {
			if (other.structureId != null)
				return false;
		} else if (!structureId.equals(other.structureId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (xCoordinate != other.xCoordinate)
			return false;
		if (yCoordinate != other.yCoordinate)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "UserStructure [id=" + id + ", userId=" + userId
				+ ", structureId=" + structureId + ", xCoordinate="
				+ xCoordinate + ", yCoordinate=" + yCoordinate
				+ ", lastCollectTime=" + lastCollectTime + ", purchaseTime="
				+ purchaseTime + ", lastUpgradeTime=" + lastUpgradeTime
				+ ", startUpgradeTime=" + startUpgradeTime + ", isUpgrading="
				+ isUpgrading + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table userStructure (" +
				" id uuid," +
				" user_id uuid," +
				" structure_id uuid," +
				" x_coordinate int," +
				" y_coordinate int," +
				" last_collect_time timestamp," +
				" purchase_time timestamp," +
				" last_upgrade_time timestamp," +
				" start_upgrade_time timestamp," +
				" is_upgrading int," +
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
		indexes.add("create index is_upgrading_index on userStructure (is_upgrading);");
		indexes.add("create index last_collect_time_index on userStructure (last_collect_time);");
		indexes.add("create index user_id_index on userStructure (user_id);");
		indexes.add("create index structure_id_index on userStructure (structure_id);");
		return indexes;
	}
	
	
	
	
	
}
