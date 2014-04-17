/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.defined.resource;

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
public abstract class Basetrip extends BaseResource {
	private String id = null;
	private String appliance_id = null;
	private String route_id = null;
	private Long scheduled_start_time = null;
	private Long scheduled_reached_time = null;
	private Long start_time = null;
	private Long reached_time = null;
	private String from_city = null;
	private String to_city = null;
	private String driver_id = null;
	private String alternate_driver_id = null;
	private String conductor_id = null;
	private String alternate_conductor_id = null;
	private String helper_id = null;
	private String alternate_helper_id = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_ROUTE_ID = "route_id";
	public static String FIELD_SCHEDULED_START_TIME = "scheduled_start_time";
	public static String FIELD_SCHEDULED_REACHED_TIME = "scheduled_reached_time";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_REACHED_TIME = "reached_time";
	public static String FIELD_FROM_CITY = "from_city";
	public static String FIELD_TO_CITY = "to_city";
	public static String FIELD_DRIVER_ID = "driver_id";
	public static String FIELD_ALTERNATE_DRIVER_ID = "alternate_driver_id";
	public static String FIELD_CONDUCTOR_ID = "conductor_id";
	public static String FIELD_ALTERNATE_CONDUCTOR_ID = "alternate_conductor_id";
	public static String FIELD_HELPER_ID = "helper_id";
	public static String FIELD_ALTERNATE_HELPER_ID = "alternate_helper_id";

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

		Field scheduled_start_timeField = new Field("scheduled_start_time", "timestamp");
		metaData.addField(scheduled_start_timeField);

		Field scheduled_reached_timeField = new Field("scheduled_reached_time", "timestamp");
		metaData.addField(scheduled_reached_timeField);

		Field start_timeField = new Field("start_time", "timestamp");
		metaData.addField(start_timeField);

		Field reached_timeField = new Field("reached_time", "timestamp");
		metaData.addField(reached_timeField);

		Field from_cityField = new Field("from_city", "String");
		from_cityField.setLength(128);
		metaData.addField(from_cityField);

		Field to_cityField = new Field("to_city", "String");
		to_cityField.setLength(128);
		metaData.addField(to_cityField);

		Field driver_idField = new Field("driver_id", "String");
		driver_idField.setLength(128);
		metaData.addField(driver_idField);

		Field alternate_driver_idField = new Field("alternate_driver_id", "String");
		alternate_driver_idField.setLength(128);
		metaData.addField(alternate_driver_idField);

		Field conductor_idField = new Field("conductor_id", "String");
		conductor_idField.setLength(128);
		metaData.addField(conductor_idField);

		Field alternate_conductor_idField = new Field("alternate_conductor_id", "String");
		alternate_conductor_idField.setLength(128);
		metaData.addField(alternate_conductor_idField);

		Field helper_idField = new Field("helper_id", "String");
		helper_idField.setLength(128);
		metaData.addField(helper_idField);

		Field alternate_helper_idField = new Field("alternate_helper_id", "String");
		alternate_helper_idField.setLength(128);
		metaData.addField(alternate_helper_idField);


		metaData.setTableName("trip");

		metaData.setCluster("DB_LOG");
	}

	public Basetrip() {}

	public Basetrip(Basetrip obj) {
		this.id = obj.id;
		this.appliance_id = obj.appliance_id;
		this.route_id = obj.route_id;
		this.scheduled_start_time = obj.scheduled_start_time;
		this.scheduled_reached_time = obj.scheduled_reached_time;
		this.start_time = obj.start_time;
		this.reached_time = obj.reached_time;
		this.from_city = obj.from_city;
		this.to_city = obj.to_city;
		this.driver_id = obj.driver_id;
		this.alternate_driver_id = obj.alternate_driver_id;
		this.conductor_id = obj.conductor_id;
		this.alternate_conductor_id = obj.alternate_conductor_id;
		this.helper_id = obj.helper_id;
		this.alternate_helper_id = obj.alternate_helper_id;
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
		if(scheduled_start_time != null)
			map.put("scheduled_start_time", scheduled_start_time);
		if(scheduled_reached_time != null)
			map.put("scheduled_reached_time", scheduled_reached_time);
		if(start_time != null)
			map.put("start_time", start_time);
		if(reached_time != null)
			map.put("reached_time", reached_time);
		if(from_city != null)
			map.put("from_city", from_city);
		if(to_city != null)
			map.put("to_city", to_city);
		if(driver_id != null)
			map.put("driver_id", driver_id);
		if(alternate_driver_id != null)
			map.put("alternate_driver_id", alternate_driver_id);
		if(conductor_id != null)
			map.put("conductor_id", conductor_id);
		if(alternate_conductor_id != null)
			map.put("alternate_conductor_id", alternate_conductor_id);
		if(helper_id != null)
			map.put("helper_id", helper_id);
		if(alternate_helper_id != null)
			map.put("alternate_helper_id", alternate_helper_id);
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
		if(scheduled_start_time != null)
			map.put("scheduled_start_time", scheduled_start_time);
		if(scheduled_reached_time != null)
			map.put("scheduled_reached_time", scheduled_reached_time);
		if(start_time != null)
			map.put("start_time", start_time);
		if(reached_time != null)
			map.put("reached_time", reached_time);
		if(from_city != null)
			map.put("from_city", from_city);
		if(to_city != null)
			map.put("to_city", to_city);
		if(driver_id != null)
			map.put("driver_id", driver_id);
		if(alternate_driver_id != null)
			map.put("alternate_driver_id", alternate_driver_id);
		if(conductor_id != null)
			map.put("conductor_id", conductor_id);
		if(alternate_conductor_id != null)
			map.put("alternate_conductor_id", alternate_conductor_id);
		if(helper_id != null)
			map.put("helper_id", helper_id);
		if(alternate_helper_id != null)
			map.put("alternate_helper_id", alternate_helper_id);
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
		scheduled_start_time = (Long) map.get("scheduled_start_time");
		scheduled_reached_time = (Long) map.get("scheduled_reached_time");
		start_time = (Long) map.get("start_time");
		reached_time = (Long) map.get("reached_time");
		from_city = (String) map.get("from_city");
		to_city = (String) map.get("to_city");
		driver_id = (String) map.get("driver_id");
		alternate_driver_id = (String) map.get("alternate_driver_id");
		conductor_id = (String) map.get("conductor_id");
		alternate_conductor_id = (String) map.get("alternate_conductor_id");
		helper_id = (String) map.get("helper_id");
		alternate_helper_id = (String) map.get("alternate_helper_id");
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

		Object scheduled_start_timeObj = map.get("scheduled_start_time");
		if(scheduled_start_timeObj != null)
			scheduled_start_time = (Long) scheduled_start_timeObj;

		Object scheduled_reached_timeObj = map.get("scheduled_reached_time");
		if(scheduled_reached_timeObj != null)
			scheduled_reached_time = (Long) scheduled_reached_timeObj;

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = (Long) start_timeObj;

		Object reached_timeObj = map.get("reached_time");
		if(reached_timeObj != null)
			reached_time = (Long) reached_timeObj;

		Object from_cityObj = map.get("from_city");
		if(from_cityObj != null)
			from_city = from_cityObj.toString();

		Object to_cityObj = map.get("to_city");
		if(to_cityObj != null)
			to_city = to_cityObj.toString();

		Object driver_idObj = map.get("driver_id");
		if(driver_idObj != null)
			driver_id = driver_idObj.toString();

		Object alternate_driver_idObj = map.get("alternate_driver_id");
		if(alternate_driver_idObj != null)
			alternate_driver_id = alternate_driver_idObj.toString();

		Object conductor_idObj = map.get("conductor_id");
		if(conductor_idObj != null)
			conductor_id = conductor_idObj.toString();

		Object alternate_conductor_idObj = map.get("alternate_conductor_id");
		if(alternate_conductor_idObj != null)
			alternate_conductor_id = alternate_conductor_idObj.toString();

		Object helper_idObj = map.get("helper_id");
		if(helper_idObj != null)
			helper_id = helper_idObj.toString();

		Object alternate_helper_idObj = map.get("alternate_helper_id");
		if(alternate_helper_idObj != null)
			alternate_helper_id = alternate_helper_idObj.toString();

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

	public Long getScheduled_start_time() {
		return scheduled_start_time;
	}

	public void setScheduled_start_time(Long scheduled_start_time) {
		this.scheduled_start_time = scheduled_start_time;
	}


	public Long getScheduled_reached_time() {
		return scheduled_reached_time;
	}

	public void setScheduled_reached_time(Long scheduled_reached_time) {
		this.scheduled_reached_time = scheduled_reached_time;
	}


	public Long getStart_time() {
		return start_time;
	}

	public void setStart_time(Long start_time) {
		this.start_time = start_time;
	}


	public Long getReached_time() {
		return reached_time;
	}

	public void setReached_time(Long reached_time) {
		this.reached_time = reached_time;
	}


	public String getFrom_city() {
		return from_city;
	}

	public String getFrom_cityEx() {
		return from_city != null ? from_city : "";
	}

	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}

	public void unSetFrom_city() {
		this.from_city = null;
	}

	public String getTo_city() {
		return to_city;
	}

	public String getTo_cityEx() {
		return to_city != null ? to_city : "";
	}

	public void setTo_city(String to_city) {
		this.to_city = to_city;
	}

	public void unSetTo_city() {
		this.to_city = null;
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

	public String getAlternate_driver_id() {
		return alternate_driver_id;
	}

	public String getAlternate_driver_idEx() {
		return alternate_driver_id != null ? alternate_driver_id : "";
	}

	public void setAlternate_driver_id(String alternate_driver_id) {
		this.alternate_driver_id = alternate_driver_id;
	}

	public void unSetAlternate_driver_id() {
		this.alternate_driver_id = null;
	}

	public String getConductor_id() {
		return conductor_id;
	}

	public String getConductor_idEx() {
		return conductor_id != null ? conductor_id : "";
	}

	public void setConductor_id(String conductor_id) {
		this.conductor_id = conductor_id;
	}

	public void unSetConductor_id() {
		this.conductor_id = null;
	}

	public String getAlternate_conductor_id() {
		return alternate_conductor_id;
	}

	public String getAlternate_conductor_idEx() {
		return alternate_conductor_id != null ? alternate_conductor_id : "";
	}

	public void setAlternate_conductor_id(String alternate_conductor_id) {
		this.alternate_conductor_id = alternate_conductor_id;
	}

	public void unSetAlternate_conductor_id() {
		this.alternate_conductor_id = null;
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
	public String getCluster() {
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}