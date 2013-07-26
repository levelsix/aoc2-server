package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Structure extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="structure_name")
	protected String structureName = "";
	
	@Column(name="level")
	protected int level = 0;
	
	@Column(name="build_cost")
	protected int buildCost = 0;
	
	@Column(name="build_cost_resource_type")
	protected int buildCostResourceType = 1;
	
	@Column(name="build_time_constant")
	protected int buildTimeConstant = 0;
	
	@Column(name="build_speedup_base_cost")
	protected int buildSpeedupBaseCostConstant = 0;
	
	@Column(name="user_level_requirement")
	protected int userLevelRequirement = 0;

	@Column(name="size")
	protected int size = 0;
	
	@Column(name="functionality_type")
	protected int functionalityType = 0;
	
	@Column(name="functionality_resource_type")
	protected int functionalityResourceType = 0;
	
	//base cost for researching spell, income, storage, dependent on building)
	@Column(name="functionality_value")
	protected int functionalityValue = 0;
	
	@Column(name="functionality_capacity")
	protected int functionalityCapacity = 0;
	
	@Column(name="funcationality_speedup_base_cost")
	protected int functionalitySpeedupBaseCost = 1;
	
	@Column(name="image_name")
	protected String imageName = "";
	
	

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getStructureName() {
		return structureName;
	}


	public void setStructureName(String structureName) {
		this.structureName = structureName;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getBuildCost() {
		return buildCost;
	}


	public void setBuildCost(int buildCost) {
		this.buildCost = buildCost;
	}


	public int getBuildCostResourceType() {
		return buildCostResourceType;
	}


	public void setBuildCostResourceType(int buildCostResourceType) {
		this.buildCostResourceType = buildCostResourceType;
	}


	public int getBuildTimeConstant() {
		return buildTimeConstant;
	}


	public void setBuildTimeConstant(int buildTimeConstant) {
		this.buildTimeConstant = buildTimeConstant;
	}


	public int getBuildSpeedupBaseCostConstant() {
		return buildSpeedupBaseCostConstant;
	}


	public void setBuildSpeedupBaseCostConstant(int buildSpeedupBaseCostConstant) {
		this.buildSpeedupBaseCostConstant = buildSpeedupBaseCostConstant;
	}


	public int getUserLevelRequirement() {
		return userLevelRequirement;
	}


	public void setUserLevelRequirement(int userLevelRequirement) {
		this.userLevelRequirement = userLevelRequirement;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getFunctionalityType() {
		return functionalityType;
	}


	public void setFunctionalityType(int functionalityType) {
		this.functionalityType = functionalityType;
	}


	public int getFunctionalityResourceType() {
		return functionalityResourceType;
	}


	public void setFunctionalityResourceType(int functionalityResourceType) {
		this.functionalityResourceType = functionalityResourceType;
	}


	public int getFunctionalityValue() {
		return functionalityValue;
	}


	public void setFunctionalityValue(int functionalityValue) {
		this.functionalityValue = functionalityValue;
	}


	public int getFunctionalityCapacity() {
		return functionalityCapacity;
	}


	public void setFunctionalityCapacity(int functionalityCapacity) {
		this.functionalityCapacity = functionalityCapacity;
	}


	public int getFunctionalitySpeedupBaseCost() {
		return functionalitySpeedupBaseCost;
	}


	public void setFunctionalitySpeedupBaseCost(int functionalitySpeedupBaseCost) {
		this.functionalitySpeedupBaseCost = functionalitySpeedupBaseCost;
	}


	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + buildCost;
		result = prime * result + buildCostResourceType;
		result = prime * result + buildSpeedupBaseCostConstant;
		result = prime * result + buildTimeConstant;
		result = prime * result + functionalityCapacity;
		result = prime * result + functionalityResourceType;
		result = prime * result + functionalitySpeedupBaseCost;
		result = prime * result + functionalityType;
		result = prime * result + functionalityValue;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((imageName == null) ? 0 : imageName.hashCode());
		result = prime * result + level;
		result = prime * result + size;
		result = prime * result
				+ ((structureName == null) ? 0 : structureName.hashCode());
		result = prime * result + userLevelRequirement;
		return result;
	}

	
	

	@Override
	public String toString() {
		return "Structure [id=" + id + ", structureName=" + structureName
				+ ", level=" + level + ", buildCost=" + buildCost
				+ ", buildCostResourceType=" + buildCostResourceType
				+ ", buildTimeConstant=" + buildTimeConstant
				+ ", buildSpeedupBaseCostConstant="
				+ buildSpeedupBaseCostConstant + ", userLevelRequirement="
				+ userLevelRequirement + ", size=" + size
				+ ", functionalityType=" + functionalityType
				+ ", functionalityResourceType=" + functionalityResourceType
				+ ", functionalityValue=" + functionalityValue
				+ ", functionalityCapacity=" + functionalityCapacity
				+ ", functionalitySpeedupBaseCost="
				+ functionalitySpeedupBaseCost + ", imageName=" + imageName
				+ "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Structure other = (Structure) obj;
		if (buildCost != other.buildCost)
			return false;
		if (buildCostResourceType != other.buildCostResourceType)
			return false;
		if (buildSpeedupBaseCostConstant != other.buildSpeedupBaseCostConstant)
			return false;
		if (buildTimeConstant != other.buildTimeConstant)
			return false;
		if (functionalityCapacity != other.functionalityCapacity)
			return false;
		if (functionalityResourceType != other.functionalityResourceType)
			return false;
		if (functionalitySpeedupBaseCost != other.functionalitySpeedupBaseCost)
			return false;
		if (functionalityType != other.functionalityType)
			return false;
		if (functionalityValue != other.functionalityValue)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imageName == null) {
			if (other.imageName != null)
				return false;
		} else if (!imageName.equals(other.imageName))
			return false;
		if (level != other.level)
			return false;
		if (size != other.size)
			return false;
		if (structureName == null) {
			if (other.structureName != null)
				return false;
		} else if (!structureName.equals(other.structureName))
			return false;
		if (userLevelRequirement != other.userLevelRequirement)
			return false;
		return true;
	}


	@Override
	public String getTableCreateStatement() {
		return "create table structure (" +
				" id uuid," +
				" structure_name varchar," +
				" level int," +
				" build_cost int," +
				" build_time_constant int," +
				" build_speedup_base_cost int," +
				" townhall_level int," +
				" size int," +
				" functionality_type int," +
				" functionality_value int," +
				" functionality_capacity," +
				" functionality_speedup_base int," +
				" image_name varchar, " +
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
		indexes.add("create index income_index on structure (income);");
		indexes.add("create index functionality_type on structure (functionality_type);");
		return indexes;
	}
	
}
