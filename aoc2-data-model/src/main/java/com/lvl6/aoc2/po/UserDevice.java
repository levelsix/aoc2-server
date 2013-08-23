package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserDevice extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = null;
	
	@Column(name="udid")
	protected String udid = null;

	@Column(name="device_id")
	protected String deviceId = null;
	
	@Column(name="date_linked")
	protected Date dateLinked = new Date();
	
	@Column(name="last_login")
	protected Date lastLogin = null;

	@Column(name="last_logout")
	protected Date lastLogout = null;



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


	public String getUdid() {
		return udid;
	}


	public void setUdid(String udid) {
		this.udid = udid;
	}


	public String getDeviceId() {
		return deviceId;
	}


	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}


	public Date getDateLinked() {
		return dateLinked;
	}


	public void setDateLinked(Date dateLinked) {
		this.dateLinked = dateLinked;
	}


	public Date getLastLogin() {
		return lastLogin;
	}


	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}


	public Date getLastLogout() {
		return lastLogout;
	}


	public void setLastLogout(Date lastLogout) {
		this.lastLogout = lastLogout;
	}


	@Override
	public String toString() {
		return "UserDevice [id=" + id + ", userId=" + userId + ", udid=" + udid
				+ ", deviceId=" + deviceId + ", dateLinked=" + dateLinked
				+ ", lastLogin=" + lastLogin + ", lastLogout=" + lastLogout
				+ "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user_device (" +
				" id uuid," +
				" user_id uuid," +
				" udid varchar," +
				" device_id varchar," +
				" date_linked timestamp," +
				" last_login timestamp," +
				" last_logout timestamp," +
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
		indexes.add("create index user_device_user_id_index on user_device (user_id);");
		indexes.add("create index user_device_udid_index on user_device (udid);");
		indexes.add("create index user_device_last_login_index on user_device (last_login);");
		indexes.add("create index user_device_last_logout_index on user_device (last_logout);");
		return indexes;
	}
	
	
	
	
	
}
