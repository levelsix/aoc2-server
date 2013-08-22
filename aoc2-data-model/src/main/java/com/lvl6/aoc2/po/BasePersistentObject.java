package com.lvl6.aoc2.po;

import java.util.Set;
import java.util.UUID;

abstract public class BasePersistentObject {

	/**
	 * The CQL statement to create the table for this Object
	 * @return
	 */
	abstract public String getTableCreateStatement();
	
	/**
	 * The CQL statements needed to add or remove columns from existing table for this object
	 * Use this if you cannot drop the table and recreate it
	 * @return
	 */
	abstract public Set<String> getTableUpdateStatements();
	
	/**
	 * The CQL statements needed to create or remove indexes "+tableName()+" existing table for this object
	 * @return
	 */
	abstract public Set<String> getIndexCreateStatements();
	
	
	public String tableName() {
		return this.getClass().getSimpleName().toLowerCase();
	}
	
	
	abstract public UUID getId(); 
	abstract public void setId(UUID id); 
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		BasePersistentObject other = (BasePersistentObject) obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return true;
	}
	
}
