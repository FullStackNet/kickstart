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

public abstract class BaseDeviceConfiguration extends Message {
	private static final long serialVersionUID = 1L;
	private String deviceId = null;
	private String configuration = null;


	public BaseDeviceConfiguration() {
		super();
		setCategory((byte)20);
		setCommand((byte)10);
		setPacketType((byte)1);
		addMessageIdField("deviceId");
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[2];
		fields[0] =  new Field("deviceId","String",10);
		fields[1] =  new Field("configuration","String",2048);
	}

	public void dump() {
		System.out.println("deviceId	:	 "+deviceId);
		System.out.println("configuration	:	 "+configuration);
	}
	public String getDump() {
		String str="";
		str = str +",deviceId:"+deviceId;
		str = str +",configuration:"+configuration;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(deviceId != null)
			map.put("deviceId", deviceId);
		if(configuration != null)
			map.put("configuration", configuration);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		deviceId = (String) map.get("deviceId");
		configuration = (String) map.get("configuration");
	}

 	public int getMessageSize() {return 2058;}

 	public String getName() {return "DeviceConfiguration";}

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

	public String getConfiguration() {
		return configuration;
	}

	public String getConfigurationEx() {
		return configuration != null ? configuration : "";
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public void unSetConfiguration() {
		this.configuration = null;
	}
}