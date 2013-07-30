package com.lvl6.aoc2.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvl6.aoc2.controller.EventController;
import com.lvl6.aoc2.controller.utils.TimeUtils;
import com.lvl6.aoc2.events.RequestEvent;
import com.lvl6.aoc2.po.User;
import com.lvl6.aoc2.eventprotos.RefillHpOrManaWithConsumableEventProto.RefillHpOrManaWithConsumableRequestProto;
import com.lvl6.aoc2.eventprotos.RefillHpOrManaWithConsumableEventProto.RefillHpOrManaWithConsumableResponseProto;
import com.lvl6.aoc2.eventprotos.RefillHpOrManaWithConsumableEventProto.RefillHpOrManaWithConsumableResponseProtoOrBuilder;
import com.lvl6.aoc2.eventprotos.RefillHpOrManaWithConsumableEventProto.RefillHpOrManaWithConsumableResponseProto.RefillHpOrManaWithConsumableStatus;
import com.lvl6.aoc2.events.request.RefillHpOrManaWithConsumableRequestEvent;
import com.lvl6.aoc2.events.response.RefillHpOrManaWithConsumableResponseEvent;
import com.lvl6.aoc2.noneventprotos.PicturesEventProtocolProto.PicturesEventProtocolRequest;
import com.lvl6.aoc2.noneventprotos.UserProto.BasicUserProto;
import com.lvl6.aoc2.po.Currency;
import com.lvl6.aoc2.properties.PicturesPoConstants;
import com.lvl6.aoc2.services.currency.CurrencyService;


@Component
public class RefillHpOrManaWithConsumableController extends EventController {

    private static Logger log = LoggerFactory.getLogger(new Object() { }.getClass().getEnclosingClass());

    @Autowired
    protected LoginService loginService;

    @Autowired
    protected TimeUtils timeUtils;

    @Autowired
    protected CurrencyService currencyService; 

    @Override
    public RequestEvent createRequestEvent() {
	return new RefillHpOrManaWithConsumableRequestEvent();
    }

    @Override
    public int getEventType() {
	return PicturesEventProtocolRequest.C_REFILL_TOKENS_BY_WAITING_EVENT_VALUE;
    }

    @Override
    protected void processRequestEvent(RequestEvent event) throws Exception {
	//stuff client sent
	RefillHpOrManaWithConsumableRequestProto reqProto = 
		((RefillHpOrManaWithConsumableRequestEvent) event).getRefillHpOrManaWithConsumableRequestProto();
	BasicUserProto sender = reqProto.getSender();
	String userId = sender.getUserId();
	long clientTime = reqProto.getCurTime();
	Date clientDate = new Date(clientTime);

	//response to send back to client
	Builder responseBuilder = RefillHpOrManaWithConsumableResponseProto.newBuilder();
	responseBuilder.setStatus(RefillHpOrManaWithConsumableStatus.FAIL_OTHER);
	RefillHpOrManaWithConsumableResponseEvent resEvent =
		new RefillHpOrManaWithConsumableResponseEvent(userId);
	resEvent.setTag(event.getTag());

	try {
	    User inDb = getLoginService().getUserById(userId);
	    List<Currency> monies = new ArrayList<Currency>();
	    //validate request
	    boolean validRequest = isValidRequest(responseBuilder, sender, inDb,
		    clientDate, monies);

	    boolean successful = false;
	    if (validRequest) {
		successful = writeChangesToDb(monies, clientDate);
	    }

	    if (successful) {
		responseBuilder.setStatus(RefillHpOrManaWithConsumableStatus.SUCCESS);
	    }

	    //write to client
	    resEvent.setRefillHpOrManaWithConsumableResponseProto(responseBuilder.build());
	    log.info("Writing event: " + resEvent);
	    getEventWriter().handleEvent(resEvent);

	} catch (Exception e) {
	    log.error("exception in RefillHpOrManaWithConsumableController processRequestEvent", e);

	    try {
		//try to tell client that something failed
		responseBuilder.setStatus(RefillHpOrManaWithConsumableStatus.FAIL_OTHER);
		resEvent.setRefillHpOrManaWithConsumableResponseProto(responseBuilder.build());
		getEventWriter().handleEvent(resEvent);

	    } catch (Exception e2) {
		log.error("exception in RefillHpOrManaWithConsumableController processRequestEvent", e2);
	    }
	}
    }

    private boolean isValidRequest(Builder responseBuilder, BasicUserProto sender,
	    User inDb, Date clientDate, List<Currency> monies) {
	if (null == inDb) {
	    log.error("unexpected error: no user exists. sender=" + sender);
	    return false;
	}
	if (!getTimeUtils().isSynchronizedWithServerTime(clientDate)) {
	    log.error("user error: client time diverges from server time. clientTime="
		    + clientDate + ", approximateServerTime=" + new Date());
	    responseBuilder.setStatus(RefillHpOrManaWithConsumableStatus.FAIL_CLIENT_TOO_APART_FROM_SERVER_TIME);
	    return false;
	}

	//check if user is already at max tokens
	String userId = inDb.getId();
	Currency c = getCurrencyService().getCurrencyForUser(userId); 
	int maxTokens = PicturesPoConstants.CURRENCY__DEFAULT_MAX_TOKENS;
	int currentTokens = c.getTokens();
	if (currentTokens == maxTokens) {
	    log.error("unexpected error: client already has max tokens. currency=" +
		    c + ";   maxTokens=" + maxTokens);
	    responseBuilder.setStatus(RefillHpOrManaWithConsumableStatus.FAIL_ALREADY_MAX);
	    return false;
	}

	//check if user can regenerate a token
	//current time > last refill time + time_to_regenerate
	Date lastRefillTime = new Date(c.getLastTokenRefillTime().getTime());
	if (!getCurrencyService().canRegenerateToken(lastRefillTime, clientDate)) {
	    log.error("user error: tokens not ready for refill yet. clientTime=" +
		    clientDate + ";      lastRefillTime=" + lastRefillTime +
		    ";      numMinutesForTokenRefill=" +
		    PicturesPoConstants.CURRENCY__MINUTES_FOR_TOKEN_REGENERATION);
	    responseBuilder.setStatus(RefillHpOrManaWithConsumableStatus.FAIL_NOT_READY_YET);
	    return false;
	}

	monies.add(c);
	return true;
    }

    private boolean writeChangesToDb(List<Currency> monies, Date clientDate) {
	try {
	    Currency money = monies.get(0);
	    int newTokenAmount =
		    getCurrencyService().numTokensRegenerated(money, clientDate);
	    getCurrencyService().updateTokensForUser(money, newTokenAmount, clientDate);
	    return true;

	} catch (Exception e) {
	    log.error("unexpected error: problem with saving to db.", e);
	}
	return false;
    }

    public LoginService getLoginService() {
	return loginService;
    }

    public void setLoginService(LoginService loginService) {
	this.loginService = loginService;
    }

    public TimeUtils getTimeUtils() {
	return timeUtils;
    }

    public void setTimeUtils(TimeUtils timeUtils) {
	this.timeUtils = timeUtils;
    }

    public CurrencyService getCurrencyService() {
	return currencyService;
    }

    public void setCurrencyService(CurrencyService currencyService) {
	this.currencyService = currencyService;
    }

}