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
	protected UUID monsterId = UUID.randomUUID();;
	
	@Column(name="combat_room_name")
	protected String combatRoomName = "";
	
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


	public String getCombatRoomName() {
		return combatRoomName;
	}


	public void setCombatRoomName(String combatRoomName) {
		this.combatRoomName = combatRoomName;
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
	public String toString() {
		return "MonsterAndRoom [id=" + id + ", monsterId=" + monsterId
				+ ", combatRoomName=" + combatRoomName + ", quantity="
				+ quantity + ", wave_num=" + wave_num + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table monster_and_room (" +
				" id uuid," +
				" monster_id uuid," +
				" combat_room_name uuid," +
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
		indexes.add("create index monster_and_room_combat_room_name_index on monster_and_room (combat_room_name);");
		return indexes;
	}
	
}
