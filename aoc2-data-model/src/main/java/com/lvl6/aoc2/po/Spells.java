package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Spells extends BasePersistentObject{

	@Id
	protected int id = 0;
	
	@Column(name="spell_name")
	protected String spellName = "";
	
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
	
	@Column(name="duration")
	protected int duration = 0;

	@Column(name="elemental_type")
	protected int elementalType = 0;
	
	@Column(name="speed")
	protected int speed = 0;
	
	@Column(name="targetted")
	protected boolean targetted = true;
	
	@Column(name="size")
	protected int size = 0;

	@Column(name="cast_time")
	protected int castTime = 0;
	
	@Column(name="cooldown")
	protected int cooldown = 0;
	
	@Column(name="range")
	protected int range = 0;
	
	@Column(name="level_requirement")
	protected int levelRequirement = 0;
	
	@Column(name="spell_level")
	protected int spellLevel = 0;
	
	@Column(name="research_cost")
	protected int researchCost = 0;
	
	@Column(name="research_time")
	protected int researchTime = 0;
	
	@Column(name="research_resource")
	protected int researchResource = 0;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpellName() {
		return spellName;
	}
	public void setSpellName(String spellName) {
		this.spellName = spellName;
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
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
	public int getCastTime() {
		return castTime;
	}
	public void setCastTime(int castTime) {
		this.castTime = castTime;
	}
	public int getCooldown() {
		return cooldown;
	}
	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}
	public int getLevelRequirement() {
		return levelRequirement;
	}
	public void setLevelRequirement(int levelRequirement) {
		this.levelRequirement = levelRequirement;
	}
	public int getSpellLevel() {
		return spellLevel;
	}
	public void setSpellLevel(int spellLevel) {
		this.spellLevel = spellLevel;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getResearchCost() {
		return researchCost;
	}
	public void setResearchCost(int researchCost) {
		this.researchCost = researchCost;
	}
	public int getResearchTime() {
		return researchTime;
	}
	public void setResearchTime(int researchTime) {
		this.researchTime = researchTime;
	}
	public int getResearchResource() {
		return researchResource;
	}
	public void setResearchResource(int researchResource) {
		this.researchResource = researchResource;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + animationEffect;
		result = prime * result + castTime;
		result = prime * result + classType;
		result = prime * result + cooldown;
		result = prime * result + duration;
		result = prime * result + elementalType;
		result = prime * result + functionConstant;
		result = prime * result + functionType;
		result = prime * result + id;
		result = prime * result + levelRequirement;
		result = prime * result + manaCost;
		result = prime * result + range;
		result = prime * result + researchCost;
		result = prime * result + researchResource;
		result = prime * result + researchTime;
		result = prime * result + size;
		result = prime * result + speed;
		result = prime * result + spellLevel;
		result = prime * result
				+ ((spellName == null) ? 0 : spellName.hashCode());
		result = prime * result + (targetted ? 1231 : 1237);
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
		Spells other = (Spells) obj;
		if (animationEffect != other.animationEffect)
			return false;
		if (castTime != other.castTime)
			return false;
		if (classType != other.classType)
			return false;
		if (cooldown != other.cooldown)
			return false;
		if (duration != other.duration)
			return false;
		if (elementalType != other.elementalType)
			return false;
		if (functionConstant != other.functionConstant)
			return false;
		if (functionType != other.functionType)
			return false;
		if (id != other.id)
			return false;
		if (levelRequirement != other.levelRequirement)
			return false;
		if (manaCost != other.manaCost)
			return false;
		if (range != other.range)
			return false;
		if (researchCost != other.researchCost)
			return false;
		if (researchResource != other.researchResource)
			return false;
		if (researchTime != other.researchTime)
			return false;
		if (size != other.size)
			return false;
		if (speed != other.speed)
			return false;
		if (spellLevel != other.spellLevel)
			return false;
		if (spellName == null) {
			if (other.spellName != null)
				return false;
		} else if (!spellName.equals(other.spellName))
			return false;
		if (targetted != other.targetted)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Spells [id=" + id + ", spellName=" + spellName + ", classType="
				+ classType + ", functionType=" + functionType
				+ ", functionConstant=" + functionConstant + ", manaCost="
				+ manaCost + ", animationEffect=" + animationEffect
				+ ", duration=" + duration + ", elementalType=" + elementalType
				+ ", speed=" + speed + ", targetted=" + targetted + ", size="
				+ size + ", castTime=" + castTime + ", cooldown=" + cooldown
				+ ", range=" + range + ", levelRequirement=" + levelRequirement
				+ ", spellLevel=" + spellLevel + ", researchCost="
				+ researchCost + ", researchTime=" + researchTime
				+ ", researchResource=" + researchResource + "]";
	}
	
	
	@Override
	public String getTableCreateStatement() {
		return "create table user (" +
				" id int," +
				" spell_name varchar," +
				" class_type int," +
				" function_type int," +
				" function_constant int," +
				" mana_cost int," +
				" animation_effect int," +
				" duration int," +
				" elemental_type int," +
				" speed int," +
				" targetted bool," +
				" size int, " +
				" cast_time int" +
				" cooldown int," +
				" range int," +
				" level_requirement," +
				" spellLevel," +
				" research_cost int," +
				" research_time int," +
				" research_resource int," +
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
		indexes.add("create index element_type on spells(element_type);");
		indexes.add("create index class_type on spells(class_type);");
		return indexes;
	}
	

	
	
	
	
	
}
