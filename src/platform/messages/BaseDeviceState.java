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

public abstract class BaseDeviceState extends Message {
	private static final long serialVersionUID = 1L;
	private String deviceId = null;
	private Byte state = null;


	public BaseDeviceState() {
		super();
		setCategory((byte)20);
		setCommand((byte)14);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[2];
		fields[0] =  new Field("deviceId","String",128);
		fields[1] = new Field("state","byte");
	}

	public void dump() {
		System.out.println("deviceId	:	 "+deviceId);
		System.out.println("state	:	 "+ (state == null ? 0 : state&0xFF));
	}
	public String getDump() {
		String str="";
		str = str +",deviceId:"+deviceId;
		str = str +", state:"+ (state == null ? 0 : state&0xFF);
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(deviceId != null)
			map.put("deviceId", deviceId);
		if(state != null)
			map.put("state", state);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		deviceId = (String) map.get("deviceId");
		state = (Byte) map.get("state");
	}

 	public int getMessageSize() {return 129;}

 	public String getName() {return "DeviceState";}

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

	public Byte getState() {
		return state;
	}

	public byte getStateEx() {
		return state != null ? state : (byte) 0;
	}

	public void setState(byte state) {
		this.state = state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = null;
	}
}