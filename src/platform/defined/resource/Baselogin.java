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
public abstract class Baselogin extends BaseResource {
	private String email_id = null;
	private String password = null;
	private String session_id = null;

	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_SESSION_ID = "session_id";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("login");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field email_idField = new Field("email_id", "String");
		email_idField.setRequired(true);
		email_idField.setLength(128);
		metaData.addField(email_idField);

		Field passwordField = new Field("password", "String");
		passwordField.setRequired(true);
		passwordField.setLength(16);
		metaData.addField(passwordField);

		Field session_idField = new Field("session_id", "String");
		session_idField.setLength(128);
		metaData.addField(session_idField);


		metaData.setTableName("login");

		metaData.setCluster("DB_CONFIG");
	}

	public Baselogin() {}

	public Baselogin(Baselogin obj) {
		this.email_id = obj.email_id;
		this.password = obj.password;
		this.session_id = obj.session_id;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(email_id != null)
			map.put("email_id", email_id);
		if(password != null)
			map.put("password", password);
		if(session_id != null)
			map.put("session_id", session_id);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateEmail_id(add))
			map.put("email_id", email_id);
		if(validatePassword(add))
			map.put("password", password);
		if(session_id != null)
			map.put("session_id", session_id);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		email_id = (String) map.get("email_id");
		password = (String) map.get("password");
		session_id = (String) map.get("session_id");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object passwordObj = map.get("password");
		if(passwordObj != null)
			password = passwordObj.toString();

		Object session_idObj = map.get("session_id");
		if(session_idObj != null)
			session_id = session_idObj.toString();

	}

	public void convertPrimaryMapToResource(Map<String, Object> map) {
	}

	public void convertTypeUnsafePrimaryMapToResource(Map<String, Object> map) {
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

	public boolean validateEmail_id(boolean add) throws ApplicationException {
		if(add && email_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[email_id]");
		return email_id != null;
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

	public boolean validatePassword(boolean add) throws ApplicationException {
		if(add && password == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[password]");
		return password != null;
	}

	public String getSession_id() {
		return session_id;
	}

	public String getSession_idEx() {
		return session_id != null ? session_id : "";
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public void unSetSession_id() {
		this.session_id = null;
	}
	public String getCluster() {
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}