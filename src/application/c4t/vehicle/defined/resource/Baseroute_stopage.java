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
public abstract class Baseroute_stopage extends BaseResource {
	private String id = null;
	private String name = null;
	private String customer_id = null;
	private String user_id = null;
	private String longitude = null;
	private String latitude = null;
	private String route_id = null;
	private String stopage_id = null;
	private String stopage_name = null;
	private String reached = null;
	private Long speed = null;
	private Double distance_from_current_location = null;
	private Integer stopage_order = null;
	private Double distance_from_previous_stop = null;
	private Integer time_from_previous_stop = null;
	private Long reached_time = null;
	private Integer reached_duration = null;
	private Double stopage_radius = null;
	private String controller_connected = null;
	private String time_bound_stop = null;
	private Integer time_buffer_before = null;
	private Integer time_buffer_after = null;
	private String expected_reachtime = null;
	private Long controller_last_update_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_LONGITUDE = "longitude";
	public static String FIELD_LATITUDE = "latitude";
	public static String FIELD_ROUTE_ID = "route_id";
	public static String FIELD_STOPAGE_ID = "stopage_id";
	public static String FIELD_STOPAGE_NAME = "stopage_name";
	public static String FIELD_REACHED = "reached";
	public static String FIELD_SPEED = "speed";
	public static String FIELD_DISTANCE_FROM_CURRENT_LOCATION = "distance_from_current_location";
	public static String FIELD_STOPAGE_ORDER = "stopage_order";
	public static String FIELD_DISTANCE_FROM_PREVIOUS_STOP = "distance_from_previous_stop";
	public static String FIELD_TIME_FROM_PREVIOUS_STOP = "time_from_previous_stop";
	public static String FIELD_REACHED_TIME = "reached_time";
	public static String FIELD_REACHED_DURATION = "reached_duration";
	public static String FIELD_STOPAGE_RADIUS = "stopage_radius";
	public static String FIELD_CONTROLLER_CONNECTED = "controller_connected";
	public static String FIELD_TIME_BOUND_STOP = "time_bound_stop";
	public static String FIELD_TIME_BUFFER_BEFORE = "time_buffer_before";
	public static String FIELD_TIME_BUFFER_AFTER = "time_buffer_after";
	public static String FIELD_EXPECTED_REACHTIME = "expected_reachtime";
	public static String FIELD_CONTROLLER_LAST_UPDATE_TIME = "controller_last_update_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("route_stopage");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setRequired(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setRequired(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field longitudeField = new Field("longitude", "String");
		longitudeField.setLength(128);
		metaData.addField(longitudeField);

		Field latitudeField = new Field("latitude", "String");
		latitudeField.setLength(128);
		metaData.addField(latitudeField);

		Field route_idField = new Field("route_id", "String");
		route_idField.setIndexed(true);
		route_idField.setLength(128);
		metaData.addField(route_idField);

		Field stopage_idField = new Field("stopage_id", "String");
		stopage_idField.setLength(128);
		metaData.addField(stopage_idField);

		Field stopage_orderField = new Field("stopage_order", "int");
		metaData.addField(stopage_orderField);

		Field distance_from_previous_stopField = new Field("distance_from_previous_stop", "double");
		metaData.addField(distance_from_previous_stopField);

		Field time_from_previous_stopField = new Field("time_from_previous_stop", "int");
		metaData.addField(time_from_previous_stopField);

		Field reached_timeField = new Field("reached_time", "long");
		metaData.addField(reached_timeField);

		Field reached_durationField = new Field("reached_duration", "int");
		metaData.addField(reached_durationField);

		Field stopage_radiusField = new Field("stopage_radius", "double");
		stopage_radiusField.setDefaultValue(50.0);
		metaData.addField(stopage_radiusField);

		Field controller_connectedField = new Field("controller_connected", "String");
		controller_connectedField.setLength(1);
		metaData.addField(controller_connectedField);

		Field time_bound_stopField = new Field("time_bound_stop", "String");
		time_bound_stopField.setDefaultValue("N");
		time_bound_stopField.setLength(1);
		metaData.addField(time_bound_stopField);

		Field time_buffer_beforeField = new Field("time_buffer_before", "int");
		time_buffer_beforeField.setDefaultValue(0);
		time_buffer_beforeField.setLength(1);
		metaData.addField(time_buffer_beforeField);

		Field time_buffer_afterField = new Field("time_buffer_after", "int");
		time_buffer_afterField.setDefaultValue(0);
		time_buffer_afterField.setLength(1);
		metaData.addField(time_buffer_afterField);

		Field expected_reachtimeField = new Field("expected_reachtime", "String");
		metaData.addField(expected_reachtimeField);

		Field controller_last_update_timeField = new Field("controller_last_update_time", "long");
		metaData.addField(controller_last_update_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("route_stopage");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseroute_stopage() {}

	public Baseroute_stopage(Baseroute_stopage obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.longitude = obj.longitude;
		this.latitude = obj.latitude;
		this.route_id = obj.route_id;
		this.stopage_id = obj.stopage_id;
		this.stopage_name = obj.stopage_name;
		this.reached = obj.reached;
		this.speed = obj.speed;
		this.distance_from_current_location = obj.distance_from_current_location;
		this.stopage_order = obj.stopage_order;
		this.distance_from_previous_stop = obj.distance_from_previous_stop;
		this.time_from_previous_stop = obj.time_from_previous_stop;
		this.reached_time = obj.reached_time;
		this.reached_duration = obj.reached_duration;
		this.stopage_radius = obj.stopage_radius;
		this.controller_connected = obj.controller_connected;
		this.time_bound_stop = obj.time_bound_stop;
		this.time_buffer_before = obj.time_buffer_before;
		this.time_buffer_after = obj.time_buffer_after;
		this.expected_reachtime = obj.expected_reachtime;
		this.controller_last_update_time = obj.controller_last_update_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(reached == null)
			reached = "N";
		if(stopage_radius == null)
			stopage_radius = 50.0;
		if(time_bound_stop == null)
			time_bound_stop = "N";
		if(time_buffer_before == null)
			time_buffer_before = 0;
		if(time_buffer_after == null)
			time_buffer_after = 0;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(longitude != null)
			map.put("longitude", longitude);
		if(latitude != null)
			map.put("latitude", latitude);
		if(route_id != null)
			map.put("route_id", route_id);
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(stopage_name != null)
			map.put("stopage_name", stopage_name);
		if(reached != null)
			map.put("reached", reached);
		if(speed != null)
			map.put("speed", speed);
		if(distance_from_current_location != null)
			map.put("distance_from_current_location", distance_from_current_location);
		if(stopage_order != null)
			map.put("stopage_order", stopage_order);
		if(distance_from_previous_stop != null)
			map.put("distance_from_previous_stop", distance_from_previous_stop);
		if(time_from_previous_stop != null)
			map.put("time_from_previous_stop", time_from_previous_stop);
		if(reached_time != null)
			map.put("reached_time", reached_time);
		if(reached_duration != null)
			map.put("reached_duration", reached_duration);
		if(stopage_radius != null)
			map.put("stopage_radius", stopage_radius);
		if(controller_connected != null)
			map.put("controller_connected", controller_connected);
		if(time_bound_stop != null)
			map.put("time_bound_stop", time_bound_stop);
		if(time_buffer_before != null)
			map.put("time_buffer_before", time_buffer_before);
		if(time_buffer_after != null)
			map.put("time_buffer_after", time_buffer_after);
		if(expected_reachtime != null)
			map.put("expected_reachtime", expected_reachtime);
		if(controller_last_update_time != null)
			map.put("controller_last_update_time", controller_last_update_time);
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
		if(validateName(add))
			map.put("name", name);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(validateUser_id(add))
			map.put("user_id", user_id);
		if(longitude != null)
			map.put("longitude", longitude);
		if(latitude != null)
			map.put("latitude", latitude);
		if(route_id != null)
			map.put("route_id", route_id);
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(stopage_name != null)
			map.put("stopage_name", stopage_name);
		if(reached != null)
			map.put("reached", reached);
		if(speed != null)
			map.put("speed", speed);
		if(distance_from_current_location != null)
			map.put("distance_from_current_location", distance_from_current_location);
		if(stopage_order != null)
			map.put("stopage_order", stopage_order);
		if(distance_from_previous_stop != null)
			map.put("distance_from_previous_stop", distance_from_previous_stop);
		if(time_from_previous_stop != null)
			map.put("time_from_previous_stop", time_from_previous_stop);
		if(reached_time != null)
			map.put("reached_time", reached_time);
		if(reached_duration != null)
			map.put("reached_duration", reached_duration);
		if(stopage_radius != null)
			map.put("stopage_radius", stopage_radius);
		if(controller_connected != null)
			map.put("controller_connected", controller_connected);
		if(time_bound_stop != null)
			map.put("time_bound_stop", time_bound_stop);
		if(time_buffer_before != null)
			map.put("time_buffer_before", time_buffer_before);
		if(time_buffer_after != null)
			map.put("time_buffer_after", time_buffer_after);
		if(expected_reachtime != null)
			map.put("expected_reachtime", expected_reachtime);
		if(controller_last_update_time != null)
			map.put("controller_last_update_time", controller_last_update_time);
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
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		longitude = (String) map.get("longitude");
		latitude = (String) map.get("latitude");
		route_id = (String) map.get("route_id");
		stopage_id = (String) map.get("stopage_id");
		stopage_order = (Integer) map.get("stopage_order");
		distance_from_previous_stop = (Double) map.get("distance_from_previous_stop");
		time_from_previous_stop = (Integer) map.get("time_from_previous_stop");
		reached_time = (Long) map.get("reached_time");
		reached_duration = (Integer) map.get("reached_duration");
		stopage_radius = (Double) map.get("stopage_radius");
		controller_connected = (String) map.get("controller_connected");
		time_bound_stop = (String) map.get("time_bound_stop");
		time_buffer_before = (Integer) map.get("time_buffer_before");
		time_buffer_after = (Integer) map.get("time_buffer_after");
		expected_reachtime = (String) map.get("expected_reachtime");
		controller_last_update_time = (Long) map.get("controller_last_update_time");
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

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object longitudeObj = map.get("longitude");
		if(longitudeObj != null)
			longitude = longitudeObj.toString();

		Object latitudeObj = map.get("latitude");
		if(latitudeObj != null)
			latitude = latitudeObj.toString();

		Object route_idObj = map.get("route_id");
		if(route_idObj != null)
			route_id = route_idObj.toString();

		Object stopage_idObj = map.get("stopage_id");
		if(stopage_idObj != null)
			stopage_id = stopage_idObj.toString();

		Object stopage_orderObj = map.get("stopage_order");
		if(stopage_orderObj != null)
			stopage_order = new Integer(stopage_orderObj.toString());

		Object distance_from_previous_stopObj = map.get("distance_from_previous_stop");
		if(distance_from_previous_stopObj != null)
			distance_from_previous_stop = new Double(distance_from_previous_stopObj.toString());

		Object time_from_previous_stopObj = map.get("time_from_previous_stop");
		if(time_from_previous_stopObj != null)
			time_from_previous_stop = new Integer(time_from_previous_stopObj.toString());

		Object reached_timeObj = map.get("reached_time");
		if(reached_timeObj != null)
			reached_time = new Long(reached_timeObj.toString());

		Object reached_durationObj = map.get("reached_duration");
		if(reached_durationObj != null)
			reached_duration = new Integer(reached_durationObj.toString());

		Object stopage_radiusObj = map.get("stopage_radius");
		if(stopage_radiusObj != null)
			stopage_radius = new Double(stopage_radiusObj.toString());

		Object controller_connectedObj = map.get("controller_connected");
		if(controller_connectedObj != null)
			controller_connected = controller_connectedObj.toString();

		Object time_bound_stopObj = map.get("time_bound_stop");
		if(time_bound_stopObj != null)
			time_bound_stop = time_bound_stopObj.toString();

		Object time_buffer_beforeObj = map.get("time_buffer_before");
		if(time_buffer_beforeObj != null)
			time_buffer_before = new Integer(time_buffer_beforeObj.toString());

		Object time_buffer_afterObj = map.get("time_buffer_after");
		if(time_buffer_afterObj != null)
			time_buffer_after = new Integer(time_buffer_afterObj.toString());

		Object expected_reachtimeObj = map.get("expected_reachtime");
		if(expected_reachtimeObj != null)
			expected_reachtime = expected_reachtimeObj.toString();

		Object controller_last_update_timeObj = map.get("controller_last_update_time");
		if(controller_last_update_timeObj != null)
			controller_last_update_time = new Long(controller_last_update_timeObj.toString());

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

	public boolean validateName(boolean add) throws ApplicationException {
		if(add && name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[name]");
		return name != null;
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

	public boolean validateCustomer_id(boolean add) throws ApplicationException {
		if(add && customer_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[customer_id]");
		return customer_id != null;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getUser_idEx() {
		return user_id != null ? user_id : "";
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void unSetUser_id() {
		this.user_id = null;
	}

	public boolean validateUser_id(boolean add) throws ApplicationException {
		if(add && user_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[user_id]");
		return user_id != null;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getLongitudeEx() {
		return longitude != null ? longitude : "";
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void unSetLongitude() {
		this.longitude = null;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLatitudeEx() {
		return latitude != null ? latitude : "";
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public void unSetLatitude() {
		this.latitude = null;
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

	public String getStopage_id() {
		return stopage_id;
	}

	public String getStopage_idEx() {
		return stopage_id != null ? stopage_id : "";
	}

	public void setStopage_id(String stopage_id) {
		this.stopage_id = stopage_id;
	}

	public void unSetStopage_id() {
		this.stopage_id = null;
	}

	public String getStopage_name() {
		return stopage_name;
	}

	public String getStopage_nameEx() {
		return stopage_name != null ? stopage_name : "";
	}

	public void setStopage_name(String stopage_name) {
		this.stopage_name = stopage_name;
	}

	public void unSetStopage_name() {
		this.stopage_name = null;
	}

	public String getReached() {
		return reached != null ? reached : "N";
	}

	public void setReached(String reached) {
		this.reached = reached;
	}

	public void unSetReached() {
		this.reached = "N";
	}

	public Long getSpeed() {
		return speed;
	}

	public long getSpeedEx() {
		return speed != null ? speed : 0L;
	}

	public void setSpeed(long speed) {
		this.speed = speed;
	}

	public void setSpeed(Long speed) {
		this.speed = speed;
	}

	public void unSetSpeed() {
		this.speed = null;
	}

	public Double getDistance_from_current_location() {
		return distance_from_current_location;
	}

	public double getDistance_from_current_locationEx() {
		return distance_from_current_location != null ? distance_from_current_location : 0;
	}

	public void setDistance_from_current_location(double distance_from_current_location) {
		this.distance_from_current_location = distance_from_current_location;
	}

	public void setDistance_from_current_location(Double distance_from_current_location) {
		this.distance_from_current_location = distance_from_current_location;
	}

	public void unSetDistance_from_current_location() {
		this.distance_from_current_location = null;
	}

	public Integer getStopage_order() {
		return stopage_order;
	}

	public int getStopage_orderEx() {
		return stopage_order != null ? stopage_order : 0;
	}

	public void setStopage_order(int stopage_order) {
		this.stopage_order = stopage_order;
	}

	public void setStopage_order(Integer stopage_order) {
		this.stopage_order = stopage_order;
	}

	public void unSetStopage_order() {
		this.stopage_order = null;
	}

	public Double getDistance_from_previous_stop() {
		return distance_from_previous_stop;
	}

	public double getDistance_from_previous_stopEx() {
		return distance_from_previous_stop != null ? distance_from_previous_stop : 0;
	}

	public void setDistance_from_previous_stop(double distance_from_previous_stop) {
		this.distance_from_previous_stop = distance_from_previous_stop;
	}

	public void setDistance_from_previous_stop(Double distance_from_previous_stop) {
		this.distance_from_previous_stop = distance_from_previous_stop;
	}

	public void unSetDistance_from_previous_stop() {
		this.distance_from_previous_stop = null;
	}

	public Integer getTime_from_previous_stop() {
		return time_from_previous_stop;
	}

	public int getTime_from_previous_stopEx() {
		return time_from_previous_stop != null ? time_from_previous_stop : 0;
	}

	public void setTime_from_previous_stop(int time_from_previous_stop) {
		this.time_from_previous_stop = time_from_previous_stop;
	}

	public void setTime_from_previous_stop(Integer time_from_previous_stop) {
		this.time_from_previous_stop = time_from_previous_stop;
	}

	public void unSetTime_from_previous_stop() {
		this.time_from_previous_stop = null;
	}

	public Long getReached_time() {
		return reached_time;
	}

	public long getReached_timeEx() {
		return reached_time != null ? reached_time : 0L;
	}

	public void setReached_time(long reached_time) {
		this.reached_time = reached_time;
	}

	public void setReached_time(Long reached_time) {
		this.reached_time = reached_time;
	}

	public void unSetReached_time() {
		this.reached_time = null;
	}

	public Integer getReached_duration() {
		return reached_duration;
	}

	public int getReached_durationEx() {
		return reached_duration != null ? reached_duration : 0;
	}

	public void setReached_duration(int reached_duration) {
		this.reached_duration = reached_duration;
	}

	public void setReached_duration(Integer reached_duration) {
		this.reached_duration = reached_duration;
	}

	public void unSetReached_duration() {
		this.reached_duration = null;
	}

	public Double getStopage_radius() {
		return stopage_radius != null ? stopage_radius : 50.0;
	}

	public void setStopage_radius(double stopage_radius) {
		this.stopage_radius = stopage_radius;
	}

	public void setStopage_radius(Double stopage_radius) {
		this.stopage_radius = stopage_radius;
	}

	public void unSetStopage_radius() {
		this.stopage_radius = 50.0;
	}

	public String getController_connected() {
		return controller_connected;
	}

	public String getController_connectedEx() {
		return controller_connected != null ? controller_connected : "";
	}

	public void setController_connected(String controller_connected) {
		this.controller_connected = controller_connected;
	}

	public void unSetController_connected() {
		this.controller_connected = null;
	}

	public String getTime_bound_stop() {
		return time_bound_stop != null ? time_bound_stop : "N";
	}

	public void setTime_bound_stop(String time_bound_stop) {
		this.time_bound_stop = time_bound_stop;
	}

	public void unSetTime_bound_stop() {
		this.time_bound_stop = "N";
	}

	public Integer getTime_buffer_before() {
		return time_buffer_before != null ? time_buffer_before : 0;
	}

	public void setTime_buffer_before(int time_buffer_before) {
		this.time_buffer_before = time_buffer_before;
	}

	public void setTime_buffer_before(Integer time_buffer_before) {
		this.time_buffer_before = time_buffer_before;
	}

	public void unSetTime_buffer_before() {
		this.time_buffer_before = 0;
	}

	public Integer getTime_buffer_after() {
		return time_buffer_after != null ? time_buffer_after : 0;
	}

	public void setTime_buffer_after(int time_buffer_after) {
		this.time_buffer_after = time_buffer_after;
	}

	public void setTime_buffer_after(Integer time_buffer_after) {
		this.time_buffer_after = time_buffer_after;
	}

	public void unSetTime_buffer_after() {
		this.time_buffer_after = 0;
	}

	public String getExpected_reachtime() {
		return expected_reachtime;
	}

	public String getExpected_reachtimeEx() {
		return expected_reachtime != null ? expected_reachtime : "";
	}

	public void setExpected_reachtime(String expected_reachtime) {
		this.expected_reachtime = expected_reachtime;
	}

	public void unSetExpected_reachtime() {
		this.expected_reachtime = null;
	}

	public Long getController_last_update_time() {
		return controller_last_update_time;
	}

	public long getController_last_update_timeEx() {
		return controller_last_update_time != null ? controller_last_update_time : 0L;
	}

	public void setController_last_update_time(long controller_last_update_time) {
		this.controller_last_update_time = controller_last_update_time;
	}

	public void setController_last_update_time(Long controller_last_update_time) {
		this.controller_last_update_time = controller_last_update_time;
	}

	public void unSetController_last_update_time() {
		this.controller_last_update_time = null;
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
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}