package com.lvl6.aoc2.po;

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
	
	@Column(name="equip_id")
	protected UUID equipId = UUID.randomUUID();
	
	@Column(name="name")
	protected String name = "";
	
	@Column(name="level")
	protected int level = 0;
	
	@Column(name="type")
	protected int type = 0;
	
	@Column(name="durability")
	protected double durability = 0.0;

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

	@Column(name="class_required")
	protected int classRequired = 0;
	
	//rename to hero
	@Column(name="lvl_required")
	protected int lvlRequired = 0;
	
	//fixing from 0 to 100%
	@Column(name="durability_fix_price")
	protected int durabilityFixPrice = 0;
	
	@Column(name="durability_fix_time_constant")
	protected int durabilityFixTimeConstant = 0;
	
	
	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getEquipId() {
		return equipId;
	}


	public void setEquipId(UUID equipId) {
		this.equipId = equipId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public double getDurability() {
		return durability;
	}


	public void setDurability(double durability) {
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


	public int getClassRequired() {
		return classRequired;
	}


	public void setClassRequired(int classRequired) {
		this.classRequired = classRequired;
	}


	public int getLvlRequired() {
		return lvlRequired;
	}


	public void setLvlRequired(int lvlRequired) {
		this.lvlRequired = lvlRequired;
	}


	public int getDurabilityFixPrice() {
		return durabilityFixPrice;
	}


	public void setDurabilityFixPrice(int durabilityFixPrice) {
		this.durabilityFixPrice = durabilityFixPrice;
	}
	

	public int getDurabilityFixTimeConstant() {
		return durabilityFixTimeConstant;
	}


	public void setDurabilityFixTimeConstant(int durabilityFixTimeConstant) {
		this.durabilityFixTimeConstant = durabilityFixTimeConstant;
	}


	@Override
	public String toString() {
		return "Equipment [id=" + id + ", equipId=" + equipId + ", name="
				+ name + ", level=" + level + ", type=" + type
				+ ", durability=" + durability + ", attack=" + attack
				+ ", defense=" + defense + ", additionalHp=" + additionalHp
				+ ", additionalMana=" + additionalMana + ", rarity=" + rarity
				+ ", classRequired=" + classRequired + ", lvlRequired="
				+ lvlRequired + ", durabilityFixPrice=" + durabilityFixPrice
				+ ", durabilityFixTimeConstant=" + durabilityFixTimeConstant
				+ "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" equip_id uuid," +
				" name varchar," +
				" level int," +
				" type int," +
				" durability double," +
				" attack int," +
				" defense int," +
				" additional_hp int," +
				" additional_mana int," +
				" rarity int," +
				" class_required int," +
				" lvl_required int," +
				" durability_fix_price int," +
				" durability_fix_time_constant int," +
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
		indexes.add("create index equipment_type_index "+tableName()+" (type);");
		indexes.add("create index equipment_rarity_index "+tableName()+" (rarity);");
		indexes.add("create index equipment_class_required_index "+tableName()+" (class_required);");
		indexes.add("create index equipment_lvl_required_index "+tableName()+" (lvl_required);");
		indexes.add("create index equipment_equip_id_index "+tableName()+" (equip_id);");
		return indexes;
	}
	
}
