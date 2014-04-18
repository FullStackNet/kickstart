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

public abstract class BaseSendNotification extends Message {
	private static final long serialVersionUID = 1L;
	private String id = null;
	private String type = null;
	private String params = null;


	public BaseSendNotification() {
		super();
		setCategory((byte)6);
		setCommand((byte)19);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[3];
		fields[0] =  new Field("id","String",128);
		fields[1] =  new Field("type","String",128);
		fields[2] =  new Field("params","String",4096);
	}

	public void dump() {
		System.out.println("id	:	 "+id);
		System.out.println("type	:	 "+type);
		System.out.println("params	:	 "+params);
	}
	public String getDump() {
		String str="";
		str = str +",id:"+id;
		str = str +",type:"+type;
		str = str +",params:"+params;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(type != null)
			map.put("type", type);
		if(params != null)
			map.put("params", params);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		id = (String) map.get("id");
		type = (String) map.get("type");
		params = (String) map.get("params");
	}

 	public int getMessageSize() {return 4352;}

 	public String getName() {return "SendNotification";}

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