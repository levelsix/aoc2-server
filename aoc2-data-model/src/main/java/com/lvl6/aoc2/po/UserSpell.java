package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserSpell extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="user_id")
	protected UUID userId = null;
	
	@Column(name="spell_id")
	protected UUID spellId = UUID.randomUUID();
	
	@Column(name="spell_lvl")
	protected UUID spellLvl = UUID.randomUUID();
	
	@Column(name="time_acquired")
	protected Date timeAcquired = new Date();


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getUserId() {
		return userId;
	}


	public void setUserId(UUID userId) {
		this.userId = userId;
	}


	public UUID getSpellId() {
		return spellId;
	}


	public void setSpellId(UUID spellId) {
		this.spellId = spellId;
	}


	public UUID getSpellLvl() {
		return spellLvl;
	}


	public void setSpellLvl(UUID spellLvl) {
		this.spellLvl = spellLvl;
	}


	public Date getTimeAcquired() {
		return timeAcquired;
	}


	public void setTimeAcquired(Date timeAcquired) {
		this.timeAcquired = timeAcquired;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((spellId == null) ? 0 : spellId.hashCode());
		result = prime * result
				+ ((spellLvl == null) ? 0 : spellLvl.hashCode());
		result = prime * result
				+ ((timeAcquired == null) ? 0 : timeAcquired.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		UserSpell other = (UserSpell) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (spellId == null) {
			if (other.spellId != null)
				return false;
		} else if (!spellId.equals(other.spellId))
			return false;
		if (spellLvl == null) {
			if (other.spellLvl != null)
				return false;
		} else if (!spellLvl.equals(other.spellLvl))
			return false;
		if (timeAcquired == null) {
			if (other.timeAcquired != null)
				return false;
		} else if (!timeAcquired.equals(other.timeAcquired))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "UserSpell [id=" + id + ", userId=" + userId + ", spellId="
				+ spellId + ", spellLvl=" + spellLvl + ", timeAcquired="
				+ timeAcquired + "]";
	}


	@Override
	public String getTableCreateStatement() {
		return "create table user_spell (" +
				" id uuid," +
				" user_id uuid," +
				" spell_id uuid," +
				" spell_lvl int," +
				" time_acquired timestamp," +
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
		indexes.add("create index user_spell_user_id_index on user_spell (user_id);");
		indexes.add("create index user_spell_spell_id_index on user_spell (spell_id);");
		return indexes;
	}
	
	
	
	
	
}
