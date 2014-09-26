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
public abstract class Basetrip_overspeed_detail extends BaseResource {
	private String id = null;
	private String trip_id = null;
	private Long creation_time = null;
	private String latitude = null;
	private String longitude = null;
	private Integer speed = null;
	private String last_stopage = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TRIP_ID = "trip_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_LATITUDE = "latitude";
	public static String FIELD_LONGITUDE = "longitude";
	public static String FIELD_SPEED = "speed";
	public static String FIELD_LAST_STOPAGE = "last_stopage";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("trip_overspeed_detail");

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

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field latitudeField = new Field("latitude", "String");
		metaData.addField(latitudeField);

		Field longitudeField = new Field("longitude", "String");
		metaData.addField(longitudeField);

		Field speedField = new Field("speed", "int");
		metaData.addField(speedField);

		Field last_stopageField = new Field("last_stopage", "String");
		last_stopageField.setLength(128);
		metaData.addField(last_stopageField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("trip_overspeed_detail");

		metaData.setCluster("DB_LOG");
	}

	public Basetrip_overspeed_detail() {}

	public Basetrip_overspeed_detail(Basetrip_overspeed_detail obj) {
		this.id = obj.id;
		this.trip_id = obj.trip_id;
		this.creation_time = obj.creation_time;
		this.latitude = obj.latitude;
		this.longitude = obj.longitude;
		this.speed = obj.speed;
		this.last_stopage = obj.last_stopage;
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
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(latitude != null)
			map.put("latitude", latitude);
		if(longitude != null)
			map.put("longitude", longitude);
		if(speed != null)
			map.put("speed", speed);
		if(last_stopage != null)
			map.put("last_stopage", last_stopage);
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
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(latitude != null)
			map.put("latitude", latitude);
		if(longitude != null)
			map.put("longitude", longitude);
		if(speed != null)
			map.put("speed", speed);
		if(last_stopage != null)
			map.put("last_stopage", last_stopage);
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
		creation_time = (Long) map.get("creation_time");
		latitude = (String) map.get("latitude");
		longitude = (String) map.get("longitude");
		speed = (Integer) map.get("speed");
		last_stopage = (String) map.get("last_stopage");
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

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object latitudeObj = map.get("latitude");
		if(latitudeObj != null)
			latitude = latitudeObj.toString();

		Object longitudeObj = map.get("longitude");
		if(longitudeObj != null)
			longitude = longitudeObj.toString();

		Object speedObj = map.get("speed");
		if(speedObj != null)
			speed = new Integer(speedObj.toString());

		Object last_stopageObj = map.get("last_stopage");
		if(last_stopageObj != null)
			last_stopage = last_stopageObj.toString();

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

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
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

	public Integer getSpeed() {
		return speed;
	}

	public int getSpeedEx() {
		return speed != null ? speed : 0;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public void unSetSpeed() {
		this.speed = null;
	}

	public String getLast_stopage() {
		return last_stopage;
	}

	public String getLast_stopageEx() {
		return last_stopage != null ? last_stopage : "";
	}

	public void setLast_stopage(String last_stopage) {
		this.last_stopage = last_stopage;
	}

	public void unSetLast_stopage() {
		this.last_stopage = null;
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
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}