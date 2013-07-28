package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Spell extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="name")
	protected String name = "";
	
	@Column(name="class_type")
	protected int classType = 0;
	
	@Column(name="function_type")
	protected int functionType = 0;
	
	@Column(name="function_constant")
	protected int functionConstant = 0;
	
	@Column(name="mana_cost")
	protected int manaCost = 0;
	
	@Column(name="animation_effect")
	protected int animationEffect = 0;
	
	//animation duration?
	@Column(name="duration_millis")
	protected int durationMillis = 0;

	//we'll just leave this for now...
	@Column(name="elemental_type")
	protected int elementalType = 0;
	
	@Column(name="speed")
	protected int speed = 0;
	
	@Column(name="targetted")
	protected boolean targetted = true;
	
	@Column(name="size")
	protected int size = 0;

	@Column(name="cast_time_millis")
	protected int castTimeMillis = 0;
	
	@Column(name="cooldown_millis")
	protected int cooldownMillis = 0;
	
	@Column(name="range")
	protected int range = 0;
	
	@Column(name="user_level_required")
	protected int userLevelRequired = 0;
	
	@Column(name="level")
	protected int level = 0;
	
	@Column(name="research_cost")
	protected int researchCost = 0;
	
	@Column(name="research_cost_resource")
	protected int researchCostResource = 0;
	
	@Column(name="research_time_millis")
	protected int researchTimeMillis = 0;
	
	@Column(name="research_speedup_base_cost")
	protected int researchSpeedupBaseCost = 0;

	


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


	public int getClassType() {
		return classType;
	}


	public void setClassType(int classType) {
		this.classType = classType;
	}


	public int getFunctionType() {
		return functionType;
	}


	public void setFunctionType(int functionType) {
		this.functionType = functionType;
	}


	public int getFunctionConstant() {
		return functionConstant;
	}


	public void setFunctionConstant(int functionConstant) {
		this.functionConstant = functionConstant;
	}


	public int getManaCost() {
		return manaCost;
	}


	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}


	public int getAnimationEffect() {
		return animationEffect;
	}


	public void setAnimationEffect(int animationEffect) {
		this.animationEffect = animationEffect;
	}


	public int getDurationMillis() {
		return durationMillis;
	}


	public void setDurationMillis(int durationMillis) {
		this.durationMillis = durationMillis;
	}


	public int getElementalType() {
		return elementalType;
	}


	public void setElementalType(int elementalType) {
		this.elementalType = elementalType;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public boolean isTargetted() {
		return targetted;
	}


	public void setTargetted(boolean targetted) {
		this.targetted = targetted;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getCastTimeMillis() {
		return castTimeMillis;
	}


	public void setCastTimeMillis(int castTimeMillis) {
		this.castTimeMillis = castTimeMillis;
	}


	public int getCooldownMillis() {
		return cooldownMillis;
	}


	public void setCooldownMillis(int cooldownMillis) {
		this.cooldownMillis = cooldownMillis;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	public int getUserLevelRequired() {
		return userLevelRequired;
	}


	public void setUserLevelRequired(int userLevelRequired) {
		this.userLevelRequired = userLevelRequired;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getResearchCost() {
		return researchCost;
	}


	public void setResearchCost(int researchCost) {
		this.researchCost = researchCost;
	}


	public int getResearchCostResource() {
		return researchCostResource;
	}


	public void setResearchCostResource(int researchCostResource) {
		this.researchCostResource = researchCostResource;
	}


	public int getResearchTimeMillis() {
		return researchTimeMillis;
	}


	public void setResearchTimeMillis(int researchTimeMillis) {
		this.researchTimeMillis = researchTimeMillis;
	}


	public int getResearchSpeedupBaseCost() {
		return researchSpeedupBaseCost;
	}


	public void setResearchSpeedupBaseCost(int researchSpeedupBaseCost) {
		this.researchSpeedupBaseCost = researchSpeedupBaseCost;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + animationEffect;
		result = prime * result + castTimeMillis;
		result = prime * result + classType;
		result = prime * result + cooldownMillis;
		result = prime * result + durationMillis;
		result = prime * result + elementalType;
		result = prime * result + functionConstant;
		result = prime * result + functionType;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + level;
		result = prime * result + manaCost;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + range;
		result = prime * result + researchCost;
		result = prime * result + researchCostResource;
		result = prime * result + researchSpeedupBaseCost;
		result = prime * result + researchTimeMillis;
		result = prime * result + size;
		result = prime * result + speed;
		result = prime * result + (targetted ? 1231 : 1237);
		result = prime * result + userLevelRequired;
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
		Spell other = (Spell) obj;
		if (animationEffect != other.animationEffect)
			return false;
		if (castTimeMillis != other.castTimeMillis)
			return false;
		if (classType != other.classType)
			return false;
		if (cooldownMillis != other.cooldownMillis)
			return false;
		if (durationMillis != other.durationMillis)
			return false;
		if (elementalType != other.elementalType)
			return false;
		if (functionConstant != other.functionConstant)
			return false;
		if (functionType != other.functionType)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (level != other.level)
			return false;
		if (manaCost != other.manaCost)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (range != other.range)
			return false;
		if (researchCost != other.researchCost)
			return false;
		if (researchCostResource != other.researchCostResource)
			return false;
		if (researchSpeedupBaseCost != other.researchSpeedupBaseCost)
			return false;
		if (researchTimeMillis != other.researchTimeMillis)
			return false;
		if (size != other.size)
			return false;
		if (speed != other.speed)
			return false;
		if (targetted != other.targetted)
			return false;
		if (userLevelRequired != other.userLevelRequired)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Spell [id=" + id + ", name=" + name + ", classType="
				+ classType + ", functionType=" + functionType
				+ ", functionConstant=" + functionConstant + ", manaCost="
				+ manaCost + ", animationEffect=" + animationEffect
				+ ", durationMillis=" + durationMillis + ", elementalType="
				+ elementalType + ", speed=" + speed + ", targetted="
				+ targetted + ", size=" + size + ", castTimeMillis="
				+ castTimeMillis + ", cooldownMillis=" + cooldownMillis
				+ ", range=" + range + ", userLevelRequired="
				+ userLevelRequired + ", level=" + level + ", researchCost="
				+ researchCost + ", researchCostResource="
				+ researchCostResource + ", researchTimeMillis="
				+ researchTimeMillis + ", researchSpeedupBaseCost="
				+ researchSpeedupBaseCost + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table spell (" +
				" id uuid," +
				" name varchar," +
				" class_type int," +
				" function_type int," +
				" function_constant int," +
				" mana_cost int," +
				" animation_effect int," +
				" duration_millis int," +
				" elemental_type int," +
				" speed int," +
				" targetted bool," +
				" size int, " +
				" cast_time_millis int" +
				" cooldown_millis int," +
				" range int," +
				" user_level_required int," +
				" level int," +
				" research_cost int," +
				" research_cost_resource int," +
				" research_time_millis int," +
				" research_speedup_base_cost int," +
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
		indexes.add("create index spell_elemental_type_index on spell (elemental_type);");
		indexes.add("create index spell_class_type_index on spell (class_type);");
		return indexes;
	}
	
	
}
