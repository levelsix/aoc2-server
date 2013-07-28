package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Monster extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="name")
	protected String name = "";
	
	@Column(name="is_boss")
	protected boolean isBoss = false;
	
	@Column(name="max_hp")
	protected int maxHp = 0;
	
	@Column(name="max_mana")
	protected int maxMana = 0;
	
	@Column(name="attack")
	protected int attack = 0;
	
	@Column(name="defense")
	protected int defense = 0;
	
	@Column(name="type")
	protected int type = 0;
	
	@Column(name="color")
	protected int color = 0;
	
	@Column(name="size")
	protected int size = 0;
	
	@Column(name="exp_reward")
	protected int expReward = 0;


	

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


	public boolean isBoss() {
		return isBoss;
	}


	public void setBoss(boolean isBoss) {
		this.isBoss = isBoss;
	}


	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}


	public int getMaxMana() {
		return maxMana;
	}


	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
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


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public int getColor() {
		return color;
	}


	public void setColor(int color) {
		this.color = color;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getExpReward() {
		return expReward;
	}


	public void setExpReward(int expReward) {
		this.expReward = expReward;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attack;
		result = prime * result + color;
		result = prime * result + defense;
		result = prime * result + expReward;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isBoss ? 1231 : 1237);
		result = prime * result + maxHp;
		result = prime * result + maxMana;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + size;
		result = prime * result + type;
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
		Monster other = (Monster) obj;
		if (attack != other.attack)
			return false;
		if (color != other.color)
			return false;
		if (defense != other.defense)
			return false;
		if (expReward != other.expReward)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isBoss != other.isBoss)
			return false;
		if (maxHp != other.maxHp)
			return false;
		if (maxMana != other.maxMana)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size != other.size)
			return false;
		if (type != other.type)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Monster [id=" + id + ", name=" + name + ", isBoss=" + isBoss
				+ ", maxHp=" + maxHp + ", maxMana=" + maxMana + ", attack="
				+ attack + ", defense=" + defense + ", type=" + type
				+ ", color=" + color + ", size=" + size + ", expReward="
				+ expReward + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table monsters (" +
				" id udid," +
				" name varchar," +
				" is_boss boolean," +
				" max_hp int," +
				" max_mana int," +
				" attack int," +
				" defense int," +
				" type int," +
				" color int," +
				" size int," +
				" exp_reward int," +
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
		indexes.add("create index monster_is_boss_index on monster (is_boss);");
		return indexes;
	}
	
	
	
}
