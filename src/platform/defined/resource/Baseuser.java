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
	private String varified = null;
	private String disabled = null;
	private String type = null;
	private String name = null;
	private String mobile_no = null;
	private String email_id = null;
	private String customer_id = null;
	private String location_id = null;
	private String community_id = null;
	private String reference_id = null;
	private String dob = null;
	private String occupation = null;
	private String role = null;
	private String company_name = null;
	private String state = null;
	private String parentService = null;
	private String studentService = null;
	private String teacherService = null;
	private String fleetService = null;
	private String gameService = null;
	private String schoolTrackerService = null;
	private String dgService = null;
	private String brushUpSkillService = null;
	private String key = null;
	private String routeSettingService = null;
	private String homeAutomationService = null;
	private String communityService = null;
	private String schoolAdminService = null;
	private String customerService = null;
	private String merchantService = null;
	private String operation_student_delete = null;
	private String operation_student_edit = null;
	private String configuration_edit = null;
	private String configuration_delete = null;
	private String super_user = null;
	private Long last_login = null;
	private String send_email = null;
	private String send_sms = null;
	private String feature_homework = null;
	private String feature_daily_activity = null;
	private String feature_home_practice = null;
	private String feature_notice = null;
	private String feature_absent_report = null;
	private String feature_pick_drop = null;
	private String feature_message2parent = null;
	private String feature_message2school = null;
	private String feature_proficiency = null;
	private String feature_wof = null;
	private String feature_photo = null;
	private String feature_video = null;
	private String feature_timetable = null;
	private String feature_fees = null;
	private String feature_work_sheet = null;
	private String feature_present_report = null;
	private String feature_news = null;
	private String feature_parenting = null;
	private String feature_event = null;
	private String feature_tutorial = null;
	private String feature_practical_attendance = null;
	private String feature_report_card = null;
	private String feature_account = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_VARIFIED = "varified";
	public static String FIELD_DISABLED = "disabled";
	public static String FIELD_TYPE = "type";
	public static String FIELD_NAME = "name";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_LOCATION_ID = "location_id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_DOB = "dob";
	public static String FIELD_OCCUPATION = "occupation";
	public static String FIELD_ROLE = "role";
	public static String FIELD_COMPANY_NAME = "company_name";
	public static String FIELD_STATE = "state";
	public static String FIELD_PARENTSERVICE = "parentService";
	public static String FIELD_STUDENTSERVICE = "studentService";
	public static String FIELD_TEACHERSERVICE = "teacherService";
	public static String FIELD_FLEETSERVICE = "fleetService";
	public static String FIELD_GAMESERVICE = "gameService";
	public static String FIELD_SCHOOLTRACKERSERVICE = "schoolTrackerService";
	public static String FIELD_DGSERVICE = "dgService";
	public static String FIELD_BRUSHUPSKILLSERVICE = "brushUpSkillService";
	public static String FIELD_KEY = "key";
	public static String FIELD_ROUTESETTINGSERVICE = "routeSettingService";
	public static String FIELD_HOMEAUTOMATIONSERVICE = "homeAutomationService";
	public static String FIELD_COMMUNITYSERVICE = "communityService";
	public static String FIELD_SCHOOLADMINSERVICE = "schoolAdminService";
	public static String FIELD_CUSTOMERSERVICE = "customerService";
	public static String FIELD_MERCHANTSERVICE = "merchantService";
	public static String FIELD_OPERATION_STUDENT_DELETE = "operation_student_delete";
	public static String FIELD_OPERATION_STUDENT_EDIT = "operation_student_edit";
	public static String FIELD_CONFIGURATION_EDIT = "configuration_edit";
	public static String FIELD_CONFIGURATION_DELETE = "configuration_delete";
	public static String FIELD_SUPER_USER = "super_user";
	public static String FIELD_LAST_LOGIN = "last_login";
	public static String FIELD_SEND_EMAIL = "send_email";
	public static String FIELD_SEND_SMS = "send_sms";
	public static String FIELD_FEATURE_HOMEWORK = "feature_homework";
	public static String FIELD_FEATURE_DAILY_ACTIVITY = "feature_daily_activity";
	public static String FIELD_FEATURE_HOME_PRACTICE = "feature_home_practice";
	public static String FIELD_FEATURE_NOTICE = "feature_notice";
	public static String FIELD_FEATURE_ABSENT_REPORT = "feature_absent_report";
	public static String FIELD_FEATURE_PICK_DROP = "feature_pick_drop";
	public static String FIELD_FEATURE_MESSAGE2PARENT = "feature_message2parent";
	public static String FIELD_FEATURE_MESSAGE2SCHOOL = "feature_message2school";
	public static String FIELD_FEATURE_PROFICIENCY = "feature_proficiency";
	public static String FIELD_FEATURE_WOF = "feature_wof";
	public static String FIELD_FEATURE_PHOTO = "feature_photo";
	public static String FIELD_FEATURE_VIDEO = "feature_video";
	public static String FIELD_FEATURE_TIMETABLE = "feature_timetable";
	public static String FIELD_FEATURE_FEES = "feature_fees";
	public static String FIELD_FEATURE_WORK_SHEET = "feature_work_sheet";
	public static String FIELD_FEATURE_PRESENT_REPORT = "feature_present_report";
	public static String FIELD_FEATURE_NEWS = "feature_news";
	public static String FIELD_FEATURE_PARENTING = "feature_parenting";
	public static String FIELD_FEATURE_EVENT = "feature_event";
	public static String FIELD_FEATURE_TUTORIAL = "feature_tutorial";
	public static String FIELD_FEATURE_PRACTICAL_ATTENDANCE = "feature_practical_attendance";
	public static String FIELD_FEATURE_REPORT_CARD = "feature_report_card";
	public static String FIELD_FEATURE_ACCOUNT = "feature_account";
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

		Field varifiedField = new Field("varified", "String");
		varifiedField.setRequired(true);
		varifiedField.setLength(1);
		metaData.addField(varifiedField);

		Field disabledField = new Field("disabled", "String");
		disabledField.setRequired(true);
		disabledField.setLength(1);
		metaData.addField(disabledField);

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

		Field studentServiceField = new Field("studentService", "String");
		studentServiceField.setDefaultValue("N");
		studentServiceField.setLength(1);
		metaData.addField(studentServiceField);

		Field teacherServiceField = new Field("teacherService", "String");
		teacherServiceField.setDefaultValue("N");
		teacherServiceField.setLength(1);
		metaData.addField(teacherServiceField);

		Field fleetServiceField = new Field("fleetService", "String");
		fleetServiceField.setDefaultValue("N");
		fleetServiceField.setLength(1);
		metaData.addField(fleetServiceField);

		Field gameServiceField = new Field("gameService", "String");
		gameServiceField.setDefaultValue("N");
		gameServiceField.setLength(1);
		metaData.addField(gameServiceField);

		Field schoolTrackerServiceField = new Field("schoolTrackerService", "String");
		schoolTrackerServiceField.setDefaultValue("N");
		schoolTrackerServiceField.setLength(1);
		metaData.addField(schoolTrackerServiceField);

		Field dgServiceField = new Field("dgService", "String");
		dgServiceField.setDefaultValue("N");
		dgServiceField.setLength(1);
		metaData.addField(dgServiceField);

		Field brushUpSkillServiceField = new Field("brushUpSkillService", "String");
		brushUpSkillServiceField.setDefaultValue("N");
		brushUpSkillServiceField.setLength(1);
		metaData.addField(brushUpSkillServiceField);

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

		Field communityServiceField = new Field("communityService", "String");
		communityServiceField.setDefaultValue("N");
		communityServiceField.setLength(1);
		metaData.addField(communityServiceField);

		Field schoolAdminServiceField = new Field("schoolAdminService", "String");
		schoolAdminServiceField.setDefaultValue("N");
		schoolAdminServiceField.setLength(1);
		metaData.addField(schoolAdminServiceField);

		Field customerServiceField = new Field("customerService", "String");
		customerServiceField.setDefaultValue("N");
		customerServiceField.setLength(1);
		metaData.addField(customerServiceField);

		Field merchantServiceField = new Field("merchantService", "String");
		merchantServiceField.setDefaultValue("N");
		merchantServiceField.setLength(1);
		metaData.addField(merchantServiceField);

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

		Field send_emailField = new Field("send_email", "String");
		send_emailField.setDefaultValue("Y");
		send_emailField.setLength(1);
		metaData.addField(send_emailField);

		Field send_smsField = new Field("send_sms", "String");
		send_smsField.setDefaultValue("Y");
		send_smsField.setLength(1);
		metaData.addField(send_smsField);

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

		Field feature_absent_reportField = new Field("feature_absent_report", "String");
		feature_absent_reportField.setDefaultValue("N");
		feature_absent_reportField.setLength(1);
		metaData.addField(feature_absent_reportField);

		Field feature_pick_dropField = new Field("feature_pick_drop", "String");
		feature_pick_dropField.setDefaultValue("N");
		feature_pick_dropField.setLength(1);
		metaData.addField(feature_pick_dropField);

		Field feature_message2parentField = new Field("feature_message2parent", "String");
		feature_message2parentField.setDefaultValue("N");
		feature_message2parentField.setLength(1);
		metaData.addField(feature_message2parentField);

		Field feature_message2schoolField = new Field("feature_message2school", "String");
		feature_message2schoolField.setDefaultValue("N");
		feature_message2schoolField.setLength(1);
		metaData.addField(feature_message2schoolField);

		Field feature_proficiencyField = new Field("feature_proficiency", "String");
		feature_proficiencyField.setDefaultValue("N");
		feature_proficiencyField.setLength(1);
		metaData.addField(feature_proficiencyField);

		Field feature_wofField = new Field("feature_wof", "String");
		feature_wofField.setDefaultValue("N");
		feature_wofField.setLength(1);
		metaData.addField(feature_wofField);

		Field feature_photoField = new Field("feature_photo", "String");
		feature_photoField.setDefaultValue("N");
		feature_photoField.setLength(1);
		metaData.addField(feature_photoField);

		Field feature_videoField = new Field("feature_video", "String");
		feature_videoField.setDefaultValue("N");
		feature_videoField.setLength(1);
		metaData.addField(feature_videoField);

		Field feature_timetableField = new Field("feature_timetable", "String");
		feature_timetableField.setDefaultValue("N");
		feature_timetableField.setLength(1);
		metaData.addField(feature_timetableField);

		Field feature_feesField = new Field("feature_fees", "String");
		feature_feesField.setDefaultValue("N");
		feature_feesField.setLength(1);
		metaData.addField(feature_feesField);

		Field feature_work_sheetField = new Field("feature_work_sheet", "String");
		feature_work_sheetField.setDefaultValue("N");
		feature_work_sheetField.setLength(1);
		metaData.addField(feature_work_sheetField);

		Field feature_present_reportField = new Field("feature_present_report", "String");
		feature_present_reportField.setDefaultValue("N");
		feature_present_reportField.setLength(1);
		metaData.addField(feature_present_reportField);

		Field feature_newsField = new Field("feature_news", "String");
		feature_newsField.setDefaultValue("Y");
		feature_newsField.setLength(1);
		metaData.addField(feature_newsField);

		Field feature_parentingField = new Field("feature_parenting", "String");
		feature_parentingField.setDefaultValue("Y");
		feature_parentingField.setLength(1);
		metaData.addField(feature_parentingField);

		Field feature_eventField = new Field("feature_event", "String");
		feature_eventField.setDefaultValue("Y");
		feature_eventField.setLength(1);
		metaData.addField(feature_eventField);

		Field feature_tutorialField = new Field("feature_tutorial", "String");
		feature_tutorialField.setDefaultValue("Y");
		feature_tutorialField.setLength(1);
		metaData.addField(feature_tutorialField);

		Field feature_practical_attendanceField = new Field("feature_practical_attendance", "String");
		feature_practical_attendanceField.setDefaultValue("N");
		feature_practical_attendanceField.setLength(1);
		metaData.addField(feature_practical_attendanceField);

		Field feature_report_cardField = new Field("feature_report_card", "String");
		feature_report_cardField.setDefaultValue("N");
		feature_report_cardField.setLength(1);
		metaData.addField(feature_report_cardField);

		Field feature_accountField = new Field("feature_account", "String");
		feature_accountField.setDefaultValue("N");
		feature_accountField.setLength(1);
		metaData.addField(feature_accountField);

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
		this.varified = obj.varified;
		this.disabled = obj.disabled;
		this.type = obj.type;
		this.name = obj.name;
		this.mobile_no = obj.mobile_no;
		this.email_id = obj.email_id;
		this.customer_id = obj.customer_id;
		this.location_id = obj.location_id;
		this.community_id = obj.community_id;
		this.reference_id = obj.reference_id;
		this.dob = obj.dob;
		this.occupation = obj.occupation;
		this.role = obj.role;
		this.company_name = obj.company_name;
		this.state = obj.state;
		this.parentService = obj.parentService;
		this.studentService = obj.studentService;
		this.teacherService = obj.teacherService;
		this.fleetService = obj.fleetService;
		this.gameService = obj.gameService;
		this.schoolTrackerService = obj.schoolTrackerService;
		this.dgService = obj.dgService;
		this.brushUpSkillService = obj.brushUpSkillService;
		this.key = obj.key;
		this.routeSettingService = obj.routeSettingService;
		this.homeAutomationService = obj.homeAutomationService;
		this.communityService = obj.communityService;
		this.schoolAdminService = obj.schoolAdminService;
		this.customerService = obj.customerService;
		this.merchantService = obj.merchantService;
		this.operation_student_delete = obj.operation_student_delete;
		this.operation_student_edit = obj.operation_student_edit;
		this.configuration_edit = obj.configuration_edit;
		this.configuration_delete = obj.configuration_delete;
		this.super_user = obj.super_user;
		this.last_login = obj.last_login;
		this.send_email = obj.send_email;
		this.send_sms = obj.send_sms;
		this.feature_homework = obj.feature_homework;
		this.feature_daily_activity = obj.feature_daily_activity;
		this.feature_home_practice = obj.feature_home_practice;
		this.feature_notice = obj.feature_notice;
		this.feature_absent_report = obj.feature_absent_report;
		this.feature_pick_drop = obj.feature_pick_drop;
		this.feature_message2parent = obj.feature_message2parent;
		this.feature_message2school = obj.feature_message2school;
		this.feature_proficiency = obj.feature_proficiency;
		this.feature_wof = obj.feature_wof;
		this.feature_photo = obj.feature_photo;
		this.feature_video = obj.feature_video;
		this.feature_timetable = obj.feature_timetable;
		this.feature_fees = obj.feature_fees;
		this.feature_work_sheet = obj.feature_work_sheet;
		this.feature_present_report = obj.feature_present_report;
		this.feature_news = obj.feature_news;
		this.feature_parenting = obj.feature_parenting;
		this.feature_event = obj.feature_event;
		this.feature_tutorial = obj.feature_tutorial;
		this.feature_practical_attendance = obj.feature_practical_attendance;
		this.feature_report_card = obj.feature_report_card;
		this.feature_account = obj.feature_account;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(parentService == null)
			parentService = "N";
		if(studentService == null)
			studentService = "N";
		if(teacherService == null)
			teacherService = "N";
		if(fleetService == null)
			fleetService = "N";
		if(gameService == null)
			gameService = "N";
		if(schoolTrackerService == null)
			schoolTrackerService = "N";
		if(dgService == null)
			dgService = "N";
		if(brushUpSkillService == null)
			brushUpSkillService = "N";
		if(routeSettingService == null)
			routeSettingService = "N";
		if(homeAutomationService == null)
			homeAutomationService = "N";
		if(communityService == null)
			communityService = "N";
		if(schoolAdminService == null)
			schoolAdminService = "N";
		if(customerService == null)
			customerService = "N";
		if(merchantService == null)
			merchantService = "N";
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
		if(send_email == null)
			send_email = "Y";
		if(send_sms == null)
			send_sms = "Y";
		if(feature_homework == null)
			feature_homework = "N";
		if(feature_daily_activity == null)
			feature_daily_activity = "N";
		if(feature_home_practice == null)
			feature_home_practice = "N";
		if(feature_notice == null)
			feature_notice = "N";
		if(feature_absent_report == null)
			feature_absent_report = "N";
		if(feature_pick_drop == null)
			feature_pick_drop = "N";
		if(feature_message2parent == null)
			feature_message2parent = "N";
		if(feature_message2school == null)
			feature_message2school = "N";
		if(feature_proficiency == null)
			feature_proficiency = "N";
		if(feature_wof == null)
			feature_wof = "N";
		if(feature_photo == null)
			feature_photo = "N";
		if(feature_video == null)
			feature_video = "N";
		if(feature_timetable == null)
			feature_timetable = "N";
		if(feature_fees == null)
			feature_fees = "N";
		if(feature_work_sheet == null)
			feature_work_sheet = "N";
		if(feature_present_report == null)
			feature_present_report = "N";
		if(feature_news == null)
			feature_news = "Y";
		if(feature_parenting == null)
			feature_parenting = "Y";
		if(feature_event == null)
			feature_event = "Y";
		if(feature_tutorial == null)
			feature_tutorial = "Y";
		if(feature_practical_attendance == null)
			feature_practical_attendance = "N";
		if(feature_report_card == null)
			feature_report_card = "N";
		if(feature_account == null)
			feature_account = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(password != null)
			map.put("password", password);
		if(varified != null)
			map.put("varified", varified);
		if(disabled != null)
			map.put("disabled", disabled);
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
		if(location_id != null)
			map.put("location_id", location_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(reference_id != null)
			map.put("reference_id", reference_id);
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
		if(studentService != null)
			map.put("studentService", studentService);
		if(teacherService != null)
			map.put("teacherService", teacherService);
		if(fleetService != null)
			map.put("fleetService", fleetService);
		if(gameService != null)
			map.put("gameService", gameService);
		if(schoolTrackerService != null)
			map.put("schoolTrackerService", schoolTrackerService);
		if(dgService != null)
			map.put("dgService", dgService);
		if(brushUpSkillService != null)
			map.put("brushUpSkillService", brushUpSkillService);
		if(key != null)
			map.put("key", key);
		if(routeSettingService != null)
			map.put("routeSettingService", routeSettingService);
		if(homeAutomationService != null)
			map.put("homeAutomationService", homeAutomationService);
		if(communityService != null)
			map.put("communityService", communityService);
		if(schoolAdminService != null)
			map.put("schoolAdminService", schoolAdminService);
		if(customerService != null)
			map.put("customerService", customerService);
		if(merchantService != null)
			map.put("merchantService", merchantService);
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
		if(send_email != null)
			map.put("send_email", send_email);
		if(send_sms != null)
			map.put("send_sms", send_sms);
		if(feature_homework != null)
			map.put("feature_homework", feature_homework);
		if(feature_daily_activity != null)
			map.put("feature_daily_activity", feature_daily_activity);
		if(feature_home_practice != null)
			map.put("feature_home_practice", feature_home_practice);
		if(feature_notice != null)
			map.put("feature_notice", feature_notice);
		if(feature_absent_report != null)
			map.put("feature_absent_report", feature_absent_report);
		if(feature_pick_drop != null)
			map.put("feature_pick_drop", feature_pick_drop);
		if(feature_message2parent != null)
			map.put("feature_message2parent", feature_message2parent);
		if(feature_message2school != null)
			map.put("feature_message2school", feature_message2school);
		if(feature_proficiency != null)
			map.put("feature_proficiency", feature_proficiency);
		if(feature_wof != null)
			map.put("feature_wof", feature_wof);
		if(feature_photo != null)
			map.put("feature_photo", feature_photo);
		if(feature_video != null)
			map.put("feature_video", feature_video);
		if(feature_timetable != null)
			map.put("feature_timetable", feature_timetable);
		if(feature_fees != null)
			map.put("feature_fees", feature_fees);
		if(feature_work_sheet != null)
			map.put("feature_work_sheet", feature_work_sheet);
		if(feature_present_report != null)
			map.put("feature_present_report", feature_present_report);
		if(feature_news != null)
			map.put("feature_news", feature_news);
		if(feature_parenting != null)
			map.put("feature_parenting", feature_parenting);
		if(feature_event != null)
			map.put("feature_event", feature_event);
		if(feature_tutorial != null)
			map.put("feature_tutorial", feature_tutorial);
		if(feature_practical_attendance != null)
			map.put("feature_practical_attendance", feature_practical_attendance);
		if(feature_report_card != null)
			map.put("feature_report_card", feature_report_card);
		if(feature_account != null)
			map.put("feature_account", feature_account);
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
		if(validateVarified(add))
			map.put("varified", varified);
		if(validateDisabled(add))
			map.put("disabled", disabled);
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
		if(location_id != null)
			map.put("location_id", location_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(reference_id != null)
			map.put("reference_id", reference_id);
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
		if(studentService != null)
			map.put("studentService", studentService);
		if(teacherService != null)
			map.put("teacherService", teacherService);
		if(fleetService != null)
			map.put("fleetService", fleetService);
		if(gameService != null)
			map.put("gameService", gameService);
		if(schoolTrackerService != null)
			map.put("schoolTrackerService", schoolTrackerService);
		if(dgService != null)
			map.put("dgService", dgService);
		if(brushUpSkillService != null)
			map.put("brushUpSkillService", brushUpSkillService);
		if(key != null)
			map.put("key", key);
		if(routeSettingService != null)
			map.put("routeSettingService", routeSettingService);
		if(homeAutomationService != null)
			map.put("homeAutomationService", homeAutomationService);
		if(communityService != null)
			map.put("communityService", communityService);
		if(schoolAdminService != null)
			map.put("schoolAdminService", schoolAdminService);
		if(customerService != null)
			map.put("customerService", customerService);
		if(merchantService != null)
			map.put("merchantService", merchantService);
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
		if(send_email != null)
			map.put("send_email", send_email);
		if(send_sms != null)
			map.put("send_sms", send_sms);
		if(feature_homework != null)
			map.put("feature_homework", feature_homework);
		if(feature_daily_activity != null)
			map.put("feature_daily_activity", feature_daily_activity);
		if(feature_home_practice != null)
			map.put("feature_home_practice", feature_home_practice);
		if(feature_notice != null)
			map.put("feature_notice", feature_notice);
		if(feature_absent_report != null)
			map.put("feature_absent_report", feature_absent_report);
		if(feature_pick_drop != null)
			map.put("feature_pick_drop", feature_pick_drop);
		if(feature_message2parent != null)
			map.put("feature_message2parent", feature_message2parent);
		if(feature_message2school != null)
			map.put("feature_message2school", feature_message2school);
		if(feature_proficiency != null)
			map.put("feature_proficiency", feature_proficiency);
		if(feature_wof != null)
			map.put("feature_wof", feature_wof);
		if(feature_photo != null)
			map.put("feature_photo", feature_photo);
		if(feature_video != null)
			map.put("feature_video", feature_video);
		if(feature_timetable != null)
			map.put("feature_timetable", feature_timetable);
		if(feature_fees != null)
			map.put("feature_fees", feature_fees);
		if(feature_work_sheet != null)
			map.put("feature_work_sheet", feature_work_sheet);
		if(feature_present_report != null)
			map.put("feature_present_report", feature_present_report);
		if(feature_news != null)
			map.put("feature_news", feature_news);
		if(feature_parenting != null)
			map.put("feature_parenting", feature_parenting);
		if(feature_event != null)
			map.put("feature_event", feature_event);
		if(feature_tutorial != null)
			map.put("feature_tutorial", feature_tutorial);
		if(feature_practical_attendance != null)
			map.put("feature_practical_attendance", feature_practical_attendance);
		if(feature_report_card != null)
			map.put("feature_report_card", feature_report_card);
		if(feature_account != null)
			map.put("feature_account", feature_account);
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
		varified = (String) map.get("varified");
		disabled = (String) map.get("disabled");
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
		studentService = (String) map.get("studentService");
		teacherService = (String) map.get("teacherService");
		fleetService = (String) map.get("fleetService");
		gameService = (String) map.get("gameService");
		schoolTrackerService = (String) map.get("schoolTrackerService");
		dgService = (String) map.get("dgService");
		brushUpSkillService = (String) map.get("brushUpSkillService");
		key = (String) map.get("key");
		routeSettingService = (String) map.get("routeSettingService");
		homeAutomationService = (String) map.get("homeAutomationService");
		communityService = (String) map.get("communityService");
		schoolAdminService = (String) map.get("schoolAdminService");
		customerService = (String) map.get("customerService");
		merchantService = (String) map.get("merchantService");
		operation_student_delete = (String) map.get("operation_student_delete");
		operation_student_edit = (String) map.get("operation_student_edit");
		configuration_edit = (String) map.get("configuration_edit");
		configuration_delete = (String) map.get("configuration_delete");
		super_user = (String) map.get("super_user");
		last_login = (Long) map.get("last_login");
		send_email = (String) map.get("send_email");
		send_sms = (String) map.get("send_sms");
		feature_homework = (String) map.get("feature_homework");
		feature_daily_activity = (String) map.get("feature_daily_activity");
		feature_home_practice = (String) map.get("feature_home_practice");
		feature_notice = (String) map.get("feature_notice");
		feature_absent_report = (String) map.get("feature_absent_report");
		feature_pick_drop = (String) map.get("feature_pick_drop");
		feature_message2parent = (String) map.get("feature_message2parent");
		feature_message2school = (String) map.get("feature_message2school");
		feature_proficiency = (String) map.get("feature_proficiency");
		feature_wof = (String) map.get("feature_wof");
		feature_photo = (String) map.get("feature_photo");
		feature_video = (String) map.get("feature_video");
		feature_timetable = (String) map.get("feature_timetable");
		feature_fees = (String) map.get("feature_fees");
		feature_work_sheet = (String) map.get("feature_work_sheet");
		feature_present_report = (String) map.get("feature_present_report");
		feature_news = (String) map.get("feature_news");
		feature_parenting = (String) map.get("feature_parenting");
		feature_event = (String) map.get("feature_event");
		feature_tutorial = (String) map.get("feature_tutorial");
		feature_practical_attendance = (String) map.get("feature_practical_attendance");
		feature_report_card = (String) map.get("feature_report_card");
		feature_account = (String) map.get("feature_account");
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

		Object varifiedObj = map.get("varified");
		if(varifiedObj != null)
			varified = varifiedObj.toString();

		Object disabledObj = map.get("disabled");
		if(disabledObj != null)
			disabled = disabledObj.toString();

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

		Object studentServiceObj = map.get("studentService");
		if(studentServiceObj != null)
			studentService = studentServiceObj.toString();

		Object teacherServiceObj = map.get("teacherService");
		if(teacherServiceObj != null)
			teacherService = teacherServiceObj.toString();

		Object fleetServiceObj = map.get("fleetService");
		if(fleetServiceObj != null)
			fleetService = fleetServiceObj.toString();

		Object gameServiceObj = map.get("gameService");
		if(gameServiceObj != null)
			gameService = gameServiceObj.toString();

		Object schoolTrackerServiceObj = map.get("schoolTrackerService");
		if(schoolTrackerServiceObj != null)
			schoolTrackerService = schoolTrackerServiceObj.toString();

		Object dgServiceObj = map.get("dgService");
		if(dgServiceObj != null)
			dgService = dgServiceObj.toString();

		Object brushUpSkillServiceObj = map.get("brushUpSkillService");
		if(brushUpSkillServiceObj != null)
			brushUpSkillService = brushUpSkillServiceObj.toString();

		Object keyObj = map.get("key");
		if(keyObj != null)
			key = keyObj.toString();

		Object routeSettingServiceObj = map.get("routeSettingService");
		if(routeSettingServiceObj != null)
			routeSettingService = routeSettingServiceObj.toString();

		Object homeAutomationServiceObj = map.get("homeAutomationService");
		if(homeAutomationServiceObj != null)
			homeAutomationService = homeAutomationServiceObj.toString();

		Object communityServiceObj = map.get("communityService");
		if(communityServiceObj != null)
			communityService = communityServiceObj.toString();

		Object schoolAdminServiceObj = map.get("schoolAdminService");
		if(schoolAdminServiceObj != null)
			schoolAdminService = schoolAdminServiceObj.toString();

		Object customerServiceObj = map.get("customerService");
		if(customerServiceObj != null)
			customerService = customerServiceObj.toString();

		Object merchantServiceObj = map.get("merchantService");
		if(merchantServiceObj != null)
			merchantService = merchantServiceObj.toString();

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

		Object send_emailObj = map.get("send_email");
		if(send_emailObj != null)
			send_email = send_emailObj.toString();

		Object send_smsObj = map.get("send_sms");
		if(send_smsObj != null)
			send_sms = send_smsObj.toString();

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

		Object feature_absent_reportObj = map.get("feature_absent_report");
		if(feature_absent_reportObj != null)
			feature_absent_report = feature_absent_reportObj.toString();

		Object feature_pick_dropObj = map.get("feature_pick_drop");
		if(feature_pick_dropObj != null)
			feature_pick_drop = feature_pick_dropObj.toString();

		Object feature_message2parentObj = map.get("feature_message2parent");
		if(feature_message2parentObj != null)
			feature_message2parent = feature_message2parentObj.toString();

		Object feature_message2schoolObj = map.get("feature_message2school");
		if(feature_message2schoolObj != null)
			feature_message2school = feature_message2schoolObj.toString();

		Object feature_proficiencyObj = map.get("feature_proficiency");
		if(feature_proficiencyObj != null)
			feature_proficiency = feature_proficiencyObj.toString();

		Object feature_wofObj = map.get("feature_wof");
		if(feature_wofObj != null)
			feature_wof = feature_wofObj.toString();

		Object feature_photoObj = map.get("feature_photo");
		if(feature_photoObj != null)
			feature_photo = feature_photoObj.toString();

		Object feature_videoObj = map.get("feature_video");
		if(feature_videoObj != null)
			feature_video = feature_videoObj.toString();

		Object feature_timetableObj = map.get("feature_timetable");
		if(feature_timetableObj != null)
			feature_timetable = feature_timetableObj.toString();

		Object feature_feesObj = map.get("feature_fees");
		if(feature_feesObj != null)
			feature_fees = feature_feesObj.toString();

		Object feature_work_sheetObj = map.get("feature_work_sheet");
		if(feature_work_sheetObj != null)
			feature_work_sheet = feature_work_sheetObj.toString();

		Object feature_present_reportObj = map.get("feature_present_report");
		if(feature_present_reportObj != null)
			feature_present_report = feature_present_reportObj.toString();

		Object feature_newsObj = map.get("feature_news");
		if(feature_newsObj != null)
			feature_news = feature_newsObj.toString();

		Object feature_parentingObj = map.get("feature_parenting");
		if(feature_parentingObj != null)
			feature_parenting = feature_parentingObj.toString();

		Object feature_eventObj = map.get("feature_event");
		if(feature_eventObj != null)
			feature_event = feature_eventObj.toString();

		Object feature_tutorialObj = map.get("feature_tutorial");
		if(feature_tutorialObj != null)
			feature_tutorial = feature_tutorialObj.toString();

		Object feature_practical_attendanceObj = map.get("feature_practical_attendance");
		if(feature_practical_attendanceObj != null)
			feature_practical_attendance = feature_practical_attendanceObj.toString();

		Object feature_report_cardObj = map.get("feature_report_card");
		if(feature_report_cardObj != null)
			feature_report_card = feature_report_cardObj.toString();

		Object feature_accountObj = map.get("feature_account");
		if(feature_accountObj != null)
			feature_account = feature_accountObj.toString();

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

	public String getVarified() {
		return varified;
	}

	public String getVarifiedEx() {
		return varified != null ? varified : "";
	}

	public void setVarified(String varified) {
		this.varified = varified;
	}

	public void unSetVarified() {
		this.varified = null;
	}

	public boolean validateVarified(boolean add) throws ApplicationException {
		if(add && varified == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[varified]");
		return varified != null;
	}

	public String getDisabled() {
		return disabled;
	}

	public String getDisabledEx() {
		return disabled != null ? disabled : "";
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public void unSetDisabled() {
		this.disabled = null;
	}

	public boolean validateDisabled(boolean add) throws ApplicationException {
		if(add && disabled == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[disabled]");
		return disabled != null;
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

	public String getLocation_id() {
		return location_id;
	}

	public String getLocation_idEx() {
		return location_id != null ? location_id : "";
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public void unSetLocation_id() {
		this.location_id = null;
	}

	public String getCommunity_id() {
		return community_id;
	}

	public String getCommunity_idEx() {
		return community_id != null ? community_id : "";
	}

	public void setCommunity_id(String community_id) {
		this.community_id = community_id;
	}

	public void unSetCommunity_id() {
		this.community_id = null;
	}

	public String getReference_id() {
		return reference_id;
	}

	public String getReference_idEx() {
		return reference_id != null ? reference_id : "";
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public void unSetReference_id() {
		this.reference_id = null;
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

	public String getStudentService() {
		return studentService != null ? studentService : "N";
	}

	public void setStudentService(String studentService) {
		this.studentService = studentService;
	}

	public void unSetStudentService() {
		this.studentService = "N";
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

	public String getGameService() {
		return gameService != null ? gameService : "N";
	}

	public void setGameService(String gameService) {
		this.gameService = gameService;
	}

	public void unSetGameService() {
		this.gameService = "N";
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

	public String getBrushUpSkillService() {
		return brushUpSkillService != null ? brushUpSkillService : "N";
	}

	public void setBrushUpSkillService(String brushUpSkillService) {
		this.brushUpSkillService = brushUpSkillService;
	}

	public void unSetBrushUpSkillService() {
		this.brushUpSkillService = "N";
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

	public String getCommunityService() {
		return communityService != null ? communityService : "N";
	}

	public void setCommunityService(String communityService) {
		this.communityService = communityService;
	}

	public void unSetCommunityService() {
		this.communityService = "N";
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

	public String getCustomerService() {
		return customerService != null ? customerService : "N";
	}

	public void setCustomerService(String customerService) {
		this.customerService = customerService;
	}

	public void unSetCustomerService() {
		this.customerService = "N";
	}

	public String getMerchantService() {
		return merchantService != null ? merchantService : "N";
	}

	public void setMerchantService(String merchantService) {
		this.merchantService = merchantService;
	}

	public void unSetMerchantService() {
		this.merchantService = "N";
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


	public String getSend_email() {
		return send_email != null ? send_email : "Y";
	}

	public void setSend_email(String send_email) {
		this.send_email = send_email;
	}

	public void unSetSend_email() {
		this.send_email = "Y";
	}

	public String getSend_sms() {
		return send_sms != null ? send_sms : "Y";
	}

	public void setSend_sms(String send_sms) {
		this.send_sms = send_sms;
	}

	public void unSetSend_sms() {
		this.send_sms = "Y";
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

	public String getFeature_absent_report() {
		return feature_absent_report != null ? feature_absent_report : "N";
	}

	public void setFeature_absent_report(String feature_absent_report) {
		this.feature_absent_report = feature_absent_report;
	}

	public void unSetFeature_absent_report() {
		this.feature_absent_report = "N";
	}

	public String getFeature_pick_drop() {
		return feature_pick_drop != null ? feature_pick_drop : "N";
	}

	public void setFeature_pick_drop(String feature_pick_drop) {
		this.feature_pick_drop = feature_pick_drop;
	}

	public void unSetFeature_pick_drop() {
		this.feature_pick_drop = "N";
	}

	public String getFeature_message2parent() {
		return feature_message2parent != null ? feature_message2parent : "N";
	}

	public void setFeature_message2parent(String feature_message2parent) {
		this.feature_message2parent = feature_message2parent;
	}

	public void unSetFeature_message2parent() {
		this.feature_message2parent = "N";
	}

	public String getFeature_message2school() {
		return feature_message2school != null ? feature_message2school : "N";
	}

	public void setFeature_message2school(String feature_message2school) {
		this.feature_message2school = feature_message2school;
	}

	public void unSetFeature_message2school() {
		this.feature_message2school = "N";
	}

	public String getFeature_proficiency() {
		return feature_proficiency != null ? feature_proficiency : "N";
	}

	public void setFeature_proficiency(String feature_proficiency) {
		this.feature_proficiency = feature_proficiency;
	}

	public void unSetFeature_proficiency() {
		this.feature_proficiency = "N";
	}

	public String getFeature_wof() {
		return feature_wof != null ? feature_wof : "N";
	}

	public void setFeature_wof(String feature_wof) {
		this.feature_wof = feature_wof;
	}

	public void unSetFeature_wof() {
		this.feature_wof = "N";
	}

	public String getFeature_photo() {
		return feature_photo != null ? feature_photo : "N";
	}

	public void setFeature_photo(String feature_photo) {
		this.feature_photo = feature_photo;
	}

	public void unSetFeature_photo() {
		this.feature_photo = "N";
	}

	public String getFeature_video() {
		return feature_video != null ? feature_video : "N";
	}

	public void setFeature_video(String feature_video) {
		this.feature_video = feature_video;
	}

	public void unSetFeature_video() {
		this.feature_video = "N";
	}

	public String getFeature_timetable() {
		return feature_timetable != null ? feature_timetable : "N";
	}

	public void setFeature_timetable(String feature_timetable) {
		this.feature_timetable = feature_timetable;
	}

	public void unSetFeature_timetable() {
		this.feature_timetable = "N";
	}

	public String getFeature_fees() {
		return feature_fees != null ? feature_fees : "N";
	}

	public void setFeature_fees(String feature_fees) {
		this.feature_fees = feature_fees;
	}

	public void unSetFeature_fees() {
		this.feature_fees = "N";
	}

	public String getFeature_work_sheet() {
		return feature_work_sheet != null ? feature_work_sheet : "N";
	}

	public void setFeature_work_sheet(String feature_work_sheet) {
		this.feature_work_sheet = feature_work_sheet;
	}

	public void unSetFeature_work_sheet() {
		this.feature_work_sheet = "N";
	}

	public String getFeature_present_report() {
		return feature_present_report != null ? feature_present_report : "N";
	}

	public void setFeature_present_report(String feature_present_report) {
		this.feature_present_report = feature_present_report;
	}

	public void unSetFeature_present_report() {
		this.feature_present_report = "N";
	}

	public String getFeature_news() {
		return feature_news != null ? feature_news : "Y";
	}

	public void setFeature_news(String feature_news) {
		this.feature_news = feature_news;
	}

	public void unSetFeature_news() {
		this.feature_news = "Y";
	}

	public String getFeature_parenting() {
		return feature_parenting != null ? feature_parenting : "Y";
	}

	public void setFeature_parenting(String feature_parenting) {
		this.feature_parenting = feature_parenting;
	}

	public void unSetFeature_parenting() {
		this.feature_parenting = "Y";
	}

	public String getFeature_event() {
		return feature_event != null ? feature_event : "Y";
	}

	public void setFeature_event(String feature_event) {
		this.feature_event = feature_event;
	}

	public void unSetFeature_event() {
		this.feature_event = "Y";
	}

	public String getFeature_tutorial() {
		return feature_tutorial != null ? feature_tutorial : "Y";
	}

	public void setFeature_tutorial(String feature_tutorial) {
		this.feature_tutorial = feature_tutorial;
	}

	public void unSetFeature_tutorial() {
		this.feature_tutorial = "Y";
	}

	public String getFeature_practical_attendance() {
		return feature_practical_attendance != null ? feature_practical_attendance : "N";
	}

	public void setFeature_practical_attendance(String feature_practical_attendance) {
		this.feature_practical_attendance = feature_practical_attendance;
	}

	public void unSetFeature_practical_attendance() {
		this.feature_practical_attendance = "N";
	}

	public String getFeature_report_card() {
		return feature_report_card != null ? feature_report_card : "N";
	}

	public void setFeature_report_card(String feature_report_card) {
		this.feature_report_card = feature_report_card;
	}

	public void unSetFeature_report_card() {
		this.feature_report_card = "N";
	}

	public String getFeature_account() {
		return feature_account != null ? feature_account : "N";
	}

	public void setFeature_account(String feature_account) {
		this.feature_account = feature_account;
	}

	public void unSetFeature_account() {
		this.feature_account = "N";
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