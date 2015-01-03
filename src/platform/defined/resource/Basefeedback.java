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
public abstract class Basefeedback extends BaseResource {
	private String id = null;
	private String mobile_no = null;
	private String email_id = null;
	private Long creation_time = null;
	private String title = null;
	private String description = null;
	private String user_id = null;
	private String user_name = null;
	private String school_id = null;
	private String feedback_type = null;
	private String app_name = null;
	private String candidate_id = null;
	private String candidate_name = null;
	private String candidate_mobile_no = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_FEEDBACK_TYPE = "feedback_type";
	public static String FIELD_APP_NAME = "app_name";
	public static String FIELD_CANDIDATE_ID = "candidate_id";
	public static String FIELD_CANDIDATE_NAME = "candidate_name";
	public static String FIELD_CANDIDATE_MOBILE_NO = "candidate_mobile_no";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("feedback");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setRequired(true);
		mobile_noField.setLength(32);
		metaData.addField(mobile_noField);

		Field email_idField = new Field("email_id", "String");
		email_idField.setRequired(true);
		email_idField.setLength(128);
		metaData.addField(email_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		creation_timeField.setRequired(true);
		creation_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(creation_timeField);

		Field titleField = new Field("title", "String");
		titleField.setLength(128);
		metaData.addField(titleField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(128);
		metaData.addField(descriptionField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(128);
		metaData.addField(user_nameField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field feedback_typeField = new Field("feedback_type", "String");
		feedback_typeField.setLength(128);
		metaData.addField(feedback_typeField);

		Field app_nameField = new Field("app_name", "String");
		app_nameField.setLength(128);
		metaData.addField(app_nameField);

		Field candidate_idField = new Field("candidate_id", "String");
		candidate_idField.setLength(128);
		metaData.addField(candidate_idField);

		Field candidate_nameField = new Field("candidate_name", "String");
		candidate_nameField.setLength(128);
		metaData.addField(candidate_nameField);

		Field candidate_mobile_noField = new Field("candidate_mobile_no", "String");
		candidate_mobile_noField.setLength(128);
		metaData.addField(candidate_mobile_noField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("feedback");

		metaData.setCluster("DB_ANALYSIS");
	}

	public Basefeedback() {}

	public Basefeedback(Basefeedback obj) {
		this.id = obj.id;
		this.mobile_no = obj.mobile_no;
		this.email_id = obj.email_id;
		this.creation_time = obj.creation_time;
		this.title = obj.title;
		this.description = obj.description;
		this.user_id = obj.user_id;
		this.user_name = obj.user_name;
		this.school_id = obj.school_id;
		this.feedback_type = obj.feedback_type;
		this.app_name = obj.app_name;
		this.candidate_id = obj.candidate_id;
		this.candidate_name = obj.candidate_name;
		this.candidate_mobile_no = obj.candidate_mobile_no;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(feedback_type != null)
			map.put("feedback_type", feedback_type);
		if(app_name != null)
			map.put("app_name", app_name);
		if(candidate_id != null)
			map.put("candidate_id", candidate_id);
		if(candidate_name != null)
			map.put("candidate_name", candidate_name);
		if(candidate_mobile_no != null)
			map.put("candidate_mobile_no", candidate_mobile_no);
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
		if(validateMobile_no(add))
			map.put("mobile_no", mobile_no);
		if(validateEmail_id(add))
			map.put("email_id", email_id);
		if(validateCreation_time(add))
			map.put("creation_time", creation_time);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(feedback_type != null)
			map.put("feedback_type", feedback_type);
		if(app_name != null)
			map.put("app_name", app_name);
		if(candidate_id != null)
			map.put("candidate_id", candidate_id);
		if(candidate_name != null)
			map.put("candidate_name", candidate_name);
		if(candidate_mobile_no != null)
			map.put("candidate_mobile_no", candidate_mobile_no);
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
		mobile_no = (String) map.get("mobile_no");
		email_id = (String) map.get("email_id");
		creation_time = (Long) map.get("creation_time");
		title = (String) map.get("title");
		description = (String) map.get("description");
		user_id = (String) map.get("user_id");
		user_name = (String) map.get("user_name");
		school_id = (String) map.get("school_id");
		feedback_type = (String) map.get("feedback_type");
		app_name = (String) map.get("app_name");
		candidate_id = (String) map.get("candidate_id");
		candidate_name = (String) map.get("candidate_name");
		candidate_mobile_no = (String) map.get("candidate_mobile_no");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object feedback_typeObj = map.get("feedback_type");
		if(feedback_typeObj != null)
			feedback_type = feedback_typeObj.toString();

		Object app_nameObj = map.get("app_name");
		if(app_nameObj != null)
			app_name = app_nameObj.toString();

		Object candidate_idObj = map.get("candidate_id");
		if(candidate_idObj != null)
			candidate_id = candidate_idObj.toString();

		Object candidate_nameObj = map.get("candidate_name");
		if(candidate_nameObj != null)
			candidate_name = candidate_nameObj.toString();

		Object candidate_mobile_noObj = map.get("candidate_mobile_no");
		if(candidate_mobile_noObj != null)
			candidate_mobile_no = candidate_mobile_noObj.toString();

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

	public String getMobile_no() {
		return mobile_no;
	}

	public String getMobile_noEx() {
		return mobile_no != null ? mobile_no : "";
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public void unSetMobile_no() {
		this.mobile_no = null;
	}

	public boolean validateMobile_no(boolean add) throws ApplicationException {
		if(add && mobile_no == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[mobile_no]");
		return mobile_no != null;
	}

	public String getEmail_id() {
		return email_id;
	}

	public String getEmail_idEx() {
		return email_id != null ? email_id : "";
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public void unSetEmail_id() {
		this.email_id = null;
	}

	public boolean validateEmail_id(boolean add) throws ApplicationException {
		if(add && email_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[email_id]");
		return email_id != null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public boolean validateCreation_time(boolean add) throws ApplicationException {
		if(add && creation_time == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[creation_time]");
		return creation_time != null;
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

	public String getSchool_id() {
		return school_id;
	}

	public String getSchool_idEx() {
		return school_id != null ? school_id : "";
	}

	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}

	public void unSetSchool_id() {
		this.school_id = null;
	}

	public String getFeedback_type() {
		return feedback_type;
	}

	public String getFeedback_typeEx() {
		return feedback_type != null ? feedback_type : "";
	}

	public void setFeedback_type(String feedback_type) {
		this.feedback_type = feedback_type;
	}

	public void unSetFeedback_type() {
		this.feedback_type = null;
	}

	public String getApp_name() {
		return app_name;
	}

	public String getApp_nameEx() {
		return app_name != null ? app_name : "";
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public void unSetApp_name() {
		this.app_name = null;
	}

	public String getCandidate_id() {
		return candidate_id;
	}

	public String getCandidate_idEx() {
		return candidate_id != null ? candidate_id : "";
	}

	public void setCandidate_id(String candidate_id) {
		this.candidate_id = candidate_id;
	}

	public void unSetCandidate_id() {
		this.candidate_id = null;
	}

	public String getCandidate_name() {
		return candidate_name;
	}

	public String getCandidate_nameEx() {
		return candidate_name != null ? candidate_name : "";
	}

	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}

	public void unSetCandidate_name() {
		this.candidate_name = null;
	}

	public String getCandidate_mobile_no() {
		return candidate_mobile_no;
	}

	public String getCandidate_mobile_noEx() {
		return candidate_mobile_no != null ? candidate_mobile_no : "";
	}

	public void setCandidate_mobile_no(String candidate_mobile_no) {
		this.candidate_mobile_no = candidate_mobile_no;
	}

	public void unSetCandidate_mobile_no() {
		this.candidate_mobile_no = null;
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
		return "DB_ANALYSIS";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}