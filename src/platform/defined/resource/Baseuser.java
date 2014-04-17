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
public abstract class Baseuser extends BaseResource {
	private String id = null;
	private String password = null;
	private String type = null;
	private String name = null;
	private String mobile_no = null;
	private String email_id = null;
	private String customer_id = null;
	private String state = null;
	private String fleetService = null;
	private String schoolTrackerService = null;
	private String dgService = null;
	private String key = null;

	public static String FIELD_ID = "id";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_TYPE = "type";
	public static String FIELD_NAME = "name";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_STATE = "state";
	public static String FIELD_FLEETSERVICE = "fleetService";
	public static String FIELD_SCHOOLTRACKERSERVICE = "schoolTrackerService";
	public static String FIELD_DGSERVICE = "dgService";
	public static String FIELD_KEY = "key";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("user");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field passwordField = new Field("password", "String");
		passwordField.setRequired(true);
		passwordField.setLength(32);
		metaData.addField(passwordField);

		Field typeField = new Field("type", "String");
		typeField.setRequired(true);
		typeField.setLength(32);
		metaData.addField(typeField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setIndexed(true);
		mobile_noField.setLength(128);
		metaData.addField(mobile_noField);

		Field email_idField = new Field("email_id", "String");
		email_idField.setIndexed(true);
		email_idField.setLength(128);
		metaData.addField(email_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field stateField = new Field("state", "String");
		stateField.setLength(32);
		metaData.addField(stateField);

		Field fleetServiceField = new Field("fleetService", "String");
		fleetServiceField.setLength(1);
		metaData.addField(fleetServiceField);

		Field schoolTrackerServiceField = new Field("schoolTrackerService", "String");
		schoolTrackerServiceField.setLength(1);
		metaData.addField(schoolTrackerServiceField);

		Field dgServiceField = new Field("dgService", "String");
		dgServiceField.setLength(1);
		metaData.addField(dgServiceField);

		Field keyField = new Field("key", "String");
		keyField.setLength(128);
		metaData.addField(keyField);


		metaData.setTableName("user");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseuser() {}

	public Baseuser(Baseuser obj) {
		this.id = obj.id;
		this.password = obj.password;
		this.type = obj.type;
		this.name = obj.name;
		this.mobile_no = obj.mobile_no;
		this.email_id = obj.email_id;
		this.customer_id = obj.customer_id;
		this.state = obj.state;
		this.fleetService = obj.fleetService;
		this.schoolTrackerService = obj.schoolTrackerService;
		this.dgService = obj.dgService;
		this.key = obj.key;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(password != null)
			map.put("password", password);
		if(type != null)
			map.put("type", type);
		if(name != null)
			map.put("name", name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(state != null)
			map.put("state", state);
		if(fleetService != null)
			map.put("fleetService", fleetService);
		if(schoolTrackerService != null)
			map.put("schoolTrackerService", schoolTrackerService);
		if(dgService != null)
			map.put("dgService", dgService);
		if(key != null)
			map.put("key", key);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validatePassword(add))
			map.put("password", password);
		if(validateType(add))
			map.put("type", type);
		if(name != null)
			map.put("name", name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(state != null)
			map.put("state", state);
		if(fleetService != null)
			map.put("fleetService", fleetService);
		if(schoolTrackerService != null)
			map.put("schoolTrackerService", schoolTrackerService);
		if(dgService != null)
			map.put("dgService", dgService);
		if(key != null)
			map.put("key", key);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		password = (String) map.get("password");
		type = (String) map.get("type");
		name = (String) map.get("name");
		mobile_no = (String) map.get("mobile_no");
		email_id = (String) map.get("email_id");
		customer_id = (String) map.get("customer_id");
		state = (String) map.get("state");
		fleetService = (String) map.get("fleetService");
		schoolTrackerService = (String) map.get("schoolTrackerService");
		dgService = (String) map.get("dgService");
		key = (String) map.get("key");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object passwordObj = map.get("password");
		if(passwordObj != null)
			password = passwordObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object fleetServiceObj = map.get("fleetService");
		if(fleetServiceObj != null)
			fleetService = fleetServiceObj.toString();

		Object schoolTrackerServiceObj = map.get("schoolTrackerService");
		if(schoolTrackerServiceObj != null)
			schoolTrackerService = schoolTrackerServiceObj.toString();

		Object dgServiceObj = map.get("dgService");
		if(dgServiceObj != null)
			dgService = dgServiceObj.toString();

		Object keyObj = map.get("key");
		if(keyObj != null)
			key = keyObj.toString();

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

	public boolean validateType(boolean add) throws ApplicationException {
		if(add && type == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[type]");
		return type != null;
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

	public String getFleetService() {
		return fleetService;
	}

	public String getFleetServiceEx() {
		return fleetService != null ? fleetService : "";
	}

	public void setFleetService(String fleetService) {
		this.fleetService = fleetService;
	}

	public void unSetFleetService() {
		this.fleetService = null;
	}

	public String getSchoolTrackerService() {
		return schoolTrackerService;
	}

	public String getSchoolTrackerServiceEx() {
		return schoolTrackerService != null ? schoolTrackerService : "";
	}

	public void setSchoolTrackerService(String schoolTrackerService) {
		this.schoolTrackerService = schoolTrackerService;
	}

	public void unSetSchoolTrackerService() {
		this.schoolTrackerService = null;
	}

	public String getDgService() {
		return dgService;
	}

	public String getDgServiceEx() {
		return dgService != null ? dgService : "";
	}

	public void setDgService(String dgService) {
		this.dgService = dgService;
	}

	public void unSetDgService() {
		this.dgService = null;
	}

	public String getKey() {
		return key;
	}

	public String getKeyEx() {
		return key != null ? key : "";
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void unSetKey() {
		this.key = null;
	}
	public String getCluster() {
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}