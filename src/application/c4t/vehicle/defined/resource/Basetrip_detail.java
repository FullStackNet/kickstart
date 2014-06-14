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
public abstract class Basetrip_detail extends BaseResource {
	private String id = null;
	private String trip_id = null;
	private String stopage_id = null;
	private String route_stopage_id = null;
	private String stopage_name = null;
	private String schedule_reach_time = null;
	private String reach_time = null;
	private Long delay_time = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TRIP_ID = "trip_id";
	public static String FIELD_STOPAGE_ID = "stopage_id";
	public static String FIELD_ROUTE_STOPAGE_ID = "route_stopage_id";
	public static String FIELD_STOPAGE_NAME = "stopage_name";
	public static String FIELD_SCHEDULE_REACH_TIME = "schedule_reach_time";
	public static String FIELD_REACH_TIME = "reach_time";
	public static String FIELD_DELAY_TIME = "delay_time";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("trip_detail");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field trip_idField = new Field("trip_id", "String");
		trip_idField.setLength(128);
		metaData.addField(trip_idField);

		Field stopage_idField = new Field("stopage_id", "String");
		stopage_idField.setLength(128);
		metaData.addField(stopage_idField);

		Field route_stopage_idField = new Field("route_stopage_id", "String");
		route_stopage_idField.setLength(128);
		metaData.addField(route_stopage_idField);

		Field stopage_nameField = new Field("stopage_name", "String");
		stopage_nameField.setLength(128);
		metaData.addField(stopage_nameField);

		Field schedule_reach_timeField = new Field("schedule_reach_time", "String");
		metaData.addField(schedule_reach_timeField);

		Field reach_timeField = new Field("reach_time", "String");
		metaData.addField(reach_timeField);

		Field delay_timeField = new Field("delay_time", "long");
		metaData.addField(delay_timeField);


		metaData.setTableName("trip_detail");

		metaData.setCluster("DB_LOG");
	}

	public Basetrip_detail() {}

	public Basetrip_detail(Basetrip_detail obj) {
		this.id = obj.id;
		this.trip_id = obj.trip_id;
		this.stopage_id = obj.stopage_id;
		this.route_stopage_id = obj.route_stopage_id;
		this.stopage_name = obj.stopage_name;
		this.schedule_reach_time = obj.schedule_reach_time;
		this.reach_time = obj.reach_time;
		this.delay_time = obj.delay_time;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(trip_id != null)
			map.put("trip_id", trip_id);
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(route_stopage_id != null)
			map.put("route_stopage_id", route_stopage_id);
		if(stopage_name != null)
			map.put("stopage_name", stopage_name);
		if(schedule_reach_time != null)
			map.put("schedule_reach_time", schedule_reach_time);
		if(reach_time != null)
			map.put("reach_time", reach_time);
		if(delay_time != null)
			map.put("delay_time", delay_time);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(trip_id != null)
			map.put("trip_id", trip_id);
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(route_stopage_id != null)
			map.put("route_stopage_id", route_stopage_id);
		if(stopage_name != null)
			map.put("stopage_name", stopage_name);
		if(schedule_reach_time != null)
			map.put("schedule_reach_time", schedule_reach_time);
		if(reach_time != null)
			map.put("reach_time", reach_time);
		if(delay_time != null)
			map.put("delay_time", delay_time);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		trip_id = (String) map.get("trip_id");
		stopage_id = (String) map.get("stopage_id");
		route_stopage_id = (String) map.get("route_stopage_id");
		stopage_name = (String) map.get("stopage_name");
		schedule_reach_time = (String) map.get("schedule_reach_time");
		reach_time = (String) map.get("reach_time");
		delay_time = (Long) map.get("delay_time");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object trip_idObj = map.get("trip_id");
		if(trip_idObj != null)
			trip_id = trip_idObj.toString();

		Object stopage_idObj = map.get("stopage_id");
		if(stopage_idObj != null)
			stopage_id = stopage_idObj.toString();

		Object route_stopage_idObj = map.get("route_stopage_id");
		if(route_stopage_idObj != null)
			route_stopage_id = route_stopage_idObj.toString();

		Object stopage_nameObj = map.get("stopage_name");
		if(stopage_nameObj != null)
			stopage_name = stopage_nameObj.toString();

		Object schedule_reach_timeObj = map.get("schedule_reach_time");
		if(schedule_reach_timeObj != null)
			schedule_reach_time = schedule_reach_timeObj.toString();

		Object reach_timeObj = map.get("reach_time");
		if(reach_timeObj != null)
			reach_time = reach_timeObj.toString();

		Object delay_timeObj = map.get("delay_time");
		if(delay_timeObj != null)
			delay_time = new Long(delay_timeObj.toString());

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

	public String getTrip_id() {
		return trip_id;
	}

	public String getTrip_idEx() {
		return trip_id != null ? trip_id : "";
	}

	public void setTrip_id(String trip_id) {
		this.trip_id = trip_id;
	}

	public void unSetTrip_id() {
		this.trip_id = null;
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

	public String getRoute_stopage_id() {
		return route_stopage_id;
	}

	public String getRoute_stopage_idEx() {
		return route_stopage_id != null ? route_stopage_id : "";
	}

	public void setRoute_stopage_id(String route_stopage_id) {
		this.route_stopage_id = route_stopage_id;
	}

	public void unSetRoute_stopage_id() {
		this.route_stopage_id = null;
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

	public String getSchedule_reach_time() {
		return schedule_reach_time;
	}

	public String getSchedule_reach_timeEx() {
		return schedule_reach_time != null ? schedule_reach_time : "";
	}

	public void setSchedule_reach_time(String schedule_reach_time) {
		this.schedule_reach_time = schedule_reach_time;
	}

	public void unSetSchedule_reach_time() {
		this.schedule_reach_time = null;
	}

	public String getReach_time() {
		return reach_time;
	}

	public String getReach_timeEx() {
		return reach_time != null ? reach_time : "";
	}

	public void setReach_time(String reach_time) {
		this.reach_time = reach_time;
	}

	public void unSetReach_time() {
		this.reach_time = null;
	}

	public Long getDelay_time() {
		return delay_time;
	}

	public long getDelay_timeEx() {
		return delay_time != null ? delay_time : 0L;
	}

	public void setDelay_time(long delay_time) {
		this.delay_time = delay_time;
	}

	public void setDelay_time(Long delay_time) {
		this.delay_time = delay_time;
	}

	public void unSetDelay_time() {
		this.delay_time = null;
	}
	public String getCluster() {
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}