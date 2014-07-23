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
public abstract class Basesms_account extends BaseResource {
	private String id = null;
	private String url = null;
	private String aid_fieldname = null;
	private String aid = null;
	private String pin_fieldname = null;
	private String pin = null;
	private String mobile_fieldname = null;
	private String message_fieldname = null;
	private String send_on_email = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_URL = "url";
	public static String FIELD_AID_FIELDNAME = "aid_fieldname";
	public static String FIELD_AID = "aid";
	public static String FIELD_PIN_FIELDNAME = "pin_fieldname";
	public static String FIELD_PIN = "pin";
	public static String FIELD_MOBILE_FIELDNAME = "mobile_fieldname";
	public static String FIELD_MESSAGE_FIELDNAME = "message_fieldname";
	public static String FIELD_SEND_ON_EMAIL = "send_on_email";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("sms_account");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field urlField = new Field("url", "String");
		urlField.setLength(128);
		metaData.addField(urlField);

		Field aid_fieldnameField = new Field("aid_fieldname", "String");
		aid_fieldnameField.setLength(128);
		metaData.addField(aid_fieldnameField);

		Field aidField = new Field("aid", "String");
		aidField.setLength(128);
		metaData.addField(aidField);

		Field pin_fieldnameField = new Field("pin_fieldname", "String");
		pin_fieldnameField.setLength(128);
		metaData.addField(pin_fieldnameField);

		Field pinField = new Field("pin", "String");
		pinField.setLength(128);
		metaData.addField(pinField);

		Field mobile_fieldnameField = new Field("mobile_fieldname", "String");
		mobile_fieldnameField.setLength(128);
		metaData.addField(mobile_fieldnameField);

		Field message_fieldnameField = new Field("message_fieldname", "String");
		message_fieldnameField.setLength(128);
		metaData.addField(message_fieldnameField);

		Field send_on_emailField = new Field("send_on_email", "String");
		send_on_emailField.setLength(1);
		metaData.addField(send_on_emailField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("sms_account");

		metaData.setCluster("DB_CONFIG");
	}

	public Basesms_account() {}

	public Basesms_account(Basesms_account obj) {
		this.id = obj.id;
		this.url = obj.url;
		this.aid_fieldname = obj.aid_fieldname;
		this.aid = obj.aid;
		this.pin_fieldname = obj.pin_fieldname;
		this.pin = obj.pin;
		this.mobile_fieldname = obj.mobile_fieldname;
		this.message_fieldname = obj.message_fieldname;
		this.send_on_email = obj.send_on_email;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(url != null)
			map.put("url", url);
		if(aid_fieldname != null)
			map.put("aid_fieldname", aid_fieldname);
		if(aid != null)
			map.put("aid", aid);
		if(pin_fieldname != null)
			map.put("pin_fieldname", pin_fieldname);
		if(pin != null)
			map.put("pin", pin);
		if(mobile_fieldname != null)
			map.put("mobile_fieldname", mobile_fieldname);
		if(message_fieldname != null)
			map.put("message_fieldname", message_fieldname);
		if(send_on_email != null)
			map.put("send_on_email", send_on_email);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(url != null)
			map.put("url", url);
		if(aid_fieldname != null)
			map.put("aid_fieldname", aid_fieldname);
		if(aid != null)
			map.put("aid", aid);
		if(pin_fieldname != null)
			map.put("pin_fieldname", pin_fieldname);
		if(pin != null)
			map.put("pin", pin);
		if(mobile_fieldname != null)
			map.put("mobile_fieldname", mobile_fieldname);
		if(message_fieldname != null)
			map.put("message_fieldname", message_fieldname);
		if(send_on_email != null)
			map.put("send_on_email", send_on_email);
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
		url = (String) map.get("url");
		aid_fieldname = (String) map.get("aid_fieldname");
		aid = (String) map.get("aid");
		pin_fieldname = (String) map.get("pin_fieldname");
		pin = (String) map.get("pin");
		mobile_fieldname = (String) map.get("mobile_fieldname");
		message_fieldname = (String) map.get("message_fieldname");
		send_on_email = (String) map.get("send_on_email");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object urlObj = map.get("url");
		if(urlObj != null)
			url = urlObj.toString();

		Object aid_fieldnameObj = map.get("aid_fieldname");
		if(aid_fieldnameObj != null)
			aid_fieldname = aid_fieldnameObj.toString();

		Object aidObj = map.get("aid");
		if(aidObj != null)
			aid = aidObj.toString();

		Object pin_fieldnameObj = map.get("pin_fieldname");
		if(pin_fieldnameObj != null)
			pin_fieldname = pin_fieldnameObj.toString();

		Object pinObj = map.get("pin");
		if(pinObj != null)
			pin = pinObj.toString();

		Object mobile_fieldnameObj = map.get("mobile_fieldname");
		if(mobile_fieldnameObj != null)
			mobile_fieldname = mobile_fieldnameObj.toString();

		Object message_fieldnameObj = map.get("message_fieldname");
		if(message_fieldnameObj != null)
			message_fieldname = message_fieldnameObj.toString();

		Object send_on_emailObj = map.get("send_on_email");
		if(send_on_emailObj != null)
			send_on_email = send_on_emailObj.toString();

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

	public String getAid_fieldname() {
		return aid_fieldname;
	}

	public String getAid_fieldnameEx() {
		return aid_fieldname != null ? aid_fieldname : "";
	}

	public void setAid_fieldname(String aid_fieldname) {
		this.aid_fieldname = aid_fieldname;
	}

	public void unSetAid_fieldname() {
		this.aid_fieldname = null;
	}

	public String getAid() {
		return aid;
	}

	public String getAidEx() {
		return aid != null ? aid : "";
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public void unSetAid() {
		this.aid = null;
	}

	public String getPin_fieldname() {
		return pin_fieldname;
	}

	public String getPin_fieldnameEx() {
		return pin_fieldname != null ? pin_fieldname : "";
	}

	public void setPin_fieldname(String pin_fieldname) {
		this.pin_fieldname = pin_fieldname;
	}

	public void unSetPin_fieldname() {
		this.pin_fieldname = null;
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

	public String getMobile_fieldname() {
		return mobile_fieldname;
	}

	public String getMobile_fieldnameEx() {
		return mobile_fieldname != null ? mobile_fieldname : "";
	}

	public void setMobile_fieldname(String mobile_fieldname) {
		this.mobile_fieldname = mobile_fieldname;
	}

	public void unSetMobile_fieldname() {
		this.mobile_fieldname = null;
	}

	public String getMessage_fieldname() {
		return message_fieldname;
	}

	public String getMessage_fieldnameEx() {
		return message_fieldname != null ? message_fieldname : "";
	}

	public void setMessage_fieldname(String message_fieldname) {
		this.message_fieldname = message_fieldname;
	}

	public void unSetMessage_fieldname() {
		this.message_fieldname = null;
	}

	public String getSend_on_email() {
		return send_on_email;
	}

	public String getSend_on_emailEx() {
		return send_on_email != null ? send_on_email : "";
	}

	public void setSend_on_email(String send_on_email) {
		this.send_on_email = send_on_email;
	}

	public void unSetSend_on_email() {
		this.send_on_email = null;
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
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}