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

public abstract class BaseSendSMS extends Message {
	private static final long serialVersionUID = 1L;
	private String mobile_no = null;
	private String type = null;
	private String params = null;


	public BaseSendSMS() {
		super();
		setCategory((byte)6);
		setCommand((byte)16);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[3];
		fields[0] =  new Field("mobile_no","String",128);
		fields[1] =  new Field("type","String",128);
		fields[2] =  new Field("params","String",4096);
	}

	public void dump() {
		System.out.println("mobile_no	:	 "+mobile_no);
		System.out.println("type	:	 "+type);
		System.out.println("params	:	 "+params);
	}
	public String getDump() {
		String str="";
		str = str +",mobile_no:"+mobile_no;
		str = str +",type:"+type;
		str = str +",params:"+params;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(type != null)
			map.put("type", type);
		if(params != null)
			map.put("params", params);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		mobile_no = (String) map.get("mobile_no");
		type = (String) map.get("type");
		params = (String) map.get("params");
	}

 	public int getMessageSize() {return 4352;}

 	public String getName() {return "SendSMS";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getMobile_no() {
		return mobile_no;
	}

	public String getMobile_noEx() {
		return mobile_no != null ? mobile_no : "";
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public void unSetMobile_no() {
		this.mobile_no = null;
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

	public String getParams() {
		return params;
	}

	public String getParamsEx() {
		return params != null ? params : "";
	}

	public void setParams(String params) {
		this.params = params;
	}

	public void unSetParams() {
		this.params = null;
	}
}