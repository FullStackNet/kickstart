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
public abstract class Basestudent_detail extends BaseResource {
	private String id = null;
	private String community_id = null;
	private String school_id = null;
	private String school_brand_name = null;
	private String name = null;
	private String pickup_route_stopage_id = null;
	private String pickup_route_id = null;
	private String pickup_route_name = null;
	private String pickup_stopage_id = null;
	private String pickup_stopage_name = null;
	private String pickup_start_time = null;
	private String pickup_end_time = null;
	private String pickup_vehicle_name = null;
	private String pickup_driver_id = null;
	private String pickup_driver_name = null;
	private String pickup_driver_mobile_no = null;
	private String dropped_route_stopage_id = null;
	private String dropped_route_id = null;
	private String dropped_route_name = null;
	private String dropped_stopage_id = null;
	private String dropped_stopage_name = null;
	private String dropped_start_time = null;
	private String dropped_end_time = null;
	private String dropped_vehicle_name = null;
	private String dropped_driver_id = null;
	private String dropped_driver_name = null;
	private String dropped_driver_mobile_no = null;
	private String class_name = null;
	private String section_name = null;
	private String app_branding = null;
	private String bus_started = null;
	private String last_stopage_name = null;
	private Long last_stopage_time = null;
	private Long reaching_time = null;
	private String reached = null;
	private String alert_pickup_route_stopage_id = null;
	private String alert_dropped_route_stopage_id = null;
	private String alert_pickup_stopage_name = null;
	private String alert_dropped_stopage_name = null;
	private String stopage_alert_sms = null;
	private String stopage_alert_mobile_app = null;
	private String stopage_alert_email = null;
	private String feature_collabrotive_study = null;
	private String feature_parent2parent_chat = null;
	private String feature_homework = null;
	private String feature_daily_activity = null;
	private String feature_notice = null;
	private String feature_home_practice = null;
	private String feature_parent2teacher_chat = null;
	private String feature_teacher2parent_chat = null;
	private String feature_absent_report = null;
	private String feature_test = null;
	private String feature_book = null;
	private String feature_timetable = null;
	private String feature_present_report = null;
	private String feature_pick_drop = null;
	private String feature_message2parent = null;
	private String feature_message2school = null;
	private String feature_proficiency = null;
	private String feature_account = null;
	private String feature_wof = null;
	private String feature_photo = null;
	private String feature_video = null;
	private String feature_fees = null;
	private String feature_work_sheet = null;
	private String only_tracking = null;
	private String logo_file_name = null;
	private Integer daily_activity_count = null;
	private Integer home_practice_count = null;
	private Integer homework_count = null;
	private Integer notice_count = null;
	private String transport = null;
	private Integer transport_count = null;
	private Integer absent_report_count = null;
	private Integer present_report_count = null;
	private Integer message2school_count = null;
	private Integer photo_count = null;
	private Integer video_count = null;
	private Integer fees_count = null;
	private Integer proficiency_count = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_SCHOOL_BRAND_NAME = "school_brand_name";
	public static String FIELD_NAME = "name";
	public static String FIELD_PICKUP_ROUTE_STOPAGE_ID = "pickup_route_stopage_id";
	public static String FIELD_PICKUP_ROUTE_ID = "pickup_route_id";
	public static String FIELD_PICKUP_ROUTE_NAME = "pickup_route_name";
	public static String FIELD_PICKUP_STOPAGE_ID = "pickup_stopage_id";
	public static String FIELD_PICKUP_STOPAGE_NAME = "pickup_stopage_name";
	public static String FIELD_PICKUP_START_TIME = "pickup_start_time";
	public static String FIELD_PICKUP_END_TIME = "pickup_end_time";
	public static String FIELD_PICKUP_VEHICLE_NAME = "pickup_vehicle_name";
	public static String FIELD_PICKUP_DRIVER_ID = "pickup_driver_id";
	public static String FIELD_PICKUP_DRIVER_NAME = "pickup_driver_name";
	public static String FIELD_PICKUP_DRIVER_MOBILE_NO = "pickup_driver_mobile_no";
	public static String FIELD_DROPPED_ROUTE_STOPAGE_ID = "dropped_route_stopage_id";
	public static String FIELD_DROPPED_ROUTE_ID = "dropped_route_id";
	public static String FIELD_DROPPED_ROUTE_NAME = "dropped_route_name";
	public static String FIELD_DROPPED_STOPAGE_ID = "dropped_stopage_id";
	public static String FIELD_DROPPED_STOPAGE_NAME = "dropped_stopage_name";
	public static String FIELD_DROPPED_START_TIME = "dropped_start_time";
	public static String FIELD_DROPPED_END_TIME = "dropped_end_time";
	public static String FIELD_DROPPED_VEHICLE_NAME = "dropped_vehicle_name";
	public static String FIELD_DROPPED_DRIVER_ID = "dropped_driver_id";
	public static String FIELD_DROPPED_DRIVER_NAME = "dropped_driver_name";
	public static String FIELD_DROPPED_DRIVER_MOBILE_NO = "dropped_driver_mobile_no";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_APP_BRANDING = "app_branding";
	public static String FIELD_BUS_STARTED = "bus_started";
	public static String FIELD_LAST_STOPAGE_NAME = "last_stopage_name";
	public static String FIELD_LAST_STOPAGE_TIME = "last_stopage_time";
	public static String FIELD_REACHING_TIME = "reaching_time";
	public static String FIELD_REACHED = "reached";
	public static String FIELD_ALERT_PICKUP_ROUTE_STOPAGE_ID = "alert_pickup_route_stopage_id";
	public static String FIELD_ALERT_DROPPED_ROUTE_STOPAGE_ID = "alert_dropped_route_stopage_id";
	public static String FIELD_ALERT_PICKUP_STOPAGE_NAME = "alert_pickup_stopage_name";
	public static String FIELD_ALERT_DROPPED_STOPAGE_NAME = "alert_dropped_stopage_name";
	public static String FIELD_STOPAGE_ALERT_SMS = "stopage_alert_sms";
	public static String FIELD_STOPAGE_ALERT_MOBILE_APP = "stopage_alert_mobile_app";
	public static String FIELD_STOPAGE_ALERT_EMAIL = "stopage_alert_email";
	public static String FIELD_FEATURE_COLLABROTIVE_STUDY = "feature_collabrotive_study";
	public static String FIELD_FEATURE_PARENT2PARENT_CHAT = "feature_parent2parent_chat";
	public static String FIELD_FEATURE_HOMEWORK = "feature_homework";
	public static String FIELD_FEATURE_DAILY_ACTIVITY = "feature_daily_activity";
	public static String FIELD_FEATURE_NOTICE = "feature_notice";
	public static String FIELD_FEATURE_HOME_PRACTICE = "feature_home_practice";
	public static String FIELD_FEATURE_PARENT2TEACHER_CHAT = "feature_parent2teacher_chat";
	public static String FIELD_FEATURE_TEACHER2PARENT_CHAT = "feature_teacher2parent_chat";
	public static String FIELD_FEATURE_ABSENT_REPORT = "feature_absent_report";
	public static String FIELD_FEATURE_TEST = "feature_test";
	public static String FIELD_FEATURE_BOOK = "feature_book";
	public static String FIELD_FEATURE_TIMETABLE = "feature_timetable";
	public static String FIELD_FEATURE_PRESENT_REPORT = "feature_present_report";
	public static String FIELD_FEATURE_PICK_DROP = "feature_pick_drop";
	public static String FIELD_FEATURE_MESSAGE2PARENT = "feature_message2parent";
	public static String FIELD_FEATURE_MESSAGE2SCHOOL = "feature_message2school";
	public static String FIELD_FEATURE_PROFICIENCY = "feature_proficiency";
	public static String FIELD_FEATURE_ACCOUNT = "feature_account";
	public static String FIELD_FEATURE_WOF = "feature_wof";
	public static String FIELD_FEATURE_PHOTO = "feature_photo";
	public static String FIELD_FEATURE_VIDEO = "feature_video";
	public static String FIELD_FEATURE_FEES = "feature_fees";
	public static String FIELD_FEATURE_WORK_SHEET = "feature_work_sheet";
	public static String FIELD_ONLY_TRACKING = "only_tracking";
	public static String FIELD_LOGO_FILE_NAME = "logo_file_name";
	public static String FIELD_DAILY_ACTIVITY_COUNT = "daily_activity_count";
	public static String FIELD_HOME_PRACTICE_COUNT = "home_practice_count";
	public static String FIELD_HOMEWORK_COUNT = "homework_count";
	public static String FIELD_NOTICE_COUNT = "notice_count";
	public static String FIELD_TRANSPORT = "transport";
	public static String FIELD_TRANSPORT_COUNT = "transport_count";
	public static String FIELD_ABSENT_REPORT_COUNT = "absent_report_count";
	public static String FIELD_PRESENT_REPORT_COUNT = "present_report_count";
	public static String FIELD_MESSAGE2SCHOOL_COUNT = "message2school_count";
	public static String FIELD_PHOTO_COUNT = "photo_count";
	public static String FIELD_VIDEO_COUNT = "video_count";
	public static String FIELD_FEES_COUNT = "fees_count";
	public static String FIELD_PROFICIENCY_COUNT = "proficiency_count";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("student_detail");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field school_brand_nameField = new Field("school_brand_name", "String");
		school_brand_nameField.setLength(128);
		metaData.addField(school_brand_nameField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field pickup_route_stopage_idField = new Field("pickup_route_stopage_id", "String");
		pickup_route_stopage_idField.setLength(128);
		metaData.addField(pickup_route_stopage_idField);

		Field pickup_route_idField = new Field("pickup_route_id", "String");
		pickup_route_idField.setLength(128);
		metaData.addField(pickup_route_idField);

		Field pickup_route_nameField = new Field("pickup_route_name", "String");
		pickup_route_nameField.setLength(128);
		metaData.addField(pickup_route_nameField);

		Field pickup_stopage_idField = new Field("pickup_stopage_id", "String");
		pickup_stopage_idField.setLength(128);
		metaData.addField(pickup_stopage_idField);

		Field pickup_stopage_nameField = new Field("pickup_stopage_name", "String");
		pickup_stopage_nameField.setLength(128);
		metaData.addField(pickup_stopage_nameField);

		Field pickup_start_timeField = new Field("pickup_start_time", "String");
		pickup_start_timeField.setLength(128);
		metaData.addField(pickup_start_timeField);

		Field pickup_end_timeField = new Field("pickup_end_time", "String");
		pickup_end_timeField.setLength(128);
		metaData.addField(pickup_end_timeField);

		Field pickup_vehicle_nameField = new Field("pickup_vehicle_name", "String");
		pickup_vehicle_nameField.setLength(128);
		metaData.addField(pickup_vehicle_nameField);

		Field pickup_driver_idField = new Field("pickup_driver_id", "String");
		pickup_driver_idField.setLength(128);
		metaData.addField(pickup_driver_idField);

		Field pickup_driver_nameField = new Field("pickup_driver_name", "String");
		pickup_driver_nameField.setLength(128);
		metaData.addField(pickup_driver_nameField);

		Field pickup_driver_mobile_noField = new Field("pickup_driver_mobile_no", "String");
		pickup_driver_mobile_noField.setLength(128);
		metaData.addField(pickup_driver_mobile_noField);

		Field dropped_route_stopage_idField = new Field("dropped_route_stopage_id", "String");
		dropped_route_stopage_idField.setLength(128);
		metaData.addField(dropped_route_stopage_idField);

		Field dropped_route_idField = new Field("dropped_route_id", "String");
		dropped_route_idField.setLength(128);
		metaData.addField(dropped_route_idField);

		Field dropped_route_nameField = new Field("dropped_route_name", "String");
		dropped_route_nameField.setLength(128);
		metaData.addField(dropped_route_nameField);

		Field dropped_stopage_idField = new Field("dropped_stopage_id", "String");
		dropped_stopage_idField.setLength(128);
		metaData.addField(dropped_stopage_idField);

		Field dropped_stopage_nameField = new Field("dropped_stopage_name", "String");
		dropped_stopage_nameField.setLength(128);
		metaData.addField(dropped_stopage_nameField);

		Field dropped_start_timeField = new Field("dropped_start_time", "String");
		dropped_start_timeField.setLength(128);
		metaData.addField(dropped_start_timeField);

		Field dropped_end_timeField = new Field("dropped_end_time", "String");
		dropped_end_timeField.setLength(128);
		metaData.addField(dropped_end_timeField);

		Field dropped_vehicle_nameField = new Field("dropped_vehicle_name", "String");
		dropped_vehicle_nameField.setLength(128);
		metaData.addField(dropped_vehicle_nameField);

		Field dropped_driver_idField = new Field("dropped_driver_id", "String");
		dropped_driver_idField.setLength(128);
		metaData.addField(dropped_driver_idField);

		Field dropped_driver_nameField = new Field("dropped_driver_name", "String");
		dropped_driver_nameField.setLength(128);
		metaData.addField(dropped_driver_nameField);

		Field dropped_driver_mobile_noField = new Field("dropped_driver_mobile_no", "String");
		dropped_driver_mobile_noField.setLength(128);
		metaData.addField(dropped_driver_mobile_noField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(16);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(16);
		metaData.addField(section_nameField);

		Field app_brandingField = new Field("app_branding", "String");
		app_brandingField.setDefaultValue("N");
		app_brandingField.setLength(1);
		metaData.addField(app_brandingField);

		Field bus_startedField = new Field("bus_started", "String");
		bus_startedField.setLength(128);
		metaData.addField(bus_startedField);

		Field last_stopage_nameField = new Field("last_stopage_name", "String");
		last_stopage_nameField.setLength(128);
		metaData.addField(last_stopage_nameField);

		Field last_stopage_timeField = new Field("last_stopage_time", "long");
		metaData.addField(last_stopage_timeField);

		Field reaching_timeField = new Field("reaching_time", "long");
		metaData.addField(reaching_timeField);

		Field reachedField = new Field("reached", "String");
		reachedField.setLength(1);
		metaData.addField(reachedField);

		Field alert_pickup_route_stopage_idField = new Field("alert_pickup_route_stopage_id", "String");
		alert_pickup_route_stopage_idField.setLength(128);
		metaData.addField(alert_pickup_route_stopage_idField);

		Field alert_dropped_route_stopage_idField = new Field("alert_dropped_route_stopage_id", "String");
		alert_dropped_route_stopage_idField.setLength(128);
		metaData.addField(alert_dropped_route_stopage_idField);

		Field alert_pickup_stopage_nameField = new Field("alert_pickup_stopage_name", "String");
		alert_pickup_stopage_nameField.setLength(128);
		metaData.addField(alert_pickup_stopage_nameField);

		Field alert_dropped_stopage_nameField = new Field("alert_dropped_stopage_name", "String");
		alert_dropped_stopage_nameField.setLength(128);
		metaData.addField(alert_dropped_stopage_nameField);

		Field stopage_alert_smsField = new Field("stopage_alert_sms", "String");
		stopage_alert_smsField.setDefaultValue("N");
		stopage_alert_smsField.setLength(1);
		metaData.addField(stopage_alert_smsField);

		Field stopage_alert_mobile_appField = new Field("stopage_alert_mobile_app", "String");
		stopage_alert_mobile_appField.setDefaultValue("Y");
		stopage_alert_mobile_appField.setLength(1);
		metaData.addField(stopage_alert_mobile_appField);

		Field stopage_alert_emailField = new Field("stopage_alert_email", "String");
		stopage_alert_emailField.setDefaultValue("N");
		stopage_alert_emailField.setLength(1);
		metaData.addField(stopage_alert_emailField);

		Field feature_collabrotive_studyField = new Field("feature_collabrotive_study", "String");
		feature_collabrotive_studyField.setDefaultValue("N");
		feature_collabrotive_studyField.setLength(1);
		metaData.addField(feature_collabrotive_studyField);

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

		Field feature_noticeField = new Field("feature_notice", "String");
		feature_noticeField.setDefaultValue("N");
		feature_noticeField.setLength(1);
		metaData.addField(feature_noticeField);

		Field feature_home_practiceField = new Field("feature_home_practice", "String");
		feature_home_practiceField.setDefaultValue("N");
		feature_home_practiceField.setLength(1);
		metaData.addField(feature_home_practiceField);

		Field feature_parent2teacher_chatField = new Field("feature_parent2teacher_chat", "String");
		feature_parent2teacher_chatField.setDefaultValue("N");
		feature_parent2teacher_chatField.setLength(1);
		metaData.addField(feature_parent2teacher_chatField);

		Field feature_teacher2parent_chatField = new Field("feature_teacher2parent_chat", "String");
		feature_teacher2parent_chatField.setDefaultValue("N");
		feature_teacher2parent_chatField.setLength(1);
		metaData.addField(feature_teacher2parent_chatField);

		Field feature_absent_reportField = new Field("feature_absent_report", "String");
		feature_absent_reportField.setDefaultValue("N");
		feature_absent_reportField.setLength(1);
		metaData.addField(feature_absent_reportField);

		Field feature_testField = new Field("feature_test", "String");
		feature_testField.setDefaultValue("N");
		feature_testField.setLength(1);
		metaData.addField(feature_testField);

		Field feature_bookField = new Field("feature_book", "String");
		feature_bookField.setDefaultValue("N");
		feature_bookField.setLength(1);
		metaData.addField(feature_bookField);

		Field feature_timetableField = new Field("feature_timetable", "String");
		feature_timetableField.setDefaultValue("N");
		feature_timetableField.setLength(1);
		metaData.addField(feature_timetableField);

		Field feature_present_reportField = new Field("feature_present_report", "String");
		feature_present_reportField.setDefaultValue("N");
		feature_present_reportField.setLength(1);
		metaData.addField(feature_present_reportField);

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

		Field feature_accountField = new Field("feature_account", "String");
		feature_accountField.setDefaultValue("N");
		feature_accountField.setLength(1);
		metaData.addField(feature_accountField);

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

		Field feature_feesField = new Field("feature_fees", "String");
		feature_feesField.setDefaultValue("N");
		feature_feesField.setLength(1);
		metaData.addField(feature_feesField);

		Field feature_work_sheetField = new Field("feature_work_sheet", "String");
		feature_work_sheetField.setDefaultValue("N");
		feature_work_sheetField.setLength(1);
		metaData.addField(feature_work_sheetField);

		Field only_trackingField = new Field("only_tracking", "String");
		only_trackingField.setDefaultValue("N");
		only_trackingField.setLength(1);
		metaData.addField(only_trackingField);

		Field logo_file_nameField = new Field("logo_file_name", "String");
		logo_file_nameField.setLength(128);
		metaData.addField(logo_file_nameField);

		Field daily_activity_countField = new Field("daily_activity_count", "int");
		daily_activity_countField.setDefaultValue(0);
		metaData.addField(daily_activity_countField);

		Field home_practice_countField = new Field("home_practice_count", "int");
		home_practice_countField.setDefaultValue(0);
		metaData.addField(home_practice_countField);

		Field homework_countField = new Field("homework_count", "int");
		homework_countField.setDefaultValue(0);
		metaData.addField(homework_countField);

		Field notice_countField = new Field("notice_count", "int");
		notice_countField.setDefaultValue(0);
		metaData.addField(notice_countField);

		Field transportField = new Field("transport", "String");
		transportField.setDefaultValue("N");
		transportField.setLength(1);
		metaData.addField(transportField);

		Field transport_countField = new Field("transport_count", "int");
		transport_countField.setDefaultValue(0);
		metaData.addField(transport_countField);

		Field absent_report_countField = new Field("absent_report_count", "int");
		absent_report_countField.setDefaultValue(0);
		metaData.addField(absent_report_countField);

		Field present_report_countField = new Field("present_report_count", "int");
		present_report_countField.setDefaultValue(0);
		metaData.addField(present_report_countField);

		Field message2school_countField = new Field("message2school_count", "int");
		message2school_countField.setDefaultValue(0);
		metaData.addField(message2school_countField);

		Field photo_countField = new Field("photo_count", "int");
		photo_countField.setDefaultValue(0);
		metaData.addField(photo_countField);

		Field video_countField = new Field("video_count", "int");
		video_countField.setDefaultValue(0);
		metaData.addField(video_countField);

		Field fees_countField = new Field("fees_count", "int");
		fees_countField.setDefaultValue(0);
		metaData.addField(fees_countField);

		Field proficiency_countField = new Field("proficiency_count", "int");
		proficiency_countField.setDefaultValue(0);
		metaData.addField(proficiency_countField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("student_detail");

		metaData.setCluster("DB_PROFILE");
	}

	public Basestudent_detail() {}

	public Basestudent_detail(Basestudent_detail obj) {
		this.id = obj.id;
		this.community_id = obj.community_id;
		this.school_id = obj.school_id;
		this.school_brand_name = obj.school_brand_name;
		this.name = obj.name;
		this.pickup_route_stopage_id = obj.pickup_route_stopage_id;
		this.pickup_route_id = obj.pickup_route_id;
		this.pickup_route_name = obj.pickup_route_name;
		this.pickup_stopage_id = obj.pickup_stopage_id;
		this.pickup_stopage_name = obj.pickup_stopage_name;
		this.pickup_start_time = obj.pickup_start_time;
		this.pickup_end_time = obj.pickup_end_time;
		this.pickup_vehicle_name = obj.pickup_vehicle_name;
		this.pickup_driver_id = obj.pickup_driver_id;
		this.pickup_driver_name = obj.pickup_driver_name;
		this.pickup_driver_mobile_no = obj.pickup_driver_mobile_no;
		this.dropped_route_stopage_id = obj.dropped_route_stopage_id;
		this.dropped_route_id = obj.dropped_route_id;
		this.dropped_route_name = obj.dropped_route_name;
		this.dropped_stopage_id = obj.dropped_stopage_id;
		this.dropped_stopage_name = obj.dropped_stopage_name;
		this.dropped_start_time = obj.dropped_start_time;
		this.dropped_end_time = obj.dropped_end_time;
		this.dropped_vehicle_name = obj.dropped_vehicle_name;
		this.dropped_driver_id = obj.dropped_driver_id;
		this.dropped_driver_name = obj.dropped_driver_name;
		this.dropped_driver_mobile_no = obj.dropped_driver_mobile_no;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.app_branding = obj.app_branding;
		this.bus_started = obj.bus_started;
		this.last_stopage_name = obj.last_stopage_name;
		this.last_stopage_time = obj.last_stopage_time;
		this.reaching_time = obj.reaching_time;
		this.reached = obj.reached;
		this.alert_pickup_route_stopage_id = obj.alert_pickup_route_stopage_id;
		this.alert_dropped_route_stopage_id = obj.alert_dropped_route_stopage_id;
		this.alert_pickup_stopage_name = obj.alert_pickup_stopage_name;
		this.alert_dropped_stopage_name = obj.alert_dropped_stopage_name;
		this.stopage_alert_sms = obj.stopage_alert_sms;
		this.stopage_alert_mobile_app = obj.stopage_alert_mobile_app;
		this.stopage_alert_email = obj.stopage_alert_email;
		this.feature_collabrotive_study = obj.feature_collabrotive_study;
		this.feature_parent2parent_chat = obj.feature_parent2parent_chat;
		this.feature_homework = obj.feature_homework;
		this.feature_daily_activity = obj.feature_daily_activity;
		this.feature_notice = obj.feature_notice;
		this.feature_home_practice = obj.feature_home_practice;
		this.feature_parent2teacher_chat = obj.feature_parent2teacher_chat;
		this.feature_teacher2parent_chat = obj.feature_teacher2parent_chat;
		this.feature_absent_report = obj.feature_absent_report;
		this.feature_test = obj.feature_test;
		this.feature_book = obj.feature_book;
		this.feature_timetable = obj.feature_timetable;
		this.feature_present_report = obj.feature_present_report;
		this.feature_pick_drop = obj.feature_pick_drop;
		this.feature_message2parent = obj.feature_message2parent;
		this.feature_message2school = obj.feature_message2school;
		this.feature_proficiency = obj.feature_proficiency;
		this.feature_account = obj.feature_account;
		this.feature_wof = obj.feature_wof;
		this.feature_photo = obj.feature_photo;
		this.feature_video = obj.feature_video;
		this.feature_fees = obj.feature_fees;
		this.feature_work_sheet = obj.feature_work_sheet;
		this.only_tracking = obj.only_tracking;
		this.logo_file_name = obj.logo_file_name;
		this.daily_activity_count = obj.daily_activity_count;
		this.home_practice_count = obj.home_practice_count;
		this.homework_count = obj.homework_count;
		this.notice_count = obj.notice_count;
		this.transport = obj.transport;
		this.transport_count = obj.transport_count;
		this.absent_report_count = obj.absent_report_count;
		this.present_report_count = obj.present_report_count;
		this.message2school_count = obj.message2school_count;
		this.photo_count = obj.photo_count;
		this.video_count = obj.video_count;
		this.fees_count = obj.fees_count;
		this.proficiency_count = obj.proficiency_count;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(app_branding == null)
			app_branding = "N";
		if(stopage_alert_sms == null)
			stopage_alert_sms = "N";
		if(stopage_alert_mobile_app == null)
			stopage_alert_mobile_app = "Y";
		if(stopage_alert_email == null)
			stopage_alert_email = "N";
		if(feature_collabrotive_study == null)
			feature_collabrotive_study = "N";
		if(feature_parent2parent_chat == null)
			feature_parent2parent_chat = "N";
		if(feature_homework == null)
			feature_homework = "N";
		if(feature_daily_activity == null)
			feature_daily_activity = "N";
		if(feature_notice == null)
			feature_notice = "N";
		if(feature_home_practice == null)
			feature_home_practice = "N";
		if(feature_parent2teacher_chat == null)
			feature_parent2teacher_chat = "N";
		if(feature_teacher2parent_chat == null)
			feature_teacher2parent_chat = "N";
		if(feature_absent_report == null)
			feature_absent_report = "N";
		if(feature_test == null)
			feature_test = "N";
		if(feature_book == null)
			feature_book = "N";
		if(feature_timetable == null)
			feature_timetable = "N";
		if(feature_present_report == null)
			feature_present_report = "N";
		if(feature_pick_drop == null)
			feature_pick_drop = "N";
		if(feature_message2parent == null)
			feature_message2parent = "N";
		if(feature_message2school == null)
			feature_message2school = "N";
		if(feature_proficiency == null)
			feature_proficiency = "N";
		if(feature_account == null)
			feature_account = "N";
		if(feature_wof == null)
			feature_wof = "N";
		if(feature_photo == null)
			feature_photo = "N";
		if(feature_video == null)
			feature_video = "N";
		if(feature_fees == null)
			feature_fees = "N";
		if(feature_work_sheet == null)
			feature_work_sheet = "N";
		if(only_tracking == null)
			only_tracking = "N";
		if(daily_activity_count == null)
			daily_activity_count = 0;
		if(home_practice_count == null)
			home_practice_count = 0;
		if(homework_count == null)
			homework_count = 0;
		if(notice_count == null)
			notice_count = 0;
		if(transport == null)
			transport = "N";
		if(transport_count == null)
			transport_count = 0;
		if(absent_report_count == null)
			absent_report_count = 0;
		if(present_report_count == null)
			present_report_count = 0;
		if(message2school_count == null)
			message2school_count = 0;
		if(photo_count == null)
			photo_count = 0;
		if(video_count == null)
			video_count = 0;
		if(fees_count == null)
			fees_count = 0;
		if(proficiency_count == null)
			proficiency_count = 0;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(school_brand_name != null)
			map.put("school_brand_name", school_brand_name);
		if(name != null)
			map.put("name", name);
		if(pickup_route_stopage_id != null)
			map.put("pickup_route_stopage_id", pickup_route_stopage_id);
		if(pickup_route_id != null)
			map.put("pickup_route_id", pickup_route_id);
		if(pickup_route_name != null)
			map.put("pickup_route_name", pickup_route_name);
		if(pickup_stopage_id != null)
			map.put("pickup_stopage_id", pickup_stopage_id);
		if(pickup_stopage_name != null)
			map.put("pickup_stopage_name", pickup_stopage_name);
		if(pickup_start_time != null)
			map.put("pickup_start_time", pickup_start_time);
		if(pickup_end_time != null)
			map.put("pickup_end_time", pickup_end_time);
		if(pickup_vehicle_name != null)
			map.put("pickup_vehicle_name", pickup_vehicle_name);
		if(pickup_driver_id != null)
			map.put("pickup_driver_id", pickup_driver_id);
		if(pickup_driver_name != null)
			map.put("pickup_driver_name", pickup_driver_name);
		if(pickup_driver_mobile_no != null)
			map.put("pickup_driver_mobile_no", pickup_driver_mobile_no);
		if(dropped_route_stopage_id != null)
			map.put("dropped_route_stopage_id", dropped_route_stopage_id);
		if(dropped_route_id != null)
			map.put("dropped_route_id", dropped_route_id);
		if(dropped_route_name != null)
			map.put("dropped_route_name", dropped_route_name);
		if(dropped_stopage_id != null)
			map.put("dropped_stopage_id", dropped_stopage_id);
		if(dropped_stopage_name != null)
			map.put("dropped_stopage_name", dropped_stopage_name);
		if(dropped_start_time != null)
			map.put("dropped_start_time", dropped_start_time);
		if(dropped_end_time != null)
			map.put("dropped_end_time", dropped_end_time);
		if(dropped_vehicle_name != null)
			map.put("dropped_vehicle_name", dropped_vehicle_name);
		if(dropped_driver_id != null)
			map.put("dropped_driver_id", dropped_driver_id);
		if(dropped_driver_name != null)
			map.put("dropped_driver_name", dropped_driver_name);
		if(dropped_driver_mobile_no != null)
			map.put("dropped_driver_mobile_no", dropped_driver_mobile_no);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(app_branding != null)
			map.put("app_branding", app_branding);
		if(bus_started != null)
			map.put("bus_started", bus_started);
		if(last_stopage_name != null)
			map.put("last_stopage_name", last_stopage_name);
		if(last_stopage_time != null)
			map.put("last_stopage_time", last_stopage_time);
		if(reaching_time != null)
			map.put("reaching_time", reaching_time);
		if(reached != null)
			map.put("reached", reached);
		if(alert_pickup_route_stopage_id != null)
			map.put("alert_pickup_route_stopage_id", alert_pickup_route_stopage_id);
		if(alert_dropped_route_stopage_id != null)
			map.put("alert_dropped_route_stopage_id", alert_dropped_route_stopage_id);
		if(alert_pickup_stopage_name != null)
			map.put("alert_pickup_stopage_name", alert_pickup_stopage_name);
		if(alert_dropped_stopage_name != null)
			map.put("alert_dropped_stopage_name", alert_dropped_stopage_name);
		if(stopage_alert_sms != null)
			map.put("stopage_alert_sms", stopage_alert_sms);
		if(stopage_alert_mobile_app != null)
			map.put("stopage_alert_mobile_app", stopage_alert_mobile_app);
		if(stopage_alert_email != null)
			map.put("stopage_alert_email", stopage_alert_email);
		if(feature_collabrotive_study != null)
			map.put("feature_collabrotive_study", feature_collabrotive_study);
		if(feature_parent2parent_chat != null)
			map.put("feature_parent2parent_chat", feature_parent2parent_chat);
		if(feature_homework != null)
			map.put("feature_homework", feature_homework);
		if(feature_daily_activity != null)
			map.put("feature_daily_activity", feature_daily_activity);
		if(feature_notice != null)
			map.put("feature_notice", feature_notice);
		if(feature_home_practice != null)
			map.put("feature_home_practice", feature_home_practice);
		if(feature_parent2teacher_chat != null)
			map.put("feature_parent2teacher_chat", feature_parent2teacher_chat);
		if(feature_teacher2parent_chat != null)
			map.put("feature_teacher2parent_chat", feature_teacher2parent_chat);
		if(feature_absent_report != null)
			map.put("feature_absent_report", feature_absent_report);
		if(feature_test != null)
			map.put("feature_test", feature_test);
		if(feature_book != null)
			map.put("feature_book", feature_book);
		if(feature_timetable != null)
			map.put("feature_timetable", feature_timetable);
		if(feature_present_report != null)
			map.put("feature_present_report", feature_present_report);
		if(feature_pick_drop != null)
			map.put("feature_pick_drop", feature_pick_drop);
		if(feature_message2parent != null)
			map.put("feature_message2parent", feature_message2parent);
		if(feature_message2school != null)
			map.put("feature_message2school", feature_message2school);
		if(feature_proficiency != null)
			map.put("feature_proficiency", feature_proficiency);
		if(feature_account != null)
			map.put("feature_account", feature_account);
		if(feature_wof != null)
			map.put("feature_wof", feature_wof);
		if(feature_photo != null)
			map.put("feature_photo", feature_photo);
		if(feature_video != null)
			map.put("feature_video", feature_video);
		if(feature_fees != null)
			map.put("feature_fees", feature_fees);
		if(feature_work_sheet != null)
			map.put("feature_work_sheet", feature_work_sheet);
		if(only_tracking != null)
			map.put("only_tracking", only_tracking);
		if(logo_file_name != null)
			map.put("logo_file_name", logo_file_name);
		if(daily_activity_count != null)
			map.put("daily_activity_count", daily_activity_count);
		if(home_practice_count != null)
			map.put("home_practice_count", home_practice_count);
		if(homework_count != null)
			map.put("homework_count", homework_count);
		if(notice_count != null)
			map.put("notice_count", notice_count);
		if(transport != null)
			map.put("transport", transport);
		if(transport_count != null)
			map.put("transport_count", transport_count);
		if(absent_report_count != null)
			map.put("absent_report_count", absent_report_count);
		if(present_report_count != null)
			map.put("present_report_count", present_report_count);
		if(message2school_count != null)
			map.put("message2school_count", message2school_count);
		if(photo_count != null)
			map.put("photo_count", photo_count);
		if(video_count != null)
			map.put("video_count", video_count);
		if(fees_count != null)
			map.put("fees_count", fees_count);
		if(proficiency_count != null)
			map.put("proficiency_count", proficiency_count);
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
		if(community_id != null)
			map.put("community_id", community_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(school_brand_name != null)
			map.put("school_brand_name", school_brand_name);
		if(name != null)
			map.put("name", name);
		if(pickup_route_stopage_id != null)
			map.put("pickup_route_stopage_id", pickup_route_stopage_id);
		if(pickup_route_id != null)
			map.put("pickup_route_id", pickup_route_id);
		if(pickup_route_name != null)
			map.put("pickup_route_name", pickup_route_name);
		if(pickup_stopage_id != null)
			map.put("pickup_stopage_id", pickup_stopage_id);
		if(pickup_stopage_name != null)
			map.put("pickup_stopage_name", pickup_stopage_name);
		if(pickup_start_time != null)
			map.put("pickup_start_time", pickup_start_time);
		if(pickup_end_time != null)
			map.put("pickup_end_time", pickup_end_time);
		if(pickup_vehicle_name != null)
			map.put("pickup_vehicle_name", pickup_vehicle_name);
		if(pickup_driver_id != null)
			map.put("pickup_driver_id", pickup_driver_id);
		if(pickup_driver_name != null)
			map.put("pickup_driver_name", pickup_driver_name);
		if(pickup_driver_mobile_no != null)
			map.put("pickup_driver_mobile_no", pickup_driver_mobile_no);
		if(dropped_route_stopage_id != null)
			map.put("dropped_route_stopage_id", dropped_route_stopage_id);
		if(dropped_route_id != null)
			map.put("dropped_route_id", dropped_route_id);
		if(dropped_route_name != null)
			map.put("dropped_route_name", dropped_route_name);
		if(dropped_stopage_id != null)
			map.put("dropped_stopage_id", dropped_stopage_id);
		if(dropped_stopage_name != null)
			map.put("dropped_stopage_name", dropped_stopage_name);
		if(dropped_start_time != null)
			map.put("dropped_start_time", dropped_start_time);
		if(dropped_end_time != null)
			map.put("dropped_end_time", dropped_end_time);
		if(dropped_vehicle_name != null)
			map.put("dropped_vehicle_name", dropped_vehicle_name);
		if(dropped_driver_id != null)
			map.put("dropped_driver_id", dropped_driver_id);
		if(dropped_driver_name != null)
			map.put("dropped_driver_name", dropped_driver_name);
		if(dropped_driver_mobile_no != null)
			map.put("dropped_driver_mobile_no", dropped_driver_mobile_no);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(app_branding != null)
			map.put("app_branding", app_branding);
		if(bus_started != null)
			map.put("bus_started", bus_started);
		if(last_stopage_name != null)
			map.put("last_stopage_name", last_stopage_name);
		if(last_stopage_time != null)
			map.put("last_stopage_time", last_stopage_time);
		if(reaching_time != null)
			map.put("reaching_time", reaching_time);
		if(reached != null)
			map.put("reached", reached);
		if(alert_pickup_route_stopage_id != null)
			map.put("alert_pickup_route_stopage_id", alert_pickup_route_stopage_id);
		if(alert_dropped_route_stopage_id != null)
			map.put("alert_dropped_route_stopage_id", alert_dropped_route_stopage_id);
		if(alert_pickup_stopage_name != null)
			map.put("alert_pickup_stopage_name", alert_pickup_stopage_name);
		if(alert_dropped_stopage_name != null)
			map.put("alert_dropped_stopage_name", alert_dropped_stopage_name);
		if(stopage_alert_sms != null)
			map.put("stopage_alert_sms", stopage_alert_sms);
		if(stopage_alert_mobile_app != null)
			map.put("stopage_alert_mobile_app", stopage_alert_mobile_app);
		if(stopage_alert_email != null)
			map.put("stopage_alert_email", stopage_alert_email);
		if(feature_collabrotive_study != null)
			map.put("feature_collabrotive_study", feature_collabrotive_study);
		if(feature_parent2parent_chat != null)
			map.put("feature_parent2parent_chat", feature_parent2parent_chat);
		if(feature_homework != null)
			map.put("feature_homework", feature_homework);
		if(feature_daily_activity != null)
			map.put("feature_daily_activity", feature_daily_activity);
		if(feature_notice != null)
			map.put("feature_notice", feature_notice);
		if(feature_home_practice != null)
			map.put("feature_home_practice", feature_home_practice);
		if(feature_parent2teacher_chat != null)
			map.put("feature_parent2teacher_chat", feature_parent2teacher_chat);
		if(feature_teacher2parent_chat != null)
			map.put("feature_teacher2parent_chat", feature_teacher2parent_chat);
		if(feature_absent_report != null)
			map.put("feature_absent_report", feature_absent_report);
		if(feature_test != null)
			map.put("feature_test", feature_test);
		if(feature_book != null)
			map.put("feature_book", feature_book);
		if(feature_timetable != null)
			map.put("feature_timetable", feature_timetable);
		if(feature_present_report != null)
			map.put("feature_present_report", feature_present_report);
		if(feature_pick_drop != null)
			map.put("feature_pick_drop", feature_pick_drop);
		if(feature_message2parent != null)
			map.put("feature_message2parent", feature_message2parent);
		if(feature_message2school != null)
			map.put("feature_message2school", feature_message2school);
		if(feature_proficiency != null)
			map.put("feature_proficiency", feature_proficiency);
		if(feature_account != null)
			map.put("feature_account", feature_account);
		if(feature_wof != null)
			map.put("feature_wof", feature_wof);
		if(feature_photo != null)
			map.put("feature_photo", feature_photo);
		if(feature_video != null)
			map.put("feature_video", feature_video);
		if(feature_fees != null)
			map.put("feature_fees", feature_fees);
		if(feature_work_sheet != null)
			map.put("feature_work_sheet", feature_work_sheet);
		if(only_tracking != null)
			map.put("only_tracking", only_tracking);
		if(logo_file_name != null)
			map.put("logo_file_name", logo_file_name);
		if(daily_activity_count != null)
			map.put("daily_activity_count", daily_activity_count);
		if(home_practice_count != null)
			map.put("home_practice_count", home_practice_count);
		if(homework_count != null)
			map.put("homework_count", homework_count);
		if(notice_count != null)
			map.put("notice_count", notice_count);
		if(transport != null)
			map.put("transport", transport);
		if(transport_count != null)
			map.put("transport_count", transport_count);
		if(absent_report_count != null)
			map.put("absent_report_count", absent_report_count);
		if(present_report_count != null)
			map.put("present_report_count", present_report_count);
		if(message2school_count != null)
			map.put("message2school_count", message2school_count);
		if(photo_count != null)
			map.put("photo_count", photo_count);
		if(video_count != null)
			map.put("video_count", video_count);
		if(fees_count != null)
			map.put("fees_count", fees_count);
		if(proficiency_count != null)
			map.put("proficiency_count", proficiency_count);
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
		community_id = (String) map.get("community_id");
		school_id = (String) map.get("school_id");
		school_brand_name = (String) map.get("school_brand_name");
		name = (String) map.get("name");
		pickup_route_stopage_id = (String) map.get("pickup_route_stopage_id");
		pickup_route_id = (String) map.get("pickup_route_id");
		pickup_route_name = (String) map.get("pickup_route_name");
		pickup_stopage_id = (String) map.get("pickup_stopage_id");
		pickup_stopage_name = (String) map.get("pickup_stopage_name");
		pickup_start_time = (String) map.get("pickup_start_time");
		pickup_end_time = (String) map.get("pickup_end_time");
		pickup_vehicle_name = (String) map.get("pickup_vehicle_name");
		pickup_driver_id = (String) map.get("pickup_driver_id");
		pickup_driver_name = (String) map.get("pickup_driver_name");
		pickup_driver_mobile_no = (String) map.get("pickup_driver_mobile_no");
		dropped_route_stopage_id = (String) map.get("dropped_route_stopage_id");
		dropped_route_id = (String) map.get("dropped_route_id");
		dropped_route_name = (String) map.get("dropped_route_name");
		dropped_stopage_id = (String) map.get("dropped_stopage_id");
		dropped_stopage_name = (String) map.get("dropped_stopage_name");
		dropped_start_time = (String) map.get("dropped_start_time");
		dropped_end_time = (String) map.get("dropped_end_time");
		dropped_vehicle_name = (String) map.get("dropped_vehicle_name");
		dropped_driver_id = (String) map.get("dropped_driver_id");
		dropped_driver_name = (String) map.get("dropped_driver_name");
		dropped_driver_mobile_no = (String) map.get("dropped_driver_mobile_no");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		app_branding = (String) map.get("app_branding");
		bus_started = (String) map.get("bus_started");
		last_stopage_name = (String) map.get("last_stopage_name");
		last_stopage_time = (Long) map.get("last_stopage_time");
		reaching_time = (Long) map.get("reaching_time");
		reached = (String) map.get("reached");
		alert_pickup_route_stopage_id = (String) map.get("alert_pickup_route_stopage_id");
		alert_dropped_route_stopage_id = (String) map.get("alert_dropped_route_stopage_id");
		alert_pickup_stopage_name = (String) map.get("alert_pickup_stopage_name");
		alert_dropped_stopage_name = (String) map.get("alert_dropped_stopage_name");
		stopage_alert_sms = (String) map.get("stopage_alert_sms");
		stopage_alert_mobile_app = (String) map.get("stopage_alert_mobile_app");
		stopage_alert_email = (String) map.get("stopage_alert_email");
		feature_collabrotive_study = (String) map.get("feature_collabrotive_study");
		feature_parent2parent_chat = (String) map.get("feature_parent2parent_chat");
		feature_homework = (String) map.get("feature_homework");
		feature_daily_activity = (String) map.get("feature_daily_activity");
		feature_notice = (String) map.get("feature_notice");
		feature_home_practice = (String) map.get("feature_home_practice");
		feature_parent2teacher_chat = (String) map.get("feature_parent2teacher_chat");
		feature_teacher2parent_chat = (String) map.get("feature_teacher2parent_chat");
		feature_absent_report = (String) map.get("feature_absent_report");
		feature_test = (String) map.get("feature_test");
		feature_book = (String) map.get("feature_book");
		feature_timetable = (String) map.get("feature_timetable");
		feature_present_report = (String) map.get("feature_present_report");
		feature_pick_drop = (String) map.get("feature_pick_drop");
		feature_message2parent = (String) map.get("feature_message2parent");
		feature_message2school = (String) map.get("feature_message2school");
		feature_proficiency = (String) map.get("feature_proficiency");
		feature_account = (String) map.get("feature_account");
		feature_wof = (String) map.get("feature_wof");
		feature_photo = (String) map.get("feature_photo");
		feature_video = (String) map.get("feature_video");
		feature_fees = (String) map.get("feature_fees");
		feature_work_sheet = (String) map.get("feature_work_sheet");
		only_tracking = (String) map.get("only_tracking");
		logo_file_name = (String) map.get("logo_file_name");
		daily_activity_count = (Integer) map.get("daily_activity_count");
		home_practice_count = (Integer) map.get("home_practice_count");
		homework_count = (Integer) map.get("homework_count");
		notice_count = (Integer) map.get("notice_count");
		transport = (String) map.get("transport");
		transport_count = (Integer) map.get("transport_count");
		absent_report_count = (Integer) map.get("absent_report_count");
		present_report_count = (Integer) map.get("present_report_count");
		message2school_count = (Integer) map.get("message2school_count");
		photo_count = (Integer) map.get("photo_count");
		video_count = (Integer) map.get("video_count");
		fees_count = (Integer) map.get("fees_count");
		proficiency_count = (Integer) map.get("proficiency_count");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object school_brand_nameObj = map.get("school_brand_name");
		if(school_brand_nameObj != null)
			school_brand_name = school_brand_nameObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object pickup_route_stopage_idObj = map.get("pickup_route_stopage_id");
		if(pickup_route_stopage_idObj != null)
			pickup_route_stopage_id = pickup_route_stopage_idObj.toString();

		Object pickup_route_idObj = map.get("pickup_route_id");
		if(pickup_route_idObj != null)
			pickup_route_id = pickup_route_idObj.toString();

		Object pickup_route_nameObj = map.get("pickup_route_name");
		if(pickup_route_nameObj != null)
			pickup_route_name = pickup_route_nameObj.toString();

		Object pickup_stopage_idObj = map.get("pickup_stopage_id");
		if(pickup_stopage_idObj != null)
			pickup_stopage_id = pickup_stopage_idObj.toString();

		Object pickup_stopage_nameObj = map.get("pickup_stopage_name");
		if(pickup_stopage_nameObj != null)
			pickup_stopage_name = pickup_stopage_nameObj.toString();

		Object pickup_start_timeObj = map.get("pickup_start_time");
		if(pickup_start_timeObj != null)
			pickup_start_time = pickup_start_timeObj.toString();

		Object pickup_end_timeObj = map.get("pickup_end_time");
		if(pickup_end_timeObj != null)
			pickup_end_time = pickup_end_timeObj.toString();

		Object pickup_vehicle_nameObj = map.get("pickup_vehicle_name");
		if(pickup_vehicle_nameObj != null)
			pickup_vehicle_name = pickup_vehicle_nameObj.toString();

		Object pickup_driver_idObj = map.get("pickup_driver_id");
		if(pickup_driver_idObj != null)
			pickup_driver_id = pickup_driver_idObj.toString();

		Object pickup_driver_nameObj = map.get("pickup_driver_name");
		if(pickup_driver_nameObj != null)
			pickup_driver_name = pickup_driver_nameObj.toString();

		Object pickup_driver_mobile_noObj = map.get("pickup_driver_mobile_no");
		if(pickup_driver_mobile_noObj != null)
			pickup_driver_mobile_no = pickup_driver_mobile_noObj.toString();

		Object dropped_route_stopage_idObj = map.get("dropped_route_stopage_id");
		if(dropped_route_stopage_idObj != null)
			dropped_route_stopage_id = dropped_route_stopage_idObj.toString();

		Object dropped_route_idObj = map.get("dropped_route_id");
		if(dropped_route_idObj != null)
			dropped_route_id = dropped_route_idObj.toString();

		Object dropped_route_nameObj = map.get("dropped_route_name");
		if(dropped_route_nameObj != null)
			dropped_route_name = dropped_route_nameObj.toString();

		Object dropped_stopage_idObj = map.get("dropped_stopage_id");
		if(dropped_stopage_idObj != null)
			dropped_stopage_id = dropped_stopage_idObj.toString();

		Object dropped_stopage_nameObj = map.get("dropped_stopage_name");
		if(dropped_stopage_nameObj != null)
			dropped_stopage_name = dropped_stopage_nameObj.toString();

		Object dropped_start_timeObj = map.get("dropped_start_time");
		if(dropped_start_timeObj != null)
			dropped_start_time = dropped_start_timeObj.toString();

		Object dropped_end_timeObj = map.get("dropped_end_time");
		if(dropped_end_timeObj != null)
			dropped_end_time = dropped_end_timeObj.toString();

		Object dropped_vehicle_nameObj = map.get("dropped_vehicle_name");
		if(dropped_vehicle_nameObj != null)
			dropped_vehicle_name = dropped_vehicle_nameObj.toString();

		Object dropped_driver_idObj = map.get("dropped_driver_id");
		if(dropped_driver_idObj != null)
			dropped_driver_id = dropped_driver_idObj.toString();

		Object dropped_driver_nameObj = map.get("dropped_driver_name");
		if(dropped_driver_nameObj != null)
			dropped_driver_name = dropped_driver_nameObj.toString();

		Object dropped_driver_mobile_noObj = map.get("dropped_driver_mobile_no");
		if(dropped_driver_mobile_noObj != null)
			dropped_driver_mobile_no = dropped_driver_mobile_noObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object app_brandingObj = map.get("app_branding");
		if(app_brandingObj != null)
			app_branding = app_brandingObj.toString();

		Object bus_startedObj = map.get("bus_started");
		if(bus_startedObj != null)
			bus_started = bus_startedObj.toString();

		Object last_stopage_nameObj = map.get("last_stopage_name");
		if(last_stopage_nameObj != null)
			last_stopage_name = last_stopage_nameObj.toString();

		Object last_stopage_timeObj = map.get("last_stopage_time");
		if(last_stopage_timeObj != null)
			last_stopage_time = new Long(last_stopage_timeObj.toString());

		Object reaching_timeObj = map.get("reaching_time");
		if(reaching_timeObj != null)
			reaching_time = new Long(reaching_timeObj.toString());

		Object reachedObj = map.get("reached");
		if(reachedObj != null)
			reached = reachedObj.toString();

		Object alert_pickup_route_stopage_idObj = map.get("alert_pickup_route_stopage_id");
		if(alert_pickup_route_stopage_idObj != null)
			alert_pickup_route_stopage_id = alert_pickup_route_stopage_idObj.toString();

		Object alert_dropped_route_stopage_idObj = map.get("alert_dropped_route_stopage_id");
		if(alert_dropped_route_stopage_idObj != null)
			alert_dropped_route_stopage_id = alert_dropped_route_stopage_idObj.toString();

		Object alert_pickup_stopage_nameObj = map.get("alert_pickup_stopage_name");
		if(alert_pickup_stopage_nameObj != null)
			alert_pickup_stopage_name = alert_pickup_stopage_nameObj.toString();

		Object alert_dropped_stopage_nameObj = map.get("alert_dropped_stopage_name");
		if(alert_dropped_stopage_nameObj != null)
			alert_dropped_stopage_name = alert_dropped_stopage_nameObj.toString();

		Object stopage_alert_smsObj = map.get("stopage_alert_sms");
		if(stopage_alert_smsObj != null)
			stopage_alert_sms = stopage_alert_smsObj.toString();

		Object stopage_alert_mobile_appObj = map.get("stopage_alert_mobile_app");
		if(stopage_alert_mobile_appObj != null)
			stopage_alert_mobile_app = stopage_alert_mobile_appObj.toString();

		Object stopage_alert_emailObj = map.get("stopage_alert_email");
		if(stopage_alert_emailObj != null)
			stopage_alert_email = stopage_alert_emailObj.toString();

		Object feature_collabrotive_studyObj = map.get("feature_collabrotive_study");
		if(feature_collabrotive_studyObj != null)
			feature_collabrotive_study = feature_collabrotive_studyObj.toString();

		Object feature_parent2parent_chatObj = map.get("feature_parent2parent_chat");
		if(feature_parent2parent_chatObj != null)
			feature_parent2parent_chat = feature_parent2parent_chatObj.toString();

		Object feature_homeworkObj = map.get("feature_homework");
		if(feature_homeworkObj != null)
			feature_homework = feature_homeworkObj.toString();

		Object feature_daily_activityObj = map.get("feature_daily_activity");
		if(feature_daily_activityObj != null)
			feature_daily_activity = feature_daily_activityObj.toString();

		Object feature_noticeObj = map.get("feature_notice");
		if(feature_noticeObj != null)
			feature_notice = feature_noticeObj.toString();

		Object feature_home_practiceObj = map.get("feature_home_practice");
		if(feature_home_practiceObj != null)
			feature_home_practice = feature_home_practiceObj.toString();

		Object feature_parent2teacher_chatObj = map.get("feature_parent2teacher_chat");
		if(feature_parent2teacher_chatObj != null)
			feature_parent2teacher_chat = feature_parent2teacher_chatObj.toString();

		Object feature_teacher2parent_chatObj = map.get("feature_teacher2parent_chat");
		if(feature_teacher2parent_chatObj != null)
			feature_teacher2parent_chat = feature_teacher2parent_chatObj.toString();

		Object feature_absent_reportObj = map.get("feature_absent_report");
		if(feature_absent_reportObj != null)
			feature_absent_report = feature_absent_reportObj.toString();

		Object feature_testObj = map.get("feature_test");
		if(feature_testObj != null)
			feature_test = feature_testObj.toString();

		Object feature_bookObj = map.get("feature_book");
		if(feature_bookObj != null)
			feature_book = feature_bookObj.toString();

		Object feature_timetableObj = map.get("feature_timetable");
		if(feature_timetableObj != null)
			feature_timetable = feature_timetableObj.toString();

		Object feature_present_reportObj = map.get("feature_present_report");
		if(feature_present_reportObj != null)
			feature_present_report = feature_present_reportObj.toString();

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

		Object feature_accountObj = map.get("feature_account");
		if(feature_accountObj != null)
			feature_account = feature_accountObj.toString();

		Object feature_wofObj = map.get("feature_wof");
		if(feature_wofObj != null)
			feature_wof = feature_wofObj.toString();

		Object feature_photoObj = map.get("feature_photo");
		if(feature_photoObj != null)
			feature_photo = feature_photoObj.toString();

		Object feature_videoObj = map.get("feature_video");
		if(feature_videoObj != null)
			feature_video = feature_videoObj.toString();

		Object feature_feesObj = map.get("feature_fees");
		if(feature_feesObj != null)
			feature_fees = feature_feesObj.toString();

		Object feature_work_sheetObj = map.get("feature_work_sheet");
		if(feature_work_sheetObj != null)
			feature_work_sheet = feature_work_sheetObj.toString();

		Object only_trackingObj = map.get("only_tracking");
		if(only_trackingObj != null)
			only_tracking = only_trackingObj.toString();

		Object logo_file_nameObj = map.get("logo_file_name");
		if(logo_file_nameObj != null)
			logo_file_name = logo_file_nameObj.toString();

		Object daily_activity_countObj = map.get("daily_activity_count");
		if(daily_activity_countObj != null)
			daily_activity_count = new Integer(daily_activity_countObj.toString());

		Object home_practice_countObj = map.get("home_practice_count");
		if(home_practice_countObj != null)
			home_practice_count = new Integer(home_practice_countObj.toString());

		Object homework_countObj = map.get("homework_count");
		if(homework_countObj != null)
			homework_count = new Integer(homework_countObj.toString());

		Object notice_countObj = map.get("notice_count");
		if(notice_countObj != null)
			notice_count = new Integer(notice_countObj.toString());

		Object transportObj = map.get("transport");
		if(transportObj != null)
			transport = transportObj.toString();

		Object transport_countObj = map.get("transport_count");
		if(transport_countObj != null)
			transport_count = new Integer(transport_countObj.toString());

		Object absent_report_countObj = map.get("absent_report_count");
		if(absent_report_countObj != null)
			absent_report_count = new Integer(absent_report_countObj.toString());

		Object present_report_countObj = map.get("present_report_count");
		if(present_report_countObj != null)
			present_report_count = new Integer(present_report_countObj.toString());

		Object message2school_countObj = map.get("message2school_count");
		if(message2school_countObj != null)
			message2school_count = new Integer(message2school_countObj.toString());

		Object photo_countObj = map.get("photo_count");
		if(photo_countObj != null)
			photo_count = new Integer(photo_countObj.toString());

		Object video_countObj = map.get("video_count");
		if(video_countObj != null)
			video_count = new Integer(video_countObj.toString());

		Object fees_countObj = map.get("fees_count");
		if(fees_countObj != null)
			fees_count = new Integer(fees_countObj.toString());

		Object proficiency_countObj = map.get("proficiency_count");
		if(proficiency_countObj != null)
			proficiency_count = new Integer(proficiency_countObj.toString());

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

	public String getSchool_brand_name() {
		return school_brand_name;
	}

	public String getSchool_brand_nameEx() {
		return school_brand_name != null ? school_brand_name : "";
	}

	public void setSchool_brand_name(String school_brand_name) {
		this.school_brand_name = school_brand_name;
	}

	public void unSetSchool_brand_name() {
		this.school_brand_name = null;
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

	public String getPickup_route_stopage_id() {
		return pickup_route_stopage_id;
	}

	public String getPickup_route_stopage_idEx() {
		return pickup_route_stopage_id != null ? pickup_route_stopage_id : "";
	}

	public void setPickup_route_stopage_id(String pickup_route_stopage_id) {
		this.pickup_route_stopage_id = pickup_route_stopage_id;
	}

	public void unSetPickup_route_stopage_id() {
		this.pickup_route_stopage_id = null;
	}

	public String getPickup_route_id() {
		return pickup_route_id;
	}

	public String getPickup_route_idEx() {
		return pickup_route_id != null ? pickup_route_id : "";
	}

	public void setPickup_route_id(String pickup_route_id) {
		this.pickup_route_id = pickup_route_id;
	}

	public void unSetPickup_route_id() {
		this.pickup_route_id = null;
	}

	public String getPickup_route_name() {
		return pickup_route_name;
	}

	public String getPickup_route_nameEx() {
		return pickup_route_name != null ? pickup_route_name : "";
	}

	public void setPickup_route_name(String pickup_route_name) {
		this.pickup_route_name = pickup_route_name;
	}

	public void unSetPickup_route_name() {
		this.pickup_route_name = null;
	}

	public String getPickup_stopage_id() {
		return pickup_stopage_id;
	}

	public String getPickup_stopage_idEx() {
		return pickup_stopage_id != null ? pickup_stopage_id : "";
	}

	public void setPickup_stopage_id(String pickup_stopage_id) {
		this.pickup_stopage_id = pickup_stopage_id;
	}

	public void unSetPickup_stopage_id() {
		this.pickup_stopage_id = null;
	}

	public String getPickup_stopage_name() {
		return pickup_stopage_name;
	}

	public String getPickup_stopage_nameEx() {
		return pickup_stopage_name != null ? pickup_stopage_name : "";
	}

	public void setPickup_stopage_name(String pickup_stopage_name) {
		this.pickup_stopage_name = pickup_stopage_name;
	}

	public void unSetPickup_stopage_name() {
		this.pickup_stopage_name = null;
	}

	public String getPickup_start_time() {
		return pickup_start_time;
	}

	public String getPickup_start_timeEx() {
		return pickup_start_time != null ? pickup_start_time : "";
	}

	public void setPickup_start_time(String pickup_start_time) {
		this.pickup_start_time = pickup_start_time;
	}

	public void unSetPickup_start_time() {
		this.pickup_start_time = null;
	}

	public String getPickup_end_time() {
		return pickup_end_time;
	}

	public String getPickup_end_timeEx() {
		return pickup_end_time != null ? pickup_end_time : "";
	}

	public void setPickup_end_time(String pickup_end_time) {
		this.pickup_end_time = pickup_end_time;
	}

	public void unSetPickup_end_time() {
		this.pickup_end_time = null;
	}

	public String getPickup_vehicle_name() {
		return pickup_vehicle_name;
	}

	public String getPickup_vehicle_nameEx() {
		return pickup_vehicle_name != null ? pickup_vehicle_name : "";
	}

	public void setPickup_vehicle_name(String pickup_vehicle_name) {
		this.pickup_vehicle_name = pickup_vehicle_name;
	}

	public void unSetPickup_vehicle_name() {
		this.pickup_vehicle_name = null;
	}

	public String getPickup_driver_id() {
		return pickup_driver_id;
	}

	public String getPickup_driver_idEx() {
		return pickup_driver_id != null ? pickup_driver_id : "";
	}

	public void setPickup_driver_id(String pickup_driver_id) {
		this.pickup_driver_id = pickup_driver_id;
	}

	public void unSetPickup_driver_id() {
		this.pickup_driver_id = null;
	}

	public String getPickup_driver_name() {
		return pickup_driver_name;
	}

	public String getPickup_driver_nameEx() {
		return pickup_driver_name != null ? pickup_driver_name : "";
	}

	public void setPickup_driver_name(String pickup_driver_name) {
		this.pickup_driver_name = pickup_driver_name;
	}

	public void unSetPickup_driver_name() {
		this.pickup_driver_name = null;
	}

	public String getPickup_driver_mobile_no() {
		return pickup_driver_mobile_no;
	}

	public String getPickup_driver_mobile_noEx() {
		return pickup_driver_mobile_no != null ? pickup_driver_mobile_no : "";
	}

	public void setPickup_driver_mobile_no(String pickup_driver_mobile_no) {
		this.pickup_driver_mobile_no = pickup_driver_mobile_no;
	}

	public void unSetPickup_driver_mobile_no() {
		this.pickup_driver_mobile_no = null;
	}

	public String getDropped_route_stopage_id() {
		return dropped_route_stopage_id;
	}

	public String getDropped_route_stopage_idEx() {
		return dropped_route_stopage_id != null ? dropped_route_stopage_id : "";
	}

	public void setDropped_route_stopage_id(String dropped_route_stopage_id) {
		this.dropped_route_stopage_id = dropped_route_stopage_id;
	}

	public void unSetDropped_route_stopage_id() {
		this.dropped_route_stopage_id = null;
	}

	public String getDropped_route_id() {
		return dropped_route_id;
	}

	public String getDropped_route_idEx() {
		return dropped_route_id != null ? dropped_route_id : "";
	}

	public void setDropped_route_id(String dropped_route_id) {
		this.dropped_route_id = dropped_route_id;
	}

	public void unSetDropped_route_id() {
		this.dropped_route_id = null;
	}

	public String getDropped_route_name() {
		return dropped_route_name;
	}

	public String getDropped_route_nameEx() {
		return dropped_route_name != null ? dropped_route_name : "";
	}

	public void setDropped_route_name(String dropped_route_name) {
		this.dropped_route_name = dropped_route_name;
	}

	public void unSetDropped_route_name() {
		this.dropped_route_name = null;
	}

	public String getDropped_stopage_id() {
		return dropped_stopage_id;
	}

	public String getDropped_stopage_idEx() {
		return dropped_stopage_id != null ? dropped_stopage_id : "";
	}

	public void setDropped_stopage_id(String dropped_stopage_id) {
		this.dropped_stopage_id = dropped_stopage_id;
	}

	public void unSetDropped_stopage_id() {
		this.dropped_stopage_id = null;
	}

	public String getDropped_stopage_name() {
		return dropped_stopage_name;
	}

	public String getDropped_stopage_nameEx() {
		return dropped_stopage_name != null ? dropped_stopage_name : "";
	}

	public void setDropped_stopage_name(String dropped_stopage_name) {
		this.dropped_stopage_name = dropped_stopage_name;
	}

	public void unSetDropped_stopage_name() {
		this.dropped_stopage_name = null;
	}

	public String getDropped_start_time() {
		return dropped_start_time;
	}

	public String getDropped_start_timeEx() {
		return dropped_start_time != null ? dropped_start_time : "";
	}

	public void setDropped_start_time(String dropped_start_time) {
		this.dropped_start_time = dropped_start_time;
	}

	public void unSetDropped_start_time() {
		this.dropped_start_time = null;
	}

	public String getDropped_end_time() {
		return dropped_end_time;
	}

	public String getDropped_end_timeEx() {
		return dropped_end_time != null ? dropped_end_time : "";
	}

	public void setDropped_end_time(String dropped_end_time) {
		this.dropped_end_time = dropped_end_time;
	}

	public void unSetDropped_end_time() {
		this.dropped_end_time = null;
	}

	public String getDropped_vehicle_name() {
		return dropped_vehicle_name;
	}

	public String getDropped_vehicle_nameEx() {
		return dropped_vehicle_name != null ? dropped_vehicle_name : "";
	}

	public void setDropped_vehicle_name(String dropped_vehicle_name) {
		this.dropped_vehicle_name = dropped_vehicle_name;
	}

	public void unSetDropped_vehicle_name() {
		this.dropped_vehicle_name = null;
	}

	public String getDropped_driver_id() {
		return dropped_driver_id;
	}

	public String getDropped_driver_idEx() {
		return dropped_driver_id != null ? dropped_driver_id : "";
	}

	public void setDropped_driver_id(String dropped_driver_id) {
		this.dropped_driver_id = dropped_driver_id;
	}

	public void unSetDropped_driver_id() {
		this.dropped_driver_id = null;
	}

	public String getDropped_driver_name() {
		return dropped_driver_name;
	}

	public String getDropped_driver_nameEx() {
		return dropped_driver_name != null ? dropped_driver_name : "";
	}

	public void setDropped_driver_name(String dropped_driver_name) {
		this.dropped_driver_name = dropped_driver_name;
	}

	public void unSetDropped_driver_name() {
		this.dropped_driver_name = null;
	}

	public String getDropped_driver_mobile_no() {
		return dropped_driver_mobile_no;
	}

	public String getDropped_driver_mobile_noEx() {
		return dropped_driver_mobile_no != null ? dropped_driver_mobile_no : "";
	}

	public void setDropped_driver_mobile_no(String dropped_driver_mobile_no) {
		this.dropped_driver_mobile_no = dropped_driver_mobile_no;
	}

	public void unSetDropped_driver_mobile_no() {
		this.dropped_driver_mobile_no = null;
	}

	public String getClass_name() {
		return class_name;
	}

	public String getClass_nameEx() {
		return class_name != null ? class_name : "";
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public void unSetClass_name() {
		this.class_name = null;
	}

	public String getSection_name() {
		return section_name;
	}

	public String getSection_nameEx() {
		return section_name != null ? section_name : "";
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public void unSetSection_name() {
		this.section_name = null;
	}

	public String getApp_branding() {
		return app_branding != null ? app_branding : "N";
	}

	public void setApp_branding(String app_branding) {
		this.app_branding = app_branding;
	}

	public void unSetApp_branding() {
		this.app_branding = "N";
	}

	public String getBus_started() {
		return bus_started;
	}

	public String getBus_startedEx() {
		return bus_started != null ? bus_started : "";
	}

	public void setBus_started(String bus_started) {
		this.bus_started = bus_started;
	}

	public void unSetBus_started() {
		this.bus_started = null;
	}

	public String getLast_stopage_name() {
		return last_stopage_name;
	}

	public String getLast_stopage_nameEx() {
		return last_stopage_name != null ? last_stopage_name : "";
	}

	public void setLast_stopage_name(String last_stopage_name) {
		this.last_stopage_name = last_stopage_name;
	}

	public void unSetLast_stopage_name() {
		this.last_stopage_name = null;
	}

	public Long getLast_stopage_time() {
		return last_stopage_time;
	}

	public long getLast_stopage_timeEx() {
		return last_stopage_time != null ? last_stopage_time : 0L;
	}

	public void setLast_stopage_time(long last_stopage_time) {
		this.last_stopage_time = last_stopage_time;
	}

	public void setLast_stopage_time(Long last_stopage_time) {
		this.last_stopage_time = last_stopage_time;
	}

	public void unSetLast_stopage_time() {
		this.last_stopage_time = null;
	}

	public Long getReaching_time() {
		return reaching_time;
	}

	public long getReaching_timeEx() {
		return reaching_time != null ? reaching_time : 0L;
	}

	public void setReaching_time(long reaching_time) {
		this.reaching_time = reaching_time;
	}

	public void setReaching_time(Long reaching_time) {
		this.reaching_time = reaching_time;
	}

	public void unSetReaching_time() {
		this.reaching_time = null;
	}

	public String getReached() {
		return reached;
	}

	public String getReachedEx() {
		return reached != null ? reached : "";
	}

	public void setReached(String reached) {
		this.reached = reached;
	}

	public void unSetReached() {
		this.reached = null;
	}

	public String getAlert_pickup_route_stopage_id() {
		return alert_pickup_route_stopage_id;
	}

	public String getAlert_pickup_route_stopage_idEx() {
		return alert_pickup_route_stopage_id != null ? alert_pickup_route_stopage_id : "";
	}

	public void setAlert_pickup_route_stopage_id(String alert_pickup_route_stopage_id) {
		this.alert_pickup_route_stopage_id = alert_pickup_route_stopage_id;
	}

	public void unSetAlert_pickup_route_stopage_id() {
		this.alert_pickup_route_stopage_id = null;
	}

	public String getAlert_dropped_route_stopage_id() {
		return alert_dropped_route_stopage_id;
	}

	public String getAlert_dropped_route_stopage_idEx() {
		return alert_dropped_route_stopage_id != null ? alert_dropped_route_stopage_id : "";
	}

	public void setAlert_dropped_route_stopage_id(String alert_dropped_route_stopage_id) {
		this.alert_dropped_route_stopage_id = alert_dropped_route_stopage_id;
	}

	public void unSetAlert_dropped_route_stopage_id() {
		this.alert_dropped_route_stopage_id = null;
	}

	public String getAlert_pickup_stopage_name() {
		return alert_pickup_stopage_name;
	}

	public String getAlert_pickup_stopage_nameEx() {
		return alert_pickup_stopage_name != null ? alert_pickup_stopage_name : "";
	}

	public void setAlert_pickup_stopage_name(String alert_pickup_stopage_name) {
		this.alert_pickup_stopage_name = alert_pickup_stopage_name;
	}

	public void unSetAlert_pickup_stopage_name() {
		this.alert_pickup_stopage_name = null;
	}

	public String getAlert_dropped_stopage_name() {
		return alert_dropped_stopage_name;
	}

	public String getAlert_dropped_stopage_nameEx() {
		return alert_dropped_stopage_name != null ? alert_dropped_stopage_name : "";
	}

	public void setAlert_dropped_stopage_name(String alert_dropped_stopage_name) {
		this.alert_dropped_stopage_name = alert_dropped_stopage_name;
	}

	public void unSetAlert_dropped_stopage_name() {
		this.alert_dropped_stopage_name = null;
	}

	public String getStopage_alert_sms() {
		return stopage_alert_sms != null ? stopage_alert_sms : "N";
	}

	public void setStopage_alert_sms(String stopage_alert_sms) {
		this.stopage_alert_sms = stopage_alert_sms;
	}

	public void unSetStopage_alert_sms() {
		this.stopage_alert_sms = "N";
	}

	public String getStopage_alert_mobile_app() {
		return stopage_alert_mobile_app != null ? stopage_alert_mobile_app : "Y";
	}

	public void setStopage_alert_mobile_app(String stopage_alert_mobile_app) {
		this.stopage_alert_mobile_app = stopage_alert_mobile_app;
	}

	public void unSetStopage_alert_mobile_app() {
		this.stopage_alert_mobile_app = "Y";
	}

	public String getStopage_alert_email() {
		return stopage_alert_email != null ? stopage_alert_email : "N";
	}

	public void setStopage_alert_email(String stopage_alert_email) {
		this.stopage_alert_email = stopage_alert_email;
	}

	public void unSetStopage_alert_email() {
		this.stopage_alert_email = "N";
	}

	public String getFeature_collabrotive_study() {
		return feature_collabrotive_study != null ? feature_collabrotive_study : "N";
	}

	public void setFeature_collabrotive_study(String feature_collabrotive_study) {
		this.feature_collabrotive_study = feature_collabrotive_study;
	}

	public void unSetFeature_collabrotive_study() {
		this.feature_collabrotive_study = "N";
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

	public String getFeature_notice() {
		return feature_notice != null ? feature_notice : "N";
	}

	public void setFeature_notice(String feature_notice) {
		this.feature_notice = feature_notice;
	}

	public void unSetFeature_notice() {
		this.feature_notice = "N";
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

	public String getFeature_parent2teacher_chat() {
		return feature_parent2teacher_chat != null ? feature_parent2teacher_chat : "N";
	}

	public void setFeature_parent2teacher_chat(String feature_parent2teacher_chat) {
		this.feature_parent2teacher_chat = feature_parent2teacher_chat;
	}

	public void unSetFeature_parent2teacher_chat() {
		this.feature_parent2teacher_chat = "N";
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

	public String getFeature_absent_report() {
		return feature_absent_report != null ? feature_absent_report : "N";
	}

	public void setFeature_absent_report(String feature_absent_report) {
		this.feature_absent_report = feature_absent_report;
	}

	public void unSetFeature_absent_report() {
		this.feature_absent_report = "N";
	}

	public String getFeature_test() {
		return feature_test != null ? feature_test : "N";
	}

	public void setFeature_test(String feature_test) {
		this.feature_test = feature_test;
	}

	public void unSetFeature_test() {
		this.feature_test = "N";
	}

	public String getFeature_book() {
		return feature_book != null ? feature_book : "N";
	}

	public void setFeature_book(String feature_book) {
		this.feature_book = feature_book;
	}

	public void unSetFeature_book() {
		this.feature_book = "N";
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

	public String getFeature_present_report() {
		return feature_present_report != null ? feature_present_report : "N";
	}

	public void setFeature_present_report(String feature_present_report) {
		this.feature_present_report = feature_present_report;
	}

	public void unSetFeature_present_report() {
		this.feature_present_report = "N";
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

	public String getFeature_account() {
		return feature_account != null ? feature_account : "N";
	}

	public void setFeature_account(String feature_account) {
		this.feature_account = feature_account;
	}

	public void unSetFeature_account() {
		this.feature_account = "N";
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

	public String getOnly_tracking() {
		return only_tracking != null ? only_tracking : "N";
	}

	public void setOnly_tracking(String only_tracking) {
		this.only_tracking = only_tracking;
	}

	public void unSetOnly_tracking() {
		this.only_tracking = "N";
	}

	public String getLogo_file_name() {
		return logo_file_name;
	}

	public String getLogo_file_nameEx() {
		return logo_file_name != null ? logo_file_name : "";
	}

	public void setLogo_file_name(String logo_file_name) {
		this.logo_file_name = logo_file_name;
	}

	public void unSetLogo_file_name() {
		this.logo_file_name = null;
	}

	public Integer getDaily_activity_count() {
		return daily_activity_count != null ? daily_activity_count : 0;
	}

	public void setDaily_activity_count(int daily_activity_count) {
		this.daily_activity_count = daily_activity_count;
	}

	public void setDaily_activity_count(Integer daily_activity_count) {
		this.daily_activity_count = daily_activity_count;
	}

	public void unSetDaily_activity_count() {
		this.daily_activity_count = 0;
	}

	public Integer getHome_practice_count() {
		return home_practice_count != null ? home_practice_count : 0;
	}

	public void setHome_practice_count(int home_practice_count) {
		this.home_practice_count = home_practice_count;
	}

	public void setHome_practice_count(Integer home_practice_count) {
		this.home_practice_count = home_practice_count;
	}

	public void unSetHome_practice_count() {
		this.home_practice_count = 0;
	}

	public Integer getHomework_count() {
		return homework_count != null ? homework_count : 0;
	}

	public void setHomework_count(int homework_count) {
		this.homework_count = homework_count;
	}

	public void setHomework_count(Integer homework_count) {
		this.homework_count = homework_count;
	}

	public void unSetHomework_count() {
		this.homework_count = 0;
	}

	public Integer getNotice_count() {
		return notice_count != null ? notice_count : 0;
	}

	public void setNotice_count(int notice_count) {
		this.notice_count = notice_count;
	}

	public void setNotice_count(Integer notice_count) {
		this.notice_count = notice_count;
	}

	public void unSetNotice_count() {
		this.notice_count = 0;
	}

	public String getTransport() {
		return transport != null ? transport : "N";
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public void unSetTransport() {
		this.transport = "N";
	}

	public Integer getTransport_count() {
		return transport_count != null ? transport_count : 0;
	}

	public void setTransport_count(int transport_count) {
		this.transport_count = transport_count;
	}

	public void setTransport_count(Integer transport_count) {
		this.transport_count = transport_count;
	}

	public void unSetTransport_count() {
		this.transport_count = 0;
	}

	public Integer getAbsent_report_count() {
		return absent_report_count != null ? absent_report_count : 0;
	}

	public void setAbsent_report_count(int absent_report_count) {
		this.absent_report_count = absent_report_count;
	}

	public void setAbsent_report_count(Integer absent_report_count) {
		this.absent_report_count = absent_report_count;
	}

	public void unSetAbsent_report_count() {
		this.absent_report_count = 0;
	}

	public Integer getPresent_report_count() {
		return present_report_count != null ? present_report_count : 0;
	}

	public void setPresent_report_count(int present_report_count) {
		this.present_report_count = present_report_count;
	}

	public void setPresent_report_count(Integer present_report_count) {
		this.present_report_count = present_report_count;
	}

	public void unSetPresent_report_count() {
		this.present_report_count = 0;
	}

	public Integer getMessage2school_count() {
		return message2school_count != null ? message2school_count : 0;
	}

	public void setMessage2school_count(int message2school_count) {
		this.message2school_count = message2school_count;
	}

	public void setMessage2school_count(Integer message2school_count) {
		this.message2school_count = message2school_count;
	}

	public void unSetMessage2school_count() {
		this.message2school_count = 0;
	}

	public Integer getPhoto_count() {
		return photo_count != null ? photo_count : 0;
	}

	public void setPhoto_count(int photo_count) {
		this.photo_count = photo_count;
	}

	public void setPhoto_count(Integer photo_count) {
		this.photo_count = photo_count;
	}

	public void unSetPhoto_count() {
		this.photo_count = 0;
	}

	public Integer getVideo_count() {
		return video_count != null ? video_count : 0;
	}

	public void setVideo_count(int video_count) {
		this.video_count = video_count;
	}

	public void setVideo_count(Integer video_count) {
		this.video_count = video_count;
	}

	public void unSetVideo_count() {
		this.video_count = 0;
	}

	public Integer getFees_count() {
		return fees_count != null ? fees_count : 0;
	}

	public void setFees_count(int fees_count) {
		this.fees_count = fees_count;
	}

	public void setFees_count(Integer fees_count) {
		this.fees_count = fees_count;
	}

	public void unSetFees_count() {
		this.fees_count = 0;
	}

	public Integer getProficiency_count() {
		return proficiency_count != null ? proficiency_count : 0;
	}

	public void setProficiency_count(int proficiency_count) {
		this.proficiency_count = proficiency_count;
	}

	public void setProficiency_count(Integer proficiency_count) {
		this.proficiency_count = proficiency_count;
	}

	public void unSetProficiency_count() {
		this.proficiency_count = 0;
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