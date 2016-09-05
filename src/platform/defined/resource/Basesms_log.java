/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import java.util.HashMap;
import java.util.Map;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Field;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basesms_log extends BaseResource {
	private String id = null;
	private String parent_id = null;
	private String reason = null;
	private String reference_id = null;
	private String reference_description = null;
	private String student_id = null;
	private String student_name = null;
	private String class_name = null;
	private String section_name = null;
	private String community_id = null;
	private String community_name = null;
	private String customer_id = null;
	private String school_id = null;
	private String school_name = null;
	private String user_id = null;
	private String member_name = null;
	private String mobile_no = null;
	private String person_name = null;
	private String date = null;
	private Long event_creation_time = null;
	private Long invocation_time = null;
	private Long sent_try_time = null;
	private Long sent_time = null;
	private String sent_status = null; //N-Not sent,S-Sent,F-Failed
	private String processing_status = null; //N-Not Processed, P-Processed
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_PARENT_ID = "parent_id";
	public static String FIELD_REASON = "reason";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_REFERENCE_DESCRIPTION = "reference_description";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_STUDENT_NAME = "student_name";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_COMMUNITY_NAME = "community_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_SCHOOL_NAME = "school_name";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_MEMBER_NAME = "member_name";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_PERSON_NAME = "person_name";
	public static String FIELD_DATE = "date";
	public static String FIELD_EVENT_CREATION_TIME = "event_creation_time";
	public static String FIELD_INVOCATION_TIME = "invocation_time";
	public static String FIELD_SENT_TRY_TIME = "sent_try_time";
	public static String FIELD_SENT_TIME = "sent_time";
	public static String FIELD_SENT_STATUS = "sent_status";
	public static String FIELD_PROCESSING_STATUS = "processing_status";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("sms_log");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setLength(128);
		metaData.addField(idField);

		Field parent_idField = new Field("parent_id", "String");
		parent_idField.setLength(128);
		metaData.addField(parent_idField);

		Field reasonField = new Field("reason", "String");
		reasonField.setLength(32);
		metaData.addField(reasonField);

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(32);
		metaData.addField(reference_idField);

		Field reference_descriptionField = new Field("reference_description", "String");
		reference_descriptionField.setLength(32);
		metaData.addField(reference_descriptionField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setLength(32);
		metaData.addField(student_idField);

		Field student_nameField = new Field("student_name", "String");
		student_nameField.setLength(32);
		metaData.addField(student_nameField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(32);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(32);
		metaData.addField(section_nameField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setLength(32);
		metaData.addField(community_idField);

		Field community_nameField = new Field("community_name", "String");
		community_nameField.setLength(32);
		metaData.addField(community_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(32);
		metaData.addField(customer_idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(32);
		metaData.addField(school_idField);

		Field school_nameField = new Field("school_name", "String");
		school_nameField.setLength(32);
		metaData.addField(school_nameField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(32);
		metaData.addField(user_idField);

		Field member_nameField = new Field("member_name", "String");
		member_nameField.setLength(32);
		metaData.addField(member_nameField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(32);
		metaData.addField(mobile_noField);

		Field person_nameField = new Field("person_name", "String");
		person_nameField.setLength(32);
		metaData.addField(person_nameField);

		Field dateField = new Field("date", "String");
		dateField.setLength(32);
		metaData.addField(dateField);

		Field event_creation_timeField = new Field("event_creation_time", "timestamp");
		metaData.addField(event_creation_timeField);

		Field invocation_timeField = new Field("invocation_time", "timestamp");
		metaData.addField(invocation_timeField);

		Field sent_try_timeField = new Field("sent_try_time", "timestamp");
		metaData.addField(sent_try_timeField);

		Field sent_timeField = new Field("sent_time", "timestamp");
		metaData.addField(sent_timeField);

		Field sent_statusField = new Field("sent_status", "String");
		sent_statusField.setLength(1);
		metaData.addField(sent_statusField);

		Field processing_statusField = new Field("processing_status", "String");
		processing_statusField.setLength(1);
		metaData.addField(processing_statusField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("sms_log");

		metaData.setCluster("DB_LOG");
	}

	public Basesms_log() {}

	public Basesms_log(Basesms_log obj) {
		this.id = obj.id;
		this.parent_id = obj.parent_id;
		this.reason = obj.reason;
		this.reference_id = obj.reference_id;
		this.reference_description = obj.reference_description;
		this.student_id = obj.student_id;
		this.student_name = obj.student_name;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.community_id = obj.community_id;
		this.community_name = obj.community_name;
		this.customer_id = obj.customer_id;
		this.school_id = obj.school_id;
		this.school_name = obj.school_name;
		this.user_id = obj.user_id;
		this.member_name = obj.member_name;
		this.mobile_no = obj.mobile_no;
		this.person_name = obj.person_name;
		this.date = obj.date;
		this.event_creation_time = obj.event_creation_time;
		this.invocation_time = obj.invocation_time;
		this.sent_try_time = obj.sent_try_time;
		this.sent_time = obj.sent_time;
		this.sent_status = obj.sent_status;
		this.processing_status = obj.processing_status;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(reason != null)
			map.put("reason", reason);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_description != null)
			map.put("reference_description", reference_description);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(school_name != null)
			map.put("school_name", school_name);
		if(user_id != null)
			map.put("user_id", user_id);
		if(member_name != null)
			map.put("member_name", member_name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(person_name != null)
			map.put("person_name", person_name);
		if(date != null)
			map.put("date", date);
		if(event_creation_time != null)
			map.put("event_creation_time", event_creation_time);
		if(invocation_time != null)
			map.put("invocation_time", invocation_time);
		if(sent_try_time != null)
			map.put("sent_try_time", sent_try_time);
		if(sent_time != null)
			map.put("sent_time", sent_time);
		if(sent_status != null)
			map.put("sent_status", sent_status);
		if(processing_status != null)
			map.put("processing_status", processing_status);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(reason != null)
			map.put("reason", reason);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_description != null)
			map.put("reference_description", reference_description);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(school_name != null)
			map.put("school_name", school_name);
		if(user_id != null)
			map.put("user_id", user_id);
		if(member_name != null)
			map.put("member_name", member_name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(person_name != null)
			map.put("person_name", person_name);
		if(date != null)
			map.put("date", date);
		if(event_creation_time != null)
			map.put("event_creation_time", event_creation_time);
		if(invocation_time != null)
			map.put("invocation_time", invocation_time);
		if(sent_try_time != null)
			map.put("sent_try_time", sent_try_time);
		if(sent_time != null)
			map.put("sent_time", sent_time);
		if(sent_status != null)
			map.put("sent_status", sent_status);
		if(processing_status != null)
			map.put("processing_status", processing_status);
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
		parent_id = (String) map.get("parent_id");
		reason = (String) map.get("reason");
		reference_id = (String) map.get("reference_id");
		reference_description = (String) map.get("reference_description");
		student_id = (String) map.get("student_id");
		student_name = (String) map.get("student_name");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		community_id = (String) map.get("community_id");
		community_name = (String) map.get("community_name");
		customer_id = (String) map.get("customer_id");
		school_id = (String) map.get("school_id");
		school_name = (String) map.get("school_name");
		user_id = (String) map.get("user_id");
		member_name = (String) map.get("member_name");
		mobile_no = (String) map.get("mobile_no");
		person_name = (String) map.get("person_name");
		date = (String) map.get("date");
		event_creation_time = (Long) map.get("event_creation_time");
		invocation_time = (Long) map.get("invocation_time");
		sent_try_time = (Long) map.get("sent_try_time");
		sent_time = (Long) map.get("sent_time");
		sent_status = (String) map.get("sent_status");
		processing_status = (String) map.get("processing_status");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object parent_idObj = map.get("parent_id");
		if(parent_idObj != null)
			parent_id = parent_idObj.toString();

		Object reasonObj = map.get("reason");
		if(reasonObj != null)
			reason = reasonObj.toString();

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

		Object reference_descriptionObj = map.get("reference_description");
		if(reference_descriptionObj != null)
			reference_description = reference_descriptionObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object student_nameObj = map.get("student_name");
		if(student_nameObj != null)
			student_name = student_nameObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object community_nameObj = map.get("community_name");
		if(community_nameObj != null)
			community_name = community_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object school_nameObj = map.get("school_name");
		if(school_nameObj != null)
			school_name = school_nameObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object member_nameObj = map.get("member_name");
		if(member_nameObj != null)
			member_name = member_nameObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object person_nameObj = map.get("person_name");
		if(person_nameObj != null)
			person_name = person_nameObj.toString();

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = dateObj.toString();

		Object event_creation_timeObj = map.get("event_creation_time");
		if(event_creation_timeObj != null)
			event_creation_time = (Long) event_creation_timeObj;

		Object invocation_timeObj = map.get("invocation_time");
		if(invocation_timeObj != null)
			invocation_time = (Long) invocation_timeObj;

		Object sent_try_timeObj = map.get("sent_try_time");
		if(sent_try_timeObj != null)
			sent_try_time = (Long) sent_try_timeObj;

		Object sent_timeObj = map.get("sent_time");
		if(sent_timeObj != null)
			sent_time = (Long) sent_timeObj;

		Object sent_statusObj = map.get("sent_status");
		if(sent_statusObj != null)
			sent_status = sent_statusObj.toString();

		Object processing_statusObj = map.get("processing_status");
		if(processing_statusObj != null)
			processing_status = processing_statusObj.toString();

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

	public String getReason() {
		return reason;
	}

	public String getReasonEx() {
		return reason != null ? reason : "";
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void unSetReason() {
		this.reason = null;
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

	public String getReference_description() {
		return reference_description;
	}

	public String getReference_descriptionEx() {
		return reference_description != null ? reference_description : "";
	}

	public void setReference_description(String reference_description) {
		this.reference_description = reference_description;
	}

	public void unSetReference_description() {
		this.reference_description = null;
	}

	public String getStudent_id() {
		return student_id;
	}

	public String getStudent_idEx() {
		return student_id != null ? student_id : "";
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public void unSetStudent_id() {
		this.student_id = null;
	}

	public String getStudent_name() {
		return student_name;
	}

	public String getStudent_nameEx() {
		return student_name != null ? student_name : "";
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void unSetStudent_name() {
		this.student_name = null;
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

	public String getSchool_name() {
		return school_name;
	}

	public String getSchool_nameEx() {
		return school_name != null ? school_name : "";
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public void unSetSchool_name() {
		this.school_name = null;
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

	public String getMember_name() {
		return member_name;
	}

	public String getMember_nameEx() {
		return member_name != null ? member_name : "";
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public void unSetMember_name() {
		this.member_name = null;
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

	public String getPerson_name() {
		return person_name;
	}

	public String getPerson_nameEx() {
		return person_name != null ? person_name : "";
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	public void unSetPerson_name() {
		this.person_name = null;
	}

	public String getDate() {
		return date;
	}

	public String getDateEx() {
		return date != null ? date : "";
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void unSetDate() {
		this.date = null;
	}

	public Long getEvent_creation_time() {
		return event_creation_time;
	}

	public void setEvent_creation_time(Long event_creation_time) {
		this.event_creation_time = event_creation_time;
	}


	public Long getInvocation_time() {
		return invocation_time;
	}

	public void setInvocation_time(Long invocation_time) {
		this.invocation_time = invocation_time;
	}


	public Long getSent_try_time() {
		return sent_try_time;
	}

	public void setSent_try_time(Long sent_try_time) {
		this.sent_try_time = sent_try_time;
	}


	public Long getSent_time() {
		return sent_time;
	}

	public void setSent_time(Long sent_time) {
		this.sent_time = sent_time;
	}


	public String getSent_status() {
		return sent_status;
	}

	public String getSent_statusEx() {
		return sent_status != null ? sent_status : "";
	}

	public void setSent_status(String sent_status) {
		this.sent_status = sent_status;
	}

	public void unSetSent_status() {
		this.sent_status = null;
	}

	public String getProcessing_status() {
		return processing_status;
	}

	public String getProcessing_statusEx() {
		return processing_status != null ? processing_status : "";
	}

	public void setProcessing_status(String processing_status) {
		this.processing_status = processing_status;
	}

	public void unSetProcessing_status() {
		this.processing_status = null;
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
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}