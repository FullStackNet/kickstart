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
public abstract class Basealert extends BaseResource {
	private String id = null;
	private String device_id = null;
	private String gateway_id = null;
	private String controller_id = null;
	private Integer controller_port = null;
	private String device_type = null;
	private String device_name = null;
	private String site_id = null;
	private String site_name = null;
	private String applinace_name = null;
	private String applinace_id = null;
	private String alert_id = null;
	private Map<String, Object> alert_data = null;
	private Long alert_time = null;
	private String status = null;
	private Integer state = null;
	private String alert_state = null;
	private String alert_cleared_type = null;
	private Long alarm_cleared_time = null;
	private Integer severity = null;
	private String partner_id = null;
	private String customer_id = null;
	private String tanent_id = null;
	private String asset_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_DEVICE_ID = "device_id";
	public static String FIELD_GATEWAY_ID = "gateway_id";
	public static String FIELD_CONTROLLER_ID = "controller_id";
	public static String FIELD_CONTROLLER_PORT = "controller_port";
	public static String FIELD_DEVICE_TYPE = "device_type";
	public static String FIELD_DEVICE_NAME = "device_name";
	public static String FIELD_SITE_ID = "site_id";
	public static String FIELD_SITE_NAME = "site_name";
	public static String FIELD_APPLINACE_NAME = "applinace_name";
	public static String FIELD_APPLINACE_ID = "applinace_id";
	public static String FIELD_ALERT_ID = "alert_id";
	public static String FIELD_ALERT_DATA = "alert_data";
	public static String FIELD_ALERT_TIME = "alert_time";
	public static String FIELD_STATUS = "status";
	public static String FIELD_STATE = "state";
	public static String FIELD_ALERT_STATE = "alert_state";
	public static String FIELD_ALERT_CLEARED_TYPE = "alert_cleared_type";
	public static String FIELD_ALARM_CLEARED_TIME = "alarm_cleared_time";
	public static String FIELD_SEVERITY = "severity";
	public static String FIELD_PARTNER_ID = "partner_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_TANENT_ID = "tanent_id";
	public static String FIELD_ASSET_ID = "asset_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("alert");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field device_idField = new Field("device_id", "String");
		device_idField.setLength(128);
		metaData.addField(device_idField);

		Field gateway_idField = new Field("gateway_id", "String");
		gateway_idField.setLength(128);
		metaData.addField(gateway_idField);

		Field controller_idField = new Field("controller_id", "String");
		controller_idField.setLength(128);
		metaData.addField(controller_idField);

		Field controller_portField = new Field("controller_port", "int");
		metaData.addField(controller_portField);

		Field device_typeField = new Field("device_type", "String");
		device_typeField.setLength(32);
		metaData.addField(device_typeField);

		Field device_nameField = new Field("device_name", "String");
		device_nameField.setLength(128);
		metaData.addField(device_nameField);

		Field site_idField = new Field("site_id", "String");
		site_idField.setLength(128);
		metaData.addField(site_idField);

		Field site_nameField = new Field("site_name", "String");
		site_nameField.setLength(128);
		metaData.addField(site_nameField);

		Field applinace_nameField = new Field("applinace_name", "String");
		applinace_nameField.setLength(128);
		metaData.addField(applinace_nameField);

		Field applinace_idField = new Field("applinace_id", "String");
		applinace_idField.setLength(128);
		metaData.addField(applinace_idField);

		Field alert_idField = new Field("alert_id", "String");
		alert_idField.setLength(128);
		metaData.addField(alert_idField);

		Field alert_dataField = new Field("alert_data", "Map");
		alert_dataField.setValueType("Object");
		metaData.addField(alert_dataField);

		Field alert_timeField = new Field("alert_time", "timestamp");
		alert_timeField.setRequired(true);
		alert_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(alert_timeField);

		Field statusField = new Field("status", "String");
		statusField.setLength(32);
		metaData.addField(statusField);

		Field stateField = new Field("state", "int");
		stateField.setLength(1);
		metaData.addField(stateField);

		Field alert_stateField = new Field("alert_state", "String");
		alert_stateField.setDefaultValue("P");
		alert_stateField.setLength(1);
		metaData.addField(alert_stateField);

		Field alert_cleared_typeField = new Field("alert_cleared_type", "String");
		alert_cleared_typeField.setLength(1);
		metaData.addField(alert_cleared_typeField);

		Field alarm_cleared_timeField = new Field("alarm_cleared_time", "timestamp");
		alarm_cleared_timeField.setLength(1);
		metaData.addField(alarm_cleared_timeField);

		Field severityField = new Field("severity", "int");
		metaData.addField(severityField);

		Field partner_idField = new Field("partner_id", "String");
		partner_idField.setLength(128);
		metaData.addField(partner_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field tanent_idField = new Field("tanent_id", "String");
		tanent_idField.setLength(128);
		metaData.addField(tanent_idField);

		Field asset_idField = new Field("asset_id", "String");
		asset_idField.setLength(128);
		metaData.addField(asset_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("alert");

		metaData.setCluster("DB_ALERT");
	}

	public Basealert() {}

	public Basealert(Basealert obj) {
		this.id = obj.id;
		this.device_id = obj.device_id;
		this.gateway_id = obj.gateway_id;
		this.controller_id = obj.controller_id;
		this.controller_port = obj.controller_port;
		this.device_type = obj.device_type;
		this.device_name = obj.device_name;
		this.site_id = obj.site_id;
		this.site_name = obj.site_name;
		this.applinace_name = obj.applinace_name;
		this.applinace_id = obj.applinace_id;
		this.alert_id = obj.alert_id;
		this.alert_data = obj.alert_data;
		this.alert_time = obj.alert_time;
		this.status = obj.status;
		this.state = obj.state;
		this.alert_state = obj.alert_state;
		this.alert_cleared_type = obj.alert_cleared_type;
		this.alarm_cleared_time = obj.alarm_cleared_time;
		this.severity = obj.severity;
		this.partner_id = obj.partner_id;
		this.customer_id = obj.customer_id;
		this.tanent_id = obj.tanent_id;
		this.asset_id = obj.asset_id;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(alert_state == null)
			alert_state = "P";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(device_id != null)
			map.put("device_id", device_id);
		if(gateway_id != null)
			map.put("gateway_id", gateway_id);
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(controller_port != null)
			map.put("controller_port", controller_port);
		if(device_type != null)
			map.put("device_type", device_type);
		if(device_name != null)
			map.put("device_name", device_name);
		if(site_id != null)
			map.put("site_id", site_id);
		if(site_name != null)
			map.put("site_name", site_name);
		if(applinace_name != null)
			map.put("applinace_name", applinace_name);
		if(applinace_id != null)
			map.put("applinace_id", applinace_id);
		if(alert_id != null)
			map.put("alert_id", alert_id);
		if(alert_data != null)
			map.put("alert_data", alert_data);
		if(alert_time != null)
			map.put("alert_time", alert_time);
		if(status != null)
			map.put("status", status);
		if(state != null)
			map.put("state", state);
		if(alert_state != null)
			map.put("alert_state", alert_state);
		if(alert_cleared_type != null)
			map.put("alert_cleared_type", alert_cleared_type);
		if(alarm_cleared_time != null)
			map.put("alarm_cleared_time", alarm_cleared_time);
		if(severity != null)
			map.put("severity", severity);
		if(partner_id != null)
			map.put("partner_id", partner_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(tanent_id != null)
			map.put("tanent_id", tanent_id);
		if(asset_id != null)
			map.put("asset_id", asset_id);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		if(add)
			setDefaultValues();

		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(device_id != null)
			map.put("device_id", device_id);
		if(gateway_id != null)
			map.put("gateway_id", gateway_id);
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(controller_port != null)
			map.put("controller_port", controller_port);
		if(device_type != null)
			map.put("device_type", device_type);
		if(device_name != null)
			map.put("device_name", device_name);
		if(site_id != null)
			map.put("site_id", site_id);
		if(site_name != null)
			map.put("site_name", site_name);
		if(applinace_name != null)
			map.put("applinace_name", applinace_name);
		if(applinace_id != null)
			map.put("applinace_id", applinace_id);
		if(alert_id != null)
			map.put("alert_id", alert_id);
		if(alert_data != null)
			map.put("alert_data", alert_data);
		if(validateAlert_time(add))
			map.put("alert_time", alert_time);
		if(status != null)
			map.put("status", status);
		if(state != null)
			map.put("state", state);
		if(alert_state != null)
			map.put("alert_state", alert_state);
		if(alert_cleared_type != null)
			map.put("alert_cleared_type", alert_cleared_type);
		if(alarm_cleared_time != null)
			map.put("alarm_cleared_time", alarm_cleared_time);
		if(severity != null)
			map.put("severity", severity);
		if(partner_id != null)
			map.put("partner_id", partner_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(tanent_id != null)
			map.put("tanent_id", tanent_id);
		if(asset_id != null)
			map.put("asset_id", asset_id);
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
		device_id = (String) map.get("device_id");
		gateway_id = (String) map.get("gateway_id");
		controller_id = (String) map.get("controller_id");
		controller_port = (Integer) map.get("controller_port");
		device_type = (String) map.get("device_type");
		device_name = (String) map.get("device_name");
		site_id = (String) map.get("site_id");
		site_name = (String) map.get("site_name");
		applinace_name = (String) map.get("applinace_name");
		applinace_id = (String) map.get("applinace_id");
		alert_id = (String) map.get("alert_id");
		alert_data = (Map<String, Object>) map.get("alert_data");
		alert_time = (Long) map.get("alert_time");
		status = (String) map.get("status");
		state = (Integer) map.get("state");
		alert_state = (String) map.get("alert_state");
		alert_cleared_type = (String) map.get("alert_cleared_type");
		alarm_cleared_time = (Long) map.get("alarm_cleared_time");
		severity = (Integer) map.get("severity");
		partner_id = (String) map.get("partner_id");
		customer_id = (String) map.get("customer_id");
		tanent_id = (String) map.get("tanent_id");
		asset_id = (String) map.get("asset_id");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object device_idObj = map.get("device_id");
		if(device_idObj != null)
			device_id = device_idObj.toString();

		Object gateway_idObj = map.get("gateway_id");
		if(gateway_idObj != null)
			gateway_id = gateway_idObj.toString();

		Object controller_idObj = map.get("controller_id");
		if(controller_idObj != null)
			controller_id = controller_idObj.toString();

		Object controller_portObj = map.get("controller_port");
		if(controller_portObj != null)
			controller_port = new Integer(controller_portObj.toString());

		Object device_typeObj = map.get("device_type");
		if(device_typeObj != null)
			device_type = device_typeObj.toString();

		Object device_nameObj = map.get("device_name");
		if(device_nameObj != null)
			device_name = device_nameObj.toString();

		Object site_idObj = map.get("site_id");
		if(site_idObj != null)
			site_id = site_idObj.toString();

		Object site_nameObj = map.get("site_name");
		if(site_nameObj != null)
			site_name = site_nameObj.toString();

		Object applinace_nameObj = map.get("applinace_name");
		if(applinace_nameObj != null)
			applinace_name = applinace_nameObj.toString();

		Object applinace_idObj = map.get("applinace_id");
		if(applinace_idObj != null)
			applinace_id = applinace_idObj.toString();

		Object alert_idObj = map.get("alert_id");
		if(alert_idObj != null)
			alert_id = alert_idObj.toString();

		alert_data = (Map<String, Object>) map.get("alert_data");
		Object alert_timeObj = map.get("alert_time");
		if(alert_timeObj != null)
			alert_time = new Long(alert_timeObj.toString());

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = new Integer(stateObj.toString());

		Object alert_stateObj = map.get("alert_state");
		if(alert_stateObj != null)
			alert_state = alert_stateObj.toString();

		Object alert_cleared_typeObj = map.get("alert_cleared_type");
		if(alert_cleared_typeObj != null)
			alert_cleared_type = alert_cleared_typeObj.toString();

		Object alarm_cleared_timeObj = map.get("alarm_cleared_time");
		if(alarm_cleared_timeObj != null)
			alarm_cleared_time = new Long(alarm_cleared_timeObj.toString());

		Object severityObj = map.get("severity");
		if(severityObj != null)
			severity = new Integer(severityObj.toString());

		Object partner_idObj = map.get("partner_id");
		if(partner_idObj != null)
			partner_id = partner_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object tanent_idObj = map.get("tanent_id");
		if(tanent_idObj != null)
			tanent_id = tanent_idObj.toString();

		Object asset_idObj = map.get("asset_id");
		if(asset_idObj != null)
			asset_id = asset_idObj.toString();

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

	public String getDevice_id() {
		return device_id;
	}

	public String getDevice_idEx() {
		return device_id != null ? device_id : "";
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	public void unSetDevice_id() {
		this.device_id = null;
	}

	public String getGateway_id() {
		return gateway_id;
	}

	public String getGateway_idEx() {
		return gateway_id != null ? gateway_id : "";
	}

	public void setGateway_id(String gateway_id) {
		this.gateway_id = gateway_id;
	}

	public void unSetGateway_id() {
		this.gateway_id = null;
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

	public Integer getController_port() {
		return controller_port;
	}

	public int getController_portEx() {
		return controller_port != null ? controller_port : 0;
	}

	public void setController_port(int controller_port) {
		this.controller_port = controller_port;
	}

	public void setController_port(Integer controller_port) {
		this.controller_port = controller_port;
	}

	public void unSetController_port() {
		this.controller_port = null;
	}

	public String getDevice_type() {
		return device_type;
	}

	public String getDevice_typeEx() {
		return device_type != null ? device_type : "";
	}

	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}

	public void unSetDevice_type() {
		this.device_type = null;
	}

	public String getDevice_name() {
		return device_name;
	}

	public String getDevice_nameEx() {
		return device_name != null ? device_name : "";
	}

	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}

	public void unSetDevice_name() {
		this.device_name = null;
	}

	public String getSite_id() {
		return site_id;
	}

	public String getSite_idEx() {
		return site_id != null ? site_id : "";
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public void unSetSite_id() {
		this.site_id = null;
	}

	public String getSite_name() {
		return site_name;
	}

	public String getSite_nameEx() {
		return site_name != null ? site_name : "";
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public void unSetSite_name() {
		this.site_name = null;
	}

	public String getApplinace_name() {
		return applinace_name;
	}

	public String getApplinace_nameEx() {
		return applinace_name != null ? applinace_name : "";
	}

	public void setApplinace_name(String applinace_name) {
		this.applinace_name = applinace_name;
	}

	public void unSetApplinace_name() {
		this.applinace_name = null;
	}

	public String getApplinace_id() {
		return applinace_id;
	}

	public String getApplinace_idEx() {
		return applinace_id != null ? applinace_id : "";
	}

	public void setApplinace_id(String applinace_id) {
		this.applinace_id = applinace_id;
	}

	public void unSetApplinace_id() {
		this.applinace_id = null;
	}

	public String getAlert_id() {
		return alert_id;
	}

	public String getAlert_idEx() {
		return alert_id != null ? alert_id : "";
	}

	public void setAlert_id(String alert_id) {
		this.alert_id = alert_id;
	}

	public void unSetAlert_id() {
		this.alert_id = null;
	}

	public Map<String, Object> getAlert_data() {
		return alert_data;
	}

	public Object getAlert_data(String key) {
		return alert_data == null ? null : alert_data.get(key);
	}

	public void setAlert_data(Map<String, Object> alert_data) {
		this.alert_data = alert_data;
	}

	public void setAlert_data(String key, Object value) {
		if(alert_data == null)
			alert_data = new HashMap<String, Object>();
		alert_data.put(key, value);
	}

	public void unSetAlert_data() {
		this.alert_data = null;
	}

	public Long getAlert_time() {
		return alert_time;
	}

	public void setAlert_time(Long alert_time) {
		this.alert_time = alert_time;
	}


	public boolean validateAlert_time(boolean add) throws ApplicationException {
		if(add && alert_time == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[alert_time]");
		return alert_time != null;
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

	public Integer getState() {
		return state;
	}

	public int getStateEx() {
		return state != null ? state : 0;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = null;
	}

	public String getAlert_state() {
		return alert_state != null ? alert_state : "P";
	}

	public void setAlert_state(String alert_state) {
		this.alert_state = alert_state;
	}

	public void unSetAlert_state() {
		this.alert_state = "P";
	}

	public String getAlert_cleared_type() {
		return alert_cleared_type;
	}

	public String getAlert_cleared_typeEx() {
		return alert_cleared_type != null ? alert_cleared_type : "";
	}

	public void setAlert_cleared_type(String alert_cleared_type) {
		this.alert_cleared_type = alert_cleared_type;
	}

	public void unSetAlert_cleared_type() {
		this.alert_cleared_type = null;
	}

	public Long getAlarm_cleared_time() {
		return alarm_cleared_time;
	}

	public void setAlarm_cleared_time(Long alarm_cleared_time) {
		this.alarm_cleared_time = alarm_cleared_time;
	}


	public Integer getSeverity() {
		return severity;
	}

	public int getSeverityEx() {
		return severity != null ? severity : 0;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	public void setSeverity(Integer severity) {
		this.severity = severity;
	}

	public void unSetSeverity() {
		this.severity = null;
	}

	public String getPartner_id() {
		return partner_id;
	}

	public String getPartner_idEx() {
		return partner_id != null ? partner_id : "";
	}

	public void setPartner_id(String partner_id) {
		this.partner_id = partner_id;
	}

	public void unSetPartner_id() {
		this.partner_id = null;
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

	public String getTanent_id() {
		return tanent_id;
	}

	public String getTanent_idEx() {
		return tanent_id != null ? tanent_id : "";
	}

	public void setTanent_id(String tanent_id) {
		this.tanent_id = tanent_id;
	}

	public void unSetTanent_id() {
		this.tanent_id = null;
	}

	public String getAsset_id() {
		return asset_id;
	}

	public String getAsset_idEx() {
		return asset_id != null ? asset_id : "";
	}

	public void setAsset_id(String asset_id) {
		this.asset_id = asset_id;
	}

	public void unSetAsset_id() {
		this.asset_id = null;
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
		return "DB_ALERT";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}