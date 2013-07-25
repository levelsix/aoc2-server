package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Equipment extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="equip_name")
	protected String equipName = "";
	
	@Column(name="level")
	protected int level = 0;
	
	@Column(name="equip_type")
	protected int equipType = 0;
	
	@Column(name="durability")
	protected int durability = 0;

	@Column(name="attack")
	protected int attack = 0;

	@Column(name="defense")
	protected int defense = 0;

	@Column(name="additional_hp")
	protected int additionalHp = 0;

	@Column(name="additional_mana")
	protected int additionalMana = 0;
	
	@Column(name="rarity")
	protected int rarity = 0;

	@Column(name="level_requirement")
	protected int levelRequirement = 0;

	@Column(name="class_requirement")
	protected int classRequirement = 0;
	
	
	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getEquipName() {
		return equipName;
	}


	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getEquipType() {
		return equipType;
	}


	public void setEquipType(int equipType) {
		this.equipType = equipType;
	}


	public int getDurability() {
		return durability;
	}


	public void setDurability(int durability) {
		this.durability = durability;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getAdditionalHp() {
		return additionalHp;
	}


	public void setAdditionalHp(int additionalHp) {
		this.additionalHp = additionalHp;
	}


	public int getAdditionalMana() {
		return additionalMana;
	}


	public void setAdditionalMana(int additionalMana) {
		this.additionalMana = additionalMana;
	}


	public int getRarity() {
		return rarity;
	}


	public void setRarity(int rarity) {
		this.rarity = rarity;
	}


	public int getLevelRequirement() {
		return levelRequirement;
	}


	public void setLevelRequirement(int levelRequirement) {
		this.levelRequirement = levelRequirement;
	}


	public int getClassRequirement() {
		return classRequirement;
	}


	public void setClassRequirement(int classRequirement) {
		this.classRequirement = classRequirement;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + additionalHp;
		result = prime * result + additionalMana;
		result = prime * result + attack;
		result = prime * result + classRequirement;
		result = prime * result + defense;
		result = prime * result + durability;
		result = prime * result
				+ ((equipName == null) ? 0 : equipName.hashCode());
		result = prime * result + equipType;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + level;
		result = prime * result + levelRequirement;
		result = prime * result + rarity;
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
		Equipment other = (Equipment) obj;
		if (additionalHp != other.additionalHp)
			return false;
		if (additionalMana != other.additionalMana)
			return false;
		if (attack != other.attack)
			return false;
		if (classRequirement != other.classRequirement)
			return false;
		if (defense != other.defense)
			return false;
		if (durability != other.durability)
			return false;
		if (equipName == null) {
			if (other.equipName != null)
				return false;
		} else if (!equipName.equals(other.equipName))
			return false;
		if (equipType != other.equipType)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (level != other.level)
			return false;
		if (levelRequirement != other.levelRequirement)
			return false;
		if (rarity != other.rarity)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Equipment [id=" + id + ", equipName=" + equipName + ", level="
				+ level + ", equipType=" + equipType + ", durability="
				+ durability + ", attack=" + attack + ", defense=" + defense
				+ ", additionalHp=" + additionalHp + ", additionalMana="
				+ additionalMana + ", rarity=" + rarity + ", levelRequirement="
				+ levelRequirement + ", classRequirement=" + classRequirement
				+ "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user (" +
				" id uuid," +
				" equip_name varchar," +
				" level int," +
				" equip_type int," +
				" durability int," +
				" attack int," +
				" defense int," +
				" additional_hp int," +
				" additional_mana int," +
				" rarity int," +
				" level_requirement int," +
				" class_requirement int," +
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
		indexes.add("create index rarity_index on equipment (rarity);");
		indexes.add("create index class_requirement_index on equipment (class_requirement);");
		return indexes;
	}
	

	
	
	
	
	
}
