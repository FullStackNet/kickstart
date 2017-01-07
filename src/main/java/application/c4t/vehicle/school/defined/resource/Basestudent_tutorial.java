/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

import java.util.HashMap;
import java.util.Map;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basestudent_tutorial extends BaseResource {
	private String id = null;
	private String student_id = null;
	private String student_name = null;
	private String class_name = null;
	private String school_id = null;
	private String customer_id = null;
	private String tutorial_id = null;
	private String subject_id = null;
	private String tutorial_title = null;
	private String tutorial_status = null;
	private String assigment_status = null;
	private String mcq_status = null;
	private Double mcq_score = null;
	private String assigned_date_str = null;
	private Long assigned_date = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_STUDENT_NAME = "student_name";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_TUTORIAL_ID = "tutorial_id";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_TUTORIAL_TITLE = "tutorial_title";
	public static String FIELD_TUTORIAL_STATUS = "tutorial_status";
	public static String FIELD_ASSIGMENT_STATUS = "assigment_status";
	public static String FIELD_MCQ_STATUS = "mcq_status";
	public static String FIELD_MCQ_SCORE = "mcq_score";
	public static String FIELD_ASSIGNED_DATE_STR = "assigned_date_str";
	public static String FIELD_ASSIGNED_DATE = "assigned_date";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("student_tutorial");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setLength(32);
		metaData.addField(student_idField);

		Field student_nameField = new Field("student_name", "String");
		student_nameField.setLength(32);
		metaData.addField(student_nameField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(32);
		metaData.addField(class_nameField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(32);
		metaData.addField(school_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(32);
		metaData.addField(customer_idField);

		Field tutorial_idField = new Field("tutorial_id", "String");
		tutorial_idField.setLength(32);
		metaData.addField(tutorial_idField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setLength(32);
		metaData.addField(subject_idField);

		Field tutorial_titleField = new Field("tutorial_title", "String");
		tutorial_titleField.setLength(32);
		metaData.addField(tutorial_titleField);

		Field tutorial_statusField = new Field("tutorial_status", "String");
		metaData.addField(tutorial_statusField);

		Field assigment_statusField = new Field("assigment_status", "String");
		metaData.addField(assigment_statusField);

		Field mcq_statusField = new Field("mcq_status", "String");
		metaData.addField(mcq_statusField);

		Field mcq_scoreField = new Field("mcq_score", "double");
		metaData.addField(mcq_scoreField);

		Field assigned_date_strField = new Field("assigned_date_str", "String");
		metaData.addField(assigned_date_strField);

		Field assigned_dateField = new Field("assigned_date", "timestamp");
		metaData.addField(assigned_dateField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("student_tutorial");

		metaData.setCluster("DB_LOG");
	}

	public Basestudent_tutorial() {}

	public Basestudent_tutorial(Basestudent_tutorial obj) {
		this.id = obj.id;
		this.student_id = obj.student_id;
		this.student_name = obj.student_name;
		this.class_name = obj.class_name;
		this.school_id = obj.school_id;
		this.customer_id = obj.customer_id;
		this.tutorial_id = obj.tutorial_id;
		this.subject_id = obj.subject_id;
		this.tutorial_title = obj.tutorial_title;
		this.tutorial_status = obj.tutorial_status;
		this.assigment_status = obj.assigment_status;
		this.mcq_status = obj.mcq_status;
		this.mcq_score = obj.mcq_score;
		this.assigned_date_str = obj.assigned_date_str;
		this.assigned_date = obj.assigned_date;
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
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(tutorial_id != null)
			map.put("tutorial_id", tutorial_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(tutorial_title != null)
			map.put("tutorial_title", tutorial_title);
		if(tutorial_status != null)
			map.put("tutorial_status", tutorial_status);
		if(assigment_status != null)
			map.put("assigment_status", assigment_status);
		if(mcq_status != null)
			map.put("mcq_status", mcq_status);
		if(mcq_score != null)
			map.put("mcq_score", mcq_score);
		if(assigned_date_str != null)
			map.put("assigned_date_str", assigned_date_str);
		if(assigned_date != null)
			map.put("assigned_date", assigned_date);
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
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(tutorial_id != null)
			map.put("tutorial_id", tutorial_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(tutorial_title != null)
			map.put("tutorial_title", tutorial_title);
		if(tutorial_status != null)
			map.put("tutorial_status", tutorial_status);
		if(assigment_status != null)
			map.put("assigment_status", assigment_status);
		if(mcq_status != null)
			map.put("mcq_status", mcq_status);
		if(mcq_score != null)
			map.put("mcq_score", mcq_score);
		if(assigned_date_str != null)
			map.put("assigned_date_str", assigned_date_str);
		if(assigned_date != null)
			map.put("assigned_date", assigned_date);
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
		student_id = (String) map.get("student_id");
		student_name = (String) map.get("student_name");
		class_name = (String) map.get("class_name");
		school_id = (String) map.get("school_id");
		customer_id = (String) map.get("customer_id");
		tutorial_id = (String) map.get("tutorial_id");
		subject_id = (String) map.get("subject_id");
		tutorial_title = (String) map.get("tutorial_title");
		tutorial_status = (String) map.get("tutorial_status");
		assigment_status = (String) map.get("assigment_status");
		mcq_status = (String) map.get("mcq_status");
		mcq_score = (Double) map.get("mcq_score");
		assigned_date_str = (String) map.get("assigned_date_str");
		assigned_date = (Long) map.get("assigned_date");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object student_nameObj = map.get("student_name");
		if(student_nameObj != null)
			student_name = student_nameObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object tutorial_idObj = map.get("tutorial_id");
		if(tutorial_idObj != null)
			tutorial_id = tutorial_idObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object tutorial_titleObj = map.get("tutorial_title");
		if(tutorial_titleObj != null)
			tutorial_title = tutorial_titleObj.toString();

		Object tutorial_statusObj = map.get("tutorial_status");
		if(tutorial_statusObj != null)
			tutorial_status = tutorial_statusObj.toString();

		Object assigment_statusObj = map.get("assigment_status");
		if(assigment_statusObj != null)
			assigment_status = assigment_statusObj.toString();

		Object mcq_statusObj = map.get("mcq_status");
		if(mcq_statusObj != null)
			mcq_status = mcq_statusObj.toString();

		Object mcq_scoreObj = map.get("mcq_score");
		if(mcq_scoreObj != null)
			mcq_score = new Double(mcq_scoreObj.toString());

		Object assigned_date_strObj = map.get("assigned_date_str");
		if(assigned_date_strObj != null)
			assigned_date_str = assigned_date_strObj.toString();

		Object assigned_dateObj = map.get("assigned_date");
		if(assigned_dateObj != null)
			assigned_date = new Long(assigned_dateObj.toString());

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

	public String getStudent_id() {
		return student_id;
	}

	public String getStudent_idEx() {
		return student_id != null ? student_id : "";
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public void unSetStudent_id() {
		this.student_id = null;
	}

	public String getStudent_name() {
		return student_name;
	}

	public String getStudent_nameEx() {
		return student_name != null ? student_name : "";
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void unSetStudent_name() {
		this.student_name = null;
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

	public String getSchool_id() {
		return school_id;
	}

	public String getSchool_idEx() {
		return school_id != null ? school_id : "";
	}

	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}

	public void unSetSchool_id() {
		this.school_id = null;
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

	public String getTutorial_id() {
		return tutorial_id;
	}

	public String getTutorial_idEx() {
		return tutorial_id != null ? tutorial_id : "";
	}

	public void setTutorial_id(String tutorial_id) {
		this.tutorial_id = tutorial_id;
	}

	public void unSetTutorial_id() {
		this.tutorial_id = null;
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

	public String getTutorial_title() {
		return tutorial_title;
	}

	public String getTutorial_titleEx() {
		return tutorial_title != null ? tutorial_title : "";
	}

	public void setTutorial_title(String tutorial_title) {
		this.tutorial_title = tutorial_title;
	}

	public void unSetTutorial_title() {
		this.tutorial_title = null;
	}

	public String getTutorial_status() {
		return tutorial_status;
	}

	public String getTutorial_statusEx() {
		return tutorial_status != null ? tutorial_status : "";
	}

	public void setTutorial_status(String tutorial_status) {
		this.tutorial_status = tutorial_status;
	}

	public void unSetTutorial_status() {
		this.tutorial_status = null;
	}

	public String getAssigment_status() {
		return assigment_status;
	}

	public String getAssigment_statusEx() {
		return assigment_status != null ? assigment_status : "";
	}

	public void setAssigment_status(String assigment_status) {
		this.assigment_status = assigment_status;
	}

	public void unSetAssigment_status() {
		this.assigment_status = null;
	}

	public String getMcq_status() {
		return mcq_status;
	}

	public String getMcq_statusEx() {
		return mcq_status != null ? mcq_status : "";
	}

	public void setMcq_status(String mcq_status) {
		this.mcq_status = mcq_status;
	}

	public void unSetMcq_status() {
		this.mcq_status = null;
	}

	public Double getMcq_score() {
		return mcq_score;
	}

	public double getMcq_scoreEx() {
		return mcq_score != null ? mcq_score : 0;
	}

	public void setMcq_score(double mcq_score) {
		this.mcq_score = mcq_score;
	}

	public void setMcq_score(Double mcq_score) {
		this.mcq_score = mcq_score;
	}

	public void unSetMcq_score() {
		this.mcq_score = null;
	}

	public String getAssigned_date_str() {
		return assigned_date_str;
	}

	public String getAssigned_date_strEx() {
		return assigned_date_str != null ? assigned_date_str : "";
	}

	public void setAssigned_date_str(String assigned_date_str) {
		this.assigned_date_str = assigned_date_str;
	}

	public void unSetAssigned_date_str() {
		this.assigned_date_str = null;
	}

	public Long getAssigned_date() {
		return assigned_date;
	}

	public void setAssigned_date(Long assigned_date) {
		this.assigned_date = assigned_date;
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
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}