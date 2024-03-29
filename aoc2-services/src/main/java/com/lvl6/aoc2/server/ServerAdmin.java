package com.lvl6.aoc2.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hazelcast.core.Message;
import com.hazelcast.core.MessageListener;

public class ServerAdmin implements MessageListener<ServerMessage> {

	Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void onMessage(Message<ServerMessage> arg0) {
		// TODO Auto-generated method stub
		
	}

/*	protected JdbcTemplate jdbc;
	
	
	@Resource(name="serverMessagesTemplate")
	protected RabbitTemplate serverMessagesTemplate;
	public RabbitTemplate getServerMessagesTemplate() {
		return serverMessagesTemplate;
	}
	public void setServerMessagesTemplate(RabbitTemplate serverMessagesTemplate) {
		this.serverMessagesTemplate = serverMessagesTemplate;
	}

	@Resource
	protected ApplicationMode appMode;
	public ApplicationMode getAppMode() {
		return appMode;
	}
	public void setAppMode(ApplicationMode appMode) {
		this.appMode = appMode;
	}

	@Resource
	public void setDataSource(DataSource dataSource) {
		log.info("Setting datasource and creating jdbcTemplate");
		this.jdbc = new JdbcTemplate(dataSource);
	}

	@Resource(name = "controllersExecutor")
	protected TaskExecutor executor;

	public TaskExecutor getExecutor() {
		return executor;
	}

	public void setExecutor(TaskExecutor executor) {
		this.executor = executor;
	}

	@Autowired
	protected LeaderBoardUtil leaderboard;

	public LeaderBoardUtil getLeaderboard() {
		return leaderboard;
	}

	public void setLeaderboard(LeaderBoardUtil leaderboard) {
		this.leaderboard = leaderboard;
	}

	@Resource(name = "playersByPlayerId")
	Map<Integer, ConnectedPlayer> players;

	@Resource(name = "serverEvents")
	protected ITopic<ServerMessage> serverEvents;

	@Resource(name = "staticDataReloadDone")
	protected ITopic<ServerMessage> staticDataReloadDone;

	@Resource(name = "eventWriter")
	protected EventWriter writer;

	@Autowired
	protected HazelcastInstance hazel;

	public HazelcastInstance getHazel() {
		return hazel;
	}

	public void setHazel(HazelcastInstance hazel) {
		this.hazel = hazel;
	}

	public ITopic<ServerMessage> getStaticDataReloadDone() {
		return staticDataReloadDone;
	}

	public void setStaticDataReloadDone(ITopic<ServerMessage> staticDataReloadDone) {
		this.staticDataReloadDone = staticDataReloadDone;
	}

	public Map<Integer, ConnectedPlayer> getPlayers() {
		return players;
	}

	public void setPlayers(Map<Integer, ConnectedPlayer> players) {
		this.players = players;
	}

	public ITopic<ServerMessage> getServerEvents() {
		return serverEvents;
	}

	public void setServerEvents(ITopic<ServerMessage> serverEvents) {
		this.serverEvents = serverEvents;
	}

	public EventWriter getWriter() {
		return writer;
	}

	public void setWriter(EventWriterSockets writer) {
		this.writer = writer;
	}

	protected Integer instanceCountForDataReload = 0;
	protected Integer instancesDoneReloadingCount = 0;
	protected ILock instancesReloadingLock;

	public void reloadAllStaticData() {
		instancesDoneReloadingCount = 0;
		instanceCountForDataReload = getHazel().getCluster().getMembers().size();
		log.info("Reloading all static data for cluster instances: " + instanceCountForDataReload);
		instancesReloadingLock = hazel.getLock(ServerMessage.RELOAD_STATIC_DATA);
		try {
			instancesReloadingLock.tryLock(20, TimeUnit.SECONDS);
			getStaticDataReloadDone().addMessageListener(this);
			serverEvents.publish(ServerMessage.RELOAD_STATIC_DATA);
		} catch (InterruptedException e) {
			log.error("Could not obtain lock for reloading instances", e);
		}
	}

	public void reloadLeaderboard() {
		UserRetrieveUtils uru = RetrieveUtils.userRetrieveUtils();
		int count = uru.countUsers(false);
		log.info("Loading leaderboard stats for {} users", count);
		List<Integer> ids = jdbc.query("select " + DBConstants.USER__ID + " from " + DBConstants.TABLE_USER
				+ " where " + DBConstants.USER__IS_FAKE + "=0", new RowMapper<Integer>() {
			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getInt(DBConstants.USER__ID);
			}
		});
		Map<Integer, User> users = uru.getUsersByIds(ids);
		for (final User usr : users.values()) {
			executor.execute(new Runnable() {
				@Override
				public void run() {
					try {
						leaderboard.updateLeaderboardForUser(usr);
					} catch (Exception e) {
						log.error("Error updating leaderboard for user: {}", usr.getId(), e);
					}
				}
			});
		}
	}
	
	public void setApplicationMode(Boolean maintenanceMode, String messageForUsers) {
		log.info("Setting application maintenance mode: {} message: {}", maintenanceMode, messageForUsers);
		appMode.setMaintenanceMode(maintenanceMode);
		appMode.setMessageForUsers(messageForUsers);
		serverMessagesTemplate.convertAndSend(appMode);
	}
	

	protected void sendPurgeStaticDataNotificationToAllClients() {
		Set<Integer> keySet = players.keySet();
		if (keySet != null) {
			Iterator<Integer> playas = keySet.iterator();
			log.info("Sending purge static data notification to clients: " + keySet.size());
			while (playas.hasNext()) {
				Integer playa = playas.next();
				PurgeClientStaticDataResponseEvent pcsd = new PurgeClientStaticDataResponseEvent(playa);
				pcsd.setPurgeClientStaticDataResponseProto(PurgeClientStaticDataResponseProto.newBuilder()
						.setSenderId(playa).build());
				writer.handleEvent(pcsd);
			}
		}
	}

	@Override
	public void onMessage(Message<ServerMessage> msg) {
		if (msg.getMessageObject().equals(ServerMessage.DONE_RELOADING_STATIC_DATA)) {
			instancesDoneReloadingCount++;
			log.info("Instance done reloading static data: {}/{}", instancesDoneReloadingCount,
					instanceCountForDataReload);
			if (instancesDoneReloadingCount >= instanceCountForDataReload
					|| instancesDoneReloadingCount >= getHazel().getCluster().getMembers().size()) {
				log.info("All instances done reloading static data");
				getStaticDataReloadDone().removeMessageListener(this);
				sendPurgeStaticDataNotificationToAllClients();
				instancesReloadingLock.forceUnlock();
				instancesReloadingLock = null;
			}
		}
	}*/

}
