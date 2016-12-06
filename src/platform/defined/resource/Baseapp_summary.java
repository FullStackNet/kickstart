/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseapp_summary extends BaseResource {
	private String id = null;
	private Long total_users = null;
	private Long total_tests = null;
	private Long total_test_series = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TOTAL_USERS = "total_users";
	public static String FIELD_TOTAL_TESTS = "total_tests";
	public static String FIELD_TOTAL_TEST_SERIES = "total_test_series";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("app_summary");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field total_usersField = new Field("total_users", "long");
		metaData.addField(total_usersField);

		Field total_testsField = new Field("total_tests", "long");
		metaData.addField(total_testsField);

		Field total_test_seriesField = new Field("total_test_series", "long");
		metaData.addField(total_test_seriesField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("app_summary");

		metaData.setCluster("DB_OBJECT");
	}

	public Baseapp_summary() {}

	public Baseapp_summary(Baseapp_summary obj) {
		this.id = obj.id;
		this.total_users = obj.total_users;
		this.total_tests = obj.total_tests;
		this.total_test_series = obj.total_test_series;
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
		if(total_users != null)
			map.put("total_users", total_users);
		if(total_tests != null)
			map.put("total_tests", total_tests);
		if(total_test_series != null)
			map.put("total_test_series", total_test_series);
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
		if(total_users != null)
			map.put("total_users", total_users);
		if(total_tests != null)
			map.put("total_tests", total_tests);
		if(total_test_series != null)
			map.put("total_test_series", total_test_series);
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
		total_users = (Long) map.get("total_users");
		total_tests = (Long) map.get("total_tests");
		total_test_series = (Long) map.get("total_test_series");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object total_usersObj = map.get("total_users");
		if(total_usersObj != null)
			total_users = new Long(total_usersObj.toString());

		Object total_testsObj = map.get("total_tests");
		if(total_testsObj != null)
			total_tests = new Long(total_testsObj.toString());

		Object total_test_seriesObj = map.get("total_test_series");
		if(total_test_seriesObj != null)
			total_test_series = new Long(total_test_seriesObj.toString());

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

	public Long getTotal_users() {
		return total_users;
	}

	public long getTotal_usersEx() {
		return total_users != null ? total_users : 0L;
	}

	public void setTotal_users(long total_users) {
		this.total_users = total_users;
	}

	public void setTotal_users(Long total_users) {
		this.total_users = total_users;
	}

	public void unSetTotal_users() {
		this.total_users = null;
	}

	public Long getTotal_tests() {
		return total_tests;
	}

	public long getTotal_testsEx() {
		return total_tests != null ? total_tests : 0L;
	}

	public void setTotal_tests(long total_tests) {
		this.total_tests = total_tests;
	}

	public void setTotal_tests(Long total_tests) {
		this.total_tests = total_tests;
	}

	public void unSetTotal_tests() {
		this.total_tests = null;
	}

	public Long getTotal_test_series() {
		return total_test_series;
	}

	public long getTotal_test_seriesEx() {
		return total_test_series != null ? total_test_series : 0L;
	}

	public void setTotal_test_series(long total_test_series) {
		this.total_test_series = total_test_series;
	}

	public void setTotal_test_series(Long total_test_series) {
		this.total_test_series = total_test_series;
	}

	public void unSetTotal_test_series() {
		this.total_test_series = null;
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
		return "DB_OBJECT";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}