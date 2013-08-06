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
	
<<<<<<< HEAD

=======
	
	
	
	
>>>>>>> c9f0a5040624e8a07be15c0acf1ba25ab01e2516
	
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
