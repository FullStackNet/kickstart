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
public abstract class Basecustomer_vehicle_map extends BaseResource {
	private String id = null;
	private ArrayList<Object> drivers = null;
	private ArrayList<Object> routes = null;
	private ArrayList<Object> fleetManagers = null;
	private ArrayList<Object> fleetOwners = null;
	private ArrayList<Object> stopages = null;
	private ArrayList<Object> students = null;
	private ArrayList<Object> route_stopage = null;

	public static String FIELD_ID = "id";
	public static String FIELD_DRIVERS = "drivers";
	public static String FIELD_ROUTES = "routes";
	public static String FIELD_FLEETMANAGERS = "fleetManagers";
	public static String FIELD_FLEETOWNERS = "fleetOwners";
	public static String FIELD_STOPAGES = "stopages";
	public static String FIELD_STUDENTS = "students";
	public static String FIELD_ROUTE_STOPAGE = "route_stopage";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("customer_vehicle_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field driversField = new Field("drivers", "Array");
		metaData.addField(driversField);

		Field routesField = new Field("routes", "Array");
		metaData.addField(routesField);

		Field fleetManagersField = new Field("fleetManagers", "Array");
		metaData.addField(fleetManagersField);

		Field fleetOwnersField = new Field("fleetOwners", "Array");
		metaData.addField(fleetOwnersField);

		Field stopagesField = new Field("stopages", "Array");
		metaData.addField(stopagesField);

		Field studentsField = new Field("students", "Array");
		metaData.addField(studentsField);

		Field route_stopageField = new Field("route_stopage", "Array");
		metaData.addField(route_stopageField);


		metaData.setTableName("customer_vehicle_map");

		metaData.setCluster("DB_DEVICE");
	}

	public Basecustomer_vehicle_map() {}

	public Basecustomer_vehicle_map(Basecustomer_vehicle_map obj) {
		this.id = obj.id;
		this.drivers = obj.drivers;
		this.routes = obj.routes;
		this.fleetManagers = obj.fleetManagers;
		this.fleetOwners = obj.fleetOwners;
		this.stopages = obj.stopages;
		this.students = obj.students;
		this.route_stopage = obj.route_stopage;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(drivers != null)
			map.put("drivers", drivers);
		if(routes != null)
			map.put("routes", routes);
		if(fleetManagers != null)
			map.put("fleetManagers", fleetManagers);
		if(fleetOwners != null)
			map.put("fleetOwners", fleetOwners);
		if(stopages != null)
			map.put("stopages", stopages);
		if(students != null)
			map.put("students", students);
		if(route_stopage != null)
			map.put("route_stopage", route_stopage);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(drivers != null)
			map.put("drivers", drivers);
		if(routes != null)
			map.put("routes", routes);
		if(fleetManagers != null)
			map.put("fleetManagers", fleetManagers);
		if(fleetOwners != null)
			map.put("fleetOwners", fleetOwners);
		if(stopages != null)
			map.put("stopages", stopages);
		if(students != null)
			map.put("students", students);
		if(route_stopage != null)
			map.put("route_stopage", route_stopage);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		drivers = (ArrayList<Object>) map.get("drivers");
		routes = (ArrayList<Object>) map.get("routes");
		fleetManagers = (ArrayList<Object>) map.get("fleetManagers");
		fleetOwners = (ArrayList<Object>) map.get("fleetOwners");
		stopages = (ArrayList<Object>) map.get("stopages");
		students = (ArrayList<Object>) map.get("students");
		route_stopage = (ArrayList<Object>) map.get("route_stopage");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		drivers = (ArrayList<Object>) map.get("drivers");
		routes = (ArrayList<Object>) map.get("routes");
		fleetManagers = (ArrayList<Object>) map.get("fleetManagers");
		fleetOwners = (ArrayList<Object>) map.get("fleetOwners");
		stopages = (ArrayList<Object>) map.get("stopages");
		students = (ArrayList<Object>) map.get("students");
		route_stopage = (ArrayList<Object>) map.get("route_stopage");
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

	public ArrayList<Object> getDrivers() {
		return drivers;
	}


	public void setDrivers(ArrayList<Object> drivers) {
		this.drivers = drivers;
	}

	public void addDrivers(Object value) {
		if(drivers == null)
			drivers = new ArrayList<Object>();
		drivers.add(value);
	}

	public void unSetDrivers() {
		this.drivers = null;
	}

	public ArrayList<Object> getRoutes() {
		return routes;
	}


	public void setRoutes(ArrayList<Object> routes) {
		this.routes = routes;
	}

	public void addRoutes(Object value) {
		if(routes == null)
			routes = new ArrayList<Object>();
		routes.add(value);
	}

	public void unSetRoutes() {
		this.routes = null;
	}

	public ArrayList<Object> getFleetManagers() {
		return fleetManagers;
	}


	public void setFleetManagers(ArrayList<Object> fleetManagers) {
		this.fleetManagers = fleetManagers;
	}

	public void addFleetManagers(Object value) {
		if(fleetManagers == null)
			fleetManagers = new ArrayList<Object>();
		fleetManagers.add(value);
	}

	public void unSetFleetManagers() {
		this.fleetManagers = null;
	}

	public ArrayList<Object> getFleetOwners() {
		return fleetOwners;
	}


	public void setFleetOwners(ArrayList<Object> fleetOwners) {
		this.fleetOwners = fleetOwners;
	}

	public void addFleetOwners(Object value) {
		if(fleetOwners == null)
			fleetOwners = new ArrayList<Object>();
		fleetOwners.add(value);
	}

	public void unSetFleetOwners() {
		this.fleetOwners = null;
	}

	public ArrayList<Object> getStopages() {
		return stopages;
	}


	public void setStopages(ArrayList<Object> stopages) {
		this.stopages = stopages;
	}

	public void addStopages(Object value) {
		if(stopages == null)
			stopages = new ArrayList<Object>();
		stopages.add(value);
	}

	public void unSetStopages() {
		this.stopages = null;
	}

	public ArrayList<Object> getStudents() {
		return students;
	}


	public void setStudents(ArrayList<Object> students) {
		this.students = students;
	}

	public void addStudents(Object value) {
		if(students == null)
			students = new ArrayList<Object>();
		students.add(value);
	}

	public void unSetStudents() {
		this.students = null;
	}

	public ArrayList<Object> getRoute_stopage() {
		return route_stopage;
	}


	public void setRoute_stopage(ArrayList<Object> route_stopage) {
		this.route_stopage = route_stopage;
	}

	public void addRoute_stopage(Object value) {
		if(route_stopage == null)
			route_stopage = new ArrayList<Object>();
		route_stopage.add(value);
	}

	public void unSetRoute_stopage() {
		this.route_stopage = null;
	}
	public String getCluster() {
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}