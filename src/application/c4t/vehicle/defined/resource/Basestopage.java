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
public abstract class Basestopage extends BaseResource {
	private String id = null;
	private String name = null;
	private String longitude = null;
	private String latitude = null;
	private String customer_id = null;
	private String area = null;
	private String school_id = null;
	private String user_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_LONGITUDE = "longitude";
	public static String FIELD_LATITUDE = "latitude";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_AREA = "area";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("stopage");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field longitudeField = new Field("longitude", "String");
		longitudeField.setLength(128);
		metaData.addField(longitudeField);

		Field latitudeField = new Field("latitude", "String");
		latitudeField.setLength(128);
		metaData.addField(latitudeField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field areaField = new Field("area", "String");
		areaField.setLength(128);
		metaData.addField(areaField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setRequired(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("stopage");

		metaData.setCluster("DB_CONFIG");
	}

	public Basestopage() {}

	public Basestopage(Basestopage obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.longitude = obj.longitude;
		this.latitude = obj.latitude;
		this.customer_id = obj.customer_id;
		this.area = obj.area;
		this.school_id = obj.school_id;
		this.user_id = obj.user_id;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(longitude != null)
			map.put("longitude", longitude);
		if(latitude != null)
			map.put("latitude", latitude);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(area != null)
			map.put("area", area);
		if(school_id != null)
			map.put("school_id", school_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(longitude != null)
			map.put("longitude", longitude);
		if(latitude != null)
			map.put("latitude", latitude);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(area != null)
			map.put("area", area);
		if(school_id != null)
			map.put("school_id", school_id);
		if(validateUser_id(add))
			map.put("user_id", user_id);
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
		longitude = (String) map.get("longitude");
		latitude = (String) map.get("latitude");
		customer_id = (String) map.get("customer_id");
		area = (String) map.get("area");
		school_id = (String) map.get("school_id");
		user_id = (String) map.get("user_id");
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

		Object longitudeObj = map.get("longitude");
		if(longitudeObj != null)
			longitude = longitudeObj.toString();

		Object latitudeObj = map.get("latitude");
		if(latitudeObj != null)
			latitude = latitudeObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object areaObj = map.get("area");
		if(areaObj != null)
			area = areaObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

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

	public String getArea() {
		return area;
	}

	public String getAreaEx() {
		return area != null ? area : "";
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void unSetArea() {
		this.area = null;
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