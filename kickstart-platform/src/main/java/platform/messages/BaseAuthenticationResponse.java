/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.messages;

import platform.message.*;
import platform.util.*;
import java.util.*;
import platform.communication.*;

public abstract class BaseAuthenticationResponse extends Message {
	private static final long serialVersionUID = 1L;
	private Integer errCode = null;
	private String message = null;
	private String sessionId = null;


	public BaseAuthenticationResponse() {
		super();
		setCategory((byte)0);
		setCommand((byte)0);
		setPacketType((byte)2);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[3];
		fields[0] = new Field("errCode","int");
		fields[1] =  new Field("message","String",128);
		fields[2] =  new Field("sessionId","String",128);
	}

	public void dump() {
		System.out.println("errCode	:	 "+errCode);
		System.out.println("message	:	 "+message);
		System.out.println("sessionId	:	 "+sessionId);
	}
	public String getDump() {
		String str="";
		str = str +",errCode:"+errCode;
		str = str +",message:"+message;
		str = str +",sessionId:"+sessionId;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(errCode != null)
			map.put("errCode", errCode);
		if(message != null)
			map.put("message", message);
		if(sessionId != null)
			map.put("sessionId", sessionId);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		errCode = (Integer) map.get("errCode");
		message = (String) map.get("message");
		sessionId = (String) map.get("sessionId");
	}

 	public int getMessageSize() {return 260;}

 	public String getName() {return "AuthenticationResponse";}

public Message process(Session session,Message parentMessage) {return null;}

	public Integer getErrCode() {
		return errCode;
	}

	public int getErrCodeEx() {
		return errCode != null ? errCode : 0;
	}

	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}

	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}

	public void unSetErrCode() {
		this.errCode = null;
	}

	public String getMessage() {
		return message;
	}

	public String getMessageEx() {
		return message != null ? message : "";
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void unSetMessage() {
		this.message = null;
	}

	public String getSessionId() {
		return sessionId;
	}

	public String getSessionIdEx() {
		return sessionId != null ? sessionId : "";
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public void unSetSessionId() {
		this.sessionId = null;
	}
}