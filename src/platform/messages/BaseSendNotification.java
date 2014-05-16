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
	private String notify_id = null;
	private String title = null;
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
		fields = new Field[4];
		fields[0] =  new Field("notify_id","String",128);
		fields[1] =  new Field("title","String",128);
		fields[2] =  new Field("type","String",128);
		fields[3] =  new Field("params","String",4096);
	}

	public void dump() {
		System.out.println("notify_id	:	 "+notify_id);
		System.out.println("title	:	 "+title);
		System.out.println("type	:	 "+type);
		System.out.println("params	:	 "+params);
	}
	public String getDump() {
		String str="";
		str = str +",notify_id:"+notify_id;
		str = str +",title:"+title;
		str = str +",type:"+type;
		str = str +",params:"+params;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(notify_id != null)
			map.put("notify_id", notify_id);
		if(title != null)
			map.put("title", title);
		if(type != null)
			map.put("type", type);
		if(params != null)
			map.put("params", params);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		notify_id = (String) map.get("notify_id");
		title = (String) map.get("title");
		type = (String) map.get("type");
		params = (String) map.get("params");
	}

 	public int getMessageSize() {return 4480;}

 	public String getName() {return "SendNotification";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getNotify_id() {
		return notify_id;
	}

	public String getNotify_idEx() {
		return notify_id != null ? notify_id : "";
	}

	public void setNotify_id(String notify_id) {
		this.notify_id = notify_id;
	}

	public void unSetNotify_id() {
		this.notify_id = null;
	}

	public String getTitle() {
		return title;
	}

	public String getTitleEx() {
		return title != null ? title : "";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void unSetTitle() {
		this.title = null;
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