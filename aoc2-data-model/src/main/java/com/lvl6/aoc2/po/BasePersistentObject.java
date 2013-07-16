package com.lvl6.aoc2.po;

import java.util.Set;

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
	 * The CQL statements needed to create or remove indexes on existing table for this object
	 * @return
	 */
	abstract public Set<String> getIndexCreateStatements();
	
}
