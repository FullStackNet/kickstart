/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.defined.resource;

import java.util.ArrayList;
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
public abstract class Baseroute_cordinate extends BaseResource {
	private String id = null;
	private String route_id = null;
	private String stopage_id = null;
	private Double distance = null;
	private String langitude = null;
	private String latitude = null;
	private ArrayList<Object> durations = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ROUTE_ID = "route_id";
	public static String FIELD_STOPAGE_ID = "stopage_id";
	public static String FIELD_DISTANCE = "distance";
	public static String FIELD_LANGITUDE = "langitude";
	public static String FIELD_LATITUDE = "latitude";
	public static String FIELD_DURATIONS = "durations";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("route_cordinate");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(512);
		metaData.addField(idField);

		Field route_idField = new Field("route_id", "String");
		route_idField.setRequired(true);
		route_idField.setLength(128);
		metaData.addField(route_idField);

		Field stopage_idField = new Field("stopage_id", "String");
		stopage_idField.setRequired(true);
		stopage_idField.setLength(128);
		metaData.addField(stopage_idField);

		Field distanceField = new Field("distance", "double");
		metaData.addField(distanceField);

		Field langitudeField = new Field("langitude", "String");
		langitudeField.setIndexed(true);
		langitudeField.setRequired(true);
		langitudeField.setLength(32);
		metaData.addField(langitudeField);

		Field latitudeField = new Field("latitude", "String");
		latitudeField.setRequired(true);
		latitudeField.setLength(32);
		metaData.addField(latitudeField);

		Field durationsField = new Field("durations", "Array");
		metaData.addField(durationsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("route_cordinate");

		metaData.setCluster("DB_ANALYSIS");
	}

	public Baseroute_cordinate() {}

	public Baseroute_cordinate(Baseroute_cordinate obj) {
		this.id = obj.id;
		this.route_id = obj.route_id;
		this.stopage_id = obj.stopage_id;
		this.distance = obj.distance;
		this.langitude = obj.langitude;
		this.latitude = obj.latitude;
		this.durations = obj.durations;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(route_id != null)
			map.put("route_id", route_id);
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(distance != null)
			map.put("distance", distance);
		if(langitude != null)
			map.put("langitude", langitude);
		if(latitude != null)
			map.put("latitude", latitude);
		if(durations != null)
			map.put("durations", durations);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validateRoute_id(add))
			map.put("route_id", route_id);
		if(validateStopage_id(add))
			map.put("stopage_id", stopage_id);
		if(distance != null)
			map.put("distance", distance);
		if(validateLangitude(add))
			map.put("langitude", langitude);
		if(validateLatitude(add))
			map.put("latitude", latitude);
		if(durations != null)
			map.put("durations", durations);
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
		route_id = (String) map.get("route_id");
		stopage_id = (String) map.get("stopage_id");
		distance = (Double) map.get("distance");
		langitude = (String) map.get("langitude");
		latitude = (String) map.get("latitude");
		durations = (ArrayList<Object>) map.get("durations");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object route_idObj = map.get("route_id");
		if(route_idObj != null)
			route_id = route_idObj.toString();

		Object stopage_idObj = map.get("stopage_id");
		if(stopage_idObj != null)
			stopage_id = stopage_idObj.toString();

		Object distanceObj = map.get("distance");
		if(distanceObj != null)
			distance = new Double(distanceObj.toString());

		Object langitudeObj = map.get("langitude");
		if(langitudeObj != null)
			langitude = langitudeObj.toString();

		Object latitudeObj = map.get("latitude");
		if(latitudeObj != null)
			latitude = latitudeObj.toString();

		durations = (ArrayList<Object>) map.get("durations");
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

	public boolean validateRoute_id(boolean add) throws ApplicationException {
		if(add && route_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[route_id]");
		return route_id != null;
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

	public boolean validateStopage_id(boolean add) throws ApplicationException {
		if(add && stopage_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[stopage_id]");
		return stopage_id != null;
	}

	public Double getDistance() {
		return distance;
	}

	public double getDistanceEx() {
		return distance != null ? distance : 0;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public void unSetDistance() {
		this.distance = null;
	}

	public String getLangitude() {
		return langitude;
	}

	public String getLangitudeEx() {
		return langitude != null ? langitude : "";
	}

	public void setLangitude(String langitude) {
		this.langitude = langitude;
	}

	public void unSetLangitude() {
		this.langitude = null;
	}

	public boolean validateLangitude(boolean add) throws ApplicationException {
		if(add && langitude == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[langitude]");
		return langitude != null;
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

	public boolean validateLatitude(boolean add) throws ApplicationException {
		if(add && latitude == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[latitude]");
		return latitude != null;
	}

	public ArrayList<Object> getDurations() {
		return durations;
	}


	public void setDurations(ArrayList<Object> durations) {
		this.durations = durations;
	}

	public void addDurations(Object value) {
		if(durations == null)
			durations = new ArrayList<Object>();
		durations.add(value);
	}

	public void unSetDurations() {
		this.durations = null;
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
		return "DB_ANALYSIS";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}