/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.brushupskills.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseworkshop extends BaseResource {
	private String id = null;
	private String title = null;
	private String description = null;
	private Integer total_seat = null;
	private Integer registered = null;
	private String from_time = null;
	private String to_time = null;
	private String attachment = null;
	private Long workshop_date = null;
	private String workshop_date_str = null;
	private Long creation_time = null;
	private String send_sms = null;
	private Integer total_sent = null;
	private Integer total_sms_sent = null;
	private Integer total_email_sent = null;
	private Integer total_app_notification_sent = null;
	private String send_email = null;
	private String sent = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_TOTAL_SEAT = "total_seat";
	public static String FIELD_REGISTERED = "registered";
	public static String FIELD_FROM_TIME = "from_time";
	public static String FIELD_TO_TIME = "to_time";
	public static String FIELD_ATTACHMENT = "attachment";
	public static String FIELD_WORKSHOP_DATE = "workshop_date";
	public static String FIELD_WORKSHOP_DATE_STR = "workshop_date_str";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_SEND_SMS = "send_sms";
	public static String FIELD_TOTAL_SENT = "total_sent";
	public static String FIELD_TOTAL_SMS_SENT = "total_sms_sent";
	public static String FIELD_TOTAL_EMAIL_SENT = "total_email_sent";
	public static String FIELD_TOTAL_APP_NOTIFICATION_SENT = "total_app_notification_sent";
	public static String FIELD_SEND_EMAIL = "send_email";
	public static String FIELD_SENT = "sent";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("workshop");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field titleField = new Field("title", "String");
		titleField.setLength(512);
		metaData.addField(titleField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(4096);
		metaData.addField(descriptionField);

		Field total_seatField = new Field("total_seat", "int");
		metaData.addField(total_seatField);

		Field registeredField = new Field("registered", "int");
		metaData.addField(registeredField);

		Field from_timeField = new Field("from_time", "String");
		from_timeField.setLength(128);
		metaData.addField(from_timeField);

		Field to_timeField = new Field("to_time", "String");
		to_timeField.setLength(128);
		metaData.addField(to_timeField);

		Field attachmentField = new Field("attachment", "String");
		attachmentField.setLength(128);
		metaData.addField(attachmentField);

		Field workshop_dateField = new Field("workshop_date", "timestamp");
		metaData.addField(workshop_dateField);

		Field workshop_date_strField = new Field("workshop_date_str", "String");
		workshop_date_strField.setLength(32);
		metaData.addField(workshop_date_strField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field send_smsField = new Field("send_sms", "String");
		send_smsField.setDefaultValue("N");
		send_smsField.setLength(1);
		metaData.addField(send_smsField);

		Field total_sentField = new Field("total_sent", "int");
		metaData.addField(total_sentField);

		Field total_sms_sentField = new Field("total_sms_sent", "int");
		metaData.addField(total_sms_sentField);

		Field total_email_sentField = new Field("total_email_sent", "int");
		metaData.addField(total_email_sentField);

		Field total_app_notification_sentField = new Field("total_app_notification_sent", "int");
		metaData.addField(total_app_notification_sentField);

		Field send_emailField = new Field("send_email", "String");
		send_emailField.setDefaultValue("N");
		send_emailField.setLength(1);
		metaData.addField(send_emailField);

		Field sentField = new Field("sent", "String");
		sentField.setDefaultValue("N");
		sentField.setLength(1);
		metaData.addField(sentField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("workshop");

		metaData.setCluster("DB_QUESTION");
	}

	public Baseworkshop() {}

	public Baseworkshop(Baseworkshop obj) {
		this.id = obj.id;
		this.title = obj.title;
		this.description = obj.description;
		this.total_seat = obj.total_seat;
		this.registered = obj.registered;
		this.from_time = obj.from_time;
		this.to_time = obj.to_time;
		this.attachment = obj.attachment;
		this.workshop_date = obj.workshop_date;
		this.workshop_date_str = obj.workshop_date_str;
		this.creation_time = obj.creation_time;
		this.send_sms = obj.send_sms;
		this.total_sent = obj.total_sent;
		this.total_sms_sent = obj.total_sms_sent;
		this.total_email_sent = obj.total_email_sent;
		this.total_app_notification_sent = obj.total_app_notification_sent;
		this.send_email = obj.send_email;
		this.sent = obj.sent;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(send_sms == null)
			send_sms = "N";
		if(send_email == null)
			send_email = "N";
		if(sent == null)
			sent = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(total_seat != null)
			map.put("total_seat", total_seat);
		if(registered != null)
			map.put("registered", registered);
		if(from_time != null)
			map.put("from_time", from_time);
		if(to_time != null)
			map.put("to_time", to_time);
		if(attachment != null)
			map.put("attachment", attachment);
		if(workshop_date != null)
			map.put("workshop_date", workshop_date);
		if(workshop_date_str != null)
			map.put("workshop_date_str", workshop_date_str);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(send_sms != null)
			map.put("send_sms", send_sms);
		if(total_sent != null)
			map.put("total_sent", total_sent);
		if(total_sms_sent != null)
			map.put("total_sms_sent", total_sms_sent);
		if(total_email_sent != null)
			map.put("total_email_sent", total_email_sent);
		if(total_app_notification_sent != null)
			map.put("total_app_notification_sent", total_app_notification_sent);
		if(send_email != null)
			map.put("send_email", send_email);
		if(sent != null)
			map.put("sent", sent);
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
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(total_seat != null)
			map.put("total_seat", total_seat);
		if(registered != null)
			map.put("registered", registered);
		if(from_time != null)
			map.put("from_time", from_time);
		if(to_time != null)
			map.put("to_time", to_time);
		if(attachment != null)
			map.put("attachment", attachment);
		if(workshop_date != null)
			map.put("workshop_date", workshop_date);
		if(workshop_date_str != null)
			map.put("workshop_date_str", workshop_date_str);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(send_sms != null)
			map.put("send_sms", send_sms);
		if(total_sent != null)
			map.put("total_sent", total_sent);
		if(total_sms_sent != null)
			map.put("total_sms_sent", total_sms_sent);
		if(total_email_sent != null)
			map.put("total_email_sent", total_email_sent);
		if(total_app_notification_sent != null)
			map.put("total_app_notification_sent", total_app_notification_sent);
		if(send_email != null)
			map.put("send_email", send_email);
		if(sent != null)
			map.put("sent", sent);
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
		title = (String) map.get("title");
		description = (String) map.get("description");
		total_seat = (Integer) map.get("total_seat");
		registered = (Integer) map.get("registered");
		from_time = (String) map.get("from_time");
		to_time = (String) map.get("to_time");
		attachment = (String) map.get("attachment");
		workshop_date = (Long) map.get("workshop_date");
		workshop_date_str = (String) map.get("workshop_date_str");
		creation_time = (Long) map.get("creation_time");
		send_sms = (String) map.get("send_sms");
		total_sent = (Integer) map.get("total_sent");
		total_sms_sent = (Integer) map.get("total_sms_sent");
		total_email_sent = (Integer) map.get("total_email_sent");
		total_app_notification_sent = (Integer) map.get("total_app_notification_sent");
		send_email = (String) map.get("send_email");
		sent = (String) map.get("sent");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object total_seatObj = map.get("total_seat");
		if(total_seatObj != null)
			total_seat = new Integer(total_seatObj.toString());

		Object registeredObj = map.get("registered");
		if(registeredObj != null)
			registered = new Integer(registeredObj.toString());

		Object from_timeObj = map.get("from_time");
		if(from_timeObj != null)
			from_time = from_timeObj.toString();

		Object to_timeObj = map.get("to_time");
		if(to_timeObj != null)
			to_time = to_timeObj.toString();

		Object attachmentObj = map.get("attachment");
		if(attachmentObj != null)
			attachment = attachmentObj.toString();

		Object workshop_dateObj = map.get("workshop_date");
		if(workshop_dateObj != null)
			workshop_date = (Long) workshop_dateObj;

		Object workshop_date_strObj = map.get("workshop_date_str");
		if(workshop_date_strObj != null)
			workshop_date_str = workshop_date_strObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object send_smsObj = map.get("send_sms");
		if(send_smsObj != null)
			send_sms = send_smsObj.toString();

		Object total_sentObj = map.get("total_sent");
		if(total_sentObj != null)
			total_sent = new Integer(total_sentObj.toString());

		Object total_sms_sentObj = map.get("total_sms_sent");
		if(total_sms_sentObj != null)
			total_sms_sent = new Integer(total_sms_sentObj.toString());

		Object total_email_sentObj = map.get("total_email_sent");
		if(total_email_sentObj != null)
			total_email_sent = new Integer(total_email_sentObj.toString());

		Object total_app_notification_sentObj = map.get("total_app_notification_sent");
		if(total_app_notification_sentObj != null)
			total_app_notification_sent = new Integer(total_app_notification_sentObj.toString());

		Object send_emailObj = map.get("send_email");
		if(send_emailObj != null)
			send_email = send_emailObj.toString();

		Object sentObj = map.get("sent");
		if(sentObj != null)
			sent = sentObj.toString();

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

	public Integer getTotal_seat() {
		return total_seat;
	}

	public int getTotal_seatEx() {
		return total_seat != null ? total_seat : 0;
	}

	public void setTotal_seat(int total_seat) {
		this.total_seat = total_seat;
	}

	public void setTotal_seat(Integer total_seat) {
		this.total_seat = total_seat;
	}

	public void unSetTotal_seat() {
		this.total_seat = null;
	}

	public Integer getRegistered() {
		return registered;
	}

	public int getRegisteredEx() {
		return registered != null ? registered : 0;
	}

	public void setRegistered(int registered) {
		this.registered = registered;
	}

	public void setRegistered(Integer registered) {
		this.registered = registered;
	}

	public void unSetRegistered() {
		this.registered = null;
	}

	public String getFrom_time() {
		return from_time;
	}

	public String getFrom_timeEx() {
		return from_time != null ? from_time : "";
	}

	public void setFrom_time(String from_time) {
		this.from_time = from_time;
	}

	public void unSetFrom_time() {
		this.from_time = null;
	}

	public String getTo_time() {
		return to_time;
	}

	public String getTo_timeEx() {
		return to_time != null ? to_time : "";
	}

	public void setTo_time(String to_time) {
		this.to_time = to_time;
	}

	public void unSetTo_time() {
		this.to_time = null;
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

	public Long getWorkshop_date() {
		return workshop_date;
	}

	public void setWorkshop_date(Long workshop_date) {
		this.workshop_date = workshop_date;
	}


	public String getWorkshop_date_str() {
		return workshop_date_str;
	}

	public String getWorkshop_date_strEx() {
		return workshop_date_str != null ? workshop_date_str : "";
	}

	public void setWorkshop_date_str(String workshop_date_str) {
		this.workshop_date_str = workshop_date_str;
	}

	public void unSetWorkshop_date_str() {
		this.workshop_date_str = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
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

	public String getSend_email() {
		return send_email != null ? send_email : "N";
	}

	public void setSend_email(String send_email) {
		this.send_email = send_email;
	}

	public void unSetSend_email() {
		this.send_email = "N";
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
		return "DB_QUESTION";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}