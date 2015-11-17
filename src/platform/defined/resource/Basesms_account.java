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
import platform.util.ExceptionSeverity;
import platform.util.Field;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basesms_account extends BaseResource {
	private String id = null;
	private String name = null;
	private String url = null;
	private String username_fieldname = null;
	private String username = null;
	private String password_fieldname = null;
	private String password = null;
	private String mobile_fieldname = null;
	private String message_fieldname = null;
	private String signature_field = null;
	private String signature = null;
	private String send_email = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_URL = "url";
	public static String FIELD_USERNAME_FIELDNAME = "username_fieldname";
	public static String FIELD_USERNAME = "username";
	public static String FIELD_PASSWORD_FIELDNAME = "password_fieldname";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_MOBILE_FIELDNAME = "mobile_fieldname";
	public static String FIELD_MESSAGE_FIELDNAME = "message_fieldname";
	public static String FIELD_SIGNATURE_FIELD = "signature_field";
	public static String FIELD_SIGNATURE = "signature";
	public static String FIELD_SEND_EMAIL = "send_email";
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

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field urlField = new Field("url", "String");
		urlField.setLength(128);
		metaData.addField(urlField);

		Field username_fieldnameField = new Field("username_fieldname", "String");
		username_fieldnameField.setLength(128);
		metaData.addField(username_fieldnameField);

		Field usernameField = new Field("username", "String");
		usernameField.setLength(128);
		metaData.addField(usernameField);

		Field password_fieldnameField = new Field("password_fieldname", "String");
		password_fieldnameField.setLength(128);
		metaData.addField(password_fieldnameField);

		Field passwordField = new Field("password", "String");
		passwordField.setLength(128);
		metaData.addField(passwordField);

		Field mobile_fieldnameField = new Field("mobile_fieldname", "String");
		mobile_fieldnameField.setLength(128);
		metaData.addField(mobile_fieldnameField);

		Field message_fieldnameField = new Field("message_fieldname", "String");
		message_fieldnameField.setLength(128);
		metaData.addField(message_fieldnameField);

		Field signature_fieldField = new Field("signature_field", "String");
		signature_fieldField.setLength(128);
		metaData.addField(signature_fieldField);

		Field signatureField = new Field("signature", "String");
		signatureField.setLength(128);
		metaData.addField(signatureField);

		Field send_emailField = new Field("send_email", "String");
		send_emailField.setDefaultValue("N");
		send_emailField.setLength(1);
		metaData.addField(send_emailField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("sms_account");

		metaData.setCluster("DB_CONFIG");
	}

	public Basesms_account() {}

	public Basesms_account(Basesms_account obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.url = obj.url;
		this.username_fieldname = obj.username_fieldname;
		this.username = obj.username;
		this.password_fieldname = obj.password_fieldname;
		this.password = obj.password;
		this.mobile_fieldname = obj.mobile_fieldname;
		this.message_fieldname = obj.message_fieldname;
		this.signature_field = obj.signature_field;
		this.signature = obj.signature;
		this.send_email = obj.send_email;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(send_email == null)
			send_email = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(url != null)
			map.put("url", url);
		if(username_fieldname != null)
			map.put("username_fieldname", username_fieldname);
		if(username != null)
			map.put("username", username);
		if(password_fieldname != null)
			map.put("password_fieldname", password_fieldname);
		if(password != null)
			map.put("password", password);
		if(mobile_fieldname != null)
			map.put("mobile_fieldname", mobile_fieldname);
		if(message_fieldname != null)
			map.put("message_fieldname", message_fieldname);
		if(signature_field != null)
			map.put("signature_field", signature_field);
		if(signature != null)
			map.put("signature", signature);
		if(send_email != null)
			map.put("send_email", send_email);
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
		if(name != null)
			map.put("name", name);
		if(url != null)
			map.put("url", url);
		if(username_fieldname != null)
			map.put("username_fieldname", username_fieldname);
		if(username != null)
			map.put("username", username);
		if(password_fieldname != null)
			map.put("password_fieldname", password_fieldname);
		if(password != null)
			map.put("password", password);
		if(mobile_fieldname != null)
			map.put("mobile_fieldname", mobile_fieldname);
		if(message_fieldname != null)
			map.put("message_fieldname", message_fieldname);
		if(signature_field != null)
			map.put("signature_field", signature_field);
		if(signature != null)
			map.put("signature", signature);
		if(send_email != null)
			map.put("send_email", send_email);
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
		url = (String) map.get("url");
		username_fieldname = (String) map.get("username_fieldname");
		username = (String) map.get("username");
		password_fieldname = (String) map.get("password_fieldname");
		password = (String) map.get("password");
		mobile_fieldname = (String) map.get("mobile_fieldname");
		message_fieldname = (String) map.get("message_fieldname");
		signature_field = (String) map.get("signature_field");
		signature = (String) map.get("signature");
		send_email = (String) map.get("send_email");
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

		Object urlObj = map.get("url");
		if(urlObj != null)
			url = urlObj.toString();

		Object username_fieldnameObj = map.get("username_fieldname");
		if(username_fieldnameObj != null)
			username_fieldname = username_fieldnameObj.toString();

		Object usernameObj = map.get("username");
		if(usernameObj != null)
			username = usernameObj.toString();

		Object password_fieldnameObj = map.get("password_fieldname");
		if(password_fieldnameObj != null)
			password_fieldname = password_fieldnameObj.toString();

		Object passwordObj = map.get("password");
		if(passwordObj != null)
			password = passwordObj.toString();

		Object mobile_fieldnameObj = map.get("mobile_fieldname");
		if(mobile_fieldnameObj != null)
			mobile_fieldname = mobile_fieldnameObj.toString();

		Object message_fieldnameObj = map.get("message_fieldname");
		if(message_fieldnameObj != null)
			message_fieldname = message_fieldnameObj.toString();

		Object signature_fieldObj = map.get("signature_field");
		if(signature_fieldObj != null)
			signature_field = signature_fieldObj.toString();

		Object signatureObj = map.get("signature");
		if(signatureObj != null)
			signature = signatureObj.toString();

		Object send_emailObj = map.get("send_email");
		if(send_emailObj != null)
			send_email = send_emailObj.toString();

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

	public String getUsername_fieldname() {
		return username_fieldname;
	}

	public String getUsername_fieldnameEx() {
		return username_fieldname != null ? username_fieldname : "";
	}

	public void setUsername_fieldname(String username_fieldname) {
		this.username_fieldname = username_fieldname;
	}

	public void unSetUsername_fieldname() {
		this.username_fieldname = null;
	}

	public String getUsername() {
		return username;
	}

	public String getUsernameEx() {
		return username != null ? username : "";
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void unSetUsername() {
		this.username = null;
	}

	public String getPassword_fieldname() {
		return password_fieldname;
	}

	public String getPassword_fieldnameEx() {
		return password_fieldname != null ? password_fieldname : "";
	}

	public void setPassword_fieldname(String password_fieldname) {
		this.password_fieldname = password_fieldname;
	}

	public void unSetPassword_fieldname() {
		this.password_fieldname = null;
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

	public String getSignature_field() {
		return signature_field;
	}

	public String getSignature_fieldEx() {
		return signature_field != null ? signature_field : "";
	}

	public void setSignature_field(String signature_field) {
		this.signature_field = signature_field;
	}

	public void unSetSignature_field() {
		this.signature_field = null;
	}

	public String getSignature() {
		return signature;
	}

	public String getSignatureEx() {
		return signature != null ? signature : "";
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public void unSetSignature() {
		this.signature = null;
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