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

public abstract class BaseMORegister extends Message {
	private static final long serialVersionUID = 1L;
	private String id = null;
	private String object_name = null;
	private String type = null;
	private Integer monitor_type = null;
	private String ip_address = null;
	private Integer port = null;
	private String process_id = null;
	private String location = null;
	private String version = null;
	private String message_bus_url = null;


	public BaseMORegister() {
		super();
		setCategory((byte)6);
		setCommand((byte)1);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[10];
		fields[0] =  new Field("id","String",128);
		fields[1] =  new Field("object_name","String",128);
		fields[2] =  new Field("type","String",32);
		fields[3] = new Field("monitor_type","int");
		fields[4] =  new Field("ip_address","String",128);
		fields[5] = new Field("port","int");
		fields[6] =  new Field("process_id","String",32);
		fields[7] =  new Field("location","String",128);
		fields[8] =  new Field("version","String",32);
		fields[9] =  new Field("message_bus_url","String",32);
	}

	public void dump() {
		System.out.println("id	:	 "+id);
		System.out.println("object_name	:	 "+object_name);
		System.out.println("type	:	 "+type);
		System.out.println("monitor_type	:	 "+monitor_type);
		System.out.println("ip_address	:	 "+ip_address);
		System.out.println("port	:	 "+port);
		System.out.println("process_id	:	 "+process_id);
		System.out.println("location	:	 "+location);
		System.out.println("version	:	 "+version);
		System.out.println("message_bus_url	:	 "+message_bus_url);
	}
	public String getDump() {
		String str="";
		str = str +",id:"+id;
		str = str +",object_name:"+object_name;
		str = str +",type:"+type;
		str = str +",monitor_type:"+monitor_type;
		str = str +",ip_address:"+ip_address;
		str = str +",port:"+port;
		str = str +",process_id:"+process_id;
		str = str +",location:"+location;
		str = str +",version:"+version;
		str = str +",message_bus_url:"+message_bus_url;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(object_name != null)
			map.put("object_name", object_name);
		if(type != null)
			map.put("type", type);
		if(monitor_type != null)
			map.put("monitor_type", monitor_type);
		if(ip_address != null)
			map.put("ip_address", ip_address);
		if(port != null)
			map.put("port", port);
		if(process_id != null)
			map.put("process_id", process_id);
		if(location != null)
			map.put("location", location);
		if(version != null)
			map.put("version", version);
		if(message_bus_url != null)
			map.put("message_bus_url", message_bus_url);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		id = (String) map.get("id");
		object_name = (String) map.get("object_name");
		type = (String) map.get("type");
		monitor_type = (Integer) map.get("monitor_type");
		ip_address = (String) map.get("ip_address");
		port = (Integer) map.get("port");
		process_id = (String) map.get("process_id");
		location = (String) map.get("location");
		version = (String) map.get("version");
		message_bus_url = (String) map.get("message_bus_url");
	}

 	public int getMessageSize() {return 648;}

 	public String getName() {return "MORegister";}

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

	public String getObject_name() {
		return object_name;
	}

	public String getObject_nameEx() {
		return object_name != null ? object_name : "";
	}

	public void setObject_name(String object_name) {
		this.object_name = object_name;
	}

	public void unSetObject_name() {
		this.object_name = null;
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

	public Integer getMonitor_type() {
		return monitor_type;
	}

	public int getMonitor_typeEx() {
		return monitor_type != null ? monitor_type : 0;
	}

	public void setMonitor_type(int monitor_type) {
		this.monitor_type = monitor_type;
	}

	public void setMonitor_type(Integer monitor_type) {
		this.monitor_type = monitor_type;
	}

	public void unSetMonitor_type() {
		this.monitor_type = null;
	}

	public String getIp_address() {
		return ip_address;
	}

	public String getIp_addressEx() {
		return ip_address != null ? ip_address : "";
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public void unSetIp_address() {
		this.ip_address = null;
	}

	public Integer getPort() {
		return port;
	}

	public int getPortEx() {
		return port != null ? port : 0;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public void unSetPort() {
		this.port = null;
	}

	public String getProcess_id() {
		return process_id;
	}

	public String getProcess_idEx() {
		return process_id != null ? process_id : "";
	}

	public void setProcess_id(String process_id) {
		this.process_id = process_id;
	}

	public void unSetProcess_id() {
		this.process_id = null;
	}

	public String getLocation() {
		return location;
	}

	public String getLocationEx() {
		return location != null ? location : "";
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void unSetLocation() {
		this.location = null;
	}

	public String getVersion() {
		return version;
	}

	public String getVersionEx() {
		return version != null ? version : "";
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void unSetVersion() {
		this.version = null;
	}

	public String getMessage_bus_url() {
		return message_bus_url;
	}

	public String getMessage_bus_urlEx() {
		return message_bus_url != null ? message_bus_url : "";
	}

	public void setMessage_bus_url(String message_bus_url) {
		this.message_bus_url = message_bus_url;
	}

	public void unSetMessage_bus_url() {
		this.message_bus_url = null;
	}
}