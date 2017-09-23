/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map.Entry;

import platform.db.ResourceMetaData;
import platform.util.Field;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public class JsonParser {
	private ResourceMetaData resourceMetaData;
	
	private String basePath = null;
	private static String FILE_EXTENSION = ".json";
	
	public JsonParser(String basePath, String resourceName) {
		this.basePath = basePath;
		this.resourceMetaData = new ResourceMetaData(resourceName);
	}
	
	public void parse() throws Exception {
		String jsonInput = readJson();
		JsonObject root = new com.google.gson.JsonParser().parse(jsonInput).getAsJsonObject();
		JsonObject resource = root.getAsJsonObject(resourceMetaData.getName());
		for(Entry<String, JsonElement> entry : resource.entrySet()) {
			String key = entry.getKey();
			JsonElement jsonElement = entry.getValue();
			if(key.equals("comment"))
				resourceMetaData.setComment(jsonElement.getAsString());
			else if(key.equals("fields"))
				processFields(jsonElement.getAsJsonObject());
			else if(key.equals("indexes"))
				processIndexes(jsonElement.getAsJsonObject());
			else if(key.equals("constraints"))
				processClassConstraint(jsonElement.getAsJsonObject());
			else if(key.equals("cluster")) 
				resourceMetaData.setCluster(jsonElement.getAsString());
			else if(key.equals("cluster_type")) 
				resourceMetaData.setClusterType(jsonElement.getAsString());
			else if(key.equals("table")) 
				resourceMetaData.setTableName(jsonElement.getAsString());
			
		}
	}
	
	public ResourceMetaData getResourceMetaData() {
		return resourceMetaData;
	}

	private String readJson() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(basePath + resourceMetaData.getName() + FILE_EXTENSION));
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
	
	private void processFields(JsonObject fieldsJson) {
		for(Entry<String, JsonElement> entry : fieldsJson.entrySet()) {
			String key = entry.getKey();
			JsonObject jsonObject = entry.getValue().getAsJsonObject();
			processField(key, jsonObject);
		}
	}
	
	private void processIndexes(JsonObject indexesJson) {
		for(Entry<String, JsonElement> entry : indexesJson.entrySet()) {
			String key = entry.getKey();
			JsonObject jsonObject = entry.getValue().getAsJsonObject();
			processIndex(key, jsonObject);
		}
	}
	private void processIndex(String name, JsonObject indexJson) {
		ArrayList<String> list = new ArrayList<String>();
		for(Entry<String, JsonElement> entry : indexJson.entrySet()) {
			list.add(entry.getKey());
		}
		resourceMetaData.addIndex(list.toArray(new String[list.size()]));
	}
	
	private void processField(String name, JsonObject fieldJson) {
		Field field = new Field(name);
		for(Entry<String, JsonElement> entry : fieldJson.entrySet()) {
			String key = entry.getKey();
			JsonElement jsonElement = entry.getValue();
			if(key.equals("type"))
				field.setType(jsonElement.getAsString());
			else if(key.equals("valueType"))
				field.setValueType(jsonElement.getAsString());
			else if(key.equals("default"))
				processFieldDefault(jsonElement, field);
			else if(key.equals("comment"))
				field.setDescription(jsonElement.getAsString());
			else if(key.equals("length"))
				field.setLength(jsonElement.getAsInt());
			else if(key.equals("precision"))
				field.setPrecision(jsonElement.getAsInt());
			else if(key.equals("constraints"))
				processFieldConstraint(jsonElement.getAsJsonObject(), field);
			else if(key.equals("index"))
				field.setIndexed(jsonElement.getAsBoolean());
			else if(key.equals("transient"))
				field.setTransient(jsonElement.getAsBoolean());
			else if(key.equals("required"))
				field.setRequired(jsonElement.getAsBoolean());
			else if(key.equals("autoGenerate") && field.isTime())
				field.setTimeGenerationRequired(jsonElement.getAsBoolean());
			else if(key.equals("encrypt"))
				field.setEncrypt(jsonElement.getAsBoolean());
			else if(key.equals("counter"))
				field.setCounter(jsonElement.getAsBoolean());
			else if(key.equals("self_key"))
				field.setSelf_key(jsonElement.getAsString());
			else if(key.equals("reference_table"))
				field.setReference_table(jsonElement.getAsString());
			else if(key.equals("reference_key"))
				field.setReference_key(jsonElement.getAsString());
			else if(key.equals("reference_name"))
				field.setReference_name(jsonElement.getAsString());
		}
		resourceMetaData.addField(field);
		if(field.isFile()) {
			Field typeField = new Field(name + Field.FILE_TYPE_FIELD_SUFFIX);
			if(field.isImage())
				typeField.setValue(Field.DEFAULT_IMAGE_CONTENT_TYPE);
			typeField.setValidationRequired(true);
			resourceMetaData.addField(typeField);
			
			Field timeStampField = new Field(name + Field.TIME_STAMP_FIELD_SUFFIX);
			timeStampField.setType("time");
			resourceMetaData.addField(timeStampField);
		}
	}
	
	private void processFieldDefault(JsonElement valueJsonElement, Field field) {
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
	
	private void processFieldMinValue(JsonElement valueJsonElement, Field field) {
		String type = field.getType();
		if(type.equals("boolean"))
			field.setMinValue(valueJsonElement.getAsBoolean());
		else if(type.equals("byte"))
			field.setMinValue(valueJsonElement.getAsByte());
		else if(type.equals("short"))
			field.setMinValue(valueJsonElement.getAsShort());
		else if(type.equals("char"))
			field.setMinValue(valueJsonElement.getAsCharacter());
		else if(type.equals("int"))
			field.setMinValue(valueJsonElement.getAsInt());
		else if(type.equals("long"))
			field.setMinValue(valueJsonElement.getAsLong());
		else if(type.equals("float"))
			field.setMinValue(valueJsonElement.getAsFloat());
		else if(type.equals("double"))
			field.setMinValue(valueJsonElement.getAsDouble());
		else if(type.equals("String"))
			field.setMinValue(valueJsonElement.getAsString());
		else if(field.isFile())
			field.setMinValue(valueJsonElement.getAsLong() * 1024);
	}
	
	private void processFieldMaxValue(JsonElement valueJsonElement, Field field) {
		String type = field.getType();
		if(type.equals("boolean"))
			field.setMaxValue(valueJsonElement.getAsBoolean());
		else if(type.equals("byte"))
			field.setMaxValue(valueJsonElement.getAsByte());
		else if(type.equals("short"))
			field.setMaxValue(valueJsonElement.getAsShort());
		else if(type.equals("char"))
			field.setMaxValue(valueJsonElement.getAsCharacter());
		else if(type.equals("int"))
			field.setMaxValue(valueJsonElement.getAsInt());
		else if(type.equals("long"))
			field.setMaxValue(valueJsonElement.getAsLong());
		else if(type.equals("float"))
			field.setMaxValue(valueJsonElement.getAsFloat());
		else if(type.equals("double"))
			field.setMaxValue(valueJsonElement.getAsDouble());
		else if(type.equals("String"))
			field.setMaxValue(valueJsonElement.getAsString());
		else if(field.isFile())
			field.setMaxValue(valueJsonElement.getAsLong() * 1024);
	}
	
	private void processFieldConstraint(JsonObject constraintJsonObject, Field field) {
		for(Entry<String, JsonElement> entry : constraintJsonObject.entrySet()) {
			String key = entry.getKey();
			JsonElement object = entry.getValue();
			if(key.equals("primaryKey"))
				field.setPrimary(object.getAsBoolean());
			else if(key.equals("required"))
				field.setRequired(object.getAsBoolean());
			else if(key.equals("minValue"))
				processFieldMinValue(object, field);
			else if(key.equals("maxValue"))
				processFieldMaxValue(object, field);
		}
	}
	
	private void processClassConstraint(JsonObject constraintJsonObject) {
		for(Entry<String, JsonElement> entry : constraintJsonObject.entrySet()) {
			String key = entry.getKey();
			JsonElement jsonElement = entry.getValue();
			if(key.equals("checkBeforeAdd"))
				resourceMetaData.setCheckBeforeAdd(jsonElement.getAsBoolean());
			else if(key.equals("checkBeforeUpdate"))
				resourceMetaData.setCheckBeforeUpdate(jsonElement.getAsBoolean());
			else if(key.equals("cacheable"))
				resourceMetaData.setCacheable(jsonElement.getAsBoolean());
			else if(key.equals("uniqueFields"))
				processUniqueConstraint(jsonElement.getAsJsonArray());
		}
	}
	
	private void processUniqueConstraint(JsonArray uniqueConstraintsArray) {
		String[][] uniqueFieldNames = new String[uniqueConstraintsArray.size()][];
		for(int i = 0; i < uniqueFieldNames.length; i++) {
			JsonArray uniqueConstraintArray = uniqueConstraintsArray.get(i).getAsJsonArray();
			uniqueFieldNames[i] = new String[uniqueConstraintArray.size()];
			for(int j = 0; j < uniqueFieldNames[i].length; j++) {
				uniqueFieldNames[i][j] = uniqueConstraintArray.get(j).getAsString();
			}			
		}
		resourceMetaData.setUniqueFieldNames(uniqueFieldNames);
	}
}
