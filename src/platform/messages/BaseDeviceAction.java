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

public abstract class BaseDeviceAction extends Message {
	private static final long serialVersionUID = 1L;
	private String deviceId = null;
	private String action = null;


	public BaseDeviceAction() {
		super();
		setCategory((byte)20);
		setCommand((byte)1);
		setPacketType((byte)1);
		addMessageIdField("deviceId");
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[2];
		fields[0] =  new Field("deviceId","String",10);
		fields[1] =  new Field("action","String",0);
	}

	public void dump() {
		System.out.println("deviceId	:	 "+deviceId);
		System.out.println("action	:	 "+action);
	}
	public String getDump() {
		String str="";
		str = str +",deviceId:"+deviceId;
		str = str +",action:"+action;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(deviceId != null)
			map.put("deviceId", deviceId);
		if(action != null)
			map.put("action", action);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		deviceId = (String) map.get("deviceId");
		action = (String) map.get("action");
	}

 	public int getMessageSize() {return 10;}

 	public String getName() {return "DeviceAction";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getDeviceId() {
		return deviceId;
	}

	public String getDeviceIdEx() {
		return deviceId != null ? deviceId : "";
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public void unSetDeviceId() {
		this.deviceId = null;
	}

	public String getAction() {
		return action;
	}

	public String getActionEx() {
		return action != null ? action : "";
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void unSetAction() {
		this.action = null;
	}
}