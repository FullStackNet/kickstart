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
public abstract class Baseschool extends BaseResource {
	private String id = null;
	private String name = null;
	private String short_name = null;
	private String address1 = null;
	private String address2 = null;
	private String address3 = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String group_id = null;
	private String feature_parent2parent_chat = null;
	private String feature_homework = null;
	private String feature_daily_activity = null;
	private String feature_home_practice = null;
	private String feature_notice = null;
	private String feature_teacher2parent_chat = null;
	private String feature_admin2parent_chat = null;
	private String feature_absent_report = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_SHORT_NAME = "short_name";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_ADDRESS3 = "address3";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_GROUP_ID = "group_id";
	public static String FIELD_FEATURE_PARENT2PARENT_CHAT = "feature_parent2parent_chat";
	public static String FIELD_FEATURE_HOMEWORK = "feature_homework";
	public static String FIELD_FEATURE_DAILY_ACTIVITY = "feature_daily_activity";
	public static String FIELD_FEATURE_HOME_PRACTICE = "feature_home_practice";
	public static String FIELD_FEATURE_NOTICE = "feature_notice";
	public static String FIELD_FEATURE_TEACHER2PARENT_CHAT = "feature_teacher2parent_chat";
	public static String FIELD_FEATURE_ADMIN2PARENT_CHAT = "feature_admin2parent_chat";
	public static String FIELD_FEATURE_ABSENT_REPORT = "feature_absent_report";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("school");

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

		Field short_nameField = new Field("short_name", "String");
		short_nameField.setLength(32);
		metaData.addField(short_nameField);

		Field address1Field = new Field("address1", "String");
		address1Field.setLength(128);
		metaData.addField(address1Field);

		Field address2Field = new Field("address2", "String");
		address2Field.setLength(128);
		metaData.addField(address2Field);

		Field address3Field = new Field("address3", "String");
		address3Field.setLength(128);
		metaData.addField(address3Field);

		Field cityField = new Field("city", "String");
		cityField.setLength(128);
		metaData.addField(cityField);

		Field stateField = new Field("state", "String");
		stateField.setLength(128);
		metaData.addField(stateField);

		Field countryField = new Field("country", "String");
		countryField.setLength(128);
		metaData.addField(countryField);

		Field group_idField = new Field("group_id", "String");
		group_idField.setLength(128);
		metaData.addField(group_idField);

		Field feature_parent2parent_chatField = new Field("feature_parent2parent_chat", "String");
		feature_parent2parent_chatField.setDefaultValue("N");
		feature_parent2parent_chatField.setLength(1);
		metaData.addField(feature_parent2parent_chatField);

		Field feature_homeworkField = new Field("feature_homework", "String");
		feature_homeworkField.setDefaultValue("N");
		feature_homeworkField.setLength(1);
		metaData.addField(feature_homeworkField);

		Field feature_daily_activityField = new Field("feature_daily_activity", "String");
		feature_daily_activityField.setDefaultValue("N");
		feature_daily_activityField.setLength(1);
		metaData.addField(feature_daily_activityField);

		Field feature_home_practiceField = new Field("feature_home_practice", "String");
		feature_home_practiceField.setDefaultValue("N");
		feature_home_practiceField.setLength(1);
		metaData.addField(feature_home_practiceField);

		Field feature_noticeField = new Field("feature_notice", "String");
		feature_noticeField.setDefaultValue("N");
		feature_noticeField.setLength(1);
		metaData.addField(feature_noticeField);

		Field feature_teacher2parent_chatField = new Field("feature_teacher2parent_chat", "String");
		feature_teacher2parent_chatField.setDefaultValue("N");
		feature_teacher2parent_chatField.setLength(1);
		metaData.addField(feature_teacher2parent_chatField);

		Field feature_admin2parent_chatField = new Field("feature_admin2parent_chat", "String");
		feature_admin2parent_chatField.setDefaultValue("N");
		feature_admin2parent_chatField.setLength(1);
		metaData.addField(feature_admin2parent_chatField);

		Field feature_absent_reportField = new Field("feature_absent_report", "String");
		feature_absent_reportField.setDefaultValue("N");
		feature_absent_reportField.setLength(1);
		metaData.addField(feature_absent_reportField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("school");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseschool() {}

	public Baseschool(Baseschool obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.short_name = obj.short_name;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.address3 = obj.address3;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.group_id = obj.group_id;
		this.feature_parent2parent_chat = obj.feature_parent2parent_chat;
		this.feature_homework = obj.feature_homework;
		this.feature_daily_activity = obj.feature_daily_activity;
		this.feature_home_practice = obj.feature_home_practice;
		this.feature_notice = obj.feature_notice;
		this.feature_teacher2parent_chat = obj.feature_teacher2parent_chat;
		this.feature_admin2parent_chat = obj.feature_admin2parent_chat;
		this.feature_absent_report = obj.feature_absent_report;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(feature_parent2parent_chat == null)
			feature_parent2parent_chat = "N";
		if(feature_homework == null)
			feature_homework = "N";
		if(feature_daily_activity == null)
			feature_daily_activity = "N";
		if(feature_home_practice == null)
			feature_home_practice = "N";
		if(feature_notice == null)
			feature_notice = "N";
		if(feature_teacher2parent_chat == null)
			feature_teacher2parent_chat = "N";
		if(feature_admin2parent_chat == null)
			feature_admin2parent_chat = "N";
		if(feature_absent_report == null)
			feature_absent_report = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(short_name != null)
			map.put("short_name", short_name);
		if(address1 != null)
			map.put("address1", address1);
		if(address2 != null)
			map.put("address2", address2);
		if(address3 != null)
			map.put("address3", address3);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(group_id != null)
			map.put("group_id", group_id);
		if(feature_parent2parent_chat != null)
			map.put("feature_parent2parent_chat", feature_parent2parent_chat);
		if(feature_homework != null)
			map.put("feature_homework", feature_homework);
		if(feature_daily_activity != null)
			map.put("feature_daily_activity", feature_daily_activity);
		if(feature_home_practice != null)
			map.put("feature_home_practice", feature_home_practice);
		if(feature_notice != null)
			map.put("feature_notice", feature_notice);
		if(feature_teacher2parent_chat != null)
			map.put("feature_teacher2parent_chat", feature_teacher2parent_chat);
		if(feature_admin2parent_chat != null)
			map.put("feature_admin2parent_chat", feature_admin2parent_chat);
		if(feature_absent_report != null)
			map.put("feature_absent_report", feature_absent_report);
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
		if(short_name != null)
			map.put("short_name", short_name);
		if(address1 != null)
			map.put("address1", address1);
		if(address2 != null)
			map.put("address2", address2);
		if(address3 != null)
			map.put("address3", address3);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(group_id != null)
			map.put("group_id", group_id);
		if(feature_parent2parent_chat != null)
			map.put("feature_parent2parent_chat", feature_parent2parent_chat);
		if(feature_homework != null)
			map.put("feature_homework", feature_homework);
		if(feature_daily_activity != null)
			map.put("feature_daily_activity", feature_daily_activity);
		if(feature_home_practice != null)
			map.put("feature_home_practice", feature_home_practice);
		if(feature_notice != null)
			map.put("feature_notice", feature_notice);
		if(feature_teacher2parent_chat != null)
			map.put("feature_teacher2parent_chat", feature_teacher2parent_chat);
		if(feature_admin2parent_chat != null)
			map.put("feature_admin2parent_chat", feature_admin2parent_chat);
		if(feature_absent_report != null)
			map.put("feature_absent_report", feature_absent_report);
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
		short_name = (String) map.get("short_name");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		address3 = (String) map.get("address3");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		group_id = (String) map.get("group_id");
		feature_parent2parent_chat = (String) map.get("feature_parent2parent_chat");
		feature_homework = (String) map.get("feature_homework");
		feature_daily_activity = (String) map.get("feature_daily_activity");
		feature_home_practice = (String) map.get("feature_home_practice");
		feature_notice = (String) map.get("feature_notice");
		feature_teacher2parent_chat = (String) map.get("feature_teacher2parent_chat");
		feature_admin2parent_chat = (String) map.get("feature_admin2parent_chat");
		feature_absent_report = (String) map.get("feature_absent_report");
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

		Object short_nameObj = map.get("short_name");
		if(short_nameObj != null)
			short_name = short_nameObj.toString();

		Object address1Obj = map.get("address1");
		if(address1Obj != null)
			address1 = address1Obj.toString();

		Object address2Obj = map.get("address2");
		if(address2Obj != null)
			address2 = address2Obj.toString();

		Object address3Obj = map.get("address3");
		if(address3Obj != null)
			address3 = address3Obj.toString();

		Object cityObj = map.get("city");
		if(cityObj != null)
			city = cityObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object countryObj = map.get("country");
		if(countryObj != null)
			country = countryObj.toString();

		Object group_idObj = map.get("group_id");
		if(group_idObj != null)
			group_id = group_idObj.toString();

		Object feature_parent2parent_chatObj = map.get("feature_parent2parent_chat");
		if(feature_parent2parent_chatObj != null)
			feature_parent2parent_chat = feature_parent2parent_chatObj.toString();

		Object feature_homeworkObj = map.get("feature_homework");
		if(feature_homeworkObj != null)
			feature_homework = feature_homeworkObj.toString();

		Object feature_daily_activityObj = map.get("feature_daily_activity");
		if(feature_daily_activityObj != null)
			feature_daily_activity = feature_daily_activityObj.toString();

		Object feature_home_practiceObj = map.get("feature_home_practice");
		if(feature_home_practiceObj != null)
			feature_home_practice = feature_home_practiceObj.toString();

		Object feature_noticeObj = map.get("feature_notice");
		if(feature_noticeObj != null)
			feature_notice = feature_noticeObj.toString();

		Object feature_teacher2parent_chatObj = map.get("feature_teacher2parent_chat");
		if(feature_teacher2parent_chatObj != null)
			feature_teacher2parent_chat = feature_teacher2parent_chatObj.toString();

		Object feature_admin2parent_chatObj = map.get("feature_admin2parent_chat");
		if(feature_admin2parent_chatObj != null)
			feature_admin2parent_chat = feature_admin2parent_chatObj.toString();

		Object feature_absent_reportObj = map.get("feature_absent_report");
		if(feature_absent_reportObj != null)
			feature_absent_report = feature_absent_reportObj.toString();

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

	public String getShort_name() {
		return short_name;
	}

	public String getShort_nameEx() {
		return short_name != null ? short_name : "";
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public void unSetShort_name() {
		this.short_name = null;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress1Ex() {
		return address1 != null ? address1 : "";
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void unSetAddress1() {
		this.address1 = null;
	}

	public String getAddress2() {
		return address2;
	}

	public String getAddress2Ex() {
		return address2 != null ? address2 : "";
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void unSetAddress2() {
		this.address2 = null;
	}

	public String getAddress3() {
		return address3;
	}

	public String getAddress3Ex() {
		return address3 != null ? address3 : "";
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public void unSetAddress3() {
		this.address3 = null;
	}

	public String getCity() {
		return city;
	}

	public String getCityEx() {
		return city != null ? city : "";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void unSetCity() {
		this.city = null;
	}

	public String getState() {
		return state;
	}

	public String getStateEx() {
		return state != null ? state : "";
	}

	public void setState(String state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = null;
	}

	public String getCountry() {
		return country;
	}

	public String getCountryEx() {
		return country != null ? country : "";
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void unSetCountry() {
		this.country = null;
	}

	public String getGroup_id() {
		return group_id;
	}

	public String getGroup_idEx() {
		return group_id != null ? group_id : "";
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public void unSetGroup_id() {
		this.group_id = null;
	}

	public String getFeature_parent2parent_chat() {
		return feature_parent2parent_chat != null ? feature_parent2parent_chat : "N";
	}

	public void setFeature_parent2parent_chat(String feature_parent2parent_chat) {
		this.feature_parent2parent_chat = feature_parent2parent_chat;
	}

	public void unSetFeature_parent2parent_chat() {
		this.feature_parent2parent_chat = "N";
	}

	public String getFeature_homework() {
		return feature_homework != null ? feature_homework : "N";
	}

	public void setFeature_homework(String feature_homework) {
		this.feature_homework = feature_homework;
	}

	public void unSetFeature_homework() {
		this.feature_homework = "N";
	}

	public String getFeature_daily_activity() {
		return feature_daily_activity != null ? feature_daily_activity : "N";
	}

	public void setFeature_daily_activity(String feature_daily_activity) {
		this.feature_daily_activity = feature_daily_activity;
	}

	public void unSetFeature_daily_activity() {
		this.feature_daily_activity = "N";
	}

	public String getFeature_home_practice() {
		return feature_home_practice != null ? feature_home_practice : "N";
	}

	public void setFeature_home_practice(String feature_home_practice) {
		this.feature_home_practice = feature_home_practice;
	}

	public void unSetFeature_home_practice() {
		this.feature_home_practice = "N";
	}

	public String getFeature_notice() {
		return feature_notice != null ? feature_notice : "N";
	}

	public void setFeature_notice(String feature_notice) {
		this.feature_notice = feature_notice;
	}

	public void unSetFeature_notice() {
		this.feature_notice = "N";
	}

	public String getFeature_teacher2parent_chat() {
		return feature_teacher2parent_chat != null ? feature_teacher2parent_chat : "N";
	}

	public void setFeature_teacher2parent_chat(String feature_teacher2parent_chat) {
		this.feature_teacher2parent_chat = feature_teacher2parent_chat;
	}

	public void unSetFeature_teacher2parent_chat() {
		this.feature_teacher2parent_chat = "N";
	}

	public String getFeature_admin2parent_chat() {
		return feature_admin2parent_chat != null ? feature_admin2parent_chat : "N";
	}

	public void setFeature_admin2parent_chat(String feature_admin2parent_chat) {
		this.feature_admin2parent_chat = feature_admin2parent_chat;
	}

	public void unSetFeature_admin2parent_chat() {
		this.feature_admin2parent_chat = "N";
	}

	public String getFeature_absent_report() {
		return feature_absent_report != null ? feature_absent_report : "N";
	}

	public void setFeature_absent_report(String feature_absent_report) {
		this.feature_absent_report = feature_absent_report;
	}

	public void unSetFeature_absent_report() {
		this.feature_absent_report = "N";
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
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}