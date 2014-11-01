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
	private String brand_name = null;
	private String short_name = null;
	private String address1 = null;
	private String address2 = null;
	private String address3 = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String pin = null;
	private String group_id = null;
	private String feature_parent2parent_chat = null;
	private String feature_homework = null;
	private String feature_daily_activity = null;
	private String feature_home_practice = null;
	private String feature_notice = null;
	private String feature_teacher2parent_chat = null;
	private String feature_admin2parent_chat = null;
	private String feature_absent_report = null;
	private String feature_pick_drop = null;
	private String feature_message2parent = null;
	private String feature_message2school = null;
	private String feature_proficiency = null;
	private String feature_wof = null;
	private String feature_photo = null;
	private String feature_video = null;
	private String feature_fees = null;
	private String feature_work_sheet = null;
	private String logo_file_name = null;
	private String admission_no_prefix = null;
	private Integer admission_last_no = null;
	private Integer admission_number_of_digit = null;
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
	public static String FIELD_NAME = "name";
	public static String FIELD_BRAND_NAME = "brand_name";
	public static String FIELD_SHORT_NAME = "short_name";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_ADDRESS3 = "address3";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_PIN = "pin";
	public static String FIELD_GROUP_ID = "group_id";
	public static String FIELD_FEATURE_PARENT2PARENT_CHAT = "feature_parent2parent_chat";
	public static String FIELD_FEATURE_HOMEWORK = "feature_homework";
	public static String FIELD_FEATURE_DAILY_ACTIVITY = "feature_daily_activity";
	public static String FIELD_FEATURE_HOME_PRACTICE = "feature_home_practice";
	public static String FIELD_FEATURE_NOTICE = "feature_notice";
	public static String FIELD_FEATURE_TEACHER2PARENT_CHAT = "feature_teacher2parent_chat";
	public static String FIELD_FEATURE_ADMIN2PARENT_CHAT = "feature_admin2parent_chat";
	public static String FIELD_FEATURE_ABSENT_REPORT = "feature_absent_report";
	public static String FIELD_FEATURE_PICK_DROP = "feature_pick_drop";
	public static String FIELD_FEATURE_MESSAGE2PARENT = "feature_message2parent";
	public static String FIELD_FEATURE_MESSAGE2SCHOOL = "feature_message2school";
	public static String FIELD_FEATURE_PROFICIENCY = "feature_proficiency";
	public static String FIELD_FEATURE_WOF = "feature_wof";
	public static String FIELD_FEATURE_PHOTO = "feature_photo";
	public static String FIELD_FEATURE_VIDEO = "feature_video";
	public static String FIELD_FEATURE_FEES = "feature_fees";
	public static String FIELD_FEATURE_WORK_SHEET = "feature_work_sheet";
	public static String FIELD_LOGO_FILE_NAME = "logo_file_name";
	public static String FIELD_ADMISSION_NO_PREFIX = "admission_no_prefix";
	public static String FIELD_ADMISSION_LAST_NO = "admission_last_no";
	public static String FIELD_ADMISSION_NUMBER_OF_DIGIT = "admission_number_of_digit";
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

		Field brand_nameField = new Field("brand_name", "String");
		brand_nameField.setLength(128);
		metaData.addField(brand_nameField);

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

		Field pinField = new Field("pin", "String");
		pinField.setLength(16);
		metaData.addField(pinField);

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

		Field feature_feesField = new Field("feature_fees", "String");
		feature_feesField.setDefaultValue("N");
		feature_feesField.setLength(1);
		metaData.addField(feature_feesField);

		Field feature_work_sheetField = new Field("feature_work_sheet", "String");
		feature_work_sheetField.setDefaultValue("N");
		feature_work_sheetField.setLength(1);
		metaData.addField(feature_work_sheetField);

		Field logo_file_nameField = new Field("logo_file_name", "String");
		logo_file_nameField.setLength(128);
		metaData.addField(logo_file_nameField);

		Field admission_no_prefixField = new Field("admission_no_prefix", "String");
		admission_no_prefixField.setLength(20);
		metaData.addField(admission_no_prefixField);

		Field admission_last_noField = new Field("admission_last_no", "int");
		metaData.addField(admission_last_noField);

		Field admission_number_of_digitField = new Field("admission_number_of_digit", "int");
		metaData.addField(admission_number_of_digitField);

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


		metaData.setTableName("school");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseschool() {}

	public Baseschool(Baseschool obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.brand_name = obj.brand_name;
		this.short_name = obj.short_name;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.address3 = obj.address3;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.pin = obj.pin;
		this.group_id = obj.group_id;
		this.feature_parent2parent_chat = obj.feature_parent2parent_chat;
		this.feature_homework = obj.feature_homework;
		this.feature_daily_activity = obj.feature_daily_activity;
		this.feature_home_practice = obj.feature_home_practice;
		this.feature_notice = obj.feature_notice;
		this.feature_teacher2parent_chat = obj.feature_teacher2parent_chat;
		this.feature_admin2parent_chat = obj.feature_admin2parent_chat;
		this.feature_absent_report = obj.feature_absent_report;
		this.feature_pick_drop = obj.feature_pick_drop;
		this.feature_message2parent = obj.feature_message2parent;
		this.feature_message2school = obj.feature_message2school;
		this.feature_proficiency = obj.feature_proficiency;
		this.feature_wof = obj.feature_wof;
		this.feature_photo = obj.feature_photo;
		this.feature_video = obj.feature_video;
		this.feature_fees = obj.feature_fees;
		this.feature_work_sheet = obj.feature_work_sheet;
		this.logo_file_name = obj.logo_file_name;
		this.admission_no_prefix = obj.admission_no_prefix;
		this.admission_last_no = obj.admission_last_no;
		this.admission_number_of_digit = obj.admission_number_of_digit;
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
		if(feature_fees == null)
			feature_fees = "N";
		if(feature_work_sheet == null)
			feature_work_sheet = "N";
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
		if(name != null)
			map.put("name", name);
		if(brand_name != null)
			map.put("brand_name", brand_name);
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
		if(pin != null)
			map.put("pin", pin);
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
		if(feature_fees != null)
			map.put("feature_fees", feature_fees);
		if(feature_work_sheet != null)
			map.put("feature_work_sheet", feature_work_sheet);
		if(logo_file_name != null)
			map.put("logo_file_name", logo_file_name);
		if(admission_no_prefix != null)
			map.put("admission_no_prefix", admission_no_prefix);
		if(admission_last_no != null)
			map.put("admission_last_no", admission_last_no);
		if(admission_number_of_digit != null)
			map.put("admission_number_of_digit", admission_number_of_digit);
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
		if(name != null)
			map.put("name", name);
		if(brand_name != null)
			map.put("brand_name", brand_name);
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
		if(pin != null)
			map.put("pin", pin);
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
		if(feature_fees != null)
			map.put("feature_fees", feature_fees);
		if(feature_work_sheet != null)
			map.put("feature_work_sheet", feature_work_sheet);
		if(logo_file_name != null)
			map.put("logo_file_name", logo_file_name);
		if(admission_no_prefix != null)
			map.put("admission_no_prefix", admission_no_prefix);
		if(admission_last_no != null)
			map.put("admission_last_no", admission_last_no);
		if(admission_number_of_digit != null)
			map.put("admission_number_of_digit", admission_number_of_digit);
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
		name = (String) map.get("name");
		brand_name = (String) map.get("brand_name");
		short_name = (String) map.get("short_name");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		address3 = (String) map.get("address3");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		pin = (String) map.get("pin");
		group_id = (String) map.get("group_id");
		feature_parent2parent_chat = (String) map.get("feature_parent2parent_chat");
		feature_homework = (String) map.get("feature_homework");
		feature_daily_activity = (String) map.get("feature_daily_activity");
		feature_home_practice = (String) map.get("feature_home_practice");
		feature_notice = (String) map.get("feature_notice");
		feature_teacher2parent_chat = (String) map.get("feature_teacher2parent_chat");
		feature_admin2parent_chat = (String) map.get("feature_admin2parent_chat");
		feature_absent_report = (String) map.get("feature_absent_report");
		feature_pick_drop = (String) map.get("feature_pick_drop");
		feature_message2parent = (String) map.get("feature_message2parent");
		feature_message2school = (String) map.get("feature_message2school");
		feature_proficiency = (String) map.get("feature_proficiency");
		feature_wof = (String) map.get("feature_wof");
		feature_photo = (String) map.get("feature_photo");
		feature_video = (String) map.get("feature_video");
		feature_fees = (String) map.get("feature_fees");
		feature_work_sheet = (String) map.get("feature_work_sheet");
		logo_file_name = (String) map.get("logo_file_name");
		admission_no_prefix = (String) map.get("admission_no_prefix");
		admission_last_no = (Integer) map.get("admission_last_no");
		admission_number_of_digit = (Integer) map.get("admission_number_of_digit");
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

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object brand_nameObj = map.get("brand_name");
		if(brand_nameObj != null)
			brand_name = brand_nameObj.toString();

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

		Object pinObj = map.get("pin");
		if(pinObj != null)
			pin = pinObj.toString();

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

		Object feature_feesObj = map.get("feature_fees");
		if(feature_feesObj != null)
			feature_fees = feature_feesObj.toString();

		Object feature_work_sheetObj = map.get("feature_work_sheet");
		if(feature_work_sheetObj != null)
			feature_work_sheet = feature_work_sheetObj.toString();

		Object logo_file_nameObj = map.get("logo_file_name");
		if(logo_file_nameObj != null)
			logo_file_name = logo_file_nameObj.toString();

		Object admission_no_prefixObj = map.get("admission_no_prefix");
		if(admission_no_prefixObj != null)
			admission_no_prefix = admission_no_prefixObj.toString();

		Object admission_last_noObj = map.get("admission_last_no");
		if(admission_last_noObj != null)
			admission_last_no = new Integer(admission_last_noObj.toString());

		Object admission_number_of_digitObj = map.get("admission_number_of_digit");
		if(admission_number_of_digitObj != null)
			admission_number_of_digit = new Integer(admission_number_of_digitObj.toString());

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

	public String getBrand_name() {
		return brand_name;
	}

	public String getBrand_nameEx() {
		return brand_name != null ? brand_name : "";
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public void unSetBrand_name() {
		this.brand_name = null;
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

	public String getPin() {
		return pin;
	}

	public String getPinEx() {
		return pin != null ? pin : "";
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void unSetPin() {
		this.pin = null;
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

	public String getAdmission_no_prefix() {
		return admission_no_prefix;
	}

	public String getAdmission_no_prefixEx() {
		return admission_no_prefix != null ? admission_no_prefix : "";
	}

	public void setAdmission_no_prefix(String admission_no_prefix) {
		this.admission_no_prefix = admission_no_prefix;
	}

	public void unSetAdmission_no_prefix() {
		this.admission_no_prefix = null;
	}

	public Integer getAdmission_last_no() {
		return admission_last_no;
	}

	public int getAdmission_last_noEx() {
		return admission_last_no != null ? admission_last_no : 0;
	}

	public void setAdmission_last_no(int admission_last_no) {
		this.admission_last_no = admission_last_no;
	}

	public void setAdmission_last_no(Integer admission_last_no) {
		this.admission_last_no = admission_last_no;
	}

	public void unSetAdmission_last_no() {
		this.admission_last_no = null;
	}

	public Integer getAdmission_number_of_digit() {
		return admission_number_of_digit;
	}

	public int getAdmission_number_of_digitEx() {
		return admission_number_of_digit != null ? admission_number_of_digit : 0;
	}

	public void setAdmission_number_of_digit(int admission_number_of_digit) {
		this.admission_number_of_digit = admission_number_of_digit;
	}

	public void setAdmission_number_of_digit(Integer admission_number_of_digit) {
		this.admission_number_of_digit = admission_number_of_digit;
	}

	public void unSetAdmission_number_of_digit() {
		this.admission_number_of_digit = null;
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