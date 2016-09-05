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
public abstract class Basebook_chapter_test extends BaseResource {
	private String id = null;
	private String chapter_id = null;
	private String chapter_name = null;
	private String test_id = null;
	private String test_code = null;
	private String test_name = null;
	private Long order = null;
	private String book_id = null;
	private String customer_id = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CHAPTER_ID = "chapter_id";
	public static String FIELD_CHAPTER_NAME = "chapter_name";
	public static String FIELD_TEST_ID = "test_id";
	public static String FIELD_TEST_CODE = "test_code";
	public static String FIELD_TEST_NAME = "test_name";
	public static String FIELD_ORDER = "order";
	public static String FIELD_BOOK_ID = "book_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("book_chapter_test");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field chapter_idField = new Field("chapter_id", "String");
		chapter_idField.setLength(32);
		metaData.addField(chapter_idField);

		Field chapter_nameField = new Field("chapter_name", "String");
		chapter_nameField.setLength(32);
		metaData.addField(chapter_nameField);

		Field test_idField = new Field("test_id", "String");
		test_idField.setLength(32);
		metaData.addField(test_idField);

		Field test_codeField = new Field("test_code", "String");
		test_codeField.setLength(32);
		metaData.addField(test_codeField);

		Field test_nameField = new Field("test_name", "String");
		test_nameField.setLength(32);
		metaData.addField(test_nameField);

		Field orderField = new Field("order", "long");
		metaData.addField(orderField);

		Field book_idField = new Field("book_id", "String");
		book_idField.setIndexed(true);
		book_idField.setLength(128);
		metaData.addField(book_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("book_chapter_test");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basebook_chapter_test() {}

	public Basebook_chapter_test(Basebook_chapter_test obj) {
		this.id = obj.id;
		this.chapter_id = obj.chapter_id;
		this.chapter_name = obj.chapter_name;
		this.test_id = obj.test_id;
		this.test_code = obj.test_code;
		this.test_name = obj.test_name;
		this.order = obj.order;
		this.book_id = obj.book_id;
		this.customer_id = obj.customer_id;
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
		if(chapter_id != null)
			map.put("chapter_id", chapter_id);
		if(chapter_name != null)
			map.put("chapter_name", chapter_name);
		if(test_id != null)
			map.put("test_id", test_id);
		if(test_code != null)
			map.put("test_code", test_code);
		if(test_name != null)
			map.put("test_name", test_name);
		if(order != null)
			map.put("order", order);
		if(book_id != null)
			map.put("book_id", book_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		if(chapter_id != null)
			map.put("chapter_id", chapter_id);
		if(chapter_name != null)
			map.put("chapter_name", chapter_name);
		if(test_id != null)
			map.put("test_id", test_id);
		if(test_code != null)
			map.put("test_code", test_code);
		if(test_name != null)
			map.put("test_name", test_name);
		if(order != null)
			map.put("order", order);
		if(book_id != null)
			map.put("book_id", book_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		chapter_id = (String) map.get("chapter_id");
		chapter_name = (String) map.get("chapter_name");
		test_id = (String) map.get("test_id");
		test_code = (String) map.get("test_code");
		test_name = (String) map.get("test_name");
		order = (Long) map.get("order");
		book_id = (String) map.get("book_id");
		customer_id = (String) map.get("customer_id");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object chapter_idObj = map.get("chapter_id");
		if(chapter_idObj != null)
			chapter_id = chapter_idObj.toString();

		Object chapter_nameObj = map.get("chapter_name");
		if(chapter_nameObj != null)
			chapter_name = chapter_nameObj.toString();

		Object test_idObj = map.get("test_id");
		if(test_idObj != null)
			test_id = test_idObj.toString();

		Object test_codeObj = map.get("test_code");
		if(test_codeObj != null)
			test_code = test_codeObj.toString();

		Object test_nameObj = map.get("test_name");
		if(test_nameObj != null)
			test_name = test_nameObj.toString();

		Object orderObj = map.get("order");
		if(orderObj != null)
			order = new Long(orderObj.toString());

		Object book_idObj = map.get("book_id");
		if(book_idObj != null)
			book_id = book_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

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

	public String getChapter_id() {
		return chapter_id;
	}

	public String getChapter_idEx() {
		return chapter_id != null ? chapter_id : "";
	}

	public void setChapter_id(String chapter_id) {
		this.chapter_id = chapter_id;
	}

	public void unSetChapter_id() {
		this.chapter_id = null;
	}

	public String getChapter_name() {
		return chapter_name;
	}

	public String getChapter_nameEx() {
		return chapter_name != null ? chapter_name : "";
	}

	public void setChapter_name(String chapter_name) {
		this.chapter_name = chapter_name;
	}

	public void unSetChapter_name() {
		this.chapter_name = null;
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

	public String getTest_code() {
		return test_code;
	}

	public String getTest_codeEx() {
		return test_code != null ? test_code : "";
	}

	public void setTest_code(String test_code) {
		this.test_code = test_code;
	}

	public void unSetTest_code() {
		this.test_code = null;
	}

	public String getTest_name() {
		return test_name;
	}

	public String getTest_nameEx() {
		return test_name != null ? test_name : "";
	}

	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}

	public void unSetTest_name() {
		this.test_name = null;
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

	public String getBook_id() {
		return book_id;
	}

	public String getBook_idEx() {
		return book_id != null ? book_id : "";
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public void unSetBook_id() {
		this.book_id = null;
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