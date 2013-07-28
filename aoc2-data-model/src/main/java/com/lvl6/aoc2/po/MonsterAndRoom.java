package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class MonsterAndRoom extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="monster_id")
	protected UUID monsterId = null;
	
	@Column(name="room_id")
	protected UUID roomId = null;
	
	@Column(name="quantity")
	protected int quantity = 0;
	
	//(monster appears in the first wave, or second, and so on)
	@Column(name="wave_num")
	protected int wave_num = 0;



	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getMonsterId() {
		return monsterId;
	}


	public void setMonsterId(UUID monsterId) {
		this.monsterId = monsterId;
	}


	public UUID getRoomId() {
		return roomId;
	}


	public void setRoomId(UUID roomId) {
		this.roomId = roomId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getWave_num() {
		return wave_num;
	}


	public void setWave_num(int wave_num) {
		this.wave_num = wave_num;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((monsterId == null) ? 0 : monsterId.hashCode());
		result = prime * result + quantity;
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result + wave_num;
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
		MonsterAndRoom other = (MonsterAndRoom) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (monsterId == null) {
			if (other.monsterId != null)
				return false;
		} else if (!monsterId.equals(other.monsterId))
			return false;
		if (quantity != other.quantity)
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (wave_num != other.wave_num)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "MonsterAndRoom [id=" + id + ", monsterId=" + monsterId
				+ ", roomId=" + roomId + ", quantity=" + quantity
				+ ", wave_num=" + wave_num + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table monster_and_room (" +
				" id uuid," +
				" monster_id uuid," +
				" room_id uuid," +
				" quantity int," +
				" wave_num int," +
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
		indexes.add("create index monster_and_room_monster_id_index on monster_and_room (monster_id);");
		indexes.add("create index monster_and_room_room_id_index on monster_and_room (room_id);");
		return indexes;
	}
	
}
