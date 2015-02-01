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
	private String name = null;
	private String short_name = null;
	private String address1 = null;
	private String address2 = null;
	private String address3 = null;
	private String city = null;
	private String state = null;
	private String country = null;
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
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ADMISSION_NO = "admission_no";
	public static String FIELD_ADMISSION_DATE_STR = "admission_date_str";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_NAME = "name";
	public static String FIELD_SHORT_NAME = "short_name";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_ADDRESS3 = "address3";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
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

		Field nameField = new Field("name", "String");
		nameField.setIndexed(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field short_nameField = new Field("short_name", "String");
		short_nameField.setIndexed(true);
		short_nameField.setLength(128);
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
		this.name = obj.name;
		this.short_name = obj.short_name;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.address3 = obj.address3;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
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
		name = (String) map.get("name");
		short_name = (String) map.get("short_name");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		address3 = (String) map.get("address3");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
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