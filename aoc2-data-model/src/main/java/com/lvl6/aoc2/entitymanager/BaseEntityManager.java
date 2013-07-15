package com.lvl6.aoc2.entitymanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.ImmutableMap;
import com.lvl6.aoc2.cassandra.Cassandra;
import com.netflix.astyanax.Serializer;
import com.netflix.astyanax.connectionpool.exceptions.ConnectionException;
import com.netflix.astyanax.entitystore.DefaultEntityManager;
import com.netflix.astyanax.entitystore.EntityManager;
import com.netflix.astyanax.model.ColumnFamily;
import com.netflix.astyanax.serializers.SerializerTypeInferer;
import com.netflix.astyanax.serializers.StringSerializer;

abstract public class BaseEntityManager<Clas, Ky>  implements InitializingBean{

	
	private static final Logger log = LoggerFactory.getLogger(BaseEntityManager.class);
	
	@Autowired
	protected Cassandra cassandra;
	
	protected  ColumnFamily<Ky, String> columnFamily;// = new ColumnFamily<Ky, Col>("users", UUIDSerializer.get(), StringSerializer.get());;
	
	protected Class<Clas> type;
	protected Class<Ky> key;

    public BaseEntityManager(Class<Clas> type, Class<Ky> key) { 
    	this.type = type; 
    	this.key = key;
    }
	
	
	protected EntityManager<Clas, Ky> em;
	
	public BaseEntityManager() {
		super();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		createColumnFamily();
		setupEntityManager();
	}

	
	protected Serializer<Ky> getSerializer(){
		return SerializerTypeInferer.getSerializer(key);
	}
	

	protected void createColumnFamily() throws ConnectionException {
		try {
		columnFamily = new ColumnFamily<Ky, String>(type.getSimpleName().toLowerCase(), getSerializer(), StringSerializer.get());
		cassandra.getKeyspace().createColumnFamily(columnFamily, getIndexes());
		}catch(Exception e) {
			log.info("Column family {} already exists", columnFamily.getName());
		}
	}

	
	protected void setupEntityManager() throws ConnectionException{
		log.info("Building entity manager for {} and keyspace {}", type.getSimpleName(), cassandra.getKeyspace().getKeyspaceName());
		em = new DefaultEntityManager.Builder<Clas, Ky>()
		.withEntityType(type)
		.withKeyspace(cassandra.getKeyspace())
		.withColumnFamily(columnFamily)
		.withAutoCommit(true)
		.build();
	}
	

	
	abstract protected ImmutableMap<String, Object> getIndexes();

	protected ImmutableMap<String, Object> getIndexProps(String propertyName) {
		return ImmutableMap.<String, Object>builder()
	    .put("validation_class", "UTF8Type")
	    .put("index_name",       getClass().getName().toLowerCase()+"_"+propertyName+"_index")
	    .put("index_type",       "KEYS")
	    .build();
	}

	public EntityManager<Clas, Ky> getEm() {
		return em;
	}

	public void setEm(EntityManager<Clas, Ky> em) {
		this.em = em;
	}

	public EntityManager<Clas, Ky> get() {
		return getEm();
	}
	
	
	public Cassandra getCassandra() {
		return cassandra;
	}

	public void setCassandra(Cassandra cassandra) {
		this.cassandra = cassandra;
	}
	
	
	public ColumnFamily<Ky, String> getColumnFamily() {
		return columnFamily;
	}

	public void setColumnFamily(ColumnFamily<Ky, String> columnFamily) {
		this.columnFamily = columnFamily;
	}
	
	



}