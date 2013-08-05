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
	
	@Column(name="structure_id")
	protected UUID structureId = UUID.randomUUID();
	
	@Column(name="name")
	protected String name = "";
	
	@Column(name="lvl")
	protected int lvl = 0;
	
	@Column(name="build_cost")
	protected int buildCost = 0;
	
	@Column(name="build_cost_resource_type")
	protected int buildCostResourceType = 1;
	
	@Column(name="build_time_seconds")
	protected int buildTimeSeconds = 0;
	
	@Column(name="build_speedup_base_cost")
	protected int buildSpeedupBaseCost = 0;
	
	@Column(name="user_lvl_required")
	protected int userLvlRequired = 0;

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
	
	@Column(name="functionality_speedup_base_cost")
	protected int functionalitySpeedupBaseCost = 1;
	
	@Column(name="image_name")
	protected String imageName = "";


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getStructureId() {
		return structureId;
	}


	public void setStructureId(UUID structureId) {
		this.structureId = structureId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLvl() {
		return lvl;
	}


	public void setLvl(int lvl) {
		this.lvl = lvl;
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


	public int getBuildTimeSeconds() {
		return buildTimeSeconds;
	}


	public void setBuildTimeSeconds(int buildTimeSeconds) {
		this.buildTimeSeconds = buildTimeSeconds;
	}


	public int getBuildSpeedupBaseCost() {
		return buildSpeedupBaseCost;
	}


	public void setBuildSpeedupBaseCost(int buildSpeedupBaseCost) {
		this.buildSpeedupBaseCost = buildSpeedupBaseCost;
	}


	public int getUserLvlRequired() {
		return userLvlRequired;
	}


	public void setUserLvlRequired(int userLvlRequired) {
		this.userLvlRequired = userLvlRequired;
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
		result = prime * result + buildSpeedupBaseCost;
		result = prime * result + buildTimeSeconds;
		result = prime * result + functionalityCapacity;
		result = prime * result + functionalityResourceType;
		result = prime * result + functionalitySpeedupBaseCost;
		result = prime * result + functionalityType;
		result = prime * result + functionalityValue;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((imageName == null) ? 0 : imageName.hashCode());
		result = prime * result + lvl;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + size;
		result = prime * result
				+ ((structureId == null) ? 0 : structureId.hashCode());
		result = prime * result + userLvlRequired;
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
		Structure other = (Structure) obj;
		if (buildCost != other.buildCost)
			return false;
		if (buildCostResourceType != other.buildCostResourceType)
			return false;
		if (buildSpeedupBaseCost != other.buildSpeedupBaseCost)
			return false;
		if (buildTimeSeconds != other.buildTimeSeconds)
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
		if (lvl != other.lvl)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size != other.size)
			return false;
		if (structureId == null) {
			if (other.structureId != null)
				return false;
		} else if (!structureId.equals(other.structureId))
			return false;
		if (userLvlRequired != other.userLvlRequired)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Structure [id=" + id + ", structureId=" + structureId
				+ ", name=" + name + ", lvl=" + lvl + ", buildCost="
				+ buildCost + ", buildCostResourceType="
				+ buildCostResourceType + ", buildTimeSeconds="
				+ buildTimeSeconds + ", buildSpeedupBaseCost="
				+ buildSpeedupBaseCost + ", userLvlRequired=" + userLvlRequired
				+ ", size=" + size + ", functionalityType=" + functionalityType
				+ ", functionalityResourceType=" + functionalityResourceType
				+ ", functionalityValue=" + functionalityValue
				+ ", functionalityCapacity=" + functionalityCapacity
				+ ", functionalitySpeedupBaseCost="
				+ functionalitySpeedupBaseCost + ", imageName=" + imageName
				+ "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table structure (" +
				" id uuid," +
				" structure_id uuid," +
				" name varchar," +
				" lvl int," +
				" build_cost int," +
				" build_cost_resource_type int," +
				" build_time_seconds int," +
				" build_speedup_base_cost int," +
				" user_lvl_required int," +
				" size int," +
				" functionality_type int," +
				" functionality_resurce_type int," +
				" functionality_value int," +
				" functionality_capacity int," +
				" functionality_speedup_base_cost int," +
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
		indexes.add("create index structure_structure_id_index on structure (structure_id);");
		indexes.add("create index structure_income_index on structure (income);");
		indexes.add("create index structure_functionality_type_index on structure (functionality_type);");
		return indexes;
	}
	
}
