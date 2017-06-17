/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

import java.util.HashMap;
import java.util.Map;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baserule extends BaseResource {
	private String id = null;
	private String referance_type = null;
	private String referance_id = null;
	private String name = null;
	private String conditionId = null;
	private String actionId = null;
	private String enabled = null;
	private Integer priority = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_REFERANCE_TYPE = "referance_type";
	public static String FIELD_REFERANCE_ID = "referance_id";
	public static String FIELD_NAME = "name";
	public static String FIELD_CONDITIONID = "conditionId";
	public static String FIELD_ACTIONID = "actionId";
	public static String FIELD_ENABLED = "enabled";
	public static String FIELD_PRIORITY = "priority";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("rule");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field referance_typeField = new Field("referance_type", "String");
		referance_typeField.setRequired(true);
		referance_typeField.setDefaultValue("LOCATION");
		referance_typeField.setLength(16);
		metaData.addField(referance_typeField);

		Field referance_idField = new Field("referance_id", "String");
		referance_idField.setLength(128);
		metaData.addField(referance_idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field conditionIdField = new Field("conditionId", "String");
		conditionIdField.setLength(128);
		metaData.addField(conditionIdField);

		Field actionIdField = new Field("actionId", "String");
		actionIdField.setLength(128);
		metaData.addField(actionIdField);

		Field enabledField = new Field("enabled", "String");
		enabledField.setDefaultValue("N");
		enabledField.setLength(1);
		metaData.addField(enabledField);

		Field priorityField = new Field("priority", "int");
		priorityField.setDefaultValue(1);
		priorityField.setLength(5);
		metaData.addField(priorityField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("rule");

		metaData.setCluster("DB_DEVICE");
	}

	public Baserule() {}

	public Baserule(Baserule obj) {
		this.id = obj.id;
		this.referance_type = obj.referance_type;
		this.referance_id = obj.referance_id;
		this.name = obj.name;
		this.conditionId = obj.conditionId;
		this.actionId = obj.actionId;
		this.enabled = obj.enabled;
		this.priority = obj.priority;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(referance_type == null)
			referance_type = "LOCATION";
		if(enabled == null)
			enabled = "N";
		if(priority == null)
			priority = 1;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(referance_type != null)
			map.put("referance_type", referance_type);
		if(referance_id != null)
			map.put("referance_id", referance_id);
		if(name != null)
			map.put("name", name);
		if(conditionId != null)
			map.put("conditionId", conditionId);
		if(actionId != null)
			map.put("actionId", actionId);
		if(enabled != null)
			map.put("enabled", enabled);
		if(priority != null)
			map.put("priority", priority);
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
		if(validateReferance_type(add))
			map.put("referance_type", referance_type);
		if(referance_id != null)
			map.put("referance_id", referance_id);
		if(name != null)
			map.put("name", name);
		if(conditionId != null)
			map.put("conditionId", conditionId);
		if(actionId != null)
			map.put("actionId", actionId);
		if(enabled != null)
			map.put("enabled", enabled);
		if(priority != null)
			map.put("priority", priority);
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
		referance_type = (String) map.get("referance_type");
		referance_id = (String) map.get("referance_id");
		name = (String) map.get("name");
		conditionId = (String) map.get("conditionId");
		actionId = (String) map.get("actionId");
		enabled = (String) map.get("enabled");
		priority = (Integer) map.get("priority");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object referance_typeObj = map.get("referance_type");
		if(referance_typeObj != null)
			referance_type = referance_typeObj.toString();

		Object referance_idObj = map.get("referance_id");
		if(referance_idObj != null)
			referance_id = referance_idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object conditionIdObj = map.get("conditionId");
		if(conditionIdObj != null)
			conditionId = conditionIdObj.toString();

		Object actionIdObj = map.get("actionId");
		if(actionIdObj != null)
			actionId = actionIdObj.toString();

		Object enabledObj = map.get("enabled");
		if(enabledObj != null)
			enabled = enabledObj.toString();

		Object priorityObj = map.get("priority");
		if(priorityObj != null)
			priority = new Integer(priorityObj.toString());

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

	public String getReferance_type() {
		return referance_type != null ? referance_type : "LOCATION";
	}

	public void setReferance_type(String referance_type) {
		this.referance_type = referance_type;
	}

	public void unSetReferance_type() {
		this.referance_type = "LOCATION";
	}

	public boolean validateReferance_type(boolean add) throws ApplicationException {
		if(add && referance_type == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[referance_type]");
		return referance_type != null;
	}

	public String getReferance_id() {
		return referance_id;
	}

	public String getReferance_idEx() {
		return referance_id != null ? referance_id : "";
	}

	public void setReferance_id(String referance_id) {
		this.referance_id = referance_id;
	}

	public void unSetReferance_id() {
		this.referance_id = null;
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

	public String getConditionId() {
		return conditionId;
	}

	public String getConditionIdEx() {
		return conditionId != null ? conditionId : "";
	}

	public void setConditionId(String conditionId) {
		this.conditionId = conditionId;
	}

	public void unSetConditionId() {
		this.conditionId = null;
	}

	public String getActionId() {
		return actionId;
	}

	public String getActionIdEx() {
		return actionId != null ? actionId : "";
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public void unSetActionId() {
		this.actionId = null;
	}

	public String getEnabled() {
		return enabled != null ? enabled : "N";
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public void unSetEnabled() {
		this.enabled = "N";
	}

	public Integer getPriority() {
		return priority != null ? priority : 1;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public void unSetPriority() {
		this.priority = 1;
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