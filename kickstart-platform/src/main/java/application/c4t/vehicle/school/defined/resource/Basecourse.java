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
public abstract class Basecourse extends BaseResource {
	private String id = null;
	private String name = null;
	private Long order = null;
	private String category_id = null;
	private String interested = null;
	private String customer_id = null;
	private List<Object> subjects = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_ORDER = "order";
	public static String FIELD_CATEGORY_ID = "category_id";
	public static String FIELD_INTERESTED = "interested";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_SUBJECTS = "subjects";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("course");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(32);
		metaData.addField(nameField);

		Field orderField = new Field("order", "long");
		metaData.addField(orderField);

		Field category_idField = new Field("category_id", "String");
		category_idField.setLength(128);
		metaData.addField(category_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field subjectsField = new Field("subjects", "Array");
		metaData.addField(subjectsField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("course");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basecourse() {}

	public Basecourse(Basecourse obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.order = obj.order;
		this.category_id = obj.category_id;
		this.interested = obj.interested;
		this.customer_id = obj.customer_id;
		this.subjects = obj.subjects;
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
		if(name != null)
			map.put("name", name);
		if(order != null)
			map.put("order", order);
		if(category_id != null)
			map.put("category_id", category_id);
		if(interested != null)
			map.put("interested", interested);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(subjects != null)
			map.put("subjects", subjects);
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
		if(name != null)
			map.put("name", name);
		if(order != null)
			map.put("order", order);
		if(category_id != null)
			map.put("category_id", category_id);
		if(interested != null)
			map.put("interested", interested);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(subjects != null)
			map.put("subjects", subjects);
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
		name = (String) map.get("name");
		order = (Long) map.get("order");
		category_id = (String) map.get("category_id");
		customer_id = (String) map.get("customer_id");
		subjects = (List<Object>) map.get("subjects");
		creation_time = (Long) map.get("creation_time");
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

		Object orderObj = map.get("order");
		if(orderObj != null)
			order = new Long(orderObj.toString());

		Object category_idObj = map.get("category_id");
		if(category_idObj != null)
			category_id = category_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		subjects = (List<Object>) map.get("subjects");
		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

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

	public Long getOrder() {
		return order;
	}

	public long getOrderEx() {
		return order != null ? order : 0L;
	}

	public void setOrder(long order) {
		this.order = order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public void unSetOrder() {
		this.order = null;
	}

	public String getCategory_id() {
		return category_id;
	}

	public String getCategory_idEx() {
		return category_id != null ? category_id : "";
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public void unSetCategory_id() {
		this.category_id = null;
	}

	public String getInterested() {
		return interested;
	}

	public String getInterestedEx() {
		return interested != null ? interested : "";
	}

	public void setInterested(String interested) {
		this.interested = interested;
	}

	public void unSetInterested() {
		this.interested = null;
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

	public List<Object> getSubjects() {
		return subjects;
	}


	public void setSubjects(List<Object> subjects) {
		this.subjects = subjects;
	}

	public void addSubjects(Object value) {
		if(subjects == null)
			subjects = new ArrayList<Object>();
		subjects.add(value);
	}

	public void unSetSubjects() {
		this.subjects = null;
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
		return "DB_SCHOOL";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}