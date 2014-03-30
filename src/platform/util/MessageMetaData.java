/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MessageMetaData {
	private String name;
	private String command;
	private String category;
	private String packet_type;
	private boolean appliance;
	private String packet_flag;
	
	private Map<String, Field> fields;
	public String getPacket_flag() {
		return packet_flag;
	}

	public void setPacket_flag(String packet_flag) {
		this.packet_flag = packet_flag;
	}

	private ArrayList<String> messageIdList;
	
	public MessageMetaData(String name) {
		this.name = name;
		this.fields = new LinkedHashMap<String, Field>();
		messageIdList = new ArrayList<String>();
	}

	public ArrayList<String>  getMessageIdList() {
		return messageIdList;
	}
	
	public void addMessageIdList(String fieldName) {
		messageIdList.add(fieldName);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Field> getFields() {
		return fields;
	}

	public void addField(Field field) {
		this.fields.put(field.getName(), field);
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPacket_type() {
		return packet_type;
	}

	public void setPacket_type(String packet_type) {
		this.packet_type = packet_type;
	}

	public boolean isAppliance() {
		return appliance;
	}

	public void setAppliance(boolean appliance) {
		this.appliance = appliance;
	}
}