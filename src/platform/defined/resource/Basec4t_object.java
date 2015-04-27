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
public abstract class Basec4t_object extends BaseResource {
	private String id = null;
	private String name = null;
	private String parent_id = null;
	private String object_type = null;
	private String type = null;
	private String email_id = null;
	private String mobile_no = null;
	private String status = null;
	private String role = null;
	private String address = null;
	private String area = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String zip_code = null;
	private Long creation_time = null;
	private Long updation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_PARENT_ID = "parent_id";
	public static String FIELD_OBJECT_TYPE = "object_type";
	public static String FIELD_TYPE = "type";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_STATUS = "status";
	public static String FIELD_ROLE = "role";
	public static String FIELD_ADDRESS = "address";
	public static String FIELD_AREA = "area";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_ZIP_CODE = "zip_code";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_UPDATION_TIME = "updation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_object");

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

		Field parent_idField = new Field("parent_id", "String");
		parent_idField.setLength(128);
		metaData.addField(parent_idField);

		Field object_typeField = new Field("object_type", "String");
		object_typeField.setLength(128);
		metaData.addField(object_typeField);

		Field typeField = new Field("type", "String");
		typeField.setLength(128);
		metaData.addField(typeField);

		Field email_idField = new Field("email_id", "String");
		email_idField.setLength(128);
		metaData.addField(email_idField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(128);
		metaData.addField(mobile_noField);

		Field statusField = new Field("status", "String");
		statusField.setLength(128);
		metaData.addField(statusField);

		Field roleField = new Field("role", "String");
		roleField.setLength(128);
		metaData.addField(roleField);

		Field addressField = new Field("address", "String");
		addressField.setLength(128);
		metaData.addField(addressField);

		Field areaField = new Field("area", "String");
		areaField.setLength(128);
		metaData.addField(areaField);

		Field cityField = new Field("city", "String");
		cityField.setLength(128);
		metaData.addField(cityField);

		Field stateField = new Field("state", "String");
		stateField.setLength(128);
		metaData.addField(stateField);

		Field countryField = new Field("country", "String");
		countryField.setLength(128);
		metaData.addField(countryField);

		Field zip_codeField = new Field("zip_code", "String");
		zip_codeField.setLength(128);
		metaData.addField(zip_codeField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field updation_timeField = new Field("updation_time", "timestamp");
		metaData.addField(updation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_object");

		metaData.setCluster("DB_OBJECT");
	}

	public Basec4t_object() {}

	public Basec4t_object(Basec4t_object obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.parent_id = obj.parent_id;
		this.object_type = obj.object_type;
		this.type = obj.type;
		this.email_id = obj.email_id;
		this.mobile_no = obj.mobile_no;
		this.status = obj.status;
		this.role = obj.role;
		this.address = obj.address;
		this.area = obj.area;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.zip_code = obj.zip_code;
		this.creation_time = obj.creation_time;
		this.updation_time = obj.updation_time;
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
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(object_type != null)
			map.put("object_type", object_type);
		if(type != null)
			map.put("type", type);
		if(email_id != null)
			map.put("email_id", email_id);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(status != null)
			map.put("status", status);
		if(role != null)
			map.put("role", role);
		if(address != null)
			map.put("address", address);
		if(area != null)
			map.put("area", area);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(zip_code != null)
			map.put("zip_code", zip_code);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(updation_time != null)
			map.put("updation_time", updation_time);
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
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(object_type != null)
			map.put("object_type", object_type);
		if(type != null)
			map.put("type", type);
		if(email_id != null)
			map.put("email_id", email_id);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(status != null)
			map.put("status", status);
		if(role != null)
			map.put("role", role);
		if(address != null)
			map.put("address", address);
		if(area != null)
			map.put("area", area);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(zip_code != null)
			map.put("zip_code", zip_code);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(updation_time != null)
			map.put("updation_time", updation_time);
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
		parent_id = (String) map.get("parent_id");
		object_type = (String) map.get("object_type");
		type = (String) map.get("type");
		email_id = (String) map.get("email_id");
		mobile_no = (String) map.get("mobile_no");
		status = (String) map.get("status");
		role = (String) map.get("role");
		address = (String) map.get("address");
		area = (String) map.get("area");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		zip_code = (String) map.get("zip_code");
		creation_time = (Long) map.get("creation_time");
		updation_time = (Long) map.get("updation_time");
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

		Object parent_idObj = map.get("parent_id");
		if(parent_idObj != null)
			parent_id = parent_idObj.toString();

		Object object_typeObj = map.get("object_type");
		if(object_typeObj != null)
			object_type = object_typeObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

		Object roleObj = map.get("role");
		if(roleObj != null)
			role = roleObj.toString();

		Object addressObj = map.get("address");
		if(addressObj != null)
			address = addressObj.toString();

		Object areaObj = map.get("area");
		if(areaObj != null)
			area = areaObj.toString();

		Object cityObj = map.get("city");
		if(cityObj != null)
			city = cityObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object countryObj = map.get("country");
		if(countryObj != null)
			country = countryObj.toString();

		Object zip_codeObj = map.get("zip_code");
		if(zip_codeObj != null)
			zip_code = zip_codeObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object updation_timeObj = map.get("updation_time");
		if(updation_timeObj != null)
			updation_time = (Long) updation_timeObj;

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

	public String getParent_id() {
		return parent_id;
	}

	public String getParent_idEx() {
		return parent_id != null ? parent_id : "";
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public void unSetParent_id() {
		this.parent_id = null;
	}

	public String getObject_type() {
		return object_type;
	}

	public String getObject_typeEx() {
		return object_type != null ? object_type : "";
	}

	public void setObject_type(String object_type) {
		this.object_type = object_type;
	}

	public void unSetObject_type() {
		this.object_type = null;
	}

	public String getType() {
		return type;
	}

	public String getTypeEx() {
		return type != null ? type : "";
	}

	public void setType(String type) {
		this.type = type;
	}

	public void unSetType() {
		this.type = null;
	}

	public String getEmail_id() {
		return email_id;
	}

	public String getEmail_idEx() {
		return email_id != null ? email_id : "";
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public void unSetEmail_id() {
		this.email_id = null;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public String getMobile_noEx() {
		return mobile_no != null ? mobile_no : "";
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public void unSetMobile_no() {
		this.mobile_no = null;
	}

	public String getStatus() {
		return status;
	}

	public String getStatusEx() {
		return status != null ? status : "";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = null;
	}

	public String getRole() {
		return role;
	}

	public String getRoleEx() {
		return role != null ? role : "";
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void unSetRole() {
		this.role = null;
	}

	public String getAddress() {
		return address;
	}

	public String getAddressEx() {
		return address != null ? address : "";
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void unSetAddress() {
		this.address = null;
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

	public String getCity() {
		return city;
	}

	public String getCityEx() {
		return city != null ? city : "";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void unSetCity() {
		this.city = null;
	}

	public String getState() {
		return state;
	}

	public String getStateEx() {
		return state != null ? state : "";
	}

	public void setState(String state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = null;
	}

	public String getCountry() {
		return country;
	}

	public String getCountryEx() {
		return country != null ? country : "";
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void unSetCountry() {
		this.country = null;
	}

	public String getZip_code() {
		return zip_code;
	}

	public String getZip_codeEx() {
		return zip_code != null ? zip_code : "";
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public void unSetZip_code() {
		this.zip_code = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Long getUpdation_time() {
		return updation_time;
	}

	public void setUpdation_time(Long updation_time) {
		this.updation_time = updation_time;
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
		return "DB_OBJECT";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}