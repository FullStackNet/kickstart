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
public abstract class Basepractical_attendance extends BaseResource {
	private String id = null;
	private String student_id = null;
	private String student_name = null;
	private String class_name = null;
	private String school_id = null;
	private String customer_id = null;
	private String practical_id = null;
	private String subject_id = null;
	private String practical_name = null;
	private String attended_date_str = null;
	private Long attended_date = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_STUDENT_NAME = "student_name";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_PRACTICAL_ID = "practical_id";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_PRACTICAL_NAME = "practical_name";
	public static String FIELD_ATTENDED_DATE_STR = "attended_date_str";
	public static String FIELD_ATTENDED_DATE = "attended_date";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("practical_attendance");

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

		Field practical_idField = new Field("practical_id", "String");
		practical_idField.setLength(32);
		metaData.addField(practical_idField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setLength(32);
		metaData.addField(subject_idField);

		Field practical_nameField = new Field("practical_name", "String");
		practical_nameField.setLength(32);
		metaData.addField(practical_nameField);

		Field attended_date_strField = new Field("attended_date_str", "String");
		metaData.addField(attended_date_strField);

		Field attended_dateField = new Field("attended_date", "timestamp");
		metaData.addField(attended_dateField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("practical_attendance");

		metaData.setCluster("DB_LOG");
	}

	public Basepractical_attendance() {}

	public Basepractical_attendance(Basepractical_attendance obj) {
		this.id = obj.id;
		this.student_id = obj.student_id;
		this.student_name = obj.student_name;
		this.class_name = obj.class_name;
		this.school_id = obj.school_id;
		this.customer_id = obj.customer_id;
		this.practical_id = obj.practical_id;
		this.subject_id = obj.subject_id;
		this.practical_name = obj.practical_name;
		this.attended_date_str = obj.attended_date_str;
		this.attended_date = obj.attended_date;
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
		if(practical_id != null)
			map.put("practical_id", practical_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(practical_name != null)
			map.put("practical_name", practical_name);
		if(attended_date_str != null)
			map.put("attended_date_str", attended_date_str);
		if(attended_date != null)
			map.put("attended_date", attended_date);
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
		if(practical_id != null)
			map.put("practical_id", practical_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(practical_name != null)
			map.put("practical_name", practical_name);
		if(attended_date_str != null)
			map.put("attended_date_str", attended_date_str);
		if(attended_date != null)
			map.put("attended_date", attended_date);
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
		practical_id = (String) map.get("practical_id");
		subject_id = (String) map.get("subject_id");
		practical_name = (String) map.get("practical_name");
		attended_date_str = (String) map.get("attended_date_str");
		attended_date = (Long) map.get("attended_date");
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

		Object practical_idObj = map.get("practical_id");
		if(practical_idObj != null)
			practical_id = practical_idObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object practical_nameObj = map.get("practical_name");
		if(practical_nameObj != null)
			practical_name = practical_nameObj.toString();

		Object attended_date_strObj = map.get("attended_date_str");
		if(attended_date_strObj != null)
			attended_date_str = attended_date_strObj.toString();

		Object attended_dateObj = map.get("attended_date");
		if(attended_dateObj != null)
			attended_date = new Long(attended_dateObj.toString());

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

	public String getPractical_id() {
		return practical_id;
	}

	public String getPractical_idEx() {
		return practical_id != null ? practical_id : "";
	}

	public void setPractical_id(String practical_id) {
		this.practical_id = practical_id;
	}

	public void unSetPractical_id() {
		this.practical_id = null;
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

	public String getPractical_name() {
		return practical_name;
	}

	public String getPractical_nameEx() {
		return practical_name != null ? practical_name : "";
	}

	public void setPractical_name(String practical_name) {
		this.practical_name = practical_name;
	}

	public void unSetPractical_name() {
		this.practical_name = null;
	}

	public String getAttended_date_str() {
		return attended_date_str;
	}

	public String getAttended_date_strEx() {
		return attended_date_str != null ? attended_date_str : "";
	}

	public void setAttended_date_str(String attended_date_str) {
		this.attended_date_str = attended_date_str;
	}

	public void unSetAttended_date_str() {
		this.attended_date_str = null;
	}

	public Long getAttended_date() {
		return attended_date;
	}

	public void setAttended_date(Long attended_date) {
		this.attended_date = attended_date;
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