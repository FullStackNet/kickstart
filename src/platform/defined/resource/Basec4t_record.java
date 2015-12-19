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
	private String attachment = null;
	private String attachment_name = null;
	private String has_attachment = null;
	private String bay_id = null;
	private String release_id = null;
	private String release_name = null;
	private String component_id = null;
	private String component_name = null;
	private String sprint_id = null;
	private String sprint_name = null;
	private String from_date = null;
	private String photo_url = null;
	private String created_by_id = null;
	private String created_by_name = null;
	private String assign_to_id = null;
	private String assign_to_name = null;
	private String reference_id = null;
	private String to_date = null;
	private String start_time = null;
	private String end_time = null;
	private String is_holiday = null;
	private String delivery_time = null;
	private String table_no = null;
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
	private String reference_name = null;
	private String mobile_no = null;
	private String address1 = null;
	private String address2 = null;
	private String area = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String zip_code = null;
	private String land_mark = null;
	private String company_name = null;
	private String all = null;
	private String record_status = null;
	private String designation = null;
	private String address = null;
	private Double quantity = null;
	private Double total_vat = null;
	private Double total_days = null;
	private Double total_present = null;
	private Double total_percentage = null;
	private Long total_items = null;
	private Double total_service_tax = null;
	private Double total_service_charge = null;
	private Double total_amount = null;
	private Long total_products = null;
	private Long total_ready = null;
	private Long total_not_available = null;
	private Long total_pending = null;
	private Long total_cancelled = null;
	private Long total_delivered = null;
	private Double total_quantity = null;
	private String recipients = null;
	private String description = null;
	private String remark = null;
	private Long event_date = null;
	private String event_date_str = null;
	private Long expiry_date = null;
	private String expiry_date_str = null;
	private String downloaded = null;
	private String printed = null;
	private String last_updated_message = null;
	private String last_updated_by = null;
	private Long last_updated = null;
	private Long sent_time = null;
	private Long creation_time = null;
	private String sent = null;
	private String enable_chat = null;
	private String send_sms_app_user = null;
	private String send_sms = null;
	private String send_email = null;
	private Integer total_sent = null;
	private Integer total_user_sent = null;
	private Integer total_sms_sent = null;
	private Integer total_email_sent = null;
	private Integer total_app_notification_sent = null;
	private String messageType = null;
	private String project_id = null;
	private String project_name = null;
	private String meeting_id = null;
	private String mom_id = null;
	private String parent_project_id = null;
	private String parent_project_name = null;
	private String meeting_name = null;
	private String release = null;
	private String priority = null;
	private String assign_date_str = null;
	private Long assign_date = null;
	private String completion_date_str = null;
	private Long completion_date = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_COMMUNITY_NAME = "community_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_RECORD_TYPE = "record_type";
	public static String FIELD_RECORD_SUB_TYPE = "record_sub_type";
	public static String FIELD_LOCATION_TYPE = "location_type";
	public static String FIELD_TITLE = "title";
	public static String FIELD_ATTACHMENT = "attachment";
	public static String FIELD_ATTACHMENT_NAME = "attachment_name";
	public static String FIELD_HAS_ATTACHMENT = "has_attachment";
	public static String FIELD_BAY_ID = "bay_id";
	public static String FIELD_RELEASE_ID = "release_id";
	public static String FIELD_RELEASE_NAME = "release_name";
	public static String FIELD_COMPONENT_ID = "component_id";
	public static String FIELD_COMPONENT_NAME = "component_name";
	public static String FIELD_SPRINT_ID = "sprint_id";
	public static String FIELD_SPRINT_NAME = "sprint_name";
	public static String FIELD_FROM_DATE = "from_date";
	public static String FIELD_PHOTO_URL = "photo_url";
	public static String FIELD_CREATED_BY_ID = "created_by_id";
	public static String FIELD_CREATED_BY_NAME = "created_by_name";
	public static String FIELD_ASSIGN_TO_ID = "assign_to_id";
	public static String FIELD_ASSIGN_TO_NAME = "assign_to_name";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_TO_DATE = "to_date";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_END_TIME = "end_time";
	public static String FIELD_IS_HOLIDAY = "is_holiday";
	public static String FIELD_DELIVERY_TIME = "delivery_time";
	public static String FIELD_TABLE_NO = "table_no";
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
	public static String FIELD_REFERENCE_NAME = "reference_name";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_AREA = "area";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_ZIP_CODE = "zip_code";
	public static String FIELD_LAND_MARK = "land_mark";
	public static String FIELD_COMPANY_NAME = "company_name";
	public static String FIELD_ALL = "all";
	public static String FIELD_RECORD_STATUS = "record_status";
	public static String FIELD_DESIGNATION = "designation";
	public static String FIELD_ADDRESS = "address";
	public static String FIELD_QUANTITY = "quantity";
	public static String FIELD_TOTAL_VAT = "total_vat";
	public static String FIELD_TOTAL_DAYS = "total_days";
	public static String FIELD_TOTAL_PRESENT = "total_present";
	public static String FIELD_TOTAL_PERCENTAGE = "total_percentage";
	public static String FIELD_TOTAL_ITEMS = "total_items";
	public static String FIELD_TOTAL_SERVICE_TAX = "total_service_tax";
	public static String FIELD_TOTAL_SERVICE_CHARGE = "total_service_charge";
	public static String FIELD_TOTAL_AMOUNT = "total_amount";
	public static String FIELD_TOTAL_PRODUCTS = "total_products";
	public static String FIELD_TOTAL_READY = "total_ready";
	public static String FIELD_TOTAL_NOT_AVAILABLE = "total_not_available";
	public static String FIELD_TOTAL_PENDING = "total_pending";
	public static String FIELD_TOTAL_CANCELLED = "total_cancelled";
	public static String FIELD_TOTAL_DELIVERED = "total_delivered";
	public static String FIELD_TOTAL_QUANTITY = "total_quantity";
	public static String FIELD_RECIPIENTS = "recipients";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_EVENT_DATE = "event_date";
	public static String FIELD_EVENT_DATE_STR = "event_date_str";
	public static String FIELD_EXPIRY_DATE = "expiry_date";
	public static String FIELD_EXPIRY_DATE_STR = "expiry_date_str";
	public static String FIELD_DOWNLOADED = "downloaded";
	public static String FIELD_PRINTED = "printed";
	public static String FIELD_LAST_UPDATED_MESSAGE = "last_updated_message";
	public static String FIELD_LAST_UPDATED_BY = "last_updated_by";
	public static String FIELD_LAST_UPDATED = "last_updated";
	public static String FIELD_SENT_TIME = "sent_time";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_SENT = "sent";
	public static String FIELD_ENABLE_CHAT = "enable_chat";
	public static String FIELD_SEND_SMS_APP_USER = "send_sms_app_user";
	public static String FIELD_SEND_SMS = "send_sms";
	public static String FIELD_SEND_EMAIL = "send_email";
	public static String FIELD_TOTAL_SENT = "total_sent";
	public static String FIELD_TOTAL_USER_SENT = "total_user_sent";
	public static String FIELD_TOTAL_SMS_SENT = "total_sms_sent";
	public static String FIELD_TOTAL_EMAIL_SENT = "total_email_sent";
	public static String FIELD_TOTAL_APP_NOTIFICATION_SENT = "total_app_notification_sent";
	public static String FIELD_MESSAGETYPE = "messageType";
	public static String FIELD_PROJECT_ID = "project_id";
	public static String FIELD_PROJECT_NAME = "project_name";
	public static String FIELD_MEETING_ID = "meeting_id";
	public static String FIELD_MOM_ID = "mom_id";
	public static String FIELD_PARENT_PROJECT_ID = "parent_project_id";
	public static String FIELD_PARENT_PROJECT_NAME = "parent_project_name";
	public static String FIELD_MEETING_NAME = "meeting_name";
	public static String FIELD_RELEASE = "release";
	public static String FIELD_PRIORITY = "priority";
	public static String FIELD_ASSIGN_DATE_STR = "assign_date_str";
	public static String FIELD_ASSIGN_DATE = "assign_date";
	public static String FIELD_COMPLETION_DATE_STR = "completion_date_str";
	public static String FIELD_COMPLETION_DATE = "completion_date";
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

		Field attachmentField = new Field("attachment", "String");
		attachmentField.setLength(128);
		metaData.addField(attachmentField);

		Field attachment_nameField = new Field("attachment_name", "String");
		attachment_nameField.setLength(128);
		metaData.addField(attachment_nameField);

		Field has_attachmentField = new Field("has_attachment", "String");
		has_attachmentField.setLength(128);
		metaData.addField(has_attachmentField);

		Field bay_idField = new Field("bay_id", "String");
		bay_idField.setIndexed(true);
		bay_idField.setLength(128);
		metaData.addField(bay_idField);

		Field release_idField = new Field("release_id", "String");
		release_idField.setIndexed(true);
		release_idField.setLength(128);
		metaData.addField(release_idField);

		Field release_nameField = new Field("release_name", "String");
		release_nameField.setIndexed(true);
		release_nameField.setLength(128);
		metaData.addField(release_nameField);

		Field component_idField = new Field("component_id", "String");
		component_idField.setIndexed(true);
		component_idField.setLength(128);
		metaData.addField(component_idField);

		Field component_nameField = new Field("component_name", "String");
		component_nameField.setIndexed(true);
		component_nameField.setLength(128);
		metaData.addField(component_nameField);

		Field sprint_idField = new Field("sprint_id", "String");
		sprint_idField.setIndexed(true);
		sprint_idField.setLength(128);
		metaData.addField(sprint_idField);

		Field sprint_nameField = new Field("sprint_name", "String");
		sprint_nameField.setIndexed(true);
		sprint_nameField.setLength(128);
		metaData.addField(sprint_nameField);

		Field from_dateField = new Field("from_date", "String");
		from_dateField.setLength(128);
		metaData.addField(from_dateField);

		Field photo_urlField = new Field("photo_url", "String");
		photo_urlField.setLength(128);
		metaData.addField(photo_urlField);

		Field created_by_idField = new Field("created_by_id", "String");
		created_by_idField.setLength(128);
		metaData.addField(created_by_idField);

		Field created_by_nameField = new Field("created_by_name", "String");
		created_by_nameField.setLength(128);
		metaData.addField(created_by_nameField);

		Field assign_to_idField = new Field("assign_to_id", "String");
		assign_to_idField.setLength(128);
		metaData.addField(assign_to_idField);

		Field assign_to_nameField = new Field("assign_to_name", "String");
		assign_to_nameField.setLength(128);
		metaData.addField(assign_to_nameField);

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(128);
		metaData.addField(reference_idField);

		Field to_dateField = new Field("to_date", "String");
		to_dateField.setLength(128);
		metaData.addField(to_dateField);

		Field start_timeField = new Field("start_time", "String");
		start_timeField.setLength(128);
		metaData.addField(start_timeField);

		Field end_timeField = new Field("end_time", "String");
		end_timeField.setLength(128);
		metaData.addField(end_timeField);

		Field is_holidayField = new Field("is_holiday", "String");
		is_holidayField.setLength(128);
		metaData.addField(is_holidayField);

		Field delivery_timeField = new Field("delivery_time", "String");
		delivery_timeField.setLength(128);
		metaData.addField(delivery_timeField);

		Field table_noField = new Field("table_no", "String");
		table_noField.setIndexed(true);
		table_noField.setLength(128);
		metaData.addField(table_noField);

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

		Field reference_nameField = new Field("reference_name", "String");
		reference_nameField.setLength(512);
		metaData.addField(reference_nameField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(32);
		metaData.addField(mobile_noField);

		Field address1Field = new Field("address1", "String");
		address1Field.setLength(256);
		metaData.addField(address1Field);

		Field address2Field = new Field("address2", "String");
		address2Field.setLength(256);
		metaData.addField(address2Field);

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

		Field allField = new Field("all", "String");
		allField.setLength(1);
		metaData.addField(allField);

		Field record_statusField = new Field("record_status", "String");
		record_statusField.setLength(32);
		metaData.addField(record_statusField);

		Field designationField = new Field("designation", "String");
		designationField.setLength(512);
		metaData.addField(designationField);

		Field addressField = new Field("address", "String");
		addressField.setLength(512);
		metaData.addField(addressField);

		Field quantityField = new Field("quantity", "Double");
		metaData.addField(quantityField);

		Field total_vatField = new Field("total_vat", "Double");
		metaData.addField(total_vatField);

		Field total_daysField = new Field("total_days", "Double");
		metaData.addField(total_daysField);

		Field total_presentField = new Field("total_present", "Double");
		metaData.addField(total_presentField);

		Field total_percentageField = new Field("total_percentage", "Double");
		metaData.addField(total_percentageField);

		Field total_itemsField = new Field("total_items", "long");
		metaData.addField(total_itemsField);

		Field total_service_taxField = new Field("total_service_tax", "Double");
		metaData.addField(total_service_taxField);

		Field total_service_chargeField = new Field("total_service_charge", "Double");
		metaData.addField(total_service_chargeField);

		Field total_amountField = new Field("total_amount", "Double");
		metaData.addField(total_amountField);

		Field total_productsField = new Field("total_products", "long");
		metaData.addField(total_productsField);

		Field total_readyField = new Field("total_ready", "long");
		metaData.addField(total_readyField);

		Field total_not_availableField = new Field("total_not_available", "long");
		metaData.addField(total_not_availableField);

		Field total_pendingField = new Field("total_pending", "long");
		metaData.addField(total_pendingField);

		Field total_cancelledField = new Field("total_cancelled", "long");
		metaData.addField(total_cancelledField);

		Field total_deliveredField = new Field("total_delivered", "long");
		metaData.addField(total_deliveredField);

		Field total_quantityField = new Field("total_quantity", "Double");
		metaData.addField(total_quantityField);

		Field recipientsField = new Field("recipients", "String");
		recipientsField.setLength(512);
		metaData.addField(recipientsField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(128);
		metaData.addField(descriptionField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(4096);
		metaData.addField(remarkField);

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

		Field downloadedField = new Field("downloaded", "String");
		downloadedField.setLength(1);
		metaData.addField(downloadedField);

		Field printedField = new Field("printed", "String");
		printedField.setLength(1);
		metaData.addField(printedField);

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

		Field enable_chatField = new Field("enable_chat", "String");
		enable_chatField.setDefaultValue("Y");
		enable_chatField.setLength(1);
		metaData.addField(enable_chatField);

		Field send_sms_app_userField = new Field("send_sms_app_user", "String");
		send_sms_app_userField.setDefaultValue("Y");
		send_sms_app_userField.setLength(1);
		metaData.addField(send_sms_app_userField);

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

		Field messageTypeField = new Field("messageType", "String");
		messageTypeField.setLength(128);
		metaData.addField(messageTypeField);

		Field project_idField = new Field("project_id", "String");
		project_idField.setLength(128);
		metaData.addField(project_idField);

		Field project_nameField = new Field("project_name", "String");
		project_nameField.setLength(128);
		metaData.addField(project_nameField);

		Field meeting_idField = new Field("meeting_id", "String");
		meeting_idField.setLength(128);
		metaData.addField(meeting_idField);

		Field mom_idField = new Field("mom_id", "String");
		mom_idField.setLength(128);
		metaData.addField(mom_idField);

		Field parent_project_idField = new Field("parent_project_id", "String");
		parent_project_idField.setLength(128);
		metaData.addField(parent_project_idField);

		Field parent_project_nameField = new Field("parent_project_name", "String");
		parent_project_nameField.setLength(128);
		metaData.addField(parent_project_nameField);

		Field meeting_nameField = new Field("meeting_name", "String");
		meeting_nameField.setLength(128);
		metaData.addField(meeting_nameField);

		Field releaseField = new Field("release", "String");
		releaseField.setLength(128);
		metaData.addField(releaseField);

		Field priorityField = new Field("priority", "String");
		priorityField.setLength(128);
		metaData.addField(priorityField);

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
		this.attachment = obj.attachment;
		this.attachment_name = obj.attachment_name;
		this.has_attachment = obj.has_attachment;
		this.bay_id = obj.bay_id;
		this.release_id = obj.release_id;
		this.release_name = obj.release_name;
		this.component_id = obj.component_id;
		this.component_name = obj.component_name;
		this.sprint_id = obj.sprint_id;
		this.sprint_name = obj.sprint_name;
		this.from_date = obj.from_date;
		this.photo_url = obj.photo_url;
		this.created_by_id = obj.created_by_id;
		this.created_by_name = obj.created_by_name;
		this.assign_to_id = obj.assign_to_id;
		this.assign_to_name = obj.assign_to_name;
		this.reference_id = obj.reference_id;
		this.to_date = obj.to_date;
		this.start_time = obj.start_time;
		this.end_time = obj.end_time;
		this.is_holiday = obj.is_holiday;
		this.delivery_time = obj.delivery_time;
		this.table_no = obj.table_no;
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
		this.reference_name = obj.reference_name;
		this.mobile_no = obj.mobile_no;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.area = obj.area;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.zip_code = obj.zip_code;
		this.land_mark = obj.land_mark;
		this.company_name = obj.company_name;
		this.all = obj.all;
		this.record_status = obj.record_status;
		this.designation = obj.designation;
		this.address = obj.address;
		this.quantity = obj.quantity;
		this.total_vat = obj.total_vat;
		this.total_days = obj.total_days;
		this.total_present = obj.total_present;
		this.total_percentage = obj.total_percentage;
		this.total_items = obj.total_items;
		this.total_service_tax = obj.total_service_tax;
		this.total_service_charge = obj.total_service_charge;
		this.total_amount = obj.total_amount;
		this.total_products = obj.total_products;
		this.total_ready = obj.total_ready;
		this.total_not_available = obj.total_not_available;
		this.total_pending = obj.total_pending;
		this.total_cancelled = obj.total_cancelled;
		this.total_delivered = obj.total_delivered;
		this.total_quantity = obj.total_quantity;
		this.recipients = obj.recipients;
		this.description = obj.description;
		this.remark = obj.remark;
		this.event_date = obj.event_date;
		this.event_date_str = obj.event_date_str;
		this.expiry_date = obj.expiry_date;
		this.expiry_date_str = obj.expiry_date_str;
		this.downloaded = obj.downloaded;
		this.printed = obj.printed;
		this.last_updated_message = obj.last_updated_message;
		this.last_updated_by = obj.last_updated_by;
		this.last_updated = obj.last_updated;
		this.sent_time = obj.sent_time;
		this.creation_time = obj.creation_time;
		this.sent = obj.sent;
		this.enable_chat = obj.enable_chat;
		this.send_sms_app_user = obj.send_sms_app_user;
		this.send_sms = obj.send_sms;
		this.send_email = obj.send_email;
		this.total_sent = obj.total_sent;
		this.total_user_sent = obj.total_user_sent;
		this.total_sms_sent = obj.total_sms_sent;
		this.total_email_sent = obj.total_email_sent;
		this.total_app_notification_sent = obj.total_app_notification_sent;
		this.messageType = obj.messageType;
		this.project_id = obj.project_id;
		this.project_name = obj.project_name;
		this.meeting_id = obj.meeting_id;
		this.mom_id = obj.mom_id;
		this.parent_project_id = obj.parent_project_id;
		this.parent_project_name = obj.parent_project_name;
		this.meeting_name = obj.meeting_name;
		this.release = obj.release;
		this.priority = obj.priority;
		this.assign_date_str = obj.assign_date_str;
		this.assign_date = obj.assign_date;
		this.completion_date_str = obj.completion_date_str;
		this.completion_date = obj.completion_date;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(sent == null)
			sent = "N";
		if(enable_chat == null)
			enable_chat = "Y";
		if(send_sms_app_user == null)
			send_sms_app_user = "Y";
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
		if(attachment != null)
			map.put("attachment", attachment);
		if(attachment_name != null)
			map.put("attachment_name", attachment_name);
		if(has_attachment != null)
			map.put("has_attachment", has_attachment);
		if(bay_id != null)
			map.put("bay_id", bay_id);
		if(release_id != null)
			map.put("release_id", release_id);
		if(release_name != null)
			map.put("release_name", release_name);
		if(component_id != null)
			map.put("component_id", component_id);
		if(component_name != null)
			map.put("component_name", component_name);
		if(sprint_id != null)
			map.put("sprint_id", sprint_id);
		if(sprint_name != null)
			map.put("sprint_name", sprint_name);
		if(from_date != null)
			map.put("from_date", from_date);
		if(photo_url != null)
			map.put("photo_url", photo_url);
		if(created_by_id != null)
			map.put("created_by_id", created_by_id);
		if(created_by_name != null)
			map.put("created_by_name", created_by_name);
		if(assign_to_id != null)
			map.put("assign_to_id", assign_to_id);
		if(assign_to_name != null)
			map.put("assign_to_name", assign_to_name);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(to_date != null)
			map.put("to_date", to_date);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(is_holiday != null)
			map.put("is_holiday", is_holiday);
		if(delivery_time != null)
			map.put("delivery_time", delivery_time);
		if(table_no != null)
			map.put("table_no", table_no);
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
		if(reference_name != null)
			map.put("reference_name", reference_name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(address1 != null)
			map.put("address1", address1);
		if(address2 != null)
			map.put("address2", address2);
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
		if(all != null)
			map.put("all", all);
		if(record_status != null)
			map.put("record_status", record_status);
		if(designation != null)
			map.put("designation", designation);
		if(address != null)
			map.put("address", address);
		if(quantity != null)
			map.put("quantity", quantity);
		if(total_vat != null)
			map.put("total_vat", total_vat);
		if(total_days != null)
			map.put("total_days", total_days);
		if(total_present != null)
			map.put("total_present", total_present);
		if(total_percentage != null)
			map.put("total_percentage", total_percentage);
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
		if(total_ready != null)
			map.put("total_ready", total_ready);
		if(total_not_available != null)
			map.put("total_not_available", total_not_available);
		if(total_pending != null)
			map.put("total_pending", total_pending);
		if(total_cancelled != null)
			map.put("total_cancelled", total_cancelled);
		if(total_delivered != null)
			map.put("total_delivered", total_delivered);
		if(total_quantity != null)
			map.put("total_quantity", total_quantity);
		if(recipients != null)
			map.put("recipients", recipients);
		if(description != null)
			map.put("description", description);
		if(remark != null)
			map.put("remark", remark);
		if(event_date != null)
			map.put("event_date", event_date);
		if(event_date_str != null)
			map.put("event_date_str", event_date_str);
		if(expiry_date != null)
			map.put("expiry_date", expiry_date);
		if(expiry_date_str != null)
			map.put("expiry_date_str", expiry_date_str);
		if(downloaded != null)
			map.put("downloaded", downloaded);
		if(printed != null)
			map.put("printed", printed);
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
		if(enable_chat != null)
			map.put("enable_chat", enable_chat);
		if(send_sms_app_user != null)
			map.put("send_sms_app_user", send_sms_app_user);
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
		if(messageType != null)
			map.put("messageType", messageType);
		if(project_id != null)
			map.put("project_id", project_id);
		if(project_name != null)
			map.put("project_name", project_name);
		if(meeting_id != null)
			map.put("meeting_id", meeting_id);
		if(mom_id != null)
			map.put("mom_id", mom_id);
		if(parent_project_id != null)
			map.put("parent_project_id", parent_project_id);
		if(parent_project_name != null)
			map.put("parent_project_name", parent_project_name);
		if(meeting_name != null)
			map.put("meeting_name", meeting_name);
		if(release != null)
			map.put("release", release);
		if(priority != null)
			map.put("priority", priority);
		if(assign_date_str != null)
			map.put("assign_date_str", assign_date_str);
		if(assign_date != null)
			map.put("assign_date", assign_date);
		if(completion_date_str != null)
			map.put("completion_date_str", completion_date_str);
		if(completion_date != null)
			map.put("completion_date", completion_date);
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
		if(attachment != null)
			map.put("attachment", attachment);
		if(attachment_name != null)
			map.put("attachment_name", attachment_name);
		if(has_attachment != null)
			map.put("has_attachment", has_attachment);
		if(bay_id != null)
			map.put("bay_id", bay_id);
		if(release_id != null)
			map.put("release_id", release_id);
		if(release_name != null)
			map.put("release_name", release_name);
		if(component_id != null)
			map.put("component_id", component_id);
		if(component_name != null)
			map.put("component_name", component_name);
		if(sprint_id != null)
			map.put("sprint_id", sprint_id);
		if(sprint_name != null)
			map.put("sprint_name", sprint_name);
		if(from_date != null)
			map.put("from_date", from_date);
		if(photo_url != null)
			map.put("photo_url", photo_url);
		if(created_by_id != null)
			map.put("created_by_id", created_by_id);
		if(created_by_name != null)
			map.put("created_by_name", created_by_name);
		if(assign_to_id != null)
			map.put("assign_to_id", assign_to_id);
		if(assign_to_name != null)
			map.put("assign_to_name", assign_to_name);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(to_date != null)
			map.put("to_date", to_date);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(is_holiday != null)
			map.put("is_holiday", is_holiday);
		if(delivery_time != null)
			map.put("delivery_time", delivery_time);
		if(table_no != null)
			map.put("table_no", table_no);
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
		if(reference_name != null)
			map.put("reference_name", reference_name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(address1 != null)
			map.put("address1", address1);
		if(address2 != null)
			map.put("address2", address2);
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
		if(all != null)
			map.put("all", all);
		if(record_status != null)
			map.put("record_status", record_status);
		if(designation != null)
			map.put("designation", designation);
		if(address != null)
			map.put("address", address);
		if(quantity != null)
			map.put("quantity", quantity);
		if(total_vat != null)
			map.put("total_vat", total_vat);
		if(total_days != null)
			map.put("total_days", total_days);
		if(total_present != null)
			map.put("total_present", total_present);
		if(total_percentage != null)
			map.put("total_percentage", total_percentage);
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
		if(total_ready != null)
			map.put("total_ready", total_ready);
		if(total_not_available != null)
			map.put("total_not_available", total_not_available);
		if(total_pending != null)
			map.put("total_pending", total_pending);
		if(total_cancelled != null)
			map.put("total_cancelled", total_cancelled);
		if(total_delivered != null)
			map.put("total_delivered", total_delivered);
		if(total_quantity != null)
			map.put("total_quantity", total_quantity);
		if(recipients != null)
			map.put("recipients", recipients);
		if(description != null)
			map.put("description", description);
		if(remark != null)
			map.put("remark", remark);
		if(event_date != null)
			map.put("event_date", event_date);
		if(event_date_str != null)
			map.put("event_date_str", event_date_str);
		if(expiry_date != null)
			map.put("expiry_date", expiry_date);
		if(expiry_date_str != null)
			map.put("expiry_date_str", expiry_date_str);
		if(downloaded != null)
			map.put("downloaded", downloaded);
		if(printed != null)
			map.put("printed", printed);
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
		if(enable_chat != null)
			map.put("enable_chat", enable_chat);
		if(send_sms_app_user != null)
			map.put("send_sms_app_user", send_sms_app_user);
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
		if(messageType != null)
			map.put("messageType", messageType);
		if(project_id != null)
			map.put("project_id", project_id);
		if(project_name != null)
			map.put("project_name", project_name);
		if(meeting_id != null)
			map.put("meeting_id", meeting_id);
		if(mom_id != null)
			map.put("mom_id", mom_id);
		if(parent_project_id != null)
			map.put("parent_project_id", parent_project_id);
		if(parent_project_name != null)
			map.put("parent_project_name", parent_project_name);
		if(meeting_name != null)
			map.put("meeting_name", meeting_name);
		if(release != null)
			map.put("release", release);
		if(priority != null)
			map.put("priority", priority);
		if(assign_date_str != null)
			map.put("assign_date_str", assign_date_str);
		if(assign_date != null)
			map.put("assign_date", assign_date);
		if(completion_date_str != null)
			map.put("completion_date_str", completion_date_str);
		if(completion_date != null)
			map.put("completion_date", completion_date);
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
		attachment = (String) map.get("attachment");
		attachment_name = (String) map.get("attachment_name");
		has_attachment = (String) map.get("has_attachment");
		bay_id = (String) map.get("bay_id");
		release_id = (String) map.get("release_id");
		release_name = (String) map.get("release_name");
		component_id = (String) map.get("component_id");
		component_name = (String) map.get("component_name");
		sprint_id = (String) map.get("sprint_id");
		sprint_name = (String) map.get("sprint_name");
		from_date = (String) map.get("from_date");
		photo_url = (String) map.get("photo_url");
		created_by_id = (String) map.get("created_by_id");
		created_by_name = (String) map.get("created_by_name");
		assign_to_id = (String) map.get("assign_to_id");
		assign_to_name = (String) map.get("assign_to_name");
		reference_id = (String) map.get("reference_id");
		to_date = (String) map.get("to_date");
		start_time = (String) map.get("start_time");
		end_time = (String) map.get("end_time");
		is_holiday = (String) map.get("is_holiday");
		delivery_time = (String) map.get("delivery_time");
		table_no = (String) map.get("table_no");
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
		reference_name = (String) map.get("reference_name");
		mobile_no = (String) map.get("mobile_no");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		area = (String) map.get("area");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		zip_code = (String) map.get("zip_code");
		land_mark = (String) map.get("land_mark");
		company_name = (String) map.get("company_name");
		all = (String) map.get("all");
		record_status = (String) map.get("record_status");
		designation = (String) map.get("designation");
		address = (String) map.get("address");
		quantity = (Double) map.get("quantity");
		total_vat = (Double) map.get("total_vat");
		total_days = (Double) map.get("total_days");
		total_present = (Double) map.get("total_present");
		total_percentage = (Double) map.get("total_percentage");
		total_items = (Long) map.get("total_items");
		total_service_tax = (Double) map.get("total_service_tax");
		total_service_charge = (Double) map.get("total_service_charge");
		total_amount = (Double) map.get("total_amount");
		total_products = (Long) map.get("total_products");
		total_ready = (Long) map.get("total_ready");
		total_not_available = (Long) map.get("total_not_available");
		total_pending = (Long) map.get("total_pending");
		total_cancelled = (Long) map.get("total_cancelled");
		total_delivered = (Long) map.get("total_delivered");
		total_quantity = (Double) map.get("total_quantity");
		recipients = (String) map.get("recipients");
		description = (String) map.get("description");
		remark = (String) map.get("remark");
		event_date = (Long) map.get("event_date");
		event_date_str = (String) map.get("event_date_str");
		expiry_date = (Long) map.get("expiry_date");
		expiry_date_str = (String) map.get("expiry_date_str");
		downloaded = (String) map.get("downloaded");
		printed = (String) map.get("printed");
		last_updated_message = (String) map.get("last_updated_message");
		last_updated_by = (String) map.get("last_updated_by");
		last_updated = (Long) map.get("last_updated");
		sent_time = (Long) map.get("sent_time");
		creation_time = (Long) map.get("creation_time");
		sent = (String) map.get("sent");
		enable_chat = (String) map.get("enable_chat");
		send_sms_app_user = (String) map.get("send_sms_app_user");
		send_sms = (String) map.get("send_sms");
		send_email = (String) map.get("send_email");
		total_sent = (Integer) map.get("total_sent");
		total_user_sent = (Integer) map.get("total_user_sent");
		total_sms_sent = (Integer) map.get("total_sms_sent");
		total_email_sent = (Integer) map.get("total_email_sent");
		total_app_notification_sent = (Integer) map.get("total_app_notification_sent");
		messageType = (String) map.get("messageType");
		project_id = (String) map.get("project_id");
		project_name = (String) map.get("project_name");
		meeting_id = (String) map.get("meeting_id");
		mom_id = (String) map.get("mom_id");
		parent_project_id = (String) map.get("parent_project_id");
		parent_project_name = (String) map.get("parent_project_name");
		meeting_name = (String) map.get("meeting_name");
		release = (String) map.get("release");
		priority = (String) map.get("priority");
		assign_date_str = (String) map.get("assign_date_str");
		assign_date = (Long) map.get("assign_date");
		completion_date_str = (String) map.get("completion_date_str");
		completion_date = (Long) map.get("completion_date");
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

		Object attachmentObj = map.get("attachment");
		if(attachmentObj != null)
			attachment = attachmentObj.toString();

		Object attachment_nameObj = map.get("attachment_name");
		if(attachment_nameObj != null)
			attachment_name = attachment_nameObj.toString();

		Object has_attachmentObj = map.get("has_attachment");
		if(has_attachmentObj != null)
			has_attachment = has_attachmentObj.toString();

		Object bay_idObj = map.get("bay_id");
		if(bay_idObj != null)
			bay_id = bay_idObj.toString();

		Object release_idObj = map.get("release_id");
		if(release_idObj != null)
			release_id = release_idObj.toString();

		Object release_nameObj = map.get("release_name");
		if(release_nameObj != null)
			release_name = release_nameObj.toString();

		Object component_idObj = map.get("component_id");
		if(component_idObj != null)
			component_id = component_idObj.toString();

		Object component_nameObj = map.get("component_name");
		if(component_nameObj != null)
			component_name = component_nameObj.toString();

		Object sprint_idObj = map.get("sprint_id");
		if(sprint_idObj != null)
			sprint_id = sprint_idObj.toString();

		Object sprint_nameObj = map.get("sprint_name");
		if(sprint_nameObj != null)
			sprint_name = sprint_nameObj.toString();

		Object from_dateObj = map.get("from_date");
		if(from_dateObj != null)
			from_date = from_dateObj.toString();

		Object photo_urlObj = map.get("photo_url");
		if(photo_urlObj != null)
			photo_url = photo_urlObj.toString();

		Object created_by_idObj = map.get("created_by_id");
		if(created_by_idObj != null)
			created_by_id = created_by_idObj.toString();

		Object created_by_nameObj = map.get("created_by_name");
		if(created_by_nameObj != null)
			created_by_name = created_by_nameObj.toString();

		Object assign_to_idObj = map.get("assign_to_id");
		if(assign_to_idObj != null)
			assign_to_id = assign_to_idObj.toString();

		Object assign_to_nameObj = map.get("assign_to_name");
		if(assign_to_nameObj != null)
			assign_to_name = assign_to_nameObj.toString();

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

		Object to_dateObj = map.get("to_date");
		if(to_dateObj != null)
			to_date = to_dateObj.toString();

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = start_timeObj.toString();

		Object end_timeObj = map.get("end_time");
		if(end_timeObj != null)
			end_time = end_timeObj.toString();

		Object is_holidayObj = map.get("is_holiday");
		if(is_holidayObj != null)
			is_holiday = is_holidayObj.toString();

		Object delivery_timeObj = map.get("delivery_time");
		if(delivery_timeObj != null)
			delivery_time = delivery_timeObj.toString();

		Object table_noObj = map.get("table_no");
		if(table_noObj != null)
			table_no = table_noObj.toString();

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

		Object reference_nameObj = map.get("reference_name");
		if(reference_nameObj != null)
			reference_name = reference_nameObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object address1Obj = map.get("address1");
		if(address1Obj != null)
			address1 = address1Obj.toString();

		Object address2Obj = map.get("address2");
		if(address2Obj != null)
			address2 = address2Obj.toString();

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

		Object allObj = map.get("all");
		if(allObj != null)
			all = allObj.toString();

		Object record_statusObj = map.get("record_status");
		if(record_statusObj != null)
			record_status = record_statusObj.toString();

		Object designationObj = map.get("designation");
		if(designationObj != null)
			designation = designationObj.toString();

		Object addressObj = map.get("address");
		if(addressObj != null)
			address = addressObj.toString();

		Object quantityObj = map.get("quantity");
		if(quantityObj != null)
			quantity = new Double(quantityObj.toString());

		Object total_vatObj = map.get("total_vat");
		if(total_vatObj != null)
			total_vat = new Double(total_vatObj.toString());

		Object total_daysObj = map.get("total_days");
		if(total_daysObj != null)
			total_days = new Double(total_daysObj.toString());

		Object total_presentObj = map.get("total_present");
		if(total_presentObj != null)
			total_present = new Double(total_presentObj.toString());

		Object total_percentageObj = map.get("total_percentage");
		if(total_percentageObj != null)
			total_percentage = new Double(total_percentageObj.toString());

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
			total_products = new Long(total_productsObj.toString());

		Object total_readyObj = map.get("total_ready");
		if(total_readyObj != null)
			total_ready = new Long(total_readyObj.toString());

		Object total_not_availableObj = map.get("total_not_available");
		if(total_not_availableObj != null)
			total_not_available = new Long(total_not_availableObj.toString());

		Object total_pendingObj = map.get("total_pending");
		if(total_pendingObj != null)
			total_pending = new Long(total_pendingObj.toString());

		Object total_cancelledObj = map.get("total_cancelled");
		if(total_cancelledObj != null)
			total_cancelled = new Long(total_cancelledObj.toString());

		Object total_deliveredObj = map.get("total_delivered");
		if(total_deliveredObj != null)
			total_delivered = new Long(total_deliveredObj.toString());

		Object total_quantityObj = map.get("total_quantity");
		if(total_quantityObj != null)
			total_quantity = new Double(total_quantityObj.toString());

		Object recipientsObj = map.get("recipients");
		if(recipientsObj != null)
			recipients = recipientsObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

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

		Object downloadedObj = map.get("downloaded");
		if(downloadedObj != null)
			downloaded = downloadedObj.toString();

		Object printedObj = map.get("printed");
		if(printedObj != null)
			printed = printedObj.toString();

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

		Object enable_chatObj = map.get("enable_chat");
		if(enable_chatObj != null)
			enable_chat = enable_chatObj.toString();

		Object send_sms_app_userObj = map.get("send_sms_app_user");
		if(send_sms_app_userObj != null)
			send_sms_app_user = send_sms_app_userObj.toString();

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

		Object messageTypeObj = map.get("messageType");
		if(messageTypeObj != null)
			messageType = messageTypeObj.toString();

		Object project_idObj = map.get("project_id");
		if(project_idObj != null)
			project_id = project_idObj.toString();

		Object project_nameObj = map.get("project_name");
		if(project_nameObj != null)
			project_name = project_nameObj.toString();

		Object meeting_idObj = map.get("meeting_id");
		if(meeting_idObj != null)
			meeting_id = meeting_idObj.toString();

		Object mom_idObj = map.get("mom_id");
		if(mom_idObj != null)
			mom_id = mom_idObj.toString();

		Object parent_project_idObj = map.get("parent_project_id");
		if(parent_project_idObj != null)
			parent_project_id = parent_project_idObj.toString();

		Object parent_project_nameObj = map.get("parent_project_name");
		if(parent_project_nameObj != null)
			parent_project_name = parent_project_nameObj.toString();

		Object meeting_nameObj = map.get("meeting_name");
		if(meeting_nameObj != null)
			meeting_name = meeting_nameObj.toString();

		Object releaseObj = map.get("release");
		if(releaseObj != null)
			release = releaseObj.toString();

		Object priorityObj = map.get("priority");
		if(priorityObj != null)
			priority = priorityObj.toString();

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

	public String getAttachment() {
		return attachment;
	}

	public String getAttachmentEx() {
		return attachment != null ? attachment : "";
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public void unSetAttachment() {
		this.attachment = null;
	}

	public String getAttachment_name() {
		return attachment_name;
	}

	public String getAttachment_nameEx() {
		return attachment_name != null ? attachment_name : "";
	}

	public void setAttachment_name(String attachment_name) {
		this.attachment_name = attachment_name;
	}

	public void unSetAttachment_name() {
		this.attachment_name = null;
	}

	public String getHas_attachment() {
		return has_attachment;
	}

	public String getHas_attachmentEx() {
		return has_attachment != null ? has_attachment : "";
	}

	public void setHas_attachment(String has_attachment) {
		this.has_attachment = has_attachment;
	}

	public void unSetHas_attachment() {
		this.has_attachment = null;
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

	public String getRelease_id() {
		return release_id;
	}

	public String getRelease_idEx() {
		return release_id != null ? release_id : "";
	}

	public void setRelease_id(String release_id) {
		this.release_id = release_id;
	}

	public void unSetRelease_id() {
		this.release_id = null;
	}

	public String getRelease_name() {
		return release_name;
	}

	public String getRelease_nameEx() {
		return release_name != null ? release_name : "";
	}

	public void setRelease_name(String release_name) {
		this.release_name = release_name;
	}

	public void unSetRelease_name() {
		this.release_name = null;
	}

	public String getComponent_id() {
		return component_id;
	}

	public String getComponent_idEx() {
		return component_id != null ? component_id : "";
	}

	public void setComponent_id(String component_id) {
		this.component_id = component_id;
	}

	public void unSetComponent_id() {
		this.component_id = null;
	}

	public String getComponent_name() {
		return component_name;
	}

	public String getComponent_nameEx() {
		return component_name != null ? component_name : "";
	}

	public void setComponent_name(String component_name) {
		this.component_name = component_name;
	}

	public void unSetComponent_name() {
		this.component_name = null;
	}

	public String getSprint_id() {
		return sprint_id;
	}

	public String getSprint_idEx() {
		return sprint_id != null ? sprint_id : "";
	}

	public void setSprint_id(String sprint_id) {
		this.sprint_id = sprint_id;
	}

	public void unSetSprint_id() {
		this.sprint_id = null;
	}

	public String getSprint_name() {
		return sprint_name;
	}

	public String getSprint_nameEx() {
		return sprint_name != null ? sprint_name : "";
	}

	public void setSprint_name(String sprint_name) {
		this.sprint_name = sprint_name;
	}

	public void unSetSprint_name() {
		this.sprint_name = null;
	}

	public String getFrom_date() {
		return from_date;
	}

	public String getFrom_dateEx() {
		return from_date != null ? from_date : "";
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public void unSetFrom_date() {
		this.from_date = null;
	}

	public String getPhoto_url() {
		return photo_url;
	}

	public String getPhoto_urlEx() {
		return photo_url != null ? photo_url : "";
	}

	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}

	public void unSetPhoto_url() {
		this.photo_url = null;
	}

	public String getCreated_by_id() {
		return created_by_id;
	}

	public String getCreated_by_idEx() {
		return created_by_id != null ? created_by_id : "";
	}

	public void setCreated_by_id(String created_by_id) {
		this.created_by_id = created_by_id;
	}

	public void unSetCreated_by_id() {
		this.created_by_id = null;
	}

	public String getCreated_by_name() {
		return created_by_name;
	}

	public String getCreated_by_nameEx() {
		return created_by_name != null ? created_by_name : "";
	}

	public void setCreated_by_name(String created_by_name) {
		this.created_by_name = created_by_name;
	}

	public void unSetCreated_by_name() {
		this.created_by_name = null;
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

	public String getTo_date() {
		return to_date;
	}

	public String getTo_dateEx() {
		return to_date != null ? to_date : "";
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public void unSetTo_date() {
		this.to_date = null;
	}

	public String getStart_time() {
		return start_time;
	}

	public String getStart_timeEx() {
		return start_time != null ? start_time : "";
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public void unSetStart_time() {
		this.start_time = null;
	}

	public String getEnd_time() {
		return end_time;
	}

	public String getEnd_timeEx() {
		return end_time != null ? end_time : "";
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public void unSetEnd_time() {
		this.end_time = null;
	}

	public String getIs_holiday() {
		return is_holiday;
	}

	public String getIs_holidayEx() {
		return is_holiday != null ? is_holiday : "";
	}

	public void setIs_holiday(String is_holiday) {
		this.is_holiday = is_holiday;
	}

	public void unSetIs_holiday() {
		this.is_holiday = null;
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

	public String getAll() {
		return all;
	}

	public String getAllEx() {
		return all != null ? all : "";
	}

	public void setAll(String all) {
		this.all = all;
	}

	public void unSetAll() {
		this.all = null;
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

	public Double getTotal_days() {
		return total_days;
	}

	public void setTotal_days(Double total_days) {
		this.total_days = total_days;
	}

	public void unSetTotal_days() {
		this.total_days = null;
	}

	public Double getTotal_present() {
		return total_present;
	}

	public void setTotal_present(Double total_present) {
		this.total_present = total_present;
	}

	public void unSetTotal_present() {
		this.total_present = null;
	}

	public Double getTotal_percentage() {
		return total_percentage;
	}

	public void setTotal_percentage(Double total_percentage) {
		this.total_percentage = total_percentage;
	}

	public void unSetTotal_percentage() {
		this.total_percentage = null;
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

	public Long getTotal_products() {
		return total_products;
	}

	public long getTotal_productsEx() {
		return total_products != null ? total_products : 0L;
	}

	public void setTotal_products(long total_products) {
		this.total_products = total_products;
	}

	public void setTotal_products(Long total_products) {
		this.total_products = total_products;
	}

	public void unSetTotal_products() {
		this.total_products = null;
	}

	public Long getTotal_ready() {
		return total_ready;
	}

	public long getTotal_readyEx() {
		return total_ready != null ? total_ready : 0L;
	}

	public void setTotal_ready(long total_ready) {
		this.total_ready = total_ready;
	}

	public void setTotal_ready(Long total_ready) {
		this.total_ready = total_ready;
	}

	public void unSetTotal_ready() {
		this.total_ready = null;
	}

	public Long getTotal_not_available() {
		return total_not_available;
	}

	public long getTotal_not_availableEx() {
		return total_not_available != null ? total_not_available : 0L;
	}

	public void setTotal_not_available(long total_not_available) {
		this.total_not_available = total_not_available;
	}

	public void setTotal_not_available(Long total_not_available) {
		this.total_not_available = total_not_available;
	}

	public void unSetTotal_not_available() {
		this.total_not_available = null;
	}

	public Long getTotal_pending() {
		return total_pending;
	}

	public long getTotal_pendingEx() {
		return total_pending != null ? total_pending : 0L;
	}

	public void setTotal_pending(long total_pending) {
		this.total_pending = total_pending;
	}

	public void setTotal_pending(Long total_pending) {
		this.total_pending = total_pending;
	}

	public void unSetTotal_pending() {
		this.total_pending = null;
	}

	public Long getTotal_cancelled() {
		return total_cancelled;
	}

	public long getTotal_cancelledEx() {
		return total_cancelled != null ? total_cancelled : 0L;
	}

	public void setTotal_cancelled(long total_cancelled) {
		this.total_cancelled = total_cancelled;
	}

	public void setTotal_cancelled(Long total_cancelled) {
		this.total_cancelled = total_cancelled;
	}

	public void unSetTotal_cancelled() {
		this.total_cancelled = null;
	}

	public Long getTotal_delivered() {
		return total_delivered;
	}

	public long getTotal_deliveredEx() {
		return total_delivered != null ? total_delivered : 0L;
	}

	public void setTotal_delivered(long total_delivered) {
		this.total_delivered = total_delivered;
	}

	public void setTotal_delivered(Long total_delivered) {
		this.total_delivered = total_delivered;
	}

	public void unSetTotal_delivered() {
		this.total_delivered = null;
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

	public String getDownloaded() {
		return downloaded;
	}

	public String getDownloadedEx() {
		return downloaded != null ? downloaded : "";
	}

	public void setDownloaded(String downloaded) {
		this.downloaded = downloaded;
	}

	public void unSetDownloaded() {
		this.downloaded = null;
	}

	public String getPrinted() {
		return printed;
	}

	public String getPrintedEx() {
		return printed != null ? printed : "";
	}

	public void setPrinted(String printed) {
		this.printed = printed;
	}

	public void unSetPrinted() {
		this.printed = null;
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

	public String getEnable_chat() {
		return enable_chat != null ? enable_chat : "Y";
	}

	public void setEnable_chat(String enable_chat) {
		this.enable_chat = enable_chat;
	}

	public void unSetEnable_chat() {
		this.enable_chat = "Y";
	}

	public String getSend_sms_app_user() {
		return send_sms_app_user != null ? send_sms_app_user : "Y";
	}

	public void setSend_sms_app_user(String send_sms_app_user) {
		this.send_sms_app_user = send_sms_app_user;
	}

	public void unSetSend_sms_app_user() {
		this.send_sms_app_user = "Y";
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

	public String getMessageType() {
		return messageType;
	}

	public String getMessageTypeEx() {
		return messageType != null ? messageType : "";
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public void unSetMessageType() {
		this.messageType = null;
	}

	public String getProject_id() {
		return project_id;
	}

	public String getProject_idEx() {
		return project_id != null ? project_id : "";
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public void unSetProject_id() {
		this.project_id = null;
	}

	public String getProject_name() {
		return project_name;
	}

	public String getProject_nameEx() {
		return project_name != null ? project_name : "";
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public void unSetProject_name() {
		this.project_name = null;
	}

	public String getMeeting_id() {
		return meeting_id;
	}

	public String getMeeting_idEx() {
		return meeting_id != null ? meeting_id : "";
	}

	public void setMeeting_id(String meeting_id) {
		this.meeting_id = meeting_id;
	}

	public void unSetMeeting_id() {
		this.meeting_id = null;
	}

	public String getMom_id() {
		return mom_id;
	}

	public String getMom_idEx() {
		return mom_id != null ? mom_id : "";
	}

	public void setMom_id(String mom_id) {
		this.mom_id = mom_id;
	}

	public void unSetMom_id() {
		this.mom_id = null;
	}

	public String getParent_project_id() {
		return parent_project_id;
	}

	public String getParent_project_idEx() {
		return parent_project_id != null ? parent_project_id : "";
	}

	public void setParent_project_id(String parent_project_id) {
		this.parent_project_id = parent_project_id;
	}

	public void unSetParent_project_id() {
		this.parent_project_id = null;
	}

	public String getParent_project_name() {
		return parent_project_name;
	}

	public String getParent_project_nameEx() {
		return parent_project_name != null ? parent_project_name : "";
	}

	public void setParent_project_name(String parent_project_name) {
		this.parent_project_name = parent_project_name;
	}

	public void unSetParent_project_name() {
		this.parent_project_name = null;
	}

	public String getMeeting_name() {
		return meeting_name;
	}

	public String getMeeting_nameEx() {
		return meeting_name != null ? meeting_name : "";
	}

	public void setMeeting_name(String meeting_name) {
		this.meeting_name = meeting_name;
	}

	public void unSetMeeting_name() {
		this.meeting_name = null;
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