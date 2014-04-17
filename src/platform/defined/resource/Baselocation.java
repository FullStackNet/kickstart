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
public abstract class Baselocation extends BaseResource {
	private String id = null;
	private String name = null;
	private String langitude = null;
	private String latitude = null;
	private String address = null;
	private String streat = null;
	private String area = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String pinCode = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_LANGITUDE = "langitude";
	public static String FIELD_LATITUDE = "latitude";
	public static String FIELD_ADDRESS = "address";
	public static String FIELD_STREAT = "streat";
	public static String FIELD_AREA = "area";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_PINCODE = "pinCode";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("location");

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

		Field langitudeField = new Field("langitude", "String");
		langitudeField.setLength(128);
		metaData.addField(langitudeField);

		Field latitudeField = new Field("latitude", "String");
		latitudeField.setLength(128);
		metaData.addField(latitudeField);

		Field addressField = new Field("address", "String");
		addressField.setLength(128);
		metaData.addField(addressField);

		Field streatField = new Field("streat", "String");
		streatField.setLength(128);
		metaData.addField(streatField);

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

		Field pinCodeField = new Field("pinCode", "String");
		pinCodeField.setLength(16);
		metaData.addField(pinCodeField);


		metaData.setTableName("location");

		metaData.setCluster("DB_PROFILE");
	}

	public Baselocation() {}

	public Baselocation(Baselocation obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.langitude = obj.langitude;
		this.latitude = obj.latitude;
		this.address = obj.address;
		this.streat = obj.streat;
		this.area = obj.area;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.pinCode = obj.pinCode;
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
		if(langitude != null)
			map.put("langitude", langitude);
		if(latitude != null)
			map.put("latitude", latitude);
		if(address != null)
			map.put("address", address);
		if(streat != null)
			map.put("streat", streat);
		if(area != null)
			map.put("area", area);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(pinCode != null)
			map.put("pinCode", pinCode);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(langitude != null)
			map.put("langitude", langitude);
		if(latitude != null)
			map.put("latitude", latitude);
		if(address != null)
			map.put("address", address);
		if(streat != null)
			map.put("streat", streat);
		if(area != null)
			map.put("area", area);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(pinCode != null)
			map.put("pinCode", pinCode);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		name = (String) map.get("name");
		langitude = (String) map.get("langitude");
		latitude = (String) map.get("latitude");
		address = (String) map.get("address");
		streat = (String) map.get("streat");
		area = (String) map.get("area");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		pinCode = (String) map.get("pinCode");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object langitudeObj = map.get("langitude");
		if(langitudeObj != null)
			langitude = langitudeObj.toString();

		Object latitudeObj = map.get("latitude");
		if(latitudeObj != null)
			latitude = latitudeObj.toString();

		Object addressObj = map.get("address");
		if(addressObj != null)
			address = addressObj.toString();

		Object streatObj = map.get("streat");
		if(streatObj != null)
			streat = streatObj.toString();

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

		Object pinCodeObj = map.get("pinCode");
		if(pinCodeObj != null)
			pinCode = pinCodeObj.toString();

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

	public String getStreat() {
		return streat;
	}

	public String getStreatEx() {
		return streat != null ? streat : "";
	}

	public void setStreat(String streat) {
		this.streat = streat;
	}

	public void unSetStreat() {
		this.streat = null;
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

	public String getPinCode() {
		return pinCode;
	}

	public String getPinCodeEx() {
		return pinCode != null ? pinCode : "";
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public void unSetPinCode() {
		this.pinCode = null;
	}
	public String getCluster() {
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}