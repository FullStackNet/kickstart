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
public abstract class Basesession extends BaseResource {
	private String id = null;
	private String user_id = null;
	private String context_id = null;
	private String context_name = null;
	private String customer_id = null;
	private String student_id = null;
	private String user_type = null;
	private String user_name = null;
	private String super_user = null;
	private String role = null;
	private String readonly_user = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_CONTEXT_ID = "context_id";
	public static String FIELD_CONTEXT_NAME = "context_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_USER_TYPE = "user_type";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_SUPER_USER = "super_user";
	public static String FIELD_ROLE = "role";
	public static String FIELD_READONLY_USER = "readonly_user";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("session");

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

		Field context_idField = new Field("context_id", "String");
		context_idField.setLength(128);
		metaData.addField(context_idField);

		Field context_nameField = new Field("context_name", "String");
		context_nameField.setLength(128);
		metaData.addField(context_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field user_typeField = new Field("user_type", "String");
		user_typeField.setLength(32);
		metaData.addField(user_typeField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(128);
		metaData.addField(user_nameField);

		Field super_userField = new Field("super_user", "String");
		super_userField.setDefaultValue("N");
		super_userField.setLength(1);
		metaData.addField(super_userField);

		Field roleField = new Field("role", "String");
		roleField.setDefaultValue("N");
		roleField.setLength(1);
		metaData.addField(roleField);

		Field readonly_userField = new Field("readonly_user", "String");
		readonly_userField.setDefaultValue("N");
		readonly_userField.setLength(1);
		metaData.addField(readonly_userField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("session");

		metaData.setCluster("DB_SESSION");
	}

	public Basesession() {}

	public Basesession(Basesession obj) {
		this.id = obj.id;
		this.user_id = obj.user_id;
		this.context_id = obj.context_id;
		this.context_name = obj.context_name;
		this.customer_id = obj.customer_id;
		this.student_id = obj.student_id;
		this.user_type = obj.user_type;
		this.user_name = obj.user_name;
		this.super_user = obj.super_user;
		this.role = obj.role;
		this.readonly_user = obj.readonly_user;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(super_user == null)
			super_user = "N";
		if(role == null)
			role = "N";
		if(readonly_user == null)
			readonly_user = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(context_id != null)
			map.put("context_id", context_id);
		if(context_name != null)
			map.put("context_name", context_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(student_id != null)
			map.put("student_id", student_id);
		if(user_type != null)
			map.put("user_type", user_type);
		if(user_name != null)
			map.put("user_name", user_name);
		if(super_user != null)
			map.put("super_user", super_user);
		if(role != null)
			map.put("role", role);
		if(readonly_user != null)
			map.put("readonly_user", readonly_user);
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
		if(user_id != null)
			map.put("user_id", user_id);
		if(context_id != null)
			map.put("context_id", context_id);
		if(context_name != null)
			map.put("context_name", context_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(student_id != null)
			map.put("student_id", student_id);
		if(user_type != null)
			map.put("user_type", user_type);
		if(user_name != null)
			map.put("user_name", user_name);
		if(super_user != null)
			map.put("super_user", super_user);
		if(role != null)
			map.put("role", role);
		if(readonly_user != null)
			map.put("readonly_user", readonly_user);
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
		context_id = (String) map.get("context_id");
		context_name = (String) map.get("context_name");
		customer_id = (String) map.get("customer_id");
		student_id = (String) map.get("student_id");
		user_type = (String) map.get("user_type");
		user_name = (String) map.get("user_name");
		super_user = (String) map.get("super_user");
		role = (String) map.get("role");
		readonly_user = (String) map.get("readonly_user");
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

		Object context_idObj = map.get("context_id");
		if(context_idObj != null)
			context_id = context_idObj.toString();

		Object context_nameObj = map.get("context_name");
		if(context_nameObj != null)
			context_name = context_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object user_typeObj = map.get("user_type");
		if(user_typeObj != null)
			user_type = user_typeObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

		Object super_userObj = map.get("super_user");
		if(super_userObj != null)
			super_user = super_userObj.toString();

		Object roleObj = map.get("role");
		if(roleObj != null)
			role = roleObj.toString();

		Object readonly_userObj = map.get("readonly_user");
		if(readonly_userObj != null)
			readonly_user = readonly_userObj.toString();

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

	public String getContext_id() {
		return context_id;
	}

	public String getContext_idEx() {
		return context_id != null ? context_id : "";
	}

	public void setContext_id(String context_id) {
		this.context_id = context_id;
	}

	public void unSetContext_id() {
		this.context_id = null;
	}

	public String getContext_name() {
		return context_name;
	}

	public String getContext_nameEx() {
		return context_name != null ? context_name : "";
	}

	public void setContext_name(String context_name) {
		this.context_name = context_name;
	}

	public void unSetContext_name() {
		this.context_name = null;
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

	public String getStudent_id() {
		return student_id;
	}

	public String getStudent_idEx() {
		return student_id != null ? student_id : "";
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public void unSetStudent_id() {
		this.student_id = null;
	}

	public String getUser_type() {
		return user_type;
	}

	public String getUser_typeEx() {
		return user_type != null ? user_type : "";
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public void unSetUser_type() {
		this.user_type = null;
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

	public String getSuper_user() {
		return super_user != null ? super_user : "N";
	}

	public void setSuper_user(String super_user) {
		this.super_user = super_user;
	}

	public void unSetSuper_user() {
		this.super_user = "N";
	}

	public String getRole() {
		return role != null ? role : "N";
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void unSetRole() {
		this.role = "N";
	}

	public String getReadonly_user() {
		return readonly_user != null ? readonly_user : "N";
	}

	public void setReadonly_user(String readonly_user) {
		this.readonly_user = readonly_user;
	}

	public void unSetReadonly_user() {
		this.readonly_user = "N";
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
		return "DB_SESSION";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}