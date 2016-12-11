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

public abstract class BaseDeviceNotification extends Message {
	private static final long serialVersionUID = 1L;
	private String id = null;
	private Long notificationTime = null;
	private String deviceType = null;
	private String deviceId = null;
	private String alertType = null;
	private Byte severity = null;
	private Byte state = null;
	private String data = null;


	public BaseDeviceNotification() {
		super();
		setCategory((byte)20);
		setCommand((byte)5);
		setPacketType((byte)1);
		addMessageIdField("id");
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[8];
		fields[0] =  new Field("id","String",128);
		fields[1] = new Field("notificationTime","long");
		fields[2] =  new Field("deviceType","String",32);
		fields[3] =  new Field("deviceId","String",128);
		fields[4] =  new Field("alertType","String",0);
		fields[5] = new Field("severity","byte");
		fields[6] = new Field("state","byte");
		fields[7] =  new Field("data","String",256);
	}

	public void dump() {
		System.out.println("id	:	 "+id);
		System.out.println("notificationTime	:	 "+notificationTime);
		System.out.println("deviceType	:	 "+deviceType);
		System.out.println("deviceId	:	 "+deviceId);
		System.out.println("alertType	:	 "+alertType);
		System.out.println("severity	:	 "+ (severity == null ? 0 : severity&0xFF));
		System.out.println("state	:	 "+ (state == null ? 0 : state&0xFF));
		System.out.println("data	:	 "+data);
	}
	public String getDump() {
		String str="";
		str = str +",id:"+id;
		str = str +",notificationTime:"+notificationTime;
		str = str +",deviceType:"+deviceType;
		str = str +",deviceId:"+deviceId;
		str = str +",alertType:"+alertType;
		str = str +", severity:"+ (severity == null ? 0 : severity&0xFF);
		str = str +", state:"+ (state == null ? 0 : state&0xFF);
		str = str +",data:"+data;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(notificationTime != null)
			map.put("notificationTime", notificationTime);
		if(deviceType != null)
			map.put("deviceType", deviceType);
		if(deviceId != null)
			map.put("deviceId", deviceId);
		if(alertType != null)
			map.put("alertType", alertType);
		if(severity != null)
			map.put("severity", severity);
		if(state != null)
			map.put("state", state);
		if(data != null)
			map.put("data", data);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		id = (String) map.get("id");
		notificationTime = (Long) map.get("notificationTime");
		deviceType = (String) map.get("deviceType");
		deviceId = (String) map.get("deviceId");
		alertType = (String) map.get("alertType");
		severity = (Byte) map.get("severity");
		state = (Byte) map.get("state");
		data = (String) map.get("data");
	}

 	public int getMessageSize() {return 550;}

 	public String getName() {return "DeviceNotification";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getId() {
		return id;
	}

	public String getIdEx() {
		return id != null ? id : "";
	}

	public void setId(String id) {
		this.id = id;
	}

	public void unSetId() {
		this.id = null;
	}

	public Long getNotificationTime() {
		return notificationTime;
	}

	public long getNotificationTimeEx() {
		return notificationTime != null ? notificationTime : 0L;
	}

	public void setNotificationTime(long notificationTime) {
		this.notificationTime = notificationTime;
	}

	public void setNotificationTime(Long notificationTime) {
		this.notificationTime = notificationTime;
	}

	public void unSetNotificationTime() {
		this.notificationTime = null;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public String getDeviceTypeEx() {
		return deviceType != null ? deviceType : "";
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public void unSetDeviceType() {
		this.deviceType = null;
	}

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

	public String getAlertType() {
		return alertType;
	}

	public String getAlertTypeEx() {
		return alertType != null ? alertType : "";
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}

	public void unSetAlertType() {
		this.alertType = null;
	}

	public Byte getSeverity() {
		return severity;
	}

	public byte getSeverityEx() {
		return severity != null ? severity : (byte) 0;
	}

	public void setSeverity(byte severity) {
		this.severity = severity;
	}

	public void setSeverity(Byte severity) {
		this.severity = severity;
	}

	public void unSetSeverity() {
		this.severity = null;
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

	public String getData() {
		return data;
	}

	public String getDataEx() {
		return data != null ? data : "";
	}

	public void setData(String data) {
		this.data = data;
	}

	public void unSetData() {
		this.data = null;
	}
}