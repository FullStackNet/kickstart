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

public abstract class BaseUnRegisterController extends Message {
	private static final long serialVersionUID = 1L;
	private String controller_id = null;


	public BaseUnRegisterController() {
		super();
		setCategory((byte)20);
		setCommand((byte)9);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[1];
		fields[0] =  new Field("controller_id","String",128);
	}

	public void dump() {
		System.out.println("controller_id	:	 "+controller_id);
	}
	public String getDump() {
		String str="";
		str = str +",controller_id:"+controller_id;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(controller_id != null)
			map.put("controller_id", controller_id);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		controller_id = (String) map.get("controller_id");
	}

 	public int getMessageSize() {return 128;}

 	public String getName() {return "UnRegisterController";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getController_id() {
		return controller_id;
	}

	public String getController_idEx() {
		return controller_id != null ? controller_id : "";
	}

	public void setController_id(String controller_id) {
		this.controller_id = controller_id;
	}

	public void unSetController_id() {
		this.controller_id = null;
	}
}