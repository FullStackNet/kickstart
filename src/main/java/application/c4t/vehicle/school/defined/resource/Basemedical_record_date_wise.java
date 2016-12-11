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
public abstract class Basemedical_record_date_wise extends BaseResource {
	private String id = null;
	private String student_id = null;
	private String date_str = null;
	private Long date = null;
	private Double weight = null;
	private Double height = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_DATE_STR = "date_str";
	public static String FIELD_DATE = "date";
	public static String FIELD_WEIGHT = "weight";
	public static String FIELD_HEIGHT = "height";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("medical_record_date_wise");

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

		Field date_strField = new Field("date_str", "String");
		date_strField.setLength(32);
		metaData.addField(date_strField);

		Field dateField = new Field("date", "long");
		metaData.addField(dateField);

		Field weightField = new Field("weight", "double");
		metaData.addField(weightField);

		Field heightField = new Field("height", "double");
		metaData.addField(heightField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("medical_record_date_wise");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basemedical_record_date_wise() {}

	public Basemedical_record_date_wise(Basemedical_record_date_wise obj) {
		this.id = obj.id;
		this.student_id = obj.student_id;
		this.date_str = obj.date_str;
		this.date = obj.date;
		this.weight = obj.weight;
		this.height = obj.height;
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
		if(date_str != null)
			map.put("date_str", date_str);
		if(date != null)
			map.put("date", date);
		if(weight != null)
			map.put("weight", weight);
		if(height != null)
			map.put("height", height);
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
		if(date_str != null)
			map.put("date_str", date_str);
		if(date != null)
			map.put("date", date);
		if(weight != null)
			map.put("weight", weight);
		if(height != null)
			map.put("height", height);
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
		date_str = (String) map.get("date_str");
		date = (Long) map.get("date");
		weight = (Double) map.get("weight");
		height = (Double) map.get("height");
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

		Object date_strObj = map.get("date_str");
		if(date_strObj != null)
			date_str = date_strObj.toString();

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = new Long(dateObj.toString());

		Object weightObj = map.get("weight");
		if(weightObj != null)
			weight = new Double(weightObj.toString());

		Object heightObj = map.get("height");
		if(heightObj != null)
			height = new Double(heightObj.toString());

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

	public Long getDate() {
		return date;
	}

	public long getDateEx() {
		return date != null ? date : 0L;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public void unSetDate() {
		this.date = null;
	}

	public Double getWeight() {
		return weight;
	}

	public double getWeightEx() {
		return weight != null ? weight : 0;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void unSetWeight() {
		this.weight = null;
	}

	public Double getHeight() {
		return height;
	}

	public double getHeightEx() {
		return height != null ? height : 0;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public void unSetHeight() {
		this.height = null;
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