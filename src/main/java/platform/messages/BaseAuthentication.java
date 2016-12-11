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

public abstract class BaseAuthentication extends Message {
	private static final long serialVersionUID = 1L;
	private String loginId = null;
	private String type = null;
	private String password = null;
	private String identifier = null;


	public BaseAuthentication() {
		super();
		setCategory((byte)0);
		setCommand((byte)0);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[4];
		fields[0] =  new Field("loginId","String",128);
		fields[1] =  new Field("type","String",32);
		fields[2] =  new Field("password","String",32);
		fields[3] =  new Field("identifier","String",32);
	}

	public void dump() {
		System.out.println("loginId	:	 "+loginId);
		System.out.println("type	:	 "+type);
		System.out.println("password	:	 "+password);
		System.out.println("identifier	:	 "+identifier);
	}
	public String getDump() {
		String str="";
		str = str +",loginId:"+loginId;
		str = str +",type:"+type;
		str = str +",password:"+password;
		str = str +",identifier:"+identifier;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(loginId != null)
			map.put("loginId", loginId);
		if(type != null)
			map.put("type", type);
		if(password != null)
			map.put("password", password);
		if(identifier != null)
			map.put("identifier", identifier);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		loginId = (String) map.get("loginId");
		type = (String) map.get("type");
		password = (String) map.get("password");
		identifier = (String) map.get("identifier");
	}

 	public int getMessageSize() {return 224;}

 	public String getName() {return "Authentication";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getLoginId() {
		return loginId;
	}

	public String getLoginIdEx() {
		return loginId != null ? loginId : "";
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public void unSetLoginId() {
		this.loginId = null;
	}

	public String getType() {
		return type;
	}

	public String getTypeEx() {
		return type != null ? type : "";
	}

	public void setType(String type) {
		this.type = type;
	}

	public void unSetType() {
		this.type = null;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordEx() {
		return password != null ? password : "";
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void unSetPassword() {
		this.password = null;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getIdentifierEx() {
		return identifier != null ? identifier : "";
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public void unSetIdentifier() {
		this.identifier = null;
	}
}