/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

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
public abstract class Baseactivity extends BaseResource {
	private String id = null;
	private String profile_id = null;
	private String activity_type = null;
	private Long creation_time = null;
	private String status = null;
	private String data = null;
	private String reference_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_PROFILE_ID = "profile_id";
	public static String FIELD_ACTIVITY_TYPE = "activity_type";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_STATUS = "status";
	public static String FIELD_DATA = "data";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("activity");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field profile_idField = new Field("profile_id", "String");
		profile_idField.setLength(128);
		metaData.addField(profile_idField);

		Field activity_typeField = new Field("activity_type", "String");
		activity_typeField.setLength(128);
		metaData.addField(activity_typeField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		creation_timeField.setRequired(true);
		creation_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(creation_timeField);

		Field statusField = new Field("status", "String");
		statusField.setDefaultValue("N");
		statusField.setLength(1);
		metaData.addField(statusField);

		Field dataField = new Field("data", "String");
		dataField.setLength(512);
		metaData.addField(dataField);

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(128);
		metaData.addField(reference_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("activity");

		metaData.setCluster("DB_LOG");
	}

	public Baseactivity() {}

	public Baseactivity(Baseactivity obj) {
		this.id = obj.id;
		this.profile_id = obj.profile_id;
		this.activity_type = obj.activity_type;
		this.creation_time = obj.creation_time;
		this.status = obj.status;
		this.data = obj.data;
		this.reference_id = obj.reference_id;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(status == null)
			status = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(profile_id != null)
			map.put("profile_id", profile_id);
		if(activity_type != null)
			map.put("activity_type", activity_type);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(status != null)
			map.put("status", status);
		if(data != null)
			map.put("data", data);
		if(reference_id != null)
			map.put("reference_id", reference_id);
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
		if(profile_id != null)
			map.put("profile_id", profile_id);
		if(activity_type != null)
			map.put("activity_type", activity_type);
		if(validateCreation_time(add))
			map.put("creation_time", creation_time);
		if(status != null)
			map.put("status", status);
		if(data != null)
			map.put("data", data);
		if(reference_id != null)
			map.put("reference_id", reference_id);
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
		profile_id = (String) map.get("profile_id");
		activity_type = (String) map.get("activity_type");
		creation_time = (Long) map.get("creation_time");
		status = (String) map.get("status");
		data = (String) map.get("data");
		reference_id = (String) map.get("reference_id");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object profile_idObj = map.get("profile_id");
		if(profile_idObj != null)
			profile_id = profile_idObj.toString();

		Object activity_typeObj = map.get("activity_type");
		if(activity_typeObj != null)
			activity_type = activity_typeObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

		Object dataObj = map.get("data");
		if(dataObj != null)
			data = dataObj.toString();

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

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

	public String getProfile_id() {
		return profile_id;
	}

	public String getProfile_idEx() {
		return profile_id != null ? profile_id : "";
	}

	public void setProfile_id(String profile_id) {
		this.profile_id = profile_id;
	}

	public void unSetProfile_id() {
		this.profile_id = null;
	}

	public String getActivity_type() {
		return activity_type;
	}

	public String getActivity_typeEx() {
		return activity_type != null ? activity_type : "";
	}

	public void setActivity_type(String activity_type) {
		this.activity_type = activity_type;
	}

	public void unSetActivity_type() {
		this.activity_type = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public boolean validateCreation_time(boolean add) throws ApplicationException {
		if(add && creation_time == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[creation_time]");
		return creation_time != null;
	}

	public String getStatus() {
		return status != null ? status : "N";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = "N";
	}

	public String getData() {
		return data;
	}

	public String getDataEx() {
		return data != null ? data : "";
	}

	public void setData(String data) {
		this.data = data;
	}

	public void unSetData() {
		this.data = null;
	}

	public String getReference_id() {
		return reference_id;
	}

	public String getReference_idEx() {
		return reference_id != null ? reference_id : "";
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public void unSetReference_id() {
		this.reference_id = null;
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