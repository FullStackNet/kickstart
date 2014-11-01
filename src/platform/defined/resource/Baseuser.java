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
public abstract class Baseuser extends BaseResource {
	private String id = null;
	private String password = null;
	private String type = null;
	private String name = null;
	private String mobile_no = null;
	private String email_id = null;
	private String customer_id = null;
	private String dob = null;
	private String occupation = null;
	private String role = null;
	private String company_name = null;
	private String state = null;
	private String parentService = null;
	private String teacherService = null;
	private String fleetService = null;
	private String schoolTrackerService = null;
	private String dgService = null;
	private String key = null;
	private String routeSettingService = null;
	private String homeAutomationService = null;
	private String schoolAdminService = null;
	private String operation_student_delete = null;
	private String operation_student_edit = null;
	private String configuration_edit = null;
	private String configuration_delete = null;
	private String super_user = null;
	private Long last_login = null;
	private String feature_homework_sms = null;
	private String feature_daily_activity_sms = null;
	private String feature_home_practice_sms = null;
	private String feature_notice_sms = null;
	private String feature_absent_report_sms = null;
	private String feature_pick_drop_sms = null;
	private String feature_message2parent_sms = null;
	private String feature_homework_email = null;
	private String feature_daily_activity_email = null;
	private String feature_home_practice_email = null;
	private String feature_notice_email = null;
	private String feature_absent_report_email = null;
	private String feature_pick_drop_email = null;
	private String feature_message2parent_email = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_TYPE = "type";
	public static String FIELD_NAME = "name";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_DOB = "dob";
	public static String FIELD_OCCUPATION = "occupation";
	public static String FIELD_ROLE = "role";
	public static String FIELD_COMPANY_NAME = "company_name";
	public static String FIELD_STATE = "state";
	public static String FIELD_PARENTSERVICE = "parentService";
	public static String FIELD_TEACHERSERVICE = "teacherService";
	public static String FIELD_FLEETSERVICE = "fleetService";
	public static String FIELD_SCHOOLTRACKERSERVICE = "schoolTrackerService";
	public static String FIELD_DGSERVICE = "dgService";
	public static String FIELD_KEY = "key";
	public static String FIELD_ROUTESETTINGSERVICE = "routeSettingService";
	public static String FIELD_HOMEAUTOMATIONSERVICE = "homeAutomationService";
	public static String FIELD_SCHOOLADMINSERVICE = "schoolAdminService";
	public static String FIELD_OPERATION_STUDENT_DELETE = "operation_student_delete";
	public static String FIELD_OPERATION_STUDENT_EDIT = "operation_student_edit";
	public static String FIELD_CONFIGURATION_EDIT = "configuration_edit";
	public static String FIELD_CONFIGURATION_DELETE = "configuration_delete";
	public static String FIELD_SUPER_USER = "super_user";
	public static String FIELD_LAST_LOGIN = "last_login";
	public static String FIELD_FEATURE_HOMEWORK_SMS = "feature_homework_sms";
	public static String FIELD_FEATURE_DAILY_ACTIVITY_SMS = "feature_daily_activity_sms";
	public static String FIELD_FEATURE_HOME_PRACTICE_SMS = "feature_home_practice_sms";
	public static String FIELD_FEATURE_NOTICE_SMS = "feature_notice_sms";
	public static String FIELD_FEATURE_ABSENT_REPORT_SMS = "feature_absent_report_sms";
	public static String FIELD_FEATURE_PICK_DROP_SMS = "feature_pick_drop_sms";
	public static String FIELD_FEATURE_MESSAGE2PARENT_SMS = "feature_message2parent_sms";
	public static String FIELD_FEATURE_HOMEWORK_EMAIL = "feature_homework_email";
	public static String FIELD_FEATURE_DAILY_ACTIVITY_EMAIL = "feature_daily_activity_email";
	public static String FIELD_FEATURE_HOME_PRACTICE_EMAIL = "feature_home_practice_email";
	public static String FIELD_FEATURE_NOTICE_EMAIL = "feature_notice_email";
	public static String FIELD_FEATURE_ABSENT_REPORT_EMAIL = "feature_absent_report_email";
	public static String FIELD_FEATURE_PICK_DROP_EMAIL = "feature_pick_drop_email";
	public static String FIELD_FEATURE_MESSAGE2PARENT_EMAIL = "feature_message2parent_email";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("user");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field passwordField = new Field("password", "String");
		passwordField.setRequired(true);
		passwordField.setLength(32);
		metaData.addField(passwordField);

		Field typeField = new Field("type", "String");
		typeField.setRequired(true);
		typeField.setLength(32);
		metaData.addField(typeField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setIndexed(true);
		mobile_noField.setLength(128);
		metaData.addField(mobile_noField);

		Field email_idField = new Field("email_id", "String");
		email_idField.setIndexed(true);
		email_idField.setLength(128);
		metaData.addField(email_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field dobField = new Field("dob", "String");
		dobField.setLength(128);
		metaData.addField(dobField);

		Field occupationField = new Field("occupation", "String");
		occupationField.setLength(128);
		metaData.addField(occupationField);

		Field roleField = new Field("role", "String");
		roleField.setLength(128);
		metaData.addField(roleField);

		Field company_nameField = new Field("company_name", "String");
		company_nameField.setLength(128);
		metaData.addField(company_nameField);

		Field stateField = new Field("state", "String");
		stateField.setLength(32);
		metaData.addField(stateField);

		Field parentServiceField = new Field("parentService", "String");
		parentServiceField.setDefaultValue("N");
		parentServiceField.setLength(1);
		metaData.addField(parentServiceField);

		Field teacherServiceField = new Field("teacherService", "String");
		teacherServiceField.setDefaultValue("N");
		teacherServiceField.setLength(1);
		metaData.addField(teacherServiceField);

		Field fleetServiceField = new Field("fleetService", "String");
		fleetServiceField.setDefaultValue("N");
		fleetServiceField.setLength(1);
		metaData.addField(fleetServiceField);

		Field schoolTrackerServiceField = new Field("schoolTrackerService", "String");
		schoolTrackerServiceField.setDefaultValue("N");
		schoolTrackerServiceField.setLength(1);
		metaData.addField(schoolTrackerServiceField);

		Field dgServiceField = new Field("dgService", "String");
		dgServiceField.setDefaultValue("N");
		dgServiceField.setLength(1);
		metaData.addField(dgServiceField);

		Field keyField = new Field("key", "String");
		keyField.setLength(128);
		metaData.addField(keyField);

		Field routeSettingServiceField = new Field("routeSettingService", "String");
		routeSettingServiceField.setDefaultValue("N");
		routeSettingServiceField.setLength(1);
		metaData.addField(routeSettingServiceField);

		Field homeAutomationServiceField = new Field("homeAutomationService", "String");
		homeAutomationServiceField.setDefaultValue("N");
		homeAutomationServiceField.setLength(1);
		metaData.addField(homeAutomationServiceField);

		Field schoolAdminServiceField = new Field("schoolAdminService", "String");
		schoolAdminServiceField.setDefaultValue("N");
		schoolAdminServiceField.setLength(1);
		metaData.addField(schoolAdminServiceField);

		Field operation_student_deleteField = new Field("operation_student_delete", "String");
		operation_student_deleteField.setDefaultValue("N");
		operation_student_deleteField.setLength(1);
		metaData.addField(operation_student_deleteField);

		Field operation_student_editField = new Field("operation_student_edit", "String");
		operation_student_editField.setDefaultValue("N");
		operation_student_editField.setLength(1);
		metaData.addField(operation_student_editField);

		Field configuration_editField = new Field("configuration_edit", "String");
		configuration_editField.setDefaultValue("N");
		configuration_editField.setLength(1);
		metaData.addField(configuration_editField);

		Field configuration_deleteField = new Field("configuration_delete", "String");
		configuration_deleteField.setDefaultValue("N");
		configuration_deleteField.setLength(1);
		metaData.addField(configuration_deleteField);

		Field super_userField = new Field("super_user", "String");
		super_userField.setDefaultValue("N");
		super_userField.setLength(1);
		metaData.addField(super_userField);

		Field last_loginField = new Field("last_login", "timestamp");
		metaData.addField(last_loginField);

		Field feature_homework_smsField = new Field("feature_homework_sms", "String");
		feature_homework_smsField.setDefaultValue("N");
		feature_homework_smsField.setLength(1);
		metaData.addField(feature_homework_smsField);

		Field feature_daily_activity_smsField = new Field("feature_daily_activity_sms", "String");
		feature_daily_activity_smsField.setDefaultValue("N");
		feature_daily_activity_smsField.setLength(1);
		metaData.addField(feature_daily_activity_smsField);

		Field feature_home_practice_smsField = new Field("feature_home_practice_sms", "String");
		feature_home_practice_smsField.setDefaultValue("N");
		feature_home_practice_smsField.setLength(1);
		metaData.addField(feature_home_practice_smsField);

		Field feature_notice_smsField = new Field("feature_notice_sms", "String");
		feature_notice_smsField.setDefaultValue("Y");
		feature_notice_smsField.setLength(1);
		metaData.addField(feature_notice_smsField);

		Field feature_absent_report_smsField = new Field("feature_absent_report_sms", "String");
		feature_absent_report_smsField.setDefaultValue("N");
		feature_absent_report_smsField.setLength(1);
		metaData.addField(feature_absent_report_smsField);

		Field feature_pick_drop_smsField = new Field("feature_pick_drop_sms", "String");
		feature_pick_drop_smsField.setDefaultValue("Y");
		feature_pick_drop_smsField.setLength(1);
		metaData.addField(feature_pick_drop_smsField);

		Field feature_message2parent_smsField = new Field("feature_message2parent_sms", "String");
		feature_message2parent_smsField.setDefaultValue("Y");
		feature_message2parent_smsField.setLength(1);
		metaData.addField(feature_message2parent_smsField);

		Field feature_homework_emailField = new Field("feature_homework_email", "String");
		feature_homework_emailField.setDefaultValue("N");
		feature_homework_emailField.setLength(1);
		metaData.addField(feature_homework_emailField);

		Field feature_daily_activity_emailField = new Field("feature_daily_activity_email", "String");
		feature_daily_activity_emailField.setDefaultValue("N");
		feature_daily_activity_emailField.setLength(1);
		metaData.addField(feature_daily_activity_emailField);

		Field feature_home_practice_emailField = new Field("feature_home_practice_email", "String");
		feature_home_practice_emailField.setDefaultValue("N");
		feature_home_practice_emailField.setLength(1);
		metaData.addField(feature_home_practice_emailField);

		Field feature_notice_emailField = new Field("feature_notice_email", "String");
		feature_notice_emailField.setDefaultValue("Y");
		feature_notice_emailField.setLength(1);
		metaData.addField(feature_notice_emailField);

		Field feature_absent_report_emailField = new Field("feature_absent_report_email", "String");
		feature_absent_report_emailField.setDefaultValue("N");
		feature_absent_report_emailField.setLength(1);
		metaData.addField(feature_absent_report_emailField);

		Field feature_pick_drop_emailField = new Field("feature_pick_drop_email", "String");
		feature_pick_drop_emailField.setDefaultValue("Y");
		feature_pick_drop_emailField.setLength(1);
		metaData.addField(feature_pick_drop_emailField);

		Field feature_message2parent_emailField = new Field("feature_message2parent_email", "String");
		feature_message2parent_emailField.setDefaultValue("Y");
		feature_message2parent_emailField.setLength(1);
		metaData.addField(feature_message2parent_emailField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("user");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseuser() {}

	public Baseuser(Baseuser obj) {
		this.id = obj.id;
		this.password = obj.password;
		this.type = obj.type;
		this.name = obj.name;
		this.mobile_no = obj.mobile_no;
		this.email_id = obj.email_id;
		this.customer_id = obj.customer_id;
		this.dob = obj.dob;
		this.occupation = obj.occupation;
		this.role = obj.role;
		this.company_name = obj.company_name;
		this.state = obj.state;
		this.parentService = obj.parentService;
		this.teacherService = obj.teacherService;
		this.fleetService = obj.fleetService;
		this.schoolTrackerService = obj.schoolTrackerService;
		this.dgService = obj.dgService;
		this.key = obj.key;
		this.routeSettingService = obj.routeSettingService;
		this.homeAutomationService = obj.homeAutomationService;
		this.schoolAdminService = obj.schoolAdminService;
		this.operation_student_delete = obj.operation_student_delete;
		this.operation_student_edit = obj.operation_student_edit;
		this.configuration_edit = obj.configuration_edit;
		this.configuration_delete = obj.configuration_delete;
		this.super_user = obj.super_user;
		this.last_login = obj.last_login;
		this.feature_homework_sms = obj.feature_homework_sms;
		this.feature_daily_activity_sms = obj.feature_daily_activity_sms;
		this.feature_home_practice_sms = obj.feature_home_practice_sms;
		this.feature_notice_sms = obj.feature_notice_sms;
		this.feature_absent_report_sms = obj.feature_absent_report_sms;
		this.feature_pick_drop_sms = obj.feature_pick_drop_sms;
		this.feature_message2parent_sms = obj.feature_message2parent_sms;
		this.feature_homework_email = obj.feature_homework_email;
		this.feature_daily_activity_email = obj.feature_daily_activity_email;
		this.feature_home_practice_email = obj.feature_home_practice_email;
		this.feature_notice_email = obj.feature_notice_email;
		this.feature_absent_report_email = obj.feature_absent_report_email;
		this.feature_pick_drop_email = obj.feature_pick_drop_email;
		this.feature_message2parent_email = obj.feature_message2parent_email;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(parentService == null)
			parentService = "N";
		if(teacherService == null)
			teacherService = "N";
		if(fleetService == null)
			fleetService = "N";
		if(schoolTrackerService == null)
			schoolTrackerService = "N";
		if(dgService == null)
			dgService = "N";
		if(routeSettingService == null)
			routeSettingService = "N";
		if(homeAutomationService == null)
			homeAutomationService = "N";
		if(schoolAdminService == null)
			schoolAdminService = "N";
		if(operation_student_delete == null)
			operation_student_delete = "N";
		if(operation_student_edit == null)
			operation_student_edit = "N";
		if(configuration_edit == null)
			configuration_edit = "N";
		if(configuration_delete == null)
			configuration_delete = "N";
		if(super_user == null)
			super_user = "N";
		if(feature_homework_sms == null)
			feature_homework_sms = "N";
		if(feature_daily_activity_sms == null)
			feature_daily_activity_sms = "N";
		if(feature_home_practice_sms == null)
			feature_home_practice_sms = "N";
		if(feature_notice_sms == null)
			feature_notice_sms = "Y";
		if(feature_absent_report_sms == null)
			feature_absent_report_sms = "N";
		if(feature_pick_drop_sms == null)
			feature_pick_drop_sms = "Y";
		if(feature_message2parent_sms == null)
			feature_message2parent_sms = "Y";
		if(feature_homework_email == null)
			feature_homework_email = "N";
		if(feature_daily_activity_email == null)
			feature_daily_activity_email = "N";
		if(feature_home_practice_email == null)
			feature_home_practice_email = "N";
		if(feature_notice_email == null)
			feature_notice_email = "Y";
		if(feature_absent_report_email == null)
			feature_absent_report_email = "N";
		if(feature_pick_drop_email == null)
			feature_pick_drop_email = "Y";
		if(feature_message2parent_email == null)
			feature_message2parent_email = "Y";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(password != null)
			map.put("password", password);
		if(type != null)
			map.put("type", type);
		if(name != null)
			map.put("name", name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(dob != null)
			map.put("dob", dob);
		if(occupation != null)
			map.put("occupation", occupation);
		if(role != null)
			map.put("role", role);
		if(company_name != null)
			map.put("company_name", company_name);
		if(state != null)
			map.put("state", state);
		if(parentService != null)
			map.put("parentService", parentService);
		if(teacherService != null)
			map.put("teacherService", teacherService);
		if(fleetService != null)
			map.put("fleetService", fleetService);
		if(schoolTrackerService != null)
			map.put("schoolTrackerService", schoolTrackerService);
		if(dgService != null)
			map.put("dgService", dgService);
		if(key != null)
			map.put("key", key);
		if(routeSettingService != null)
			map.put("routeSettingService", routeSettingService);
		if(homeAutomationService != null)
			map.put("homeAutomationService", homeAutomationService);
		if(schoolAdminService != null)
			map.put("schoolAdminService", schoolAdminService);
		if(operation_student_delete != null)
			map.put("operation_student_delete", operation_student_delete);
		if(operation_student_edit != null)
			map.put("operation_student_edit", operation_student_edit);
		if(configuration_edit != null)
			map.put("configuration_edit", configuration_edit);
		if(configuration_delete != null)
			map.put("configuration_delete", configuration_delete);
		if(super_user != null)
			map.put("super_user", super_user);
		if(last_login != null)
			map.put("last_login", last_login);
		if(feature_homework_sms != null)
			map.put("feature_homework_sms", feature_homework_sms);
		if(feature_daily_activity_sms != null)
			map.put("feature_daily_activity_sms", feature_daily_activity_sms);
		if(feature_home_practice_sms != null)
			map.put("feature_home_practice_sms", feature_home_practice_sms);
		if(feature_notice_sms != null)
			map.put("feature_notice_sms", feature_notice_sms);
		if(feature_absent_report_sms != null)
			map.put("feature_absent_report_sms", feature_absent_report_sms);
		if(feature_pick_drop_sms != null)
			map.put("feature_pick_drop_sms", feature_pick_drop_sms);
		if(feature_message2parent_sms != null)
			map.put("feature_message2parent_sms", feature_message2parent_sms);
		if(feature_homework_email != null)
			map.put("feature_homework_email", feature_homework_email);
		if(feature_daily_activity_email != null)
			map.put("feature_daily_activity_email", feature_daily_activity_email);
		if(feature_home_practice_email != null)
			map.put("feature_home_practice_email", feature_home_practice_email);
		if(feature_notice_email != null)
			map.put("feature_notice_email", feature_notice_email);
		if(feature_absent_report_email != null)
			map.put("feature_absent_report_email", feature_absent_report_email);
		if(feature_pick_drop_email != null)
			map.put("feature_pick_drop_email", feature_pick_drop_email);
		if(feature_message2parent_email != null)
			map.put("feature_message2parent_email", feature_message2parent_email);
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
		if(validatePassword(add))
			map.put("password", password);
		if(validateType(add))
			map.put("type", type);
		if(name != null)
			map.put("name", name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(dob != null)
			map.put("dob", dob);
		if(occupation != null)
			map.put("occupation", occupation);
		if(role != null)
			map.put("role", role);
		if(company_name != null)
			map.put("company_name", company_name);
		if(state != null)
			map.put("state", state);
		if(parentService != null)
			map.put("parentService", parentService);
		if(teacherService != null)
			map.put("teacherService", teacherService);
		if(fleetService != null)
			map.put("fleetService", fleetService);
		if(schoolTrackerService != null)
			map.put("schoolTrackerService", schoolTrackerService);
		if(dgService != null)
			map.put("dgService", dgService);
		if(key != null)
			map.put("key", key);
		if(routeSettingService != null)
			map.put("routeSettingService", routeSettingService);
		if(homeAutomationService != null)
			map.put("homeAutomationService", homeAutomationService);
		if(schoolAdminService != null)
			map.put("schoolAdminService", schoolAdminService);
		if(operation_student_delete != null)
			map.put("operation_student_delete", operation_student_delete);
		if(operation_student_edit != null)
			map.put("operation_student_edit", operation_student_edit);
		if(configuration_edit != null)
			map.put("configuration_edit", configuration_edit);
		if(configuration_delete != null)
			map.put("configuration_delete", configuration_delete);
		if(super_user != null)
			map.put("super_user", super_user);
		if(last_login != null)
			map.put("last_login", last_login);
		if(feature_homework_sms != null)
			map.put("feature_homework_sms", feature_homework_sms);
		if(feature_daily_activity_sms != null)
			map.put("feature_daily_activity_sms", feature_daily_activity_sms);
		if(feature_home_practice_sms != null)
			map.put("feature_home_practice_sms", feature_home_practice_sms);
		if(feature_notice_sms != null)
			map.put("feature_notice_sms", feature_notice_sms);
		if(feature_absent_report_sms != null)
			map.put("feature_absent_report_sms", feature_absent_report_sms);
		if(feature_pick_drop_sms != null)
			map.put("feature_pick_drop_sms", feature_pick_drop_sms);
		if(feature_message2parent_sms != null)
			map.put("feature_message2parent_sms", feature_message2parent_sms);
		if(feature_homework_email != null)
			map.put("feature_homework_email", feature_homework_email);
		if(feature_daily_activity_email != null)
			map.put("feature_daily_activity_email", feature_daily_activity_email);
		if(feature_home_practice_email != null)
			map.put("feature_home_practice_email", feature_home_practice_email);
		if(feature_notice_email != null)
			map.put("feature_notice_email", feature_notice_email);
		if(feature_absent_report_email != null)
			map.put("feature_absent_report_email", feature_absent_report_email);
		if(feature_pick_drop_email != null)
			map.put("feature_pick_drop_email", feature_pick_drop_email);
		if(feature_message2parent_email != null)
			map.put("feature_message2parent_email", feature_message2parent_email);
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
		password = (String) map.get("password");
		type = (String) map.get("type");
		name = (String) map.get("name");
		mobile_no = (String) map.get("mobile_no");
		email_id = (String) map.get("email_id");
		customer_id = (String) map.get("customer_id");
		dob = (String) map.get("dob");
		occupation = (String) map.get("occupation");
		role = (String) map.get("role");
		company_name = (String) map.get("company_name");
		state = (String) map.get("state");
		parentService = (String) map.get("parentService");
		teacherService = (String) map.get("teacherService");
		fleetService = (String) map.get("fleetService");
		schoolTrackerService = (String) map.get("schoolTrackerService");
		dgService = (String) map.get("dgService");
		key = (String) map.get("key");
		routeSettingService = (String) map.get("routeSettingService");
		homeAutomationService = (String) map.get("homeAutomationService");
		schoolAdminService = (String) map.get("schoolAdminService");
		operation_student_delete = (String) map.get("operation_student_delete");
		operation_student_edit = (String) map.get("operation_student_edit");
		configuration_edit = (String) map.get("configuration_edit");
		configuration_delete = (String) map.get("configuration_delete");
		super_user = (String) map.get("super_user");
		last_login = (Long) map.get("last_login");
		feature_homework_sms = (String) map.get("feature_homework_sms");
		feature_daily_activity_sms = (String) map.get("feature_daily_activity_sms");
		feature_home_practice_sms = (String) map.get("feature_home_practice_sms");
		feature_notice_sms = (String) map.get("feature_notice_sms");
		feature_absent_report_sms = (String) map.get("feature_absent_report_sms");
		feature_pick_drop_sms = (String) map.get("feature_pick_drop_sms");
		feature_message2parent_sms = (String) map.get("feature_message2parent_sms");
		feature_homework_email = (String) map.get("feature_homework_email");
		feature_daily_activity_email = (String) map.get("feature_daily_activity_email");
		feature_home_practice_email = (String) map.get("feature_home_practice_email");
		feature_notice_email = (String) map.get("feature_notice_email");
		feature_absent_report_email = (String) map.get("feature_absent_report_email");
		feature_pick_drop_email = (String) map.get("feature_pick_drop_email");
		feature_message2parent_email = (String) map.get("feature_message2parent_email");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object passwordObj = map.get("password");
		if(passwordObj != null)
			password = passwordObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object dobObj = map.get("dob");
		if(dobObj != null)
			dob = dobObj.toString();

		Object occupationObj = map.get("occupation");
		if(occupationObj != null)
			occupation = occupationObj.toString();

		Object roleObj = map.get("role");
		if(roleObj != null)
			role = roleObj.toString();

		Object company_nameObj = map.get("company_name");
		if(company_nameObj != null)
			company_name = company_nameObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object parentServiceObj = map.get("parentService");
		if(parentServiceObj != null)
			parentService = parentServiceObj.toString();

		Object teacherServiceObj = map.get("teacherService");
		if(teacherServiceObj != null)
			teacherService = teacherServiceObj.toString();

		Object fleetServiceObj = map.get("fleetService");
		if(fleetServiceObj != null)
			fleetService = fleetServiceObj.toString();

		Object schoolTrackerServiceObj = map.get("schoolTrackerService");
		if(schoolTrackerServiceObj != null)
			schoolTrackerService = schoolTrackerServiceObj.toString();

		Object dgServiceObj = map.get("dgService");
		if(dgServiceObj != null)
			dgService = dgServiceObj.toString();

		Object keyObj = map.get("key");
		if(keyObj != null)
			key = keyObj.toString();

		Object routeSettingServiceObj = map.get("routeSettingService");
		if(routeSettingServiceObj != null)
			routeSettingService = routeSettingServiceObj.toString();

		Object homeAutomationServiceObj = map.get("homeAutomationService");
		if(homeAutomationServiceObj != null)
			homeAutomationService = homeAutomationServiceObj.toString();

		Object schoolAdminServiceObj = map.get("schoolAdminService");
		if(schoolAdminServiceObj != null)
			schoolAdminService = schoolAdminServiceObj.toString();

		Object operation_student_deleteObj = map.get("operation_student_delete");
		if(operation_student_deleteObj != null)
			operation_student_delete = operation_student_deleteObj.toString();

		Object operation_student_editObj = map.get("operation_student_edit");
		if(operation_student_editObj != null)
			operation_student_edit = operation_student_editObj.toString();

		Object configuration_editObj = map.get("configuration_edit");
		if(configuration_editObj != null)
			configuration_edit = configuration_editObj.toString();

		Object configuration_deleteObj = map.get("configuration_delete");
		if(configuration_deleteObj != null)
			configuration_delete = configuration_deleteObj.toString();

		Object super_userObj = map.get("super_user");
		if(super_userObj != null)
			super_user = super_userObj.toString();

		Object last_loginObj = map.get("last_login");
		if(last_loginObj != null)
			last_login = (Long) last_loginObj;

		Object feature_homework_smsObj = map.get("feature_homework_sms");
		if(feature_homework_smsObj != null)
			feature_homework_sms = feature_homework_smsObj.toString();

		Object feature_daily_activity_smsObj = map.get("feature_daily_activity_sms");
		if(feature_daily_activity_smsObj != null)
			feature_daily_activity_sms = feature_daily_activity_smsObj.toString();

		Object feature_home_practice_smsObj = map.get("feature_home_practice_sms");
		if(feature_home_practice_smsObj != null)
			feature_home_practice_sms = feature_home_practice_smsObj.toString();

		Object feature_notice_smsObj = map.get("feature_notice_sms");
		if(feature_notice_smsObj != null)
			feature_notice_sms = feature_notice_smsObj.toString();

		Object feature_absent_report_smsObj = map.get("feature_absent_report_sms");
		if(feature_absent_report_smsObj != null)
			feature_absent_report_sms = feature_absent_report_smsObj.toString();

		Object feature_pick_drop_smsObj = map.get("feature_pick_drop_sms");
		if(feature_pick_drop_smsObj != null)
			feature_pick_drop_sms = feature_pick_drop_smsObj.toString();

		Object feature_message2parent_smsObj = map.get("feature_message2parent_sms");
		if(feature_message2parent_smsObj != null)
			feature_message2parent_sms = feature_message2parent_smsObj.toString();

		Object feature_homework_emailObj = map.get("feature_homework_email");
		if(feature_homework_emailObj != null)
			feature_homework_email = feature_homework_emailObj.toString();

		Object feature_daily_activity_emailObj = map.get("feature_daily_activity_email");
		if(feature_daily_activity_emailObj != null)
			feature_daily_activity_email = feature_daily_activity_emailObj.toString();

		Object feature_home_practice_emailObj = map.get("feature_home_practice_email");
		if(feature_home_practice_emailObj != null)
			feature_home_practice_email = feature_home_practice_emailObj.toString();

		Object feature_notice_emailObj = map.get("feature_notice_email");
		if(feature_notice_emailObj != null)
			feature_notice_email = feature_notice_emailObj.toString();

		Object feature_absent_report_emailObj = map.get("feature_absent_report_email");
		if(feature_absent_report_emailObj != null)
			feature_absent_report_email = feature_absent_report_emailObj.toString();

		Object feature_pick_drop_emailObj = map.get("feature_pick_drop_email");
		if(feature_pick_drop_emailObj != null)
			feature_pick_drop_email = feature_pick_drop_emailObj.toString();

		Object feature_message2parent_emailObj = map.get("feature_message2parent_email");
		if(feature_message2parent_emailObj != null)
			feature_message2parent_email = feature_message2parent_emailObj.toString();

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

	public String getPassword() {
		return password;
	}

	public String getPasswordEx() {
		return password != null ? password : "";
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void unSetPassword() {
		this.password = null;
	}

	public boolean validatePassword(boolean add) throws ApplicationException {
		if(add && password == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[password]");
		return password != null;
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

	public boolean validateType(boolean add) throws ApplicationException {
		if(add && type == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[type]");
		return type != null;
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

	public String getDob() {
		return dob;
	}

	public String getDobEx() {
		return dob != null ? dob : "";
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void unSetDob() {
		this.dob = null;
	}

	public String getOccupation() {
		return occupation;
	}

	public String getOccupationEx() {
		return occupation != null ? occupation : "";
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void unSetOccupation() {
		this.occupation = null;
	}

	public String getRole() {
		return role;
	}

	public String getRoleEx() {
		return role != null ? role : "";
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void unSetRole() {
		this.role = null;
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

	public String getParentService() {
		return parentService != null ? parentService : "N";
	}

	public void setParentService(String parentService) {
		this.parentService = parentService;
	}

	public void unSetParentService() {
		this.parentService = "N";
	}

	public String getTeacherService() {
		return teacherService != null ? teacherService : "N";
	}

	public void setTeacherService(String teacherService) {
		this.teacherService = teacherService;
	}

	public void unSetTeacherService() {
		this.teacherService = "N";
	}

	public String getFleetService() {
		return fleetService != null ? fleetService : "N";
	}

	public void setFleetService(String fleetService) {
		this.fleetService = fleetService;
	}

	public void unSetFleetService() {
		this.fleetService = "N";
	}

	public String getSchoolTrackerService() {
		return schoolTrackerService != null ? schoolTrackerService : "N";
	}

	public void setSchoolTrackerService(String schoolTrackerService) {
		this.schoolTrackerService = schoolTrackerService;
	}

	public void unSetSchoolTrackerService() {
		this.schoolTrackerService = "N";
	}

	public String getDgService() {
		return dgService != null ? dgService : "N";
	}

	public void setDgService(String dgService) {
		this.dgService = dgService;
	}

	public void unSetDgService() {
		this.dgService = "N";
	}

	public String getKey() {
		return key;
	}

	public String getKeyEx() {
		return key != null ? key : "";
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void unSetKey() {
		this.key = null;
	}

	public String getRouteSettingService() {
		return routeSettingService != null ? routeSettingService : "N";
	}

	public void setRouteSettingService(String routeSettingService) {
		this.routeSettingService = routeSettingService;
	}

	public void unSetRouteSettingService() {
		this.routeSettingService = "N";
	}

	public String getHomeAutomationService() {
		return homeAutomationService != null ? homeAutomationService : "N";
	}

	public void setHomeAutomationService(String homeAutomationService) {
		this.homeAutomationService = homeAutomationService;
	}

	public void unSetHomeAutomationService() {
		this.homeAutomationService = "N";
	}

	public String getSchoolAdminService() {
		return schoolAdminService != null ? schoolAdminService : "N";
	}

	public void setSchoolAdminService(String schoolAdminService) {
		this.schoolAdminService = schoolAdminService;
	}

	public void unSetSchoolAdminService() {
		this.schoolAdminService = "N";
	}

	public String getOperation_student_delete() {
		return operation_student_delete != null ? operation_student_delete : "N";
	}

	public void setOperation_student_delete(String operation_student_delete) {
		this.operation_student_delete = operation_student_delete;
	}

	public void unSetOperation_student_delete() {
		this.operation_student_delete = "N";
	}

	public String getOperation_student_edit() {
		return operation_student_edit != null ? operation_student_edit : "N";
	}

	public void setOperation_student_edit(String operation_student_edit) {
		this.operation_student_edit = operation_student_edit;
	}

	public void unSetOperation_student_edit() {
		this.operation_student_edit = "N";
	}

	public String getConfiguration_edit() {
		return configuration_edit != null ? configuration_edit : "N";
	}

	public void setConfiguration_edit(String configuration_edit) {
		this.configuration_edit = configuration_edit;
	}

	public void unSetConfiguration_edit() {
		this.configuration_edit = "N";
	}

	public String getConfiguration_delete() {
		return configuration_delete != null ? configuration_delete : "N";
	}

	public void setConfiguration_delete(String configuration_delete) {
		this.configuration_delete = configuration_delete;
	}

	public void unSetConfiguration_delete() {
		this.configuration_delete = "N";
	}

	public String getSuper_user() {
		return super_user != null ? super_user : "N";
	}

	public void setSuper_user(String super_user) {
		this.super_user = super_user;
	}

	public void unSetSuper_user() {
		this.super_user = "N";
	}

	public Long getLast_login() {
		return last_login;
	}

	public void setLast_login(Long last_login) {
		this.last_login = last_login;
	}


	public String getFeature_homework_sms() {
		return feature_homework_sms != null ? feature_homework_sms : "N";
	}

	public void setFeature_homework_sms(String feature_homework_sms) {
		this.feature_homework_sms = feature_homework_sms;
	}

	public void unSetFeature_homework_sms() {
		this.feature_homework_sms = "N";
	}

	public String getFeature_daily_activity_sms() {
		return feature_daily_activity_sms != null ? feature_daily_activity_sms : "N";
	}

	public void setFeature_daily_activity_sms(String feature_daily_activity_sms) {
		this.feature_daily_activity_sms = feature_daily_activity_sms;
	}

	public void unSetFeature_daily_activity_sms() {
		this.feature_daily_activity_sms = "N";
	}

	public String getFeature_home_practice_sms() {
		return feature_home_practice_sms != null ? feature_home_practice_sms : "N";
	}

	public void setFeature_home_practice_sms(String feature_home_practice_sms) {
		this.feature_home_practice_sms = feature_home_practice_sms;
	}

	public void unSetFeature_home_practice_sms() {
		this.feature_home_practice_sms = "N";
	}

	public String getFeature_notice_sms() {
		return feature_notice_sms != null ? feature_notice_sms : "Y";
	}

	public void setFeature_notice_sms(String feature_notice_sms) {
		this.feature_notice_sms = feature_notice_sms;
	}

	public void unSetFeature_notice_sms() {
		this.feature_notice_sms = "Y";
	}

	public String getFeature_absent_report_sms() {
		return feature_absent_report_sms != null ? feature_absent_report_sms : "N";
	}

	public void setFeature_absent_report_sms(String feature_absent_report_sms) {
		this.feature_absent_report_sms = feature_absent_report_sms;
	}

	public void unSetFeature_absent_report_sms() {
		this.feature_absent_report_sms = "N";
	}

	public String getFeature_pick_drop_sms() {
		return feature_pick_drop_sms != null ? feature_pick_drop_sms : "Y";
	}

	public void setFeature_pick_drop_sms(String feature_pick_drop_sms) {
		this.feature_pick_drop_sms = feature_pick_drop_sms;
	}

	public void unSetFeature_pick_drop_sms() {
		this.feature_pick_drop_sms = "Y";
	}

	public String getFeature_message2parent_sms() {
		return feature_message2parent_sms != null ? feature_message2parent_sms : "Y";
	}

	public void setFeature_message2parent_sms(String feature_message2parent_sms) {
		this.feature_message2parent_sms = feature_message2parent_sms;
	}

	public void unSetFeature_message2parent_sms() {
		this.feature_message2parent_sms = "Y";
	}

	public String getFeature_homework_email() {
		return feature_homework_email != null ? feature_homework_email : "N";
	}

	public void setFeature_homework_email(String feature_homework_email) {
		this.feature_homework_email = feature_homework_email;
	}

	public void unSetFeature_homework_email() {
		this.feature_homework_email = "N";
	}

	public String getFeature_daily_activity_email() {
		return feature_daily_activity_email != null ? feature_daily_activity_email : "N";
	}

	public void setFeature_daily_activity_email(String feature_daily_activity_email) {
		this.feature_daily_activity_email = feature_daily_activity_email;
	}

	public void unSetFeature_daily_activity_email() {
		this.feature_daily_activity_email = "N";
	}

	public String getFeature_home_practice_email() {
		return feature_home_practice_email != null ? feature_home_practice_email : "N";
	}

	public void setFeature_home_practice_email(String feature_home_practice_email) {
		this.feature_home_practice_email = feature_home_practice_email;
	}

	public void unSetFeature_home_practice_email() {
		this.feature_home_practice_email = "N";
	}

	public String getFeature_notice_email() {
		return feature_notice_email != null ? feature_notice_email : "Y";
	}

	public void setFeature_notice_email(String feature_notice_email) {
		this.feature_notice_email = feature_notice_email;
	}

	public void unSetFeature_notice_email() {
		this.feature_notice_email = "Y";
	}

	public String getFeature_absent_report_email() {
		return feature_absent_report_email != null ? feature_absent_report_email : "N";
	}

	public void setFeature_absent_report_email(String feature_absent_report_email) {
		this.feature_absent_report_email = feature_absent_report_email;
	}

	public void unSetFeature_absent_report_email() {
		this.feature_absent_report_email = "N";
	}

	public String getFeature_pick_drop_email() {
		return feature_pick_drop_email != null ? feature_pick_drop_email : "Y";
	}

	public void setFeature_pick_drop_email(String feature_pick_drop_email) {
		this.feature_pick_drop_email = feature_pick_drop_email;
	}

	public void unSetFeature_pick_drop_email() {
		this.feature_pick_drop_email = "Y";
	}

	public String getFeature_message2parent_email() {
		return feature_message2parent_email != null ? feature_message2parent_email : "Y";
	}

	public void setFeature_message2parent_email(String feature_message2parent_email) {
		this.feature_message2parent_email = feature_message2parent_email;
	}

	public void unSetFeature_message2parent_email() {
		this.feature_message2parent_email = "Y";
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