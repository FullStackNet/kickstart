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
	private String short_name = null;
	private String brand_name = null;
	private String parent_id = null;
	private String community_id = null;
	private String community_type = null;
	private String customer_id = null;
	private String object_type = null;
	private String type = null;
	private String gender = null;
	private String floor_no = null;
	private String email_id = null;
	private String mobile_no = null;
	private String status = null;
	private String role = null;
	private String address = null;
	private String area = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String feature_distributer_management = null;
	private String feature_dealer_management = null;
	private Integer no_of_flats = null;
	private String block_id = null;
	private String profession = null;
	private String company_name = null;
	private String domain = null;
	private String designation = null;
	private String resident = null;
	private String zip_code = null;
	private String feature_send_sms = null;
	private String feature_send_email = null;
	private Double mrp_price = null;
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
	private Long creation_time = null;
	private Long updation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_SHORT_NAME = "short_name";
	public static String FIELD_BRAND_NAME = "brand_name";
	public static String FIELD_PARENT_ID = "parent_id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_COMMUNITY_TYPE = "community_type";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_OBJECT_TYPE = "object_type";
	public static String FIELD_TYPE = "type";
	public static String FIELD_GENDER = "gender";
	public static String FIELD_FLOOR_NO = "floor_no";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_STATUS = "status";
	public static String FIELD_ROLE = "role";
	public static String FIELD_ADDRESS = "address";
	public static String FIELD_AREA = "area";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_FEATURE_DISTRIBUTER_MANAGEMENT = "feature_distributer_management";
	public static String FIELD_FEATURE_DEALER_MANAGEMENT = "feature_dealer_management";
	public static String FIELD_NO_OF_FLATS = "no_of_flats";
	public static String FIELD_BLOCK_ID = "block_id";
	public static String FIELD_PROFESSION = "profession";
	public static String FIELD_COMPANY_NAME = "company_name";
	public static String FIELD_DOMAIN = "domain";
	public static String FIELD_DESIGNATION = "designation";
	public static String FIELD_RESIDENT = "resident";
	public static String FIELD_ZIP_CODE = "zip_code";
	public static String FIELD_FEATURE_SEND_SMS = "feature_send_sms";
	public static String FIELD_FEATURE_SEND_EMAIL = "feature_send_email";
	public static String FIELD_MRP_PRICE = "mrp_price";
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
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_UPDATION_TIME = "updation_time";
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

		Field short_nameField = new Field("short_name", "String");
		short_nameField.setLength(128);
		metaData.addField(short_nameField);

		Field brand_nameField = new Field("brand_name", "String");
		brand_nameField.setLength(128);
		metaData.addField(brand_nameField);

		Field parent_idField = new Field("parent_id", "String");
		parent_idField.setLength(128);
		metaData.addField(parent_idField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setIndexed(true);
		community_idField.setLength(128);
		metaData.addField(community_idField);

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

		Field domainField = new Field("domain", "String");
		domainField.setLength(128);
		metaData.addField(domainField);

		Field designationField = new Field("designation", "String");
		designationField.setLength(128);
		metaData.addField(designationField);

		Field residentField = new Field("resident", "String");
		residentField.setLength(1);
		metaData.addField(residentField);

		Field zip_codeField = new Field("zip_code", "String");
		zip_codeField.setLength(128);
		metaData.addField(zip_codeField);

		Field feature_send_smsField = new Field("feature_send_sms", "String");
		feature_send_smsField.setLength(128);
		metaData.addField(feature_send_smsField);

		Field feature_send_emailField = new Field("feature_send_email", "String");
		feature_send_emailField.setLength(128);
		metaData.addField(feature_send_emailField);

		Field mrp_priceField = new Field("mrp_price", "double");
		metaData.addField(mrp_priceField);

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

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field updation_timeField = new Field("updation_time", "timestamp");
		metaData.addField(updation_timeField);

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
		this.short_name = obj.short_name;
		this.brand_name = obj.brand_name;
		this.parent_id = obj.parent_id;
		this.community_id = obj.community_id;
		this.community_type = obj.community_type;
		this.customer_id = obj.customer_id;
		this.object_type = obj.object_type;
		this.type = obj.type;
		this.gender = obj.gender;
		this.floor_no = obj.floor_no;
		this.email_id = obj.email_id;
		this.mobile_no = obj.mobile_no;
		this.status = obj.status;
		this.role = obj.role;
		this.address = obj.address;
		this.area = obj.area;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.feature_distributer_management = obj.feature_distributer_management;
		this.feature_dealer_management = obj.feature_dealer_management;
		this.no_of_flats = obj.no_of_flats;
		this.block_id = obj.block_id;
		this.profession = obj.profession;
		this.company_name = obj.company_name;
		this.domain = obj.domain;
		this.designation = obj.designation;
		this.resident = obj.resident;
		this.zip_code = obj.zip_code;
		this.feature_send_sms = obj.feature_send_sms;
		this.feature_send_email = obj.feature_send_email;
		this.mrp_price = obj.mrp_price;
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
		this.creation_time = obj.creation_time;
		this.updation_time = obj.updation_time;
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
		if(short_name != null)
			map.put("short_name", short_name);
		if(brand_name != null)
			map.put("brand_name", brand_name);
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_type != null)
			map.put("community_type", community_type);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(object_type != null)
			map.put("object_type", object_type);
		if(type != null)
			map.put("type", type);
		if(gender != null)
			map.put("gender", gender);
		if(floor_no != null)
			map.put("floor_no", floor_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
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
		if(domain != null)
			map.put("domain", domain);
		if(designation != null)
			map.put("designation", designation);
		if(resident != null)
			map.put("resident", resident);
		if(zip_code != null)
			map.put("zip_code", zip_code);
		if(feature_send_sms != null)
			map.put("feature_send_sms", feature_send_sms);
		if(feature_send_email != null)
			map.put("feature_send_email", feature_send_email);
		if(mrp_price != null)
			map.put("mrp_price", mrp_price);
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
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(updation_time != null)
			map.put("updation_time", updation_time);
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
		if(short_name != null)
			map.put("short_name", short_name);
		if(brand_name != null)
			map.put("brand_name", brand_name);
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_type != null)
			map.put("community_type", community_type);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(object_type != null)
			map.put("object_type", object_type);
		if(type != null)
			map.put("type", type);
		if(gender != null)
			map.put("gender", gender);
		if(floor_no != null)
			map.put("floor_no", floor_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
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
		if(domain != null)
			map.put("domain", domain);
		if(designation != null)
			map.put("designation", designation);
		if(resident != null)
			map.put("resident", resident);
		if(zip_code != null)
			map.put("zip_code", zip_code);
		if(feature_send_sms != null)
			map.put("feature_send_sms", feature_send_sms);
		if(feature_send_email != null)
			map.put("feature_send_email", feature_send_email);
		if(mrp_price != null)
			map.put("mrp_price", mrp_price);
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
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(updation_time != null)
			map.put("updation_time", updation_time);
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
		brand_name = (String) map.get("brand_name");
		parent_id = (String) map.get("parent_id");
		community_id = (String) map.get("community_id");
		community_type = (String) map.get("community_type");
		customer_id = (String) map.get("customer_id");
		object_type = (String) map.get("object_type");
		type = (String) map.get("type");
		gender = (String) map.get("gender");
		floor_no = (String) map.get("floor_no");
		email_id = (String) map.get("email_id");
		mobile_no = (String) map.get("mobile_no");
		status = (String) map.get("status");
		role = (String) map.get("role");
		address = (String) map.get("address");
		area = (String) map.get("area");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		feature_distributer_management = (String) map.get("feature_distributer_management");
		feature_dealer_management = (String) map.get("feature_dealer_management");
		no_of_flats = (Integer) map.get("no_of_flats");
		block_id = (String) map.get("block_id");
		profession = (String) map.get("profession");
		company_name = (String) map.get("company_name");
		domain = (String) map.get("domain");
		designation = (String) map.get("designation");
		resident = (String) map.get("resident");
		zip_code = (String) map.get("zip_code");
		feature_send_sms = (String) map.get("feature_send_sms");
		feature_send_email = (String) map.get("feature_send_email");
		mrp_price = (Double) map.get("mrp_price");
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
		creation_time = (Long) map.get("creation_time");
		updation_time = (Long) map.get("updation_time");
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

		Object brand_nameObj = map.get("brand_name");
		if(brand_nameObj != null)
			brand_name = brand_nameObj.toString();

		Object parent_idObj = map.get("parent_id");
		if(parent_idObj != null)
			parent_id = parent_idObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

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

		Object domainObj = map.get("domain");
		if(domainObj != null)
			domain = domainObj.toString();

		Object designationObj = map.get("designation");
		if(designationObj != null)
			designation = designationObj.toString();

		Object residentObj = map.get("resident");
		if(residentObj != null)
			resident = residentObj.toString();

		Object zip_codeObj = map.get("zip_code");
		if(zip_codeObj != null)
			zip_code = zip_codeObj.toString();

		Object feature_send_smsObj = map.get("feature_send_sms");
		if(feature_send_smsObj != null)
			feature_send_sms = feature_send_smsObj.toString();

		Object feature_send_emailObj = map.get("feature_send_email");
		if(feature_send_emailObj != null)
			feature_send_email = feature_send_emailObj.toString();

		Object mrp_priceObj = map.get("mrp_price");
		if(mrp_priceObj != null)
			mrp_price = new Double(mrp_priceObj.toString());

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

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object updation_timeObj = map.get("updation_time");
		if(updation_timeObj != null)
			updation_time = (Long) updation_timeObj;

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