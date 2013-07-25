package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Structure extends BasePersistentObject{

	@Id
	protected int id = 0;
	
	@Column(name="structure_name")
	protected String structureName = "";
	
	@Column(name="level")
	protected int level = 0;
	
	@Column(name="build_cost")
	protected int buildCost = 0;
	
	@Column(name="build_time_constant")
	protected int buildTimeConstant = 0;
	
	@Column(name="build_speedup_constant")
	protected int buildSpeedupConstant = 0;
	
	@Column(name="townhall_level")
	protected int townhallLevel = 0;

	@Column(name="size")
	protected int size = 0;
	
	@Column(name="functionality_type")
	protected int functionalityType = 0;
	
	@Column(name="functionality_value")
	protected int functionalityValue = 0;
	
	@Column(name="functionality_capacity")
	protected int functionalityCapacity = 0;
	
	@Column(name="functionality_speedup_base")
	protected int functionalitySpeedupBase = 0;
	
	@Column(name="image_name")
	protected String imageName = "";
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getBuildTimeConstant() {
		return buildTimeConstant;
	}
	public void setBuildTimeConstant(int buildTimeConstant) {
		this.buildTimeConstant = buildTimeConstant;
	}
	public int getBuildSpeedupConstant() {
		return buildSpeedupConstant;
	}
	public void setBuildSpeedupConstant(int buildSpeedupConstant) {
		this.buildSpeedupConstant = buildSpeedupConstant;
	}
	public int getTownhallLevel() {
		return townhallLevel;
	}
	public void setTownhallLevel(int townhallLevel) {
		this.townhallLevel = townhallLevel;
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
	public int getFunctionalitySpeedupBase() {
		return functionalitySpeedupBase;
	}
	public void setFunctionalitySpeedupBase(int functionalitySpeedupBase) {
		this.functionalitySpeedupBase = functionalitySpeedupBase;
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
		result = prime * result + buildSpeedupConstant;
		result = prime * result + buildTimeConstant;
		result = prime * result + functionalityCapacity;
		result = prime * result + functionalitySpeedupBase;
		result = prime * result + functionalityType;
		result = prime * result + functionalityValue;
		result = prime * result + id;
		result = prime * result
				+ ((imageName == null) ? 0 : imageName.hashCode());
		result = prime * result + level;
		result = prime * result + size;
		result = prime * result
				+ ((structureName == null) ? 0 : structureName.hashCode());
		result = prime * result + townhallLevel;
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
		if (buildSpeedupConstant != other.buildSpeedupConstant)
			return false;
		if (buildTimeConstant != other.buildTimeConstant)
			return false;
		if (functionalityCapacity != other.functionalityCapacity)
			return false;
		if (functionalitySpeedupBase != other.functionalitySpeedupBase)
			return false;
		if (functionalityType != other.functionalityType)
			return false;
		if (functionalityValue != other.functionalityValue)
			return false;
		if (id != other.id)
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
		if (townhallLevel != other.townhallLevel)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Structure [id=" + id + ", structureName=" + structureName
				+ ", level=" + level + ", buildCost=" + buildCost
				+ ", buildTimeConstant=" + buildTimeConstant
				+ ", buildSpeedupConstant=" + buildSpeedupConstant
				+ ", townhallLevel=" + townhallLevel + ", size=" + size
				+ ", functionalityType=" + functionalityType
				+ ", functionalityValue=" + functionalityValue
				+ ", functionalityCapacity=" + functionalityCapacity
				+ ", functionalitySpeedupBase=" + functionalitySpeedupBase
				+ ", imageName=" + imageName + ", getId()=" + getId()
				+ ", getStructureName()=" + getStructureName()
				+ ", getLevel()=" + getLevel() + ", getBuildCost()="
				+ getBuildCost() + ", getBuildTimeConstant()="
				+ getBuildTimeConstant() + ", getBuildSpeedupConstant()="
				+ getBuildSpeedupConstant() + ", getTownhallLevel()="
				+ getTownhallLevel() + ", getSize()=" + getSize()
				+ ", getFunctionalityType()=" + getFunctionalityType()
				+ ", getFunctionalityValue()=" + getFunctionalityValue()
				+ ", getFunctionalityCapacity()=" + getFunctionalityCapacity()
				+ ", getFunctionalitySpeedupBase()="
				+ getFunctionalitySpeedupBase() + ", getImageName()="
				+ getImageName() + ", hashCode()=" + hashCode()
				+ ", getTableCreateStatement()=" + getTableCreateStatement()
				+ ", getTableUpdateStatements()=" + getTableUpdateStatements()
				+ ", getIndexCreateStatements()=" + getIndexCreateStatements()
				+ ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	@Override
	public String getTableCreateStatement() {
		return "create table user (" +
				" id int," +
				" structure_name varchar," +
				" level int," +
				" build_cost int," +
				" build_time_constant int," +
				" build_speedup_constant int," +
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
		indexes.add("create index income_index on resourceStructure(income);");
		return indexes;
	}
	

	
	
	
	
	
}