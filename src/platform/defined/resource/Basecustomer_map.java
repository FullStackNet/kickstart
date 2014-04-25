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
	private ArrayList<Object> sensors = null;
	private ArrayList<Object> join = null;
	private ArrayList<Object> controllers = null;
	private ArrayList<Object> locations = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SENSORS = "sensors";
	public static String FIELD_JOIN = "join";
	public static String FIELD_CONTROLLERS = "controllers";
	public static String FIELD_LOCATIONS = "locations";

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
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		sensors = (ArrayList<Object>) map.get("sensors");
		join = (ArrayList<Object>) map.get("join");
		controllers = (ArrayList<Object>) map.get("controllers");
		locations = (ArrayList<Object>) map.get("locations");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		sensors = (ArrayList<Object>) map.get("sensors");
		join = (ArrayList<Object>) map.get("join");
		controllers = (ArrayList<Object>) map.get("controllers");
		locations = (ArrayList<Object>) map.get("locations");
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

	public ArrayList<Object> getSensors() {
		return sensors;
	}


	public void setSensors(ArrayList<Object> sensors) {
		this.sensors = sensors;
	}

	public void addSensors(Object value) {
		if(sensors == null)
			sensors = new ArrayList<Object>();
		sensors.add(value);
	}

	public void unSetSensors() {
		this.sensors = null;
	}

	public ArrayList<Object> getJoin() {
		return join;
	}


	public void setJoin(ArrayList<Object> join) {
		this.join = join;
	}

	public void addJoin(Object value) {
		if(join == null)
			join = new ArrayList<Object>();
		join.add(value);
	}

	public void unSetJoin() {
		this.join = null;
	}

	public ArrayList<Object> getControllers() {
		return controllers;
	}


	public void setControllers(ArrayList<Object> controllers) {
		this.controllers = controllers;
	}

	public void addControllers(Object value) {
		if(controllers == null)
			controllers = new ArrayList<Object>();
		controllers.add(value);
	}

	public void unSetControllers() {
		this.controllers = null;
	}

	public ArrayList<Object> getLocations() {
		return locations;
	}


	public void setLocations(ArrayList<Object> locations) {
		this.locations = locations;
	}

	public void addLocations(Object value) {
		if(locations == null)
			locations = new ArrayList<Object>();
		locations.add(value);
	}

	public void unSetLocations() {
		this.locations = null;
	}
	public String getCluster() {
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}