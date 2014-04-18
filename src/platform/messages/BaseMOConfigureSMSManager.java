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

public abstract class BaseMOConfigureSMSManager extends Message {
	private static final long serialVersionUID = 1L;
	private String mo_name = null;
	private String self_ip_address = null;
	private String location = null;
	private String connect_url = null;


	public BaseMOConfigureSMSManager() {
		super();
		setCategory((byte)6);
		setCommand((byte)17);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[4];
		fields[0] =  new Field("mo_name","String",128);
		fields[1] =  new Field("self_ip_address","String",128);
		fields[2] =  new Field("location","String",128);
		fields[3] =  new Field("connect_url","String",128);
	}

	public void dump() {
		System.out.println("mo_name	:	 "+mo_name);
		System.out.println("self_ip_address	:	 "+self_ip_address);
		System.out.println("location	:	 "+location);
		System.out.println("connect_url	:	 "+connect_url);
	}
	public String getDump() {
		String str="";
		str = str +",mo_name:"+mo_name;
		str = str +",self_ip_address:"+self_ip_address;
		str = str +",location:"+location;
		str = str +",connect_url:"+connect_url;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(mo_name != null)
			map.put("mo_name", mo_name);
		if(self_ip_address != null)
			map.put("self_ip_address", self_ip_address);
		if(location != null)
			map.put("location", location);
		if(connect_url != null)
			map.put("connect_url", connect_url);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		mo_name = (String) map.get("mo_name");
		self_ip_address = (String) map.get("self_ip_address");
		location = (String) map.get("location");
		connect_url = (String) map.get("connect_url");
	}

 	public int getMessageSize() {return 512;}

 	public String getName() {return "MOConfigureSMSManager";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getMo_name() {
		return mo_name;
	}

	public String getMo_nameEx() {
		return mo_name != null ? mo_name : "";
	}

	public void setMo_name(String mo_name) {
		this.mo_name = mo_name;
	}

	public void unSetMo_name() {
		this.mo_name = null;
	}

	public String getSelf_ip_address() {
		return self_ip_address;
	}

	public String getSelf_ip_addressEx() {
		return self_ip_address != null ? self_ip_address : "";
	}

	public void setSelf_ip_address(String self_ip_address) {
		this.self_ip_address = self_ip_address;
	}

	public void unSetSelf_ip_address() {
		this.self_ip_address = null;
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

	public String getConnect_url() {
		return connect_url;
	}

	public String getConnect_urlEx() {
		return connect_url != null ? connect_url : "";
	}

	public void setConnect_url(String connect_url) {
		this.connect_url = connect_url;
	}

	public void unSetConnect_url() {
		this.connect_url = null;
	}
}