package com.lvl6.aoc2.cassandra;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.google.common.collect.ImmutableMap;
import com.netflix.astyanax.AstyanaxContext;
import com.netflix.astyanax.Keyspace;
import com.netflix.astyanax.connectionpool.NodeDiscoveryType;
import com.netflix.astyanax.connectionpool.exceptions.ConnectionException;
import com.netflix.astyanax.connectionpool.impl.ConnectionPoolConfigurationImpl;
import com.netflix.astyanax.connectionpool.impl.CountingConnectionPoolMonitor;
import com.netflix.astyanax.impl.AstyanaxConfigurationImpl;
import com.netflix.astyanax.thrift.ThriftFamilyFactory;

@Component
public class Cassandra implements InitializingBean {

	protected String clusterName;
	protected String keyspaceName;
	protected String cqlVersion;
	protected String targetCassandraVersion;
	protected String connectionPoolName;
	protected String seeds;
	protected Integer connectionsPerHost = 20;
	protected Integer port = 9160;

	protected AstyanaxContext<Keyspace> context;
	protected Keyspace keyspace;

	@Override
	public void afterPropertiesSet() throws Exception {
		setupContext();
	}

	protected void setupContext() {
		context = new AstyanaxContext.Builder()
				.forCluster(getClusterName())
				.forKeyspace(getKeyspaceName())
				.withAstyanaxConfiguration(
						new AstyanaxConfigurationImpl().setDiscoveryType(NodeDiscoveryType.RING_DESCRIBE)
								.setCqlVersion(getCqlVersion())
								.setTargetCassandraVersion(getTargetCassandraVersion()))
				.withConnectionPoolConfiguration(
						new ConnectionPoolConfigurationImpl(getConnectionPoolName()).setPort(getPort())
								.setMaxConnsPerHost(getConnectionsPerHost()).setSeeds(getSeeds()))
				.withConnectionPoolMonitor(new CountingConnectionPoolMonitor())
				.buildKeyspace(ThriftFamilyFactory.getInstance());
		keyspace = context.getClient();
	}

	//TODO: setup replication
	protected void setupKeyspace() throws ConnectionException {
		getKeyspace().createKeyspace(ImmutableMap
			.<String, Object> builder()
			.put("strategy_options",
				ImmutableMap.<String, Object> builder().put("replication_factor", "1")
				.build())
			.put("strategy_class", "SimpleStrategy")
			.build());
	}

	
	
	
	
	public String getClusterName() {
		return clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getKeyspaceName() {
		return keyspaceName;
	}

	public void setKeyspaceName(String keyspaceName) {
		this.keyspaceName = keyspaceName;
	}

	public String getCqlVersion() {
		return cqlVersion;
	}

	public void setCqlVersion(String cqlVersion) {
		this.cqlVersion = cqlVersion;
	}

	public String getTargetCassandraVersion() {
		return targetCassandraVersion;
	}

	public void setTargetCassandraVersion(String targetCassandraVersion) {
		this.targetCassandraVersion = targetCassandraVersion;
	}

	public String getConnectionPoolName() {
		return connectionPoolName;
	}

	public void setConnectionPoolName(String connectionPoolName) {
		this.connectionPoolName = connectionPoolName;
	}

	public String getSeeds() {
		return seeds;
	}

	public void setSeeds(String seeds) {
		this.seeds = seeds;
	}

	public Integer getConnectionsPerHost() {
		return connectionsPerHost;
	}

	public void setConnectionsPerHost(Integer connectionsPerHost) {
		this.connectionsPerHost = connectionsPerHost;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public AstyanaxContext<Keyspace> getContext() {
		return context;
	}

	public void setContext(AstyanaxContext<Keyspace> context) {
		this.context = context;
	}

	public Keyspace getKeyspace() {
		return keyspace;
	}

	public void setKeyspace(Keyspace keyspace) {
		this.keyspace = keyspace;
	}

}
