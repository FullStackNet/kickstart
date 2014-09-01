/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basework_sheet extends BaseResource {
	private String id = null;
	private String class_name = null;
	private String subject_id = null;
	private String customer_id = null;
	private String sheet_no = null;
	private String chapter_id = null;
	private String chapter = null;
	private String topic_id = null;
	private String topic = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_SHEET_NO = "sheet_no";
	public static String FIELD_CHAPTER_ID = "chapter_id";
	public static String FIELD_CHAPTER = "chapter";
	public static String FIELD_TOPIC_ID = "topic_id";
	public static String FIELD_TOPIC = "topic";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("work_sheet");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(32);
		metaData.addField(class_nameField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setLength(128);
		metaData.addField(subject_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field sheet_noField = new Field("sheet_no", "String");
		sheet_noField.setLength(128);
		metaData.addField(sheet_noField);

		Field chapter_idField = new Field("chapter_id", "String");
		chapter_idField.setLength(512);
		metaData.addField(chapter_idField);

		Field chapterField = new Field("chapter", "String");
		chapterField.setLength(512);
		metaData.addField(chapterField);

		Field topic_idField = new Field("topic_id", "String");
		topic_idField.setLength(512);
		metaData.addField(topic_idField);

		Field topicField = new Field("topic", "String");
		topicField.setLength(512);
		metaData.addField(topicField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("work_sheet");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basework_sheet() {}

	public Basework_sheet(Basework_sheet obj) {
		this.id = obj.id;
		this.class_name = obj.class_name;
		this.subject_id = obj.subject_id;
		this.customer_id = obj.customer_id;
		this.sheet_no = obj.sheet_no;
		this.chapter_id = obj.chapter_id;
		this.chapter = obj.chapter;
		this.topic_id = obj.topic_id;
		this.topic = obj.topic;
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
		if(class_name != null)
			map.put("class_name", class_name);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(sheet_no != null)
			map.put("sheet_no", sheet_no);
		if(chapter_id != null)
			map.put("chapter_id", chapter_id);
		if(chapter != null)
			map.put("chapter", chapter);
		if(topic_id != null)
			map.put("topic_id", topic_id);
		if(topic != null)
			map.put("topic", topic);
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
		if(class_name != null)
			map.put("class_name", class_name);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(sheet_no != null)
			map.put("sheet_no", sheet_no);
		if(chapter_id != null)
			map.put("chapter_id", chapter_id);
		if(chapter != null)
			map.put("chapter", chapter);
		if(topic_id != null)
			map.put("topic_id", topic_id);
		if(topic != null)
			map.put("topic", topic);
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
		class_name = (String) map.get("class_name");
		subject_id = (String) map.get("subject_id");
		customer_id = (String) map.get("customer_id");
		sheet_no = (String) map.get("sheet_no");
		chapter_id = (String) map.get("chapter_id");
		chapter = (String) map.get("chapter");
		topic_id = (String) map.get("topic_id");
		topic = (String) map.get("topic");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object sheet_noObj = map.get("sheet_no");
		if(sheet_noObj != null)
			sheet_no = sheet_noObj.toString();

		Object chapter_idObj = map.get("chapter_id");
		if(chapter_idObj != null)
			chapter_id = chapter_idObj.toString();

		Object chapterObj = map.get("chapter");
		if(chapterObj != null)
			chapter = chapterObj.toString();

		Object topic_idObj = map.get("topic_id");
		if(topic_idObj != null)
			topic_id = topic_idObj.toString();

		Object topicObj = map.get("topic");
		if(topicObj != null)
			topic = topicObj.toString();

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

	public String getClass_name() {
		return class_name;
	}

	public String getClass_nameEx() {
		return class_name != null ? class_name : "";
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public void unSetClass_name() {
		this.class_name = null;
	}

	public String getSubject_id() {
		return subject_id;
	}

	public String getSubject_idEx() {
		return subject_id != null ? subject_id : "";
	}

	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}

	public void unSetSubject_id() {
		this.subject_id = null;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public String getCustomer_idEx() {
		return customer_id != null ? customer_id : "";
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public void unSetCustomer_id() {
		this.customer_id = null;
	}

	public String getSheet_no() {
		return sheet_no;
	}

	public String getSheet_noEx() {
		return sheet_no != null ? sheet_no : "";
	}

	public void setSheet_no(String sheet_no) {
		this.sheet_no = sheet_no;
	}

	public void unSetSheet_no() {
		this.sheet_no = null;
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

	public String getChapter() {
		return chapter;
	}

	public String getChapterEx() {
		return chapter != null ? chapter : "";
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public void unSetChapter() {
		this.chapter = null;
	}

	public String getTopic_id() {
		return topic_id;
	}

	public String getTopic_idEx() {
		return topic_id != null ? topic_id : "";
	}

	public void setTopic_id(String topic_id) {
		this.topic_id = topic_id;
	}

	public void unSetTopic_id() {
		this.topic_id = null;
	}

	public String getTopic() {
		return topic;
	}

	public String getTopicEx() {
		return topic != null ? topic : "";
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void unSetTopic() {
		this.topic = null;
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