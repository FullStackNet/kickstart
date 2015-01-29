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

public abstract class BaseMORefresh extends Message {
	private static final long serialVersionUID = 1L;


	public BaseMORefresh() {
		super();
		setCategory((byte)6);
		setCommand((byte)4);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[0];
	}

	public void dump() {
	}
	public String getDump() {
		String str="";
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
	}

 	public int getMessageSize() {return 0;}

 	public String getName() {return "MORefresh";}

public Message process(Session session,Message parentMessage) {return null;}
}