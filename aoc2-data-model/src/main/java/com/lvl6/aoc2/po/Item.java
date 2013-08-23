package com.lvl6.aoc2.po;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Item extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="name")
	protected String name = "";
	
	@Column(name="item_type")
	protected int itemType = 0;
	


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


	public int getItemType() {
		return itemType;
	}


	public void setItemType(int itemType) {
		this.itemType = itemType;
	}




	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", itemType=" + itemType
				+ "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table "+ tableName()+" (" +
				" id uuid," +
				" name varchar," +
				" item_type int," +
				" primary key(id))" +
				" with compact storage;";
	}
	
	
	@Override
	public Set<String> getTableUpdateStatements() {
		Set<String> indexes = new HashSet<String>();
		
		return indexes;
	}
	
/*	
	@Override
	public Set<String> getIndexCreateStatements() {
		Set<String> indexes = new HashSet<String>();
		indexes.add("create index item_type_index "+tableName()+" (type);");
		indexes.add("create index item_rarity_index "+tableName()+" (rarity);");
		indexes.add("create index item_class_required_index "+tableName()+" (class_required);");
		indexes.add("create index item_lvl_required_index "+tableName()+" (lvl_required);");
		indexes.add("create index item_equip_id_index "+tableName()+" (equip_id);");
		indexes.add("create index item_name_index on item (name);");
		return indexes;
	}*/
	
}
