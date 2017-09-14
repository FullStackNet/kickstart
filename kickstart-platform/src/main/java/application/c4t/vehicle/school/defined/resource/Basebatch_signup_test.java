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
public abstract class Basebatch_signup_test extends BaseResource {
	private String id = null;
	private String batch_id = null;
	private String batch_name = null;
	private String test_id = null;
	private String test_code = null;
	private Integer order = null;
	private String test_name = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_BATCH_ID = "batch_id";
	public static String FIELD_BATCH_NAME = "batch_name";
	public static String FIELD_TEST_ID = "test_id";
	public static String FIELD_TEST_CODE = "test_code";
	public static String FIELD_ORDER = "order";
	public static String FIELD_TEST_NAME = "test_name";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("batch_signup_test");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field batch_idField = new Field("batch_id", "String");
		batch_idField.setLength(128);
		metaData.addField(batch_idField);

		Field batch_nameField = new Field("batch_name", "String");
		batch_nameField.setLength(128);
		metaData.addField(batch_nameField);

		Field test_idField = new Field("test_id", "String");
		test_idField.setLength(128);
		metaData.addField(test_idField);

		Field test_codeField = new Field("test_code", "String");
		test_codeField.setLength(128);
		metaData.addField(test_codeField);

		Field orderField = new Field("order", "int");
		metaData.addField(orderField);

		Field test_nameField = new Field("test_name", "String");
		test_nameField.setLength(128);
		metaData.addField(test_nameField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("batch_signup_test");

		metaData.setCluster("DB_LOG");
	}

	public Basebatch_signup_test() {}

	public Basebatch_signup_test(Basebatch_signup_test obj) {
		this.id = obj.id;
		this.batch_id = obj.batch_id;
		this.batch_name = obj.batch_name;
		this.test_id = obj.test_id;
		this.test_code = obj.test_code;
		this.order = obj.order;
		this.test_name = obj.test_name;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(test_id != null)
			map.put("test_id", test_id);
		if(test_code != null)
			map.put("test_code", test_code);
		if(order != null)
			map.put("order", order);
		if(test_name != null)
			map.put("test_name", test_name);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(test_id != null)
			map.put("test_id", test_id);
		if(test_code != null)
			map.put("test_code", test_code);
		if(order != null)
			map.put("order", order);
		if(test_name != null)
			map.put("test_name", test_name);
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
		batch_id = (String) map.get("batch_id");
		batch_name = (String) map.get("batch_name");
		test_id = (String) map.get("test_id");
		test_code = (String) map.get("test_code");
		order = (Integer) map.get("order");
		test_name = (String) map.get("test_name");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object batch_idObj = map.get("batch_id");
		if(batch_idObj != null)
			batch_id = batch_idObj.toString();

		Object batch_nameObj = map.get("batch_name");
		if(batch_nameObj != null)
			batch_name = batch_nameObj.toString();

		Object test_idObj = map.get("test_id");
		if(test_idObj != null)
			test_id = test_idObj.toString();

		Object test_codeObj = map.get("test_code");
		if(test_codeObj != null)
			test_code = test_codeObj.toString();

		Object orderObj = map.get("order");
		if(orderObj != null)
			order = new Integer(orderObj.toString());

		Object test_nameObj = map.get("test_name");
		if(test_nameObj != null)
			test_name = test_nameObj.toString();

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

	public String getBatch_id() {
		return batch_id;
	}

	public String getBatch_idEx() {
		return batch_id != null ? batch_id : "";
	}

	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}

	public void unSetBatch_id() {
		this.batch_id = null;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public String getBatch_nameEx() {
		return batch_name != null ? batch_name : "";
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public void unSetBatch_name() {
		this.batch_name = null;
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

	public Integer getOrder() {
		return order;
	}

	public int getOrderEx() {
		return order != null ? order : 0;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public void unSetOrder() {
		this.order = null;
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
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}