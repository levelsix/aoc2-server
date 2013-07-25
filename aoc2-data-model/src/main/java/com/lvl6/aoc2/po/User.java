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
	
	@Column(name="email")
	protected String email = "";
	
	
	
	
	@Override
	public String getTableCreateStatement() {
		return "create table user (" +
				" id uuid," +
				" user_name varchar," +
				" level int," +
				" experience int," +
				" gold int," +
				" tonic int," +
				" gems int," +
				" class_type int," +
				" max_hp int," +
				" hp int," +
				" last_time_hp_regened int," +
				" max_mana int," +
				" mana int," +
				" last_time_mana_regened int," +
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
		indexes.add("create index user_email_index on user (email);");
		indexes.add("create index user_user_name_index on user (user_name);");
		indexes.add("create index user_last_login_index on user (last_login);");
		indexes.add("create index user_game_center_id_index on user (game_center_id);");
		return indexes;
	}
	

	
	
	
	
	
}
