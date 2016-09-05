/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import java.util.HashMap;
import java.util.Map;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basetopic extends BaseResource {
	private String id = null;
	private String name = null;
	private String topic_no = null;
	private String chapter_id = null;
	private String file_name = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TOPIC_NO = "topic_no";
	public static String FIELD_CHAPTER_ID = "chapter_id";
	public static String FIELD_FILE_NAME = "file_name";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("topic");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(512);
		metaData.addField(nameField);

		Field topic_noField = new Field("topic_no", "String");
		topic_noField.setLength(10);
		metaData.addField(topic_noField);

		Field chapter_idField = new Field("chapter_id", "String");
		chapter_idField.setLength(128);
		metaData.addField(chapter_idField);

		Field file_nameField = new Field("file_name", "String");
		file_nameField.setLength(128);
		metaData.addField(file_nameField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("topic");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basetopic() {}

	public Basetopic(Basetopic obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.topic_no = obj.topic_no;
		this.chapter_id = obj.chapter_id;
		this.file_name = obj.file_name;
		this.creation_time = obj.creation_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(topic_no != null)
			map.put("topic_no", topic_no);
		if(chapter_id != null)
			map.put("chapter_id", chapter_id);
		if(file_name != null)
			map.put("file_name", file_name);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(topic_no != null)
			map.put("topic_no", topic_no);
		if(chapter_id != null)
			map.put("chapter_id", chapter_id);
		if(file_name != null)
			map.put("file_name", file_name);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	@SuppressWarnings("unchecked")
	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		name = (String) map.get("name");
		topic_no = (String) map.get("topic_no");
		chapter_id = (String) map.get("chapter_id");
		file_name = (String) map.get("file_name");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object topic_noObj = map.get("topic_no");
		if(topic_noObj != null)
			topic_no = topic_noObj.toString();

		Object chapter_idObj = map.get("chapter_id");
		if(chapter_idObj != null)
			chapter_id = chapter_idObj.toString();

		Object file_nameObj = map.get("file_name");
		if(file_nameObj != null)
			file_name = file_nameObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	public void convertPrimaryMapToResource(Map<String, Object> map) {
	}

	public void convertTypeUnsafePrimaryMapToResource(Map<String, Object> map) {
	}

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

	public boolean validateId(boolean add) throws ApplicationException {
		if(add && id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[id]");
		return id != null;
	}

	public String getName() {
		return name;
	}

	public String getNameEx() {
		return name != null ? name : "";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void unSetName() {
		this.name = null;
	}

	public String getTopic_no() {
		return topic_no;
	}

	public String getTopic_noEx() {
		return topic_no != null ? topic_no : "";
	}

	public void setTopic_no(String topic_no) {
		this.topic_no = topic_no;
	}

	public void unSetTopic_no() {
		this.topic_no = null;
	}

	public String getChapter_id() {
		return chapter_id;
	}

	public String getChapter_idEx() {
		return chapter_id != null ? chapter_id : "";
	}

	public void setChapter_id(String chapter_id) {
		this.chapter_id = chapter_id;
	}

	public void unSetChapter_id() {
		this.chapter_id = null;
	}

	public String getFile_name() {
		return file_name;
	}

	public String getFile_nameEx() {
		return file_name != null ? file_name : "";
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public void unSetFile_name() {
		this.file_name = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Map<String, Object> getExtra_data() {
		return extra_data;
	}

	public Object getExtra_data(String key) {
		return extra_data == null ? null : extra_data.get(key);
	}

	public void setExtra_data(Map<String, Object> extra_data) {
		this.extra_data = extra_data;
	}

	public void setExtra_data(String key, Object value) {
		if(extra_data == null)
			extra_data = new HashMap<String, Object>();
		extra_data.put(key, value);
	}

	public void unSetExtra_data() {
		this.extra_data = null;
	}
	public String getCluster() {
		return "DB_SCHOOL";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}