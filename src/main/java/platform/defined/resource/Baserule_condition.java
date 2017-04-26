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
public abstract class Baserule_condition extends BaseResource {
	private String id = null;
	private String name = null;
	private String type = null;
	private String entity_type = null;
	private String entity_id = null;
	private String entity_name = null;
	private String attribute = null;
	private String attribute_value_type = null;
	private String operator = null;
	private String value = null;
	private String leftConditionId = null;
	private String leftConditionName = null;
	private String rightConditionId = null;
	private String rightConditionName = null;
	private String referance_type = null;
	private String referance_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TYPE = "type";
	public static String FIELD_ENTITY_TYPE = "entity_type";
	public static String FIELD_ENTITY_ID = "entity_id";
	public static String FIELD_ENTITY_NAME = "entity_name";
	public static String FIELD_ATTRIBUTE = "attribute";
	public static String FIELD_ATTRIBUTE_VALUE_TYPE = "attribute_value_type";
	public static String FIELD_OPERATOR = "operator";
	public static String FIELD_VALUE = "value";
	public static String FIELD_LEFTCONDITIONID = "leftConditionId";
	public static String FIELD_LEFTCONDITIONNAME = "leftConditionName";
	public static String FIELD_RIGHTCONDITIONID = "rightConditionId";
	public static String FIELD_RIGHTCONDITIONNAME = "rightConditionName";
	public static String FIELD_REFERANCE_TYPE = "referance_type";
	public static String FIELD_REFERANCE_ID = "referance_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("rule_condition");

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

		Field typeField = new Field("type", "String");
		typeField.setLength(64);
		metaData.addField(typeField);

		Field entity_typeField = new Field("entity_type", "String");
		entity_typeField.setLength(64);
		metaData.addField(entity_typeField);

		Field entity_idField = new Field("entity_id", "String");
		entity_idField.setLength(128);
		metaData.addField(entity_idField);

		Field entity_nameField = new Field("entity_name", "String");
		entity_nameField.setLength(128);
		metaData.addField(entity_nameField);

		Field attributeField = new Field("attribute", "String");
		attributeField.setLength(64);
		metaData.addField(attributeField);

		Field attribute_value_typeField = new Field("attribute_value_type", "String");
		attribute_value_typeField.setLength(32);
		metaData.addField(attribute_value_typeField);

		Field operatorField = new Field("operator", "String");
		operatorField.setLength(32);
		metaData.addField(operatorField);

		Field valueField = new Field("value", "String");
		valueField.setLength(128);
		metaData.addField(valueField);

		Field leftConditionIdField = new Field("leftConditionId", "String");
		leftConditionIdField.setLength(128);
		metaData.addField(leftConditionIdField);

		Field leftConditionNameField = new Field("leftConditionName", "String");
		leftConditionNameField.setLength(128);
		metaData.addField(leftConditionNameField);

		Field rightConditionIdField = new Field("rightConditionId", "String");
		rightConditionIdField.setLength(128);
		metaData.addField(rightConditionIdField);

		Field rightConditionNameField = new Field("rightConditionName", "String");
		rightConditionNameField.setLength(128);
		metaData.addField(rightConditionNameField);

		Field referance_typeField = new Field("referance_type", "String");
		referance_typeField.setRequired(true);
		referance_typeField.setDefaultValue("LOCATION");
		referance_typeField.setLength(16);
		metaData.addField(referance_typeField);

		Field referance_idField = new Field("referance_id", "String");
		referance_idField.setLength(128);
		metaData.addField(referance_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("rule_condition");

		metaData.setCluster("DB_DEVICE");
	}

	public Baserule_condition() {}

	public Baserule_condition(Baserule_condition obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.type = obj.type;
		this.entity_type = obj.entity_type;
		this.entity_id = obj.entity_id;
		this.entity_name = obj.entity_name;
		this.attribute = obj.attribute;
		this.attribute_value_type = obj.attribute_value_type;
		this.operator = obj.operator;
		this.value = obj.value;
		this.leftConditionId = obj.leftConditionId;
		this.leftConditionName = obj.leftConditionName;
		this.rightConditionId = obj.rightConditionId;
		this.rightConditionName = obj.rightConditionName;
		this.referance_type = obj.referance_type;
		this.referance_id = obj.referance_id;
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
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(entity_type != null)
			map.put("entity_type", entity_type);
		if(entity_id != null)
			map.put("entity_id", entity_id);
		if(entity_name != null)
			map.put("entity_name", entity_name);
		if(attribute != null)
			map.put("attribute", attribute);
		if(attribute_value_type != null)
			map.put("attribute_value_type", attribute_value_type);
		if(operator != null)
			map.put("operator", operator);
		if(value != null)
			map.put("value", value);
		if(leftConditionId != null)
			map.put("leftConditionId", leftConditionId);
		if(leftConditionName != null)
			map.put("leftConditionName", leftConditionName);
		if(rightConditionId != null)
			map.put("rightConditionId", rightConditionId);
		if(rightConditionName != null)
			map.put("rightConditionName", rightConditionName);
		if(referance_type != null)
			map.put("referance_type", referance_type);
		if(referance_id != null)
			map.put("referance_id", referance_id);
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
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(entity_type != null)
			map.put("entity_type", entity_type);
		if(entity_id != null)
			map.put("entity_id", entity_id);
		if(entity_name != null)
			map.put("entity_name", entity_name);
		if(attribute != null)
			map.put("attribute", attribute);
		if(attribute_value_type != null)
			map.put("attribute_value_type", attribute_value_type);
		if(operator != null)
			map.put("operator", operator);
		if(value != null)
			map.put("value", value);
		if(leftConditionId != null)
			map.put("leftConditionId", leftConditionId);
		if(leftConditionName != null)
			map.put("leftConditionName", leftConditionName);
		if(rightConditionId != null)
			map.put("rightConditionId", rightConditionId);
		if(rightConditionName != null)
			map.put("rightConditionName", rightConditionName);
		if(validateReferance_type(add))
			map.put("referance_type", referance_type);
		if(referance_id != null)
			map.put("referance_id", referance_id);
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
		entity_type = (String) map.get("entity_type");
		entity_id = (String) map.get("entity_id");
		entity_name = (String) map.get("entity_name");
		attribute = (String) map.get("attribute");
		attribute_value_type = (String) map.get("attribute_value_type");
		operator = (String) map.get("operator");
		value = (String) map.get("value");
		leftConditionId = (String) map.get("leftConditionId");
		leftConditionName = (String) map.get("leftConditionName");
		rightConditionId = (String) map.get("rightConditionId");
		rightConditionName = (String) map.get("rightConditionName");
		referance_type = (String) map.get("referance_type");
		referance_id = (String) map.get("referance_id");
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

		Object entity_typeObj = map.get("entity_type");
		if(entity_typeObj != null)
			entity_type = entity_typeObj.toString();

		Object entity_idObj = map.get("entity_id");
		if(entity_idObj != null)
			entity_id = entity_idObj.toString();

		Object entity_nameObj = map.get("entity_name");
		if(entity_nameObj != null)
			entity_name = entity_nameObj.toString();

		Object attributeObj = map.get("attribute");
		if(attributeObj != null)
			attribute = attributeObj.toString();

		Object attribute_value_typeObj = map.get("attribute_value_type");
		if(attribute_value_typeObj != null)
			attribute_value_type = attribute_value_typeObj.toString();

		Object operatorObj = map.get("operator");
		if(operatorObj != null)
			operator = operatorObj.toString();

		Object valueObj = map.get("value");
		if(valueObj != null)
			value = valueObj.toString();

		Object leftConditionIdObj = map.get("leftConditionId");
		if(leftConditionIdObj != null)
			leftConditionId = leftConditionIdObj.toString();

		Object leftConditionNameObj = map.get("leftConditionName");
		if(leftConditionNameObj != null)
			leftConditionName = leftConditionNameObj.toString();

		Object rightConditionIdObj = map.get("rightConditionId");
		if(rightConditionIdObj != null)
			rightConditionId = rightConditionIdObj.toString();

		Object rightConditionNameObj = map.get("rightConditionName");
		if(rightConditionNameObj != null)
			rightConditionName = rightConditionNameObj.toString();

		Object referance_typeObj = map.get("referance_type");
		if(referance_typeObj != null)
			referance_type = referance_typeObj.toString();

		Object referance_idObj = map.get("referance_id");
		if(referance_idObj != null)
			referance_id = referance_idObj.toString();

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

	public String getAttribute() {
		return attribute;
	}

	public String getAttributeEx() {
		return attribute != null ? attribute : "";
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public void unSetAttribute() {
		this.attribute = null;
	}

	public String getAttribute_value_type() {
		return attribute_value_type;
	}

	public String getAttribute_value_typeEx() {
		return attribute_value_type != null ? attribute_value_type : "";
	}

	public void setAttribute_value_type(String attribute_value_type) {
		this.attribute_value_type = attribute_value_type;
	}

	public void unSetAttribute_value_type() {
		this.attribute_value_type = null;
	}

	public String getOperator() {
		return operator;
	}

	public String getOperatorEx() {
		return operator != null ? operator : "";
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void unSetOperator() {
		this.operator = null;
	}

	public String getValue() {
		return value;
	}

	public String getValueEx() {
		return value != null ? value : "";
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void unSetValue() {
		this.value = null;
	}

	public String getLeftConditionId() {
		return leftConditionId;
	}

	public String getLeftConditionIdEx() {
		return leftConditionId != null ? leftConditionId : "";
	}

	public void setLeftConditionId(String leftConditionId) {
		this.leftConditionId = leftConditionId;
	}

	public void unSetLeftConditionId() {
		this.leftConditionId = null;
	}

	public String getLeftConditionName() {
		return leftConditionName;
	}

	public String getLeftConditionNameEx() {
		return leftConditionName != null ? leftConditionName : "";
	}

	public void setLeftConditionName(String leftConditionName) {
		this.leftConditionName = leftConditionName;
	}

	public void unSetLeftConditionName() {
		this.leftConditionName = null;
	}

	public String getRightConditionId() {
		return rightConditionId;
	}

	public String getRightConditionIdEx() {
		return rightConditionId != null ? rightConditionId : "";
	}

	public void setRightConditionId(String rightConditionId) {
		this.rightConditionId = rightConditionId;
	}

	public void unSetRightConditionId() {
		this.rightConditionId = null;
	}

	public String getRightConditionName() {
		return rightConditionName;
	}

	public String getRightConditionNameEx() {
		return rightConditionName != null ? rightConditionName : "";
	}

	public void setRightConditionName(String rightConditionName) {
		this.rightConditionName = rightConditionName;
	}

	public void unSetRightConditionName() {
		this.rightConditionName = null;
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