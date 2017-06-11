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

public abstract class BaseDeviceVoltage extends Message {
	private static final long serialVersionUID = 1L;
	private String deviceId = null;
	private Integer value = null;


	public BaseDeviceVoltage() {
		super();
		setCategory((byte)20);
		setCommand((byte)16);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[2];
		fields[0] =  new Field("deviceId","String",128);
		fields[1] = new Field("value","int");
	}

	public void dump() {
		System.out.println("deviceId	:	 "+deviceId);
		System.out.println("value	:	 "+value);
	}
	public String getDump() {
		String str="";
		str = str +",deviceId:"+deviceId;
		str = str +",value:"+value;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(deviceId != null)
			map.put("deviceId", deviceId);
		if(value != null)
			map.put("value", value);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		deviceId = (String) map.get("deviceId");
		value = (Integer) map.get("value");
	}

 	public int getMessageSize() {return 132;}

 	public String getName() {return "DeviceVoltage";}

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

	public Integer getValue() {
		return value;
	}

	public int getValueEx() {
		return value != null ? value : 0;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public void unSetValue() {
		this.value = null;
	}
}