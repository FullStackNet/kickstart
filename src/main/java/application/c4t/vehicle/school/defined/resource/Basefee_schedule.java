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
public abstract class Basefee_schedule extends BaseResource {
	private String id = null;
	private String parent_id = null;
	private String due_date_str = null;
	private Long due_date = null;
	private Double fees = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_PARENT_ID = "parent_id";
	public static String FIELD_DUE_DATE_STR = "due_date_str";
	public static String FIELD_DUE_DATE = "due_date";
	public static String FIELD_FEES = "fees";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("fee_schedule");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field parent_idField = new Field("parent_id", "String");
		parent_idField.setIndexed(true);
		parent_idField.setLength(128);
		metaData.addField(parent_idField);

		Field due_date_strField = new Field("due_date_str", "String");
		due_date_strField.setLength(32);
		metaData.addField(due_date_strField);

		Field due_dateField = new Field("due_date", "long");
		metaData.addField(due_dateField);

		Field feesField = new Field("fees", "double");
		metaData.addField(feesField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("fee_schedule");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basefee_schedule() {}

	public Basefee_schedule(Basefee_schedule obj) {
		this.id = obj.id;
		this.parent_id = obj.parent_id;
		this.due_date_str = obj.due_date_str;
		this.due_date = obj.due_date;
		this.fees = obj.fees;
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
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(due_date_str != null)
			map.put("due_date_str", due_date_str);
		if(due_date != null)
			map.put("due_date", due_date);
		if(fees != null)
			map.put("fees", fees);
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
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(due_date_str != null)
			map.put("due_date_str", due_date_str);
		if(due_date != null)
			map.put("due_date", due_date);
		if(fees != null)
			map.put("fees", fees);
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
		parent_id = (String) map.get("parent_id");
		due_date_str = (String) map.get("due_date_str");
		due_date = (Long) map.get("due_date");
		fees = (Double) map.get("fees");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object parent_idObj = map.get("parent_id");
		if(parent_idObj != null)
			parent_id = parent_idObj.toString();

		Object due_date_strObj = map.get("due_date_str");
		if(due_date_strObj != null)
			due_date_str = due_date_strObj.toString();

		Object due_dateObj = map.get("due_date");
		if(due_dateObj != null)
			due_date = new Long(due_dateObj.toString());

		Object feesObj = map.get("fees");
		if(feesObj != null)
			fees = new Double(feesObj.toString());

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

	public String getParent_id() {
		return parent_id;
	}

	public String getParent_idEx() {
		return parent_id != null ? parent_id : "";
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public void unSetParent_id() {
		this.parent_id = null;
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

	public Double getFees() {
		return fees;
	}

	public double getFeesEx() {
		return fees != null ? fees : 0;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public void unSetFees() {
		this.fees = null;
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