//package com.lvl6.aoc2.controller;
//
//import java.util.ArrayList;
//import java.util.Currency;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.UUID;
//
//import org.joda.time.DateTime;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.lvl6.aoc2.eventprotos.ForceLogoutEventProto.ForceLogoutResponseProto;
//import com.lvl6.aoc2.eventprotos.StartupEventProto.StartupRequestProto;
//import com.lvl6.aoc2.eventprotos.StartupEventProto.StartupRequestProto.LoginType;
//import com.lvl6.aoc2.eventprotos.StartupEventProto.StartupResponseProto;
//import com.lvl6.aoc2.eventprotos.StartupEventProto.StartupResponseProto.Builder;
//import com.lvl6.aoc2.eventprotos.StartupEventProto.StartupResponseProto.StartupStatus;
//import com.lvl6.aoc2.events.RequestEvent;
//import com.lvl6.aoc2.events.request.StartupRequestEvent;
//import com.lvl6.aoc2.events.response.ForceLogoutResponseEvent;
//import com.lvl6.aoc2.events.response.StartupResponseEvent;
//import com.lvl6.aoc2.noneventprotos.AocTwoEventProtocolProto.AocTwoEventProtocolRequest;
//import com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto;
//import com.lvl6.aoc2.po.User;
//import com.lvl6.aoc2.po.UserDevice;
//import com.lvl6.aoc2.services.user.UserService;
//import com.lvl6.aoc2.services.userdevice.UserDeviceService;
//
//
//@Component
//public class StartupController extends EventController {
//
//	private static Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());
//	
//	@Autowired
//	protected UserDeviceService userDeviceService;
//	
//	@Autowired
//	protected UserService userService;
//
//
//	@Override
//	public RequestEvent createRequestEvent() {
//		return new StartupRequestEvent();
//	}
//
//	@Override
//	public int getEventType() {
//		return AocTwoEventProtocolRequest.C_STARTUP_EVENT_VALUE;
//	}
//
//	@Override
//	@Transactional
//	protected void processRequestEvent(RequestEvent event) throws Exception {
//		StartupRequestProto reqProto = ((StartupRequestEvent) event).getStartupRequestProto();
//		DateTime loginTime = new DateTime();
//		//log.info("reqProto=" + reqProto);
//
//		MinimumUserProto mup = reqProto.getMup(); //mup might not have userId
//		LoginType lt = reqProto.getLoginType();
//		String gameCenterId = reqProto.getMup().getGameCenterId();
//		String udid = reqProto.getMup().getUdid();
//		
//		//List<String> facebookFriendIds = reqProto.getFacebookFriendIdsList();
//		
//
//		//response to send back to client
//		StartupResponseProto.Builder responseBuilder = StartupResponseProto.newBuilder();
//		responseBuilder.setStatus(StartupStatus.FAIL_OTHER);
//		StartupResponseEvent resEvent = new StartupResponseEvent(udid);
//		resEvent.setTag(event.getTag());
//
//		//mup object might not have userId if user deleted app or something
//		List<User> userList = new ArrayList<User>();
//
//		try {
//			
//			boolean validRequestArgs = isValidRequestArgs(responseBuilder,
//					mup, lt, gameCenterId, udid);
//			
//			boolean validRequest = false;
//			boolean successful = false;
//			
//			if (validRequestArgs) {
//				validRequest = isValidRequest(responseBuilder, mup, lt,
//						gameCenterId, udid, loginTime, userList);
//			}
//
//			if (validRequest) {
//				successful = writeChangesToDb(responseBuilder, mup,
//						gameCenterId, loginTime, udid, userList);
//			}
//
//			if (successful) {
//				//need to set in responseBuilder the collection of picture names
//				Set<String> allPictureNames = new HashSet<String>();
//
//				//set the recipient
//				//responseBuilder.setRecipient(cupb); //done in writeChangesToDb
//
//				String userId = responseBuilder.getRecipient().getUserId(); 
//				// GET ALL THE COMPLETED GAMES THAT FINISHED SOME TIME AGO,
//				// OR MIN DEFAULT NUMBER OF GAMES
//				setCompletedGames(responseBuilder, userId);
//
//				// GET ALL THE GAMES THAT ARE THE USER'S TURN
//				// GET ALL THE GAMES THAT ARE THE OPPONENT'S TURN
//				setOngoingGames(responseBuilder, userId, allPictureNames);
//
//				// CONSTRUCT THE NEW TRIVIA QUESTIONS
//				setNewQuestions(responseBuilder, userId, allPictureNames);
//
//				//easier for client to get the pictures to display to the user
//				responseBuilder.addAllPictureNames(allPictureNames);
//
//				if (LoginType.LOGIN_TOKEN == lt) {
//					responseBuilder.setStatus(StartupStatus.SUCCESS_LOGIN_TOKEN);
//				}
//				if (LoginType.EMAIL_PASSWORD == lt) {
//					responseBuilder.setStatus(StartupStatus.SUCCESS_EMAIL_PASSWORD);
//				}
//				if (LoginType.FACEBOOK == lt) {
//					// CONSTRUCT THE BASIC USER PROTOS FOR THIS USER'S FACEBOOK FRIENDS
//					responseBuilder.setStatus(StartupStatus.SUCCESS_FACEBOOK_ID);
//				}
//				if (LoginType.NO_CREDENTIALS == lt) {
//					responseBuilder.setStatus(StartupStatus.SUCCESS_NO_CREDENTIALS);
//				}
//				setFacebookFriends(responseBuilder, facebookFriendIds);
//			}
//
//			//TODO: CONSTRUCT THE LOGIN CONSTANTS
//			//set the login constants
//			setConstants(responseBuilder);
//
//			StartupResponseProto resProto = responseBuilder.build();
//			resEvent.setStartupResponseProto(resProto);
//			log.info("resProto completedGames=" + resProto.getCompletedGamesList());
//			log.info("resProto myTurn=" + resProto.getMyTurnList());
//			log.info("resProto notMyTurn=" + resProto.getNotMyTurnList());
//
//
//			log.info("Writing event: " + resEvent);
//			getEventWriter().processPreDBResponseEvent(resEvent, udid);
//		} catch (Exception e) {
//			log.error("exception in LoginController processRequestEvent", e);
//
//			try {
//				//try to tell client that something failed
//				responseBuilder.setStatus(StartupStatus.FAIL_OTHER);
//				resEvent.setStartupResponseProto(responseBuilder.build());
//				getEventWriter().processPreDBResponseEvent(resEvent, udid);
//
//			} catch (Exception e2) {
//				log.error("exception2 in RetrieveNewQuestionsController" +
//						" processRequestEvent", e2);
//			}
//		}
//	}
//	
//	private boolean isValidRequestArgs(Builder responseBuilder, 
//			MinimumUserProto mup, LoginType lt, String gameCenterId,
//			String udid) {
//		
//		if (LoginType.GAME_CENTER_ID == lt) {
//			if (null == gameCenterId || gameCenterId.isEmpty()) {
//				log.error("client error: login type is game center. " +
//						"\t gameCenterId=" + gameCenterId + " mup=" + mup);
//				return false;
//			}	
//		} else if (LoginType.UDID == lt) {
//			//all client devices should have a udid
//			if (null == udid || udid.isEmpty()) {
//				log.error("client error: maybe null udid. udid=" + udid
//						+ "\t mup=" + mup);
//				return false;
//			}
//		} else {
//			return false;
//		}
//		
//		return true;
//	}
//
//	private boolean isValidRequest(Builder responseBuilder, MinimumUserProto mup,
//			LoginType lt, String gameCenterId, String udid, DateTime loginTime,
//			List<User> userList) throws Exception {
//		if (LoginType.GAME_CENTER_ID == lt) {
//			return isValidGameCenterId(responseBuilder, mup, loginTime,
//					gameCenterId, udid, userList);
//		}
//		if (LoginType.UDID == lt) {
//			return isValidUdid(responseBuilder, mup, loginTime,
//					gameCenterId, udid, userList);
//		}
////		if (LoginType.FACEBOOK == lt) {
////			return isValidFacebookLogin(responseBuilder, mup, userList);
////		}
////		if (LoginType.EMAIL_PASSWORD == lt) {
////			return isValidEmailPasswordLogin(responseBuilder, mup, userList);
////		}
////		if (LoginType.NO_CREDENTIALS == lt) {
////			return isValidNoCredentialsLogin(responseBuilder, mup, userList);
////		}
//		log.error("unexpected error: loginType=" + lt);
//		return false;
//	}
//
//	//Game center id is only used to link a new device with an existing account.
//
//	//Example 
//	//UserA starts new game on deviceA. 
//	//UserA starts game on deviceB. User has a choice to login to game center 
//	//and reuse existing account or just continue with a new account. 
//	//After this point if the user tries linking this account, on deviceB,
//	//to game center then only this account can be reproduced on other accounts
//	private boolean isValidGameCenterId(Builder responseBuilder,
//			MinimumUserProto mup, DateTime loginTime, String gameCenterId,
//			String udid, List<User> userList) throws Exception {
//		log.info("game center id validation");
//
//		//find user with game center id
//		User u = getUserService().retrieveUser(gameCenterId, null);
//		
//		if (null != u) {
//			//found user with specified game center id
//			userList.add(u);
//			responseBuilder.setStatus(StartupStatus.SUCCESS_GAME_CENTER_ID);
//			
//		} else {
//			//none. find user tied to the udid
//			u = getUserService().retrieveUserForUdid(udid);
//			
//			if (null != u) {
//				//found user with udid
//				userList.add(u);
//				responseBuilder.setStatus(StartupStatus.SUCCESS_UDID);
//			}
//		}
//			
//		if (null == u) {
//			//no user with game center id nor udid, signal new user
//			responseBuilder.setStatus(StartupStatus.SUCCESS_NEW_USER);
//		} else {
//			userList.add(u);
//		}
//		return true;
//	}
//	
//	private boolean isValidUdid(Builder responseBuilder,
//			MinimumUserProto mup, DateTime loginTime, String gameCenterId,
//			String udid, List<User> userList) throws Exception {
//		log.info("udid validation");
//		
//		User u = getUserService().retrieveUserForUdid(udid);
//		
//		if (null == u) {
//			responseBuilder.setStatus(StartupStatus.SUCCESS_NEW_USER);
//		} else {
//			userList.add(u);
//			responseBuilder.setStatus(StartupStatus.SUCCESS_UDID);
//		}
//		
//		return true;
//	}
//	
//
//
//	private boolean writeChangesToDb(Builder responseBuilder,
//			MinimumUserProto mup, String gameCenterId,
//			DateTime loginTime, String udid, List<User> uList) {
//		Date loginDate = loginTime.toDate();
//		
//		User u;
//		if (responseBuilder.getStatus() == StartupStatus.SUCCESS_NEW_USER) {
//			u = getUserService().createNewUser(gameCenterId, loginTime, udid);
//		} else {
//			 u = uList.get(0);
//		}
//		//TODO: CHECK IF MULTIPLE DEVICES SHARE THIS ACCOUNT
//		Map<String, UserDevice> udidsToDevices = bootOtherDevicesSharingAccount(u, udid);
//		
//		//give the user the initial currency and stuff
//		initializeUser(u, loginDate);
//		
////		UUID userId = u.getId();
//		// TODO:RECORD THE USER LOGGING IN (UPDATING THE USER_DEVICE TABLE)
//		updateUserLogin(udidsToDevices, udid, loginDate);
//
////		CompleteUserProto cupb = 
////				getNoneventProtoUtils().createCompleteUserProto(u, ad, monies);
////		//set the recipient
////		responseBuilder.setRecipient(cupb);
//
//		//log.info("\t\t completeUserProto=" + cupb);
//
//		return true;
//	}
//	
//	//if another device, device1, is on in the foreground then device1 gets kicked off
//	//if device1 is in the background but in the dungeon, user is penalized 
//	//and device1 will startup regularly, not in the dungeon.
//	private Map<String, UserDevice> bootOtherDevicesSharingAccount(User u, String udid) {
//		UUID userId = u.getId();
//		String userIdStr = userId.toString();
//		Map<String, UserDevice> udidsToDevices = 
//				getUserDeviceService().getUdidsToDevicesForUser(userId);
//		
//		boolean exitDungeon = false;
//		
//		//for each device that is not this device,
//		//"kick them off" and make the user exit the dungeon
//		for (String targetUdid : udidsToDevices.keySet()) {
//			if (udid.equals(targetUdid)) {
//				continue;
//			}
//			if (!exitDungeon) {
//				exitDungeon = true;
//			}
//			
//			ForceLogoutResponseEvent flre = new ForceLogoutResponseEvent(targetUdid);
//			ForceLogoutResponseProto.Builder flrpb = ForceLogoutResponseProto.newBuilder();
//			flrpb.setUserId(userIdStr);
//			flrpb.setUdid(udid);
//			
//			flre.setForceLogoutResponseProto(flrpb.build());
//			getEventWriter().processPreDBResponseEvent(flre, udid);
//		}
//		
//		if (exitDungeon) {
//			//TODO: kick the user out of the dungeon and
//			//penalize him for doing so
//			
//		}
//		
//		return udidsToDevices;
//	}
//	
//	private User initializeUser(User u, Date loginDate) {
//		if (u.isAccountInitialized()) {
//			return u;
//		}
//		getUserService().initializeUser(u, loginDate);
//		
//		return u;
//	}
//	
//	private void updateUserLogin(Map<String, UserDevice> udidsToDevices,
//			String currentUdid, Date loginDate) {
//		
//	}
//
//	private void kickOffOtherDevicesSharingAccount(String userId, AuthorizedDevice ad) {
//		List<AuthorizedDevice> otherDevices = 
//				getAuthorizedDeviceService().devicesSharingUserAccount(userId, ad);
//
//		//send responses to clients telling them to log out immediately
//		//TODO: IMPROVE THIS IF POSSIBLE (userId for client to make sure this event is intended for them)
//		for (AuthorizedDevice anAuthorizedDevice : otherDevices) {
//			String udid = anAuthorizedDevice.getUdid();
//			ForceLogoutResponseEvent flre = new ForceLogoutResponseEvent(udid);
//			ForceLogoutResponseProto.Builder flrpb =
//					ForceLogoutResponseProto.newBuilder().setUserId(userId);
//			flre.setForceLogoutResponseProto(flrpb.build());
//			getEventWriter().processPreDBResponseEvent(flre, udid);
//		}
//
//	}
//
//	private void setFacebookFriends(Builder responseBuilder, List<String> facebookFriendIds) {
//		//log.info("\t\t facebookFriendIds=" + facebookFriendIds);
//		if (null == facebookFriendIds || facebookFriendIds.isEmpty()) {
//			return;
//		}
//		List<MinimumUserProto> bupList = new ArrayList<MinimumUserProto>();
//
//		List<User> uList = getLoginService().getFacebookUsers(facebookFriendIds);
//		//construct the protos for the users
//		for (User u : uList) {
//			AuthorizedDevice adNull = null;
//			MinimumUserProto bup = getNoneventProtoUtils().createMinimumUserProto(u, adNull, null);
//			bupList.add(bup);
//		}
//
//		//log.info("\t\t sent facebookFriends=" + uList);
//		responseBuilder.addAllFacebookFriendsWithAccounts(bupList);
//	}
//
//	private void setCompletedGames(Builder responseBuilder, String userId) {
//		List<GameHistory> completedGames =
//				getGameHistoryService().getCompletedGamesForUser(userId);
//		if (null == completedGames || completedGames.isEmpty()) {
//			log.info("there are no completed games");
//			return;
//		}
//		log.info("\t\t completedGames=" + completedGames.size());
//		log.info("\t endTime=" + completedGames.get(0).getEndTime());
//
//		Map<String, MinimumUserProto> idsToBups = getNoneventProtoUtils()
//				.createIdsToMinimumUserProtos(completedGames);
//
//		List<GameResultsProto> ghpList = getNoneventProtoUtils().createGameResultsProtos(
//				completedGames, idsToBups);
//
//		responseBuilder.addAllCompletedGames(ghpList);
//	}
//
//	//allPicNames is filled up and returned
//	private void setOngoingGames(Builder responseBuilder, String userId,
//			Set<String> allPictureNames) {
//		Set<String> allUserIds = new HashSet<String>();
//		List<GameHistory> allMyTurn = new ArrayList<GameHistory>();
//		List<GameHistory> allNotMyTurn = new ArrayList<GameHistory>();
//
//		boolean anyOngoingGames = getGameHistoryService().getOngoingGamesForUser(
//				userId, allPictureNames, allUserIds, allMyTurn, allNotMyTurn);
//		if (!anyOngoingGames) {
//			log.info("no ongoing games for user");
//			return;
//		}
//		//create the MinimumUserProtos for all the users in the completed games
//		//so the client can display them if desired
//		Map<String, MinimumUserProto> idsToBups = 
//				getNoneventProtoUtils().createIdsToMinimumUserProtos(allUserIds);
//
//		//log.info("allMyTurn=" + allMyTurn);
//		//log.info("allNotMyTurn=" + allNotMyTurn);
//
//		boolean isUserTurn = true;
//		//create the ongoing game protos
//		List<OngoingGameProto> myTurnProtos = getNoneventProtoUtils().createOngoingGameProtosForUser(
//				allMyTurn, idsToBups, userId, isUserTurn);
//		isUserTurn = false;
//		List<OngoingGameProto> notMyTurnProtos = getNoneventProtoUtils().createOngoingGameProtosForUser(
//				allNotMyTurn, idsToBups, userId, isUserTurn);
//
//		//initially user does not have any games
//		if (null != myTurnProtos && !myTurnProtos.isEmpty()) {
//			responseBuilder.addAllMyTurn(myTurnProtos);
//			//log.info("allMyTurnProtos=" + allMyTurn.size());
//		}
//		if (null != notMyTurnProtos && !notMyTurnProtos.isEmpty()) {
//			responseBuilder.addAllNotMyTurn(notMyTurnProtos);
//			//log.info("allNotMyTurnProtos=" + allNotMyTurn.size());
//		}
//	}
//
//	private void setNewQuestions(Builder responseBuilder, String userId,
//			Set<String> allPictureNames) {
//		List<QuestionProto> newQuestions = new ArrayList<QuestionProto>();
//		//get all the questions the user has not seen yet
//		//TODO: IDEALLY ONES THAT HAVE NOT BEEN GIVEN TO THE USER ALREADY
//		//BUT GO RANDOM FOR NOW
//		//get all the other questions prioritized by 
//		//TODO: IDEALLY
//		//1) time user last answered it
//		//2) number of times user answered it
//		//or some heuristic regarding the two
//		//BUT GO RANDOM FOR NOW
//
//		int amount =
//				PicturesPoConstants.QUESTION_BASE__DEFAULT_NUM_QUESTIONS_TO_GET;
//		List<QuestionBase> questions =
//				getQuestionBaseService().getRandomQuestions(amount, allPictureNames);
//
//		if (null != questions && !questions.isEmpty()) {
//			for(QuestionBase qb : questions) {
//				QuestionProto proto =
//						getNoneventProtoUtils().createQuestionProto(qb);
//				newQuestions.add(proto);
//			}
//			//log.info("newQuestions=" + newQuestions);
//			//set responseBuilder
//			responseBuilder.addAllNewQuestions(newQuestions);
//		}
//	}
//
//
//	private void setConstants(Builder responseBuilder) {
////		LoginConstants.Builder lcb = LoginConstants.newBuilder();
////		CurrencyConstants cc = getCurrencyConstants();
////		RoundConstants rc = getRoundConstants();
////		QuestionTypeScoringConstants qtsc = getQuestionTypeScoringConstants();
////
////		lcb.setCurrencyConstants(cc);
////		lcb.setRoundConstants(rc);
////		lcb.setScoreTypes(qtsc);
//
//		responseBuilder.setLoginConstants(lcb.build());
//	}
//
//	public UserDeviceService getUserDeviceService() {
//		return userDeviceService;
//	}
//
//	public void setUserDeviceService(UserDeviceService userDeviceService) {
//		this.userDeviceService = userDeviceService;
//	}
//
//	public UserService getUserService() {
//		return userService;
//	}
//
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}
//
//
//}
