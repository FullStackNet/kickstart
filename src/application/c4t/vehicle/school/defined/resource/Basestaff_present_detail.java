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
public abstract class Basestaff_present_detail extends BaseResource {
	private String id = null;
	private String present_parent_id = null;
	private String school_id = null;
	private String present_type = null;
	private String sub_present_type = null;
	private String present_record_type = null;
	private Long date = null;
	private String date_str = null;
	private String staff_id = null;
	private Long creation_time = null;
	private Long entry_time = null;
	private String remark = null;
	private Long late_comingInMin = null;
	private Long workingInMin = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_PRESENT_PARENT_ID = "present_parent_id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_PRESENT_TYPE = "present_type";
	public static String FIELD_SUB_PRESENT_TYPE = "sub_present_type";
	public static String FIELD_PRESENT_RECORD_TYPE = "present_record_type";
	public static String FIELD_DATE = "date";
	public static String FIELD_DATE_STR = "date_str";
	public static String FIELD_STAFF_ID = "staff_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_ENTRY_TIME = "entry_time";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_LATE_COMINGINMIN = "late_comingInMin";
	public static String FIELD_WORKINGINMIN = "workingInMin";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("staff_present_detail");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field present_parent_idField = new Field("present_parent_id", "String");
		present_parent_idField.setIndexed(true);
		present_parent_idField.setRequired(true);
		present_parent_idField.setLength(128);
		metaData.addField(present_parent_idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field present_typeField = new Field("present_type", "String");
		present_typeField.setLength(128);
		metaData.addField(present_typeField);

		Field sub_present_typeField = new Field("sub_present_type", "String");
		sub_present_typeField.setLength(128);
		metaData.addField(sub_present_typeField);

		Field present_record_typeField = new Field("present_record_type", "String");
		present_record_typeField.setLength(128);
		metaData.addField(present_record_typeField);

		Field dateField = new Field("date", "timestamp");
		metaData.addField(dateField);

		Field date_strField = new Field("date_str", "String");
		metaData.addField(date_strField);

		Field staff_idField = new Field("staff_id", "String");
		staff_idField.setLength(128);
		metaData.addField(staff_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field entry_timeField = new Field("entry_time", "timestamp");
		metaData.addField(entry_timeField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(1024);
		metaData.addField(remarkField);

		Field late_comingInMinField = new Field("late_comingInMin", "long");
		metaData.addField(late_comingInMinField);

		Field workingInMinField = new Field("workingInMin", "long");
		metaData.addField(workingInMinField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("staff_present_detail");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basestaff_present_detail() {}

	public Basestaff_present_detail(Basestaff_present_detail obj) {
		this.id = obj.id;
		this.present_parent_id = obj.present_parent_id;
		this.school_id = obj.school_id;
		this.present_type = obj.present_type;
		this.sub_present_type = obj.sub_present_type;
		this.present_record_type = obj.present_record_type;
		this.date = obj.date;
		this.date_str = obj.date_str;
		this.staff_id = obj.staff_id;
		this.creation_time = obj.creation_time;
		this.entry_time = obj.entry_time;
		this.remark = obj.remark;
		this.late_comingInMin = obj.late_comingInMin;
		this.workingInMin = obj.workingInMin;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(present_parent_id != null)
			map.put("present_parent_id", present_parent_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(present_type != null)
			map.put("present_type", present_type);
		if(sub_present_type != null)
			map.put("sub_present_type", sub_present_type);
		if(present_record_type != null)
			map.put("present_record_type", present_record_type);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(staff_id != null)
			map.put("staff_id", staff_id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(entry_time != null)
			map.put("entry_time", entry_time);
		if(remark != null)
			map.put("remark", remark);
		if(late_comingInMin != null)
			map.put("late_comingInMin", late_comingInMin);
		if(workingInMin != null)
			map.put("workingInMin", workingInMin);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validatePresent_parent_id(add))
			map.put("present_parent_id", present_parent_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(present_type != null)
			map.put("present_type", present_type);
		if(sub_present_type != null)
			map.put("sub_present_type", sub_present_type);
		if(present_record_type != null)
			map.put("present_record_type", present_record_type);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(staff_id != null)
			map.put("staff_id", staff_id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(entry_time != null)
			map.put("entry_time", entry_time);
		if(remark != null)
			map.put("remark", remark);
		if(late_comingInMin != null)
			map.put("late_comingInMin", late_comingInMin);
		if(workingInMin != null)
			map.put("workingInMin", workingInMin);
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
		present_parent_id = (String) map.get("present_parent_id");
		school_id = (String) map.get("school_id");
		present_type = (String) map.get("present_type");
		sub_present_type = (String) map.get("sub_present_type");
		present_record_type = (String) map.get("present_record_type");
		date = (Long) map.get("date");
		date_str = (String) map.get("date_str");
		staff_id = (String) map.get("staff_id");
		creation_time = (Long) map.get("creation_time");
		entry_time = (Long) map.get("entry_time");
		remark = (String) map.get("remark");
		late_comingInMin = (Long) map.get("late_comingInMin");
		workingInMin = (Long) map.get("workingInMin");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object present_parent_idObj = map.get("present_parent_id");
		if(present_parent_idObj != null)
			present_parent_id = present_parent_idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object present_typeObj = map.get("present_type");
		if(present_typeObj != null)
			present_type = present_typeObj.toString();

		Object sub_present_typeObj = map.get("sub_present_type");
		if(sub_present_typeObj != null)
			sub_present_type = sub_present_typeObj.toString();

		Object present_record_typeObj = map.get("present_record_type");
		if(present_record_typeObj != null)
			present_record_type = present_record_typeObj.toString();

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = (Long) dateObj;

		Object date_strObj = map.get("date_str");
		if(date_strObj != null)
			date_str = date_strObj.toString();

		Object staff_idObj = map.get("staff_id");
		if(staff_idObj != null)
			staff_id = staff_idObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object entry_timeObj = map.get("entry_time");
		if(entry_timeObj != null)
			entry_time = (Long) entry_timeObj;

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

		Object late_comingInMinObj = map.get("late_comingInMin");
		if(late_comingInMinObj != null)
			late_comingInMin = new Long(late_comingInMinObj.toString());

		Object workingInMinObj = map.get("workingInMin");
		if(workingInMinObj != null)
			workingInMin = new Long(workingInMinObj.toString());

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

	public String getPresent_parent_id() {
		return present_parent_id;
	}

	public String getPresent_parent_idEx() {
		return present_parent_id != null ? present_parent_id : "";
	}

	public void setPresent_parent_id(String present_parent_id) {
		this.present_parent_id = present_parent_id;
	}

	public void unSetPresent_parent_id() {
		this.present_parent_id = null;
	}

	public boolean validatePresent_parent_id(boolean add) throws ApplicationException {
		if(add && present_parent_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[present_parent_id]");
		return present_parent_id != null;
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

	public String getPresent_type() {
		return present_type;
	}

	public String getPresent_typeEx() {
		return present_type != null ? present_type : "";
	}

	public void setPresent_type(String present_type) {
		this.present_type = present_type;
	}

	public void unSetPresent_type() {
		this.present_type = null;
	}

	public String getSub_present_type() {
		return sub_present_type;
	}

	public String getSub_present_typeEx() {
		return sub_present_type != null ? sub_present_type : "";
	}

	public void setSub_present_type(String sub_present_type) {
		this.sub_present_type = sub_present_type;
	}

	public void unSetSub_present_type() {
		this.sub_present_type = null;
	}

	public String getPresent_record_type() {
		return present_record_type;
	}

	public String getPresent_record_typeEx() {
		return present_record_type != null ? present_record_type : "";
	}

	public void setPresent_record_type(String present_record_type) {
		this.present_record_type = present_record_type;
	}

	public void unSetPresent_record_type() {
		this.present_record_type = null;
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

	public String getStaff_id() {
		return staff_id;
	}

	public String getStaff_idEx() {
		return staff_id != null ? staff_id : "";
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public void unSetStaff_id() {
		this.staff_id = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Long getEntry_time() {
		return entry_time;
	}

	public void setEntry_time(Long entry_time) {
		this.entry_time = entry_time;
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

	public Long getLate_comingInMin() {
		return late_comingInMin;
	}

	public long getLate_comingInMinEx() {
		return late_comingInMin != null ? late_comingInMin : 0L;
	}

	public void setLate_comingInMin(long late_comingInMin) {
		this.late_comingInMin = late_comingInMin;
	}

	public void setLate_comingInMin(Long late_comingInMin) {
		this.late_comingInMin = late_comingInMin;
	}

	public void unSetLate_comingInMin() {
		this.late_comingInMin = null;
	}

	public Long getWorkingInMin() {
		return workingInMin;
	}

	public long getWorkingInMinEx() {
		return workingInMin != null ? workingInMin : 0L;
	}

	public void setWorkingInMin(long workingInMin) {
		this.workingInMin = workingInMin;
	}

	public void setWorkingInMin(Long workingInMin) {
		this.workingInMin = workingInMin;
	}

	public void unSetWorkingInMin() {
		this.workingInMin = null;
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