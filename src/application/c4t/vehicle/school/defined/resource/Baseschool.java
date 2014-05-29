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
	private String address1 = null;
	private String address2 = null;
	private String address3 = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String group_id = null;
	private String feature_parent2parent_chat = null;
	private String feature_homework = null;
	private String feature_teacher2parent_chat = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_ADDRESS3 = "address3";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_GROUP_ID = "group_id";
	public static String FIELD_FEATURE_PARENT2PARENT_CHAT = "feature_parent2parent_chat";
	public static String FIELD_FEATURE_HOMEWORK = "feature_homework";
	public static String FIELD_FEATURE_TEACHER2PARENT_CHAT = "feature_teacher2parent_chat";

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

		Field feature_teacher2parent_chatField = new Field("feature_teacher2parent_chat", "String");
		feature_teacher2parent_chatField.setDefaultValue("N");
		feature_teacher2parent_chatField.setLength(1);
		metaData.addField(feature_teacher2parent_chatField);


		metaData.setTableName("school");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseschool() {}

	public Baseschool(Baseschool obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.address3 = obj.address3;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.group_id = obj.group_id;
		this.feature_parent2parent_chat = obj.feature_parent2parent_chat;
		this.feature_homework = obj.feature_homework;
		this.feature_teacher2parent_chat = obj.feature_teacher2parent_chat;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(feature_parent2parent_chat == null)
			feature_parent2parent_chat = "N";
		if(feature_homework == null)
			feature_homework = "N";
		if(feature_teacher2parent_chat == null)
			feature_teacher2parent_chat = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
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
		if(feature_teacher2parent_chat != null)
			map.put("feature_teacher2parent_chat", feature_teacher2parent_chat);
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
		if(feature_teacher2parent_chat != null)
			map.put("feature_teacher2parent_chat", feature_teacher2parent_chat);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		name = (String) map.get("name");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		address3 = (String) map.get("address3");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		group_id = (String) map.get("group_id");
		feature_parent2parent_chat = (String) map.get("feature_parent2parent_chat");
		feature_homework = (String) map.get("feature_homework");
		feature_teacher2parent_chat = (String) map.get("feature_teacher2parent_chat");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

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

		Object feature_teacher2parent_chatObj = map.get("feature_teacher2parent_chat");
		if(feature_teacher2parent_chatObj != null)
			feature_teacher2parent_chat = feature_teacher2parent_chatObj.toString();

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

	public String getFeature_teacher2parent_chat() {
		return feature_teacher2parent_chat != null ? feature_teacher2parent_chat : "N";
	}

	public void setFeature_teacher2parent_chat(String feature_teacher2parent_chat) {
		this.feature_teacher2parent_chat = feature_teacher2parent_chat;
	}

	public void unSetFeature_teacher2parent_chat() {
		this.feature_teacher2parent_chat = "N";
	}
	public String getCluster() {
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}