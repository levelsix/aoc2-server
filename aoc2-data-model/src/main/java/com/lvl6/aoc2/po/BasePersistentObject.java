package com.lvl6.aoc2.po;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import scala.actors.threadpool.Arrays;

import com.lvl6.aoc2.entitymanager.Index;

abstract public class BasePersistentObject {
	
	
	private static final Logger log = LoggerFactory.getLogger(BasePersistentObject.class);

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
	 * The CQL statements needed to create or remove indexes for this object
	 * @return
	 */
	
	private Set<String> indexCreateStatements = new HashSet<String>();
	public Set<String> getIndexCreateStatements(){
		@SuppressWarnings("unchecked")
		List<Field> fields = Arrays.asList(this.getClass().getDeclaredFields());
		for(Field field : fields) {
			try {
			if(field.isAnnotationPresent(Index.class)) {
				Column clm = field.getAnnotation(Column.class);
				String fieldName = clm.name();
				indexCreateStatements.add(indexCreateStatement(field, fieldName));
			}
			}catch(Exception e) {
				log.error("Error creating index create statement", e);
			}
		}
		return indexCreateStatements;
	}
	
	protected String indexCreateStatement(Field field, String fieldName) {
		return "create index "+tableName()+"_"+fieldName+"_key on "+tableName()+" ("+fieldName+");";
	}
	
	
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
