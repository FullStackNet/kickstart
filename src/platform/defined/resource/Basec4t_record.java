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
public abstract class Basec4t_record extends BaseResource {
	private String id = null;
	private String community_id = null;
	private String community_name = null;
	private String customer_id = null;
	private String record_type = null;
	private String record_sub_type = null;
	private String location_type = null;
	private String title = null;
	private String bay_id = null;
	private String bay_name = null;
	private String supervisor_id = null;
	private String supervisor_name = null;
	private String flat_id = null;
	private String flat_no = null;
	private String user_id = null;
	private String user_name = null;
	private String product_id = null;
	private String product_name = null;
	private String product_unit = null;
	private String reference_id = null;
	private String reference_name = null;
	private String mobile_no = null;
	private String address = null;
	private String area = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String zip_code = null;
	private String land_mark = null;
	private String company_name = null;
	private String record_status = null;
	private String designation = null;
	private Double quantity = null;
	private Double total_vat = null;
	private Long total_items = null;
	private Double total_service_tax = null;
	private Double total_service_charge = null;
	private Double total_amount = null;
	private Double total_products = null;
	private Double total_quantity = null;
	private String recipients = null;
	private String description = null;
	private Long event_date = null;
	private String event_date_str = null;
	private Long expiry_date = null;
	private String expiry_date_str = null;
	private String last_updated_message = null;
	private String last_updated_by = null;
	private Long last_updated = null;
	private Long sent_time = null;
	private Long creation_time = null;
	private String sent = null;
	private String send_sms = null;
	private String send_email = null;
	private Integer total_sent = null;
	private Integer total_user_sent = null;
	private Integer total_sms_sent = null;
	private Integer total_email_sent = null;
	private Integer total_app_notification_sent = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_COMMUNITY_NAME = "community_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_RECORD_TYPE = "record_type";
	public static String FIELD_RECORD_SUB_TYPE = "record_sub_type";
	public static String FIELD_LOCATION_TYPE = "location_type";
	public static String FIELD_TITLE = "title";
	public static String FIELD_BAY_ID = "bay_id";
	public static String FIELD_BAY_NAME = "bay_name";
	public static String FIELD_SUPERVISOR_ID = "supervisor_id";
	public static String FIELD_SUPERVISOR_NAME = "supervisor_name";
	public static String FIELD_FLAT_ID = "flat_id";
	public static String FIELD_FLAT_NO = "flat_no";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_PRODUCT_ID = "product_id";
	public static String FIELD_PRODUCT_NAME = "product_name";
	public static String FIELD_PRODUCT_UNIT = "product_unit";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_REFERENCE_NAME = "reference_name";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_ADDRESS = "address";
	public static String FIELD_AREA = "area";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_ZIP_CODE = "zip_code";
	public static String FIELD_LAND_MARK = "land_mark";
	public static String FIELD_COMPANY_NAME = "company_name";
	public static String FIELD_RECORD_STATUS = "record_status";
	public static String FIELD_DESIGNATION = "designation";
	public static String FIELD_QUANTITY = "quantity";
	public static String FIELD_TOTAL_VAT = "total_vat";
	public static String FIELD_TOTAL_ITEMS = "total_items";
	public static String FIELD_TOTAL_SERVICE_TAX = "total_service_tax";
	public static String FIELD_TOTAL_SERVICE_CHARGE = "total_service_charge";
	public static String FIELD_TOTAL_AMOUNT = "total_amount";
	public static String FIELD_TOTAL_PRODUCTS = "total_products";
	public static String FIELD_TOTAL_QUANTITY = "total_quantity";
	public static String FIELD_RECIPIENTS = "recipients";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_EVENT_DATE = "event_date";
	public static String FIELD_EVENT_DATE_STR = "event_date_str";
	public static String FIELD_EXPIRY_DATE = "expiry_date";
	public static String FIELD_EXPIRY_DATE_STR = "expiry_date_str";
	public static String FIELD_LAST_UPDATED_MESSAGE = "last_updated_message";
	public static String FIELD_LAST_UPDATED_BY = "last_updated_by";
	public static String FIELD_LAST_UPDATED = "last_updated";
	public static String FIELD_SENT_TIME = "sent_time";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_SENT = "sent";
	public static String FIELD_SEND_SMS = "send_sms";
	public static String FIELD_SEND_EMAIL = "send_email";
	public static String FIELD_TOTAL_SENT = "total_sent";
	public static String FIELD_TOTAL_USER_SENT = "total_user_sent";
	public static String FIELD_TOTAL_SMS_SENT = "total_sms_sent";
	public static String FIELD_TOTAL_EMAIL_SENT = "total_email_sent";
	public static String FIELD_TOTAL_APP_NOTIFICATION_SENT = "total_app_notification_sent";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_record");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setIndexed(true);
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field community_nameField = new Field("community_name", "String");
		community_nameField.setIndexed(true);
		community_nameField.setLength(128);
		metaData.addField(community_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field record_typeField = new Field("record_type", "String");
		record_typeField.setLength(512);
		metaData.addField(record_typeField);

		Field record_sub_typeField = new Field("record_sub_type", "String");
		record_sub_typeField.setLength(512);
		metaData.addField(record_sub_typeField);

		Field location_typeField = new Field("location_type", "String");
		location_typeField.setLength(512);
		metaData.addField(location_typeField);

		Field titleField = new Field("title", "String");
		titleField.setLength(512);
		metaData.addField(titleField);

		Field bay_idField = new Field("bay_id", "String");
		bay_idField.setIndexed(true);
		bay_idField.setLength(128);
		metaData.addField(bay_idField);

		Field bay_nameField = new Field("bay_name", "String");
		bay_nameField.setIndexed(true);
		bay_nameField.setLength(128);
		metaData.addField(bay_nameField);

		Field supervisor_idField = new Field("supervisor_id", "String");
		supervisor_idField.setIndexed(true);
		supervisor_idField.setLength(128);
		metaData.addField(supervisor_idField);

		Field supervisor_nameField = new Field("supervisor_name", "String");
		supervisor_nameField.setIndexed(true);
		supervisor_nameField.setLength(128);
		metaData.addField(supervisor_nameField);

		Field flat_idField = new Field("flat_id", "String");
		flat_idField.setLength(512);
		metaData.addField(flat_idField);

		Field flat_noField = new Field("flat_no", "String");
		flat_noField.setLength(512);
		metaData.addField(flat_noField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(512);
		metaData.addField(user_idField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(512);
		metaData.addField(user_nameField);

		Field product_idField = new Field("product_id", "String");
		product_idField.setLength(512);
		metaData.addField(product_idField);

		Field product_nameField = new Field("product_name", "String");
		product_nameField.setLength(512);
		metaData.addField(product_nameField);

		Field product_unitField = new Field("product_unit", "String");
		product_unitField.setLength(128);
		metaData.addField(product_unitField);

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(128);
		metaData.addField(reference_idField);

		Field reference_nameField = new Field("reference_name", "String");
		reference_nameField.setLength(512);
		metaData.addField(reference_nameField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(32);
		metaData.addField(mobile_noField);

		Field addressField = new Field("address", "String");
		addressField.setLength(512);
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

		Field zip_codeField = new Field("zip_code", "String");
		zip_codeField.setLength(10);
		metaData.addField(zip_codeField);

		Field land_markField = new Field("land_mark", "String");
		land_markField.setLength(128);
		metaData.addField(land_markField);

		Field company_nameField = new Field("company_name", "String");
		company_nameField.setLength(128);
		metaData.addField(company_nameField);

		Field record_statusField = new Field("record_status", "String");
		record_statusField.setLength(32);
		metaData.addField(record_statusField);

		Field designationField = new Field("designation", "String");
		designationField.setLength(512);
		metaData.addField(designationField);

		Field quantityField = new Field("quantity", "Double");
		metaData.addField(quantityField);

		Field total_vatField = new Field("total_vat", "Double");
		metaData.addField(total_vatField);

		Field total_itemsField = new Field("total_items", "long");
		metaData.addField(total_itemsField);

		Field total_service_taxField = new Field("total_service_tax", "Double");
		metaData.addField(total_service_taxField);

		Field total_service_chargeField = new Field("total_service_charge", "Double");
		metaData.addField(total_service_chargeField);

		Field total_amountField = new Field("total_amount", "Double");
		metaData.addField(total_amountField);

		Field total_productsField = new Field("total_products", "Double");
		metaData.addField(total_productsField);

		Field total_quantityField = new Field("total_quantity", "Double");
		metaData.addField(total_quantityField);

		Field recipientsField = new Field("recipients", "String");
		recipientsField.setLength(512);
		metaData.addField(recipientsField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(4096);
		metaData.addField(descriptionField);

		Field event_dateField = new Field("event_date", "timestamp");
		event_dateField.setIndexed(true);
		metaData.addField(event_dateField);

		Field event_date_strField = new Field("event_date_str", "String");
		event_date_strField.setLength(32);
		metaData.addField(event_date_strField);

		Field expiry_dateField = new Field("expiry_date", "timestamp");
		metaData.addField(expiry_dateField);

		Field expiry_date_strField = new Field("expiry_date_str", "String");
		expiry_date_strField.setLength(32);
		metaData.addField(expiry_date_strField);

		Field last_updated_messageField = new Field("last_updated_message", "String");
		metaData.addField(last_updated_messageField);

		Field last_updated_byField = new Field("last_updated_by", "String");
		metaData.addField(last_updated_byField);

		Field last_updatedField = new Field("last_updated", "timestamp");
		metaData.addField(last_updatedField);

		Field sent_timeField = new Field("sent_time", "timestamp");
		metaData.addField(sent_timeField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field sentField = new Field("sent", "String");
		sentField.setDefaultValue("N");
		sentField.setLength(1);
		metaData.addField(sentField);

		Field send_smsField = new Field("send_sms", "String");
		send_smsField.setDefaultValue("N");
		send_smsField.setLength(1);
		metaData.addField(send_smsField);

		Field send_emailField = new Field("send_email", "String");
		send_emailField.setDefaultValue("N");
		send_emailField.setLength(1);
		metaData.addField(send_emailField);

		Field total_sentField = new Field("total_sent", "int");
		metaData.addField(total_sentField);

		Field total_user_sentField = new Field("total_user_sent", "int");
		metaData.addField(total_user_sentField);

		Field total_sms_sentField = new Field("total_sms_sent", "int");
		metaData.addField(total_sms_sentField);

		Field total_email_sentField = new Field("total_email_sent", "int");
		metaData.addField(total_email_sentField);

		Field total_app_notification_sentField = new Field("total_app_notification_sent", "int");
		metaData.addField(total_app_notification_sentField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_record");

		metaData.setCluster("DB_RECORD");
	}

	public Basec4t_record() {}

	public Basec4t_record(Basec4t_record obj) {
		this.id = obj.id;
		this.community_id = obj.community_id;
		this.community_name = obj.community_name;
		this.customer_id = obj.customer_id;
		this.record_type = obj.record_type;
		this.record_sub_type = obj.record_sub_type;
		this.location_type = obj.location_type;
		this.title = obj.title;
		this.bay_id = obj.bay_id;
		this.bay_name = obj.bay_name;
		this.supervisor_id = obj.supervisor_id;
		this.supervisor_name = obj.supervisor_name;
		this.flat_id = obj.flat_id;
		this.flat_no = obj.flat_no;
		this.user_id = obj.user_id;
		this.user_name = obj.user_name;
		this.product_id = obj.product_id;
		this.product_name = obj.product_name;
		this.product_unit = obj.product_unit;
		this.reference_id = obj.reference_id;
		this.reference_name = obj.reference_name;
		this.mobile_no = obj.mobile_no;
		this.address = obj.address;
		this.area = obj.area;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.zip_code = obj.zip_code;
		this.land_mark = obj.land_mark;
		this.company_name = obj.company_name;
		this.record_status = obj.record_status;
		this.designation = obj.designation;
		this.quantity = obj.quantity;
		this.total_vat = obj.total_vat;
		this.total_items = obj.total_items;
		this.total_service_tax = obj.total_service_tax;
		this.total_service_charge = obj.total_service_charge;
		this.total_amount = obj.total_amount;
		this.total_products = obj.total_products;
		this.total_quantity = obj.total_quantity;
		this.recipients = obj.recipients;
		this.description = obj.description;
		this.event_date = obj.event_date;
		this.event_date_str = obj.event_date_str;
		this.expiry_date = obj.expiry_date;
		this.expiry_date_str = obj.expiry_date_str;
		this.last_updated_message = obj.last_updated_message;
		this.last_updated_by = obj.last_updated_by;
		this.last_updated = obj.last_updated;
		this.sent_time = obj.sent_time;
		this.creation_time = obj.creation_time;
		this.sent = obj.sent;
		this.send_sms = obj.send_sms;
		this.send_email = obj.send_email;
		this.total_sent = obj.total_sent;
		this.total_user_sent = obj.total_user_sent;
		this.total_sms_sent = obj.total_sms_sent;
		this.total_email_sent = obj.total_email_sent;
		this.total_app_notification_sent = obj.total_app_notification_sent;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(sent == null)
			sent = "N";
		if(send_sms == null)
			send_sms = "N";
		if(send_email == null)
			send_email = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(record_type != null)
			map.put("record_type", record_type);
		if(record_sub_type != null)
			map.put("record_sub_type", record_sub_type);
		if(location_type != null)
			map.put("location_type", location_type);
		if(title != null)
			map.put("title", title);
		if(bay_id != null)
			map.put("bay_id", bay_id);
		if(bay_name != null)
			map.put("bay_name", bay_name);
		if(supervisor_id != null)
			map.put("supervisor_id", supervisor_id);
		if(supervisor_name != null)
			map.put("supervisor_name", supervisor_name);
		if(flat_id != null)
			map.put("flat_id", flat_id);
		if(flat_no != null)
			map.put("flat_no", flat_no);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(product_id != null)
			map.put("product_id", product_id);
		if(product_name != null)
			map.put("product_name", product_name);
		if(product_unit != null)
			map.put("product_unit", product_unit);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_name != null)
			map.put("reference_name", reference_name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
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
		if(zip_code != null)
			map.put("zip_code", zip_code);
		if(land_mark != null)
			map.put("land_mark", land_mark);
		if(company_name != null)
			map.put("company_name", company_name);
		if(record_status != null)
			map.put("record_status", record_status);
		if(designation != null)
			map.put("designation", designation);
		if(quantity != null)
			map.put("quantity", quantity);
		if(total_vat != null)
			map.put("total_vat", total_vat);
		if(total_items != null)
			map.put("total_items", total_items);
		if(total_service_tax != null)
			map.put("total_service_tax", total_service_tax);
		if(total_service_charge != null)
			map.put("total_service_charge", total_service_charge);
		if(total_amount != null)
			map.put("total_amount", total_amount);
		if(total_products != null)
			map.put("total_products", total_products);
		if(total_quantity != null)
			map.put("total_quantity", total_quantity);
		if(recipients != null)
			map.put("recipients", recipients);
		if(description != null)
			map.put("description", description);
		if(event_date != null)
			map.put("event_date", event_date);
		if(event_date_str != null)
			map.put("event_date_str", event_date_str);
		if(expiry_date != null)
			map.put("expiry_date", expiry_date);
		if(expiry_date_str != null)
			map.put("expiry_date_str", expiry_date_str);
		if(last_updated_message != null)
			map.put("last_updated_message", last_updated_message);
		if(last_updated_by != null)
			map.put("last_updated_by", last_updated_by);
		if(last_updated != null)
			map.put("last_updated", last_updated);
		if(sent_time != null)
			map.put("sent_time", sent_time);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(sent != null)
			map.put("sent", sent);
		if(send_sms != null)
			map.put("send_sms", send_sms);
		if(send_email != null)
			map.put("send_email", send_email);
		if(total_sent != null)
			map.put("total_sent", total_sent);
		if(total_user_sent != null)
			map.put("total_user_sent", total_user_sent);
		if(total_sms_sent != null)
			map.put("total_sms_sent", total_sms_sent);
		if(total_email_sent != null)
			map.put("total_email_sent", total_email_sent);
		if(total_app_notification_sent != null)
			map.put("total_app_notification_sent", total_app_notification_sent);
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
		if(community_name != null)
			map.put("community_name", community_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(record_type != null)
			map.put("record_type", record_type);
		if(record_sub_type != null)
			map.put("record_sub_type", record_sub_type);
		if(location_type != null)
			map.put("location_type", location_type);
		if(title != null)
			map.put("title", title);
		if(bay_id != null)
			map.put("bay_id", bay_id);
		if(bay_name != null)
			map.put("bay_name", bay_name);
		if(supervisor_id != null)
			map.put("supervisor_id", supervisor_id);
		if(supervisor_name != null)
			map.put("supervisor_name", supervisor_name);
		if(flat_id != null)
			map.put("flat_id", flat_id);
		if(flat_no != null)
			map.put("flat_no", flat_no);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(product_id != null)
			map.put("product_id", product_id);
		if(product_name != null)
			map.put("product_name", product_name);
		if(product_unit != null)
			map.put("product_unit", product_unit);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_name != null)
			map.put("reference_name", reference_name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
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
		if(zip_code != null)
			map.put("zip_code", zip_code);
		if(land_mark != null)
			map.put("land_mark", land_mark);
		if(company_name != null)
			map.put("company_name", company_name);
		if(record_status != null)
			map.put("record_status", record_status);
		if(designation != null)
			map.put("designation", designation);
		if(quantity != null)
			map.put("quantity", quantity);
		if(total_vat != null)
			map.put("total_vat", total_vat);
		if(total_items != null)
			map.put("total_items", total_items);
		if(total_service_tax != null)
			map.put("total_service_tax", total_service_tax);
		if(total_service_charge != null)
			map.put("total_service_charge", total_service_charge);
		if(total_amount != null)
			map.put("total_amount", total_amount);
		if(total_products != null)
			map.put("total_products", total_products);
		if(total_quantity != null)
			map.put("total_quantity", total_quantity);
		if(recipients != null)
			map.put("recipients", recipients);
		if(description != null)
			map.put("description", description);
		if(event_date != null)
			map.put("event_date", event_date);
		if(event_date_str != null)
			map.put("event_date_str", event_date_str);
		if(expiry_date != null)
			map.put("expiry_date", expiry_date);
		if(expiry_date_str != null)
			map.put("expiry_date_str", expiry_date_str);
		if(last_updated_message != null)
			map.put("last_updated_message", last_updated_message);
		if(last_updated_by != null)
			map.put("last_updated_by", last_updated_by);
		if(last_updated != null)
			map.put("last_updated", last_updated);
		if(sent_time != null)
			map.put("sent_time", sent_time);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(sent != null)
			map.put("sent", sent);
		if(send_sms != null)
			map.put("send_sms", send_sms);
		if(send_email != null)
			map.put("send_email", send_email);
		if(total_sent != null)
			map.put("total_sent", total_sent);
		if(total_user_sent != null)
			map.put("total_user_sent", total_user_sent);
		if(total_sms_sent != null)
			map.put("total_sms_sent", total_sms_sent);
		if(total_email_sent != null)
			map.put("total_email_sent", total_email_sent);
		if(total_app_notification_sent != null)
			map.put("total_app_notification_sent", total_app_notification_sent);
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
		community_name = (String) map.get("community_name");
		customer_id = (String) map.get("customer_id");
		record_type = (String) map.get("record_type");
		record_sub_type = (String) map.get("record_sub_type");
		location_type = (String) map.get("location_type");
		title = (String) map.get("title");
		bay_id = (String) map.get("bay_id");
		bay_name = (String) map.get("bay_name");
		supervisor_id = (String) map.get("supervisor_id");
		supervisor_name = (String) map.get("supervisor_name");
		flat_id = (String) map.get("flat_id");
		flat_no = (String) map.get("flat_no");
		user_id = (String) map.get("user_id");
		user_name = (String) map.get("user_name");
		product_id = (String) map.get("product_id");
		product_name = (String) map.get("product_name");
		product_unit = (String) map.get("product_unit");
		reference_id = (String) map.get("reference_id");
		reference_name = (String) map.get("reference_name");
		mobile_no = (String) map.get("mobile_no");
		address = (String) map.get("address");
		area = (String) map.get("area");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		zip_code = (String) map.get("zip_code");
		land_mark = (String) map.get("land_mark");
		company_name = (String) map.get("company_name");
		record_status = (String) map.get("record_status");
		designation = (String) map.get("designation");
		quantity = (Double) map.get("quantity");
		total_vat = (Double) map.get("total_vat");
		total_items = (Long) map.get("total_items");
		total_service_tax = (Double) map.get("total_service_tax");
		total_service_charge = (Double) map.get("total_service_charge");
		total_amount = (Double) map.get("total_amount");
		total_products = (Double) map.get("total_products");
		total_quantity = (Double) map.get("total_quantity");
		recipients = (String) map.get("recipients");
		description = (String) map.get("description");
		event_date = (Long) map.get("event_date");
		event_date_str = (String) map.get("event_date_str");
		expiry_date = (Long) map.get("expiry_date");
		expiry_date_str = (String) map.get("expiry_date_str");
		last_updated_message = (String) map.get("last_updated_message");
		last_updated_by = (String) map.get("last_updated_by");
		last_updated = (Long) map.get("last_updated");
		sent_time = (Long) map.get("sent_time");
		creation_time = (Long) map.get("creation_time");
		sent = (String) map.get("sent");
		send_sms = (String) map.get("send_sms");
		send_email = (String) map.get("send_email");
		total_sent = (Integer) map.get("total_sent");
		total_user_sent = (Integer) map.get("total_user_sent");
		total_sms_sent = (Integer) map.get("total_sms_sent");
		total_email_sent = (Integer) map.get("total_email_sent");
		total_app_notification_sent = (Integer) map.get("total_app_notification_sent");
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

		Object community_nameObj = map.get("community_name");
		if(community_nameObj != null)
			community_name = community_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object record_typeObj = map.get("record_type");
		if(record_typeObj != null)
			record_type = record_typeObj.toString();

		Object record_sub_typeObj = map.get("record_sub_type");
		if(record_sub_typeObj != null)
			record_sub_type = record_sub_typeObj.toString();

		Object location_typeObj = map.get("location_type");
		if(location_typeObj != null)
			location_type = location_typeObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object bay_idObj = map.get("bay_id");
		if(bay_idObj != null)
			bay_id = bay_idObj.toString();

		Object bay_nameObj = map.get("bay_name");
		if(bay_nameObj != null)
			bay_name = bay_nameObj.toString();

		Object supervisor_idObj = map.get("supervisor_id");
		if(supervisor_idObj != null)
			supervisor_id = supervisor_idObj.toString();

		Object supervisor_nameObj = map.get("supervisor_name");
		if(supervisor_nameObj != null)
			supervisor_name = supervisor_nameObj.toString();

		Object flat_idObj = map.get("flat_id");
		if(flat_idObj != null)
			flat_id = flat_idObj.toString();

		Object flat_noObj = map.get("flat_no");
		if(flat_noObj != null)
			flat_no = flat_noObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

		Object product_idObj = map.get("product_id");
		if(product_idObj != null)
			product_id = product_idObj.toString();

		Object product_nameObj = map.get("product_name");
		if(product_nameObj != null)
			product_name = product_nameObj.toString();

		Object product_unitObj = map.get("product_unit");
		if(product_unitObj != null)
			product_unit = product_unitObj.toString();

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

		Object reference_nameObj = map.get("reference_name");
		if(reference_nameObj != null)
			reference_name = reference_nameObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

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

		Object zip_codeObj = map.get("zip_code");
		if(zip_codeObj != null)
			zip_code = zip_codeObj.toString();

		Object land_markObj = map.get("land_mark");
		if(land_markObj != null)
			land_mark = land_markObj.toString();

		Object company_nameObj = map.get("company_name");
		if(company_nameObj != null)
			company_name = company_nameObj.toString();

		Object record_statusObj = map.get("record_status");
		if(record_statusObj != null)
			record_status = record_statusObj.toString();

		Object designationObj = map.get("designation");
		if(designationObj != null)
			designation = designationObj.toString();

		Object quantityObj = map.get("quantity");
		if(quantityObj != null)
			quantity = new Double(quantityObj.toString());

		Object total_vatObj = map.get("total_vat");
		if(total_vatObj != null)
			total_vat = new Double(total_vatObj.toString());

		Object total_itemsObj = map.get("total_items");
		if(total_itemsObj != null)
			total_items = new Long(total_itemsObj.toString());

		Object total_service_taxObj = map.get("total_service_tax");
		if(total_service_taxObj != null)
			total_service_tax = new Double(total_service_taxObj.toString());

		Object total_service_chargeObj = map.get("total_service_charge");
		if(total_service_chargeObj != null)
			total_service_charge = new Double(total_service_chargeObj.toString());

		Object total_amountObj = map.get("total_amount");
		if(total_amountObj != null)
			total_amount = new Double(total_amountObj.toString());

		Object total_productsObj = map.get("total_products");
		if(total_productsObj != null)
			total_products = new Double(total_productsObj.toString());

		Object total_quantityObj = map.get("total_quantity");
		if(total_quantityObj != null)
			total_quantity = new Double(total_quantityObj.toString());

		Object recipientsObj = map.get("recipients");
		if(recipientsObj != null)
			recipients = recipientsObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object event_dateObj = map.get("event_date");
		if(event_dateObj != null)
			event_date = (Long) event_dateObj;

		Object event_date_strObj = map.get("event_date_str");
		if(event_date_strObj != null)
			event_date_str = event_date_strObj.toString();

		Object expiry_dateObj = map.get("expiry_date");
		if(expiry_dateObj != null)
			expiry_date = (Long) expiry_dateObj;

		Object expiry_date_strObj = map.get("expiry_date_str");
		if(expiry_date_strObj != null)
			expiry_date_str = expiry_date_strObj.toString();

		Object last_updated_messageObj = map.get("last_updated_message");
		if(last_updated_messageObj != null)
			last_updated_message = last_updated_messageObj.toString();

		Object last_updated_byObj = map.get("last_updated_by");
		if(last_updated_byObj != null)
			last_updated_by = last_updated_byObj.toString();

		Object last_updatedObj = map.get("last_updated");
		if(last_updatedObj != null)
			last_updated = (Long) last_updatedObj;

		Object sent_timeObj = map.get("sent_time");
		if(sent_timeObj != null)
			sent_time = (Long) sent_timeObj;

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object sentObj = map.get("sent");
		if(sentObj != null)
			sent = sentObj.toString();

		Object send_smsObj = map.get("send_sms");
		if(send_smsObj != null)
			send_sms = send_smsObj.toString();

		Object send_emailObj = map.get("send_email");
		if(send_emailObj != null)
			send_email = send_emailObj.toString();

		Object total_sentObj = map.get("total_sent");
		if(total_sentObj != null)
			total_sent = new Integer(total_sentObj.toString());

		Object total_user_sentObj = map.get("total_user_sent");
		if(total_user_sentObj != null)
			total_user_sent = new Integer(total_user_sentObj.toString());

		Object total_sms_sentObj = map.get("total_sms_sent");
		if(total_sms_sentObj != null)
			total_sms_sent = new Integer(total_sms_sentObj.toString());

		Object total_email_sentObj = map.get("total_email_sent");
		if(total_email_sentObj != null)
			total_email_sent = new Integer(total_email_sentObj.toString());

		Object total_app_notification_sentObj = map.get("total_app_notification_sent");
		if(total_app_notification_sentObj != null)
			total_app_notification_sent = new Integer(total_app_notification_sentObj.toString());

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

	public String getRecord_type() {
		return record_type;
	}

	public String getRecord_typeEx() {
		return record_type != null ? record_type : "";
	}

	public void setRecord_type(String record_type) {
		this.record_type = record_type;
	}

	public void unSetRecord_type() {
		this.record_type = null;
	}

	public String getRecord_sub_type() {
		return record_sub_type;
	}

	public String getRecord_sub_typeEx() {
		return record_sub_type != null ? record_sub_type : "";
	}

	public void setRecord_sub_type(String record_sub_type) {
		this.record_sub_type = record_sub_type;
	}

	public void unSetRecord_sub_type() {
		this.record_sub_type = null;
	}

	public String getLocation_type() {
		return location_type;
	}

	public String getLocation_typeEx() {
		return location_type != null ? location_type : "";
	}

	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}

	public void unSetLocation_type() {
		this.location_type = null;
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

	public String getBay_id() {
		return bay_id;
	}

	public String getBay_idEx() {
		return bay_id != null ? bay_id : "";
	}

	public void setBay_id(String bay_id) {
		this.bay_id = bay_id;
	}

	public void unSetBay_id() {
		this.bay_id = null;
	}

	public String getBay_name() {
		return bay_name;
	}

	public String getBay_nameEx() {
		return bay_name != null ? bay_name : "";
	}

	public void setBay_name(String bay_name) {
		this.bay_name = bay_name;
	}

	public void unSetBay_name() {
		this.bay_name = null;
	}

	public String getSupervisor_id() {
		return supervisor_id;
	}

	public String getSupervisor_idEx() {
		return supervisor_id != null ? supervisor_id : "";
	}

	public void setSupervisor_id(String supervisor_id) {
		this.supervisor_id = supervisor_id;
	}

	public void unSetSupervisor_id() {
		this.supervisor_id = null;
	}

	public String getSupervisor_name() {
		return supervisor_name;
	}

	public String getSupervisor_nameEx() {
		return supervisor_name != null ? supervisor_name : "";
	}

	public void setSupervisor_name(String supervisor_name) {
		this.supervisor_name = supervisor_name;
	}

	public void unSetSupervisor_name() {
		this.supervisor_name = null;
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

	public String getProduct_id() {
		return product_id;
	}

	public String getProduct_idEx() {
		return product_id != null ? product_id : "";
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public void unSetProduct_id() {
		this.product_id = null;
	}

	public String getProduct_name() {
		return product_name;
	}

	public String getProduct_nameEx() {
		return product_name != null ? product_name : "";
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void unSetProduct_name() {
		this.product_name = null;
	}

	public String getProduct_unit() {
		return product_unit;
	}

	public String getProduct_unitEx() {
		return product_unit != null ? product_unit : "";
	}

	public void setProduct_unit(String product_unit) {
		this.product_unit = product_unit;
	}

	public void unSetProduct_unit() {
		this.product_unit = null;
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

	public String getLand_mark() {
		return land_mark;
	}

	public String getLand_markEx() {
		return land_mark != null ? land_mark : "";
	}

	public void setLand_mark(String land_mark) {
		this.land_mark = land_mark;
	}

	public void unSetLand_mark() {
		this.land_mark = null;
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

	public String getRecord_status() {
		return record_status;
	}

	public String getRecord_statusEx() {
		return record_status != null ? record_status : "";
	}

	public void setRecord_status(String record_status) {
		this.record_status = record_status;
	}

	public void unSetRecord_status() {
		this.record_status = null;
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

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public void unSetQuantity() {
		this.quantity = null;
	}

	public Double getTotal_vat() {
		return total_vat;
	}

	public void setTotal_vat(Double total_vat) {
		this.total_vat = total_vat;
	}

	public void unSetTotal_vat() {
		this.total_vat = null;
	}

	public Long getTotal_items() {
		return total_items;
	}

	public long getTotal_itemsEx() {
		return total_items != null ? total_items : 0L;
	}

	public void setTotal_items(long total_items) {
		this.total_items = total_items;
	}

	public void setTotal_items(Long total_items) {
		this.total_items = total_items;
	}

	public void unSetTotal_items() {
		this.total_items = null;
	}

	public Double getTotal_service_tax() {
		return total_service_tax;
	}

	public void setTotal_service_tax(Double total_service_tax) {
		this.total_service_tax = total_service_tax;
	}

	public void unSetTotal_service_tax() {
		this.total_service_tax = null;
	}

	public Double getTotal_service_charge() {
		return total_service_charge;
	}

	public void setTotal_service_charge(Double total_service_charge) {
		this.total_service_charge = total_service_charge;
	}

	public void unSetTotal_service_charge() {
		this.total_service_charge = null;
	}

	public Double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Double total_amount) {
		this.total_amount = total_amount;
	}

	public void unSetTotal_amount() {
		this.total_amount = null;
	}

	public Double getTotal_products() {
		return total_products;
	}

	public void setTotal_products(Double total_products) {
		this.total_products = total_products;
	}

	public void unSetTotal_products() {
		this.total_products = null;
	}

	public Double getTotal_quantity() {
		return total_quantity;
	}

	public void setTotal_quantity(Double total_quantity) {
		this.total_quantity = total_quantity;
	}

	public void unSetTotal_quantity() {
		this.total_quantity = null;
	}

	public String getRecipients() {
		return recipients;
	}

	public String getRecipientsEx() {
		return recipients != null ? recipients : "";
	}

	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}

	public void unSetRecipients() {
		this.recipients = null;
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

	public Long getEvent_date() {
		return event_date;
	}

	public void setEvent_date(Long event_date) {
		this.event_date = event_date;
	}


	public String getEvent_date_str() {
		return event_date_str;
	}

	public String getEvent_date_strEx() {
		return event_date_str != null ? event_date_str : "";
	}

	public void setEvent_date_str(String event_date_str) {
		this.event_date_str = event_date_str;
	}

	public void unSetEvent_date_str() {
		this.event_date_str = null;
	}

	public Long getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Long expiry_date) {
		this.expiry_date = expiry_date;
	}


	public String getExpiry_date_str() {
		return expiry_date_str;
	}

	public String getExpiry_date_strEx() {
		return expiry_date_str != null ? expiry_date_str : "";
	}

	public void setExpiry_date_str(String expiry_date_str) {
		this.expiry_date_str = expiry_date_str;
	}

	public void unSetExpiry_date_str() {
		this.expiry_date_str = null;
	}

	public String getLast_updated_message() {
		return last_updated_message;
	}

	public String getLast_updated_messageEx() {
		return last_updated_message != null ? last_updated_message : "";
	}

	public void setLast_updated_message(String last_updated_message) {
		this.last_updated_message = last_updated_message;
	}

	public void unSetLast_updated_message() {
		this.last_updated_message = null;
	}

	public String getLast_updated_by() {
		return last_updated_by;
	}

	public String getLast_updated_byEx() {
		return last_updated_by != null ? last_updated_by : "";
	}

	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}

	public void unSetLast_updated_by() {
		this.last_updated_by = null;
	}

	public Long getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(Long last_updated) {
		this.last_updated = last_updated;
	}


	public Long getSent_time() {
		return sent_time;
	}

	public void setSent_time(Long sent_time) {
		this.sent_time = sent_time;
	}


	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public String getSent() {
		return sent != null ? sent : "N";
	}

	public void setSent(String sent) {
		this.sent = sent;
	}

	public void unSetSent() {
		this.sent = "N";
	}

	public String getSend_sms() {
		return send_sms != null ? send_sms : "N";
	}

	public void setSend_sms(String send_sms) {
		this.send_sms = send_sms;
	}

	public void unSetSend_sms() {
		this.send_sms = "N";
	}

	public String getSend_email() {
		return send_email != null ? send_email : "N";
	}

	public void setSend_email(String send_email) {
		this.send_email = send_email;
	}

	public void unSetSend_email() {
		this.send_email = "N";
	}

	public Integer getTotal_sent() {
		return total_sent;
	}

	public int getTotal_sentEx() {
		return total_sent != null ? total_sent : 0;
	}

	public void setTotal_sent(int total_sent) {
		this.total_sent = total_sent;
	}

	public void setTotal_sent(Integer total_sent) {
		this.total_sent = total_sent;
	}

	public void unSetTotal_sent() {
		this.total_sent = null;
	}

	public Integer getTotal_user_sent() {
		return total_user_sent;
	}

	public int getTotal_user_sentEx() {
		return total_user_sent != null ? total_user_sent : 0;
	}

	public void setTotal_user_sent(int total_user_sent) {
		this.total_user_sent = total_user_sent;
	}

	public void setTotal_user_sent(Integer total_user_sent) {
		this.total_user_sent = total_user_sent;
	}

	public void unSetTotal_user_sent() {
		this.total_user_sent = null;
	}

	public Integer getTotal_sms_sent() {
		return total_sms_sent;
	}

	public int getTotal_sms_sentEx() {
		return total_sms_sent != null ? total_sms_sent : 0;
	}

	public void setTotal_sms_sent(int total_sms_sent) {
		this.total_sms_sent = total_sms_sent;
	}

	public void setTotal_sms_sent(Integer total_sms_sent) {
		this.total_sms_sent = total_sms_sent;
	}

	public void unSetTotal_sms_sent() {
		this.total_sms_sent = null;
	}

	public Integer getTotal_email_sent() {
		return total_email_sent;
	}

	public int getTotal_email_sentEx() {
		return total_email_sent != null ? total_email_sent : 0;
	}

	public void setTotal_email_sent(int total_email_sent) {
		this.total_email_sent = total_email_sent;
	}

	public void setTotal_email_sent(Integer total_email_sent) {
		this.total_email_sent = total_email_sent;
	}

	public void unSetTotal_email_sent() {
		this.total_email_sent = null;
	}

	public Integer getTotal_app_notification_sent() {
		return total_app_notification_sent;
	}

	public int getTotal_app_notification_sentEx() {
		return total_app_notification_sent != null ? total_app_notification_sent : 0;
	}

	public void setTotal_app_notification_sent(int total_app_notification_sent) {
		this.total_app_notification_sent = total_app_notification_sent;
	}

	public void setTotal_app_notification_sent(Integer total_app_notification_sent) {
		this.total_app_notification_sent = total_app_notification_sent;
	}

	public void unSetTotal_app_notification_sent() {
		this.total_app_notification_sent = null;
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
		return "DB_RECORD";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}