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
public abstract class Basec4t_object extends BaseResource {
	private String id = null;
	private String name = null;
	private String first_name = null;
	private String last_name = null;
	private String description = null;
	private String short_name = null;
	private String password = null;
	private String school_id = null;
	private String blood_group = null;
	private String physically_challenged = null;
	private String caste = null;
	private String religion = null;
	private String nationality = null;
	private String mother_tongue = null;
	private String place_of_birth = null;
	private Integer family_size = null;
	private String use_hand = null;
	private String table_no = null;
	private String food_habit = null;
	private String dorm_bed_no = null;
	private String license_no = null;
	private String url = null;
	private String brand_id = null;
	private String brand_name = null;
	private String parent_id = null;
	private String community_id = null;
	private String community_name = null;
	private String search_suffix = null;
	private String community_type = null;
	private String customer_id = null;
	private String object_type = null;
	private String type = null;
	private String sub_type = null;
	private String gender = null;
	private String floor_no = null;
	private String email_id = null;
	private String mobile_no = null;
	private String server_id = null;
	private String deleted = null;
	private String synced = null;
	private String status = null;
	private String role = null;
	private String address = null;
	private String area = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String feature_show_sales_price = null;
	private String feature_show_mrp_price = null;
	private String feature_non_veg = null;
	private String feature_product_available = null;
	private String feature_active = null;
	private String feature_distributer_management = null;
	private String feature_dealer_management = null;
	private Integer no_of_flats = null;
	private String block_id = null;
	private String profession = null;
	private String company_name = null;
	private String company_id = null;
	private String domain = null;
	private String scheme_available = null;
	private String designation = null;
	private String resident = null;
	private String zip_code = null;
	private String last_scheme = null;
	private String feature_send_sms = null;
	private String feature_send_email = null;
	private String feature_printer = null;
	private String account_manager_name = null;
	private String account_manager_no = null;
	private String feature_sms_order = null;
	private String feature_send_account_manager_sms = null;
	private String feature_order_sms = null;
	private Double mrp_price = null;
	private Double service_tax = null;
	private Double service_charges = null;
	private Double service_charges_home_delivery = null;
	private Double service_charges_takeaway = null;
	private Double service_charges_on_table = null;
	private String delivery_time = null;
	private Double vat = null;
	private Double distribter_price = null;
	private String attribute_name = null;
	private String attribute_value = null;
	private Double dealer_price = null;
	private Double customer_price = null;
	private String unit = null;
	private String reference_id = null;
	private String reference_name = null;
	private String release = null;
	private String priority = null;
	private String user_id = null;
	private String verified = null;
	private String reference_name_1 = null;
	private String reference_name_2 = null;
	private String reference_relation_1 = null;
	private String reference_relation_2 = null;
	private String reference_no_1 = null;
	private String reference_no_2 = null;
	private String reporting_to_id = null;
	private String assign_to_id = null;
	private String assign_to_name = null;
	private String assign_date_str = null;
	private Long assign_date = null;
	private String completion_date_str = null;
	private Long completion_date = null;
	private String dob_str = null;
	private String primary_contact_id = null;
	private String flat_id = null;
	private String flat_no = null;
	private Long dob = null;
	private Integer notification_orders = null;
	private Integer notification_offers = null;
	private Integer notification_communication = null;
	private Long creation_time = null;
	private Long updation_time = null;
	private String owner_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_FIRST_NAME = "first_name";
	public static String FIELD_LAST_NAME = "last_name";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_SHORT_NAME = "short_name";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_BLOOD_GROUP = "blood_group";
	public static String FIELD_PHYSICALLY_CHALLENGED = "physically_challenged";
	public static String FIELD_CASTE = "caste";
	public static String FIELD_RELIGION = "religion";
	public static String FIELD_NATIONALITY = "nationality";
	public static String FIELD_MOTHER_TONGUE = "mother_tongue";
	public static String FIELD_PLACE_OF_BIRTH = "place_of_birth";
	public static String FIELD_FAMILY_SIZE = "family_size";
	public static String FIELD_USE_HAND = "use_hand";
	public static String FIELD_TABLE_NO = "table_no";
	public static String FIELD_FOOD_HABIT = "food_habit";
	public static String FIELD_DORM_BED_NO = "dorm_bed_no";
	public static String FIELD_LICENSE_NO = "license_no";
	public static String FIELD_URL = "url";
	public static String FIELD_BRAND_ID = "brand_id";
	public static String FIELD_BRAND_NAME = "brand_name";
	public static String FIELD_PARENT_ID = "parent_id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_COMMUNITY_NAME = "community_name";
	public static String FIELD_SEARCH_SUFFIX = "search_suffix";
	public static String FIELD_COMMUNITY_TYPE = "community_type";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_OBJECT_TYPE = "object_type";
	public static String FIELD_TYPE = "type";
	public static String FIELD_SUB_TYPE = "sub_type";
	public static String FIELD_GENDER = "gender";
	public static String FIELD_FLOOR_NO = "floor_no";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_SERVER_ID = "server_id";
	public static String FIELD_DELETED = "deleted";
	public static String FIELD_SYNCED = "synced";
	public static String FIELD_STATUS = "status";
	public static String FIELD_ROLE = "role";
	public static String FIELD_ADDRESS = "address";
	public static String FIELD_AREA = "area";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_FEATURE_SHOW_SALES_PRICE = "feature_show_sales_price";
	public static String FIELD_FEATURE_SHOW_MRP_PRICE = "feature_show_mrp_price";
	public static String FIELD_FEATURE_NON_VEG = "feature_non_veg";
	public static String FIELD_FEATURE_PRODUCT_AVAILABLE = "feature_product_available";
	public static String FIELD_FEATURE_ACTIVE = "feature_active";
	public static String FIELD_FEATURE_DISTRIBUTER_MANAGEMENT = "feature_distributer_management";
	public static String FIELD_FEATURE_DEALER_MANAGEMENT = "feature_dealer_management";
	public static String FIELD_NO_OF_FLATS = "no_of_flats";
	public static String FIELD_BLOCK_ID = "block_id";
	public static String FIELD_PROFESSION = "profession";
	public static String FIELD_COMPANY_NAME = "company_name";
	public static String FIELD_COMPANY_ID = "company_id";
	public static String FIELD_DOMAIN = "domain";
	public static String FIELD_SCHEME_AVAILABLE = "scheme_available";
	public static String FIELD_DESIGNATION = "designation";
	public static String FIELD_RESIDENT = "resident";
	public static String FIELD_ZIP_CODE = "zip_code";
	public static String FIELD_LAST_SCHEME = "last_scheme";
	public static String FIELD_FEATURE_SEND_SMS = "feature_send_sms";
	public static String FIELD_FEATURE_SEND_EMAIL = "feature_send_email";
	public static String FIELD_FEATURE_PRINTER = "feature_printer";
	public static String FIELD_ACCOUNT_MANAGER_NAME = "account_manager_name";
	public static String FIELD_ACCOUNT_MANAGER_NO = "account_manager_no";
	public static String FIELD_FEATURE_SMS_ORDER = "feature_sms_order";
	public static String FIELD_FEATURE_SEND_ACCOUNT_MANAGER_SMS = "feature_send_account_manager_sms";
	public static String FIELD_FEATURE_ORDER_SMS = "feature_order_sms";
	public static String FIELD_MRP_PRICE = "mrp_price";
	public static String FIELD_SERVICE_TAX = "service_tax";
	public static String FIELD_SERVICE_CHARGES = "service_charges";
	public static String FIELD_SERVICE_CHARGES_HOME_DELIVERY = "service_charges_home_delivery";
	public static String FIELD_SERVICE_CHARGES_TAKEAWAY = "service_charges_takeaway";
	public static String FIELD_SERVICE_CHARGES_ON_TABLE = "service_charges_on_table";
	public static String FIELD_DELIVERY_TIME = "delivery_time";
	public static String FIELD_VAT = "vat";
	public static String FIELD_DISTRIBTER_PRICE = "distribter_price";
	public static String FIELD_ATTRIBUTE_NAME = "attribute_name";
	public static String FIELD_ATTRIBUTE_VALUE = "attribute_value";
	public static String FIELD_DEALER_PRICE = "dealer_price";
	public static String FIELD_CUSTOMER_PRICE = "customer_price";
	public static String FIELD_UNIT = "unit";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_REFERENCE_NAME = "reference_name";
	public static String FIELD_RELEASE = "release";
	public static String FIELD_PRIORITY = "priority";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_VERIFIED = "verified";
	public static String FIELD_REFERENCE_NAME_1 = "reference_name_1";
	public static String FIELD_REFERENCE_NAME_2 = "reference_name_2";
	public static String FIELD_REFERENCE_RELATION_1 = "reference_relation_1";
	public static String FIELD_REFERENCE_RELATION_2 = "reference_relation_2";
	public static String FIELD_REFERENCE_NO_1 = "reference_no_1";
	public static String FIELD_REFERENCE_NO_2 = "reference_no_2";
	public static String FIELD_REPORTING_TO_ID = "reporting_to_id";
	public static String FIELD_ASSIGN_TO_ID = "assign_to_id";
	public static String FIELD_ASSIGN_TO_NAME = "assign_to_name";
	public static String FIELD_ASSIGN_DATE_STR = "assign_date_str";
	public static String FIELD_ASSIGN_DATE = "assign_date";
	public static String FIELD_COMPLETION_DATE_STR = "completion_date_str";
	public static String FIELD_COMPLETION_DATE = "completion_date";
	public static String FIELD_DOB_STR = "dob_str";
	public static String FIELD_PRIMARY_CONTACT_ID = "primary_contact_id";
	public static String FIELD_FLAT_ID = "flat_id";
	public static String FIELD_FLAT_NO = "flat_no";
	public static String FIELD_DOB = "dob";
	public static String FIELD_NOTIFICATION_ORDERS = "notification_orders";
	public static String FIELD_NOTIFICATION_OFFERS = "notification_offers";
	public static String FIELD_NOTIFICATION_COMMUNICATION = "notification_communication";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_UPDATION_TIME = "updation_time";
	public static String FIELD_OWNER_ID = "owner_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_object");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setIndexed(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field first_nameField = new Field("first_name", "String");
		first_nameField.setIndexed(true);
		first_nameField.setLength(128);
		metaData.addField(first_nameField);

		Field last_nameField = new Field("last_name", "String");
		last_nameField.setIndexed(true);
		last_nameField.setLength(128);
		metaData.addField(last_nameField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setIndexed(true);
		descriptionField.setLength(512);
		metaData.addField(descriptionField);

		Field short_nameField = new Field("short_name", "String");
		short_nameField.setLength(128);
		metaData.addField(short_nameField);

		Field passwordField = new Field("password", "String");
		passwordField.setLength(128);
		metaData.addField(passwordField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field blood_groupField = new Field("blood_group", "String");
		blood_groupField.setLength(128);
		metaData.addField(blood_groupField);

		Field physically_challengedField = new Field("physically_challenged", "String");
		physically_challengedField.setLength(128);
		metaData.addField(physically_challengedField);

		Field casteField = new Field("caste", "String");
		casteField.setLength(128);
		metaData.addField(casteField);

		Field religionField = new Field("religion", "String");
		religionField.setLength(128);
		metaData.addField(religionField);

		Field nationalityField = new Field("nationality", "String");
		nationalityField.setLength(128);
		metaData.addField(nationalityField);

		Field mother_tongueField = new Field("mother_tongue", "String");
		mother_tongueField.setLength(128);
		metaData.addField(mother_tongueField);

		Field place_of_birthField = new Field("place_of_birth", "String");
		place_of_birthField.setLength(128);
		metaData.addField(place_of_birthField);

		Field family_sizeField = new Field("family_size", "int");
		metaData.addField(family_sizeField);

		Field use_handField = new Field("use_hand", "String");
		use_handField.setLength(128);
		metaData.addField(use_handField);

		Field table_noField = new Field("table_no", "String");
		table_noField.setLength(128);
		metaData.addField(table_noField);

		Field food_habitField = new Field("food_habit", "String");
		food_habitField.setLength(128);
		metaData.addField(food_habitField);

		Field dorm_bed_noField = new Field("dorm_bed_no", "String");
		dorm_bed_noField.setLength(128);
		metaData.addField(dorm_bed_noField);

		Field license_noField = new Field("license_no", "String");
		license_noField.setLength(128);
		metaData.addField(license_noField);

		Field urlField = new Field("url", "String");
		urlField.setLength(128);
		metaData.addField(urlField);

		Field brand_idField = new Field("brand_id", "String");
		brand_idField.setLength(128);
		metaData.addField(brand_idField);

		Field brand_nameField = new Field("brand_name", "String");
		brand_nameField.setLength(128);
		metaData.addField(brand_nameField);

		Field parent_idField = new Field("parent_id", "String");
		parent_idField.setIndexed(true);
		parent_idField.setLength(128);
		metaData.addField(parent_idField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setIndexed(true);
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field community_nameField = new Field("community_name", "String");
		community_nameField.setIndexed(true);
		community_nameField.setLength(128);
		metaData.addField(community_nameField);

		Field search_suffixField = new Field("search_suffix", "String");
		search_suffixField.setIndexed(true);
		search_suffixField.setLength(128);
		metaData.addField(search_suffixField);

		Field community_typeField = new Field("community_type", "String");
		community_typeField.setLength(128);
		metaData.addField(community_typeField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field object_typeField = new Field("object_type", "String");
		object_typeField.setIndexed(true);
		object_typeField.setLength(128);
		metaData.addField(object_typeField);

		Field typeField = new Field("type", "String");
		typeField.setLength(128);
		metaData.addField(typeField);

		Field sub_typeField = new Field("sub_type", "String");
		sub_typeField.setLength(128);
		metaData.addField(sub_typeField);

		Field genderField = new Field("gender", "String");
		genderField.setLength(10);
		metaData.addField(genderField);

		Field floor_noField = new Field("floor_no", "String");
		floor_noField.setLength(128);
		metaData.addField(floor_noField);

		Field email_idField = new Field("email_id", "String");
		email_idField.setLength(128);
		metaData.addField(email_idField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(128);
		metaData.addField(mobile_noField);

		Field server_idField = new Field("server_id", "String");
		server_idField.setLength(128);
		metaData.addField(server_idField);

		Field deletedField = new Field("deleted", "String");
		deletedField.setLength(1);
		metaData.addField(deletedField);

		Field syncedField = new Field("synced", "String");
		syncedField.setLength(1);
		metaData.addField(syncedField);

		Field statusField = new Field("status", "String");
		statusField.setLength(128);
		metaData.addField(statusField);

		Field roleField = new Field("role", "String");
		roleField.setLength(128);
		metaData.addField(roleField);

		Field addressField = new Field("address", "String");
		addressField.setLength(128);
		metaData.addField(addressField);

		Field areaField = new Field("area", "String");
		areaField.setLength(128);
		metaData.addField(areaField);

		Field cityField = new Field("city", "String");
		cityField.setLength(128);
		metaData.addField(cityField);

		Field stateField = new Field("state", "String");
		stateField.setLength(128);
		metaData.addField(stateField);

		Field countryField = new Field("country", "String");
		countryField.setLength(128);
		metaData.addField(countryField);

		Field feature_show_sales_priceField = new Field("feature_show_sales_price", "String");
		feature_show_sales_priceField.setLength(1);
		metaData.addField(feature_show_sales_priceField);

		Field feature_show_mrp_priceField = new Field("feature_show_mrp_price", "String");
		feature_show_mrp_priceField.setLength(1);
		metaData.addField(feature_show_mrp_priceField);

		Field feature_non_vegField = new Field("feature_non_veg", "String");
		feature_non_vegField.setLength(1);
		metaData.addField(feature_non_vegField);

		Field feature_product_availableField = new Field("feature_product_available", "String");
		feature_product_availableField.setLength(1);
		metaData.addField(feature_product_availableField);

		Field feature_activeField = new Field("feature_active", "String");
		feature_activeField.setLength(1);
		metaData.addField(feature_activeField);

		Field feature_distributer_managementField = new Field("feature_distributer_management", "String");
		feature_distributer_managementField.setLength(1);
		metaData.addField(feature_distributer_managementField);

		Field feature_dealer_managementField = new Field("feature_dealer_management", "String");
		feature_dealer_managementField.setLength(1);
		metaData.addField(feature_dealer_managementField);

		Field no_of_flatsField = new Field("no_of_flats", "int");
		metaData.addField(no_of_flatsField);

		Field block_idField = new Field("block_id", "String");
		block_idField.setLength(80);
		metaData.addField(block_idField);

		Field professionField = new Field("profession", "String");
		professionField.setLength(80);
		metaData.addField(professionField);

		Field company_nameField = new Field("company_name", "String");
		company_nameField.setLength(128);
		metaData.addField(company_nameField);

		Field company_idField = new Field("company_id", "String");
		company_idField.setLength(128);
		metaData.addField(company_idField);

		Field domainField = new Field("domain", "String");
		domainField.setLength(128);
		metaData.addField(domainField);

		Field scheme_availableField = new Field("scheme_available", "String");
		scheme_availableField.setLength(1);
		metaData.addField(scheme_availableField);

		Field designationField = new Field("designation", "String");
		designationField.setLength(128);
		metaData.addField(designationField);

		Field residentField = new Field("resident", "String");
		residentField.setLength(1);
		metaData.addField(residentField);

		Field zip_codeField = new Field("zip_code", "String");
		zip_codeField.setLength(128);
		metaData.addField(zip_codeField);

		Field last_schemeField = new Field("last_scheme", "String");
		last_schemeField.setLength(128);
		metaData.addField(last_schemeField);

		Field feature_send_smsField = new Field("feature_send_sms", "String");
		feature_send_smsField.setLength(1);
		metaData.addField(feature_send_smsField);

		Field feature_send_emailField = new Field("feature_send_email", "String");
		feature_send_emailField.setLength(1);
		metaData.addField(feature_send_emailField);

		Field feature_printerField = new Field("feature_printer", "String");
		feature_printerField.setLength(1);
		metaData.addField(feature_printerField);

		Field account_manager_nameField = new Field("account_manager_name", "String");
		account_manager_nameField.setLength(128);
		metaData.addField(account_manager_nameField);

		Field account_manager_noField = new Field("account_manager_no", "String");
		account_manager_noField.setLength(128);
		metaData.addField(account_manager_noField);

		Field feature_sms_orderField = new Field("feature_sms_order", "String");
		feature_sms_orderField.setLength(1);
		metaData.addField(feature_sms_orderField);

		Field feature_send_account_manager_smsField = new Field("feature_send_account_manager_sms", "String");
		feature_send_account_manager_smsField.setLength(1);
		metaData.addField(feature_send_account_manager_smsField);

		Field feature_order_smsField = new Field("feature_order_sms", "String");
		feature_order_smsField.setLength(1);
		metaData.addField(feature_order_smsField);

		Field mrp_priceField = new Field("mrp_price", "double");
		metaData.addField(mrp_priceField);

		Field service_taxField = new Field("service_tax", "double");
		metaData.addField(service_taxField);

		Field service_chargesField = new Field("service_charges", "double");
		metaData.addField(service_chargesField);

		Field service_charges_home_deliveryField = new Field("service_charges_home_delivery", "double");
		metaData.addField(service_charges_home_deliveryField);

		Field service_charges_takeawayField = new Field("service_charges_takeaway", "double");
		metaData.addField(service_charges_takeawayField);

		Field service_charges_on_tableField = new Field("service_charges_on_table", "double");
		metaData.addField(service_charges_on_tableField);

		Field delivery_timeField = new Field("delivery_time", "String");
		delivery_timeField.setLength(32);
		metaData.addField(delivery_timeField);

		Field vatField = new Field("vat", "double");
		metaData.addField(vatField);

		Field distribter_priceField = new Field("distribter_price", "double");
		metaData.addField(distribter_priceField);

		Field attribute_nameField = new Field("attribute_name", "String");
		attribute_nameField.setLength(128);
		metaData.addField(attribute_nameField);

		Field attribute_valueField = new Field("attribute_value", "String");
		attribute_valueField.setLength(128);
		metaData.addField(attribute_valueField);

		Field dealer_priceField = new Field("dealer_price", "double");
		metaData.addField(dealer_priceField);

		Field customer_priceField = new Field("customer_price", "double");
		metaData.addField(customer_priceField);

		Field unitField = new Field("unit", "String");
		unitField.setLength(32);
		metaData.addField(unitField);

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(128);
		metaData.addField(reference_idField);

		Field reference_nameField = new Field("reference_name", "String");
		reference_nameField.setLength(128);
		metaData.addField(reference_nameField);

		Field releaseField = new Field("release", "String");
		releaseField.setLength(128);
		metaData.addField(releaseField);

		Field priorityField = new Field("priority", "String");
		priorityField.setLength(128);
		metaData.addField(priorityField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field verifiedField = new Field("verified", "String");
		verifiedField.setLength(1);
		metaData.addField(verifiedField);

		Field reference_name_1Field = new Field("reference_name_1", "String");
		reference_name_1Field.setLength(128);
		metaData.addField(reference_name_1Field);

		Field reference_name_2Field = new Field("reference_name_2", "String");
		reference_name_2Field.setLength(128);
		metaData.addField(reference_name_2Field);

		Field reference_relation_1Field = new Field("reference_relation_1", "String");
		reference_relation_1Field.setLength(128);
		metaData.addField(reference_relation_1Field);

		Field reference_relation_2Field = new Field("reference_relation_2", "String");
		reference_relation_2Field.setLength(128);
		metaData.addField(reference_relation_2Field);

		Field reference_no_1Field = new Field("reference_no_1", "String");
		reference_no_1Field.setLength(128);
		metaData.addField(reference_no_1Field);

		Field reference_no_2Field = new Field("reference_no_2", "String");
		reference_no_2Field.setLength(128);
		metaData.addField(reference_no_2Field);

		Field reporting_to_idField = new Field("reporting_to_id", "String");
		reporting_to_idField.setLength(128);
		metaData.addField(reporting_to_idField);

		Field assign_to_idField = new Field("assign_to_id", "String");
		assign_to_idField.setLength(128);
		metaData.addField(assign_to_idField);

		Field assign_to_nameField = new Field("assign_to_name", "String");
		assign_to_nameField.setLength(128);
		metaData.addField(assign_to_nameField);

		Field assign_date_strField = new Field("assign_date_str", "String");
		assign_date_strField.setLength(16);
		metaData.addField(assign_date_strField);

		Field assign_dateField = new Field("assign_date", "long");
		metaData.addField(assign_dateField);

		Field completion_date_strField = new Field("completion_date_str", "String");
		completion_date_strField.setLength(16);
		metaData.addField(completion_date_strField);

		Field completion_dateField = new Field("completion_date", "long");
		metaData.addField(completion_dateField);

		Field dob_strField = new Field("dob_str", "String");
		dob_strField.setLength(16);
		metaData.addField(dob_strField);

		Field primary_contact_idField = new Field("primary_contact_id", "String");
		primary_contact_idField.setLength(128);
		metaData.addField(primary_contact_idField);

		Field flat_idField = new Field("flat_id", "String");
		flat_idField.setLength(128);
		metaData.addField(flat_idField);

		Field flat_noField = new Field("flat_no", "String");
		flat_noField.setLength(64);
		metaData.addField(flat_noField);

		Field dobField = new Field("dob", "long");
		metaData.addField(dobField);

		Field notification_ordersField = new Field("notification_orders", "int");
		metaData.addField(notification_ordersField);

		Field notification_offersField = new Field("notification_offers", "int");
		metaData.addField(notification_offersField);

		Field notification_communicationField = new Field("notification_communication", "int");
		metaData.addField(notification_communicationField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field updation_timeField = new Field("updation_time", "timestamp");
		metaData.addField(updation_timeField);

		Field owner_idField = new Field("owner_id", "String");
		owner_idField.setLength(128);
		metaData.addField(owner_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_object");

		metaData.setCluster("DB_OBJECT");
	}

	public Basec4t_object() {}

	public Basec4t_object(Basec4t_object obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.first_name = obj.first_name;
		this.last_name = obj.last_name;
		this.description = obj.description;
		this.short_name = obj.short_name;
		this.password = obj.password;
		this.school_id = obj.school_id;
		this.blood_group = obj.blood_group;
		this.physically_challenged = obj.physically_challenged;
		this.caste = obj.caste;
		this.religion = obj.religion;
		this.nationality = obj.nationality;
		this.mother_tongue = obj.mother_tongue;
		this.place_of_birth = obj.place_of_birth;
		this.family_size = obj.family_size;
		this.use_hand = obj.use_hand;
		this.table_no = obj.table_no;
		this.food_habit = obj.food_habit;
		this.dorm_bed_no = obj.dorm_bed_no;
		this.license_no = obj.license_no;
		this.url = obj.url;
		this.brand_id = obj.brand_id;
		this.brand_name = obj.brand_name;
		this.parent_id = obj.parent_id;
		this.community_id = obj.community_id;
		this.community_name = obj.community_name;
		this.search_suffix = obj.search_suffix;
		this.community_type = obj.community_type;
		this.customer_id = obj.customer_id;
		this.object_type = obj.object_type;
		this.type = obj.type;
		this.sub_type = obj.sub_type;
		this.gender = obj.gender;
		this.floor_no = obj.floor_no;
		this.email_id = obj.email_id;
		this.mobile_no = obj.mobile_no;
		this.server_id = obj.server_id;
		this.deleted = obj.deleted;
		this.synced = obj.synced;
		this.status = obj.status;
		this.role = obj.role;
		this.address = obj.address;
		this.area = obj.area;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.feature_show_sales_price = obj.feature_show_sales_price;
		this.feature_show_mrp_price = obj.feature_show_mrp_price;
		this.feature_non_veg = obj.feature_non_veg;
		this.feature_product_available = obj.feature_product_available;
		this.feature_active = obj.feature_active;
		this.feature_distributer_management = obj.feature_distributer_management;
		this.feature_dealer_management = obj.feature_dealer_management;
		this.no_of_flats = obj.no_of_flats;
		this.block_id = obj.block_id;
		this.profession = obj.profession;
		this.company_name = obj.company_name;
		this.company_id = obj.company_id;
		this.domain = obj.domain;
		this.scheme_available = obj.scheme_available;
		this.designation = obj.designation;
		this.resident = obj.resident;
		this.zip_code = obj.zip_code;
		this.last_scheme = obj.last_scheme;
		this.feature_send_sms = obj.feature_send_sms;
		this.feature_send_email = obj.feature_send_email;
		this.feature_printer = obj.feature_printer;
		this.account_manager_name = obj.account_manager_name;
		this.account_manager_no = obj.account_manager_no;
		this.feature_sms_order = obj.feature_sms_order;
		this.feature_send_account_manager_sms = obj.feature_send_account_manager_sms;
		this.feature_order_sms = obj.feature_order_sms;
		this.mrp_price = obj.mrp_price;
		this.service_tax = obj.service_tax;
		this.service_charges = obj.service_charges;
		this.service_charges_home_delivery = obj.service_charges_home_delivery;
		this.service_charges_takeaway = obj.service_charges_takeaway;
		this.service_charges_on_table = obj.service_charges_on_table;
		this.delivery_time = obj.delivery_time;
		this.vat = obj.vat;
		this.distribter_price = obj.distribter_price;
		this.attribute_name = obj.attribute_name;
		this.attribute_value = obj.attribute_value;
		this.dealer_price = obj.dealer_price;
		this.customer_price = obj.customer_price;
		this.unit = obj.unit;
		this.reference_id = obj.reference_id;
		this.reference_name = obj.reference_name;
		this.release = obj.release;
		this.priority = obj.priority;
		this.user_id = obj.user_id;
		this.verified = obj.verified;
		this.reference_name_1 = obj.reference_name_1;
		this.reference_name_2 = obj.reference_name_2;
		this.reference_relation_1 = obj.reference_relation_1;
		this.reference_relation_2 = obj.reference_relation_2;
		this.reference_no_1 = obj.reference_no_1;
		this.reference_no_2 = obj.reference_no_2;
		this.reporting_to_id = obj.reporting_to_id;
		this.assign_to_id = obj.assign_to_id;
		this.assign_to_name = obj.assign_to_name;
		this.assign_date_str = obj.assign_date_str;
		this.assign_date = obj.assign_date;
		this.completion_date_str = obj.completion_date_str;
		this.completion_date = obj.completion_date;
		this.dob_str = obj.dob_str;
		this.primary_contact_id = obj.primary_contact_id;
		this.flat_id = obj.flat_id;
		this.flat_no = obj.flat_no;
		this.dob = obj.dob;
		this.notification_orders = obj.notification_orders;
		this.notification_offers = obj.notification_offers;
		this.notification_communication = obj.notification_communication;
		this.creation_time = obj.creation_time;
		this.updation_time = obj.updation_time;
		this.owner_id = obj.owner_id;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(first_name != null)
			map.put("first_name", first_name);
		if(last_name != null)
			map.put("last_name", last_name);
		if(description != null)
			map.put("description", description);
		if(short_name != null)
			map.put("short_name", short_name);
		if(password != null)
			map.put("password", password);
		if(school_id != null)
			map.put("school_id", school_id);
		if(blood_group != null)
			map.put("blood_group", blood_group);
		if(physically_challenged != null)
			map.put("physically_challenged", physically_challenged);
		if(caste != null)
			map.put("caste", caste);
		if(religion != null)
			map.put("religion", religion);
		if(nationality != null)
			map.put("nationality", nationality);
		if(mother_tongue != null)
			map.put("mother_tongue", mother_tongue);
		if(place_of_birth != null)
			map.put("place_of_birth", place_of_birth);
		if(family_size != null)
			map.put("family_size", family_size);
		if(use_hand != null)
			map.put("use_hand", use_hand);
		if(table_no != null)
			map.put("table_no", table_no);
		if(food_habit != null)
			map.put("food_habit", food_habit);
		if(dorm_bed_no != null)
			map.put("dorm_bed_no", dorm_bed_no);
		if(license_no != null)
			map.put("license_no", license_no);
		if(url != null)
			map.put("url", url);
		if(brand_id != null)
			map.put("brand_id", brand_id);
		if(brand_name != null)
			map.put("brand_name", brand_name);
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
		if(search_suffix != null)
			map.put("search_suffix", search_suffix);
		if(community_type != null)
			map.put("community_type", community_type);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(object_type != null)
			map.put("object_type", object_type);
		if(type != null)
			map.put("type", type);
		if(sub_type != null)
			map.put("sub_type", sub_type);
		if(gender != null)
			map.put("gender", gender);
		if(floor_no != null)
			map.put("floor_no", floor_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(server_id != null)
			map.put("server_id", server_id);
		if(deleted != null)
			map.put("deleted", deleted);
		if(synced != null)
			map.put("synced", synced);
		if(status != null)
			map.put("status", status);
		if(role != null)
			map.put("role", role);
		if(address != null)
			map.put("address", address);
		if(area != null)
			map.put("area", area);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(feature_show_sales_price != null)
			map.put("feature_show_sales_price", feature_show_sales_price);
		if(feature_show_mrp_price != null)
			map.put("feature_show_mrp_price", feature_show_mrp_price);
		if(feature_non_veg != null)
			map.put("feature_non_veg", feature_non_veg);
		if(feature_product_available != null)
			map.put("feature_product_available", feature_product_available);
		if(feature_active != null)
			map.put("feature_active", feature_active);
		if(feature_distributer_management != null)
			map.put("feature_distributer_management", feature_distributer_management);
		if(feature_dealer_management != null)
			map.put("feature_dealer_management", feature_dealer_management);
		if(no_of_flats != null)
			map.put("no_of_flats", no_of_flats);
		if(block_id != null)
			map.put("block_id", block_id);
		if(profession != null)
			map.put("profession", profession);
		if(company_name != null)
			map.put("company_name", company_name);
		if(company_id != null)
			map.put("company_id", company_id);
		if(domain != null)
			map.put("domain", domain);
		if(scheme_available != null)
			map.put("scheme_available", scheme_available);
		if(designation != null)
			map.put("designation", designation);
		if(resident != null)
			map.put("resident", resident);
		if(zip_code != null)
			map.put("zip_code", zip_code);
		if(last_scheme != null)
			map.put("last_scheme", last_scheme);
		if(feature_send_sms != null)
			map.put("feature_send_sms", feature_send_sms);
		if(feature_send_email != null)
			map.put("feature_send_email", feature_send_email);
		if(feature_printer != null)
			map.put("feature_printer", feature_printer);
		if(account_manager_name != null)
			map.put("account_manager_name", account_manager_name);
		if(account_manager_no != null)
			map.put("account_manager_no", account_manager_no);
		if(feature_sms_order != null)
			map.put("feature_sms_order", feature_sms_order);
		if(feature_send_account_manager_sms != null)
			map.put("feature_send_account_manager_sms", feature_send_account_manager_sms);
		if(feature_order_sms != null)
			map.put("feature_order_sms", feature_order_sms);
		if(mrp_price != null)
			map.put("mrp_price", mrp_price);
		if(service_tax != null)
			map.put("service_tax", service_tax);
		if(service_charges != null)
			map.put("service_charges", service_charges);
		if(service_charges_home_delivery != null)
			map.put("service_charges_home_delivery", service_charges_home_delivery);
		if(service_charges_takeaway != null)
			map.put("service_charges_takeaway", service_charges_takeaway);
		if(service_charges_on_table != null)
			map.put("service_charges_on_table", service_charges_on_table);
		if(delivery_time != null)
			map.put("delivery_time", delivery_time);
		if(vat != null)
			map.put("vat", vat);
		if(distribter_price != null)
			map.put("distribter_price", distribter_price);
		if(attribute_name != null)
			map.put("attribute_name", attribute_name);
		if(attribute_value != null)
			map.put("attribute_value", attribute_value);
		if(dealer_price != null)
			map.put("dealer_price", dealer_price);
		if(customer_price != null)
			map.put("customer_price", customer_price);
		if(unit != null)
			map.put("unit", unit);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_name != null)
			map.put("reference_name", reference_name);
		if(release != null)
			map.put("release", release);
		if(priority != null)
			map.put("priority", priority);
		if(user_id != null)
			map.put("user_id", user_id);
		if(verified != null)
			map.put("verified", verified);
		if(reference_name_1 != null)
			map.put("reference_name_1", reference_name_1);
		if(reference_name_2 != null)
			map.put("reference_name_2", reference_name_2);
		if(reference_relation_1 != null)
			map.put("reference_relation_1", reference_relation_1);
		if(reference_relation_2 != null)
			map.put("reference_relation_2", reference_relation_2);
		if(reference_no_1 != null)
			map.put("reference_no_1", reference_no_1);
		if(reference_no_2 != null)
			map.put("reference_no_2", reference_no_2);
		if(reporting_to_id != null)
			map.put("reporting_to_id", reporting_to_id);
		if(assign_to_id != null)
			map.put("assign_to_id", assign_to_id);
		if(assign_to_name != null)
			map.put("assign_to_name", assign_to_name);
		if(assign_date_str != null)
			map.put("assign_date_str", assign_date_str);
		if(assign_date != null)
			map.put("assign_date", assign_date);
		if(completion_date_str != null)
			map.put("completion_date_str", completion_date_str);
		if(completion_date != null)
			map.put("completion_date", completion_date);
		if(dob_str != null)
			map.put("dob_str", dob_str);
		if(primary_contact_id != null)
			map.put("primary_contact_id", primary_contact_id);
		if(flat_id != null)
			map.put("flat_id", flat_id);
		if(flat_no != null)
			map.put("flat_no", flat_no);
		if(dob != null)
			map.put("dob", dob);
		if(notification_orders != null)
			map.put("notification_orders", notification_orders);
		if(notification_offers != null)
			map.put("notification_offers", notification_offers);
		if(notification_communication != null)
			map.put("notification_communication", notification_communication);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(updation_time != null)
			map.put("updation_time", updation_time);
		if(owner_id != null)
			map.put("owner_id", owner_id);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(first_name != null)
			map.put("first_name", first_name);
		if(last_name != null)
			map.put("last_name", last_name);
		if(description != null)
			map.put("description", description);
		if(short_name != null)
			map.put("short_name", short_name);
		if(password != null)
			map.put("password", password);
		if(school_id != null)
			map.put("school_id", school_id);
		if(blood_group != null)
			map.put("blood_group", blood_group);
		if(physically_challenged != null)
			map.put("physically_challenged", physically_challenged);
		if(caste != null)
			map.put("caste", caste);
		if(religion != null)
			map.put("religion", religion);
		if(nationality != null)
			map.put("nationality", nationality);
		if(mother_tongue != null)
			map.put("mother_tongue", mother_tongue);
		if(place_of_birth != null)
			map.put("place_of_birth", place_of_birth);
		if(family_size != null)
			map.put("family_size", family_size);
		if(use_hand != null)
			map.put("use_hand", use_hand);
		if(table_no != null)
			map.put("table_no", table_no);
		if(food_habit != null)
			map.put("food_habit", food_habit);
		if(dorm_bed_no != null)
			map.put("dorm_bed_no", dorm_bed_no);
		if(license_no != null)
			map.put("license_no", license_no);
		if(url != null)
			map.put("url", url);
		if(brand_id != null)
			map.put("brand_id", brand_id);
		if(brand_name != null)
			map.put("brand_name", brand_name);
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
		if(search_suffix != null)
			map.put("search_suffix", search_suffix);
		if(community_type != null)
			map.put("community_type", community_type);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(object_type != null)
			map.put("object_type", object_type);
		if(type != null)
			map.put("type", type);
		if(sub_type != null)
			map.put("sub_type", sub_type);
		if(gender != null)
			map.put("gender", gender);
		if(floor_no != null)
			map.put("floor_no", floor_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(server_id != null)
			map.put("server_id", server_id);
		if(deleted != null)
			map.put("deleted", deleted);
		if(synced != null)
			map.put("synced", synced);
		if(status != null)
			map.put("status", status);
		if(role != null)
			map.put("role", role);
		if(address != null)
			map.put("address", address);
		if(area != null)
			map.put("area", area);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(feature_show_sales_price != null)
			map.put("feature_show_sales_price", feature_show_sales_price);
		if(feature_show_mrp_price != null)
			map.put("feature_show_mrp_price", feature_show_mrp_price);
		if(feature_non_veg != null)
			map.put("feature_non_veg", feature_non_veg);
		if(feature_product_available != null)
			map.put("feature_product_available", feature_product_available);
		if(feature_active != null)
			map.put("feature_active", feature_active);
		if(feature_distributer_management != null)
			map.put("feature_distributer_management", feature_distributer_management);
		if(feature_dealer_management != null)
			map.put("feature_dealer_management", feature_dealer_management);
		if(no_of_flats != null)
			map.put("no_of_flats", no_of_flats);
		if(block_id != null)
			map.put("block_id", block_id);
		if(profession != null)
			map.put("profession", profession);
		if(company_name != null)
			map.put("company_name", company_name);
		if(company_id != null)
			map.put("company_id", company_id);
		if(domain != null)
			map.put("domain", domain);
		if(scheme_available != null)
			map.put("scheme_available", scheme_available);
		if(designation != null)
			map.put("designation", designation);
		if(resident != null)
			map.put("resident", resident);
		if(zip_code != null)
			map.put("zip_code", zip_code);
		if(last_scheme != null)
			map.put("last_scheme", last_scheme);
		if(feature_send_sms != null)
			map.put("feature_send_sms", feature_send_sms);
		if(feature_send_email != null)
			map.put("feature_send_email", feature_send_email);
		if(feature_printer != null)
			map.put("feature_printer", feature_printer);
		if(account_manager_name != null)
			map.put("account_manager_name", account_manager_name);
		if(account_manager_no != null)
			map.put("account_manager_no", account_manager_no);
		if(feature_sms_order != null)
			map.put("feature_sms_order", feature_sms_order);
		if(feature_send_account_manager_sms != null)
			map.put("feature_send_account_manager_sms", feature_send_account_manager_sms);
		if(feature_order_sms != null)
			map.put("feature_order_sms", feature_order_sms);
		if(mrp_price != null)
			map.put("mrp_price", mrp_price);
		if(service_tax != null)
			map.put("service_tax", service_tax);
		if(service_charges != null)
			map.put("service_charges", service_charges);
		if(service_charges_home_delivery != null)
			map.put("service_charges_home_delivery", service_charges_home_delivery);
		if(service_charges_takeaway != null)
			map.put("service_charges_takeaway", service_charges_takeaway);
		if(service_charges_on_table != null)
			map.put("service_charges_on_table", service_charges_on_table);
		if(delivery_time != null)
			map.put("delivery_time", delivery_time);
		if(vat != null)
			map.put("vat", vat);
		if(distribter_price != null)
			map.put("distribter_price", distribter_price);
		if(attribute_name != null)
			map.put("attribute_name", attribute_name);
		if(attribute_value != null)
			map.put("attribute_value", attribute_value);
		if(dealer_price != null)
			map.put("dealer_price", dealer_price);
		if(customer_price != null)
			map.put("customer_price", customer_price);
		if(unit != null)
			map.put("unit", unit);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_name != null)
			map.put("reference_name", reference_name);
		if(release != null)
			map.put("release", release);
		if(priority != null)
			map.put("priority", priority);
		if(user_id != null)
			map.put("user_id", user_id);
		if(verified != null)
			map.put("verified", verified);
		if(reference_name_1 != null)
			map.put("reference_name_1", reference_name_1);
		if(reference_name_2 != null)
			map.put("reference_name_2", reference_name_2);
		if(reference_relation_1 != null)
			map.put("reference_relation_1", reference_relation_1);
		if(reference_relation_2 != null)
			map.put("reference_relation_2", reference_relation_2);
		if(reference_no_1 != null)
			map.put("reference_no_1", reference_no_1);
		if(reference_no_2 != null)
			map.put("reference_no_2", reference_no_2);
		if(reporting_to_id != null)
			map.put("reporting_to_id", reporting_to_id);
		if(assign_to_id != null)
			map.put("assign_to_id", assign_to_id);
		if(assign_to_name != null)
			map.put("assign_to_name", assign_to_name);
		if(assign_date_str != null)
			map.put("assign_date_str", assign_date_str);
		if(assign_date != null)
			map.put("assign_date", assign_date);
		if(completion_date_str != null)
			map.put("completion_date_str", completion_date_str);
		if(completion_date != null)
			map.put("completion_date", completion_date);
		if(dob_str != null)
			map.put("dob_str", dob_str);
		if(primary_contact_id != null)
			map.put("primary_contact_id", primary_contact_id);
		if(flat_id != null)
			map.put("flat_id", flat_id);
		if(flat_no != null)
			map.put("flat_no", flat_no);
		if(dob != null)
			map.put("dob", dob);
		if(notification_orders != null)
			map.put("notification_orders", notification_orders);
		if(notification_offers != null)
			map.put("notification_offers", notification_offers);
		if(notification_communication != null)
			map.put("notification_communication", notification_communication);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(updation_time != null)
			map.put("updation_time", updation_time);
		if(owner_id != null)
			map.put("owner_id", owner_id);
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
		first_name = (String) map.get("first_name");
		last_name = (String) map.get("last_name");
		description = (String) map.get("description");
		short_name = (String) map.get("short_name");
		password = (String) map.get("password");
		school_id = (String) map.get("school_id");
		blood_group = (String) map.get("blood_group");
		physically_challenged = (String) map.get("physically_challenged");
		caste = (String) map.get("caste");
		religion = (String) map.get("religion");
		nationality = (String) map.get("nationality");
		mother_tongue = (String) map.get("mother_tongue");
		place_of_birth = (String) map.get("place_of_birth");
		family_size = (Integer) map.get("family_size");
		use_hand = (String) map.get("use_hand");
		table_no = (String) map.get("table_no");
		food_habit = (String) map.get("food_habit");
		dorm_bed_no = (String) map.get("dorm_bed_no");
		license_no = (String) map.get("license_no");
		url = (String) map.get("url");
		brand_id = (String) map.get("brand_id");
		brand_name = (String) map.get("brand_name");
		parent_id = (String) map.get("parent_id");
		community_id = (String) map.get("community_id");
		community_name = (String) map.get("community_name");
		search_suffix = (String) map.get("search_suffix");
		community_type = (String) map.get("community_type");
		customer_id = (String) map.get("customer_id");
		object_type = (String) map.get("object_type");
		type = (String) map.get("type");
		sub_type = (String) map.get("sub_type");
		gender = (String) map.get("gender");
		floor_no = (String) map.get("floor_no");
		email_id = (String) map.get("email_id");
		mobile_no = (String) map.get("mobile_no");
		server_id = (String) map.get("server_id");
		deleted = (String) map.get("deleted");
		synced = (String) map.get("synced");
		status = (String) map.get("status");
		role = (String) map.get("role");
		address = (String) map.get("address");
		area = (String) map.get("area");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		feature_show_sales_price = (String) map.get("feature_show_sales_price");
		feature_show_mrp_price = (String) map.get("feature_show_mrp_price");
		feature_non_veg = (String) map.get("feature_non_veg");
		feature_product_available = (String) map.get("feature_product_available");
		feature_active = (String) map.get("feature_active");
		feature_distributer_management = (String) map.get("feature_distributer_management");
		feature_dealer_management = (String) map.get("feature_dealer_management");
		no_of_flats = (Integer) map.get("no_of_flats");
		block_id = (String) map.get("block_id");
		profession = (String) map.get("profession");
		company_name = (String) map.get("company_name");
		company_id = (String) map.get("company_id");
		domain = (String) map.get("domain");
		scheme_available = (String) map.get("scheme_available");
		designation = (String) map.get("designation");
		resident = (String) map.get("resident");
		zip_code = (String) map.get("zip_code");
		last_scheme = (String) map.get("last_scheme");
		feature_send_sms = (String) map.get("feature_send_sms");
		feature_send_email = (String) map.get("feature_send_email");
		feature_printer = (String) map.get("feature_printer");
		account_manager_name = (String) map.get("account_manager_name");
		account_manager_no = (String) map.get("account_manager_no");
		feature_sms_order = (String) map.get("feature_sms_order");
		feature_send_account_manager_sms = (String) map.get("feature_send_account_manager_sms");
		feature_order_sms = (String) map.get("feature_order_sms");
		mrp_price = (Double) map.get("mrp_price");
		service_tax = (Double) map.get("service_tax");
		service_charges = (Double) map.get("service_charges");
		service_charges_home_delivery = (Double) map.get("service_charges_home_delivery");
		service_charges_takeaway = (Double) map.get("service_charges_takeaway");
		service_charges_on_table = (Double) map.get("service_charges_on_table");
		delivery_time = (String) map.get("delivery_time");
		vat = (Double) map.get("vat");
		distribter_price = (Double) map.get("distribter_price");
		attribute_name = (String) map.get("attribute_name");
		attribute_value = (String) map.get("attribute_value");
		dealer_price = (Double) map.get("dealer_price");
		customer_price = (Double) map.get("customer_price");
		unit = (String) map.get("unit");
		reference_id = (String) map.get("reference_id");
		reference_name = (String) map.get("reference_name");
		release = (String) map.get("release");
		priority = (String) map.get("priority");
		user_id = (String) map.get("user_id");
		verified = (String) map.get("verified");
		reference_name_1 = (String) map.get("reference_name_1");
		reference_name_2 = (String) map.get("reference_name_2");
		reference_relation_1 = (String) map.get("reference_relation_1");
		reference_relation_2 = (String) map.get("reference_relation_2");
		reference_no_1 = (String) map.get("reference_no_1");
		reference_no_2 = (String) map.get("reference_no_2");
		reporting_to_id = (String) map.get("reporting_to_id");
		assign_to_id = (String) map.get("assign_to_id");
		assign_to_name = (String) map.get("assign_to_name");
		assign_date_str = (String) map.get("assign_date_str");
		assign_date = (Long) map.get("assign_date");
		completion_date_str = (String) map.get("completion_date_str");
		completion_date = (Long) map.get("completion_date");
		dob_str = (String) map.get("dob_str");
		primary_contact_id = (String) map.get("primary_contact_id");
		flat_id = (String) map.get("flat_id");
		flat_no = (String) map.get("flat_no");
		dob = (Long) map.get("dob");
		notification_orders = (Integer) map.get("notification_orders");
		notification_offers = (Integer) map.get("notification_offers");
		notification_communication = (Integer) map.get("notification_communication");
		creation_time = (Long) map.get("creation_time");
		updation_time = (Long) map.get("updation_time");
		owner_id = (String) map.get("owner_id");
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

		Object first_nameObj = map.get("first_name");
		if(first_nameObj != null)
			first_name = first_nameObj.toString();

		Object last_nameObj = map.get("last_name");
		if(last_nameObj != null)
			last_name = last_nameObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object short_nameObj = map.get("short_name");
		if(short_nameObj != null)
			short_name = short_nameObj.toString();

		Object passwordObj = map.get("password");
		if(passwordObj != null)
			password = passwordObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object blood_groupObj = map.get("blood_group");
		if(blood_groupObj != null)
			blood_group = blood_groupObj.toString();

		Object physically_challengedObj = map.get("physically_challenged");
		if(physically_challengedObj != null)
			physically_challenged = physically_challengedObj.toString();

		Object casteObj = map.get("caste");
		if(casteObj != null)
			caste = casteObj.toString();

		Object religionObj = map.get("religion");
		if(religionObj != null)
			religion = religionObj.toString();

		Object nationalityObj = map.get("nationality");
		if(nationalityObj != null)
			nationality = nationalityObj.toString();

		Object mother_tongueObj = map.get("mother_tongue");
		if(mother_tongueObj != null)
			mother_tongue = mother_tongueObj.toString();

		Object place_of_birthObj = map.get("place_of_birth");
		if(place_of_birthObj != null)
			place_of_birth = place_of_birthObj.toString();

		Object family_sizeObj = map.get("family_size");
		if(family_sizeObj != null)
			family_size = new Integer(family_sizeObj.toString());

		Object use_handObj = map.get("use_hand");
		if(use_handObj != null)
			use_hand = use_handObj.toString();

		Object table_noObj = map.get("table_no");
		if(table_noObj != null)
			table_no = table_noObj.toString();

		Object food_habitObj = map.get("food_habit");
		if(food_habitObj != null)
			food_habit = food_habitObj.toString();

		Object dorm_bed_noObj = map.get("dorm_bed_no");
		if(dorm_bed_noObj != null)
			dorm_bed_no = dorm_bed_noObj.toString();

		Object license_noObj = map.get("license_no");
		if(license_noObj != null)
			license_no = license_noObj.toString();

		Object urlObj = map.get("url");
		if(urlObj != null)
			url = urlObj.toString();

		Object brand_idObj = map.get("brand_id");
		if(brand_idObj != null)
			brand_id = brand_idObj.toString();

		Object brand_nameObj = map.get("brand_name");
		if(brand_nameObj != null)
			brand_name = brand_nameObj.toString();

		Object parent_idObj = map.get("parent_id");
		if(parent_idObj != null)
			parent_id = parent_idObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object community_nameObj = map.get("community_name");
		if(community_nameObj != null)
			community_name = community_nameObj.toString();

		Object search_suffixObj = map.get("search_suffix");
		if(search_suffixObj != null)
			search_suffix = search_suffixObj.toString();

		Object community_typeObj = map.get("community_type");
		if(community_typeObj != null)
			community_type = community_typeObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object object_typeObj = map.get("object_type");
		if(object_typeObj != null)
			object_type = object_typeObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object sub_typeObj = map.get("sub_type");
		if(sub_typeObj != null)
			sub_type = sub_typeObj.toString();

		Object genderObj = map.get("gender");
		if(genderObj != null)
			gender = genderObj.toString();

		Object floor_noObj = map.get("floor_no");
		if(floor_noObj != null)
			floor_no = floor_noObj.toString();

		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object server_idObj = map.get("server_id");
		if(server_idObj != null)
			server_id = server_idObj.toString();

		Object deletedObj = map.get("deleted");
		if(deletedObj != null)
			deleted = deletedObj.toString();

		Object syncedObj = map.get("synced");
		if(syncedObj != null)
			synced = syncedObj.toString();

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

		Object roleObj = map.get("role");
		if(roleObj != null)
			role = roleObj.toString();

		Object addressObj = map.get("address");
		if(addressObj != null)
			address = addressObj.toString();

		Object areaObj = map.get("area");
		if(areaObj != null)
			area = areaObj.toString();

		Object cityObj = map.get("city");
		if(cityObj != null)
			city = cityObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object countryObj = map.get("country");
		if(countryObj != null)
			country = countryObj.toString();

		Object feature_show_sales_priceObj = map.get("feature_show_sales_price");
		if(feature_show_sales_priceObj != null)
			feature_show_sales_price = feature_show_sales_priceObj.toString();

		Object feature_show_mrp_priceObj = map.get("feature_show_mrp_price");
		if(feature_show_mrp_priceObj != null)
			feature_show_mrp_price = feature_show_mrp_priceObj.toString();

		Object feature_non_vegObj = map.get("feature_non_veg");
		if(feature_non_vegObj != null)
			feature_non_veg = feature_non_vegObj.toString();

		Object feature_product_availableObj = map.get("feature_product_available");
		if(feature_product_availableObj != null)
			feature_product_available = feature_product_availableObj.toString();

		Object feature_activeObj = map.get("feature_active");
		if(feature_activeObj != null)
			feature_active = feature_activeObj.toString();

		Object feature_distributer_managementObj = map.get("feature_distributer_management");
		if(feature_distributer_managementObj != null)
			feature_distributer_management = feature_distributer_managementObj.toString();

		Object feature_dealer_managementObj = map.get("feature_dealer_management");
		if(feature_dealer_managementObj != null)
			feature_dealer_management = feature_dealer_managementObj.toString();

		Object no_of_flatsObj = map.get("no_of_flats");
		if(no_of_flatsObj != null)
			no_of_flats = new Integer(no_of_flatsObj.toString());

		Object block_idObj = map.get("block_id");
		if(block_idObj != null)
			block_id = block_idObj.toString();

		Object professionObj = map.get("profession");
		if(professionObj != null)
			profession = professionObj.toString();

		Object company_nameObj = map.get("company_name");
		if(company_nameObj != null)
			company_name = company_nameObj.toString();

		Object company_idObj = map.get("company_id");
		if(company_idObj != null)
			company_id = company_idObj.toString();

		Object domainObj = map.get("domain");
		if(domainObj != null)
			domain = domainObj.toString();

		Object scheme_availableObj = map.get("scheme_available");
		if(scheme_availableObj != null)
			scheme_available = scheme_availableObj.toString();

		Object designationObj = map.get("designation");
		if(designationObj != null)
			designation = designationObj.toString();

		Object residentObj = map.get("resident");
		if(residentObj != null)
			resident = residentObj.toString();

		Object zip_codeObj = map.get("zip_code");
		if(zip_codeObj != null)
			zip_code = zip_codeObj.toString();

		Object last_schemeObj = map.get("last_scheme");
		if(last_schemeObj != null)
			last_scheme = last_schemeObj.toString();

		Object feature_send_smsObj = map.get("feature_send_sms");
		if(feature_send_smsObj != null)
			feature_send_sms = feature_send_smsObj.toString();

		Object feature_send_emailObj = map.get("feature_send_email");
		if(feature_send_emailObj != null)
			feature_send_email = feature_send_emailObj.toString();

		Object feature_printerObj = map.get("feature_printer");
		if(feature_printerObj != null)
			feature_printer = feature_printerObj.toString();

		Object account_manager_nameObj = map.get("account_manager_name");
		if(account_manager_nameObj != null)
			account_manager_name = account_manager_nameObj.toString();

		Object account_manager_noObj = map.get("account_manager_no");
		if(account_manager_noObj != null)
			account_manager_no = account_manager_noObj.toString();

		Object feature_sms_orderObj = map.get("feature_sms_order");
		if(feature_sms_orderObj != null)
			feature_sms_order = feature_sms_orderObj.toString();

		Object feature_send_account_manager_smsObj = map.get("feature_send_account_manager_sms");
		if(feature_send_account_manager_smsObj != null)
			feature_send_account_manager_sms = feature_send_account_manager_smsObj.toString();

		Object feature_order_smsObj = map.get("feature_order_sms");
		if(feature_order_smsObj != null)
			feature_order_sms = feature_order_smsObj.toString();

		Object mrp_priceObj = map.get("mrp_price");
		if(mrp_priceObj != null)
			mrp_price = new Double(mrp_priceObj.toString());

		Object service_taxObj = map.get("service_tax");
		if(service_taxObj != null)
			service_tax = new Double(service_taxObj.toString());

		Object service_chargesObj = map.get("service_charges");
		if(service_chargesObj != null)
			service_charges = new Double(service_chargesObj.toString());

		Object service_charges_home_deliveryObj = map.get("service_charges_home_delivery");
		if(service_charges_home_deliveryObj != null)
			service_charges_home_delivery = new Double(service_charges_home_deliveryObj.toString());

		Object service_charges_takeawayObj = map.get("service_charges_takeaway");
		if(service_charges_takeawayObj != null)
			service_charges_takeaway = new Double(service_charges_takeawayObj.toString());

		Object service_charges_on_tableObj = map.get("service_charges_on_table");
		if(service_charges_on_tableObj != null)
			service_charges_on_table = new Double(service_charges_on_tableObj.toString());

		Object delivery_timeObj = map.get("delivery_time");
		if(delivery_timeObj != null)
			delivery_time = delivery_timeObj.toString();

		Object vatObj = map.get("vat");
		if(vatObj != null)
			vat = new Double(vatObj.toString());

		Object distribter_priceObj = map.get("distribter_price");
		if(distribter_priceObj != null)
			distribter_price = new Double(distribter_priceObj.toString());

		Object attribute_nameObj = map.get("attribute_name");
		if(attribute_nameObj != null)
			attribute_name = attribute_nameObj.toString();

		Object attribute_valueObj = map.get("attribute_value");
		if(attribute_valueObj != null)
			attribute_value = attribute_valueObj.toString();

		Object dealer_priceObj = map.get("dealer_price");
		if(dealer_priceObj != null)
			dealer_price = new Double(dealer_priceObj.toString());

		Object customer_priceObj = map.get("customer_price");
		if(customer_priceObj != null)
			customer_price = new Double(customer_priceObj.toString());

		Object unitObj = map.get("unit");
		if(unitObj != null)
			unit = unitObj.toString();

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

		Object reference_nameObj = map.get("reference_name");
		if(reference_nameObj != null)
			reference_name = reference_nameObj.toString();

		Object releaseObj = map.get("release");
		if(releaseObj != null)
			release = releaseObj.toString();

		Object priorityObj = map.get("priority");
		if(priorityObj != null)
			priority = priorityObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object verifiedObj = map.get("verified");
		if(verifiedObj != null)
			verified = verifiedObj.toString();

		Object reference_name_1Obj = map.get("reference_name_1");
		if(reference_name_1Obj != null)
			reference_name_1 = reference_name_1Obj.toString();

		Object reference_name_2Obj = map.get("reference_name_2");
		if(reference_name_2Obj != null)
			reference_name_2 = reference_name_2Obj.toString();

		Object reference_relation_1Obj = map.get("reference_relation_1");
		if(reference_relation_1Obj != null)
			reference_relation_1 = reference_relation_1Obj.toString();

		Object reference_relation_2Obj = map.get("reference_relation_2");
		if(reference_relation_2Obj != null)
			reference_relation_2 = reference_relation_2Obj.toString();

		Object reference_no_1Obj = map.get("reference_no_1");
		if(reference_no_1Obj != null)
			reference_no_1 = reference_no_1Obj.toString();

		Object reference_no_2Obj = map.get("reference_no_2");
		if(reference_no_2Obj != null)
			reference_no_2 = reference_no_2Obj.toString();

		Object reporting_to_idObj = map.get("reporting_to_id");
		if(reporting_to_idObj != null)
			reporting_to_id = reporting_to_idObj.toString();

		Object assign_to_idObj = map.get("assign_to_id");
		if(assign_to_idObj != null)
			assign_to_id = assign_to_idObj.toString();

		Object assign_to_nameObj = map.get("assign_to_name");
		if(assign_to_nameObj != null)
			assign_to_name = assign_to_nameObj.toString();

		Object assign_date_strObj = map.get("assign_date_str");
		if(assign_date_strObj != null)
			assign_date_str = assign_date_strObj.toString();

		Object assign_dateObj = map.get("assign_date");
		if(assign_dateObj != null)
			assign_date = new Long(assign_dateObj.toString());

		Object completion_date_strObj = map.get("completion_date_str");
		if(completion_date_strObj != null)
			completion_date_str = completion_date_strObj.toString();

		Object completion_dateObj = map.get("completion_date");
		if(completion_dateObj != null)
			completion_date = new Long(completion_dateObj.toString());

		Object dob_strObj = map.get("dob_str");
		if(dob_strObj != null)
			dob_str = dob_strObj.toString();

		Object primary_contact_idObj = map.get("primary_contact_id");
		if(primary_contact_idObj != null)
			primary_contact_id = primary_contact_idObj.toString();

		Object flat_idObj = map.get("flat_id");
		if(flat_idObj != null)
			flat_id = flat_idObj.toString();

		Object flat_noObj = map.get("flat_no");
		if(flat_noObj != null)
			flat_no = flat_noObj.toString();

		Object dobObj = map.get("dob");
		if(dobObj != null)
			dob = new Long(dobObj.toString());

		Object notification_ordersObj = map.get("notification_orders");
		if(notification_ordersObj != null)
			notification_orders = new Integer(notification_ordersObj.toString());

		Object notification_offersObj = map.get("notification_offers");
		if(notification_offersObj != null)
			notification_offers = new Integer(notification_offersObj.toString());

		Object notification_communicationObj = map.get("notification_communication");
		if(notification_communicationObj != null)
			notification_communication = new Integer(notification_communicationObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object updation_timeObj = map.get("updation_time");
		if(updation_timeObj != null)
			updation_time = (Long) updation_timeObj;

		Object owner_idObj = map.get("owner_id");
		if(owner_idObj != null)
			owner_id = owner_idObj.toString();

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

	public String getFirst_name() {
		return first_name;
	}

	public String getFirst_nameEx() {
		return first_name != null ? first_name : "";
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void unSetFirst_name() {
		this.first_name = null;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getLast_nameEx() {
		return last_name != null ? last_name : "";
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void unSetLast_name() {
		this.last_name = null;
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

	public String getPhysically_challenged() {
		return physically_challenged;
	}

	public String getPhysically_challengedEx() {
		return physically_challenged != null ? physically_challenged : "";
	}

	public void setPhysically_challenged(String physically_challenged) {
		this.physically_challenged = physically_challenged;
	}

	public void unSetPhysically_challenged() {
		this.physically_challenged = null;
	}

	public String getCaste() {
		return caste;
	}

	public String getCasteEx() {
		return caste != null ? caste : "";
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public void unSetCaste() {
		this.caste = null;
	}

	public String getReligion() {
		return religion;
	}

	public String getReligionEx() {
		return religion != null ? religion : "";
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void unSetReligion() {
		this.religion = null;
	}

	public String getNationality() {
		return nationality;
	}

	public String getNationalityEx() {
		return nationality != null ? nationality : "";
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void unSetNationality() {
		this.nationality = null;
	}

	public String getMother_tongue() {
		return mother_tongue;
	}

	public String getMother_tongueEx() {
		return mother_tongue != null ? mother_tongue : "";
	}

	public void setMother_tongue(String mother_tongue) {
		this.mother_tongue = mother_tongue;
	}

	public void unSetMother_tongue() {
		this.mother_tongue = null;
	}

	public String getPlace_of_birth() {
		return place_of_birth;
	}

	public String getPlace_of_birthEx() {
		return place_of_birth != null ? place_of_birth : "";
	}

	public void setPlace_of_birth(String place_of_birth) {
		this.place_of_birth = place_of_birth;
	}

	public void unSetPlace_of_birth() {
		this.place_of_birth = null;
	}

	public Integer getFamily_size() {
		return family_size;
	}

	public int getFamily_sizeEx() {
		return family_size != null ? family_size : 0;
	}

	public void setFamily_size(int family_size) {
		this.family_size = family_size;
	}

	public void setFamily_size(Integer family_size) {
		this.family_size = family_size;
	}

	public void unSetFamily_size() {
		this.family_size = null;
	}

	public String getUse_hand() {
		return use_hand;
	}

	public String getUse_handEx() {
		return use_hand != null ? use_hand : "";
	}

	public void setUse_hand(String use_hand) {
		this.use_hand = use_hand;
	}

	public void unSetUse_hand() {
		this.use_hand = null;
	}

	public String getTable_no() {
		return table_no;
	}

	public String getTable_noEx() {
		return table_no != null ? table_no : "";
	}

	public void setTable_no(String table_no) {
		this.table_no = table_no;
	}

	public void unSetTable_no() {
		this.table_no = null;
	}

	public String getFood_habit() {
		return food_habit;
	}

	public String getFood_habitEx() {
		return food_habit != null ? food_habit : "";
	}

	public void setFood_habit(String food_habit) {
		this.food_habit = food_habit;
	}

	public void unSetFood_habit() {
		this.food_habit = null;
	}

	public String getDorm_bed_no() {
		return dorm_bed_no;
	}

	public String getDorm_bed_noEx() {
		return dorm_bed_no != null ? dorm_bed_no : "";
	}

	public void setDorm_bed_no(String dorm_bed_no) {
		this.dorm_bed_no = dorm_bed_no;
	}

	public void unSetDorm_bed_no() {
		this.dorm_bed_no = null;
	}

	public String getLicense_no() {
		return license_no;
	}

	public String getLicense_noEx() {
		return license_no != null ? license_no : "";
	}

	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}

	public void unSetLicense_no() {
		this.license_no = null;
	}

	public String getUrl() {
		return url;
	}

	public String getUrlEx() {
		return url != null ? url : "";
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void unSetUrl() {
		this.url = null;
	}

	public String getBrand_id() {
		return brand_id;
	}

	public String getBrand_idEx() {
		return brand_id != null ? brand_id : "";
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public void unSetBrand_id() {
		this.brand_id = null;
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

	public String getParent_id() {
		return parent_id;
	}

	public String getParent_idEx() {
		return parent_id != null ? parent_id : "";
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public void unSetParent_id() {
		this.parent_id = null;
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

	public String getCommunity_name() {
		return community_name;
	}

	public String getCommunity_nameEx() {
		return community_name != null ? community_name : "";
	}

	public void setCommunity_name(String community_name) {
		this.community_name = community_name;
	}

	public void unSetCommunity_name() {
		this.community_name = null;
	}

	public String getSearch_suffix() {
		return search_suffix;
	}

	public String getSearch_suffixEx() {
		return search_suffix != null ? search_suffix : "";
	}

	public void setSearch_suffix(String search_suffix) {
		this.search_suffix = search_suffix;
	}

	public void unSetSearch_suffix() {
		this.search_suffix = null;
	}

	public String getCommunity_type() {
		return community_type;
	}

	public String getCommunity_typeEx() {
		return community_type != null ? community_type : "";
	}

	public void setCommunity_type(String community_type) {
		this.community_type = community_type;
	}

	public void unSetCommunity_type() {
		this.community_type = null;
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

	public String getObject_type() {
		return object_type;
	}

	public String getObject_typeEx() {
		return object_type != null ? object_type : "";
	}

	public void setObject_type(String object_type) {
		this.object_type = object_type;
	}

	public void unSetObject_type() {
		this.object_type = null;
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

	public String getSub_type() {
		return sub_type;
	}

	public String getSub_typeEx() {
		return sub_type != null ? sub_type : "";
	}

	public void setSub_type(String sub_type) {
		this.sub_type = sub_type;
	}

	public void unSetSub_type() {
		this.sub_type = null;
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

	public String getFloor_no() {
		return floor_no;
	}

	public String getFloor_noEx() {
		return floor_no != null ? floor_no : "";
	}

	public void setFloor_no(String floor_no) {
		this.floor_no = floor_no;
	}

	public void unSetFloor_no() {
		this.floor_no = null;
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

	public String getServer_id() {
		return server_id;
	}

	public String getServer_idEx() {
		return server_id != null ? server_id : "";
	}

	public void setServer_id(String server_id) {
		this.server_id = server_id;
	}

	public void unSetServer_id() {
		this.server_id = null;
	}

	public String getDeleted() {
		return deleted;
	}

	public String getDeletedEx() {
		return deleted != null ? deleted : "";
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public void unSetDeleted() {
		this.deleted = null;
	}

	public String getSynced() {
		return synced;
	}

	public String getSyncedEx() {
		return synced != null ? synced : "";
	}

	public void setSynced(String synced) {
		this.synced = synced;
	}

	public void unSetSynced() {
		this.synced = null;
	}

	public String getStatus() {
		return status;
	}

	public String getStatusEx() {
		return status != null ? status : "";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = null;
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

	public String getAddress() {
		return address;
	}

	public String getAddressEx() {
		return address != null ? address : "";
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void unSetAddress() {
		this.address = null;
	}

	public String getArea() {
		return area;
	}

	public String getAreaEx() {
		return area != null ? area : "";
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void unSetArea() {
		this.area = null;
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

	public String getFeature_show_sales_price() {
		return feature_show_sales_price;
	}

	public String getFeature_show_sales_priceEx() {
		return feature_show_sales_price != null ? feature_show_sales_price : "";
	}

	public void setFeature_show_sales_price(String feature_show_sales_price) {
		this.feature_show_sales_price = feature_show_sales_price;
	}

	public void unSetFeature_show_sales_price() {
		this.feature_show_sales_price = null;
	}

	public String getFeature_show_mrp_price() {
		return feature_show_mrp_price;
	}

	public String getFeature_show_mrp_priceEx() {
		return feature_show_mrp_price != null ? feature_show_mrp_price : "";
	}

	public void setFeature_show_mrp_price(String feature_show_mrp_price) {
		this.feature_show_mrp_price = feature_show_mrp_price;
	}

	public void unSetFeature_show_mrp_price() {
		this.feature_show_mrp_price = null;
	}

	public String getFeature_non_veg() {
		return feature_non_veg;
	}

	public String getFeature_non_vegEx() {
		return feature_non_veg != null ? feature_non_veg : "";
	}

	public void setFeature_non_veg(String feature_non_veg) {
		this.feature_non_veg = feature_non_veg;
	}

	public void unSetFeature_non_veg() {
		this.feature_non_veg = null;
	}

	public String getFeature_product_available() {
		return feature_product_available;
	}

	public String getFeature_product_availableEx() {
		return feature_product_available != null ? feature_product_available : "";
	}

	public void setFeature_product_available(String feature_product_available) {
		this.feature_product_available = feature_product_available;
	}

	public void unSetFeature_product_available() {
		this.feature_product_available = null;
	}

	public String getFeature_active() {
		return feature_active;
	}

	public String getFeature_activeEx() {
		return feature_active != null ? feature_active : "";
	}

	public void setFeature_active(String feature_active) {
		this.feature_active = feature_active;
	}

	public void unSetFeature_active() {
		this.feature_active = null;
	}

	public String getFeature_distributer_management() {
		return feature_distributer_management;
	}

	public String getFeature_distributer_managementEx() {
		return feature_distributer_management != null ? feature_distributer_management : "";
	}

	public void setFeature_distributer_management(String feature_distributer_management) {
		this.feature_distributer_management = feature_distributer_management;
	}

	public void unSetFeature_distributer_management() {
		this.feature_distributer_management = null;
	}

	public String getFeature_dealer_management() {
		return feature_dealer_management;
	}

	public String getFeature_dealer_managementEx() {
		return feature_dealer_management != null ? feature_dealer_management : "";
	}

	public void setFeature_dealer_management(String feature_dealer_management) {
		this.feature_dealer_management = feature_dealer_management;
	}

	public void unSetFeature_dealer_management() {
		this.feature_dealer_management = null;
	}

	public Integer getNo_of_flats() {
		return no_of_flats;
	}

	public int getNo_of_flatsEx() {
		return no_of_flats != null ? no_of_flats : 0;
	}

	public void setNo_of_flats(int no_of_flats) {
		this.no_of_flats = no_of_flats;
	}

	public void setNo_of_flats(Integer no_of_flats) {
		this.no_of_flats = no_of_flats;
	}

	public void unSetNo_of_flats() {
		this.no_of_flats = null;
	}

	public String getBlock_id() {
		return block_id;
	}

	public String getBlock_idEx() {
		return block_id != null ? block_id : "";
	}

	public void setBlock_id(String block_id) {
		this.block_id = block_id;
	}

	public void unSetBlock_id() {
		this.block_id = null;
	}

	public String getProfession() {
		return profession;
	}

	public String getProfessionEx() {
		return profession != null ? profession : "";
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public void unSetProfession() {
		this.profession = null;
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

	public String getCompany_id() {
		return company_id;
	}

	public String getCompany_idEx() {
		return company_id != null ? company_id : "";
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public void unSetCompany_id() {
		this.company_id = null;
	}

	public String getDomain() {
		return domain;
	}

	public String getDomainEx() {
		return domain != null ? domain : "";
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public void unSetDomain() {
		this.domain = null;
	}

	public String getScheme_available() {
		return scheme_available;
	}

	public String getScheme_availableEx() {
		return scheme_available != null ? scheme_available : "";
	}

	public void setScheme_available(String scheme_available) {
		this.scheme_available = scheme_available;
	}

	public void unSetScheme_available() {
		this.scheme_available = null;
	}

	public String getDesignation() {
		return designation;
	}

	public String getDesignationEx() {
		return designation != null ? designation : "";
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void unSetDesignation() {
		this.designation = null;
	}

	public String getResident() {
		return resident;
	}

	public String getResidentEx() {
		return resident != null ? resident : "";
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	public void unSetResident() {
		this.resident = null;
	}

	public String getZip_code() {
		return zip_code;
	}

	public String getZip_codeEx() {
		return zip_code != null ? zip_code : "";
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public void unSetZip_code() {
		this.zip_code = null;
	}

	public String getLast_scheme() {
		return last_scheme;
	}

	public String getLast_schemeEx() {
		return last_scheme != null ? last_scheme : "";
	}

	public void setLast_scheme(String last_scheme) {
		this.last_scheme = last_scheme;
	}

	public void unSetLast_scheme() {
		this.last_scheme = null;
	}

	public String getFeature_send_sms() {
		return feature_send_sms;
	}

	public String getFeature_send_smsEx() {
		return feature_send_sms != null ? feature_send_sms : "";
	}

	public void setFeature_send_sms(String feature_send_sms) {
		this.feature_send_sms = feature_send_sms;
	}

	public void unSetFeature_send_sms() {
		this.feature_send_sms = null;
	}

	public String getFeature_send_email() {
		return feature_send_email;
	}

	public String getFeature_send_emailEx() {
		return feature_send_email != null ? feature_send_email : "";
	}

	public void setFeature_send_email(String feature_send_email) {
		this.feature_send_email = feature_send_email;
	}

	public void unSetFeature_send_email() {
		this.feature_send_email = null;
	}

	public String getFeature_printer() {
		return feature_printer;
	}

	public String getFeature_printerEx() {
		return feature_printer != null ? feature_printer : "";
	}

	public void setFeature_printer(String feature_printer) {
		this.feature_printer = feature_printer;
	}

	public void unSetFeature_printer() {
		this.feature_printer = null;
	}

	public String getAccount_manager_name() {
		return account_manager_name;
	}

	public String getAccount_manager_nameEx() {
		return account_manager_name != null ? account_manager_name : "";
	}

	public void setAccount_manager_name(String account_manager_name) {
		this.account_manager_name = account_manager_name;
	}

	public void unSetAccount_manager_name() {
		this.account_manager_name = null;
	}

	public String getAccount_manager_no() {
		return account_manager_no;
	}

	public String getAccount_manager_noEx() {
		return account_manager_no != null ? account_manager_no : "";
	}

	public void setAccount_manager_no(String account_manager_no) {
		this.account_manager_no = account_manager_no;
	}

	public void unSetAccount_manager_no() {
		this.account_manager_no = null;
	}

	public String getFeature_sms_order() {
		return feature_sms_order;
	}

	public String getFeature_sms_orderEx() {
		return feature_sms_order != null ? feature_sms_order : "";
	}

	public void setFeature_sms_order(String feature_sms_order) {
		this.feature_sms_order = feature_sms_order;
	}

	public void unSetFeature_sms_order() {
		this.feature_sms_order = null;
	}

	public String getFeature_send_account_manager_sms() {
		return feature_send_account_manager_sms;
	}

	public String getFeature_send_account_manager_smsEx() {
		return feature_send_account_manager_sms != null ? feature_send_account_manager_sms : "";
	}

	public void setFeature_send_account_manager_sms(String feature_send_account_manager_sms) {
		this.feature_send_account_manager_sms = feature_send_account_manager_sms;
	}

	public void unSetFeature_send_account_manager_sms() {
		this.feature_send_account_manager_sms = null;
	}

	public String getFeature_order_sms() {
		return feature_order_sms;
	}

	public String getFeature_order_smsEx() {
		return feature_order_sms != null ? feature_order_sms : "";
	}

	public void setFeature_order_sms(String feature_order_sms) {
		this.feature_order_sms = feature_order_sms;
	}

	public void unSetFeature_order_sms() {
		this.feature_order_sms = null;
	}

	public Double getMrp_price() {
		return mrp_price;
	}

	public double getMrp_priceEx() {
		return mrp_price != null ? mrp_price : 0;
	}

	public void setMrp_price(double mrp_price) {
		this.mrp_price = mrp_price;
	}

	public void setMrp_price(Double mrp_price) {
		this.mrp_price = mrp_price;
	}

	public void unSetMrp_price() {
		this.mrp_price = null;
	}

	public Double getService_tax() {
		return service_tax;
	}

	public double getService_taxEx() {
		return service_tax != null ? service_tax : 0;
	}

	public void setService_tax(double service_tax) {
		this.service_tax = service_tax;
	}

	public void setService_tax(Double service_tax) {
		this.service_tax = service_tax;
	}

	public void unSetService_tax() {
		this.service_tax = null;
	}

	public Double getService_charges() {
		return service_charges;
	}

	public double getService_chargesEx() {
		return service_charges != null ? service_charges : 0;
	}

	public void setService_charges(double service_charges) {
		this.service_charges = service_charges;
	}

	public void setService_charges(Double service_charges) {
		this.service_charges = service_charges;
	}

	public void unSetService_charges() {
		this.service_charges = null;
	}

	public Double getService_charges_home_delivery() {
		return service_charges_home_delivery;
	}

	public double getService_charges_home_deliveryEx() {
		return service_charges_home_delivery != null ? service_charges_home_delivery : 0;
	}

	public void setService_charges_home_delivery(double service_charges_home_delivery) {
		this.service_charges_home_delivery = service_charges_home_delivery;
	}

	public void setService_charges_home_delivery(Double service_charges_home_delivery) {
		this.service_charges_home_delivery = service_charges_home_delivery;
	}

	public void unSetService_charges_home_delivery() {
		this.service_charges_home_delivery = null;
	}

	public Double getService_charges_takeaway() {
		return service_charges_takeaway;
	}

	public double getService_charges_takeawayEx() {
		return service_charges_takeaway != null ? service_charges_takeaway : 0;
	}

	public void setService_charges_takeaway(double service_charges_takeaway) {
		this.service_charges_takeaway = service_charges_takeaway;
	}

	public void setService_charges_takeaway(Double service_charges_takeaway) {
		this.service_charges_takeaway = service_charges_takeaway;
	}

	public void unSetService_charges_takeaway() {
		this.service_charges_takeaway = null;
	}

	public Double getService_charges_on_table() {
		return service_charges_on_table;
	}

	public double getService_charges_on_tableEx() {
		return service_charges_on_table != null ? service_charges_on_table : 0;
	}

	public void setService_charges_on_table(double service_charges_on_table) {
		this.service_charges_on_table = service_charges_on_table;
	}

	public void setService_charges_on_table(Double service_charges_on_table) {
		this.service_charges_on_table = service_charges_on_table;
	}

	public void unSetService_charges_on_table() {
		this.service_charges_on_table = null;
	}

	public String getDelivery_time() {
		return delivery_time;
	}

	public String getDelivery_timeEx() {
		return delivery_time != null ? delivery_time : "";
	}

	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}

	public void unSetDelivery_time() {
		this.delivery_time = null;
	}

	public Double getVat() {
		return vat;
	}

	public double getVatEx() {
		return vat != null ? vat : 0;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public void setVat(Double vat) {
		this.vat = vat;
	}

	public void unSetVat() {
		this.vat = null;
	}

	public Double getDistribter_price() {
		return distribter_price;
	}

	public double getDistribter_priceEx() {
		return distribter_price != null ? distribter_price : 0;
	}

	public void setDistribter_price(double distribter_price) {
		this.distribter_price = distribter_price;
	}

	public void setDistribter_price(Double distribter_price) {
		this.distribter_price = distribter_price;
	}

	public void unSetDistribter_price() {
		this.distribter_price = null;
	}

	public String getAttribute_name() {
		return attribute_name;
	}

	public String getAttribute_nameEx() {
		return attribute_name != null ? attribute_name : "";
	}

	public void setAttribute_name(String attribute_name) {
		this.attribute_name = attribute_name;
	}

	public void unSetAttribute_name() {
		this.attribute_name = null;
	}

	public String getAttribute_value() {
		return attribute_value;
	}

	public String getAttribute_valueEx() {
		return attribute_value != null ? attribute_value : "";
	}

	public void setAttribute_value(String attribute_value) {
		this.attribute_value = attribute_value;
	}

	public void unSetAttribute_value() {
		this.attribute_value = null;
	}

	public Double getDealer_price() {
		return dealer_price;
	}

	public double getDealer_priceEx() {
		return dealer_price != null ? dealer_price : 0;
	}

	public void setDealer_price(double dealer_price) {
		this.dealer_price = dealer_price;
	}

	public void setDealer_price(Double dealer_price) {
		this.dealer_price = dealer_price;
	}

	public void unSetDealer_price() {
		this.dealer_price = null;
	}

	public Double getCustomer_price() {
		return customer_price;
	}

	public double getCustomer_priceEx() {
		return customer_price != null ? customer_price : 0;
	}

	public void setCustomer_price(double customer_price) {
		this.customer_price = customer_price;
	}

	public void setCustomer_price(Double customer_price) {
		this.customer_price = customer_price;
	}

	public void unSetCustomer_price() {
		this.customer_price = null;
	}

	public String getUnit() {
		return unit;
	}

	public String getUnitEx() {
		return unit != null ? unit : "";
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void unSetUnit() {
		this.unit = null;
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

	public String getReference_name() {
		return reference_name;
	}

	public String getReference_nameEx() {
		return reference_name != null ? reference_name : "";
	}

	public void setReference_name(String reference_name) {
		this.reference_name = reference_name;
	}

	public void unSetReference_name() {
		this.reference_name = null;
	}

	public String getRelease() {
		return release;
	}

	public String getReleaseEx() {
		return release != null ? release : "";
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public void unSetRelease() {
		this.release = null;
	}

	public String getPriority() {
		return priority;
	}

	public String getPriorityEx() {
		return priority != null ? priority : "";
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void unSetPriority() {
		this.priority = null;
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

	public String getVerified() {
		return verified;
	}

	public String getVerifiedEx() {
		return verified != null ? verified : "";
	}

	public void setVerified(String verified) {
		this.verified = verified;
	}

	public void unSetVerified() {
		this.verified = null;
	}

	public String getReference_name_1() {
		return reference_name_1;
	}

	public String getReference_name_1Ex() {
		return reference_name_1 != null ? reference_name_1 : "";
	}

	public void setReference_name_1(String reference_name_1) {
		this.reference_name_1 = reference_name_1;
	}

	public void unSetReference_name_1() {
		this.reference_name_1 = null;
	}

	public String getReference_name_2() {
		return reference_name_2;
	}

	public String getReference_name_2Ex() {
		return reference_name_2 != null ? reference_name_2 : "";
	}

	public void setReference_name_2(String reference_name_2) {
		this.reference_name_2 = reference_name_2;
	}

	public void unSetReference_name_2() {
		this.reference_name_2 = null;
	}

	public String getReference_relation_1() {
		return reference_relation_1;
	}

	public String getReference_relation_1Ex() {
		return reference_relation_1 != null ? reference_relation_1 : "";
	}

	public void setReference_relation_1(String reference_relation_1) {
		this.reference_relation_1 = reference_relation_1;
	}

	public void unSetReference_relation_1() {
		this.reference_relation_1 = null;
	}

	public String getReference_relation_2() {
		return reference_relation_2;
	}

	public String getReference_relation_2Ex() {
		return reference_relation_2 != null ? reference_relation_2 : "";
	}

	public void setReference_relation_2(String reference_relation_2) {
		this.reference_relation_2 = reference_relation_2;
	}

	public void unSetReference_relation_2() {
		this.reference_relation_2 = null;
	}

	public String getReference_no_1() {
		return reference_no_1;
	}

	public String getReference_no_1Ex() {
		return reference_no_1 != null ? reference_no_1 : "";
	}

	public void setReference_no_1(String reference_no_1) {
		this.reference_no_1 = reference_no_1;
	}

	public void unSetReference_no_1() {
		this.reference_no_1 = null;
	}

	public String getReference_no_2() {
		return reference_no_2;
	}

	public String getReference_no_2Ex() {
		return reference_no_2 != null ? reference_no_2 : "";
	}

	public void setReference_no_2(String reference_no_2) {
		this.reference_no_2 = reference_no_2;
	}

	public void unSetReference_no_2() {
		this.reference_no_2 = null;
	}

	public String getReporting_to_id() {
		return reporting_to_id;
	}

	public String getReporting_to_idEx() {
		return reporting_to_id != null ? reporting_to_id : "";
	}

	public void setReporting_to_id(String reporting_to_id) {
		this.reporting_to_id = reporting_to_id;
	}

	public void unSetReporting_to_id() {
		this.reporting_to_id = null;
	}

	public String getAssign_to_id() {
		return assign_to_id;
	}

	public String getAssign_to_idEx() {
		return assign_to_id != null ? assign_to_id : "";
	}

	public void setAssign_to_id(String assign_to_id) {
		this.assign_to_id = assign_to_id;
	}

	public void unSetAssign_to_id() {
		this.assign_to_id = null;
	}

	public String getAssign_to_name() {
		return assign_to_name;
	}

	public String getAssign_to_nameEx() {
		return assign_to_name != null ? assign_to_name : "";
	}

	public void setAssign_to_name(String assign_to_name) {
		this.assign_to_name = assign_to_name;
	}

	public void unSetAssign_to_name() {
		this.assign_to_name = null;
	}

	public String getAssign_date_str() {
		return assign_date_str;
	}

	public String getAssign_date_strEx() {
		return assign_date_str != null ? assign_date_str : "";
	}

	public void setAssign_date_str(String assign_date_str) {
		this.assign_date_str = assign_date_str;
	}

	public void unSetAssign_date_str() {
		this.assign_date_str = null;
	}

	public Long getAssign_date() {
		return assign_date;
	}

	public long getAssign_dateEx() {
		return assign_date != null ? assign_date : 0L;
	}

	public void setAssign_date(long assign_date) {
		this.assign_date = assign_date;
	}

	public void setAssign_date(Long assign_date) {
		this.assign_date = assign_date;
	}

	public void unSetAssign_date() {
		this.assign_date = null;
	}

	public String getCompletion_date_str() {
		return completion_date_str;
	}

	public String getCompletion_date_strEx() {
		return completion_date_str != null ? completion_date_str : "";
	}

	public void setCompletion_date_str(String completion_date_str) {
		this.completion_date_str = completion_date_str;
	}

	public void unSetCompletion_date_str() {
		this.completion_date_str = null;
	}

	public Long getCompletion_date() {
		return completion_date;
	}

	public long getCompletion_dateEx() {
		return completion_date != null ? completion_date : 0L;
	}

	public void setCompletion_date(long completion_date) {
		this.completion_date = completion_date;
	}

	public void setCompletion_date(Long completion_date) {
		this.completion_date = completion_date;
	}

	public void unSetCompletion_date() {
		this.completion_date = null;
	}

	public String getDob_str() {
		return dob_str;
	}

	public String getDob_strEx() {
		return dob_str != null ? dob_str : "";
	}

	public void setDob_str(String dob_str) {
		this.dob_str = dob_str;
	}

	public void unSetDob_str() {
		this.dob_str = null;
	}

	public String getPrimary_contact_id() {
		return primary_contact_id;
	}

	public String getPrimary_contact_idEx() {
		return primary_contact_id != null ? primary_contact_id : "";
	}

	public void setPrimary_contact_id(String primary_contact_id) {
		this.primary_contact_id = primary_contact_id;
	}

	public void unSetPrimary_contact_id() {
		this.primary_contact_id = null;
	}

	public String getFlat_id() {
		return flat_id;
	}

	public String getFlat_idEx() {
		return flat_id != null ? flat_id : "";
	}

	public void setFlat_id(String flat_id) {
		this.flat_id = flat_id;
	}

	public void unSetFlat_id() {
		this.flat_id = null;
	}

	public String getFlat_no() {
		return flat_no;
	}

	public String getFlat_noEx() {
		return flat_no != null ? flat_no : "";
	}

	public void setFlat_no(String flat_no) {
		this.flat_no = flat_no;
	}

	public void unSetFlat_no() {
		this.flat_no = null;
	}

	public Long getDob() {
		return dob;
	}

	public long getDobEx() {
		return dob != null ? dob : 0L;
	}

	public void setDob(long dob) {
		this.dob = dob;
	}

	public void setDob(Long dob) {
		this.dob = dob;
	}

	public void unSetDob() {
		this.dob = null;
	}

	public Integer getNotification_orders() {
		return notification_orders;
	}

	public int getNotification_ordersEx() {
		return notification_orders != null ? notification_orders : 0;
	}

	public void setNotification_orders(int notification_orders) {
		this.notification_orders = notification_orders;
	}

	public void setNotification_orders(Integer notification_orders) {
		this.notification_orders = notification_orders;
	}

	public void unSetNotification_orders() {
		this.notification_orders = null;
	}

	public Integer getNotification_offers() {
		return notification_offers;
	}

	public int getNotification_offersEx() {
		return notification_offers != null ? notification_offers : 0;
	}

	public void setNotification_offers(int notification_offers) {
		this.notification_offers = notification_offers;
	}

	public void setNotification_offers(Integer notification_offers) {
		this.notification_offers = notification_offers;
	}

	public void unSetNotification_offers() {
		this.notification_offers = null;
	}

	public Integer getNotification_communication() {
		return notification_communication;
	}

	public int getNotification_communicationEx() {
		return notification_communication != null ? notification_communication : 0;
	}

	public void setNotification_communication(int notification_communication) {
		this.notification_communication = notification_communication;
	}

	public void setNotification_communication(Integer notification_communication) {
		this.notification_communication = notification_communication;
	}

	public void unSetNotification_communication() {
		this.notification_communication = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Long getUpdation_time() {
		return updation_time;
	}

	public void setUpdation_time(Long updation_time) {
		this.updation_time = updation_time;
	}


	public String getOwner_id() {
		return owner_id;
	}

	public String getOwner_idEx() {
		return owner_id != null ? owner_id : "";
	}

	public void setOwner_id(String owner_id) {
		this.owner_id = owner_id;
	}

	public void unSetOwner_id() {
		this.owner_id = null;
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