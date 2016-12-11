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

public abstract class BaseGatewayConfiguration extends Message {
	private static final long serialVersionUID = 1L;
	private String power_priority = null;
	private Byte db_enabled = null;
	private Short controller_heartbeat_interval = null;
	private Short controller_reconnect = null;
	private Short data_read_interval = null;
	private String controller_type = null;
	private String controller_ip = null;
	private Short controller_port = null;
	private String controller_usb_port = null;
	private Integer controller_baudrate = null;
	private String modules = null;
	private Byte application = null;
	private Short heartbeat_interval = null;


	public BaseGatewayConfiguration() {
		super();
		setCategory((byte)1);
		setCommand((byte)3);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[13];
		fields[0] =  new Field("power_priority","String",5);
		fields[1] = new Field("db_enabled","byte");
		fields[2] = new Field("controller_heartbeat_interval","short");
		fields[3] = new Field("controller_reconnect","short");
		fields[4] = new Field("data_read_interval","short");
		fields[5] =  new Field("controller_type","String",6);
		fields[6] =  new Field("controller_ip","String",20);
		fields[7] = new Field("controller_port","short");
		fields[8] =  new Field("controller_usb_port","String",32);
		fields[9] = new Field("controller_baudrate","int");
		fields[10] =  new Field("modules","String",128);
		fields[11] = new Field("application","byte");
		fields[12] = new Field("heartbeat_interval","short");
	}

	public void dump() {
		System.out.println("power_priority	:	 "+power_priority);
		System.out.println("db_enabled	:	 "+ (db_enabled == null ? 0 : db_enabled&0xFF));
		System.out.println("controller_heartbeat_interval	:	 "+controller_heartbeat_interval);
		System.out.println("controller_reconnect	:	 "+controller_reconnect);
		System.out.println("data_read_interval	:	 "+data_read_interval);
		System.out.println("controller_type	:	 "+controller_type);
		System.out.println("controller_ip	:	 "+controller_ip);
		System.out.println("controller_port	:	 "+controller_port);
		System.out.println("controller_usb_port	:	 "+controller_usb_port);
		System.out.println("controller_baudrate	:	 "+controller_baudrate);
		System.out.println("modules	:	 "+modules);
		System.out.println("application	:	 "+ (application == null ? 0 : application&0xFF));
		System.out.println("heartbeat_interval	:	 "+heartbeat_interval);
	}
	public String getDump() {
		String str="";
		str = str +",power_priority:"+power_priority;
		str = str +", db_enabled:"+ (db_enabled == null ? 0 : db_enabled&0xFF);
		str = str +",controller_heartbeat_interval:"+controller_heartbeat_interval;
		str = str +",controller_reconnect:"+controller_reconnect;
		str = str +",data_read_interval:"+data_read_interval;
		str = str +",controller_type:"+controller_type;
		str = str +",controller_ip:"+controller_ip;
		str = str +",controller_port:"+controller_port;
		str = str +",controller_usb_port:"+controller_usb_port;
		str = str +",controller_baudrate:"+controller_baudrate;
		str = str +",modules:"+modules;
		str = str +", application:"+ (application == null ? 0 : application&0xFF);
		str = str +",heartbeat_interval:"+heartbeat_interval;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(power_priority != null)
			map.put("power_priority", power_priority);
		if(db_enabled != null)
			map.put("db_enabled", db_enabled);
		if(controller_heartbeat_interval != null)
			map.put("controller_heartbeat_interval", controller_heartbeat_interval);
		if(controller_reconnect != null)
			map.put("controller_reconnect", controller_reconnect);
		if(data_read_interval != null)
			map.put("data_read_interval", data_read_interval);
		if(controller_type != null)
			map.put("controller_type", controller_type);
		if(controller_ip != null)
			map.put("controller_ip", controller_ip);
		if(controller_port != null)
			map.put("controller_port", controller_port);
		if(controller_usb_port != null)
			map.put("controller_usb_port", controller_usb_port);
		if(controller_baudrate != null)
			map.put("controller_baudrate", controller_baudrate);
		if(modules != null)
			map.put("modules", modules);
		if(application != null)
			map.put("application", application);
		if(heartbeat_interval != null)
			map.put("heartbeat_interval", heartbeat_interval);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		power_priority = (String) map.get("power_priority");
		db_enabled = (Byte) map.get("db_enabled");
		controller_heartbeat_interval = (Short) map.get("controller_heartbeat_interval");
		controller_reconnect = (Short) map.get("controller_reconnect");
		data_read_interval = (Short) map.get("data_read_interval");
		controller_type = (String) map.get("controller_type");
		controller_ip = (String) map.get("controller_ip");
		controller_port = (Short) map.get("controller_port");
		controller_usb_port = (String) map.get("controller_usb_port");
		controller_baudrate = (Integer) map.get("controller_baudrate");
		modules = (String) map.get("modules");
		application = (Byte) map.get("application");
		heartbeat_interval = (Short) map.get("heartbeat_interval");
	}

 	public int getMessageSize() {return 207;}

 	public String getName() {return "GatewayConfiguration";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getPower_priority() {
		return power_priority;
	}

	public String getPower_priorityEx() {
		return power_priority != null ? power_priority : "";
	}

	public void setPower_priority(String power_priority) {
		this.power_priority = power_priority;
	}

	public void unSetPower_priority() {
		this.power_priority = null;
	}

	public Byte getDb_enabled() {
		return db_enabled;
	}

	public byte getDb_enabledEx() {
		return db_enabled != null ? db_enabled : (byte) 0;
	}

	public void setDb_enabled(byte db_enabled) {
		this.db_enabled = db_enabled;
	}

	public void setDb_enabled(Byte db_enabled) {
		this.db_enabled = db_enabled;
	}

	public void unSetDb_enabled() {
		this.db_enabled = null;
	}

	public Short getController_heartbeat_interval() {
		return controller_heartbeat_interval;
	}

	public short getController_heartbeat_intervalEx() {
		return controller_heartbeat_interval != null ? controller_heartbeat_interval : (short) 0;
	}

	public void setController_heartbeat_interval(short controller_heartbeat_interval) {
		this.controller_heartbeat_interval = controller_heartbeat_interval;
	}

	public void setController_heartbeat_interval(Short controller_heartbeat_interval) {
		this.controller_heartbeat_interval = controller_heartbeat_interval;
	}

	public void unSetController_heartbeat_interval() {
		this.controller_heartbeat_interval = null;
	}

	public Short getController_reconnect() {
		return controller_reconnect;
	}

	public short getController_reconnectEx() {
		return controller_reconnect != null ? controller_reconnect : (short) 0;
	}

	public void setController_reconnect(short controller_reconnect) {
		this.controller_reconnect = controller_reconnect;
	}

	public void setController_reconnect(Short controller_reconnect) {
		this.controller_reconnect = controller_reconnect;
	}

	public void unSetController_reconnect() {
		this.controller_reconnect = null;
	}

	public Short getData_read_interval() {
		return data_read_interval;
	}

	public short getData_read_intervalEx() {
		return data_read_interval != null ? data_read_interval : (short) 0;
	}

	public void setData_read_interval(short data_read_interval) {
		this.data_read_interval = data_read_interval;
	}

	public void setData_read_interval(Short data_read_interval) {
		this.data_read_interval = data_read_interval;
	}

	public void unSetData_read_interval() {
		this.data_read_interval = null;
	}

	public String getController_type() {
		return controller_type;
	}

	public String getController_typeEx() {
		return controller_type != null ? controller_type : "";
	}

	public void setController_type(String controller_type) {
		this.controller_type = controller_type;
	}

	public void unSetController_type() {
		this.controller_type = null;
	}

	public String getController_ip() {
		return controller_ip;
	}

	public String getController_ipEx() {
		return controller_ip != null ? controller_ip : "";
	}

	public void setController_ip(String controller_ip) {
		this.controller_ip = controller_ip;
	}

	public void unSetController_ip() {
		this.controller_ip = null;
	}

	public Short getController_port() {
		return controller_port;
	}

	public short getController_portEx() {
		return controller_port != null ? controller_port : (short) 0;
	}

	public void setController_port(short controller_port) {
		this.controller_port = controller_port;
	}

	public void setController_port(Short controller_port) {
		this.controller_port = controller_port;
	}

	public void unSetController_port() {
		this.controller_port = null;
	}

	public String getController_usb_port() {
		return controller_usb_port;
	}

	public String getController_usb_portEx() {
		return controller_usb_port != null ? controller_usb_port : "";
	}

	public void setController_usb_port(String controller_usb_port) {
		this.controller_usb_port = controller_usb_port;
	}

	public void unSetController_usb_port() {
		this.controller_usb_port = null;
	}

	public Integer getController_baudrate() {
		return controller_baudrate;
	}

	public int getController_baudrateEx() {
		return controller_baudrate != null ? controller_baudrate : 0;
	}

	public void setController_baudrate(int controller_baudrate) {
		this.controller_baudrate = controller_baudrate;
	}

	public void setController_baudrate(Integer controller_baudrate) {
		this.controller_baudrate = controller_baudrate;
	}

	public void unSetController_baudrate() {
		this.controller_baudrate = null;
	}

	public String getModules() {
		return modules;
	}

	public String getModulesEx() {
		return modules != null ? modules : "";
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

	public void unSetModules() {
		this.modules = null;
	}

	public Byte getApplication() {
		return application;
	}

	public byte getApplicationEx() {
		return application != null ? application : (byte) 0;
	}

	public void setApplication(byte application) {
		this.application = application;
	}

	public void setApplication(Byte application) {
		this.application = application;
	}

	public void unSetApplication() {
		this.application = null;
	}

	public Short getHeartbeat_interval() {
		return heartbeat_interval;
	}

	public short getHeartbeat_intervalEx() {
		return heartbeat_interval != null ? heartbeat_interval : (short) 0;
	}

	public void setHeartbeat_interval(short heartbeat_interval) {
		this.heartbeat_interval = heartbeat_interval;
	}

	public void setHeartbeat_interval(Short heartbeat_interval) {
		this.heartbeat_interval = heartbeat_interval;
	}

	public void unSetHeartbeat_interval() {
		this.heartbeat_interval = null;
	}
}