//package com.lvl6.aoc2.controller;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import org.joda.time.DateTime;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.lvl6.aoc2.eventprotos.StartupEventProto.StartupRequestProto;
//import com.lvl6.aoc2.eventprotos.StartupEventProto.StartupRequestProto.LoginType;
//import com.lvl6.aoc2.eventprotos.StartupEventProto.StartupResponseProto;
//import com.lvl6.aoc2.eventprotos.StartupEventProto.StartupResponseProto.Builder;
//import com.lvl6.aoc2.eventprotos.StartupEventProto.StartupResponseProto.StartupStatus;
//import com.lvl6.aoc2.events.RequestEvent;
//import com.lvl6.aoc2.events.request.StartupRequestEvent;
//import com.lvl6.aoc2.events.response.StartupResponseEvent;
//import com.lvl6.aoc2.noneventprotos.AocTwoEventProtocolProto.AocTwoEventProtocolRequest;
//import com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto;
//import com.lvl6.aoc2.po.User;
//
//
//@Component
//public class StartupController extends EventController {
//
//	private static Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());
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
//				userList = getUser(userIdList, userList);
//				successful = writeChangesToDb(responseBuilder, mup, lt,
//						loginTime, userList);
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
//			List<User> userList) {
//		if (LoginType.GAME_CENTER_ID == lt) {
//			return isValidGameCenterId(responseBuilder, mup, loginTime,
//					gameCenterId, udid, userList);
//		}
//		if (LoginType.UDID == lt) {
//			
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
//	private boolean isValidGameCenterId(Builder responseBuilder, MinimumUserProto mup,
//			DateTime loginTime, String gameCenterId, String udid, List<User> userList) {
//		log.info("game center id validation");
//		String userId = mup.getUserID();
//		
//		return false;
//	}
//
//	private boolean isValidFacebookLogin(Builder responseBuilder, MinimumUserProto mup,
//			List<User> userObjList) {
//		log.info("facebook login validation");
//		String facebookId = mup.getFacebookId();
//		String nameNull = null;
//		String emailNull = null;
//		String udidNull = null;
//		List<User> userList = getUserSignupService().checkForExistingUser(facebookId, nameNull,
//				emailNull, udidNull);
//		if (null != userList && userList.size() == 1) {
//			//could check if some values matched...but what if user deleted app
//			//set userId because what if user deleted app?
//			userObjList.addAll(userList);
//			return true;
//		}
//		log.error("unexpected error: users in db with facebookId=" + facebookId + 
//				",  userList" + userList);
//		responseBuilder.setStatus(StartupStatus.INVALID_FACEBOOK_ID);
//		return false;
//	}
//
//	private boolean isValidEmailPasswordLogin(Builder responseBuilder,
//			MinimumUserProto mup, List<User> userObjList) {
//		log.info("email, password validation");
//		//verify said person exists and email, password match
//		String email = mup.getEmail();
//		String password = mup.getPassword();
//		String nameStrangersSee = mup.getNameStrangersSee();
//
//		String facebookIdNull = null;
//		String udidNull = null;
//
//		List<User> userList = getUserSignupService().checkForExistingUser(
//				facebookIdNull, nameStrangersSee, email, udidNull);
//		if (null == userList || userList.size() != 1) {
//			//don't want to print out password
//			log.error("(?)user error: mupEmail=" + email + ", nameStrangersSee=" +
//					nameStrangersSee + ", (in db) userList=" + userList);
//			responseBuilder.setStatus(StartupStatus.FAIL_OTHER);
//			return false;
//		}
//		User inDb = userList.get(0);
//		//check the user's email password match
//		if (loginService.validCredentials(inDb, nameStrangersSee, email, password)) {
//			userObjList.add(inDb);
//			return true;
//		}
//
//		log.error("user error: incorrect email and password. email=" + email);
//		responseBuilder.setStatus(StartupStatus.INVALID_EMAIL_PASSWORD);
//		return false;
//	}
//
//	private boolean isValidNoCredentialsLogin(Builder responseBuilder,
//			MinimumUserProto mup, List<User> userObjList) {
//		log.info("no credentials (aka just name) validation") ;
//		String facebookIdNull = null;
//		String nameStrangersSee = mup.getNameStrangersSee();
//		String emailNull = null;
//		String udidNull = null;
//
//		List<User> userList = getUserSignupService().checkForExistingUser(
//				facebookIdNull, nameStrangersSee, emailNull, udidNull);
//		if (null == userList || userList.size() != 1) {
//			responseBuilder.setStatus(StartupStatus.FAIL_OTHER);
//			log.error("(?)user error: nameStrangersSee=" + nameStrangersSee +
//					", (in db) userList=" + userList);
//			return false;
//		}
//		userObjList.addAll(userList);
//		return true;
//	}
//
//	private List<User> getUser(List<String> userIdList, List<User> userList) {
//		if (userList.isEmpty()) {
//			String userId = userIdList.get(0);
//			User u = getLoginService().getUserById(userId);
//			//return userList.get(0);
//			userList.add(u);
//		}
//
//		return userList;
//	}
//
//	private boolean writeChangesToDb(Builder responseBuilder, MinimumUserProto mup, LoginType lt,
//			DateTime loginTime, List<User> uList) {
//
//		User u = uList.get(0);
//		String userId = u.getId();
//		boolean accountInitialized = u.isAccountInitialized();
//		Currency monies = null;
//		if (accountInitialized) {
//			// construct the user (with his existing currency and all)
//			monies = getCurrencyService().getCurrencyForUser(userId);
//
//		} else {
//			//give the user the initial coins and stuff, record that he got it
//			monies = getCurrencyService().initializeUserCurrency(userId, loginTime.toDate());
//			u.setAccountInitialized(true);
//		}
//		if (null == monies) {
//			//every user should have currency!
//			log.error("unexpected error: user does not have currency. userProto=" + mup);
//		}
//
//		// RECORD THE USER LOGGING IN (UPDATING THE USER TABLE)
//		AuthorizedDevice ad = updateUserLogin(mup, uList, loginTime);
//
//		//KICK OFF ALL OTHER PEOPLE WITH THIS USER ACCOUNT
//		//idea get the udid's of the authorized devices user has and send a message to those udids
//		kickOffOtherDevicesSharingAccount(userId, ad);
//
//		CompleteUserProto cupb = 
//				getNoneventProtoUtils().createCompleteUserProto(u, ad, monies);
//		//set the recipient
//		responseBuilder.setRecipient(cupb);
//
//		//log.info("\t\t completeUserProto=" + cupb);
//
//		return true;
//	}
//
//	private AuthorizedDevice updateUserLogin(MinimumUserProto mup, List<User> uList, DateTime loginTime) {
//		BasicAuthorizedDeviceProto badp = mup.getBadp(); //would the client have this?
//
//		String udid = badp.getUdid();
//		String deviceId = badp.getDeviceId();
//
//		return getLoginService().updateUserLastLogin(uList, loginTime, udid, deviceId);
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
//		LoginConstants.Builder lcb = LoginConstants.newBuilder();
//		CurrencyConstants cc = getCurrencyConstants();
//		RoundConstants rc = getRoundConstants();
//		QuestionTypeScoringConstants qtsc = getQuestionTypeScoringConstants();
//
//		lcb.setCurrencyConstants(cc);
//		lcb.setRoundConstants(rc);
//		lcb.setScoreTypes(qtsc);
//
//		responseBuilder.setLoginConstants(lcb.build());
//	}
//
//	private CurrencyConstants getCurrencyConstants() {
//		CurrencyConstants.Builder ccb = CurrencyConstants.newBuilder();
//		ccb.setDefaultInitialRubies(PicturesPoConstants.CURRENCY__DEFAULT_INITIAL_RUBIES);
//		ccb.setDefaultInitialTokens(PicturesPoConstants.CURRENCY__DEFAULT_INITIAL_TOKENS);
//		int secondsTillRefill = 60 * PicturesPoConstants.CURRENCY__MINUTES_FOR_TOKEN_REGENERATION;
//		ccb.setNumSecondsUntilRefill(secondsTillRefill);
//		return ccb.build();
//	}
//
//	private RoundConstants getRoundConstants() {
//		RoundConstants.Builder rcb = RoundConstants.newBuilder();
//		rcb.setDefaultRoundsPerGame(PicturesPoConstants.ROUND_HISTORY__DEFAULT_ROUNDS_PER_PLAYER_PER_GAME);
//		rcb.setDefaultMinutesPerRound(PicturesPoConstants.ROUND_HISTORY__DEFAULT_MINUTES_PER_ROUND);
//		return rcb.build();
//	}
//
//	private QuestionTypeScoringConstants getQuestionTypeScoringConstants() {
//		QuestionTypeScoringConstants.Builder qtscb =
//				QuestionTypeScoringConstants.newBuilder();
//		qtscb.setMcqCorrect(PicturesPoConstants.MCQ__POINTS_FOR_CORRECT_ANSWER);
//		qtscb.setMcqIncorrect(PicturesPoConstants.MCQ__POINTS_FOR_INCORRECT_ANSWER);
//
//		qtscb.setAcqCorrect(PicturesPoConstants.ACQ__POINTS_FOR_CORRECT_ANSWER);
//		qtscb.setAcqIncorrect(PicturesPoConstants.ACQ__POINTS_FOR_INCORRECT_ANSWER);
//		return qtscb.build();
//	}
//
//
//	public UserSignupService getUserSignupService() {
//		return userSignupService;
//	}
//
//	public void setUserSignupService(UserSignupService userSignupService) {
//		this.userSignupService = userSignupService;
//	}
//
//	public AuthorizedDeviceService getAuthorizedDeviceService() {
//		return authorizedDeviceService;
//	}
//
//	public void setAuthorizedDeviceService(
//			AuthorizedDeviceService authorizedDeviceService) {
//		this.authorizedDeviceService = authorizedDeviceService;
//	}
//
//	public LoginService getLoginService() {
//		return loginService;
//	}
//
//	public void setLoginService(LoginService loginService) {
//		this.loginService = loginService;
//	}
//
//	public GameHistoryService getGameHistoryService() {
//		return gameHistoryService;
//	}
//
//	public void setGameHistoryService(GameHistoryService gameHistoryService) {
//		this.gameHistoryService = gameHistoryService;
//	}
//
//	public CreateNoneventProtoUtils getNoneventProtoUtils() {
//		return noneventProtoUtils;
//	}
//
//	public void setNoneventProtoUtils(CreateNoneventProtoUtils noneventProtoUtils) {
//		this.noneventProtoUtils = noneventProtoUtils;
//	} 
//
//	public CurrencyService getCurrencyService() {
//		return currencyService;
//	}
//
//	public void setCurrencyService(CurrencyService currencyService) {
//		this.currencyService = currencyService;
//	}
//
//	public QuestionBaseService getQuestionBaseService() {
//		return questionBaseService;
//	}
//
//	public void setQuestionBaseService(QuestionBaseService questionBaseService) {
//		this.questionBaseService = questionBaseService;
//	}
//
//}
