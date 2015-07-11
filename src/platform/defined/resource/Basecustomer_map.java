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
public abstract class Basecustomer_map extends BaseResource {
	private String id = null;
	private List<Object> sensors = null;
	private List<Object> join = null;
	private List<Object> controllers = null;
	private List<Object> locations = null;
	private List<String> classes = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SENSORS = "sensors";
	public static String FIELD_JOIN = "join";
	public static String FIELD_CONTROLLERS = "controllers";
	public static String FIELD_LOCATIONS = "locations";
	public static String FIELD_CLASSES = "classes";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("customer_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field sensorsField = new Field("sensors", "Array");
		metaData.addField(sensorsField);

		Field joinField = new Field("join", "Array");
		metaData.addField(joinField);

		Field controllersField = new Field("controllers", "Array");
		metaData.addField(controllersField);

		Field locationsField = new Field("locations", "Array");
		metaData.addField(locationsField);

		Field classesField = new Field("classes", "Array");
		metaData.addField(classesField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("customer_map");

		metaData.setCluster("DB_PROFILE");
	}

	public Basecustomer_map() {}

	public Basecustomer_map(Basecustomer_map obj) {
		this.id = obj.id;
		this.sensors = obj.sensors;
		this.join = obj.join;
		this.controllers = obj.controllers;
		this.locations = obj.locations;
		this.classes = obj.classes;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(sensors != null)
			map.put("sensors", sensors);
		if(join != null)
			map.put("join", join);
		if(controllers != null)
			map.put("controllers", controllers);
		if(locations != null)
			map.put("locations", locations);
		if(classes != null)
			map.put("classes", classes);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(sensors != null)
			map.put("sensors", sensors);
		if(join != null)
			map.put("join", join);
		if(controllers != null)
			map.put("controllers", controllers);
		if(locations != null)
			map.put("locations", locations);
		if(classes != null)
			map.put("classes", classes);
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
		sensors = (List<Object>) map.get("sensors");
		join = (List<Object>) map.get("join");
		controllers = (List<Object>) map.get("controllers");
		locations = (List<Object>) map.get("locations");
		classes = (List<String>) map.get("classes");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		sensors = (List<Object>) map.get("sensors");
		join = (List<Object>) map.get("join");
		controllers = (List<Object>) map.get("controllers");
		locations = (List<Object>) map.get("locations");
		classes = (List<String>) map.get("classes");
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

	public List<Object> getSensors() {
		return sensors;
	}


	public void setSensors(List<Object> sensors) {
		this.sensors = sensors;
	}

	public void addSensors(Object value) {
		if(sensors == null)
			sensors = new ArrayList<>();
		sensors.add(value);
	}

	public void unSetSensors() {
		this.sensors = null;
	}

	public List<Object> getJoin() {
		return join;
	}


	public void setJoin(List<Object> join) {
		this.join = join;
	}

	public void addJoin(Object value) {
		if(join == null)
			join = new ArrayList<>();
		join.add(value);
	}

	public void unSetJoin() {
		this.join = null;
	}

	public List<Object> getControllers() {
		return controllers;
	}


	public void setControllers(List<Object> controllers) {
		this.controllers = controllers;
	}

	public void addControllers(Object value) {
		if(controllers == null)
			controllers = new ArrayList<>();
		controllers.add(value);
	}

	public void unSetControllers() {
		this.controllers = null;
	}

	public List<Object> getLocations() {
		return locations;
	}


	public void setLocations(List<Object> locations) {
		this.locations = locations;
	}

	public void addLocations(Object value) {
		if(locations == null)
			locations = new ArrayList<>();
		locations.add(value);
	}

	public void unSetLocations() {
		this.locations = null;
	}

	public List<String> getClasses() {
		return classes;
	}


	public void setClasses(List<String> classes) {
		this.classes = classes;
	}

	public void addClasses(String value) {
		if(classes == null)
			classes = new ArrayList<>();
		classes.add(value);
	}

	public void unSetClasses() {
		this.classes = null;
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