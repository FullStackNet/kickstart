/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseproficiency_master extends BaseResource {
	private String id = null;
	private String title = null;
	private String description = null;
	private String class_name = null;
	private String customer_id = null;
	private Double order = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_ORDER = "order";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("proficiency_master");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field titleField = new Field("title", "String");
		titleField.setLength(128);
		metaData.addField(titleField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(128);
		metaData.addField(descriptionField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(128);
		metaData.addField(class_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field orderField = new Field("order", "double");
		metaData.addField(orderField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("proficiency_master");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseproficiency_master() {}

	public Baseproficiency_master(Baseproficiency_master obj) {
		this.id = obj.id;
		this.title = obj.title;
		this.description = obj.description;
		this.class_name = obj.class_name;
		this.customer_id = obj.customer_id;
		this.order = obj.order;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(class_name != null)
			map.put("class_name", class_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(order != null)
			map.put("order", order);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(class_name != null)
			map.put("class_name", class_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(order != null)
			map.put("order", order);
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
		title = (String) map.get("title");
		description = (String) map.get("description");
		class_name = (String) map.get("class_name");
		customer_id = (String) map.get("customer_id");
		order = (Double) map.get("order");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object orderObj = map.get("order");
		if(orderObj != null)
			order = new Double(orderObj.toString());

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

	public String getTitle() {
		return title;
	}

	public String getTitleEx() {
		return title != null ? title : "";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void unSetTitle() {
		this.title = null;
	}

	public String getDescription() {
		return description;
	}

	public String getDescriptionEx() {
		return description != null ? description : "";
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void unSetDescription() {
		this.description = null;
	}

	public String getClass_name() {
		return class_name;
	}

	public String getClass_nameEx() {
		return class_name != null ? class_name : "";
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public void unSetClass_name() {
		this.class_name = null;
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

	public Double getOrder() {
		return order;
	}

	public double getOrderEx() {
		return order != null ? order : 0;
	}

	public void setOrder(double order) {
		this.order = order;
	}

	public void setOrder(Double order) {
		this.order = order;
	}

	public void unSetOrder() {
		this.order = null;
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
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}