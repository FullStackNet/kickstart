/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.messages;

import java.util.HashMap;
import java.util.Map;

import platform.communication.Session;
import platform.message.Message;
import platform.util.Field;

public abstract class BaseAuthenticationResponse extends Message {
	private static final long serialVersionUID = 1L;
	private String sessionId = null;


	public BaseAuthenticationResponse() {
		super();
		setCategory((byte)0);
		setCommand((byte)0);
		setPacketType((byte)2);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[1];
		fields[0] =  new Field("sessionId","String",128);
	}

	public void dump() {
		System.out.println("sessionId	:	 "+sessionId);
	}
	public String getDump() {
		String str="";
		str = str +",sessionId:"+sessionId;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(sessionId != null)
			map.put("sessionId", sessionId);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		sessionId = (String) map.get("sessionId");
	}

 	public int getMessageSize() {return 128;}

 	public String getName() {return "AuthenticationResponse";}

public Message process(Session session,Message parentMessage) {return null;}

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