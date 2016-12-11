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

public abstract class BaseControllerPacketCapture extends Message {
	private static final long serialVersionUID = 1L;
	private String controller_id = null;
	private String packet_type = null; //SEND/RECIVED
	private String message_type = null;
	private Long message_time = null;
	private String data = null;


	public BaseControllerPacketCapture() {
		super();
		setCategory((byte)20);
		setCommand((byte)13);
		setPacketType((byte)1);
		addMessageIdField("controller_id");
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[5];
		fields[0] =  new Field("controller_id","String",128);
		fields[1] =  new Field("packet_type","String",16);
		fields[2] =  new Field("message_type","String",32);
		fields[3] = new Field("message_time","long");
		fields[4] =  new Field("data","String",4000);
	}

	public void dump() {
		System.out.println("controller_id	:	 "+controller_id);
		System.out.println("packet_type	:	 "+packet_type);
		System.out.println("message_type	:	 "+message_type);
		System.out.println("message_time	:	 "+message_time);
		System.out.println("data	:	 "+data);
	}
	public String getDump() {
		String str="";
		str = str +",controller_id:"+controller_id;
		str = str +",packet_type:"+packet_type;
		str = str +",message_type:"+message_type;
		str = str +",message_time:"+message_time;
		str = str +",data:"+data;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(packet_type != null)
			map.put("packet_type", packet_type);
		if(message_type != null)
			map.put("message_type", message_type);
		if(message_time != null)
			map.put("message_time", message_time);
		if(data != null)
			map.put("data", data);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		controller_id = (String) map.get("controller_id");
		packet_type = (String) map.get("packet_type");
		message_type = (String) map.get("message_type");
		message_time = (Long) map.get("message_time");
		data = (String) map.get("data");
	}

 	public int getMessageSize() {return 4180;}

 	public String getName() {return "ControllerPacketCapture";}

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

	public String getPacket_type() {
		return packet_type;
	}

	public String getPacket_typeEx() {
		return packet_type != null ? packet_type : "";
	}

	public void setPacket_type(String packet_type) {
		this.packet_type = packet_type;
	}

	public void unSetPacket_type() {
		this.packet_type = null;
	}

	public String getMessage_type() {
		return message_type;
	}

	public String getMessage_typeEx() {
		return message_type != null ? message_type : "";
	}

	public void setMessage_type(String message_type) {
		this.message_type = message_type;
	}

	public void unSetMessage_type() {
		this.message_type = null;
	}

	public Long getMessage_time() {
		return message_time;
	}

	public long getMessage_timeEx() {
		return message_time != null ? message_time : 0L;
	}

	public void setMessage_time(long message_time) {
		this.message_time = message_time;
	}

	public void setMessage_time(Long message_time) {
		this.message_time = message_time;
	}

	public void unSetMessage_time() {
		this.message_time = null;
	}

	public String getData() {
		return data;
	}

	public String getDataEx() {
		return data != null ? data : "";
	}

	public void setData(String data) {
		this.data = data;
	}

	public void unSetData() {
		this.data = null;
	}
}