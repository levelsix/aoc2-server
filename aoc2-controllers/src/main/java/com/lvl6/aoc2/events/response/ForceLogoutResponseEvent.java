package com.lvl6.aoc2.events.response;

import java.nio.ByteBuffer;

import com.lvl6.aoc2.events.PreDatabaseResponseEvent;

public class ForceLogoutResponseEvent extends PreDatabaseResponseEvent {

	public ForceLogoutResponseEvent(String udid) {
		super(udid);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int write(ByteBuffer bb) {
		// TODO Auto-generated method stub
		return 0;
	}
/*  private ForceLogoutResponseProto forceLogoutResponseProto;
  
  public ForceLogoutResponseEvent(String udid) {
    super(udid);
    eventType = CommonEventProtocolResponse.S_FORCE_LOGOUT_EVENT_VALUE;
  }
  
  @Override
  public int write(ByteBuffer bb) {
    ByteString b = forceLogoutResponseProto.toByteString();
    b.copyTo(bb);
    return b.size();
  }
  
  public void setForceLogoutResponseProto(ForceLogoutResponseProto forceLogoutResponseProto) {
    this.forceLogoutResponseProto = forceLogoutResponseProto;
  }*/
  
}