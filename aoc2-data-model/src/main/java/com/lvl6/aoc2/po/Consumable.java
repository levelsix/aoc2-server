package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Consumable extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="name")
	protected String name = "";
	
	@Column(name="functionality_type")
	protected int functionalityType = 0;
	
	//(if (Float: < 1) ? percent : flat) 
	@Column(name="functionality_constant")
	protected double functionalityConstant = 0;
	
	@Column(name="cost")
	protected int cost = 0;
	
	@Column(name="cost_resouce_type")
	protected int costResourceType = 0;
	
	@Column(name="limit")
	protected int limit = 0;
	
	@Column(name="create_time_seconds")
	protected int createTimeSeconds = 0;

	@Column(name="base_speedup_cost_seconds")
	protected int baseSpeedupCostSeconds = 0;
	
	
	
	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getFunctionalityType() {
		return functionalityType;
	}


	public void setFunctionalityType(int functionalityType) {
		this.functionalityType = functionalityType;
	}


	public double getFunctionalityConstant() {
		return functionalityConstant;
	}


	public void setFunctionalityConstant(double functionalityConstant) {
		this.functionalityConstant = functionalityConstant;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public int getCostResourceType() {
		return costResourceType;
	}


	public void setCostResourceType(int costResourceType) {
		this.costResourceType = costResourceType;
	}


	public int getLimit() {
		return limit;
	}


	public void setLimit(int limit) {
		this.limit = limit;
	}


	public int getCreateTimeSeconds() {
		return createTimeSeconds;
	}


	public void setCreateTimeSeconds(int createTimeSeconds) {
		this.createTimeSeconds = createTimeSeconds;
	}


	public int getBaseSpeedupCostSeconds() {
		return baseSpeedupCostSeconds;
	}


	public void setBaseSpeedupCostSeconds(int baseSpeedupCostSeconds) {
		this.baseSpeedupCostSeconds = baseSpeedupCostSeconds;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + baseSpeedupCostSeconds;
		result = prime * result + cost;
		result = prime * result + costResourceType;
		result = prime * result + createTimeSeconds;
		long temp;
		temp = Double.doubleToLongBits(functionalityConstant);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + functionalityType;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + limit;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Consumable other = (Consumable) obj;
		if (baseSpeedupCostSeconds != other.baseSpeedupCostSeconds)
			return false;
		if (cost != other.cost)
			return false;
		if (costResourceType != other.costResourceType)
			return false;
		if (createTimeSeconds != other.createTimeSeconds)
			return false;
		if (Double.doubleToLongBits(functionalityConstant) != Double
				.doubleToLongBits(other.functionalityConstant))
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Consumable [id=" + id + ", name=" + name
				+ ", functionalityType=" + functionalityType
				+ ", functionalityConstant=" + functionalityConstant
				+ ", cost=" + cost + ", costResourceType=" + costResourceType
				+ ", limit=" + limit + ", createTimeSeconds="
				+ createTimeSeconds + ", baseSpeedupCostSeconds="
				+ baseSpeedupCostSeconds + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table consumable (" +
				" id uuid," +
				" name varchar," +
				" functionality_type int," +
				" functionality_constant double," +
				" cost int," +
				" cost_resource_type int," +
				" limit int," +
				" create_time_seconds int," +
				" base_speedup_cost_seconds int," +
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
		indexes.add("create index consumable_name_index on consumable (name);");
		indexes.add("create index consumable_functionality_type_index on consumable (functionality_type);");
		return indexes;
	}
	

}
