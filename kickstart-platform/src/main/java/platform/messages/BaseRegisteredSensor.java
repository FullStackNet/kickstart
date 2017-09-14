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

public abstract class BaseRegisteredSensor extends Message {
	private static final long serialVersionUID = 1L;
	private String sensor_id = null;
	private String sensor_name = null;
	private String sensor_type = null;
	private String manager = null;
	private String controllerId = null;
	private Short controllerPort = null;
	private Short controllerPhysicalPort = null;
	private Long lastUpdateTime = null;


	public BaseRegisteredSensor() {
		super();
		setCategory((byte)20);
		setCommand((byte)4);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[8];
		fields[0] =  new Field("sensor_id","String",128);
		fields[1] =  new Field("sensor_name","String",128);
		fields[2] =  new Field("sensor_type","String",32);
		fields[3] =  new Field("manager","String",32);
		fields[4] =  new Field("controllerId","String",128);
		fields[5] = new Field("controllerPort","short");
		fields[6] = new Field("controllerPhysicalPort","short");
		fields[7] = new Field("lastUpdateTime","long");
	}

	public void dump() {
		System.out.println("sensor_id	:	 "+sensor_id);
		System.out.println("sensor_name	:	 "+sensor_name);
		System.out.println("sensor_type	:	 "+sensor_type);
		System.out.println("manager	:	 "+manager);
		System.out.println("controllerId	:	 "+controllerId);
		System.out.println("controllerPort	:	 "+controllerPort);
		System.out.println("controllerPhysicalPort	:	 "+controllerPhysicalPort);
		System.out.println("lastUpdateTime	:	 "+lastUpdateTime);
	}
	public String getDump() {
		String str="";
		str = str +",sensor_id:"+sensor_id;
		str = str +",sensor_name:"+sensor_name;
		str = str +",sensor_type:"+sensor_type;
		str = str +",manager:"+manager;
		str = str +",controllerId:"+controllerId;
		str = str +",controllerPort:"+controllerPort;
		str = str +",controllerPhysicalPort:"+controllerPhysicalPort;
		str = str +",lastUpdateTime:"+lastUpdateTime;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(sensor_id != null)
			map.put("sensor_id", sensor_id);
		if(sensor_name != null)
			map.put("sensor_name", sensor_name);
		if(sensor_type != null)
			map.put("sensor_type", sensor_type);
		if(manager != null)
			map.put("manager", manager);
		if(controllerId != null)
			map.put("controllerId", controllerId);
		if(controllerPort != null)
			map.put("controllerPort", controllerPort);
		if(controllerPhysicalPort != null)
			map.put("controllerPhysicalPort", controllerPhysicalPort);
		if(lastUpdateTime != null)
			map.put("lastUpdateTime", lastUpdateTime);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		sensor_id = (String) map.get("sensor_id");
		sensor_name = (String) map.get("sensor_name");
		sensor_type = (String) map.get("sensor_type");
		manager = (String) map.get("manager");
		controllerId = (String) map.get("controllerId");
		controllerPort = (Short) map.get("controllerPort");
		controllerPhysicalPort = (Short) map.get("controllerPhysicalPort");
		lastUpdateTime = (Long) map.get("lastUpdateTime");
	}

 	public int getMessageSize() {return 456;}

 	public String getName() {return "RegisteredSensor";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getSensor_id() {
		return sensor_id;
	}

	public String getSensor_idEx() {
		return sensor_id != null ? sensor_id : "";
	}

	public void setSensor_id(String sensor_id) {
		this.sensor_id = sensor_id;
	}

	public void unSetSensor_id() {
		this.sensor_id = null;
	}

	public String getSensor_name() {
		return sensor_name;
	}

	public String getSensor_nameEx() {
		return sensor_name != null ? sensor_name : "";
	}

	public void setSensor_name(String sensor_name) {
		this.sensor_name = sensor_name;
	}

	public void unSetSensor_name() {
		this.sensor_name = null;
	}

	public String getSensor_type() {
		return sensor_type;
	}

	public String getSensor_typeEx() {
		return sensor_type != null ? sensor_type : "";
	}

	public void setSensor_type(String sensor_type) {
		this.sensor_type = sensor_type;
	}

	public void unSetSensor_type() {
		this.sensor_type = null;
	}

	public String getManager() {
		return manager;
	}

	public String getManagerEx() {
		return manager != null ? manager : "";
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public void unSetManager() {
		this.manager = null;
	}

	public String getControllerId() {
		return controllerId;
	}

	public String getControllerIdEx() {
		return controllerId != null ? controllerId : "";
	}

	public void setControllerId(String controllerId) {
		this.controllerId = controllerId;
	}

	public void unSetControllerId() {
		this.controllerId = null;
	}

	public Short getControllerPort() {
		return controllerPort;
	}

	public short getControllerPortEx() {
		return controllerPort != null ? controllerPort : (short) 0;
	}

	public void setControllerPort(short controllerPort) {
		this.controllerPort = controllerPort;
	}

	public void setControllerPort(Short controllerPort) {
		this.controllerPort = controllerPort;
	}

	public void unSetControllerPort() {
		this.controllerPort = null;
	}

	public Short getControllerPhysicalPort() {
		return controllerPhysicalPort;
	}

	public short getControllerPhysicalPortEx() {
		return controllerPhysicalPort != null ? controllerPhysicalPort : (short) 0;
	}

	public void setControllerPhysicalPort(short controllerPhysicalPort) {
		this.controllerPhysicalPort = controllerPhysicalPort;
	}

	public void setControllerPhysicalPort(Short controllerPhysicalPort) {
		this.controllerPhysicalPort = controllerPhysicalPort;
	}

	public void unSetControllerPhysicalPort() {
		this.controllerPhysicalPort = null;
	}

	public Long getLastUpdateTime() {
		return lastUpdateTime;
	}

	public long getLastUpdateTimeEx() {
		return lastUpdateTime != null ? lastUpdateTime : 0L;
	}

	public void setLastUpdateTime(long lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public void setLastUpdateTime(Long lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public void unSetLastUpdateTime() {
		this.lastUpdateTime = null;
	}
}