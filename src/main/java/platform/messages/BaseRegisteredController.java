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

public abstract class BaseRegisteredController extends Message {
	private static final long serialVersionUID = 1L;
	private String controller_id = null;
	private String controller_name = null;
	private String controller_type = null;
	private String manager = null;
	private String model = null;
	private String packet_capture = null;


	public BaseRegisteredController() {
		super();
		setCategory((byte)20);
		setCommand((byte)8);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[6];
		fields[0] =  new Field("controller_id","String",128);
		fields[1] =  new Field("controller_name","String",128);
		fields[2] =  new Field("controller_type","String",32);
		fields[3] =  new Field("manager","String",32);
		fields[4] =  new Field("model","String",32);
		fields[5] =  new Field("packet_capture","String",1);
	}

	public void dump() {
		System.out.println("controller_id	:	 "+controller_id);
		System.out.println("controller_name	:	 "+controller_name);
		System.out.println("controller_type	:	 "+controller_type);
		System.out.println("manager	:	 "+manager);
		System.out.println("model	:	 "+model);
		System.out.println("packet_capture	:	 "+packet_capture);
	}
	public String getDump() {
		String str="";
		str = str +",controller_id:"+controller_id;
		str = str +",controller_name:"+controller_name;
		str = str +",controller_type:"+controller_type;
		str = str +",manager:"+manager;
		str = str +",model:"+model;
		str = str +",packet_capture:"+packet_capture;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(controller_name != null)
			map.put("controller_name", controller_name);
		if(controller_type != null)
			map.put("controller_type", controller_type);
		if(manager != null)
			map.put("manager", manager);
		if(model != null)
			map.put("model", model);
		if(packet_capture != null)
			map.put("packet_capture", packet_capture);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		controller_id = (String) map.get("controller_id");
		controller_name = (String) map.get("controller_name");
		controller_type = (String) map.get("controller_type");
		manager = (String) map.get("manager");
		model = (String) map.get("model");
		packet_capture = (String) map.get("packet_capture");
	}

 	public int getMessageSize() {return 353;}

 	public String getName() {return "RegisteredController";}

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

	public String getController_name() {
		return controller_name;
	}

	public String getController_nameEx() {
		return controller_name != null ? controller_name : "";
	}

	public void setController_name(String controller_name) {
		this.controller_name = controller_name;
	}

	public void unSetController_name() {
		this.controller_name = null;
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

	public String getModel() {
		return model;
	}

	public String getModelEx() {
		return model != null ? model : "";
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void unSetModel() {
		this.model = null;
	}

	public String getPacket_capture() {
		return packet_capture;
	}

	public String getPacket_captureEx() {
		return packet_capture != null ? packet_capture : "";
	}

	public void setPacket_capture(String packet_capture) {
		this.packet_capture = packet_capture;
	}

	public void unSetPacket_capture() {
		this.packet_capture = null;
	}
}