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
public abstract class Basefee_master extends BaseResource {
	private String id = null;
	private String name = null;
	private String school_id = null;
	private String customer_id = null;
	private String class_name = null;
	private String course_id = null;
	private String due_date_str = null;
	private Long due_date = null;
	private String batch_id = null;
	private String batch_name = null;
	private Double total_fees = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_COURSE_ID = "course_id";
	public static String FIELD_DUE_DATE_STR = "due_date_str";
	public static String FIELD_DUE_DATE = "due_date";
	public static String FIELD_BATCH_ID = "batch_id";
	public static String FIELD_BATCH_NAME = "batch_name";
	public static String FIELD_TOTAL_FEES = "total_fees";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("fee_master");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setIndexed(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(512);
		metaData.addField(class_nameField);

		Field course_idField = new Field("course_id", "String");
		course_idField.setLength(512);
		metaData.addField(course_idField);

		Field due_date_strField = new Field("due_date_str", "String");
		due_date_strField.setLength(32);
		metaData.addField(due_date_strField);

		Field due_dateField = new Field("due_date", "long");
		metaData.addField(due_dateField);

		Field batch_idField = new Field("batch_id", "String");
		batch_idField.setLength(512);
		metaData.addField(batch_idField);

		Field batch_nameField = new Field("batch_name", "String");
		batch_nameField.setLength(512);
		metaData.addField(batch_nameField);

		Field total_feesField = new Field("total_fees", "double");
		metaData.addField(total_feesField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("fee_master");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basefee_master() {}

	public Basefee_master(Basefee_master obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.school_id = obj.school_id;
		this.customer_id = obj.customer_id;
		this.class_name = obj.class_name;
		this.course_id = obj.course_id;
		this.due_date_str = obj.due_date_str;
		this.due_date = obj.due_date;
		this.batch_id = obj.batch_id;
		this.batch_name = obj.batch_name;
		this.total_fees = obj.total_fees;
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
		if(school_id != null)
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(course_id != null)
			map.put("course_id", course_id);
		if(due_date_str != null)
			map.put("due_date_str", due_date_str);
		if(due_date != null)
			map.put("due_date", due_date);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(total_fees != null)
			map.put("total_fees", total_fees);
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
		if(school_id != null)
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(course_id != null)
			map.put("course_id", course_id);
		if(due_date_str != null)
			map.put("due_date_str", due_date_str);
		if(due_date != null)
			map.put("due_date", due_date);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(total_fees != null)
			map.put("total_fees", total_fees);
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
		school_id = (String) map.get("school_id");
		customer_id = (String) map.get("customer_id");
		class_name = (String) map.get("class_name");
		course_id = (String) map.get("course_id");
		due_date_str = (String) map.get("due_date_str");
		due_date = (Long) map.get("due_date");
		batch_id = (String) map.get("batch_id");
		batch_name = (String) map.get("batch_name");
		total_fees = (Double) map.get("total_fees");
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

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object course_idObj = map.get("course_id");
		if(course_idObj != null)
			course_id = course_idObj.toString();

		Object due_date_strObj = map.get("due_date_str");
		if(due_date_strObj != null)
			due_date_str = due_date_strObj.toString();

		Object due_dateObj = map.get("due_date");
		if(due_dateObj != null)
			due_date = new Long(due_dateObj.toString());

		Object batch_idObj = map.get("batch_id");
		if(batch_idObj != null)
			batch_id = batch_idObj.toString();

		Object batch_nameObj = map.get("batch_name");
		if(batch_nameObj != null)
			batch_name = batch_nameObj.toString();

		Object total_feesObj = map.get("total_fees");
		if(total_feesObj != null)
			total_fees = new Double(total_feesObj.toString());

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

	public String getCourse_id() {
		return course_id;
	}

	public String getCourse_idEx() {
		return course_id != null ? course_id : "";
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public void unSetCourse_id() {
		this.course_id = null;
	}

	public String getDue_date_str() {
		return due_date_str;
	}

	public String getDue_date_strEx() {
		return due_date_str != null ? due_date_str : "";
	}

	public void setDue_date_str(String due_date_str) {
		this.due_date_str = due_date_str;
	}

	public void unSetDue_date_str() {
		this.due_date_str = null;
	}

	public Long getDue_date() {
		return due_date;
	}

	public long getDue_dateEx() {
		return due_date != null ? due_date : 0L;
	}

	public void setDue_date(long due_date) {
		this.due_date = due_date;
	}

	public void setDue_date(Long due_date) {
		this.due_date = due_date;
	}

	public void unSetDue_date() {
		this.due_date = null;
	}

	public String getBatch_id() {
		return batch_id;
	}

	public String getBatch_idEx() {
		return batch_id != null ? batch_id : "";
	}

	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}

	public void unSetBatch_id() {
		this.batch_id = null;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public String getBatch_nameEx() {
		return batch_name != null ? batch_name : "";
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public void unSetBatch_name() {
		this.batch_name = null;
	}

	public Double getTotal_fees() {
		return total_fees;
	}

	public double getTotal_feesEx() {
		return total_fees != null ? total_fees : 0;
	}

	public void setTotal_fees(double total_fees) {
		this.total_fees = total_fees;
	}

	public void setTotal_fees(Double total_fees) {
		this.total_fees = total_fees;
	}

	public void unSetTotal_fees() {
		this.total_fees = null;
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