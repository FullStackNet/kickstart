/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.account.defined.resource;

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
public abstract class Baseaccount extends BaseResource {
	private String id = null;
	private String customer_id = null;
	private String company_name = null;
	private String account_customer_id = null;
	private String name = null;
	private String type = null;
	private String parent_id = null;
	private String parent_name = null;
	private Double balance = null;
	private Long creation_time = null;
	private Long updation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_COMPANY_NAME = "company_name";
	public static String FIELD_ACCOUNT_CUSTOMER_ID = "account_customer_id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TYPE = "type";
	public static String FIELD_PARENT_ID = "parent_id";
	public static String FIELD_PARENT_NAME = "parent_name";
	public static String FIELD_BALANCE = "balance";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_UPDATION_TIME = "updation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("account");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field company_nameField = new Field("company_name", "String");
		company_nameField.setLength(128);
		metaData.addField(company_nameField);

		Field account_customer_idField = new Field("account_customer_id", "String");
		account_customer_idField.setLength(128);
		metaData.addField(account_customer_idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field typeField = new Field("type", "String");
		typeField.setLength(128);
		metaData.addField(typeField);

		Field parent_idField = new Field("parent_id", "String");
		parent_idField.setLength(128);
		metaData.addField(parent_idField);

		Field parent_nameField = new Field("parent_name", "String");
		parent_nameField.setLength(128);
		metaData.addField(parent_nameField);

		Field balanceField = new Field("balance", "double");
		metaData.addField(balanceField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field updation_timeField = new Field("updation_time", "timestamp");
		metaData.addField(updation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("account");

		metaData.setCluster("DB_ACCOUNT");
	}

	public Baseaccount() {}

	public Baseaccount(Baseaccount obj) {
		this.id = obj.id;
		this.customer_id = obj.customer_id;
		this.company_name = obj.company_name;
		this.account_customer_id = obj.account_customer_id;
		this.name = obj.name;
		this.type = obj.type;
		this.parent_id = obj.parent_id;
		this.parent_name = obj.parent_name;
		this.balance = obj.balance;
		this.creation_time = obj.creation_time;
		this.updation_time = obj.updation_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(company_name != null)
			map.put("company_name", company_name);
		if(account_customer_id != null)
			map.put("account_customer_id", account_customer_id);
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(parent_name != null)
			map.put("parent_name", parent_name);
		if(balance != null)
			map.put("balance", balance);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(updation_time != null)
			map.put("updation_time", updation_time);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(company_name != null)
			map.put("company_name", company_name);
		if(account_customer_id != null)
			map.put("account_customer_id", account_customer_id);
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(parent_name != null)
			map.put("parent_name", parent_name);
		if(balance != null)
			map.put("balance", balance);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(updation_time != null)
			map.put("updation_time", updation_time);
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
		customer_id = (String) map.get("customer_id");
		company_name = (String) map.get("company_name");
		account_customer_id = (String) map.get("account_customer_id");
		name = (String) map.get("name");
		type = (String) map.get("type");
		parent_id = (String) map.get("parent_id");
		parent_name = (String) map.get("parent_name");
		balance = (Double) map.get("balance");
		creation_time = (Long) map.get("creation_time");
		updation_time = (Long) map.get("updation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object company_nameObj = map.get("company_name");
		if(company_nameObj != null)
			company_name = company_nameObj.toString();

		Object account_customer_idObj = map.get("account_customer_id");
		if(account_customer_idObj != null)
			account_customer_id = account_customer_idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object parent_idObj = map.get("parent_id");
		if(parent_idObj != null)
			parent_id = parent_idObj.toString();

		Object parent_nameObj = map.get("parent_name");
		if(parent_nameObj != null)
			parent_name = parent_nameObj.toString();

		Object balanceObj = map.get("balance");
		if(balanceObj != null)
			balance = new Double(balanceObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object updation_timeObj = map.get("updation_time");
		if(updation_timeObj != null)
			updation_time = (Long) updation_timeObj;

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

	public String getCompany_name() {
		return company_name;
	}

	public String getCompany_nameEx() {
		return company_name != null ? company_name : "";
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public void unSetCompany_name() {
		this.company_name = null;
	}

	public String getAccount_customer_id() {
		return account_customer_id;
	}

	public String getAccount_customer_idEx() {
		return account_customer_id != null ? account_customer_id : "";
	}

	public void setAccount_customer_id(String account_customer_id) {
		this.account_customer_id = account_customer_id;
	}

	public void unSetAccount_customer_id() {
		this.account_customer_id = null;
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

	public String getParent_id() {
		return parent_id;
	}

	public String getParent_idEx() {
		return parent_id != null ? parent_id : "";
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public void unSetParent_id() {
		this.parent_id = null;
	}

	public String getParent_name() {
		return parent_name;
	}

	public String getParent_nameEx() {
		return parent_name != null ? parent_name : "";
	}

	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}

	public void unSetParent_name() {
		this.parent_name = null;
	}

	public Double getBalance() {
		return balance;
	}

	public double getBalanceEx() {
		return balance != null ? balance : 0;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void unSetBalance() {
		this.balance = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Long getUpdation_time() {
		return updation_time;
	}

	public void setUpdation_time(Long updation_time) {
		this.updation_time = updation_time;
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
		return "DB_ACCOUNT";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}