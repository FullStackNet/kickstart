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
public abstract class Baseappliance_group_appliance extends BaseResource {
	private String id = null;
	private String appliance_id = null;
	private String appliance_name = null;
	private String group_id = null;
	private String group_name = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_APPLIANCE_NAME = "appliance_name";
	public static String FIELD_GROUP_ID = "group_id";
	public static String FIELD_GROUP_NAME = "group_name";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_group_appliance");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field appliance_nameField = new Field("appliance_name", "String");
		appliance_nameField.setLength(128);
		metaData.addField(appliance_nameField);

		Field group_idField = new Field("group_id", "String");
		group_idField.setLength(128);
		metaData.addField(group_idField);

		Field group_nameField = new Field("group_name", "String");
		group_nameField.setLength(128);
		metaData.addField(group_nameField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance_group_appliance");

		metaData.setCluster("DB_DEVICE");
	}

	public Baseappliance_group_appliance() {}

	public Baseappliance_group_appliance(Baseappliance_group_appliance obj) {
		this.id = obj.id;
		this.appliance_id = obj.appliance_id;
		this.appliance_name = obj.appliance_name;
		this.group_id = obj.group_id;
		this.group_name = obj.group_name;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(appliance_name != null)
			map.put("appliance_name", appliance_name);
		if(group_id != null)
			map.put("group_id", group_id);
		if(group_name != null)
			map.put("group_name", group_name);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(appliance_name != null)
			map.put("appliance_name", appliance_name);
		if(group_id != null)
			map.put("group_id", group_id);
		if(group_name != null)
			map.put("group_name", group_name);
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
		appliance_id = (String) map.get("appliance_id");
		appliance_name = (String) map.get("appliance_name");
		group_id = (String) map.get("group_id");
		group_name = (String) map.get("group_name");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object appliance_nameObj = map.get("appliance_name");
		if(appliance_nameObj != null)
			appliance_name = appliance_nameObj.toString();

		Object group_idObj = map.get("group_id");
		if(group_idObj != null)
			group_id = group_idObj.toString();

		Object group_nameObj = map.get("group_name");
		if(group_nameObj != null)
			group_name = group_nameObj.toString();

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

	public String getGroup_id() {
		return group_id;
	}

	public String getGroup_idEx() {
		return group_id != null ? group_id : "";
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public void unSetGroup_id() {
		this.group_id = null;
	}

	public String getGroup_name() {
		return group_name;
	}

	public String getGroup_nameEx() {
		return group_name != null ? group_name : "";
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public void unSetGroup_name() {
		this.group_name = null;
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