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
public abstract class Basemedical_record extends BaseResource {
	private String id = null;
	private String student_id = null;
	private String title = null;
	private String dr_name = null;
	private String expected_date_str = null;
	private Long expected_date = null;
	private String actual_date_str = null;
	private Long actual_date = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DR_NAME = "dr_name";
	public static String FIELD_EXPECTED_DATE_STR = "expected_date_str";
	public static String FIELD_EXPECTED_DATE = "expected_date";
	public static String FIELD_ACTUAL_DATE_STR = "actual_date_str";
	public static String FIELD_ACTUAL_DATE = "actual_date";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("medical_record");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setRequired(true);
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field titleField = new Field("title", "String");
		titleField.setLength(128);
		metaData.addField(titleField);

		Field dr_nameField = new Field("dr_name", "String");
		dr_nameField.setLength(128);
		metaData.addField(dr_nameField);

		Field expected_date_strField = new Field("expected_date_str", "String");
		expected_date_strField.setLength(32);
		metaData.addField(expected_date_strField);

		Field expected_dateField = new Field("expected_date", "long");
		metaData.addField(expected_dateField);

		Field actual_date_strField = new Field("actual_date_str", "String");
		actual_date_strField.setLength(32);
		metaData.addField(actual_date_strField);

		Field actual_dateField = new Field("actual_date", "long");
		metaData.addField(actual_dateField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("medical_record");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basemedical_record() {}

	public Basemedical_record(Basemedical_record obj) {
		this.id = obj.id;
		this.student_id = obj.student_id;
		this.title = obj.title;
		this.dr_name = obj.dr_name;
		this.expected_date_str = obj.expected_date_str;
		this.expected_date = obj.expected_date;
		this.actual_date_str = obj.actual_date_str;
		this.actual_date = obj.actual_date;
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
		if(title != null)
			map.put("title", title);
		if(dr_name != null)
			map.put("dr_name", dr_name);
		if(expected_date_str != null)
			map.put("expected_date_str", expected_date_str);
		if(expected_date != null)
			map.put("expected_date", expected_date);
		if(actual_date_str != null)
			map.put("actual_date_str", actual_date_str);
		if(actual_date != null)
			map.put("actual_date", actual_date);
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
		if(validateStudent_id(add))
			map.put("student_id", student_id);
		if(title != null)
			map.put("title", title);
		if(dr_name != null)
			map.put("dr_name", dr_name);
		if(expected_date_str != null)
			map.put("expected_date_str", expected_date_str);
		if(expected_date != null)
			map.put("expected_date", expected_date);
		if(actual_date_str != null)
			map.put("actual_date_str", actual_date_str);
		if(actual_date != null)
			map.put("actual_date", actual_date);
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
		title = (String) map.get("title");
		dr_name = (String) map.get("dr_name");
		expected_date_str = (String) map.get("expected_date_str");
		expected_date = (Long) map.get("expected_date");
		actual_date_str = (String) map.get("actual_date_str");
		actual_date = (Long) map.get("actual_date");
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

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object dr_nameObj = map.get("dr_name");
		if(dr_nameObj != null)
			dr_name = dr_nameObj.toString();

		Object expected_date_strObj = map.get("expected_date_str");
		if(expected_date_strObj != null)
			expected_date_str = expected_date_strObj.toString();

		Object expected_dateObj = map.get("expected_date");
		if(expected_dateObj != null)
			expected_date = new Long(expected_dateObj.toString());

		Object actual_date_strObj = map.get("actual_date_str");
		if(actual_date_strObj != null)
			actual_date_str = actual_date_strObj.toString();

		Object actual_dateObj = map.get("actual_date");
		if(actual_dateObj != null)
			actual_date = new Long(actual_dateObj.toString());

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

	public boolean validateStudent_id(boolean add) throws ApplicationException {
		if(add && student_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[student_id]");
		return student_id != null;
	}

	public String getTitle() {
		return title;
	}

	public String getTitleEx() {
		return title != null ? title : "";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void unSetTitle() {
		this.title = null;
	}

	public String getDr_name() {
		return dr_name;
	}

	public String getDr_nameEx() {
		return dr_name != null ? dr_name : "";
	}

	public void setDr_name(String dr_name) {
		this.dr_name = dr_name;
	}

	public void unSetDr_name() {
		this.dr_name = null;
	}

	public String getExpected_date_str() {
		return expected_date_str;
	}

	public String getExpected_date_strEx() {
		return expected_date_str != null ? expected_date_str : "";
	}

	public void setExpected_date_str(String expected_date_str) {
		this.expected_date_str = expected_date_str;
	}

	public void unSetExpected_date_str() {
		this.expected_date_str = null;
	}

	public Long getExpected_date() {
		return expected_date;
	}

	public long getExpected_dateEx() {
		return expected_date != null ? expected_date : 0L;
	}

	public void setExpected_date(long expected_date) {
		this.expected_date = expected_date;
	}

	public void setExpected_date(Long expected_date) {
		this.expected_date = expected_date;
	}

	public void unSetExpected_date() {
		this.expected_date = null;
	}

	public String getActual_date_str() {
		return actual_date_str;
	}

	public String getActual_date_strEx() {
		return actual_date_str != null ? actual_date_str : "";
	}

	public void setActual_date_str(String actual_date_str) {
		this.actual_date_str = actual_date_str;
	}

	public void unSetActual_date_str() {
		this.actual_date_str = null;
	}

	public Long getActual_date() {
		return actual_date;
	}

	public long getActual_dateEx() {
		return actual_date != null ? actual_date : 0L;
	}

	public void setActual_date(long actual_date) {
		this.actual_date = actual_date;
	}

	public void setActual_date(Long actual_date) {
		this.actual_date = actual_date;
	}

	public void unSetActual_date() {
		this.actual_date = null;
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