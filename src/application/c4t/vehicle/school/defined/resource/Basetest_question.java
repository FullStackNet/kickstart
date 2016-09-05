/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

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
public abstract class Basetest_question extends BaseResource {
	private String id = null;
	private String customer_id = null;
	private String question_id = null;
	private String test_id = null;
	private Long order = null;
	private Long positive_mark = null;
	private Long negative_mark = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_QUESTION_ID = "question_id";
	public static String FIELD_TEST_ID = "test_id";
	public static String FIELD_ORDER = "order";
	public static String FIELD_POSITIVE_MARK = "positive_mark";
	public static String FIELD_NEGATIVE_MARK = "negative_mark";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("test_question");

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

		Field question_idField = new Field("question_id", "String");
		question_idField.setLength(128);
		metaData.addField(question_idField);

		Field test_idField = new Field("test_id", "String");
		test_idField.setLength(128);
		metaData.addField(test_idField);

		Field orderField = new Field("order", "long");
		orderField.setLength(128);
		metaData.addField(orderField);

		Field positive_markField = new Field("positive_mark", "long");
		metaData.addField(positive_markField);

		Field negative_markField = new Field("negative_mark", "long");
		metaData.addField(negative_markField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("test_question");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basetest_question() {}

	public Basetest_question(Basetest_question obj) {
		this.id = obj.id;
		this.customer_id = obj.customer_id;
		this.question_id = obj.question_id;
		this.test_id = obj.test_id;
		this.order = obj.order;
		this.positive_mark = obj.positive_mark;
		this.negative_mark = obj.negative_mark;
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
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(question_id != null)
			map.put("question_id", question_id);
		if(test_id != null)
			map.put("test_id", test_id);
		if(order != null)
			map.put("order", order);
		if(positive_mark != null)
			map.put("positive_mark", positive_mark);
		if(negative_mark != null)
			map.put("negative_mark", negative_mark);
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
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(question_id != null)
			map.put("question_id", question_id);
		if(test_id != null)
			map.put("test_id", test_id);
		if(order != null)
			map.put("order", order);
		if(positive_mark != null)
			map.put("positive_mark", positive_mark);
		if(negative_mark != null)
			map.put("negative_mark", negative_mark);
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
		customer_id = (String) map.get("customer_id");
		question_id = (String) map.get("question_id");
		test_id = (String) map.get("test_id");
		order = (Long) map.get("order");
		positive_mark = (Long) map.get("positive_mark");
		negative_mark = (Long) map.get("negative_mark");
		creation_time = (Long) map.get("creation_time");
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

		Object question_idObj = map.get("question_id");
		if(question_idObj != null)
			question_id = question_idObj.toString();

		Object test_idObj = map.get("test_id");
		if(test_idObj != null)
			test_id = test_idObj.toString();

		Object orderObj = map.get("order");
		if(orderObj != null)
			order = new Long(orderObj.toString());

		Object positive_markObj = map.get("positive_mark");
		if(positive_markObj != null)
			positive_mark = new Long(positive_markObj.toString());

		Object negative_markObj = map.get("negative_mark");
		if(negative_markObj != null)
			negative_mark = new Long(negative_markObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

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

	public String getQuestion_id() {
		return question_id;
	}

	public String getQuestion_idEx() {
		return question_id != null ? question_id : "";
	}

	public void setQuestion_id(String question_id) {
		this.question_id = question_id;
	}

	public void unSetQuestion_id() {
		this.question_id = null;
	}

	public String getTest_id() {
		return test_id;
	}

	public String getTest_idEx() {
		return test_id != null ? test_id : "";
	}

	public void setTest_id(String test_id) {
		this.test_id = test_id;
	}

	public void unSetTest_id() {
		this.test_id = null;
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

	public Long getPositive_mark() {
		return positive_mark;
	}

	public long getPositive_markEx() {
		return positive_mark != null ? positive_mark : 0L;
	}

	public void setPositive_mark(long positive_mark) {
		this.positive_mark = positive_mark;
	}

	public void setPositive_mark(Long positive_mark) {
		this.positive_mark = positive_mark;
	}

	public void unSetPositive_mark() {
		this.positive_mark = null;
	}

	public Long getNegative_mark() {
		return negative_mark;
	}

	public long getNegative_markEx() {
		return negative_mark != null ? negative_mark : 0L;
	}

	public void setNegative_mark(long negative_mark) {
		this.negative_mark = negative_mark;
	}

	public void setNegative_mark(Long negative_mark) {
		this.negative_mark = negative_mark;
	}

	public void unSetNegative_mark() {
		this.negative_mark = null;
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