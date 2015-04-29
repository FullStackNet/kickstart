/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.game.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baselog_money_load extends BaseResource {
	private String id = null;
	private String user_id = null;
	private String user_name = null;
	private String customer_id = null;
	private String location_id = null;
	private String location_name = null;
	private String appliance_id = null;
	private String appliance_name = null;
	private String controller_id = null;
	private String rf_id = null;
	private String event_date_str = null;
	private Long event_date = null;
	private Double amount = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_LOCATION_ID = "location_id";
	public static String FIELD_LOCATION_NAME = "location_name";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_APPLIANCE_NAME = "appliance_name";
	public static String FIELD_CONTROLLER_ID = "controller_id";
	public static String FIELD_RF_ID = "rf_id";
	public static String FIELD_EVENT_DATE_STR = "event_date_str";
	public static String FIELD_EVENT_DATE = "event_date";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("log_money_load");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(128);
		metaData.addField(user_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field location_idField = new Field("location_id", "String");
		location_idField.setLength(128);
		metaData.addField(location_idField);

		Field location_nameField = new Field("location_name", "String");
		location_nameField.setLength(128);
		metaData.addField(location_nameField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field appliance_nameField = new Field("appliance_name", "String");
		appliance_nameField.setLength(128);
		metaData.addField(appliance_nameField);

		Field controller_idField = new Field("controller_id", "String");
		controller_idField.setLength(128);
		metaData.addField(controller_idField);

		Field rf_idField = new Field("rf_id", "String");
		rf_idField.setLength(128);
		metaData.addField(rf_idField);

		Field event_date_strField = new Field("event_date_str", "String");
		event_date_strField.setLength(128);
		metaData.addField(event_date_strField);

		Field event_dateField = new Field("event_date", "long");
		metaData.addField(event_dateField);

		Field amountField = new Field("amount", "double");
		metaData.addField(amountField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("log_money_load");

		metaData.setCluster("DB_LOG");
	}

	public Baselog_money_load() {}

	public Baselog_money_load(Baselog_money_load obj) {
		this.id = obj.id;
		this.user_id = obj.user_id;
		this.user_name = obj.user_name;
		this.customer_id = obj.customer_id;
		this.location_id = obj.location_id;
		this.location_name = obj.location_name;
		this.appliance_id = obj.appliance_id;
		this.appliance_name = obj.appliance_name;
		this.controller_id = obj.controller_id;
		this.rf_id = obj.rf_id;
		this.event_date_str = obj.event_date_str;
		this.event_date = obj.event_date;
		this.amount = obj.amount;
		this.creation_time = obj.creation_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(location_id != null)
			map.put("location_id", location_id);
		if(location_name != null)
			map.put("location_name", location_name);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(appliance_name != null)
			map.put("appliance_name", appliance_name);
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(rf_id != null)
			map.put("rf_id", rf_id);
		if(event_date_str != null)
			map.put("event_date_str", event_date_str);
		if(event_date != null)
			map.put("event_date", event_date);
		if(amount != null)
			map.put("amount", amount);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(location_id != null)
			map.put("location_id", location_id);
		if(location_name != null)
			map.put("location_name", location_name);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(appliance_name != null)
			map.put("appliance_name", appliance_name);
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(rf_id != null)
			map.put("rf_id", rf_id);
		if(event_date_str != null)
			map.put("event_date_str", event_date_str);
		if(event_date != null)
			map.put("event_date", event_date);
		if(amount != null)
			map.put("amount", amount);
		if(creation_time != null)
			map.put("creation_time", creation_time);
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
		user_id = (String) map.get("user_id");
		user_name = (String) map.get("user_name");
		customer_id = (String) map.get("customer_id");
		location_id = (String) map.get("location_id");
		location_name = (String) map.get("location_name");
		appliance_id = (String) map.get("appliance_id");
		appliance_name = (String) map.get("appliance_name");
		controller_id = (String) map.get("controller_id");
		rf_id = (String) map.get("rf_id");
		event_date_str = (String) map.get("event_date_str");
		event_date = (Long) map.get("event_date");
		amount = (Double) map.get("amount");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object location_idObj = map.get("location_id");
		if(location_idObj != null)
			location_id = location_idObj.toString();

		Object location_nameObj = map.get("location_name");
		if(location_nameObj != null)
			location_name = location_nameObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object appliance_nameObj = map.get("appliance_name");
		if(appliance_nameObj != null)
			appliance_name = appliance_nameObj.toString();

		Object controller_idObj = map.get("controller_id");
		if(controller_idObj != null)
			controller_id = controller_idObj.toString();

		Object rf_idObj = map.get("rf_id");
		if(rf_idObj != null)
			rf_id = rf_idObj.toString();

		Object event_date_strObj = map.get("event_date_str");
		if(event_date_strObj != null)
			event_date_str = event_date_strObj.toString();

		Object event_dateObj = map.get("event_date");
		if(event_dateObj != null)
			event_date = new Long(event_dateObj.toString());

		Object amountObj = map.get("amount");
		if(amountObj != null)
			amount = new Double(amountObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

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

	public String getUser_name() {
		return user_name;
	}

	public String getUser_nameEx() {
		return user_name != null ? user_name : "";
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void unSetUser_name() {
		this.user_name = null;
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

	public String getLocation_id() {
		return location_id;
	}

	public String getLocation_idEx() {
		return location_id != null ? location_id : "";
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public void unSetLocation_id() {
		this.location_id = null;
	}

	public String getLocation_name() {
		return location_name;
	}

	public String getLocation_nameEx() {
		return location_name != null ? location_name : "";
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public void unSetLocation_name() {
		this.location_name = null;
	}

	public String getAppliance_id() {
		return appliance_id;
	}

	public String getAppliance_idEx() {
		return appliance_id != null ? appliance_id : "";
	}

	public void setAppliance_id(String appliance_id) {
		this.appliance_id = appliance_id;
	}

	public void unSetAppliance_id() {
		this.appliance_id = null;
	}

	public String getAppliance_name() {
		return appliance_name;
	}

	public String getAppliance_nameEx() {
		return appliance_name != null ? appliance_name : "";
	}

	public void setAppliance_name(String appliance_name) {
		this.appliance_name = appliance_name;
	}

	public void unSetAppliance_name() {
		this.appliance_name = null;
	}

	public String getController_id() {
		return controller_id;
	}

	public String getController_idEx() {
		return controller_id != null ? controller_id : "";
	}

	public void setController_id(String controller_id) {
		this.controller_id = controller_id;
	}

	public void unSetController_id() {
		this.controller_id = null;
	}

	public String getRf_id() {
		return rf_id;
	}

	public String getRf_idEx() {
		return rf_id != null ? rf_id : "";
	}

	public void setRf_id(String rf_id) {
		this.rf_id = rf_id;
	}

	public void unSetRf_id() {
		this.rf_id = null;
	}

	public String getEvent_date_str() {
		return event_date_str;
	}

	public String getEvent_date_strEx() {
		return event_date_str != null ? event_date_str : "";
	}

	public void setEvent_date_str(String event_date_str) {
		this.event_date_str = event_date_str;
	}

	public void unSetEvent_date_str() {
		this.event_date_str = null;
	}

	public Long getEvent_date() {
		return event_date;
	}

	public long getEvent_dateEx() {
		return event_date != null ? event_date : 0L;
	}

	public void setEvent_date(long event_date) {
		this.event_date = event_date;
	}

	public void setEvent_date(Long event_date) {
		this.event_date = event_date;
	}

	public void unSetEvent_date() {
		this.event_date = null;
	}

	public Double getAmount() {
		return amount;
	}

	public double getAmountEx() {
		return amount != null ? amount : 0;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void unSetAmount() {
		this.amount = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
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