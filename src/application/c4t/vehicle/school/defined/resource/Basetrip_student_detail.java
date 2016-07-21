/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

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
public abstract class Basetrip_student_detail extends BaseResource {
	private String id = null;
	private String trip_id = null;
	private String route_id = null;
	private String stopage_id = null;
	private String route_stopage_id = null;
	private String stopage_name = null;
	private String student_id = null;
	private String student_name = null;
	private String class_name = null;
	private String section_name = null;
	private String reach_time = null;
	private Long creation_time = null;
	private Long entry_time = null;
	private Long exit_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TRIP_ID = "trip_id";
	public static String FIELD_ROUTE_ID = "route_id";
	public static String FIELD_STOPAGE_ID = "stopage_id";
	public static String FIELD_ROUTE_STOPAGE_ID = "route_stopage_id";
	public static String FIELD_STOPAGE_NAME = "stopage_name";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_STUDENT_NAME = "student_name";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_REACH_TIME = "reach_time";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_ENTRY_TIME = "entry_time";
	public static String FIELD_EXIT_TIME = "exit_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("trip_student_detail");

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

		Field route_idField = new Field("route_id", "String");
		route_idField.setLength(128);
		metaData.addField(route_idField);

		Field stopage_idField = new Field("stopage_id", "String");
		stopage_idField.setLength(128);
		metaData.addField(stopage_idField);

		Field route_stopage_idField = new Field("route_stopage_id", "String");
		route_stopage_idField.setLength(128);
		metaData.addField(route_stopage_idField);

		Field stopage_nameField = new Field("stopage_name", "String");
		stopage_nameField.setLength(128);
		metaData.addField(stopage_nameField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field student_nameField = new Field("student_name", "String");
		student_nameField.setLength(128);
		metaData.addField(student_nameField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(128);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(128);
		metaData.addField(section_nameField);

		Field reach_timeField = new Field("reach_time", "String");
		metaData.addField(reach_timeField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field entry_timeField = new Field("entry_time", "timestamp");
		metaData.addField(entry_timeField);

		Field exit_timeField = new Field("exit_time", "timestamp");
		metaData.addField(exit_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("trip_student_detail");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basetrip_student_detail() {}

	public Basetrip_student_detail(Basetrip_student_detail obj) {
		this.id = obj.id;
		this.trip_id = obj.trip_id;
		this.route_id = obj.route_id;
		this.stopage_id = obj.stopage_id;
		this.route_stopage_id = obj.route_stopage_id;
		this.stopage_name = obj.stopage_name;
		this.student_id = obj.student_id;
		this.student_name = obj.student_name;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.reach_time = obj.reach_time;
		this.creation_time = obj.creation_time;
		this.entry_time = obj.entry_time;
		this.exit_time = obj.exit_time;
		this.extra_data = obj.extra_data;
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
		if(route_id != null)
			map.put("route_id", route_id);
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(route_stopage_id != null)
			map.put("route_stopage_id", route_stopage_id);
		if(stopage_name != null)
			map.put("stopage_name", stopage_name);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(reach_time != null)
			map.put("reach_time", reach_time);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(entry_time != null)
			map.put("entry_time", entry_time);
		if(exit_time != null)
			map.put("exit_time", exit_time);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(trip_id != null)
			map.put("trip_id", trip_id);
		if(route_id != null)
			map.put("route_id", route_id);
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(route_stopage_id != null)
			map.put("route_stopage_id", route_stopage_id);
		if(stopage_name != null)
			map.put("stopage_name", stopage_name);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(reach_time != null)
			map.put("reach_time", reach_time);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(entry_time != null)
			map.put("entry_time", entry_time);
		if(exit_time != null)
			map.put("exit_time", exit_time);
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
		trip_id = (String) map.get("trip_id");
		route_id = (String) map.get("route_id");
		stopage_id = (String) map.get("stopage_id");
		route_stopage_id = (String) map.get("route_stopage_id");
		stopage_name = (String) map.get("stopage_name");
		student_id = (String) map.get("student_id");
		student_name = (String) map.get("student_name");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		reach_time = (String) map.get("reach_time");
		creation_time = (Long) map.get("creation_time");
		entry_time = (Long) map.get("entry_time");
		exit_time = (Long) map.get("exit_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object trip_idObj = map.get("trip_id");
		if(trip_idObj != null)
			trip_id = trip_idObj.toString();

		Object route_idObj = map.get("route_id");
		if(route_idObj != null)
			route_id = route_idObj.toString();

		Object stopage_idObj = map.get("stopage_id");
		if(stopage_idObj != null)
			stopage_id = stopage_idObj.toString();

		Object route_stopage_idObj = map.get("route_stopage_id");
		if(route_stopage_idObj != null)
			route_stopage_id = route_stopage_idObj.toString();

		Object stopage_nameObj = map.get("stopage_name");
		if(stopage_nameObj != null)
			stopage_name = stopage_nameObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object student_nameObj = map.get("student_name");
		if(student_nameObj != null)
			student_name = student_nameObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object reach_timeObj = map.get("reach_time");
		if(reach_timeObj != null)
			reach_time = reach_timeObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object entry_timeObj = map.get("entry_time");
		if(entry_timeObj != null)
			entry_time = (Long) entry_timeObj;

		Object exit_timeObj = map.get("exit_time");
		if(exit_timeObj != null)
			exit_time = (Long) exit_timeObj;

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

	public String getStudent_name() {
		return student_name;
	}

	public String getStudent_nameEx() {
		return student_name != null ? student_name : "";
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void unSetStudent_name() {
		this.student_name = null;
	}

	public String getClass_name() {
		return class_name;
	}

	public String getClass_nameEx() {
		return class_name != null ? class_name : "";
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public void unSetClass_name() {
		this.class_name = null;
	}

	public String getSection_name() {
		return section_name;
	}

	public String getSection_nameEx() {
		return section_name != null ? section_name : "";
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public void unSetSection_name() {
		this.section_name = null;
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

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Long getEntry_time() {
		return entry_time;
	}

	public void setEntry_time(Long entry_time) {
		this.entry_time = entry_time;
	}


	public Long getExit_time() {
		return exit_time;
	}

	public void setExit_time(Long exit_time) {
		this.exit_time = exit_time;
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