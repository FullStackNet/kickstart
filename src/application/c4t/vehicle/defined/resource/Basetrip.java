/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basetrip extends BaseResource {
	private String id = null;
	private String appliance_id = null;
	private String route_id = null;
	private String school_id = null;
	private String scheduled_start_time = null;
	private String scheduled_reached_time = null;
	private String start_time = null;
	private String reached_time = null;
	private String driver_id = null;
	private String helper_id = null;
	private String alternate_helper_id = null;
	private Long delayed = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_ROUTE_ID = "route_id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_SCHEDULED_START_TIME = "scheduled_start_time";
	public static String FIELD_SCHEDULED_REACHED_TIME = "scheduled_reached_time";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_REACHED_TIME = "reached_time";
	public static String FIELD_DRIVER_ID = "driver_id";
	public static String FIELD_HELPER_ID = "helper_id";
	public static String FIELD_ALTERNATE_HELPER_ID = "alternate_helper_id";
	public static String FIELD_DELAYED = "delayed";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("trip");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field route_idField = new Field("route_id", "String");
		route_idField.setLength(128);
		metaData.addField(route_idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field scheduled_start_timeField = new Field("scheduled_start_time", "String");
		metaData.addField(scheduled_start_timeField);

		Field scheduled_reached_timeField = new Field("scheduled_reached_time", "String");
		metaData.addField(scheduled_reached_timeField);

		Field start_timeField = new Field("start_time", "String");
		metaData.addField(start_timeField);

		Field reached_timeField = new Field("reached_time", "String");
		metaData.addField(reached_timeField);

		Field driver_idField = new Field("driver_id", "String");
		driver_idField.setLength(128);
		metaData.addField(driver_idField);

		Field helper_idField = new Field("helper_id", "String");
		helper_idField.setLength(128);
		metaData.addField(helper_idField);

		Field alternate_helper_idField = new Field("alternate_helper_id", "String");
		alternate_helper_idField.setLength(128);
		metaData.addField(alternate_helper_idField);

		Field delayedField = new Field("delayed", "long");
		metaData.addField(delayedField);


		metaData.setTableName("trip");

		metaData.setCluster("DB_LOG");
	}

	public Basetrip() {}

	public Basetrip(Basetrip obj) {
		this.id = obj.id;
		this.appliance_id = obj.appliance_id;
		this.route_id = obj.route_id;
		this.school_id = obj.school_id;
		this.scheduled_start_time = obj.scheduled_start_time;
		this.scheduled_reached_time = obj.scheduled_reached_time;
		this.start_time = obj.start_time;
		this.reached_time = obj.reached_time;
		this.driver_id = obj.driver_id;
		this.helper_id = obj.helper_id;
		this.alternate_helper_id = obj.alternate_helper_id;
		this.delayed = obj.delayed;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(route_id != null)
			map.put("route_id", route_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(scheduled_start_time != null)
			map.put("scheduled_start_time", scheduled_start_time);
		if(scheduled_reached_time != null)
			map.put("scheduled_reached_time", scheduled_reached_time);
		if(start_time != null)
			map.put("start_time", start_time);
		if(reached_time != null)
			map.put("reached_time", reached_time);
		if(driver_id != null)
			map.put("driver_id", driver_id);
		if(helper_id != null)
			map.put("helper_id", helper_id);
		if(alternate_helper_id != null)
			map.put("alternate_helper_id", alternate_helper_id);
		if(delayed != null)
			map.put("delayed", delayed);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(route_id != null)
			map.put("route_id", route_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(scheduled_start_time != null)
			map.put("scheduled_start_time", scheduled_start_time);
		if(scheduled_reached_time != null)
			map.put("scheduled_reached_time", scheduled_reached_time);
		if(start_time != null)
			map.put("start_time", start_time);
		if(reached_time != null)
			map.put("reached_time", reached_time);
		if(driver_id != null)
			map.put("driver_id", driver_id);
		if(helper_id != null)
			map.put("helper_id", helper_id);
		if(alternate_helper_id != null)
			map.put("alternate_helper_id", alternate_helper_id);
		if(delayed != null)
			map.put("delayed", delayed);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		appliance_id = (String) map.get("appliance_id");
		route_id = (String) map.get("route_id");
		school_id = (String) map.get("school_id");
		scheduled_start_time = (String) map.get("scheduled_start_time");
		scheduled_reached_time = (String) map.get("scheduled_reached_time");
		start_time = (String) map.get("start_time");
		reached_time = (String) map.get("reached_time");
		driver_id = (String) map.get("driver_id");
		helper_id = (String) map.get("helper_id");
		alternate_helper_id = (String) map.get("alternate_helper_id");
		delayed = (Long) map.get("delayed");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object route_idObj = map.get("route_id");
		if(route_idObj != null)
			route_id = route_idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object scheduled_start_timeObj = map.get("scheduled_start_time");
		if(scheduled_start_timeObj != null)
			scheduled_start_time = scheduled_start_timeObj.toString();

		Object scheduled_reached_timeObj = map.get("scheduled_reached_time");
		if(scheduled_reached_timeObj != null)
			scheduled_reached_time = scheduled_reached_timeObj.toString();

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = start_timeObj.toString();

		Object reached_timeObj = map.get("reached_time");
		if(reached_timeObj != null)
			reached_time = reached_timeObj.toString();

		Object driver_idObj = map.get("driver_id");
		if(driver_idObj != null)
			driver_id = driver_idObj.toString();

		Object helper_idObj = map.get("helper_id");
		if(helper_idObj != null)
			helper_id = helper_idObj.toString();

		Object alternate_helper_idObj = map.get("alternate_helper_id");
		if(alternate_helper_idObj != null)
			alternate_helper_id = alternate_helper_idObj.toString();

		Object delayedObj = map.get("delayed");
		if(delayedObj != null)
			delayed = new Long(delayedObj.toString());

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

	public String getRoute_id() {
		return route_id;
	}

	public String getRoute_idEx() {
		return route_id != null ? route_id : "";
	}

	public void setRoute_id(String route_id) {
		this.route_id = route_id;
	}

	public void unSetRoute_id() {
		this.route_id = null;
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

	public String getScheduled_start_time() {
		return scheduled_start_time;
	}

	public String getScheduled_start_timeEx() {
		return scheduled_start_time != null ? scheduled_start_time : "";
	}

	public void setScheduled_start_time(String scheduled_start_time) {
		this.scheduled_start_time = scheduled_start_time;
	}

	public void unSetScheduled_start_time() {
		this.scheduled_start_time = null;
	}

	public String getScheduled_reached_time() {
		return scheduled_reached_time;
	}

	public String getScheduled_reached_timeEx() {
		return scheduled_reached_time != null ? scheduled_reached_time : "";
	}

	public void setScheduled_reached_time(String scheduled_reached_time) {
		this.scheduled_reached_time = scheduled_reached_time;
	}

	public void unSetScheduled_reached_time() {
		this.scheduled_reached_time = null;
	}

	public String getStart_time() {
		return start_time;
	}

	public String getStart_timeEx() {
		return start_time != null ? start_time : "";
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public void unSetStart_time() {
		this.start_time = null;
	}

	public String getReached_time() {
		return reached_time;
	}

	public String getReached_timeEx() {
		return reached_time != null ? reached_time : "";
	}

	public void setReached_time(String reached_time) {
		this.reached_time = reached_time;
	}

	public void unSetReached_time() {
		this.reached_time = null;
	}

	public String getDriver_id() {
		return driver_id;
	}

	public String getDriver_idEx() {
		return driver_id != null ? driver_id : "";
	}

	public void setDriver_id(String driver_id) {
		this.driver_id = driver_id;
	}

	public void unSetDriver_id() {
		this.driver_id = null;
	}

	public String getHelper_id() {
		return helper_id;
	}

	public String getHelper_idEx() {
		return helper_id != null ? helper_id : "";
	}

	public void setHelper_id(String helper_id) {
		this.helper_id = helper_id;
	}

	public void unSetHelper_id() {
		this.helper_id = null;
	}

	public String getAlternate_helper_id() {
		return alternate_helper_id;
	}

	public String getAlternate_helper_idEx() {
		return alternate_helper_id != null ? alternate_helper_id : "";
	}

	public void setAlternate_helper_id(String alternate_helper_id) {
		this.alternate_helper_id = alternate_helper_id;
	}

	public void unSetAlternate_helper_id() {
		this.alternate_helper_id = null;
	}

	public Long getDelayed() {
		return delayed;
	}

	public long getDelayedEx() {
		return delayed != null ? delayed : 0L;
	}

	public void setDelayed(long delayed) {
		this.delayed = delayed;
	}

	public void setDelayed(Long delayed) {
		this.delayed = delayed;
	}

	public void unSetDelayed() {
		this.delayed = null;
	}
	public String getCluster() {
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}