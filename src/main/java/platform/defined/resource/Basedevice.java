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
public abstract class Basedevice extends BaseResource {
	private String id = null;
	private String name = null;
	private String type = null;
	private String vendor_device_id = null;
	private String imie_no = null;
	private String vendor_id = null;
	private String model = null;
	private String manager = null;
	private String firmware_major_version = null;
	private String firmware_minor_version = null;
	private String state = null;
	private String customer_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TYPE = "type";
	public static String FIELD_VENDOR_DEVICE_ID = "vendor_device_id";
	public static String FIELD_IMIE_NO = "imie_no";
	public static String FIELD_VENDOR_ID = "vendor_id";
	public static String FIELD_MODEL = "model";
	public static String FIELD_MANAGER = "manager";
	public static String FIELD_FIRMWARE_MAJOR_VERSION = "firmware_major_version";
	public static String FIELD_FIRMWARE_MINOR_VERSION = "firmware_minor_version";
	public static String FIELD_STATE = "state";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("device");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setRequired(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field typeField = new Field("type", "String");
		typeField.setRequired(true);
		typeField.setLength(32);
		metaData.addField(typeField);

		Field vendor_device_idField = new Field("vendor_device_id", "String");
		vendor_device_idField.setRequired(true);
		vendor_device_idField.setLength(128);
		metaData.addField(vendor_device_idField);

		Field imie_noField = new Field("imie_no", "String");
		imie_noField.setRequired(true);
		imie_noField.setLength(32);
		metaData.addField(imie_noField);

		Field vendor_idField = new Field("vendor_id", "String");
		vendor_idField.setRequired(true);
		vendor_idField.setLength(128);
		metaData.addField(vendor_idField);

		Field modelField = new Field("model", "String");
		modelField.setRequired(true);
		modelField.setLength(128);
		metaData.addField(modelField);

		Field managerField = new Field("manager", "String");
		managerField.setRequired(true);
		managerField.setLength(128);
		metaData.addField(managerField);

		Field firmware_major_versionField = new Field("firmware_major_version", "String");
		firmware_major_versionField.setLength(10);
		metaData.addField(firmware_major_versionField);

		Field firmware_minor_versionField = new Field("firmware_minor_version", "String");
		firmware_minor_versionField.setLength(10);
		metaData.addField(firmware_minor_versionField);

		Field stateField = new Field("state", "String");
		stateField.setDefaultValue("IN-STORE");
		stateField.setLength(32);
		metaData.addField(stateField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(32);
		metaData.addField(customer_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("device");

		metaData.setCluster("DB_DEVICE");
	}

	public Basedevice() {}

	public Basedevice(Basedevice obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.type = obj.type;
		this.vendor_device_id = obj.vendor_device_id;
		this.imie_no = obj.imie_no;
		this.vendor_id = obj.vendor_id;
		this.model = obj.model;
		this.manager = obj.manager;
		this.firmware_major_version = obj.firmware_major_version;
		this.firmware_minor_version = obj.firmware_minor_version;
		this.state = obj.state;
		this.customer_id = obj.customer_id;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(state == null)
			state = "IN-STORE";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(vendor_device_id != null)
			map.put("vendor_device_id", vendor_device_id);
		if(imie_no != null)
			map.put("imie_no", imie_no);
		if(vendor_id != null)
			map.put("vendor_id", vendor_id);
		if(model != null)
			map.put("model", model);
		if(manager != null)
			map.put("manager", manager);
		if(firmware_major_version != null)
			map.put("firmware_major_version", firmware_major_version);
		if(firmware_minor_version != null)
			map.put("firmware_minor_version", firmware_minor_version);
		if(state != null)
			map.put("state", state);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		if(validateName(add))
			map.put("name", name);
		if(validateType(add))
			map.put("type", type);
		if(validateVendor_device_id(add))
			map.put("vendor_device_id", vendor_device_id);
		if(validateImie_no(add))
			map.put("imie_no", imie_no);
		if(validateVendor_id(add))
			map.put("vendor_id", vendor_id);
		if(validateModel(add))
			map.put("model", model);
		if(validateManager(add))
			map.put("manager", manager);
		if(firmware_major_version != null)
			map.put("firmware_major_version", firmware_major_version);
		if(firmware_minor_version != null)
			map.put("firmware_minor_version", firmware_minor_version);
		if(state != null)
			map.put("state", state);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		type = (String) map.get("type");
		vendor_device_id = (String) map.get("vendor_device_id");
		imie_no = (String) map.get("imie_no");
		vendor_id = (String) map.get("vendor_id");
		model = (String) map.get("model");
		manager = (String) map.get("manager");
		firmware_major_version = (String) map.get("firmware_major_version");
		firmware_minor_version = (String) map.get("firmware_minor_version");
		state = (String) map.get("state");
		customer_id = (String) map.get("customer_id");
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

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object vendor_device_idObj = map.get("vendor_device_id");
		if(vendor_device_idObj != null)
			vendor_device_id = vendor_device_idObj.toString();

		Object imie_noObj = map.get("imie_no");
		if(imie_noObj != null)
			imie_no = imie_noObj.toString();

		Object vendor_idObj = map.get("vendor_id");
		if(vendor_idObj != null)
			vendor_id = vendor_idObj.toString();

		Object modelObj = map.get("model");
		if(modelObj != null)
			model = modelObj.toString();

		Object managerObj = map.get("manager");
		if(managerObj != null)
			manager = managerObj.toString();

		Object firmware_major_versionObj = map.get("firmware_major_version");
		if(firmware_major_versionObj != null)
			firmware_major_version = firmware_major_versionObj.toString();

		Object firmware_minor_versionObj = map.get("firmware_minor_version");
		if(firmware_minor_versionObj != null)
			firmware_minor_version = firmware_minor_versionObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

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

	public boolean validateName(boolean add) throws ApplicationException {
		if(add && name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[name]");
		return name != null;
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

	public String getVendor_device_id() {
		return vendor_device_id;
	}

	public String getVendor_device_idEx() {
		return vendor_device_id != null ? vendor_device_id : "";
	}

	public void setVendor_device_id(String vendor_device_id) {
		this.vendor_device_id = vendor_device_id;
	}

	public void unSetVendor_device_id() {
		this.vendor_device_id = null;
	}

	public boolean validateVendor_device_id(boolean add) throws ApplicationException {
		if(add && vendor_device_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[vendor_device_id]");
		return vendor_device_id != null;
	}

	public String getImie_no() {
		return imie_no;
	}

	public String getImie_noEx() {
		return imie_no != null ? imie_no : "";
	}

	public void setImie_no(String imie_no) {
		this.imie_no = imie_no;
	}

	public void unSetImie_no() {
		this.imie_no = null;
	}

	public boolean validateImie_no(boolean add) throws ApplicationException {
		if(add && imie_no == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[imie_no]");
		return imie_no != null;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public String getVendor_idEx() {
		return vendor_id != null ? vendor_id : "";
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public void unSetVendor_id() {
		this.vendor_id = null;
	}

	public boolean validateVendor_id(boolean add) throws ApplicationException {
		if(add && vendor_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[vendor_id]");
		return vendor_id != null;
	}

	public String getModel() {
		return model;
	}

	public String getModelEx() {
		return model != null ? model : "";
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void unSetModel() {
		this.model = null;
	}

	public boolean validateModel(boolean add) throws ApplicationException {
		if(add && model == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[model]");
		return model != null;
	}

	public String getManager() {
		return manager;
	}

	public String getManagerEx() {
		return manager != null ? manager : "";
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public void unSetManager() {
		this.manager = null;
	}

	public boolean validateManager(boolean add) throws ApplicationException {
		if(add && manager == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[manager]");
		return manager != null;
	}

	public String getFirmware_major_version() {
		return firmware_major_version;
	}

	public String getFirmware_major_versionEx() {
		return firmware_major_version != null ? firmware_major_version : "";
	}

	public void setFirmware_major_version(String firmware_major_version) {
		this.firmware_major_version = firmware_major_version;
	}

	public void unSetFirmware_major_version() {
		this.firmware_major_version = null;
	}

	public String getFirmware_minor_version() {
		return firmware_minor_version;
	}

	public String getFirmware_minor_versionEx() {
		return firmware_minor_version != null ? firmware_minor_version : "";
	}

	public void setFirmware_minor_version(String firmware_minor_version) {
		this.firmware_minor_version = firmware_minor_version;
	}

	public void unSetFirmware_minor_version() {
		this.firmware_minor_version = null;
	}

	public String getState() {
		return state != null ? state : "IN-STORE";
	}

	public void setState(String state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = "IN-STORE";
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
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}