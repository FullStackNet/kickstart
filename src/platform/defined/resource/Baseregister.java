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
public abstract class Baseregister extends BaseResource {
	private String first_name = null;
	private String last_name = null;
	private String email_id = null;
	private String password = null;
	private String mobile_no = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String pincode = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_FIRST_NAME = "first_name";
	public static String FIELD_LAST_NAME = "last_name";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_PINCODE = "pincode";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("register");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field first_nameField = new Field("first_name", "String");
		first_nameField.setRequired(true);
		first_nameField.setLength(64);
		metaData.addField(first_nameField);

		Field last_nameField = new Field("last_name", "String");
		last_nameField.setRequired(true);
		last_nameField.setLength(64);
		metaData.addField(last_nameField);

		Field email_idField = new Field("email_id", "String");
		email_idField.setRequired(true);
		email_idField.setLength(128);
		metaData.addField(email_idField);

		Field passwordField = new Field("password", "String");
		passwordField.setRequired(true);
		passwordField.setLength(16);
		metaData.addField(passwordField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setRequired(true);
		mobile_noField.setLength(16);
		metaData.addField(mobile_noField);

		Field cityField = new Field("city", "String");
		cityField.setLength(32);
		metaData.addField(cityField);

		Field stateField = new Field("state", "String");
		stateField.setLength(32);
		metaData.addField(stateField);

		Field countryField = new Field("country", "String");
		countryField.setLength(32);
		metaData.addField(countryField);

		Field pincodeField = new Field("pincode", "String");
		pincodeField.setLength(12);
		metaData.addField(pincodeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("register");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseregister() {}

	public Baseregister(Baseregister obj) {
		this.first_name = obj.first_name;
		this.last_name = obj.last_name;
		this.email_id = obj.email_id;
		this.password = obj.password;
		this.mobile_no = obj.mobile_no;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.pincode = obj.pincode;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(first_name != null)
			map.put("first_name", first_name);
		if(last_name != null)
			map.put("last_name", last_name);
		if(email_id != null)
			map.put("email_id", email_id);
		if(password != null)
			map.put("password", password);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(pincode != null)
			map.put("pincode", pincode);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateFirst_name(add))
			map.put("first_name", first_name);
		if(validateLast_name(add))
			map.put("last_name", last_name);
		if(validateEmail_id(add))
			map.put("email_id", email_id);
		if(validatePassword(add))
			map.put("password", password);
		if(validateMobile_no(add))
			map.put("mobile_no", mobile_no);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(pincode != null)
			map.put("pincode", pincode);
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
		first_name = (String) map.get("first_name");
		last_name = (String) map.get("last_name");
		email_id = (String) map.get("email_id");
		password = (String) map.get("password");
		mobile_no = (String) map.get("mobile_no");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		pincode = (String) map.get("pincode");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object first_nameObj = map.get("first_name");
		if(first_nameObj != null)
			first_name = first_nameObj.toString();

		Object last_nameObj = map.get("last_name");
		if(last_nameObj != null)
			last_name = last_nameObj.toString();

		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object passwordObj = map.get("password");
		if(passwordObj != null)
			password = passwordObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object cityObj = map.get("city");
		if(cityObj != null)
			city = cityObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object countryObj = map.get("country");
		if(countryObj != null)
			country = countryObj.toString();

		Object pincodeObj = map.get("pincode");
		if(pincodeObj != null)
			pincode = pincodeObj.toString();

		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	public void convertPrimaryMapToResource(Map<String, Object> map) {
	}

	public void convertTypeUnsafePrimaryMapToResource(Map<String, Object> map) {
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getFirst_nameEx() {
		return first_name != null ? first_name : "";
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void unSetFirst_name() {
		this.first_name = null;
	}

	public boolean validateFirst_name(boolean add) throws ApplicationException {
		if(add && first_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[first_name]");
		return first_name != null;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getLast_nameEx() {
		return last_name != null ? last_name : "";
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void unSetLast_name() {
		this.last_name = null;
	}

	public boolean validateLast_name(boolean add) throws ApplicationException {
		if(add && last_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[last_name]");
		return last_name != null;
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

	public boolean validateEmail_id(boolean add) throws ApplicationException {
		if(add && email_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[email_id]");
		return email_id != null;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordEx() {
		return password != null ? password : "";
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void unSetPassword() {
		this.password = null;
	}

	public boolean validatePassword(boolean add) throws ApplicationException {
		if(add && password == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[password]");
		return password != null;
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

	public boolean validateMobile_no(boolean add) throws ApplicationException {
		if(add && mobile_no == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[mobile_no]");
		return mobile_no != null;
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

	public String getPincode() {
		return pincode;
	}

	public String getPincodeEx() {
		return pincode != null ? pincode : "";
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public void unSetPincode() {
		this.pincode = null;
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