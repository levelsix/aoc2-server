package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class MonsterReward extends BasePersistentObject{
	
	//explicit values are useless, I just made random values

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="monster_id")
	protected UUID monsterId = null;
	
	@Column(name="equip_id")
	protected UUID equipId = null;
	
	@Column(name="equip_drop_rate")
	protected double equipDropRate = 0.5;
	
	@Column(name="item_id") //maybe for quest items
	protected UUID itemId = null;
	
	@Column(name="item_drop_rate")
	protected double itemDropRate = 0.5;
	
	@Column(name="min_gold")
	protected int minGold = 10;
	
	@Column(name="max_gold")
	protected int maxGold = 100;
	
	@Column(name="min_tonic")
	protected int minTonic = 10;
	
	@Column(name="max_tonic")
	protected int maxTonic = 100;


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getCreatureId() {
		return monsterId;
	}


	public void setCreatureId(UUID monsterId) {
		this.monsterId = monsterId;
	}


	public UUID getEquipId() {
		return equipId;
	}


	public void setEquipId(UUID equipId) {
		this.equipId = equipId;
	}


	public double getEquipDropRate() {
		return equipDropRate;
	}


	public void setEquipDropRate(double equipDropRate) {
		this.equipDropRate = equipDropRate;
	}


	public UUID getItemId() {
		return itemId;
	}


	public void setItemId(UUID itemId) {
		this.itemId = itemId;
	}


	public double getItemDropRate() {
		return itemDropRate;
	}


	public void setItemDropRate(double itemDropRate) {
		this.itemDropRate = itemDropRate;
	}


	public int getMinGold() {
		return minGold;
	}


	public void setMinGold(int minGold) {
		this.minGold = minGold;
	}


	public int getMaxGold() {
		return maxGold;
	}


	public void setMaxGold(int maxGold) {
		this.maxGold = maxGold;
	}


	public int getMinTonic() {
		return minTonic;
	}


	public void setMinTonic(int minTonic) {
		this.minTonic = minTonic;
	}


	public int getMaxTonic() {
		return maxTonic;
	}


	public void setMaxTonic(int maxTonic) {
		this.maxTonic = maxTonic;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(equipDropRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((equipId == null) ? 0 : equipId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		temp = Double.doubleToLongBits(itemDropRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + maxGold;
		result = prime * result + maxTonic;
		result = prime * result + minGold;
		result = prime * result + minTonic;
		result = prime * result
				+ ((monsterId == null) ? 0 : monsterId.hashCode());
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
		MonsterReward other = (MonsterReward) obj;
		if (Double.doubleToLongBits(equipDropRate) != Double
				.doubleToLongBits(other.equipDropRate))
			return false;
		if (equipId == null) {
			if (other.equipId != null)
				return false;
		} else if (!equipId.equals(other.equipId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(itemDropRate) != Double
				.doubleToLongBits(other.itemDropRate))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (maxGold != other.maxGold)
			return false;
		if (maxTonic != other.maxTonic)
			return false;
		if (minGold != other.minGold)
			return false;
		if (minTonic != other.minTonic)
			return false;
		if (monsterId == null) {
			if (other.monsterId != null)
				return false;
		} else if (!monsterId.equals(other.monsterId))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "MonsterReward [id=" + id + ", monsterId=" + monsterId
				+ ", equipId=" + equipId + ", equipDropRate=" + equipDropRate
				+ ", itemId=" + itemId + ", itemDropRate=" + itemDropRate
				+ ", minGold=" + minGold + ", maxGold=" + maxGold
				+ ", minTonic=" + minTonic + ", maxTonic=" + maxTonic + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table monster_reward (" +
				" id uuid," +
				" monster_id uuid," +
				" equip_id uuid," +
				" equip_drop_rate double," +
				" item_id uuid," +
				" item_drop_rate double," +
				" min_gold int," +
				" max_gold int," +
				" min_tonic int," +
				" max_tonic int," +
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
		indexes.add("create index monster_reward_monster_id_index on monster_reward (monster_id);");
		return indexes;
	}
	
}
