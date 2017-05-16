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
	private String name = null;
	private String class_name = null;
	private String customer_id = null;
	private String subject_id = null;
	private String chapter_id = null;
	private String chapter_no = null;
	private String chapter_name = null;
	private String topic_id = null;
	private String topic_name = null;
	private String topic_no = null;
	private String sheet_no = null;
	private String question_filename = null;
	private String answer_filename = null;
	private Integer total_marks = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_CHAPTER_ID = "chapter_id";
	public static String FIELD_CHAPTER_NO = "chapter_no";
	public static String FIELD_CHAPTER_NAME = "chapter_name";
	public static String FIELD_TOPIC_ID = "topic_id";
	public static String FIELD_TOPIC_NAME = "topic_name";
	public static String FIELD_TOPIC_NO = "topic_no";
	public static String FIELD_SHEET_NO = "sheet_no";
	public static String FIELD_QUESTION_FILENAME = "question_filename";
	public static String FIELD_ANSWER_FILENAME = "answer_filename";
	public static String FIELD_TOTAL_MARKS = "total_marks";
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

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(32);
		metaData.addField(class_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(32);
		metaData.addField(customer_idField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setLength(32);
		metaData.addField(subject_idField);

		Field chapter_idField = new Field("chapter_id", "String");
		chapter_idField.setLength(32);
		metaData.addField(chapter_idField);

		Field chapter_noField = new Field("chapter_no", "String");
		chapter_noField.setLength(32);
		metaData.addField(chapter_noField);

		Field chapter_nameField = new Field("chapter_name", "String");
		chapter_nameField.setLength(32);
		metaData.addField(chapter_nameField);

		Field topic_idField = new Field("topic_id", "String");
		topic_idField.setLength(32);
		metaData.addField(topic_idField);

		Field topic_nameField = new Field("topic_name", "String");
		topic_nameField.setLength(32);
		metaData.addField(topic_nameField);

		Field topic_noField = new Field("topic_no", "String");
		topic_noField.setLength(32);
		metaData.addField(topic_noField);

		Field sheet_noField = new Field("sheet_no", "String");
		sheet_noField.setLength(128);
		metaData.addField(sheet_noField);

		Field question_filenameField = new Field("question_filename", "String");
		question_filenameField.setLength(128);
		metaData.addField(question_filenameField);

		Field answer_filenameField = new Field("answer_filename", "String");
		answer_filenameField.setLength(128);
		metaData.addField(answer_filenameField);

		Field total_marksField = new Field("total_marks", "int");
		metaData.addField(total_marksField);

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
		this.name = obj.name;
		this.class_name = obj.class_name;
		this.customer_id = obj.customer_id;
		this.subject_id = obj.subject_id;
		this.chapter_id = obj.chapter_id;
		this.chapter_no = obj.chapter_no;
		this.chapter_name = obj.chapter_name;
		this.topic_id = obj.topic_id;
		this.topic_name = obj.topic_name;
		this.topic_no = obj.topic_no;
		this.sheet_no = obj.sheet_no;
		this.question_filename = obj.question_filename;
		this.answer_filename = obj.answer_filename;
		this.total_marks = obj.total_marks;
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
		if(class_name != null)
			map.put("class_name", class_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(chapter_id != null)
			map.put("chapter_id", chapter_id);
		if(chapter_no != null)
			map.put("chapter_no", chapter_no);
		if(chapter_name != null)
			map.put("chapter_name", chapter_name);
		if(topic_id != null)
			map.put("topic_id", topic_id);
		if(topic_name != null)
			map.put("topic_name", topic_name);
		if(topic_no != null)
			map.put("topic_no", topic_no);
		if(sheet_no != null)
			map.put("sheet_no", sheet_no);
		if(question_filename != null)
			map.put("question_filename", question_filename);
		if(answer_filename != null)
			map.put("answer_filename", answer_filename);
		if(total_marks != null)
			map.put("total_marks", total_marks);
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
		if(class_name != null)
			map.put("class_name", class_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(chapter_id != null)
			map.put("chapter_id", chapter_id);
		if(chapter_no != null)
			map.put("chapter_no", chapter_no);
		if(chapter_name != null)
			map.put("chapter_name", chapter_name);
		if(topic_id != null)
			map.put("topic_id", topic_id);
		if(topic_name != null)
			map.put("topic_name", topic_name);
		if(topic_no != null)
			map.put("topic_no", topic_no);
		if(sheet_no != null)
			map.put("sheet_no", sheet_no);
		if(question_filename != null)
			map.put("question_filename", question_filename);
		if(answer_filename != null)
			map.put("answer_filename", answer_filename);
		if(total_marks != null)
			map.put("total_marks", total_marks);
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
		class_name = (String) map.get("class_name");
		customer_id = (String) map.get("customer_id");
		subject_id = (String) map.get("subject_id");
		chapter_id = (String) map.get("chapter_id");
		chapter_no = (String) map.get("chapter_no");
		chapter_name = (String) map.get("chapter_name");
		topic_id = (String) map.get("topic_id");
		topic_name = (String) map.get("topic_name");
		topic_no = (String) map.get("topic_no");
		sheet_no = (String) map.get("sheet_no");
		question_filename = (String) map.get("question_filename");
		answer_filename = (String) map.get("answer_filename");
		total_marks = (Integer) map.get("total_marks");
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

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object chapter_idObj = map.get("chapter_id");
		if(chapter_idObj != null)
			chapter_id = chapter_idObj.toString();

		Object chapter_noObj = map.get("chapter_no");
		if(chapter_noObj != null)
			chapter_no = chapter_noObj.toString();

		Object chapter_nameObj = map.get("chapter_name");
		if(chapter_nameObj != null)
			chapter_name = chapter_nameObj.toString();

		Object topic_idObj = map.get("topic_id");
		if(topic_idObj != null)
			topic_id = topic_idObj.toString();

		Object topic_nameObj = map.get("topic_name");
		if(topic_nameObj != null)
			topic_name = topic_nameObj.toString();

		Object topic_noObj = map.get("topic_no");
		if(topic_noObj != null)
			topic_no = topic_noObj.toString();

		Object sheet_noObj = map.get("sheet_no");
		if(sheet_noObj != null)
			sheet_no = sheet_noObj.toString();

		Object question_filenameObj = map.get("question_filename");
		if(question_filenameObj != null)
			question_filename = question_filenameObj.toString();

		Object answer_filenameObj = map.get("answer_filename");
		if(answer_filenameObj != null)
			answer_filename = answer_filenameObj.toString();

		Object total_marksObj = map.get("total_marks");
		if(total_marksObj != null)
			total_marks = new Integer(total_marksObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

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

	public String getChapter_no() {
		return chapter_no;
	}

	public String getChapter_noEx() {
		return chapter_no != null ? chapter_no : "";
	}

	public void setChapter_no(String chapter_no) {
		this.chapter_no = chapter_no;
	}

	public void unSetChapter_no() {
		this.chapter_no = null;
	}

	public String getChapter_name() {
		return chapter_name;
	}

	public String getChapter_nameEx() {
		return chapter_name != null ? chapter_name : "";
	}

	public void setChapter_name(String chapter_name) {
		this.chapter_name = chapter_name;
	}

	public void unSetChapter_name() {
		this.chapter_name = null;
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

	public String getTopic_name() {
		return topic_name;
	}

	public String getTopic_nameEx() {
		return topic_name != null ? topic_name : "";
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

	public void unSetTopic_name() {
		this.topic_name = null;
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

	public String getQuestion_filename() {
		return question_filename;
	}

	public String getQuestion_filenameEx() {
		return question_filename != null ? question_filename : "";
	}

	public void setQuestion_filename(String question_filename) {
		this.question_filename = question_filename;
	}

	public void unSetQuestion_filename() {
		this.question_filename = null;
	}

	public String getAnswer_filename() {
		return answer_filename;
	}

	public String getAnswer_filenameEx() {
		return answer_filename != null ? answer_filename : "";
	}

	public void setAnswer_filename(String answer_filename) {
		this.answer_filename = answer_filename;
	}

	public void unSetAnswer_filename() {
		this.answer_filename = null;
	}

	public Integer getTotal_marks() {
		return total_marks;
	}

	public int getTotal_marksEx() {
		return total_marks != null ? total_marks : 0;
	}

	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}

	public void setTotal_marks(Integer total_marks) {
		this.total_marks = total_marks;
	}

	public void unSetTotal_marks() {
		this.total_marks = null;
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