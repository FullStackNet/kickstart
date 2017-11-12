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
public abstract class Baseappliance_plan extends BaseResource {
	private String id = null;
	private String appliance_id = null;
	private String appliance_name = null;
	private String appliance_serialno = null;
	private String plan_id = null;
	private String plan_name = null;
	private Long start_time = null;
	private Long end_time = null;
	private String current_plan = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_APPLIANCE_NAME = "appliance_name";
	public static String FIELD_APPLIANCE_SERIALNO = "appliance_serialno";
	public static String FIELD_PLAN_ID = "plan_id";
	public static String FIELD_PLAN_NAME = "plan_name";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_END_TIME = "end_time";
	public static String FIELD_CURRENT_PLAN = "current_plan";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_plan");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setLength(128);
		metaData.addField(idField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setRequired(true);
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field appliance_nameField = new Field("appliance_name", "String");
		appliance_nameField.setRequired(true);
		appliance_nameField.setLength(128);
		metaData.addField(appliance_nameField);

		Field appliance_serialnoField = new Field("appliance_serialno", "String");
		appliance_serialnoField.setRequired(true);
		appliance_serialnoField.setLength(128);
		metaData.addField(appliance_serialnoField);

		Field plan_idField = new Field("plan_id", "String");
		plan_idField.setLength(128);
		metaData.addField(plan_idField);

		Field plan_nameField = new Field("plan_name", "String");
		plan_nameField.setLength(128);
		metaData.addField(plan_nameField);

		Field start_timeField = new Field("start_time", "timestamp");
		start_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(start_timeField);

		Field end_timeField = new Field("end_time", "timestamp");
		end_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(end_timeField);

		Field current_planField = new Field("current_plan", "String");
		current_planField.setLength(1);
		metaData.addField(current_planField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		creation_timeField.setRequired(true);
		creation_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance_plan");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseappliance_plan() {}

	public Baseappliance_plan(Baseappliance_plan obj) {
		this.id = obj.id;
		this.appliance_id = obj.appliance_id;
		this.appliance_name = obj.appliance_name;
		this.appliance_serialno = obj.appliance_serialno;
		this.plan_id = obj.plan_id;
		this.plan_name = obj.plan_name;
		this.start_time = obj.start_time;
		this.end_time = obj.end_time;
		this.current_plan = obj.current_plan;
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
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(appliance_name != null)
			map.put("appliance_name", appliance_name);
		if(appliance_serialno != null)
			map.put("appliance_serialno", appliance_serialno);
		if(plan_id != null)
			map.put("plan_id", plan_id);
		if(plan_name != null)
			map.put("plan_name", plan_name);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(current_plan != null)
			map.put("current_plan", current_plan);
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
		if(id != null)
			map.put("id", id);
		if(validateAppliance_id(add))
			map.put("appliance_id", appliance_id);
		if(validateAppliance_name(add))
			map.put("appliance_name", appliance_name);
		if(validateAppliance_serialno(add))
			map.put("appliance_serialno", appliance_serialno);
		if(plan_id != null)
			map.put("plan_id", plan_id);
		if(plan_name != null)
			map.put("plan_name", plan_name);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(current_plan != null)
			map.put("current_plan", current_plan);
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
		appliance_id = (String) map.get("appliance_id");
		appliance_name = (String) map.get("appliance_name");
		appliance_serialno = (String) map.get("appliance_serialno");
		plan_id = (String) map.get("plan_id");
		plan_name = (String) map.get("plan_name");
		start_time = (Long) map.get("start_time");
		end_time = (Long) map.get("end_time");
		current_plan = (String) map.get("current_plan");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object appliance_nameObj = map.get("appliance_name");
		if(appliance_nameObj != null)
			appliance_name = appliance_nameObj.toString();

		Object appliance_serialnoObj = map.get("appliance_serialno");
		if(appliance_serialnoObj != null)
			appliance_serialno = appliance_serialnoObj.toString();

		Object plan_idObj = map.get("plan_id");
		if(plan_idObj != null)
			plan_id = plan_idObj.toString();

		Object plan_nameObj = map.get("plan_name");
		if(plan_nameObj != null)
			plan_name = plan_nameObj.toString();

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = new Long(start_timeObj.toString());

		Object end_timeObj = map.get("end_time");
		if(end_timeObj != null)
			end_time = new Long(end_timeObj.toString());

		Object current_planObj = map.get("current_plan");
		if(current_planObj != null)
			current_plan = current_planObj.toString();

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

	public String getAppliance_id() {
		return appliance_id;
	}

	public String getAppliance_idEx() {
		return appliance_id != null ? appliance_id : "";
	}

	public void setAppliance_id(String appliance_id) {
		this.appliance_id = appliance_id;
	}

	public void unSetAppliance_id() {
		this.appliance_id = null;
	}

	public boolean validateAppliance_id(boolean add) throws ApplicationException {
		if(add && appliance_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[appliance_id]");
		return appliance_id != null;
	}

	public String getAppliance_name() {
		return appliance_name;
	}

	public String getAppliance_nameEx() {
		return appliance_name != null ? appliance_name : "";
	}

	public void setAppliance_name(String appliance_name) {
		this.appliance_name = appliance_name;
	}

	public void unSetAppliance_name() {
		this.appliance_name = null;
	}

	public boolean validateAppliance_name(boolean add) throws ApplicationException {
		if(add && appliance_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[appliance_name]");
		return appliance_name != null;
	}

	public String getAppliance_serialno() {
		return appliance_serialno;
	}

	public String getAppliance_serialnoEx() {
		return appliance_serialno != null ? appliance_serialno : "";
	}

	public void setAppliance_serialno(String appliance_serialno) {
		this.appliance_serialno = appliance_serialno;
	}

	public void unSetAppliance_serialno() {
		this.appliance_serialno = null;
	}

	public boolean validateAppliance_serialno(boolean add) throws ApplicationException {
		if(add && appliance_serialno == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[appliance_serialno]");
		return appliance_serialno != null;
	}

	public String getPlan_id() {
		return plan_id;
	}

	public String getPlan_idEx() {
		return plan_id != null ? plan_id : "";
	}

	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}

	public void unSetPlan_id() {
		this.plan_id = null;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public String getPlan_nameEx() {
		return plan_name != null ? plan_name : "";
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public void unSetPlan_name() {
		this.plan_name = null;
	}

	public Long getStart_time() {
		return start_time;
	}

	public void setStart_time(Long start_time) {
		this.start_time = start_time;
	}


	public Long getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Long end_time) {
		this.end_time = end_time;
	}


	public String getCurrent_plan() {
		return current_plan;
	}

	public String getCurrent_planEx() {
		return current_plan != null ? current_plan : "";
	}

	public void setCurrent_plan(String current_plan) {
		this.current_plan = current_plan;
	}

	public void unSetCurrent_plan() {
		this.current_plan = null;
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