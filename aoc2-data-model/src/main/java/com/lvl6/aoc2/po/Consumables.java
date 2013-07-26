package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Consumables extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="consumable_name")
	protected String consumableName = "";
	
	@Column(name="functionality_type")
	protected int functionalityType = 0;
	
	@Column(name="functionality_constant")
	protected int functionalityConstant = 0;
	
	@Column(name="cost")
	protected int cost = 0;
	
	@Column(name="limit")
	protected int limit = 0;
	
	@Column(name="create_time_base")
	protected int createTimeBase = 0;

	@Column(name="speedup_base")
	protected int speedupBase = 0;
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getConsumableName() {
		return consumableName;
	}
	public void setConsumableName(String consumableName) {
		this.consumableName = consumableName;
	}
	public int getFunctionalityType() {
		return functionalityType;
	}
	public void setFunctionalityType(int functionalityType) {
		this.functionalityType = functionalityType;
	}
	public int getFunctionalityConstant() {
		return functionalityConstant;
	}
	public void setFunctionalityConstant(int functionalityConstant) {
		this.functionalityConstant = functionalityConstant;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getCreateTime() {
		return createTimeBase;
	}
	public void setCreateTime(int createTimeBase) {
		this.createTimeBase = createTimeBase;
	}
	public int getSpeedupBase() {
		return speedupBase;
	}
	public void setSpeedupBase(int speedupBase) {
		this.speedupBase = speedupBase;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((consumableName == null) ? 0 : consumableName.hashCode());
		result = prime * result + cost;
		result = prime * result + createTimeBase;
		result = prime * result + functionalityConstant;
		result = prime * result + functionalityType;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + limit;
		result = prime * result + speedupBase;
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
		Consumables other = (Consumables) obj;
		if (consumableName == null) {
			if (other.consumableName != null)
				return false;
		} else if (!consumableName.equals(other.consumableName))
			return false;
		if (cost != other.cost)
			return false;
		if (createTimeBase != other.createTimeBase)
			return false;
		if (functionalityConstant != other.functionalityConstant)
			return false;
		if (functionalityType != other.functionalityType)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (limit != other.limit)
			return false;
		if (speedupBase != other.speedupBase)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Consumables [id=" + id + ", consumableName=" + consumableName
				+ ", functionalityType=" + functionalityType
				+ ", functionalityConstant=" + functionalityConstant
				+ ", cost=" + cost + ", limit=" + limit + ", createTimeBase="
				+ createTimeBase + ", speedupBase=" + speedupBase + "]";
	}
	
	
	@Override
	public String getTableCreateStatement() {
		return "create table consumable (" +
				" uuid int," +
				" consumable_name varchar," +
				" functionality_type int," +
				" functionality_constant int," +
				" cost int," +
				" limit int," +
				" create_time_base int," +
				" speedup_base int," +
				" primary key (id))" +
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
		indexes.add("create index functionality_type_index on consumables (functionality_type);");
		indexes.add("create index consumable_name_index on user (consumable_name);");
		return indexes;
	}
	

	
	
	
	
	
}
