/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseappliance_policy_detail extends BaseResource {
	private String id = null;
	private String name = null;
	private String policy_id = null;
	private String policy_name = null;
	private String threshold_profile_id = null;
	private String threshold_profile_name = null;
	private String duration_type = null;
	private String season = null;
	private String day_type = null;
	private String time_type = null;
	private String from_time = null;
	private String to_time = null;
	private String customer_id = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_POLICY_ID = "policy_id";
	public static String FIELD_POLICY_NAME = "policy_name";
	public static String FIELD_THRESHOLD_PROFILE_ID = "threshold_profile_id";
	public static String FIELD_THRESHOLD_PROFILE_NAME = "threshold_profile_name";
	public static String FIELD_DURATION_TYPE = "duration_type";
	public static String FIELD_SEASON = "season";
	public static String FIELD_DAY_TYPE = "day_type";
	public static String FIELD_TIME_TYPE = "time_type";
	public static String FIELD_FROM_TIME = "from_time";
	public static String FIELD_TO_TIME = "to_time";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_policy_detail");

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

		Field policy_idField = new Field("policy_id", "String");
		policy_idField.setLength(128);
		metaData.addField(policy_idField);

		Field policy_nameField = new Field("policy_name", "String");
		policy_nameField.setLength(128);
		metaData.addField(policy_nameField);

		Field threshold_profile_idField = new Field("threshold_profile_id", "String");
		threshold_profile_idField.setLength(128);
		metaData.addField(threshold_profile_idField);

		Field threshold_profile_nameField = new Field("threshold_profile_name", "String");
		threshold_profile_nameField.setLength(128);
		metaData.addField(threshold_profile_nameField);

		Field duration_typeField = new Field("duration_type", "String");
		duration_typeField.setLength(128);
		metaData.addField(duration_typeField);

		Field seasonField = new Field("season", "String");
		seasonField.setLength(128);
		metaData.addField(seasonField);

		Field day_typeField = new Field("day_type", "String");
		day_typeField.setLength(128);
		metaData.addField(day_typeField);

		Field time_typeField = new Field("time_type", "String");
		time_typeField.setLength(128);
		metaData.addField(time_typeField);

		Field from_timeField = new Field("from_time", "String");
		from_timeField.setLength(128);
		metaData.addField(from_timeField);

		Field to_timeField = new Field("to_time", "String");
		to_timeField.setLength(128);
		metaData.addField(to_timeField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		creation_timeField.setRequired(true);
		creation_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance_policy_detail");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseappliance_policy_detail() {}

	public Baseappliance_policy_detail(Baseappliance_policy_detail obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.policy_id = obj.policy_id;
		this.policy_name = obj.policy_name;
		this.threshold_profile_id = obj.threshold_profile_id;
		this.threshold_profile_name = obj.threshold_profile_name;
		this.duration_type = obj.duration_type;
		this.season = obj.season;
		this.day_type = obj.day_type;
		this.time_type = obj.time_type;
		this.from_time = obj.from_time;
		this.to_time = obj.to_time;
		this.customer_id = obj.customer_id;
		this.creation_time = obj.creation_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(policy_id != null)
			map.put("policy_id", policy_id);
		if(policy_name != null)
			map.put("policy_name", policy_name);
		if(threshold_profile_id != null)
			map.put("threshold_profile_id", threshold_profile_id);
		if(threshold_profile_name != null)
			map.put("threshold_profile_name", threshold_profile_name);
		if(duration_type != null)
			map.put("duration_type", duration_type);
		if(season != null)
			map.put("season", season);
		if(day_type != null)
			map.put("day_type", day_type);
		if(time_type != null)
			map.put("time_type", time_type);
		if(from_time != null)
			map.put("from_time", from_time);
		if(to_time != null)
			map.put("to_time", to_time);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
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
		if(name != null)
			map.put("name", name);
		if(policy_id != null)
			map.put("policy_id", policy_id);
		if(policy_name != null)
			map.put("policy_name", policy_name);
		if(threshold_profile_id != null)
			map.put("threshold_profile_id", threshold_profile_id);
		if(threshold_profile_name != null)
			map.put("threshold_profile_name", threshold_profile_name);
		if(duration_type != null)
			map.put("duration_type", duration_type);
		if(season != null)
			map.put("season", season);
		if(day_type != null)
			map.put("day_type", day_type);
		if(time_type != null)
			map.put("time_type", time_type);
		if(from_time != null)
			map.put("from_time", from_time);
		if(to_time != null)
			map.put("to_time", to_time);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(validateCreation_time(add))
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
		policy_id = (String) map.get("policy_id");
		policy_name = (String) map.get("policy_name");
		threshold_profile_id = (String) map.get("threshold_profile_id");
		threshold_profile_name = (String) map.get("threshold_profile_name");
		duration_type = (String) map.get("duration_type");
		season = (String) map.get("season");
		day_type = (String) map.get("day_type");
		time_type = (String) map.get("time_type");
		from_time = (String) map.get("from_time");
		to_time = (String) map.get("to_time");
		customer_id = (String) map.get("customer_id");
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

		Object policy_idObj = map.get("policy_id");
		if(policy_idObj != null)
			policy_id = policy_idObj.toString();

		Object policy_nameObj = map.get("policy_name");
		if(policy_nameObj != null)
			policy_name = policy_nameObj.toString();

		Object threshold_profile_idObj = map.get("threshold_profile_id");
		if(threshold_profile_idObj != null)
			threshold_profile_id = threshold_profile_idObj.toString();

		Object threshold_profile_nameObj = map.get("threshold_profile_name");
		if(threshold_profile_nameObj != null)
			threshold_profile_name = threshold_profile_nameObj.toString();

		Object duration_typeObj = map.get("duration_type");
		if(duration_typeObj != null)
			duration_type = duration_typeObj.toString();

		Object seasonObj = map.get("season");
		if(seasonObj != null)
			season = seasonObj.toString();

		Object day_typeObj = map.get("day_type");
		if(day_typeObj != null)
			day_type = day_typeObj.toString();

		Object time_typeObj = map.get("time_type");
		if(time_typeObj != null)
			time_type = time_typeObj.toString();

		Object from_timeObj = map.get("from_time");
		if(from_timeObj != null)
			from_time = from_timeObj.toString();

		Object to_timeObj = map.get("to_time");
		if(to_timeObj != null)
			to_time = to_timeObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

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

	public String getPolicy_id() {
		return policy_id;
	}

	public String getPolicy_idEx() {
		return policy_id != null ? policy_id : "";
	}

	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}

	public void unSetPolicy_id() {
		this.policy_id = null;
	}

	public String getPolicy_name() {
		return policy_name;
	}

	public String getPolicy_nameEx() {
		return policy_name != null ? policy_name : "";
	}

	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}

	public void unSetPolicy_name() {
		this.policy_name = null;
	}

	public String getThreshold_profile_id() {
		return threshold_profile_id;
	}

	public String getThreshold_profile_idEx() {
		return threshold_profile_id != null ? threshold_profile_id : "";
	}

	public void setThreshold_profile_id(String threshold_profile_id) {
		this.threshold_profile_id = threshold_profile_id;
	}

	public void unSetThreshold_profile_id() {
		this.threshold_profile_id = null;
	}

	public String getThreshold_profile_name() {
		return threshold_profile_name;
	}

	public String getThreshold_profile_nameEx() {
		return threshold_profile_name != null ? threshold_profile_name : "";
	}

	public void setThreshold_profile_name(String threshold_profile_name) {
		this.threshold_profile_name = threshold_profile_name;
	}

	public void unSetThreshold_profile_name() {
		this.threshold_profile_name = null;
	}

	public String getDuration_type() {
		return duration_type;
	}

	public String getDuration_typeEx() {
		return duration_type != null ? duration_type : "";
	}

	public void setDuration_type(String duration_type) {
		this.duration_type = duration_type;
	}

	public void unSetDuration_type() {
		this.duration_type = null;
	}

	public String getSeason() {
		return season;
	}

	public String getSeasonEx() {
		return season != null ? season : "";
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public void unSetSeason() {
		this.season = null;
	}

	public String getDay_type() {
		return day_type;
	}

	public String getDay_typeEx() {
		return day_type != null ? day_type : "";
	}

	public void setDay_type(String day_type) {
		this.day_type = day_type;
	}

	public void unSetDay_type() {
		this.day_type = null;
	}

	public String getTime_type() {
		return time_type;
	}

	public String getTime_typeEx() {
		return time_type != null ? time_type : "";
	}

	public void setTime_type(String time_type) {
		this.time_type = time_type;
	}

	public void unSetTime_type() {
		this.time_type = null;
	}

	public String getFrom_time() {
		return from_time;
	}

	public String getFrom_timeEx() {
		return from_time != null ? from_time : "";
	}

	public void setFrom_time(String from_time) {
		this.from_time = from_time;
	}

	public void unSetFrom_time() {
		this.from_time = null;
	}

	public String getTo_time() {
		return to_time;
	}

	public String getTo_timeEx() {
		return to_time != null ? to_time : "";
	}

	public void setTo_time(String to_time) {
		this.to_time = to_time;
	}

	public void unSetTo_time() {
		this.to_time = null;
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
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}