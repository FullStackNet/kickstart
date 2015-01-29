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

public abstract class BaseNotification extends Message {
	private static final long serialVersionUID = 1L;
	private String id = null;


	public BaseNotification() {
		super();
		setCategory((byte)20);
		setCommand((byte)12);
		setPacketType((byte)1);
		addMessageIdField("id");
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[1];
		fields[0] =  new Field("id","String",128);
	}

	public void dump() {
		System.out.println("id	:	 "+id);
	}
	public String getDump() {
		String str="";
		str = str +",id:"+id;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		id = (String) map.get("id");
	}

 	public int getMessageSize() {return 128;}

 	public String getName() {return "Notification";}

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
}