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

	@Column(name="class_required")
	protected int classRequired = 0;
	
	@Column(name="lvl_required")
	protected int lvlRequired = 0;
	
	


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





	@Override
	public String toString() {
		return "Equipment [id=" + id + ", equipId=" + equipId + ", name="
				+ name + ", level=" + level + ", type=" + type
				+ ", durability=" + durability + ", attack=" + attack
				+ ", defense=" + defense + ", additionalHp=" + additionalHp
				+ ", additionalMana=" + additionalMana + ", rarity=" + rarity
				+ ", classRequired=" + classRequired + ", lvlRequired="
				+ lvlRequired + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table equipment (" +
				" id uuid," +
				" equip_id uuid," +
				" name varchar," +
				" level int," +
				" type int," +
				" durability int," +
				" attack int," +
				" defense int," +
				" additional_hp int," +
				" additional_mana int," +
				" rarity int," +
				" class_required int," +
				" lvl_required int," +
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
		indexes.add("create index equipment_type_index on equipment (type);");
		indexes.add("create index equipment_rarity_index on equipment (rarity);");
		indexes.add("create index equipment_class_required_index on equipment (class_required);");
		indexes.add("create index equipment_lvl_required_index on equipment (lvl_required);");
		indexes.add("create index equipment_equip_id_index on equipment (equip_id);");
		return indexes;
	}
	
}
