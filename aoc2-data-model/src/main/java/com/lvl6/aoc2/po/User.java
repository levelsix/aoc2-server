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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
				+ upperBodyUserEquipId + "]";
	}
	
	
	@Override
	public String getTableCreateStatement() {
		return "create table user (" +
				" id uuid," +
				" user_name varchar," +
				" email varchar," +
				" last_login timestamp," +
				" signup_date timestamp," +
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
