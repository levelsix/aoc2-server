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
	
	@Column(name="user_name")
	protected String userName = "";
	
	@Column(name="email")
	protected String email = "";
	
	@Column(name="last_login")
	protected Date lastLogin = new Date();
	
	@Column(name="signup_date")
	protected Date signupDate = new Date();
	
	@Column(name="level")
	protected int level = 0;
	
	@Column(name="experience")
	protected int experience = 0;

	@Column(name="gold")
	protected int gold = 0;
	
	@Column(name="tonic")
	protected int tonic = 0;
	
	//in game currency
	@Column(name="diamonds")
	protected int diamonds = 0;
	
	@Column(name="class_type")
	protected int classType = 0;

	@Column(name="max_hp")
	protected int maxHp = 0;
	
	@Column(name="hp")
	protected int hp = 0;
	
	@Column(name="hp_regen_start_time")
	protected Date hpRegenStartTime = new Date();

	@Column(name="max_mana")
	protected int maxMana = 0;
	
	@Column(name="mana")
	protected int mana = 0;
	
	@Column(name="mana_regen_start_time")
	protected Date manaRegenStartTime = new Date();
	
	//if user has a gameCenterId use that id, else generate random string
	@Column(name="game_center_id")
	protected String gameCenterId = "";
	
	@Column(name="clan_id")
	protected int clanId = 0;
	
	@Column(name="weapon_user_equip_id")
	protected int weaponUserEquipId = 0;
	
	@Column(name="lower_body_user_equip_id")
	protected int lowerBodyUserEquipId = 0;
	
	@Column(name="upper_body_user_equip_id")
	protected int upperBodyUserEquipId = 0;

	@Column(name="attack_points")
	protected int attackPoints = 5;
	
	@Column(name="defense_points")
	protected int defensePoints = 5;
	
	@Column(name="last_recovery")
	protected Date lastRecovery = new Date();
	
	
	public Date getLastRecovery() {
		return lastRecovery;
	}
	public void setLastRecovery(Date lastRecovery) {
		this.lastRecovery = lastRecovery;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public Date getSignupDate() {
		return signupDate;
	}
	public void setSignupDate(Date signupDate) {
		this.signupDate = signupDate;
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
	public int getDiamonds() {
		return diamonds;
	}
	public void setDiamonds(int diamonds) {
		this.diamonds = diamonds;
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
	public Date getHpRegenStartTime() {
		return hpRegenStartTime;
	}
	public void setHpRegenStartTime(Date hpRegenStartTime) {
		this.hpRegenStartTime = hpRegenStartTime;
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
	public Date getManaRegenStartTime() {
		return manaRegenStartTime;
	}
	public void setManaRegenStartTime(Date manaRegenStartTime) {
		this.manaRegenStartTime = manaRegenStartTime;
	}
	public String getGameCenterId() {
		return gameCenterId;
	}
	public void setGameCenterId(String gameCenterId) {
		this.gameCenterId = gameCenterId;
	}
	public int getClanId() {
		return clanId;
	}
	public void setClanId(int clanId) {
		this.clanId = clanId;
	}
	public int getWeaponUserEquipId() {
		return weaponUserEquipId;
	}
	public void setWeaponUserEquipId(int weaponUserEquipId) {
		this.weaponUserEquipId = weaponUserEquipId;
	}
	public int getLowerBodyUserEquipId() {
		return lowerBodyUserEquipId;
	}
	public void setLowerBodyUserEquipId(int lowerBodyUserEquipId) {
		this.lowerBodyUserEquipId = lowerBodyUserEquipId;
	}
	public int getUpperBodyUserEquipId() {
		return upperBodyUserEquipId;
	}
	public void setUpperBodyUserEquipId(int upperBodyUserEquipId) {
		this.upperBodyUserEquipId = upperBodyUserEquipId;
	}
	public int getAttackPoints() {
		return attackPoints;
	}
	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}
	public int getDefensePoints() {
		return defensePoints;
	}
	public void setDefensePoints(int defensePoints) {
		this.defensePoints = defensePoints;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attackPoints;
		result = prime * result + clanId;
		result = prime * result + classType;
		result = prime * result + defensePoints;
		result = prime * result + diamonds;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + experience;
		result = prime * result
				+ ((gameCenterId == null) ? 0 : gameCenterId.hashCode());
		result = prime * result + gold;
		result = prime * result + hp;
		result = prime
				* result
				+ ((hpRegenStartTime == null) ? 0 : hpRegenStartTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((lastLogin == null) ? 0 : lastLogin.hashCode());
		result = prime * result
				+ ((lastRecovery == null) ? 0 : lastRecovery.hashCode());
		result = prime * result + level;
		result = prime * result + lowerBodyUserEquipId;
		result = prime * result + mana;
		result = prime
				* result
				+ ((manaRegenStartTime == null) ? 0 : manaRegenStartTime
						.hashCode());
		result = prime * result + maxHp;
		result = prime * result + maxMana;
		result = prime * result
				+ ((signupDate == null) ? 0 : signupDate.hashCode());
		result = prime * result + tonic;
		result = prime * result + upperBodyUserEquipId;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + weaponUserEquipId;
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
		if (attackPoints != other.attackPoints)
			return false;
		if (clanId != other.clanId)
			return false;
		if (classType != other.classType)
			return false;
		if (defensePoints != other.defensePoints)
			return false;
		if (diamonds != other.diamonds)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (experience != other.experience)
			return false;
		if (gameCenterId == null) {
			if (other.gameCenterId != null)
				return false;
		} else if (!gameCenterId.equals(other.gameCenterId))
			return false;
		if (gold != other.gold)
			return false;
		if (hp != other.hp)
			return false;
		if (hpRegenStartTime == null) {
			if (other.hpRegenStartTime != null)
				return false;
		} else if (!hpRegenStartTime.equals(other.hpRegenStartTime))
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
		if (lastRecovery == null) {
			if (other.lastRecovery != null)
				return false;
		} else if (!lastRecovery.equals(other.lastRecovery))
			return false;
		if (level != other.level)
			return false;
		if (lowerBodyUserEquipId != other.lowerBodyUserEquipId)
			return false;
		if (mana != other.mana)
			return false;
		if (manaRegenStartTime == null) {
			if (other.manaRegenStartTime != null)
				return false;
		} else if (!manaRegenStartTime.equals(other.manaRegenStartTime))
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
		if (upperBodyUserEquipId != other.upperBodyUserEquipId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (weaponUserEquipId != other.weaponUserEquipId)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email
				+ ", lastLogin=" + lastLogin + ", signupDate=" + signupDate
				+ ", level=" + level + ", experience=" + experience + ", gold="
				+ gold + ", tonic=" + tonic + ", diamonds=" + diamonds
				+ ", classType=" + classType + ", maxHp=" + maxHp + ", hp="
				+ hp + ", hpRegenStartTime=" + hpRegenStartTime + ", maxMana="
				+ maxMana + ", mana=" + mana + ", manaRegenStartTime="
				+ manaRegenStartTime + ", gameCenterId=" + gameCenterId
				+ ", clanId=" + clanId + ", weaponUserEquipId="
				+ weaponUserEquipId + ", lowerBodyUserEquipId="
				+ lowerBodyUserEquipId + ", upperBodyUserEquipId="
				+ upperBodyUserEquipId + ", attackPoints=" + attackPoints
				+ ", defensePoints=" + defensePoints + ", lastRecovery="
				+ lastRecovery + "]";
	}
	@Override
	public String getTableCreateStatement() {
		return "create table user (" +
				" id uuid," +
				" user_name varchar," +
				" email varchar," +
				" last_login timestamp," +
				" signup_date timestamp," +
				" level int," +
				" experience int," +
				" gold int," +
				" tonic int," +
				" diamonds int," +
				" class_type int," +
				" max_hp int," +
				" hp int," +
				" hp_regen_start_time int," +
				" max_mana int," +
				" mana int," +
				" mana_regen_start_time int," +
				" game_center_id varchar," +
				" clan_id int," +
				" weapon_user_equip_id int," +
				" lower_body_user_equip_id int," +
				" upper_body_user_equip_id int," +
				" attack_points int," +
				" defense_points int," +
				" last_recovery timestamp," +
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
		indexes.add("create index user_email_index on user (email);");
		indexes.add("create index user_user_name_index on user (user_name);");
		indexes.add("create index user_last_login_index on user (last_login);");
		return indexes;
	}
	

	
	
	
	
	
}
