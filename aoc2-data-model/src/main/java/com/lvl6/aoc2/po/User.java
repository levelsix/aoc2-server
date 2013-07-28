package com.lvl6.aoc2.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class User extends BasePersistentObject{

	@Id
	protected UUID id = UUID.randomUUID();
	
	@Column(name="name")
	protected String name = "";
	
	@Column(name="level")
	protected int level = 0;
	
	@Column(name="experience")
	protected int experience = 0;

	@Column(name="gold")
	protected int gold = 0;
	
	@Column(name="tonic")
	protected int tonic = 0;
	
	//in game currency
	@Column(name="gems")
	protected int gems = 0;
	
	@Column(name="class_type")
	protected int classType = 0;

	@Column(name="max_hp")
	protected int maxHp = 0;
	
	@Column(name="hp")
	protected int hp = 0;
	
	@Column(name="last_time_hp_regened")
	protected Date lastTimeHpRegened = new Date();

	@Column(name="max_mana")
	protected int maxMana = 0;
	
	@Column(name="mana")
	protected int mana = 0;
	
	@Column(name="last_time_mana_regened")
	protected Date lastTimeManaRegened = new Date();
	
	//if user has a gameCenterId use that id, else generate random string
	@Column(name="game_center_id")
	protected String gameCenterId = "";
	
	@Column(name="signup_date")
	protected Date signupDate = new Date();
	
	@Column(name="clan_id")
	protected int clanId = 0;
	
	@Column(name="last_login")
	protected Date lastLogin = new Date();
	
	
	

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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getTonic() {
		return tonic;
	}

	public void setTonic(int tonic) {
		this.tonic = tonic;
	}

	public int getGems() {
		return gems;
	}

	public void setGems(int gems) {
		this.gems = gems;
	}

	public int getClassType() {
		return classType;
	}

	public void setClassType(int classType) {
		this.classType = classType;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Date getLastTimeHpRegened() {
		return lastTimeHpRegened;
	}

	public void setLastTimeHpRegened(Date lastTimeHpRegened) {
		this.lastTimeHpRegened = lastTimeHpRegened;
	}

	public int getMaxMana() {
		return maxMana;
	}

	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public Date getLastTimeManaRegened() {
		return lastTimeManaRegened;
	}

	public void setLastTimeManaRegened(Date lastTimeManaRegened) {
		this.lastTimeManaRegened = lastTimeManaRegened;
	}

	public String getGameCenterId() {
		return gameCenterId;
	}

	public void setGameCenterId(String gameCenterId) {
		this.gameCenterId = gameCenterId;
	}

	public Date getSignupDate() {
		return signupDate;
	}

	public void setSignupDate(Date signupDate) {
		this.signupDate = signupDate;
	}

	public int getClanId() {
		return clanId;
	}

	public void setClanId(int clanId) {
		this.clanId = clanId;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	
//	@Column(name="email")
//	protected String email = "";
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clanId;
		result = prime * result + classType;
		result = prime * result + experience;
		result = prime * result
				+ ((gameCenterId == null) ? 0 : gameCenterId.hashCode());
		result = prime * result + gems;
		result = prime * result + gold;
		result = prime * result + hp;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((lastLogin == null) ? 0 : lastLogin.hashCode());
		result = prime
				* result
				+ ((lastTimeHpRegened == null) ? 0 : lastTimeHpRegened
						.hashCode());
		result = prime
				* result
				+ ((lastTimeManaRegened == null) ? 0 : lastTimeManaRegened
						.hashCode());
		result = prime * result + level;
		result = prime * result + mana;
		result = prime * result + maxHp;
		result = prime * result + maxMana;
		result = prime * result
				+ ((signupDate == null) ? 0 : signupDate.hashCode());
		result = prime * result + tonic;
		result = prime * result
				+ ((name == null) ? 0 : name.hashCode());
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
		User other = (User) obj;
		if (clanId != other.clanId)
			return false;
		if (classType != other.classType)
			return false;
		if (experience != other.experience)
			return false;
		if (gameCenterId == null) {
			if (other.gameCenterId != null)
				return false;
		} else if (!gameCenterId.equals(other.gameCenterId))
			return false;
		if (gems != other.gems)
			return false;
		if (gold != other.gold)
			return false;
		if (hp != other.hp)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastLogin == null) {
			if (other.lastLogin != null)
				return false;
		} else if (!lastLogin.equals(other.lastLogin))
			return false;
		if (lastTimeHpRegened == null) {
			if (other.lastTimeHpRegened != null)
				return false;
		} else if (!lastTimeHpRegened.equals(other.lastTimeHpRegened))
			return false;
		if (lastTimeManaRegened == null) {
			if (other.lastTimeManaRegened != null)
				return false;
		} else if (!lastTimeManaRegened.equals(other.lastTimeManaRegened))
			return false;
		if (level != other.level)
			return false;
		if (mana != other.mana)
			return false;
		if (maxHp != other.maxHp)
			return false;
		if (maxMana != other.maxMana)
			return false;
		if (signupDate == null) {
			if (other.signupDate != null)
				return false;
		} else if (!signupDate.equals(other.signupDate))
			return false;
		if (tonic != other.tonic)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", level=" + level
				+ ", experience=" + experience + ", gold=" + gold + ", tonic="
				+ tonic + ", gems=" + gems + ", classType=" + classType
				+ ", maxHp=" + maxHp + ", hp=" + hp + ", lastTimeHpRegened="
				+ lastTimeHpRegened + ", maxMana=" + maxMana + ", mana=" + mana
				+ ", lastTimeManaRegened=" + lastTimeManaRegened
				+ ", gameCenterId=" + gameCenterId + ", signupDate="
				+ signupDate + ", clanId=" + clanId + ", lastLogin="
				+ lastLogin + "]";
	}

	
	@Override
	public String getTableCreateStatement() {
		return "create table user (" +
				" id uuid," +
				" name varchar," +
				" level int," +
				" experience int," +
				" gold int," +
				" tonic int," +
				" gems int," +
				" class_type int," +
				" max_hp int," +
				" hp int," +
				" last_time_hp_regened timestamp," +
				" max_mana int," +
				" mana int," +
				" last_time_mana_regened timestamp," +
				" game_center_id varchar," +
				" signup_date timestamp," +
				" clan_id int," +
				" last_login timestamp," +
				//" email varchar," +
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
		//indexes.add("create index user_email_index on user (email);");
		indexes.add("create index user_name_index on user (name);");
		indexes.add("create index user_last_login_index on user (last_login);");
		indexes.add("create index user_game_center_id_index on user (game_center_id);");
		return indexes;
	}
	
}
