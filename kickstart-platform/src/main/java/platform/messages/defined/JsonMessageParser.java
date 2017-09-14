/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.messages.defined;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Map.Entry;

import platform.util.Field;
import platform.util.MessageMetaData;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public class JsonMessageParser {
	private MessageMetaData messageMetaData;
	
	private static String BASE_PATH = "./src/main/java/platform/messages/defined/";
	private static String FILE_EXTENSION = ".json";
	
	public JsonMessageParser(String resourceName) {
		this.messageMetaData = new MessageMetaData(resourceName);
	}
	
	public void parse() throws Exception {
		String jsonInput = readJson();
		JsonObject root = new com.google.gson.JsonParser().parse(jsonInput).getAsJsonObject();
		JsonObject resource = root.getAsJsonObject(messageMetaData.getName());
		for(Entry<String, JsonElement> entry : resource.entrySet()) {
			String key = entry.getKey();
			JsonElement jsonElement = entry.getValue();
			if(key.equals("command"))
				messageMetaData.setCommand(jsonElement.getAsString());
			else if(key.equals("category"))
				messageMetaData.setCategory(jsonElement.getAsString());
			else if(key.equals("packet_type"))
				messageMetaData.setPacket_type(jsonElement.getAsString());
			else if(key.equals("appliance"))
				messageMetaData.setAppliance(jsonElement.getAsBoolean());
			else if(key.equals("packet_flag"))
				messageMetaData.setPacket_flag(jsonElement.getAsString());
			else if(key.equals("fields"))
				processFields(jsonElement.getAsJsonObject());
			else if(key.equals("message_id"))
				processMessageId(jsonElement.getAsJsonArray());
			
			else if(key.equals("fields"))
				processFields(jsonElement.getAsJsonObject());
		}
	}
	
	public MessageMetaData getMessageMetaData() {
		return messageMetaData;
	}

	private String readJson() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(BASE_PATH + messageMetaData.getName() + FILE_EXTENSION));
		StringBuffer jsonInput = new StringBuffer();
		while(true) {
			String line = reader.readLine();
			if(line == null)
				break;
			jsonInput.append(line);
		}
		reader.close();
		return jsonInput.toString();
	}
	
	private void processMessageId(JsonArray valueJsonArray) {
		int length = valueJsonArray.size();
		for(int i = 0; i < length; i++) {
				messageMetaData.addMessageIdList(valueJsonArray.get(i).getAsString());
		}
	}
	
	private void processFields(JsonObject fieldsJson) {
		for(Entry<String, JsonElement> entry : fieldsJson.entrySet()) {
			String key = entry.getKey();
			JsonObject jsonObject = entry.getValue().getAsJsonObject();
			processField(key, jsonObject);
		}
	}
	
	private void processField(String name, JsonObject fieldJson) {
		Field field = new Field(name);
		for(Entry<String, JsonElement> entry : fieldJson.entrySet()) {
			String key = entry.getKey();
			JsonElement jsonElement = entry.getValue();
			
			if(key.equals("length"))
				field.setLength(jsonElement.getAsInt());
			if(key.equals("type"))
				field.setType(jsonElement.getAsString());
			else if(key.equals("valueType"))
				field.setValueType(jsonElement.getAsString());
			else if(key.equals("defaultValue"))
				processFieldValue(jsonElement, field);
			else if(key.equals("comment"))
				field.setDescription(jsonElement.getAsString());
			else if(key.equals("index"))
				field.setIndexed(jsonElement.getAsBoolean());
			else if(key.equals("transient"))
				field.setTransient(jsonElement.getAsBoolean());
			else if(key.equals("autoGenerate") && field.isTime())
				field.setTimeGenerationRequired(jsonElement.getAsBoolean());
			else if(key.equals("encrypt"))
				field.setEncrypt(jsonElement.getAsBoolean());
			else if(key.equals("counter"))
				field.setCounter(jsonElement.getAsBoolean());
		}
		messageMetaData.addField(field);
		if(field.isFile()) {
			Field typeField = new Field(name + Field.FILE_TYPE_FIELD_SUFFIX);
			if(field.isImage())
				typeField.setValue(Field.DEFAULT_IMAGE_CONTENT_TYPE);
			typeField.setValidationRequired(true);
			messageMetaData.addField(typeField);
			
			Field timeStampField = new Field(name + Field.TIME_STAMP_FIELD_SUFFIX);
			timeStampField.setType("time");
			messageMetaData.addField(timeStampField);
		}
	}
	
	private void processFieldValue(JsonElement valueJsonElement, Field field) {
		String type = field.getType();
		if(type.equals("boolean"))
			field.setValue(valueJsonElement.getAsBoolean());
		else if(type.equals("byte"))
			field.setValue(valueJsonElement.getAsByte());
		else if(type.equals("short"))
			field.setValue(valueJsonElement.getAsShort());
		else if(type.equals("char"))
			field.setValue(valueJsonElement.getAsCharacter());
		else if(type.equals("int"))
			field.setValue(valueJsonElement.getAsInt());
		else if(type.equals("long"))
			field.setValue(valueJsonElement.getAsLong());
		else if(type.equals("float"))
			field.setValue(valueJsonElement.getAsFloat());
		else if(type.equals("double"))
			field.setValue(valueJsonElement.getAsDouble());
		else if(type.equals("String"))
			field.setValue(valueJsonElement.getAsString());
		else if(field.isArray())
			processFieldValue(valueJsonElement.getAsJsonArray(), field);
	}
	
	private void processFieldValue(JsonArray valueJsonArray, Field field)
	{
		String type = field.getType();
		Class<?> clazz = null;
		if(type.equals("byte[]"))
			clazz = byte.class;
		else if(type.equals("short[]"))
			clazz = short.class;
		else if(type.equals("int[]"))
			clazz = int.class;
		else if(type.equals("long[]"))
			clazz = long.class;
		else if(type.equals("float[]"))
			clazz = float.class;
		else if(type.equals("double[]"))
			clazz = double.class;
		else if(type.equals("String[]"))
			clazz = String.class;
		
		int length = valueJsonArray.size();
		Object array = Array.newInstance(clazz, length);
		for(int i = 0; i < length; i++) {
			if(type.equals("byte[]"))
				Array.setByte(array, i, valueJsonArray.get(i).getAsByte());
			else if(type.equals("short[]"))
				Array.setShort(array, i, valueJsonArray.get(i).getAsShort());
			else if(type.equals("int[]"))
				Array.setInt(array, i, valueJsonArray.get(i).getAsInt());
			else if(type.equals("long[]"))
				Array.setLong(array, i, valueJsonArray.get(i).getAsLong());
			else if(type.equals("float[]"))
				Array.setFloat(array, i, valueJsonArray.get(i).getAsFloat());
			else if(type.equals("double[]"))
				Array.setDouble(array, i, valueJsonArray.get(i).getAsDouble());
			else if(type.equals("String[]"))
				Array.set(array, i, valueJsonArray.get(i).getAsString());
		}
		field.setValue(array);
	}
}
