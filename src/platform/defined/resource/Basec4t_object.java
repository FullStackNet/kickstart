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
	private String unit = null;
	private String user_id = null;
	private String reporting_to_id = null;
	private String dob_str = null;
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
	public static String FIELD_UNIT = "unit";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_REPORTING_TO_ID = "reporting_to_id";
	public static String FIELD_DOB_STR = "dob_str";
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
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field community_typeField = new Field("community_type", "String");
		community_typeField.setLength(128);
		metaData.addField(community_typeField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field object_typeField = new Field("object_type", "String");
		object_typeField.setLength(128);
		metaData.addField(object_typeField);

		Field typeField = new Field("type", "String");
		typeField.setLength(128);
		metaData.addField(typeField);

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

		Field unitField = new Field("unit", "String");
		unitField.setLength(32);
		metaData.addField(unitField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field reporting_to_idField = new Field("reporting_to_id", "String");
		reporting_to_idField.setLength(128);
		metaData.addField(reporting_to_idField);

		Field dob_strField = new Field("dob_str", "String");
		dob_strField.setLength(16);
		metaData.addField(dob_strField);

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
		this.unit = obj.unit;
		this.user_id = obj.user_id;
		this.reporting_to_id = obj.reporting_to_id;
		this.dob_str = obj.dob_str;
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
		if(unit != null)
			map.put("unit", unit);
		if(user_id != null)
			map.put("user_id", user_id);
		if(reporting_to_id != null)
			map.put("reporting_to_id", reporting_to_id);
		if(dob_str != null)
			map.put("dob_str", dob_str);
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
		if(unit != null)
			map.put("unit", unit);
		if(user_id != null)
			map.put("user_id", user_id);
		if(reporting_to_id != null)
			map.put("reporting_to_id", reporting_to_id);
		if(dob_str != null)
			map.put("dob_str", dob_str);
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
		unit = (String) map.get("unit");
		user_id = (String) map.get("user_id");
		reporting_to_id = (String) map.get("reporting_to_id");
		dob_str = (String) map.get("dob_str");
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

		Object unitObj = map.get("unit");
		if(unitObj != null)
			unit = unitObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object reporting_to_idObj = map.get("reporting_to_id");
		if(reporting_to_idObj != null)
			reporting_to_id = reporting_to_idObj.toString();

		Object dob_strObj = map.get("dob_str");
		if(dob_strObj != null)
			dob_str = dob_strObj.toString();

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