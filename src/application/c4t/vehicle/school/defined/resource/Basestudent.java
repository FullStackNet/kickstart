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
public abstract class Basestudent extends BaseResource {
	private String id = null;
	private String admission_no = null;
	private String admission_date_str = null;
	private String school_id = null;
	private String batch_id = null;
	private String fees_master_id = null;
	private String batch_name = null;
	private String house_id = null;
	private String name = null;
	private String short_name = null;
	private String blood_group = null;
	private String address1 = null;
	private String address2 = null;
	private String address3 = null;
	private String city = null;
	private String state = null;
	private String syllabus_type = null;
	private String country = null;
	private String course_id = null;
	private String pickup_route_stopage_id = null;
	private String pickup_route_id = null;
	private String pickup_stopage_id = null;
	private String dropped_route_stopage_id = null;
	private String dropped_route_id = null;
	private String dropped_stopage_id = null;
	private String alert_pickup_route_stopage_id = null;
	private String alert_dropped_route_stopage_id = null;
	private String father_name = null;
	private String father_email_id = null;
	private String father_mobile_no = null;
	private String father_home_phone_no = null;
	private String father_office_phone_no = null;
	private String father_dob = null;
	private String father_occupation = null;
	private String father_role = null;
	private String father_company_name = null;
	private String father_phone_type = null;
	private String mother_name = null;
	private String mother_dob = null;
	private String mother_mobile_no = null;
	private String mother_home_phone_no = null;
	private String mother_office_phone_no = null;
	private String mother_occupation = null;
	private String mother_role = null;
	private String mother_company_name = null;
	private String mother_email_id = null;
	private String mother_phone_type = null;
	private String other_name = null;
	private String other_mobile_no = null;
	private String other_email_id = null;
	private String other_phone_type = null;
	private String class_name = null;
	private String section_name = null;
	private String dob = null;
	private String transport = null;
	private String class_section_name = null;
	private String customer_id = null;
	private String user_id = null;
	private String remark = null;
	private String stopage_alert_sms = null;
	private String stopage_alert_mobile_app = null;
	private String stopage_alert_email = null;
	private String overspeed_alert_sms = null;
	private String overspeed_alert_mobile_app = null;
	private String overspeed_alert_email = null;
	private String neet_no = null;
	private String card_no = null;
	private String card_swipe_pickup_pick = null;
	private Long card_swipe_pickup_pick_time = null;
	private String card_swipe_pickup_drop = null;
	private Long card_swipe_pickup_drop_time = null;
	private String card_swipe_drop_pick = null;
	private Long card_swipe_drop_pick_time = null;
	private String card_swipe_drop_drop = null;
	private Long card_swipe_drop_drop_time = null;
	private Integer total_absent = null;
	private Integer total_present = null;
	private Integer daily_activity_count = null;
	private Integer home_practice_count = null;
	private Integer homework_count = null;
	private Integer notice_count = null;
	private Integer transport_count = null;
	private Integer absent_report_count = null;
	private Integer present_report_count = null;
	private Integer message2school_count = null;
	private String primary_contact = null;
	private String gender = null;
	private String student_account = null;
	private String left = null;
	private String left_date_str = null;
	private String left_reason = null;
	private String student_email_id = null;
	private String student_mobile_no = null;
	private String class_teacher_id = null;
	private String class_teacher_name = null;
	private String second_language = null;
	private String third_language = null;
	private String card_not_working = null;
	private String card_not_working_reason = null;
	private String card_not_working_date_str = null;
	private String feature_bus_pickup_entry_sms = null;
	private String feature_bus_pickup_exit_sms = null;
	private String feature_bus_drop_entry_sms = null;
	private String feature_bus_drop_exit_sms = null;
	private String feature_school_entry_sms = null;
	private String feature_school_exit_sms = null;
	private String application_processed = null;
	private String notes_issued = null;
	private String notes_issued_date_str = null;
	private Long notes_issued_date = null;
	private String notes_issued_remark = null;
	private Double total_fees = null;
	private Double total_additional_charges = null;
	private Double total_fees_paid = null;
	private Double discount = null;
	private Double opening_balance = null;
	private Double total_debit = null;
	private Double total_credit = null;
	private Double closing_balance = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ADMISSION_NO = "admission_no";
	public static String FIELD_ADMISSION_DATE_STR = "admission_date_str";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_BATCH_ID = "batch_id";
	public static String FIELD_FEES_MASTER_ID = "fees_master_id";
	public static String FIELD_BATCH_NAME = "batch_name";
	public static String FIELD_HOUSE_ID = "house_id";
	public static String FIELD_NAME = "name";
	public static String FIELD_SHORT_NAME = "short_name";
	public static String FIELD_BLOOD_GROUP = "blood_group";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_ADDRESS3 = "address3";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_SYLLABUS_TYPE = "syllabus_type";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_COURSE_ID = "course_id";
	public static String FIELD_PICKUP_ROUTE_STOPAGE_ID = "pickup_route_stopage_id";
	public static String FIELD_PICKUP_ROUTE_ID = "pickup_route_id";
	public static String FIELD_PICKUP_STOPAGE_ID = "pickup_stopage_id";
	public static String FIELD_DROPPED_ROUTE_STOPAGE_ID = "dropped_route_stopage_id";
	public static String FIELD_DROPPED_ROUTE_ID = "dropped_route_id";
	public static String FIELD_DROPPED_STOPAGE_ID = "dropped_stopage_id";
	public static String FIELD_ALERT_PICKUP_ROUTE_STOPAGE_ID = "alert_pickup_route_stopage_id";
	public static String FIELD_ALERT_DROPPED_ROUTE_STOPAGE_ID = "alert_dropped_route_stopage_id";
	public static String FIELD_FATHER_NAME = "father_name";
	public static String FIELD_FATHER_EMAIL_ID = "father_email_id";
	public static String FIELD_FATHER_MOBILE_NO = "father_mobile_no";
	public static String FIELD_FATHER_HOME_PHONE_NO = "father_home_phone_no";
	public static String FIELD_FATHER_OFFICE_PHONE_NO = "father_office_phone_no";
	public static String FIELD_FATHER_DOB = "father_dob";
	public static String FIELD_FATHER_OCCUPATION = "father_occupation";
	public static String FIELD_FATHER_ROLE = "father_role";
	public static String FIELD_FATHER_COMPANY_NAME = "father_company_name";
	public static String FIELD_FATHER_PHONE_TYPE = "father_phone_type";
	public static String FIELD_MOTHER_NAME = "mother_name";
	public static String FIELD_MOTHER_DOB = "mother_dob";
	public static String FIELD_MOTHER_MOBILE_NO = "mother_mobile_no";
	public static String FIELD_MOTHER_HOME_PHONE_NO = "mother_home_phone_no";
	public static String FIELD_MOTHER_OFFICE_PHONE_NO = "mother_office_phone_no";
	public static String FIELD_MOTHER_OCCUPATION = "mother_occupation";
	public static String FIELD_MOTHER_ROLE = "mother_role";
	public static String FIELD_MOTHER_COMPANY_NAME = "mother_company_name";
	public static String FIELD_MOTHER_EMAIL_ID = "mother_email_id";
	public static String FIELD_MOTHER_PHONE_TYPE = "mother_phone_type";
	public static String FIELD_OTHER_NAME = "other_name";
	public static String FIELD_OTHER_MOBILE_NO = "other_mobile_no";
	public static String FIELD_OTHER_EMAIL_ID = "other_email_id";
	public static String FIELD_OTHER_PHONE_TYPE = "other_phone_type";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_DOB = "dob";
	public static String FIELD_TRANSPORT = "transport";
	public static String FIELD_CLASS_SECTION_NAME = "class_section_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_STOPAGE_ALERT_SMS = "stopage_alert_sms";
	public static String FIELD_STOPAGE_ALERT_MOBILE_APP = "stopage_alert_mobile_app";
	public static String FIELD_STOPAGE_ALERT_EMAIL = "stopage_alert_email";
	public static String FIELD_OVERSPEED_ALERT_SMS = "overspeed_alert_sms";
	public static String FIELD_OVERSPEED_ALERT_MOBILE_APP = "overspeed_alert_mobile_app";
	public static String FIELD_OVERSPEED_ALERT_EMAIL = "overspeed_alert_email";
	public static String FIELD_NEET_NO = "neet_no";
	public static String FIELD_CARD_NO = "card_no";
	public static String FIELD_CARD_SWIPE_PICKUP_PICK = "card_swipe_pickup_pick";
	public static String FIELD_CARD_SWIPE_PICKUP_PICK_TIME = "card_swipe_pickup_pick_time";
	public static String FIELD_CARD_SWIPE_PICKUP_DROP = "card_swipe_pickup_drop";
	public static String FIELD_CARD_SWIPE_PICKUP_DROP_TIME = "card_swipe_pickup_drop_time";
	public static String FIELD_CARD_SWIPE_DROP_PICK = "card_swipe_drop_pick";
	public static String FIELD_CARD_SWIPE_DROP_PICK_TIME = "card_swipe_drop_pick_time";
	public static String FIELD_CARD_SWIPE_DROP_DROP = "card_swipe_drop_drop";
	public static String FIELD_CARD_SWIPE_DROP_DROP_TIME = "card_swipe_drop_drop_time";
	public static String FIELD_TOTAL_ABSENT = "total_absent";
	public static String FIELD_TOTAL_PRESENT = "total_present";
	public static String FIELD_DAILY_ACTIVITY_COUNT = "daily_activity_count";
	public static String FIELD_HOME_PRACTICE_COUNT = "home_practice_count";
	public static String FIELD_HOMEWORK_COUNT = "homework_count";
	public static String FIELD_NOTICE_COUNT = "notice_count";
	public static String FIELD_TRANSPORT_COUNT = "transport_count";
	public static String FIELD_ABSENT_REPORT_COUNT = "absent_report_count";
	public static String FIELD_PRESENT_REPORT_COUNT = "present_report_count";
	public static String FIELD_MESSAGE2SCHOOL_COUNT = "message2school_count";
	public static String FIELD_PRIMARY_CONTACT = "primary_contact";
	public static String FIELD_GENDER = "gender";
	public static String FIELD_STUDENT_ACCOUNT = "student_account";
	public static String FIELD_LEFT = "left";
	public static String FIELD_LEFT_DATE_STR = "left_date_str";
	public static String FIELD_LEFT_REASON = "left_reason";
	public static String FIELD_STUDENT_EMAIL_ID = "student_email_id";
	public static String FIELD_STUDENT_MOBILE_NO = "student_mobile_no";
	public static String FIELD_CLASS_TEACHER_ID = "class_teacher_id";
	public static String FIELD_CLASS_TEACHER_NAME = "class_teacher_name";
	public static String FIELD_SECOND_LANGUAGE = "second_language";
	public static String FIELD_THIRD_LANGUAGE = "third_language";
	public static String FIELD_CARD_NOT_WORKING = "card_not_working";
	public static String FIELD_CARD_NOT_WORKING_REASON = "card_not_working_reason";
	public static String FIELD_CARD_NOT_WORKING_DATE_STR = "card_not_working_date_str";
	public static String FIELD_FEATURE_BUS_PICKUP_ENTRY_SMS = "feature_bus_pickup_entry_sms";
	public static String FIELD_FEATURE_BUS_PICKUP_EXIT_SMS = "feature_bus_pickup_exit_sms";
	public static String FIELD_FEATURE_BUS_DROP_ENTRY_SMS = "feature_bus_drop_entry_sms";
	public static String FIELD_FEATURE_BUS_DROP_EXIT_SMS = "feature_bus_drop_exit_sms";
	public static String FIELD_FEATURE_SCHOOL_ENTRY_SMS = "feature_school_entry_sms";
	public static String FIELD_FEATURE_SCHOOL_EXIT_SMS = "feature_school_exit_sms";
	public static String FIELD_APPLICATION_PROCESSED = "application_processed";
	public static String FIELD_NOTES_ISSUED = "notes_issued";
	public static String FIELD_NOTES_ISSUED_DATE_STR = "notes_issued_date_str";
	public static String FIELD_NOTES_ISSUED_DATE = "notes_issued_date";
	public static String FIELD_NOTES_ISSUED_REMARK = "notes_issued_remark";
	public static String FIELD_TOTAL_FEES = "total_fees";
	public static String FIELD_TOTAL_ADDITIONAL_CHARGES = "total_additional_charges";
	public static String FIELD_TOTAL_FEES_PAID = "total_fees_paid";
	public static String FIELD_DISCOUNT = "discount";
	public static String FIELD_OPENING_BALANCE = "opening_balance";
	public static String FIELD_TOTAL_DEBIT = "total_debit";
	public static String FIELD_TOTAL_CREDIT = "total_credit";
	public static String FIELD_CLOSING_BALANCE = "closing_balance";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("student");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field admission_noField = new Field("admission_no", "String");
		admission_noField.setIndexed(true);
		admission_noField.setLength(128);
		metaData.addField(admission_noField);

		Field admission_date_strField = new Field("admission_date_str", "String");
		admission_date_strField.setLength(32);
		metaData.addField(admission_date_strField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field batch_idField = new Field("batch_id", "String");
		batch_idField.setIndexed(true);
		batch_idField.setLength(128);
		metaData.addField(batch_idField);

		Field fees_master_idField = new Field("fees_master_id", "String");
		fees_master_idField.setIndexed(true);
		fees_master_idField.setLength(128);
		metaData.addField(fees_master_idField);

		Field batch_nameField = new Field("batch_name", "String");
		batch_nameField.setIndexed(true);
		batch_nameField.setLength(128);
		metaData.addField(batch_nameField);

		Field house_idField = new Field("house_id", "String");
		house_idField.setIndexed(true);
		house_idField.setLength(128);
		metaData.addField(house_idField);

		Field nameField = new Field("name", "String");
		nameField.setIndexed(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field short_nameField = new Field("short_name", "String");
		short_nameField.setIndexed(true);
		short_nameField.setLength(128);
		metaData.addField(short_nameField);

		Field blood_groupField = new Field("blood_group", "String");
		blood_groupField.setLength(10);
		metaData.addField(blood_groupField);

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

		Field syllabus_typeField = new Field("syllabus_type", "String");
		syllabus_typeField.setLength(128);
		metaData.addField(syllabus_typeField);

		Field countryField = new Field("country", "String");
		countryField.setLength(128);
		metaData.addField(countryField);

		Field course_idField = new Field("course_id", "String");
		course_idField.setLength(128);
		metaData.addField(course_idField);

		Field pickup_route_stopage_idField = new Field("pickup_route_stopage_id", "String");
		pickup_route_stopage_idField.setIndexed(true);
		pickup_route_stopage_idField.setLength(128);
		metaData.addField(pickup_route_stopage_idField);

		Field pickup_route_idField = new Field("pickup_route_id", "String");
		pickup_route_idField.setIndexed(true);
		pickup_route_idField.setLength(128);
		metaData.addField(pickup_route_idField);

		Field pickup_stopage_idField = new Field("pickup_stopage_id", "String");
		pickup_stopage_idField.setIndexed(true);
		pickup_stopage_idField.setLength(128);
		metaData.addField(pickup_stopage_idField);

		Field dropped_route_stopage_idField = new Field("dropped_route_stopage_id", "String");
		dropped_route_stopage_idField.setIndexed(true);
		dropped_route_stopage_idField.setLength(128);
		metaData.addField(dropped_route_stopage_idField);

		Field dropped_route_idField = new Field("dropped_route_id", "String");
		dropped_route_idField.setIndexed(true);
		dropped_route_idField.setLength(128);
		metaData.addField(dropped_route_idField);

		Field dropped_stopage_idField = new Field("dropped_stopage_id", "String");
		dropped_stopage_idField.setIndexed(true);
		dropped_stopage_idField.setLength(128);
		metaData.addField(dropped_stopage_idField);

		Field alert_pickup_route_stopage_idField = new Field("alert_pickup_route_stopage_id", "String");
		alert_pickup_route_stopage_idField.setIndexed(true);
		alert_pickup_route_stopage_idField.setLength(128);
		metaData.addField(alert_pickup_route_stopage_idField);

		Field alert_dropped_route_stopage_idField = new Field("alert_dropped_route_stopage_id", "String");
		alert_dropped_route_stopage_idField.setIndexed(true);
		alert_dropped_route_stopage_idField.setLength(128);
		metaData.addField(alert_dropped_route_stopage_idField);

		Field father_nameField = new Field("father_name", "String");
		father_nameField.setLength(128);
		metaData.addField(father_nameField);

		Field father_email_idField = new Field("father_email_id", "String");
		father_email_idField.setLength(128);
		metaData.addField(father_email_idField);

		Field father_mobile_noField = new Field("father_mobile_no", "String");
		father_mobile_noField.setLength(128);
		metaData.addField(father_mobile_noField);

		Field father_home_phone_noField = new Field("father_home_phone_no", "String");
		father_home_phone_noField.setLength(128);
		metaData.addField(father_home_phone_noField);

		Field father_office_phone_noField = new Field("father_office_phone_no", "String");
		father_office_phone_noField.setLength(128);
		metaData.addField(father_office_phone_noField);

		Field father_dobField = new Field("father_dob", "String");
		father_dobField.setLength(128);
		metaData.addField(father_dobField);

		Field father_occupationField = new Field("father_occupation", "String");
		father_occupationField.setLength(128);
		metaData.addField(father_occupationField);

		Field father_roleField = new Field("father_role", "String");
		father_roleField.setLength(128);
		metaData.addField(father_roleField);

		Field father_company_nameField = new Field("father_company_name", "String");
		father_company_nameField.setLength(128);
		metaData.addField(father_company_nameField);

		Field father_phone_typeField = new Field("father_phone_type", "String");
		father_phone_typeField.setLength(128);
		metaData.addField(father_phone_typeField);

		Field mother_nameField = new Field("mother_name", "String");
		mother_nameField.setLength(128);
		metaData.addField(mother_nameField);

		Field mother_dobField = new Field("mother_dob", "String");
		mother_dobField.setLength(128);
		metaData.addField(mother_dobField);

		Field mother_mobile_noField = new Field("mother_mobile_no", "String");
		mother_mobile_noField.setLength(128);
		metaData.addField(mother_mobile_noField);

		Field mother_home_phone_noField = new Field("mother_home_phone_no", "String");
		mother_home_phone_noField.setLength(128);
		metaData.addField(mother_home_phone_noField);

		Field mother_office_phone_noField = new Field("mother_office_phone_no", "String");
		mother_office_phone_noField.setLength(128);
		metaData.addField(mother_office_phone_noField);

		Field mother_occupationField = new Field("mother_occupation", "String");
		mother_occupationField.setLength(128);
		metaData.addField(mother_occupationField);

		Field mother_roleField = new Field("mother_role", "String");
		mother_roleField.setLength(128);
		metaData.addField(mother_roleField);

		Field mother_company_nameField = new Field("mother_company_name", "String");
		mother_company_nameField.setLength(128);
		metaData.addField(mother_company_nameField);

		Field mother_email_idField = new Field("mother_email_id", "String");
		mother_email_idField.setLength(128);
		metaData.addField(mother_email_idField);

		Field mother_phone_typeField = new Field("mother_phone_type", "String");
		mother_phone_typeField.setLength(128);
		metaData.addField(mother_phone_typeField);

		Field other_nameField = new Field("other_name", "String");
		other_nameField.setLength(128);
		metaData.addField(other_nameField);

		Field other_mobile_noField = new Field("other_mobile_no", "String");
		other_mobile_noField.setLength(128);
		metaData.addField(other_mobile_noField);

		Field other_email_idField = new Field("other_email_id", "String");
		other_email_idField.setLength(128);
		metaData.addField(other_email_idField);

		Field other_phone_typeField = new Field("other_phone_type", "String");
		other_phone_typeField.setLength(128);
		metaData.addField(other_phone_typeField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(16);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(16);
		metaData.addField(section_nameField);

		Field dobField = new Field("dob", "String");
		dobField.setLength(16);
		metaData.addField(dobField);

		Field transportField = new Field("transport", "String");
		transportField.setDefaultValue("N");
		transportField.setLength(1);
		metaData.addField(transportField);

		Field class_section_nameField = new Field("class_section_name", "String");
		class_section_nameField.setIndexed(true);
		class_section_nameField.setLength(32);
		metaData.addField(class_section_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setRequired(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(512);
		metaData.addField(remarkField);

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

		Field overspeed_alert_smsField = new Field("overspeed_alert_sms", "String");
		overspeed_alert_smsField.setDefaultValue("N");
		overspeed_alert_smsField.setLength(1);
		metaData.addField(overspeed_alert_smsField);

		Field overspeed_alert_mobile_appField = new Field("overspeed_alert_mobile_app", "String");
		overspeed_alert_mobile_appField.setDefaultValue("Y");
		overspeed_alert_mobile_appField.setLength(1);
		metaData.addField(overspeed_alert_mobile_appField);

		Field overspeed_alert_emailField = new Field("overspeed_alert_email", "String");
		overspeed_alert_emailField.setDefaultValue("N");
		overspeed_alert_emailField.setLength(1);
		metaData.addField(overspeed_alert_emailField);

		Field neet_noField = new Field("neet_no", "String");
		neet_noField.setLength(128);
		metaData.addField(neet_noField);

		Field card_noField = new Field("card_no", "String");
		card_noField.setLength(128);
		metaData.addField(card_noField);

		Field card_swipe_pickup_pickField = new Field("card_swipe_pickup_pick", "String");
		card_swipe_pickup_pickField.setDefaultValue("N");
		card_swipe_pickup_pickField.setLength(1);
		metaData.addField(card_swipe_pickup_pickField);

		Field card_swipe_pickup_pick_timeField = new Field("card_swipe_pickup_pick_time", "timestamp");
		metaData.addField(card_swipe_pickup_pick_timeField);

		Field card_swipe_pickup_dropField = new Field("card_swipe_pickup_drop", "String");
		card_swipe_pickup_dropField.setDefaultValue("N");
		card_swipe_pickup_dropField.setLength(1);
		metaData.addField(card_swipe_pickup_dropField);

		Field card_swipe_pickup_drop_timeField = new Field("card_swipe_pickup_drop_time", "timestamp");
		metaData.addField(card_swipe_pickup_drop_timeField);

		Field card_swipe_drop_pickField = new Field("card_swipe_drop_pick", "String");
		card_swipe_drop_pickField.setDefaultValue("N");
		card_swipe_drop_pickField.setLength(1);
		metaData.addField(card_swipe_drop_pickField);

		Field card_swipe_drop_pick_timeField = new Field("card_swipe_drop_pick_time", "timestamp");
		metaData.addField(card_swipe_drop_pick_timeField);

		Field card_swipe_drop_dropField = new Field("card_swipe_drop_drop", "String");
		card_swipe_drop_dropField.setDefaultValue("N");
		card_swipe_drop_dropField.setLength(1);
		metaData.addField(card_swipe_drop_dropField);

		Field card_swipe_drop_drop_timeField = new Field("card_swipe_drop_drop_time", "timestamp");
		metaData.addField(card_swipe_drop_drop_timeField);

		Field total_absentField = new Field("total_absent", "int");
		total_absentField.setDefaultValue(0);
		metaData.addField(total_absentField);

		Field total_presentField = new Field("total_present", "int");
		total_presentField.setDefaultValue(0);
		metaData.addField(total_presentField);

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

		Field primary_contactField = new Field("primary_contact", "String");
		primary_contactField.setDefaultValue("MOTHER");
		metaData.addField(primary_contactField);

		Field genderField = new Field("gender", "String");
		genderField.setLength(10);
		metaData.addField(genderField);

		Field student_accountField = new Field("student_account", "String");
		student_accountField.setDefaultValue("Y");
		student_accountField.setLength(1);
		metaData.addField(student_accountField);

		Field leftField = new Field("left", "String");
		leftField.setDefaultValue("N");
		leftField.setLength(1);
		metaData.addField(leftField);

		Field left_date_strField = new Field("left_date_str", "String");
		left_date_strField.setLength(16);
		metaData.addField(left_date_strField);

		Field left_reasonField = new Field("left_reason", "String");
		left_reasonField.setLength(256);
		metaData.addField(left_reasonField);

		Field student_email_idField = new Field("student_email_id", "String");
		student_email_idField.setLength(128);
		metaData.addField(student_email_idField);

		Field student_mobile_noField = new Field("student_mobile_no", "String");
		student_mobile_noField.setLength(128);
		metaData.addField(student_mobile_noField);

		Field class_teacher_idField = new Field("class_teacher_id", "String");
		class_teacher_idField.setLength(128);
		metaData.addField(class_teacher_idField);

		Field class_teacher_nameField = new Field("class_teacher_name", "String");
		class_teacher_nameField.setLength(128);
		metaData.addField(class_teacher_nameField);

		Field second_languageField = new Field("second_language", "String");
		second_languageField.setLength(128);
		metaData.addField(second_languageField);

		Field third_languageField = new Field("third_language", "String");
		third_languageField.setLength(128);
		metaData.addField(third_languageField);

		Field card_not_workingField = new Field("card_not_working", "String");
		card_not_workingField.setDefaultValue("N");
		card_not_workingField.setLength(128);
		metaData.addField(card_not_workingField);

		Field card_not_working_reasonField = new Field("card_not_working_reason", "String");
		card_not_working_reasonField.setLength(128);
		metaData.addField(card_not_working_reasonField);

		Field card_not_working_date_strField = new Field("card_not_working_date_str", "String");
		card_not_working_date_strField.setLength(32);
		metaData.addField(card_not_working_date_strField);

		Field feature_bus_pickup_entry_smsField = new Field("feature_bus_pickup_entry_sms", "String");
		feature_bus_pickup_entry_smsField.setDefaultValue("Y");
		feature_bus_pickup_entry_smsField.setLength(1);
		metaData.addField(feature_bus_pickup_entry_smsField);

		Field feature_bus_pickup_exit_smsField = new Field("feature_bus_pickup_exit_sms", "String");
		feature_bus_pickup_exit_smsField.setDefaultValue("Y");
		feature_bus_pickup_exit_smsField.setLength(1);
		metaData.addField(feature_bus_pickup_exit_smsField);

		Field feature_bus_drop_entry_smsField = new Field("feature_bus_drop_entry_sms", "String");
		feature_bus_drop_entry_smsField.setDefaultValue("Y");
		feature_bus_drop_entry_smsField.setLength(1);
		metaData.addField(feature_bus_drop_entry_smsField);

		Field feature_bus_drop_exit_smsField = new Field("feature_bus_drop_exit_sms", "String");
		feature_bus_drop_exit_smsField.setDefaultValue("Y");
		feature_bus_drop_exit_smsField.setLength(1);
		metaData.addField(feature_bus_drop_exit_smsField);

		Field feature_school_entry_smsField = new Field("feature_school_entry_sms", "String");
		feature_school_entry_smsField.setDefaultValue("Y");
		feature_school_entry_smsField.setLength(1);
		metaData.addField(feature_school_entry_smsField);

		Field feature_school_exit_smsField = new Field("feature_school_exit_sms", "String");
		feature_school_exit_smsField.setDefaultValue("Y");
		feature_school_exit_smsField.setLength(1);
		metaData.addField(feature_school_exit_smsField);

		Field application_processedField = new Field("application_processed", "String");
		application_processedField.setDefaultValue("N");
		application_processedField.setLength(1);
		metaData.addField(application_processedField);

		Field notes_issuedField = new Field("notes_issued", "String");
		notes_issuedField.setDefaultValue("Y");
		notes_issuedField.setLength(1);
		metaData.addField(notes_issuedField);

		Field notes_issued_date_strField = new Field("notes_issued_date_str", "String");
		notes_issued_date_strField.setLength(32);
		metaData.addField(notes_issued_date_strField);

		Field notes_issued_dateField = new Field("notes_issued_date", "long");
		metaData.addField(notes_issued_dateField);

		Field notes_issued_remarkField = new Field("notes_issued_remark", "String");
		notes_issued_remarkField.setLength(128);
		metaData.addField(notes_issued_remarkField);

		Field total_feesField = new Field("total_fees", "double");
		metaData.addField(total_feesField);

		Field total_additional_chargesField = new Field("total_additional_charges", "double");
		metaData.addField(total_additional_chargesField);

		Field total_fees_paidField = new Field("total_fees_paid", "double");
		metaData.addField(total_fees_paidField);

		Field discountField = new Field("discount", "double");
		metaData.addField(discountField);

		Field opening_balanceField = new Field("opening_balance", "double");
		metaData.addField(opening_balanceField);

		Field total_debitField = new Field("total_debit", "double");
		metaData.addField(total_debitField);

		Field total_creditField = new Field("total_credit", "double");
		metaData.addField(total_creditField);

		Field closing_balanceField = new Field("closing_balance", "double");
		metaData.addField(closing_balanceField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("student");

		metaData.setCluster("DB_PROFILE");
	}

	public Basestudent() {}

	public Basestudent(Basestudent obj) {
		this.id = obj.id;
		this.admission_no = obj.admission_no;
		this.admission_date_str = obj.admission_date_str;
		this.school_id = obj.school_id;
		this.batch_id = obj.batch_id;
		this.fees_master_id = obj.fees_master_id;
		this.batch_name = obj.batch_name;
		this.house_id = obj.house_id;
		this.name = obj.name;
		this.short_name = obj.short_name;
		this.blood_group = obj.blood_group;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.address3 = obj.address3;
		this.city = obj.city;
		this.state = obj.state;
		this.syllabus_type = obj.syllabus_type;
		this.country = obj.country;
		this.course_id = obj.course_id;
		this.pickup_route_stopage_id = obj.pickup_route_stopage_id;
		this.pickup_route_id = obj.pickup_route_id;
		this.pickup_stopage_id = obj.pickup_stopage_id;
		this.dropped_route_stopage_id = obj.dropped_route_stopage_id;
		this.dropped_route_id = obj.dropped_route_id;
		this.dropped_stopage_id = obj.dropped_stopage_id;
		this.alert_pickup_route_stopage_id = obj.alert_pickup_route_stopage_id;
		this.alert_dropped_route_stopage_id = obj.alert_dropped_route_stopage_id;
		this.father_name = obj.father_name;
		this.father_email_id = obj.father_email_id;
		this.father_mobile_no = obj.father_mobile_no;
		this.father_home_phone_no = obj.father_home_phone_no;
		this.father_office_phone_no = obj.father_office_phone_no;
		this.father_dob = obj.father_dob;
		this.father_occupation = obj.father_occupation;
		this.father_role = obj.father_role;
		this.father_company_name = obj.father_company_name;
		this.father_phone_type = obj.father_phone_type;
		this.mother_name = obj.mother_name;
		this.mother_dob = obj.mother_dob;
		this.mother_mobile_no = obj.mother_mobile_no;
		this.mother_home_phone_no = obj.mother_home_phone_no;
		this.mother_office_phone_no = obj.mother_office_phone_no;
		this.mother_occupation = obj.mother_occupation;
		this.mother_role = obj.mother_role;
		this.mother_company_name = obj.mother_company_name;
		this.mother_email_id = obj.mother_email_id;
		this.mother_phone_type = obj.mother_phone_type;
		this.other_name = obj.other_name;
		this.other_mobile_no = obj.other_mobile_no;
		this.other_email_id = obj.other_email_id;
		this.other_phone_type = obj.other_phone_type;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.dob = obj.dob;
		this.transport = obj.transport;
		this.class_section_name = obj.class_section_name;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.remark = obj.remark;
		this.stopage_alert_sms = obj.stopage_alert_sms;
		this.stopage_alert_mobile_app = obj.stopage_alert_mobile_app;
		this.stopage_alert_email = obj.stopage_alert_email;
		this.overspeed_alert_sms = obj.overspeed_alert_sms;
		this.overspeed_alert_mobile_app = obj.overspeed_alert_mobile_app;
		this.overspeed_alert_email = obj.overspeed_alert_email;
		this.neet_no = obj.neet_no;
		this.card_no = obj.card_no;
		this.card_swipe_pickup_pick = obj.card_swipe_pickup_pick;
		this.card_swipe_pickup_pick_time = obj.card_swipe_pickup_pick_time;
		this.card_swipe_pickup_drop = obj.card_swipe_pickup_drop;
		this.card_swipe_pickup_drop_time = obj.card_swipe_pickup_drop_time;
		this.card_swipe_drop_pick = obj.card_swipe_drop_pick;
		this.card_swipe_drop_pick_time = obj.card_swipe_drop_pick_time;
		this.card_swipe_drop_drop = obj.card_swipe_drop_drop;
		this.card_swipe_drop_drop_time = obj.card_swipe_drop_drop_time;
		this.total_absent = obj.total_absent;
		this.total_present = obj.total_present;
		this.daily_activity_count = obj.daily_activity_count;
		this.home_practice_count = obj.home_practice_count;
		this.homework_count = obj.homework_count;
		this.notice_count = obj.notice_count;
		this.transport_count = obj.transport_count;
		this.absent_report_count = obj.absent_report_count;
		this.present_report_count = obj.present_report_count;
		this.message2school_count = obj.message2school_count;
		this.primary_contact = obj.primary_contact;
		this.gender = obj.gender;
		this.student_account = obj.student_account;
		this.left = obj.left;
		this.left_date_str = obj.left_date_str;
		this.left_reason = obj.left_reason;
		this.student_email_id = obj.student_email_id;
		this.student_mobile_no = obj.student_mobile_no;
		this.class_teacher_id = obj.class_teacher_id;
		this.class_teacher_name = obj.class_teacher_name;
		this.second_language = obj.second_language;
		this.third_language = obj.third_language;
		this.card_not_working = obj.card_not_working;
		this.card_not_working_reason = obj.card_not_working_reason;
		this.card_not_working_date_str = obj.card_not_working_date_str;
		this.feature_bus_pickup_entry_sms = obj.feature_bus_pickup_entry_sms;
		this.feature_bus_pickup_exit_sms = obj.feature_bus_pickup_exit_sms;
		this.feature_bus_drop_entry_sms = obj.feature_bus_drop_entry_sms;
		this.feature_bus_drop_exit_sms = obj.feature_bus_drop_exit_sms;
		this.feature_school_entry_sms = obj.feature_school_entry_sms;
		this.feature_school_exit_sms = obj.feature_school_exit_sms;
		this.application_processed = obj.application_processed;
		this.notes_issued = obj.notes_issued;
		this.notes_issued_date_str = obj.notes_issued_date_str;
		this.notes_issued_date = obj.notes_issued_date;
		this.notes_issued_remark = obj.notes_issued_remark;
		this.total_fees = obj.total_fees;
		this.total_additional_charges = obj.total_additional_charges;
		this.total_fees_paid = obj.total_fees_paid;
		this.discount = obj.discount;
		this.opening_balance = obj.opening_balance;
		this.total_debit = obj.total_debit;
		this.total_credit = obj.total_credit;
		this.closing_balance = obj.closing_balance;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(transport == null)
			transport = "N";
		if(stopage_alert_sms == null)
			stopage_alert_sms = "N";
		if(stopage_alert_mobile_app == null)
			stopage_alert_mobile_app = "Y";
		if(stopage_alert_email == null)
			stopage_alert_email = "N";
		if(overspeed_alert_sms == null)
			overspeed_alert_sms = "N";
		if(overspeed_alert_mobile_app == null)
			overspeed_alert_mobile_app = "Y";
		if(overspeed_alert_email == null)
			overspeed_alert_email = "N";
		if(card_swipe_pickup_pick == null)
			card_swipe_pickup_pick = "N";
		if(card_swipe_pickup_drop == null)
			card_swipe_pickup_drop = "N";
		if(card_swipe_drop_pick == null)
			card_swipe_drop_pick = "N";
		if(card_swipe_drop_drop == null)
			card_swipe_drop_drop = "N";
		if(total_absent == null)
			total_absent = 0;
		if(total_present == null)
			total_present = 0;
		if(daily_activity_count == null)
			daily_activity_count = 0;
		if(home_practice_count == null)
			home_practice_count = 0;
		if(homework_count == null)
			homework_count = 0;
		if(notice_count == null)
			notice_count = 0;
		if(transport_count == null)
			transport_count = 0;
		if(absent_report_count == null)
			absent_report_count = 0;
		if(present_report_count == null)
			present_report_count = 0;
		if(message2school_count == null)
			message2school_count = 0;
		if(primary_contact == null)
			primary_contact = "MOTHER";
		if(student_account == null)
			student_account = "Y";
		if(left == null)
			left = "N";
		if(card_not_working == null)
			card_not_working = "N";
		if(feature_bus_pickup_entry_sms == null)
			feature_bus_pickup_entry_sms = "Y";
		if(feature_bus_pickup_exit_sms == null)
			feature_bus_pickup_exit_sms = "Y";
		if(feature_bus_drop_entry_sms == null)
			feature_bus_drop_entry_sms = "Y";
		if(feature_bus_drop_exit_sms == null)
			feature_bus_drop_exit_sms = "Y";
		if(feature_school_entry_sms == null)
			feature_school_entry_sms = "Y";
		if(feature_school_exit_sms == null)
			feature_school_exit_sms = "Y";
		if(application_processed == null)
			application_processed = "N";
		if(notes_issued == null)
			notes_issued = "Y";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(admission_no != null)
			map.put("admission_no", admission_no);
		if(admission_date_str != null)
			map.put("admission_date_str", admission_date_str);
		if(school_id != null)
			map.put("school_id", school_id);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(fees_master_id != null)
			map.put("fees_master_id", fees_master_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(house_id != null)
			map.put("house_id", house_id);
		if(name != null)
			map.put("name", name);
		if(short_name != null)
			map.put("short_name", short_name);
		if(blood_group != null)
			map.put("blood_group", blood_group);
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
		if(syllabus_type != null)
			map.put("syllabus_type", syllabus_type);
		if(country != null)
			map.put("country", country);
		if(course_id != null)
			map.put("course_id", course_id);
		if(pickup_route_stopage_id != null)
			map.put("pickup_route_stopage_id", pickup_route_stopage_id);
		if(pickup_route_id != null)
			map.put("pickup_route_id", pickup_route_id);
		if(pickup_stopage_id != null)
			map.put("pickup_stopage_id", pickup_stopage_id);
		if(dropped_route_stopage_id != null)
			map.put("dropped_route_stopage_id", dropped_route_stopage_id);
		if(dropped_route_id != null)
			map.put("dropped_route_id", dropped_route_id);
		if(dropped_stopage_id != null)
			map.put("dropped_stopage_id", dropped_stopage_id);
		if(alert_pickup_route_stopage_id != null)
			map.put("alert_pickup_route_stopage_id", alert_pickup_route_stopage_id);
		if(alert_dropped_route_stopage_id != null)
			map.put("alert_dropped_route_stopage_id", alert_dropped_route_stopage_id);
		if(father_name != null)
			map.put("father_name", father_name);
		if(father_email_id != null)
			map.put("father_email_id", father_email_id);
		if(father_mobile_no != null)
			map.put("father_mobile_no", father_mobile_no);
		if(father_home_phone_no != null)
			map.put("father_home_phone_no", father_home_phone_no);
		if(father_office_phone_no != null)
			map.put("father_office_phone_no", father_office_phone_no);
		if(father_dob != null)
			map.put("father_dob", father_dob);
		if(father_occupation != null)
			map.put("father_occupation", father_occupation);
		if(father_role != null)
			map.put("father_role", father_role);
		if(father_company_name != null)
			map.put("father_company_name", father_company_name);
		if(father_phone_type != null)
			map.put("father_phone_type", father_phone_type);
		if(mother_name != null)
			map.put("mother_name", mother_name);
		if(mother_dob != null)
			map.put("mother_dob", mother_dob);
		if(mother_mobile_no != null)
			map.put("mother_mobile_no", mother_mobile_no);
		if(mother_home_phone_no != null)
			map.put("mother_home_phone_no", mother_home_phone_no);
		if(mother_office_phone_no != null)
			map.put("mother_office_phone_no", mother_office_phone_no);
		if(mother_occupation != null)
			map.put("mother_occupation", mother_occupation);
		if(mother_role != null)
			map.put("mother_role", mother_role);
		if(mother_company_name != null)
			map.put("mother_company_name", mother_company_name);
		if(mother_email_id != null)
			map.put("mother_email_id", mother_email_id);
		if(mother_phone_type != null)
			map.put("mother_phone_type", mother_phone_type);
		if(other_name != null)
			map.put("other_name", other_name);
		if(other_mobile_no != null)
			map.put("other_mobile_no", other_mobile_no);
		if(other_email_id != null)
			map.put("other_email_id", other_email_id);
		if(other_phone_type != null)
			map.put("other_phone_type", other_phone_type);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(dob != null)
			map.put("dob", dob);
		if(transport != null)
			map.put("transport", transport);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(remark != null)
			map.put("remark", remark);
		if(stopage_alert_sms != null)
			map.put("stopage_alert_sms", stopage_alert_sms);
		if(stopage_alert_mobile_app != null)
			map.put("stopage_alert_mobile_app", stopage_alert_mobile_app);
		if(stopage_alert_email != null)
			map.put("stopage_alert_email", stopage_alert_email);
		if(overspeed_alert_sms != null)
			map.put("overspeed_alert_sms", overspeed_alert_sms);
		if(overspeed_alert_mobile_app != null)
			map.put("overspeed_alert_mobile_app", overspeed_alert_mobile_app);
		if(overspeed_alert_email != null)
			map.put("overspeed_alert_email", overspeed_alert_email);
		if(neet_no != null)
			map.put("neet_no", neet_no);
		if(card_no != null)
			map.put("card_no", card_no);
		if(card_swipe_pickup_pick != null)
			map.put("card_swipe_pickup_pick", card_swipe_pickup_pick);
		if(card_swipe_pickup_pick_time != null)
			map.put("card_swipe_pickup_pick_time", card_swipe_pickup_pick_time);
		if(card_swipe_pickup_drop != null)
			map.put("card_swipe_pickup_drop", card_swipe_pickup_drop);
		if(card_swipe_pickup_drop_time != null)
			map.put("card_swipe_pickup_drop_time", card_swipe_pickup_drop_time);
		if(card_swipe_drop_pick != null)
			map.put("card_swipe_drop_pick", card_swipe_drop_pick);
		if(card_swipe_drop_pick_time != null)
			map.put("card_swipe_drop_pick_time", card_swipe_drop_pick_time);
		if(card_swipe_drop_drop != null)
			map.put("card_swipe_drop_drop", card_swipe_drop_drop);
		if(card_swipe_drop_drop_time != null)
			map.put("card_swipe_drop_drop_time", card_swipe_drop_drop_time);
		if(total_absent != null)
			map.put("total_absent", total_absent);
		if(total_present != null)
			map.put("total_present", total_present);
		if(daily_activity_count != null)
			map.put("daily_activity_count", daily_activity_count);
		if(home_practice_count != null)
			map.put("home_practice_count", home_practice_count);
		if(homework_count != null)
			map.put("homework_count", homework_count);
		if(notice_count != null)
			map.put("notice_count", notice_count);
		if(transport_count != null)
			map.put("transport_count", transport_count);
		if(absent_report_count != null)
			map.put("absent_report_count", absent_report_count);
		if(present_report_count != null)
			map.put("present_report_count", present_report_count);
		if(message2school_count != null)
			map.put("message2school_count", message2school_count);
		if(primary_contact != null)
			map.put("primary_contact", primary_contact);
		if(gender != null)
			map.put("gender", gender);
		if(student_account != null)
			map.put("student_account", student_account);
		if(left != null)
			map.put("left", left);
		if(left_date_str != null)
			map.put("left_date_str", left_date_str);
		if(left_reason != null)
			map.put("left_reason", left_reason);
		if(student_email_id != null)
			map.put("student_email_id", student_email_id);
		if(student_mobile_no != null)
			map.put("student_mobile_no", student_mobile_no);
		if(class_teacher_id != null)
			map.put("class_teacher_id", class_teacher_id);
		if(class_teacher_name != null)
			map.put("class_teacher_name", class_teacher_name);
		if(second_language != null)
			map.put("second_language", second_language);
		if(third_language != null)
			map.put("third_language", third_language);
		if(card_not_working != null)
			map.put("card_not_working", card_not_working);
		if(card_not_working_reason != null)
			map.put("card_not_working_reason", card_not_working_reason);
		if(card_not_working_date_str != null)
			map.put("card_not_working_date_str", card_not_working_date_str);
		if(feature_bus_pickup_entry_sms != null)
			map.put("feature_bus_pickup_entry_sms", feature_bus_pickup_entry_sms);
		if(feature_bus_pickup_exit_sms != null)
			map.put("feature_bus_pickup_exit_sms", feature_bus_pickup_exit_sms);
		if(feature_bus_drop_entry_sms != null)
			map.put("feature_bus_drop_entry_sms", feature_bus_drop_entry_sms);
		if(feature_bus_drop_exit_sms != null)
			map.put("feature_bus_drop_exit_sms", feature_bus_drop_exit_sms);
		if(feature_school_entry_sms != null)
			map.put("feature_school_entry_sms", feature_school_entry_sms);
		if(feature_school_exit_sms != null)
			map.put("feature_school_exit_sms", feature_school_exit_sms);
		if(application_processed != null)
			map.put("application_processed", application_processed);
		if(notes_issued != null)
			map.put("notes_issued", notes_issued);
		if(notes_issued_date_str != null)
			map.put("notes_issued_date_str", notes_issued_date_str);
		if(notes_issued_date != null)
			map.put("notes_issued_date", notes_issued_date);
		if(notes_issued_remark != null)
			map.put("notes_issued_remark", notes_issued_remark);
		if(total_fees != null)
			map.put("total_fees", total_fees);
		if(total_additional_charges != null)
			map.put("total_additional_charges", total_additional_charges);
		if(total_fees_paid != null)
			map.put("total_fees_paid", total_fees_paid);
		if(discount != null)
			map.put("discount", discount);
		if(opening_balance != null)
			map.put("opening_balance", opening_balance);
		if(total_debit != null)
			map.put("total_debit", total_debit);
		if(total_credit != null)
			map.put("total_credit", total_credit);
		if(closing_balance != null)
			map.put("closing_balance", closing_balance);
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
		if(admission_no != null)
			map.put("admission_no", admission_no);
		if(admission_date_str != null)
			map.put("admission_date_str", admission_date_str);
		if(school_id != null)
			map.put("school_id", school_id);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(fees_master_id != null)
			map.put("fees_master_id", fees_master_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(house_id != null)
			map.put("house_id", house_id);
		if(name != null)
			map.put("name", name);
		if(short_name != null)
			map.put("short_name", short_name);
		if(blood_group != null)
			map.put("blood_group", blood_group);
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
		if(syllabus_type != null)
			map.put("syllabus_type", syllabus_type);
		if(country != null)
			map.put("country", country);
		if(course_id != null)
			map.put("course_id", course_id);
		if(pickup_route_stopage_id != null)
			map.put("pickup_route_stopage_id", pickup_route_stopage_id);
		if(pickup_route_id != null)
			map.put("pickup_route_id", pickup_route_id);
		if(pickup_stopage_id != null)
			map.put("pickup_stopage_id", pickup_stopage_id);
		if(dropped_route_stopage_id != null)
			map.put("dropped_route_stopage_id", dropped_route_stopage_id);
		if(dropped_route_id != null)
			map.put("dropped_route_id", dropped_route_id);
		if(dropped_stopage_id != null)
			map.put("dropped_stopage_id", dropped_stopage_id);
		if(alert_pickup_route_stopage_id != null)
			map.put("alert_pickup_route_stopage_id", alert_pickup_route_stopage_id);
		if(alert_dropped_route_stopage_id != null)
			map.put("alert_dropped_route_stopage_id", alert_dropped_route_stopage_id);
		if(father_name != null)
			map.put("father_name", father_name);
		if(father_email_id != null)
			map.put("father_email_id", father_email_id);
		if(father_mobile_no != null)
			map.put("father_mobile_no", father_mobile_no);
		if(father_home_phone_no != null)
			map.put("father_home_phone_no", father_home_phone_no);
		if(father_office_phone_no != null)
			map.put("father_office_phone_no", father_office_phone_no);
		if(father_dob != null)
			map.put("father_dob", father_dob);
		if(father_occupation != null)
			map.put("father_occupation", father_occupation);
		if(father_role != null)
			map.put("father_role", father_role);
		if(father_company_name != null)
			map.put("father_company_name", father_company_name);
		if(father_phone_type != null)
			map.put("father_phone_type", father_phone_type);
		if(mother_name != null)
			map.put("mother_name", mother_name);
		if(mother_dob != null)
			map.put("mother_dob", mother_dob);
		if(mother_mobile_no != null)
			map.put("mother_mobile_no", mother_mobile_no);
		if(mother_home_phone_no != null)
			map.put("mother_home_phone_no", mother_home_phone_no);
		if(mother_office_phone_no != null)
			map.put("mother_office_phone_no", mother_office_phone_no);
		if(mother_occupation != null)
			map.put("mother_occupation", mother_occupation);
		if(mother_role != null)
			map.put("mother_role", mother_role);
		if(mother_company_name != null)
			map.put("mother_company_name", mother_company_name);
		if(mother_email_id != null)
			map.put("mother_email_id", mother_email_id);
		if(mother_phone_type != null)
			map.put("mother_phone_type", mother_phone_type);
		if(other_name != null)
			map.put("other_name", other_name);
		if(other_mobile_no != null)
			map.put("other_mobile_no", other_mobile_no);
		if(other_email_id != null)
			map.put("other_email_id", other_email_id);
		if(other_phone_type != null)
			map.put("other_phone_type", other_phone_type);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(dob != null)
			map.put("dob", dob);
		if(transport != null)
			map.put("transport", transport);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(validateUser_id(add))
			map.put("user_id", user_id);
		if(remark != null)
			map.put("remark", remark);
		if(stopage_alert_sms != null)
			map.put("stopage_alert_sms", stopage_alert_sms);
		if(stopage_alert_mobile_app != null)
			map.put("stopage_alert_mobile_app", stopage_alert_mobile_app);
		if(stopage_alert_email != null)
			map.put("stopage_alert_email", stopage_alert_email);
		if(overspeed_alert_sms != null)
			map.put("overspeed_alert_sms", overspeed_alert_sms);
		if(overspeed_alert_mobile_app != null)
			map.put("overspeed_alert_mobile_app", overspeed_alert_mobile_app);
		if(overspeed_alert_email != null)
			map.put("overspeed_alert_email", overspeed_alert_email);
		if(neet_no != null)
			map.put("neet_no", neet_no);
		if(card_no != null)
			map.put("card_no", card_no);
		if(card_swipe_pickup_pick != null)
			map.put("card_swipe_pickup_pick", card_swipe_pickup_pick);
		if(card_swipe_pickup_pick_time != null)
			map.put("card_swipe_pickup_pick_time", card_swipe_pickup_pick_time);
		if(card_swipe_pickup_drop != null)
			map.put("card_swipe_pickup_drop", card_swipe_pickup_drop);
		if(card_swipe_pickup_drop_time != null)
			map.put("card_swipe_pickup_drop_time", card_swipe_pickup_drop_time);
		if(card_swipe_drop_pick != null)
			map.put("card_swipe_drop_pick", card_swipe_drop_pick);
		if(card_swipe_drop_pick_time != null)
			map.put("card_swipe_drop_pick_time", card_swipe_drop_pick_time);
		if(card_swipe_drop_drop != null)
			map.put("card_swipe_drop_drop", card_swipe_drop_drop);
		if(card_swipe_drop_drop_time != null)
			map.put("card_swipe_drop_drop_time", card_swipe_drop_drop_time);
		if(total_absent != null)
			map.put("total_absent", total_absent);
		if(total_present != null)
			map.put("total_present", total_present);
		if(daily_activity_count != null)
			map.put("daily_activity_count", daily_activity_count);
		if(home_practice_count != null)
			map.put("home_practice_count", home_practice_count);
		if(homework_count != null)
			map.put("homework_count", homework_count);
		if(notice_count != null)
			map.put("notice_count", notice_count);
		if(transport_count != null)
			map.put("transport_count", transport_count);
		if(absent_report_count != null)
			map.put("absent_report_count", absent_report_count);
		if(present_report_count != null)
			map.put("present_report_count", present_report_count);
		if(message2school_count != null)
			map.put("message2school_count", message2school_count);
		if(primary_contact != null)
			map.put("primary_contact", primary_contact);
		if(gender != null)
			map.put("gender", gender);
		if(student_account != null)
			map.put("student_account", student_account);
		if(left != null)
			map.put("left", left);
		if(left_date_str != null)
			map.put("left_date_str", left_date_str);
		if(left_reason != null)
			map.put("left_reason", left_reason);
		if(student_email_id != null)
			map.put("student_email_id", student_email_id);
		if(student_mobile_no != null)
			map.put("student_mobile_no", student_mobile_no);
		if(class_teacher_id != null)
			map.put("class_teacher_id", class_teacher_id);
		if(class_teacher_name != null)
			map.put("class_teacher_name", class_teacher_name);
		if(second_language != null)
			map.put("second_language", second_language);
		if(third_language != null)
			map.put("third_language", third_language);
		if(card_not_working != null)
			map.put("card_not_working", card_not_working);
		if(card_not_working_reason != null)
			map.put("card_not_working_reason", card_not_working_reason);
		if(card_not_working_date_str != null)
			map.put("card_not_working_date_str", card_not_working_date_str);
		if(feature_bus_pickup_entry_sms != null)
			map.put("feature_bus_pickup_entry_sms", feature_bus_pickup_entry_sms);
		if(feature_bus_pickup_exit_sms != null)
			map.put("feature_bus_pickup_exit_sms", feature_bus_pickup_exit_sms);
		if(feature_bus_drop_entry_sms != null)
			map.put("feature_bus_drop_entry_sms", feature_bus_drop_entry_sms);
		if(feature_bus_drop_exit_sms != null)
			map.put("feature_bus_drop_exit_sms", feature_bus_drop_exit_sms);
		if(feature_school_entry_sms != null)
			map.put("feature_school_entry_sms", feature_school_entry_sms);
		if(feature_school_exit_sms != null)
			map.put("feature_school_exit_sms", feature_school_exit_sms);
		if(application_processed != null)
			map.put("application_processed", application_processed);
		if(notes_issued != null)
			map.put("notes_issued", notes_issued);
		if(notes_issued_date_str != null)
			map.put("notes_issued_date_str", notes_issued_date_str);
		if(notes_issued_date != null)
			map.put("notes_issued_date", notes_issued_date);
		if(notes_issued_remark != null)
			map.put("notes_issued_remark", notes_issued_remark);
		if(total_fees != null)
			map.put("total_fees", total_fees);
		if(total_additional_charges != null)
			map.put("total_additional_charges", total_additional_charges);
		if(total_fees_paid != null)
			map.put("total_fees_paid", total_fees_paid);
		if(discount != null)
			map.put("discount", discount);
		if(opening_balance != null)
			map.put("opening_balance", opening_balance);
		if(total_debit != null)
			map.put("total_debit", total_debit);
		if(total_credit != null)
			map.put("total_credit", total_credit);
		if(closing_balance != null)
			map.put("closing_balance", closing_balance);
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
		admission_no = (String) map.get("admission_no");
		admission_date_str = (String) map.get("admission_date_str");
		school_id = (String) map.get("school_id");
		batch_id = (String) map.get("batch_id");
		fees_master_id = (String) map.get("fees_master_id");
		batch_name = (String) map.get("batch_name");
		house_id = (String) map.get("house_id");
		name = (String) map.get("name");
		short_name = (String) map.get("short_name");
		blood_group = (String) map.get("blood_group");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		address3 = (String) map.get("address3");
		city = (String) map.get("city");
		state = (String) map.get("state");
		syllabus_type = (String) map.get("syllabus_type");
		country = (String) map.get("country");
		course_id = (String) map.get("course_id");
		pickup_route_stopage_id = (String) map.get("pickup_route_stopage_id");
		pickup_route_id = (String) map.get("pickup_route_id");
		pickup_stopage_id = (String) map.get("pickup_stopage_id");
		dropped_route_stopage_id = (String) map.get("dropped_route_stopage_id");
		dropped_route_id = (String) map.get("dropped_route_id");
		dropped_stopage_id = (String) map.get("dropped_stopage_id");
		alert_pickup_route_stopage_id = (String) map.get("alert_pickup_route_stopage_id");
		alert_dropped_route_stopage_id = (String) map.get("alert_dropped_route_stopage_id");
		father_name = (String) map.get("father_name");
		father_email_id = (String) map.get("father_email_id");
		father_mobile_no = (String) map.get("father_mobile_no");
		father_home_phone_no = (String) map.get("father_home_phone_no");
		father_office_phone_no = (String) map.get("father_office_phone_no");
		father_dob = (String) map.get("father_dob");
		father_occupation = (String) map.get("father_occupation");
		father_role = (String) map.get("father_role");
		father_company_name = (String) map.get("father_company_name");
		father_phone_type = (String) map.get("father_phone_type");
		mother_name = (String) map.get("mother_name");
		mother_dob = (String) map.get("mother_dob");
		mother_mobile_no = (String) map.get("mother_mobile_no");
		mother_home_phone_no = (String) map.get("mother_home_phone_no");
		mother_office_phone_no = (String) map.get("mother_office_phone_no");
		mother_occupation = (String) map.get("mother_occupation");
		mother_role = (String) map.get("mother_role");
		mother_company_name = (String) map.get("mother_company_name");
		mother_email_id = (String) map.get("mother_email_id");
		mother_phone_type = (String) map.get("mother_phone_type");
		other_name = (String) map.get("other_name");
		other_mobile_no = (String) map.get("other_mobile_no");
		other_email_id = (String) map.get("other_email_id");
		other_phone_type = (String) map.get("other_phone_type");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		dob = (String) map.get("dob");
		transport = (String) map.get("transport");
		class_section_name = (String) map.get("class_section_name");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		remark = (String) map.get("remark");
		stopage_alert_sms = (String) map.get("stopage_alert_sms");
		stopage_alert_mobile_app = (String) map.get("stopage_alert_mobile_app");
		stopage_alert_email = (String) map.get("stopage_alert_email");
		overspeed_alert_sms = (String) map.get("overspeed_alert_sms");
		overspeed_alert_mobile_app = (String) map.get("overspeed_alert_mobile_app");
		overspeed_alert_email = (String) map.get("overspeed_alert_email");
		neet_no = (String) map.get("neet_no");
		card_no = (String) map.get("card_no");
		card_swipe_pickup_pick = (String) map.get("card_swipe_pickup_pick");
		card_swipe_pickup_pick_time = (Long) map.get("card_swipe_pickup_pick_time");
		card_swipe_pickup_drop = (String) map.get("card_swipe_pickup_drop");
		card_swipe_pickup_drop_time = (Long) map.get("card_swipe_pickup_drop_time");
		card_swipe_drop_pick = (String) map.get("card_swipe_drop_pick");
		card_swipe_drop_pick_time = (Long) map.get("card_swipe_drop_pick_time");
		card_swipe_drop_drop = (String) map.get("card_swipe_drop_drop");
		card_swipe_drop_drop_time = (Long) map.get("card_swipe_drop_drop_time");
		total_absent = (Integer) map.get("total_absent");
		total_present = (Integer) map.get("total_present");
		daily_activity_count = (Integer) map.get("daily_activity_count");
		home_practice_count = (Integer) map.get("home_practice_count");
		homework_count = (Integer) map.get("homework_count");
		notice_count = (Integer) map.get("notice_count");
		transport_count = (Integer) map.get("transport_count");
		absent_report_count = (Integer) map.get("absent_report_count");
		present_report_count = (Integer) map.get("present_report_count");
		message2school_count = (Integer) map.get("message2school_count");
		primary_contact = (String) map.get("primary_contact");
		gender = (String) map.get("gender");
		student_account = (String) map.get("student_account");
		left = (String) map.get("left");
		left_date_str = (String) map.get("left_date_str");
		left_reason = (String) map.get("left_reason");
		student_email_id = (String) map.get("student_email_id");
		student_mobile_no = (String) map.get("student_mobile_no");
		class_teacher_id = (String) map.get("class_teacher_id");
		class_teacher_name = (String) map.get("class_teacher_name");
		second_language = (String) map.get("second_language");
		third_language = (String) map.get("third_language");
		card_not_working = (String) map.get("card_not_working");
		card_not_working_reason = (String) map.get("card_not_working_reason");
		card_not_working_date_str = (String) map.get("card_not_working_date_str");
		feature_bus_pickup_entry_sms = (String) map.get("feature_bus_pickup_entry_sms");
		feature_bus_pickup_exit_sms = (String) map.get("feature_bus_pickup_exit_sms");
		feature_bus_drop_entry_sms = (String) map.get("feature_bus_drop_entry_sms");
		feature_bus_drop_exit_sms = (String) map.get("feature_bus_drop_exit_sms");
		feature_school_entry_sms = (String) map.get("feature_school_entry_sms");
		feature_school_exit_sms = (String) map.get("feature_school_exit_sms");
		application_processed = (String) map.get("application_processed");
		notes_issued = (String) map.get("notes_issued");
		notes_issued_date_str = (String) map.get("notes_issued_date_str");
		notes_issued_date = (Long) map.get("notes_issued_date");
		notes_issued_remark = (String) map.get("notes_issued_remark");
		total_fees = (Double) map.get("total_fees");
		total_additional_charges = (Double) map.get("total_additional_charges");
		total_fees_paid = (Double) map.get("total_fees_paid");
		discount = (Double) map.get("discount");
		opening_balance = (Double) map.get("opening_balance");
		total_debit = (Double) map.get("total_debit");
		total_credit = (Double) map.get("total_credit");
		closing_balance = (Double) map.get("closing_balance");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object admission_noObj = map.get("admission_no");
		if(admission_noObj != null)
			admission_no = admission_noObj.toString();

		Object admission_date_strObj = map.get("admission_date_str");
		if(admission_date_strObj != null)
			admission_date_str = admission_date_strObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object batch_idObj = map.get("batch_id");
		if(batch_idObj != null)
			batch_id = batch_idObj.toString();

		Object fees_master_idObj = map.get("fees_master_id");
		if(fees_master_idObj != null)
			fees_master_id = fees_master_idObj.toString();

		Object batch_nameObj = map.get("batch_name");
		if(batch_nameObj != null)
			batch_name = batch_nameObj.toString();

		Object house_idObj = map.get("house_id");
		if(house_idObj != null)
			house_id = house_idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object short_nameObj = map.get("short_name");
		if(short_nameObj != null)
			short_name = short_nameObj.toString();

		Object blood_groupObj = map.get("blood_group");
		if(blood_groupObj != null)
			blood_group = blood_groupObj.toString();

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

		Object syllabus_typeObj = map.get("syllabus_type");
		if(syllabus_typeObj != null)
			syllabus_type = syllabus_typeObj.toString();

		Object countryObj = map.get("country");
		if(countryObj != null)
			country = countryObj.toString();

		Object course_idObj = map.get("course_id");
		if(course_idObj != null)
			course_id = course_idObj.toString();

		Object pickup_route_stopage_idObj = map.get("pickup_route_stopage_id");
		if(pickup_route_stopage_idObj != null)
			pickup_route_stopage_id = pickup_route_stopage_idObj.toString();

		Object pickup_route_idObj = map.get("pickup_route_id");
		if(pickup_route_idObj != null)
			pickup_route_id = pickup_route_idObj.toString();

		Object pickup_stopage_idObj = map.get("pickup_stopage_id");
		if(pickup_stopage_idObj != null)
			pickup_stopage_id = pickup_stopage_idObj.toString();

		Object dropped_route_stopage_idObj = map.get("dropped_route_stopage_id");
		if(dropped_route_stopage_idObj != null)
			dropped_route_stopage_id = dropped_route_stopage_idObj.toString();

		Object dropped_route_idObj = map.get("dropped_route_id");
		if(dropped_route_idObj != null)
			dropped_route_id = dropped_route_idObj.toString();

		Object dropped_stopage_idObj = map.get("dropped_stopage_id");
		if(dropped_stopage_idObj != null)
			dropped_stopage_id = dropped_stopage_idObj.toString();

		Object alert_pickup_route_stopage_idObj = map.get("alert_pickup_route_stopage_id");
		if(alert_pickup_route_stopage_idObj != null)
			alert_pickup_route_stopage_id = alert_pickup_route_stopage_idObj.toString();

		Object alert_dropped_route_stopage_idObj = map.get("alert_dropped_route_stopage_id");
		if(alert_dropped_route_stopage_idObj != null)
			alert_dropped_route_stopage_id = alert_dropped_route_stopage_idObj.toString();

		Object father_nameObj = map.get("father_name");
		if(father_nameObj != null)
			father_name = father_nameObj.toString();

		Object father_email_idObj = map.get("father_email_id");
		if(father_email_idObj != null)
			father_email_id = father_email_idObj.toString();

		Object father_mobile_noObj = map.get("father_mobile_no");
		if(father_mobile_noObj != null)
			father_mobile_no = father_mobile_noObj.toString();

		Object father_home_phone_noObj = map.get("father_home_phone_no");
		if(father_home_phone_noObj != null)
			father_home_phone_no = father_home_phone_noObj.toString();

		Object father_office_phone_noObj = map.get("father_office_phone_no");
		if(father_office_phone_noObj != null)
			father_office_phone_no = father_office_phone_noObj.toString();

		Object father_dobObj = map.get("father_dob");
		if(father_dobObj != null)
			father_dob = father_dobObj.toString();

		Object father_occupationObj = map.get("father_occupation");
		if(father_occupationObj != null)
			father_occupation = father_occupationObj.toString();

		Object father_roleObj = map.get("father_role");
		if(father_roleObj != null)
			father_role = father_roleObj.toString();

		Object father_company_nameObj = map.get("father_company_name");
		if(father_company_nameObj != null)
			father_company_name = father_company_nameObj.toString();

		Object father_phone_typeObj = map.get("father_phone_type");
		if(father_phone_typeObj != null)
			father_phone_type = father_phone_typeObj.toString();

		Object mother_nameObj = map.get("mother_name");
		if(mother_nameObj != null)
			mother_name = mother_nameObj.toString();

		Object mother_dobObj = map.get("mother_dob");
		if(mother_dobObj != null)
			mother_dob = mother_dobObj.toString();

		Object mother_mobile_noObj = map.get("mother_mobile_no");
		if(mother_mobile_noObj != null)
			mother_mobile_no = mother_mobile_noObj.toString();

		Object mother_home_phone_noObj = map.get("mother_home_phone_no");
		if(mother_home_phone_noObj != null)
			mother_home_phone_no = mother_home_phone_noObj.toString();

		Object mother_office_phone_noObj = map.get("mother_office_phone_no");
		if(mother_office_phone_noObj != null)
			mother_office_phone_no = mother_office_phone_noObj.toString();

		Object mother_occupationObj = map.get("mother_occupation");
		if(mother_occupationObj != null)
			mother_occupation = mother_occupationObj.toString();

		Object mother_roleObj = map.get("mother_role");
		if(mother_roleObj != null)
			mother_role = mother_roleObj.toString();

		Object mother_company_nameObj = map.get("mother_company_name");
		if(mother_company_nameObj != null)
			mother_company_name = mother_company_nameObj.toString();

		Object mother_email_idObj = map.get("mother_email_id");
		if(mother_email_idObj != null)
			mother_email_id = mother_email_idObj.toString();

		Object mother_phone_typeObj = map.get("mother_phone_type");
		if(mother_phone_typeObj != null)
			mother_phone_type = mother_phone_typeObj.toString();

		Object other_nameObj = map.get("other_name");
		if(other_nameObj != null)
			other_name = other_nameObj.toString();

		Object other_mobile_noObj = map.get("other_mobile_no");
		if(other_mobile_noObj != null)
			other_mobile_no = other_mobile_noObj.toString();

		Object other_email_idObj = map.get("other_email_id");
		if(other_email_idObj != null)
			other_email_id = other_email_idObj.toString();

		Object other_phone_typeObj = map.get("other_phone_type");
		if(other_phone_typeObj != null)
			other_phone_type = other_phone_typeObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object dobObj = map.get("dob");
		if(dobObj != null)
			dob = dobObj.toString();

		Object transportObj = map.get("transport");
		if(transportObj != null)
			transport = transportObj.toString();

		Object class_section_nameObj = map.get("class_section_name");
		if(class_section_nameObj != null)
			class_section_name = class_section_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

		Object stopage_alert_smsObj = map.get("stopage_alert_sms");
		if(stopage_alert_smsObj != null)
			stopage_alert_sms = stopage_alert_smsObj.toString();

		Object stopage_alert_mobile_appObj = map.get("stopage_alert_mobile_app");
		if(stopage_alert_mobile_appObj != null)
			stopage_alert_mobile_app = stopage_alert_mobile_appObj.toString();

		Object stopage_alert_emailObj = map.get("stopage_alert_email");
		if(stopage_alert_emailObj != null)
			stopage_alert_email = stopage_alert_emailObj.toString();

		Object overspeed_alert_smsObj = map.get("overspeed_alert_sms");
		if(overspeed_alert_smsObj != null)
			overspeed_alert_sms = overspeed_alert_smsObj.toString();

		Object overspeed_alert_mobile_appObj = map.get("overspeed_alert_mobile_app");
		if(overspeed_alert_mobile_appObj != null)
			overspeed_alert_mobile_app = overspeed_alert_mobile_appObj.toString();

		Object overspeed_alert_emailObj = map.get("overspeed_alert_email");
		if(overspeed_alert_emailObj != null)
			overspeed_alert_email = overspeed_alert_emailObj.toString();

		Object neet_noObj = map.get("neet_no");
		if(neet_noObj != null)
			neet_no = neet_noObj.toString();

		Object card_noObj = map.get("card_no");
		if(card_noObj != null)
			card_no = card_noObj.toString();

		Object card_swipe_pickup_pickObj = map.get("card_swipe_pickup_pick");
		if(card_swipe_pickup_pickObj != null)
			card_swipe_pickup_pick = card_swipe_pickup_pickObj.toString();

		Object card_swipe_pickup_pick_timeObj = map.get("card_swipe_pickup_pick_time");
		if(card_swipe_pickup_pick_timeObj != null)
			card_swipe_pickup_pick_time = (Long) card_swipe_pickup_pick_timeObj;

		Object card_swipe_pickup_dropObj = map.get("card_swipe_pickup_drop");
		if(card_swipe_pickup_dropObj != null)
			card_swipe_pickup_drop = card_swipe_pickup_dropObj.toString();

		Object card_swipe_pickup_drop_timeObj = map.get("card_swipe_pickup_drop_time");
		if(card_swipe_pickup_drop_timeObj != null)
			card_swipe_pickup_drop_time = (Long) card_swipe_pickup_drop_timeObj;

		Object card_swipe_drop_pickObj = map.get("card_swipe_drop_pick");
		if(card_swipe_drop_pickObj != null)
			card_swipe_drop_pick = card_swipe_drop_pickObj.toString();

		Object card_swipe_drop_pick_timeObj = map.get("card_swipe_drop_pick_time");
		if(card_swipe_drop_pick_timeObj != null)
			card_swipe_drop_pick_time = (Long) card_swipe_drop_pick_timeObj;

		Object card_swipe_drop_dropObj = map.get("card_swipe_drop_drop");
		if(card_swipe_drop_dropObj != null)
			card_swipe_drop_drop = card_swipe_drop_dropObj.toString();

		Object card_swipe_drop_drop_timeObj = map.get("card_swipe_drop_drop_time");
		if(card_swipe_drop_drop_timeObj != null)
			card_swipe_drop_drop_time = (Long) card_swipe_drop_drop_timeObj;

		Object total_absentObj = map.get("total_absent");
		if(total_absentObj != null)
			total_absent = new Integer(total_absentObj.toString());

		Object total_presentObj = map.get("total_present");
		if(total_presentObj != null)
			total_present = new Integer(total_presentObj.toString());

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

		Object primary_contactObj = map.get("primary_contact");
		if(primary_contactObj != null)
			primary_contact = primary_contactObj.toString();

		Object genderObj = map.get("gender");
		if(genderObj != null)
			gender = genderObj.toString();

		Object student_accountObj = map.get("student_account");
		if(student_accountObj != null)
			student_account = student_accountObj.toString();

		Object leftObj = map.get("left");
		if(leftObj != null)
			left = leftObj.toString();

		Object left_date_strObj = map.get("left_date_str");
		if(left_date_strObj != null)
			left_date_str = left_date_strObj.toString();

		Object left_reasonObj = map.get("left_reason");
		if(left_reasonObj != null)
			left_reason = left_reasonObj.toString();

		Object student_email_idObj = map.get("student_email_id");
		if(student_email_idObj != null)
			student_email_id = student_email_idObj.toString();

		Object student_mobile_noObj = map.get("student_mobile_no");
		if(student_mobile_noObj != null)
			student_mobile_no = student_mobile_noObj.toString();

		Object class_teacher_idObj = map.get("class_teacher_id");
		if(class_teacher_idObj != null)
			class_teacher_id = class_teacher_idObj.toString();

		Object class_teacher_nameObj = map.get("class_teacher_name");
		if(class_teacher_nameObj != null)
			class_teacher_name = class_teacher_nameObj.toString();

		Object second_languageObj = map.get("second_language");
		if(second_languageObj != null)
			second_language = second_languageObj.toString();

		Object third_languageObj = map.get("third_language");
		if(third_languageObj != null)
			third_language = third_languageObj.toString();

		Object card_not_workingObj = map.get("card_not_working");
		if(card_not_workingObj != null)
			card_not_working = card_not_workingObj.toString();

		Object card_not_working_reasonObj = map.get("card_not_working_reason");
		if(card_not_working_reasonObj != null)
			card_not_working_reason = card_not_working_reasonObj.toString();

		Object card_not_working_date_strObj = map.get("card_not_working_date_str");
		if(card_not_working_date_strObj != null)
			card_not_working_date_str = card_not_working_date_strObj.toString();

		Object feature_bus_pickup_entry_smsObj = map.get("feature_bus_pickup_entry_sms");
		if(feature_bus_pickup_entry_smsObj != null)
			feature_bus_pickup_entry_sms = feature_bus_pickup_entry_smsObj.toString();

		Object feature_bus_pickup_exit_smsObj = map.get("feature_bus_pickup_exit_sms");
		if(feature_bus_pickup_exit_smsObj != null)
			feature_bus_pickup_exit_sms = feature_bus_pickup_exit_smsObj.toString();

		Object feature_bus_drop_entry_smsObj = map.get("feature_bus_drop_entry_sms");
		if(feature_bus_drop_entry_smsObj != null)
			feature_bus_drop_entry_sms = feature_bus_drop_entry_smsObj.toString();

		Object feature_bus_drop_exit_smsObj = map.get("feature_bus_drop_exit_sms");
		if(feature_bus_drop_exit_smsObj != null)
			feature_bus_drop_exit_sms = feature_bus_drop_exit_smsObj.toString();

		Object feature_school_entry_smsObj = map.get("feature_school_entry_sms");
		if(feature_school_entry_smsObj != null)
			feature_school_entry_sms = feature_school_entry_smsObj.toString();

		Object feature_school_exit_smsObj = map.get("feature_school_exit_sms");
		if(feature_school_exit_smsObj != null)
			feature_school_exit_sms = feature_school_exit_smsObj.toString();

		Object application_processedObj = map.get("application_processed");
		if(application_processedObj != null)
			application_processed = application_processedObj.toString();

		Object notes_issuedObj = map.get("notes_issued");
		if(notes_issuedObj != null)
			notes_issued = notes_issuedObj.toString();

		Object notes_issued_date_strObj = map.get("notes_issued_date_str");
		if(notes_issued_date_strObj != null)
			notes_issued_date_str = notes_issued_date_strObj.toString();

		Object notes_issued_dateObj = map.get("notes_issued_date");
		if(notes_issued_dateObj != null)
			notes_issued_date = new Long(notes_issued_dateObj.toString());

		Object notes_issued_remarkObj = map.get("notes_issued_remark");
		if(notes_issued_remarkObj != null)
			notes_issued_remark = notes_issued_remarkObj.toString();

		Object total_feesObj = map.get("total_fees");
		if(total_feesObj != null)
			total_fees = new Double(total_feesObj.toString());

		Object total_additional_chargesObj = map.get("total_additional_charges");
		if(total_additional_chargesObj != null)
			total_additional_charges = new Double(total_additional_chargesObj.toString());

		Object total_fees_paidObj = map.get("total_fees_paid");
		if(total_fees_paidObj != null)
			total_fees_paid = new Double(total_fees_paidObj.toString());

		Object discountObj = map.get("discount");
		if(discountObj != null)
			discount = new Double(discountObj.toString());

		Object opening_balanceObj = map.get("opening_balance");
		if(opening_balanceObj != null)
			opening_balance = new Double(opening_balanceObj.toString());

		Object total_debitObj = map.get("total_debit");
		if(total_debitObj != null)
			total_debit = new Double(total_debitObj.toString());

		Object total_creditObj = map.get("total_credit");
		if(total_creditObj != null)
			total_credit = new Double(total_creditObj.toString());

		Object closing_balanceObj = map.get("closing_balance");
		if(closing_balanceObj != null)
			closing_balance = new Double(closing_balanceObj.toString());

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

	public String getAdmission_no() {
		return admission_no;
	}

	public String getAdmission_noEx() {
		return admission_no != null ? admission_no : "";
	}

	public void setAdmission_no(String admission_no) {
		this.admission_no = admission_no;
	}

	public void unSetAdmission_no() {
		this.admission_no = null;
	}

	public String getAdmission_date_str() {
		return admission_date_str;
	}

	public String getAdmission_date_strEx() {
		return admission_date_str != null ? admission_date_str : "";
	}

	public void setAdmission_date_str(String admission_date_str) {
		this.admission_date_str = admission_date_str;
	}

	public void unSetAdmission_date_str() {
		this.admission_date_str = null;
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

	public String getFees_master_id() {
		return fees_master_id;
	}

	public String getFees_master_idEx() {
		return fees_master_id != null ? fees_master_id : "";
	}

	public void setFees_master_id(String fees_master_id) {
		this.fees_master_id = fees_master_id;
	}

	public void unSetFees_master_id() {
		this.fees_master_id = null;
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

	public String getHouse_id() {
		return house_id;
	}

	public String getHouse_idEx() {
		return house_id != null ? house_id : "";
	}

	public void setHouse_id(String house_id) {
		this.house_id = house_id;
	}

	public void unSetHouse_id() {
		this.house_id = null;
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

	public String getBlood_group() {
		return blood_group;
	}

	public String getBlood_groupEx() {
		return blood_group != null ? blood_group : "";
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public void unSetBlood_group() {
		this.blood_group = null;
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

	public String getSyllabus_type() {
		return syllabus_type;
	}

	public String getSyllabus_typeEx() {
		return syllabus_type != null ? syllabus_type : "";
	}

	public void setSyllabus_type(String syllabus_type) {
		this.syllabus_type = syllabus_type;
	}

	public void unSetSyllabus_type() {
		this.syllabus_type = null;
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

	public String getCourse_id() {
		return course_id;
	}

	public String getCourse_idEx() {
		return course_id != null ? course_id : "";
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public void unSetCourse_id() {
		this.course_id = null;
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

	public String getFather_name() {
		return father_name;
	}

	public String getFather_nameEx() {
		return father_name != null ? father_name : "";
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public void unSetFather_name() {
		this.father_name = null;
	}

	public String getFather_email_id() {
		return father_email_id;
	}

	public String getFather_email_idEx() {
		return father_email_id != null ? father_email_id : "";
	}

	public void setFather_email_id(String father_email_id) {
		this.father_email_id = father_email_id;
	}

	public void unSetFather_email_id() {
		this.father_email_id = null;
	}

	public String getFather_mobile_no() {
		return father_mobile_no;
	}

	public String getFather_mobile_noEx() {
		return father_mobile_no != null ? father_mobile_no : "";
	}

	public void setFather_mobile_no(String father_mobile_no) {
		this.father_mobile_no = father_mobile_no;
	}

	public void unSetFather_mobile_no() {
		this.father_mobile_no = null;
	}

	public String getFather_home_phone_no() {
		return father_home_phone_no;
	}

	public String getFather_home_phone_noEx() {
		return father_home_phone_no != null ? father_home_phone_no : "";
	}

	public void setFather_home_phone_no(String father_home_phone_no) {
		this.father_home_phone_no = father_home_phone_no;
	}

	public void unSetFather_home_phone_no() {
		this.father_home_phone_no = null;
	}

	public String getFather_office_phone_no() {
		return father_office_phone_no;
	}

	public String getFather_office_phone_noEx() {
		return father_office_phone_no != null ? father_office_phone_no : "";
	}

	public void setFather_office_phone_no(String father_office_phone_no) {
		this.father_office_phone_no = father_office_phone_no;
	}

	public void unSetFather_office_phone_no() {
		this.father_office_phone_no = null;
	}

	public String getFather_dob() {
		return father_dob;
	}

	public String getFather_dobEx() {
		return father_dob != null ? father_dob : "";
	}

	public void setFather_dob(String father_dob) {
		this.father_dob = father_dob;
	}

	public void unSetFather_dob() {
		this.father_dob = null;
	}

	public String getFather_occupation() {
		return father_occupation;
	}

	public String getFather_occupationEx() {
		return father_occupation != null ? father_occupation : "";
	}

	public void setFather_occupation(String father_occupation) {
		this.father_occupation = father_occupation;
	}

	public void unSetFather_occupation() {
		this.father_occupation = null;
	}

	public String getFather_role() {
		return father_role;
	}

	public String getFather_roleEx() {
		return father_role != null ? father_role : "";
	}

	public void setFather_role(String father_role) {
		this.father_role = father_role;
	}

	public void unSetFather_role() {
		this.father_role = null;
	}

	public String getFather_company_name() {
		return father_company_name;
	}

	public String getFather_company_nameEx() {
		return father_company_name != null ? father_company_name : "";
	}

	public void setFather_company_name(String father_company_name) {
		this.father_company_name = father_company_name;
	}

	public void unSetFather_company_name() {
		this.father_company_name = null;
	}

	public String getFather_phone_type() {
		return father_phone_type;
	}

	public String getFather_phone_typeEx() {
		return father_phone_type != null ? father_phone_type : "";
	}

	public void setFather_phone_type(String father_phone_type) {
		this.father_phone_type = father_phone_type;
	}

	public void unSetFather_phone_type() {
		this.father_phone_type = null;
	}

	public String getMother_name() {
		return mother_name;
	}

	public String getMother_nameEx() {
		return mother_name != null ? mother_name : "";
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public void unSetMother_name() {
		this.mother_name = null;
	}

	public String getMother_dob() {
		return mother_dob;
	}

	public String getMother_dobEx() {
		return mother_dob != null ? mother_dob : "";
	}

	public void setMother_dob(String mother_dob) {
		this.mother_dob = mother_dob;
	}

	public void unSetMother_dob() {
		this.mother_dob = null;
	}

	public String getMother_mobile_no() {
		return mother_mobile_no;
	}

	public String getMother_mobile_noEx() {
		return mother_mobile_no != null ? mother_mobile_no : "";
	}

	public void setMother_mobile_no(String mother_mobile_no) {
		this.mother_mobile_no = mother_mobile_no;
	}

	public void unSetMother_mobile_no() {
		this.mother_mobile_no = null;
	}

	public String getMother_home_phone_no() {
		return mother_home_phone_no;
	}

	public String getMother_home_phone_noEx() {
		return mother_home_phone_no != null ? mother_home_phone_no : "";
	}

	public void setMother_home_phone_no(String mother_home_phone_no) {
		this.mother_home_phone_no = mother_home_phone_no;
	}

	public void unSetMother_home_phone_no() {
		this.mother_home_phone_no = null;
	}

	public String getMother_office_phone_no() {
		return mother_office_phone_no;
	}

	public String getMother_office_phone_noEx() {
		return mother_office_phone_no != null ? mother_office_phone_no : "";
	}

	public void setMother_office_phone_no(String mother_office_phone_no) {
		this.mother_office_phone_no = mother_office_phone_no;
	}

	public void unSetMother_office_phone_no() {
		this.mother_office_phone_no = null;
	}

	public String getMother_occupation() {
		return mother_occupation;
	}

	public String getMother_occupationEx() {
		return mother_occupation != null ? mother_occupation : "";
	}

	public void setMother_occupation(String mother_occupation) {
		this.mother_occupation = mother_occupation;
	}

	public void unSetMother_occupation() {
		this.mother_occupation = null;
	}

	public String getMother_role() {
		return mother_role;
	}

	public String getMother_roleEx() {
		return mother_role != null ? mother_role : "";
	}

	public void setMother_role(String mother_role) {
		this.mother_role = mother_role;
	}

	public void unSetMother_role() {
		this.mother_role = null;
	}

	public String getMother_company_name() {
		return mother_company_name;
	}

	public String getMother_company_nameEx() {
		return mother_company_name != null ? mother_company_name : "";
	}

	public void setMother_company_name(String mother_company_name) {
		this.mother_company_name = mother_company_name;
	}

	public void unSetMother_company_name() {
		this.mother_company_name = null;
	}

	public String getMother_email_id() {
		return mother_email_id;
	}

	public String getMother_email_idEx() {
		return mother_email_id != null ? mother_email_id : "";
	}

	public void setMother_email_id(String mother_email_id) {
		this.mother_email_id = mother_email_id;
	}

	public void unSetMother_email_id() {
		this.mother_email_id = null;
	}

	public String getMother_phone_type() {
		return mother_phone_type;
	}

	public String getMother_phone_typeEx() {
		return mother_phone_type != null ? mother_phone_type : "";
	}

	public void setMother_phone_type(String mother_phone_type) {
		this.mother_phone_type = mother_phone_type;
	}

	public void unSetMother_phone_type() {
		this.mother_phone_type = null;
	}

	public String getOther_name() {
		return other_name;
	}

	public String getOther_nameEx() {
		return other_name != null ? other_name : "";
	}

	public void setOther_name(String other_name) {
		this.other_name = other_name;
	}

	public void unSetOther_name() {
		this.other_name = null;
	}

	public String getOther_mobile_no() {
		return other_mobile_no;
	}

	public String getOther_mobile_noEx() {
		return other_mobile_no != null ? other_mobile_no : "";
	}

	public void setOther_mobile_no(String other_mobile_no) {
		this.other_mobile_no = other_mobile_no;
	}

	public void unSetOther_mobile_no() {
		this.other_mobile_no = null;
	}

	public String getOther_email_id() {
		return other_email_id;
	}

	public String getOther_email_idEx() {
		return other_email_id != null ? other_email_id : "";
	}

	public void setOther_email_id(String other_email_id) {
		this.other_email_id = other_email_id;
	}

	public void unSetOther_email_id() {
		this.other_email_id = null;
	}

	public String getOther_phone_type() {
		return other_phone_type;
	}

	public String getOther_phone_typeEx() {
		return other_phone_type != null ? other_phone_type : "";
	}

	public void setOther_phone_type(String other_phone_type) {
		this.other_phone_type = other_phone_type;
	}

	public void unSetOther_phone_type() {
		this.other_phone_type = null;
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

	public String getTransport() {
		return transport != null ? transport : "N";
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public void unSetTransport() {
		this.transport = "N";
	}

	public String getClass_section_name() {
		return class_section_name;
	}

	public String getClass_section_nameEx() {
		return class_section_name != null ? class_section_name : "";
	}

	public void setClass_section_name(String class_section_name) {
		this.class_section_name = class_section_name;
	}

	public void unSetClass_section_name() {
		this.class_section_name = null;
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

	public boolean validateCustomer_id(boolean add) throws ApplicationException {
		if(add && customer_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[customer_id]");
		return customer_id != null;
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

	public boolean validateUser_id(boolean add) throws ApplicationException {
		if(add && user_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[user_id]");
		return user_id != null;
	}

	public String getRemark() {
		return remark;
	}

	public String getRemarkEx() {
		return remark != null ? remark : "";
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void unSetRemark() {
		this.remark = null;
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

	public String getOverspeed_alert_sms() {
		return overspeed_alert_sms != null ? overspeed_alert_sms : "N";
	}

	public void setOverspeed_alert_sms(String overspeed_alert_sms) {
		this.overspeed_alert_sms = overspeed_alert_sms;
	}

	public void unSetOverspeed_alert_sms() {
		this.overspeed_alert_sms = "N";
	}

	public String getOverspeed_alert_mobile_app() {
		return overspeed_alert_mobile_app != null ? overspeed_alert_mobile_app : "Y";
	}

	public void setOverspeed_alert_mobile_app(String overspeed_alert_mobile_app) {
		this.overspeed_alert_mobile_app = overspeed_alert_mobile_app;
	}

	public void unSetOverspeed_alert_mobile_app() {
		this.overspeed_alert_mobile_app = "Y";
	}

	public String getOverspeed_alert_email() {
		return overspeed_alert_email != null ? overspeed_alert_email : "N";
	}

	public void setOverspeed_alert_email(String overspeed_alert_email) {
		this.overspeed_alert_email = overspeed_alert_email;
	}

	public void unSetOverspeed_alert_email() {
		this.overspeed_alert_email = "N";
	}

	public String getNeet_no() {
		return neet_no;
	}

	public String getNeet_noEx() {
		return neet_no != null ? neet_no : "";
	}

	public void setNeet_no(String neet_no) {
		this.neet_no = neet_no;
	}

	public void unSetNeet_no() {
		this.neet_no = null;
	}

	public String getCard_no() {
		return card_no;
	}

	public String getCard_noEx() {
		return card_no != null ? card_no : "";
	}

	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}

	public void unSetCard_no() {
		this.card_no = null;
	}

	public String getCard_swipe_pickup_pick() {
		return card_swipe_pickup_pick != null ? card_swipe_pickup_pick : "N";
	}

	public void setCard_swipe_pickup_pick(String card_swipe_pickup_pick) {
		this.card_swipe_pickup_pick = card_swipe_pickup_pick;
	}

	public void unSetCard_swipe_pickup_pick() {
		this.card_swipe_pickup_pick = "N";
	}

	public Long getCard_swipe_pickup_pick_time() {
		return card_swipe_pickup_pick_time;
	}

	public void setCard_swipe_pickup_pick_time(Long card_swipe_pickup_pick_time) {
		this.card_swipe_pickup_pick_time = card_swipe_pickup_pick_time;
	}


	public String getCard_swipe_pickup_drop() {
		return card_swipe_pickup_drop != null ? card_swipe_pickup_drop : "N";
	}

	public void setCard_swipe_pickup_drop(String card_swipe_pickup_drop) {
		this.card_swipe_pickup_drop = card_swipe_pickup_drop;
	}

	public void unSetCard_swipe_pickup_drop() {
		this.card_swipe_pickup_drop = "N";
	}

	public Long getCard_swipe_pickup_drop_time() {
		return card_swipe_pickup_drop_time;
	}

	public void setCard_swipe_pickup_drop_time(Long card_swipe_pickup_drop_time) {
		this.card_swipe_pickup_drop_time = card_swipe_pickup_drop_time;
	}


	public String getCard_swipe_drop_pick() {
		return card_swipe_drop_pick != null ? card_swipe_drop_pick : "N";
	}

	public void setCard_swipe_drop_pick(String card_swipe_drop_pick) {
		this.card_swipe_drop_pick = card_swipe_drop_pick;
	}

	public void unSetCard_swipe_drop_pick() {
		this.card_swipe_drop_pick = "N";
	}

	public Long getCard_swipe_drop_pick_time() {
		return card_swipe_drop_pick_time;
	}

	public void setCard_swipe_drop_pick_time(Long card_swipe_drop_pick_time) {
		this.card_swipe_drop_pick_time = card_swipe_drop_pick_time;
	}


	public String getCard_swipe_drop_drop() {
		return card_swipe_drop_drop != null ? card_swipe_drop_drop : "N";
	}

	public void setCard_swipe_drop_drop(String card_swipe_drop_drop) {
		this.card_swipe_drop_drop = card_swipe_drop_drop;
	}

	public void unSetCard_swipe_drop_drop() {
		this.card_swipe_drop_drop = "N";
	}

	public Long getCard_swipe_drop_drop_time() {
		return card_swipe_drop_drop_time;
	}

	public void setCard_swipe_drop_drop_time(Long card_swipe_drop_drop_time) {
		this.card_swipe_drop_drop_time = card_swipe_drop_drop_time;
	}


	public Integer getTotal_absent() {
		return total_absent != null ? total_absent : 0;
	}

	public void setTotal_absent(int total_absent) {
		this.total_absent = total_absent;
	}

	public void setTotal_absent(Integer total_absent) {
		this.total_absent = total_absent;
	}

	public void unSetTotal_absent() {
		this.total_absent = 0;
	}

	public Integer getTotal_present() {
		return total_present != null ? total_present : 0;
	}

	public void setTotal_present(int total_present) {
		this.total_present = total_present;
	}

	public void setTotal_present(Integer total_present) {
		this.total_present = total_present;
	}

	public void unSetTotal_present() {
		this.total_present = 0;
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

	public String getPrimary_contact() {
		return primary_contact != null ? primary_contact : "MOTHER";
	}

	public void setPrimary_contact(String primary_contact) {
		this.primary_contact = primary_contact;
	}

	public void unSetPrimary_contact() {
		this.primary_contact = "MOTHER";
	}

	public String getGender() {
		return gender;
	}

	public String getGenderEx() {
		return gender != null ? gender : "";
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void unSetGender() {
		this.gender = null;
	}

	public String getStudent_account() {
		return student_account != null ? student_account : "Y";
	}

	public void setStudent_account(String student_account) {
		this.student_account = student_account;
	}

	public void unSetStudent_account() {
		this.student_account = "Y";
	}

	public String getLeft() {
		return left != null ? left : "N";
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public void unSetLeft() {
		this.left = "N";
	}

	public String getLeft_date_str() {
		return left_date_str;
	}

	public String getLeft_date_strEx() {
		return left_date_str != null ? left_date_str : "";
	}

	public void setLeft_date_str(String left_date_str) {
		this.left_date_str = left_date_str;
	}

	public void unSetLeft_date_str() {
		this.left_date_str = null;
	}

	public String getLeft_reason() {
		return left_reason;
	}

	public String getLeft_reasonEx() {
		return left_reason != null ? left_reason : "";
	}

	public void setLeft_reason(String left_reason) {
		this.left_reason = left_reason;
	}

	public void unSetLeft_reason() {
		this.left_reason = null;
	}

	public String getStudent_email_id() {
		return student_email_id;
	}

	public String getStudent_email_idEx() {
		return student_email_id != null ? student_email_id : "";
	}

	public void setStudent_email_id(String student_email_id) {
		this.student_email_id = student_email_id;
	}

	public void unSetStudent_email_id() {
		this.student_email_id = null;
	}

	public String getStudent_mobile_no() {
		return student_mobile_no;
	}

	public String getStudent_mobile_noEx() {
		return student_mobile_no != null ? student_mobile_no : "";
	}

	public void setStudent_mobile_no(String student_mobile_no) {
		this.student_mobile_no = student_mobile_no;
	}

	public void unSetStudent_mobile_no() {
		this.student_mobile_no = null;
	}

	public String getClass_teacher_id() {
		return class_teacher_id;
	}

	public String getClass_teacher_idEx() {
		return class_teacher_id != null ? class_teacher_id : "";
	}

	public void setClass_teacher_id(String class_teacher_id) {
		this.class_teacher_id = class_teacher_id;
	}

	public void unSetClass_teacher_id() {
		this.class_teacher_id = null;
	}

	public String getClass_teacher_name() {
		return class_teacher_name;
	}

	public String getClass_teacher_nameEx() {
		return class_teacher_name != null ? class_teacher_name : "";
	}

	public void setClass_teacher_name(String class_teacher_name) {
		this.class_teacher_name = class_teacher_name;
	}

	public void unSetClass_teacher_name() {
		this.class_teacher_name = null;
	}

	public String getSecond_language() {
		return second_language;
	}

	public String getSecond_languageEx() {
		return second_language != null ? second_language : "";
	}

	public void setSecond_language(String second_language) {
		this.second_language = second_language;
	}

	public void unSetSecond_language() {
		this.second_language = null;
	}

	public String getThird_language() {
		return third_language;
	}

	public String getThird_languageEx() {
		return third_language != null ? third_language : "";
	}

	public void setThird_language(String third_language) {
		this.third_language = third_language;
	}

	public void unSetThird_language() {
		this.third_language = null;
	}

	public String getCard_not_working() {
		return card_not_working != null ? card_not_working : "N";
	}

	public void setCard_not_working(String card_not_working) {
		this.card_not_working = card_not_working;
	}

	public void unSetCard_not_working() {
		this.card_not_working = "N";
	}

	public String getCard_not_working_reason() {
		return card_not_working_reason;
	}

	public String getCard_not_working_reasonEx() {
		return card_not_working_reason != null ? card_not_working_reason : "";
	}

	public void setCard_not_working_reason(String card_not_working_reason) {
		this.card_not_working_reason = card_not_working_reason;
	}

	public void unSetCard_not_working_reason() {
		this.card_not_working_reason = null;
	}

	public String getCard_not_working_date_str() {
		return card_not_working_date_str;
	}

	public String getCard_not_working_date_strEx() {
		return card_not_working_date_str != null ? card_not_working_date_str : "";
	}

	public void setCard_not_working_date_str(String card_not_working_date_str) {
		this.card_not_working_date_str = card_not_working_date_str;
	}

	public void unSetCard_not_working_date_str() {
		this.card_not_working_date_str = null;
	}

	public String getFeature_bus_pickup_entry_sms() {
		return feature_bus_pickup_entry_sms != null ? feature_bus_pickup_entry_sms : "Y";
	}

	public void setFeature_bus_pickup_entry_sms(String feature_bus_pickup_entry_sms) {
		this.feature_bus_pickup_entry_sms = feature_bus_pickup_entry_sms;
	}

	public void unSetFeature_bus_pickup_entry_sms() {
		this.feature_bus_pickup_entry_sms = "Y";
	}

	public String getFeature_bus_pickup_exit_sms() {
		return feature_bus_pickup_exit_sms != null ? feature_bus_pickup_exit_sms : "Y";
	}

	public void setFeature_bus_pickup_exit_sms(String feature_bus_pickup_exit_sms) {
		this.feature_bus_pickup_exit_sms = feature_bus_pickup_exit_sms;
	}

	public void unSetFeature_bus_pickup_exit_sms() {
		this.feature_bus_pickup_exit_sms = "Y";
	}

	public String getFeature_bus_drop_entry_sms() {
		return feature_bus_drop_entry_sms != null ? feature_bus_drop_entry_sms : "Y";
	}

	public void setFeature_bus_drop_entry_sms(String feature_bus_drop_entry_sms) {
		this.feature_bus_drop_entry_sms = feature_bus_drop_entry_sms;
	}

	public void unSetFeature_bus_drop_entry_sms() {
		this.feature_bus_drop_entry_sms = "Y";
	}

	public String getFeature_bus_drop_exit_sms() {
		return feature_bus_drop_exit_sms != null ? feature_bus_drop_exit_sms : "Y";
	}

	public void setFeature_bus_drop_exit_sms(String feature_bus_drop_exit_sms) {
		this.feature_bus_drop_exit_sms = feature_bus_drop_exit_sms;
	}

	public void unSetFeature_bus_drop_exit_sms() {
		this.feature_bus_drop_exit_sms = "Y";
	}

	public String getFeature_school_entry_sms() {
		return feature_school_entry_sms != null ? feature_school_entry_sms : "Y";
	}

	public void setFeature_school_entry_sms(String feature_school_entry_sms) {
		this.feature_school_entry_sms = feature_school_entry_sms;
	}

	public void unSetFeature_school_entry_sms() {
		this.feature_school_entry_sms = "Y";
	}

	public String getFeature_school_exit_sms() {
		return feature_school_exit_sms != null ? feature_school_exit_sms : "Y";
	}

	public void setFeature_school_exit_sms(String feature_school_exit_sms) {
		this.feature_school_exit_sms = feature_school_exit_sms;
	}

	public void unSetFeature_school_exit_sms() {
		this.feature_school_exit_sms = "Y";
	}

	public String getApplication_processed() {
		return application_processed != null ? application_processed : "N";
	}

	public void setApplication_processed(String application_processed) {
		this.application_processed = application_processed;
	}

	public void unSetApplication_processed() {
		this.application_processed = "N";
	}

	public String getNotes_issued() {
		return notes_issued != null ? notes_issued : "Y";
	}

	public void setNotes_issued(String notes_issued) {
		this.notes_issued = notes_issued;
	}

	public void unSetNotes_issued() {
		this.notes_issued = "Y";
	}

	public String getNotes_issued_date_str() {
		return notes_issued_date_str;
	}

	public String getNotes_issued_date_strEx() {
		return notes_issued_date_str != null ? notes_issued_date_str : "";
	}

	public void setNotes_issued_date_str(String notes_issued_date_str) {
		this.notes_issued_date_str = notes_issued_date_str;
	}

	public void unSetNotes_issued_date_str() {
		this.notes_issued_date_str = null;
	}

	public Long getNotes_issued_date() {
		return notes_issued_date;
	}

	public long getNotes_issued_dateEx() {
		return notes_issued_date != null ? notes_issued_date : 0L;
	}

	public void setNotes_issued_date(long notes_issued_date) {
		this.notes_issued_date = notes_issued_date;
	}

	public void setNotes_issued_date(Long notes_issued_date) {
		this.notes_issued_date = notes_issued_date;
	}

	public void unSetNotes_issued_date() {
		this.notes_issued_date = null;
	}

	public String getNotes_issued_remark() {
		return notes_issued_remark;
	}

	public String getNotes_issued_remarkEx() {
		return notes_issued_remark != null ? notes_issued_remark : "";
	}

	public void setNotes_issued_remark(String notes_issued_remark) {
		this.notes_issued_remark = notes_issued_remark;
	}

	public void unSetNotes_issued_remark() {
		this.notes_issued_remark = null;
	}

	public Double getTotal_fees() {
		return total_fees;
	}

	public double getTotal_feesEx() {
		return total_fees != null ? total_fees : 0;
	}

	public void setTotal_fees(double total_fees) {
		this.total_fees = total_fees;
	}

	public void setTotal_fees(Double total_fees) {
		this.total_fees = total_fees;
	}

	public void unSetTotal_fees() {
		this.total_fees = null;
	}

	public Double getTotal_additional_charges() {
		return total_additional_charges;
	}

	public double getTotal_additional_chargesEx() {
		return total_additional_charges != null ? total_additional_charges : 0;
	}

	public void setTotal_additional_charges(double total_additional_charges) {
		this.total_additional_charges = total_additional_charges;
	}

	public void setTotal_additional_charges(Double total_additional_charges) {
		this.total_additional_charges = total_additional_charges;
	}

	public void unSetTotal_additional_charges() {
		this.total_additional_charges = null;
	}

	public Double getTotal_fees_paid() {
		return total_fees_paid;
	}

	public double getTotal_fees_paidEx() {
		return total_fees_paid != null ? total_fees_paid : 0;
	}

	public void setTotal_fees_paid(double total_fees_paid) {
		this.total_fees_paid = total_fees_paid;
	}

	public void setTotal_fees_paid(Double total_fees_paid) {
		this.total_fees_paid = total_fees_paid;
	}

	public void unSetTotal_fees_paid() {
		this.total_fees_paid = null;
	}

	public Double getDiscount() {
		return discount;
	}

	public double getDiscountEx() {
		return discount != null ? discount : 0;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public void unSetDiscount() {
		this.discount = null;
	}

	public Double getOpening_balance() {
		return opening_balance;
	}

	public double getOpening_balanceEx() {
		return opening_balance != null ? opening_balance : 0;
	}

	public void setOpening_balance(double opening_balance) {
		this.opening_balance = opening_balance;
	}

	public void setOpening_balance(Double opening_balance) {
		this.opening_balance = opening_balance;
	}

	public void unSetOpening_balance() {
		this.opening_balance = null;
	}

	public Double getTotal_debit() {
		return total_debit;
	}

	public double getTotal_debitEx() {
		return total_debit != null ? total_debit : 0;
	}

	public void setTotal_debit(double total_debit) {
		this.total_debit = total_debit;
	}

	public void setTotal_debit(Double total_debit) {
		this.total_debit = total_debit;
	}

	public void unSetTotal_debit() {
		this.total_debit = null;
	}

	public Double getTotal_credit() {
		return total_credit;
	}

	public double getTotal_creditEx() {
		return total_credit != null ? total_credit : 0;
	}

	public void setTotal_credit(double total_credit) {
		this.total_credit = total_credit;
	}

	public void setTotal_credit(Double total_credit) {
		this.total_credit = total_credit;
	}

	public void unSetTotal_credit() {
		this.total_credit = null;
	}

	public Double getClosing_balance() {
		return closing_balance;
	}

	public double getClosing_balanceEx() {
		return closing_balance != null ? closing_balance : 0;
	}

	public void setClosing_balance(double closing_balance) {
		this.closing_balance = closing_balance;
	}

	public void setClosing_balance(Double closing_balance) {
		this.closing_balance = closing_balance;
	}

	public void unSetClosing_balance() {
		this.closing_balance = null;
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