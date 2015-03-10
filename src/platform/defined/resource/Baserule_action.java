/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

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
public abstract class Baserule_action extends BaseResource {
	private String id = null;
	private String referance_type = null;
	private String referance_id = null;
	private String name = null;
	private String entity_type = null;
	private String entity_id = null;
	private String entity_name = null;
	private String action_type = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_REFERANCE_TYPE = "referance_type";
	public static String FIELD_REFERANCE_ID = "referance_id";
	public static String FIELD_NAME = "name";
	public static String FIELD_ENTITY_TYPE = "entity_type";
	public static String FIELD_ENTITY_ID = "entity_id";
	public static String FIELD_ENTITY_NAME = "entity_name";
	public static String FIELD_ACTION_TYPE = "action_type";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("rule_action");

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

		Field entity_typeField = new Field("entity_type", "String");
		entity_typeField.setLength(64);
		metaData.addField(entity_typeField);

		Field entity_idField = new Field("entity_id", "String");
		entity_idField.setLength(128);
		metaData.addField(entity_idField);

		Field entity_nameField = new Field("entity_name", "String");
		entity_nameField.setLength(128);
		metaData.addField(entity_nameField);

		Field action_typeField = new Field("action_type", "String");
		action_typeField.setLength(128);
		metaData.addField(action_typeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("rule_action");

		metaData.setCluster("DB_DEVICE");
	}

	public Baserule_action() {}

	public Baserule_action(Baserule_action obj) {
		this.id = obj.id;
		this.referance_type = obj.referance_type;
		this.referance_id = obj.referance_id;
		this.name = obj.name;
		this.entity_type = obj.entity_type;
		this.entity_id = obj.entity_id;
		this.entity_name = obj.entity_name;
		this.action_type = obj.action_type;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(referance_type == null)
			referance_type = "LOCATION";
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
		if(entity_type != null)
			map.put("entity_type", entity_type);
		if(entity_id != null)
			map.put("entity_id", entity_id);
		if(entity_name != null)
			map.put("entity_name", entity_name);
		if(action_type != null)
			map.put("action_type", action_type);
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
		if(entity_type != null)
			map.put("entity_type", entity_type);
		if(entity_id != null)
			map.put("entity_id", entity_id);
		if(entity_name != null)
			map.put("entity_name", entity_name);
		if(action_type != null)
			map.put("action_type", action_type);
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
		entity_type = (String) map.get("entity_type");
		entity_id = (String) map.get("entity_id");
		entity_name = (String) map.get("entity_name");
		action_type = (String) map.get("action_type");
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

		Object entity_typeObj = map.get("entity_type");
		if(entity_typeObj != null)
			entity_type = entity_typeObj.toString();

		Object entity_idObj = map.get("entity_id");
		if(entity_idObj != null)
			entity_id = entity_idObj.toString();

		Object entity_nameObj = map.get("entity_name");
		if(entity_nameObj != null)
			entity_name = entity_nameObj.toString();

		Object action_typeObj = map.get("action_type");
		if(action_typeObj != null)
			action_type = action_typeObj.toString();

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

	public String getEntity_type() {
		return entity_type;
	}

	public String getEntity_typeEx() {
		return entity_type != null ? entity_type : "";
	}

	public void setEntity_type(String entity_type) {
		this.entity_type = entity_type;
	}

	public void unSetEntity_type() {
		this.entity_type = null;
	}

	public String getEntity_id() {
		return entity_id;
	}

	public String getEntity_idEx() {
		return entity_id != null ? entity_id : "";
	}

	public void setEntity_id(String entity_id) {
		this.entity_id = entity_id;
	}

	public void unSetEntity_id() {
		this.entity_id = null;
	}

	public String getEntity_name() {
		return entity_name;
	}

	public String getEntity_nameEx() {
		return entity_name != null ? entity_name : "";
	}

	public void setEntity_name(String entity_name) {
		this.entity_name = entity_name;
	}

	public void unSetEntity_name() {
		this.entity_name = null;
	}

	public String getAction_type() {
		return action_type;
	}

	public String getAction_typeEx() {
		return action_type != null ? action_type : "";
	}

	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}

	public void unSetAction_type() {
		this.action_type = null;
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