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
public abstract class Baseabsent_detail extends BaseResource {
	private String id = null;
	private String absent_parent_id = null;
	private String school_id = null;
	private String class_section_name = null;
	private Long date = null;
	private String date_str = null;
	private String student_id = null;
	private String leave_apply = null;
	private String remark = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ABSENT_PARENT_ID = "absent_parent_id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CLASS_SECTION_NAME = "class_section_name";
	public static String FIELD_DATE = "date";
	public static String FIELD_DATE_STR = "date_str";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_LEAVE_APPLY = "leave_apply";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("absent_detail");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field absent_parent_idField = new Field("absent_parent_id", "String");
		absent_parent_idField.setIndexed(true);
		absent_parent_idField.setRequired(true);
		absent_parent_idField.setLength(128);
		metaData.addField(absent_parent_idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field class_section_nameField = new Field("class_section_name", "String");
		class_section_nameField.setIndexed(true);
		class_section_nameField.setLength(128);
		metaData.addField(class_section_nameField);

		Field dateField = new Field("date", "timestamp");
		metaData.addField(dateField);

		Field date_strField = new Field("date_str", "String");
		metaData.addField(date_strField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field leave_applyField = new Field("leave_apply", "String");
		leave_applyField.setDefaultValue("N");
		leave_applyField.setLength(1);
		metaData.addField(leave_applyField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(1024);
		metaData.addField(remarkField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("absent_detail");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseabsent_detail() {}

	public Baseabsent_detail(Baseabsent_detail obj) {
		this.id = obj.id;
		this.absent_parent_id = obj.absent_parent_id;
		this.school_id = obj.school_id;
		this.class_section_name = obj.class_section_name;
		this.date = obj.date;
		this.date_str = obj.date_str;
		this.student_id = obj.student_id;
		this.leave_apply = obj.leave_apply;
		this.remark = obj.remark;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(leave_apply == null)
			leave_apply = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(absent_parent_id != null)
			map.put("absent_parent_id", absent_parent_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(student_id != null)
			map.put("student_id", student_id);
		if(leave_apply != null)
			map.put("leave_apply", leave_apply);
		if(remark != null)
			map.put("remark", remark);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		if(add)
			setDefaultValues();

		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validateAbsent_parent_id(add))
			map.put("absent_parent_id", absent_parent_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(student_id != null)
			map.put("student_id", student_id);
		if(leave_apply != null)
			map.put("leave_apply", leave_apply);
		if(remark != null)
			map.put("remark", remark);
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
		absent_parent_id = (String) map.get("absent_parent_id");
		school_id = (String) map.get("school_id");
		class_section_name = (String) map.get("class_section_name");
		date = (Long) map.get("date");
		date_str = (String) map.get("date_str");
		student_id = (String) map.get("student_id");
		leave_apply = (String) map.get("leave_apply");
		remark = (String) map.get("remark");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object absent_parent_idObj = map.get("absent_parent_id");
		if(absent_parent_idObj != null)
			absent_parent_id = absent_parent_idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object class_section_nameObj = map.get("class_section_name");
		if(class_section_nameObj != null)
			class_section_name = class_section_nameObj.toString();

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = (Long) dateObj;

		Object date_strObj = map.get("date_str");
		if(date_strObj != null)
			date_str = date_strObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object leave_applyObj = map.get("leave_apply");
		if(leave_applyObj != null)
			leave_apply = leave_applyObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

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

	public String getAbsent_parent_id() {
		return absent_parent_id;
	}

	public String getAbsent_parent_idEx() {
		return absent_parent_id != null ? absent_parent_id : "";
	}

	public void setAbsent_parent_id(String absent_parent_id) {
		this.absent_parent_id = absent_parent_id;
	}

	public void unSetAbsent_parent_id() {
		this.absent_parent_id = null;
	}

	public boolean validateAbsent_parent_id(boolean add) throws ApplicationException {
		if(add && absent_parent_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[absent_parent_id]");
		return absent_parent_id != null;
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

	public String getClass_section_name() {
		return class_section_name;
	}

	public String getClass_section_nameEx() {
		return class_section_name != null ? class_section_name : "";
	}

	public void setClass_section_name(String class_section_name) {
		this.class_section_name = class_section_name;
	}

	public void unSetClass_section_name() {
		this.class_section_name = null;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}


	public String getDate_str() {
		return date_str;
	}

	public String getDate_strEx() {
		return date_str != null ? date_str : "";
	}

	public void setDate_str(String date_str) {
		this.date_str = date_str;
	}

	public void unSetDate_str() {
		this.date_str = null;
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

	public String getLeave_apply() {
		return leave_apply != null ? leave_apply : "N";
	}

	public void setLeave_apply(String leave_apply) {
		this.leave_apply = leave_apply;
	}

	public void unSetLeave_apply() {
		this.leave_apply = "N";
	}

	public String getRemark() {
		return remark;
	}

	public String getRemarkEx() {
		return remark != null ? remark : "";
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void unSetRemark() {
		this.remark = null;
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