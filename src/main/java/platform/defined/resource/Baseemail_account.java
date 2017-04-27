/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

import java.util.HashMap;
import java.util.Map;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseemail_account extends BaseResource {
	private String id = null;
	private String name = null;
	private String do_not_mail = null;
	private String unique_id = null;
	private String bcc_id = null;
	private String send_to_unique_id = null;
	private String send_to_right_id = null;
	private String send_to_both_id = null;
	private String send_to_bcc_id = null;
	private String domain = null;
	private String smtp_server = null;
	private Integer smtp_ssl_port = null;
	private String smtp_username = null;
	private String smtp_password = null;
	private String admin_mail = null;
	private Integer db_workers = null;
	private Integer send_workers = null;
	private Integer mails_queue_size = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_DO_NOT_MAIL = "do_not_mail";
	public static String FIELD_UNIQUE_ID = "unique_id";
	public static String FIELD_BCC_ID = "bcc_id";
	public static String FIELD_SEND_TO_UNIQUE_ID = "send_to_unique_id";
	public static String FIELD_SEND_TO_RIGHT_ID = "send_to_right_id";
	public static String FIELD_SEND_TO_BOTH_ID = "send_to_both_id";
	public static String FIELD_SEND_TO_BCC_ID = "send_to_bcc_id";
	public static String FIELD_DOMAIN = "domain";
	public static String FIELD_SMTP_SERVER = "smtp_server";
	public static String FIELD_SMTP_SSL_PORT = "smtp_ssl_port";
	public static String FIELD_SMTP_USERNAME = "smtp_username";
	public static String FIELD_SMTP_PASSWORD = "smtp_password";
	public static String FIELD_ADMIN_MAIL = "admin_mail";
	public static String FIELD_DB_WORKERS = "db_workers";
	public static String FIELD_SEND_WORKERS = "send_workers";
	public static String FIELD_MAILS_QUEUE_SIZE = "mails_queue_size";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("email_account");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setRequired(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field do_not_mailField = new Field("do_not_mail", "String");
		do_not_mailField.setDefaultValue("N");
		do_not_mailField.setLength(1);
		metaData.addField(do_not_mailField);

		Field unique_idField = new Field("unique_id", "String");
		unique_idField.setLength(128);
		metaData.addField(unique_idField);

		Field bcc_idField = new Field("bcc_id", "String");
		bcc_idField.setLength(128);
		metaData.addField(bcc_idField);

		Field send_to_unique_idField = new Field("send_to_unique_id", "String");
		send_to_unique_idField.setDefaultValue("Y");
		send_to_unique_idField.setLength(128);
		metaData.addField(send_to_unique_idField);

		Field send_to_right_idField = new Field("send_to_right_id", "String");
		send_to_right_idField.setDefaultValue("N");
		send_to_right_idField.setLength(1);
		metaData.addField(send_to_right_idField);

		Field send_to_both_idField = new Field("send_to_both_id", "String");
		send_to_both_idField.setDefaultValue("N");
		send_to_both_idField.setLength(1);
		metaData.addField(send_to_both_idField);

		Field send_to_bcc_idField = new Field("send_to_bcc_id", "String");
		send_to_bcc_idField.setDefaultValue("N");
		send_to_bcc_idField.setLength(1);
		metaData.addField(send_to_bcc_idField);

		Field domainField = new Field("domain", "String");
		domainField.setLength(128);
		metaData.addField(domainField);

		Field smtp_serverField = new Field("smtp_server", "String");
		smtp_serverField.setLength(128);
		metaData.addField(smtp_serverField);

		Field smtp_ssl_portField = new Field("smtp_ssl_port", "int");
		smtp_ssl_portField.setDefaultValue(463);
		metaData.addField(smtp_ssl_portField);

		Field smtp_usernameField = new Field("smtp_username", "String");
		smtp_usernameField.setLength(128);
		metaData.addField(smtp_usernameField);

		Field smtp_passwordField = new Field("smtp_password", "String");
		smtp_passwordField.setLength(128);
		metaData.addField(smtp_passwordField);

		Field admin_mailField = new Field("admin_mail", "String");
		admin_mailField.setLength(128);
		metaData.addField(admin_mailField);

		Field db_workersField = new Field("db_workers", "int");
		db_workersField.setDefaultValue(1);
		metaData.addField(db_workersField);

		Field send_workersField = new Field("send_workers", "int");
		send_workersField.setDefaultValue(6);
		metaData.addField(send_workersField);

		Field mails_queue_sizeField = new Field("mails_queue_size", "int");
		mails_queue_sizeField.setDefaultValue(10000);
		metaData.addField(mails_queue_sizeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("email_account");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseemail_account() {}

	public Baseemail_account(Baseemail_account obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.do_not_mail = obj.do_not_mail;
		this.unique_id = obj.unique_id;
		this.bcc_id = obj.bcc_id;
		this.send_to_unique_id = obj.send_to_unique_id;
		this.send_to_right_id = obj.send_to_right_id;
		this.send_to_both_id = obj.send_to_both_id;
		this.send_to_bcc_id = obj.send_to_bcc_id;
		this.domain = obj.domain;
		this.smtp_server = obj.smtp_server;
		this.smtp_ssl_port = obj.smtp_ssl_port;
		this.smtp_username = obj.smtp_username;
		this.smtp_password = obj.smtp_password;
		this.admin_mail = obj.admin_mail;
		this.db_workers = obj.db_workers;
		this.send_workers = obj.send_workers;
		this.mails_queue_size = obj.mails_queue_size;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(do_not_mail == null)
			do_not_mail = "N";
		if(send_to_unique_id == null)
			send_to_unique_id = "Y";
		if(send_to_right_id == null)
			send_to_right_id = "N";
		if(send_to_both_id == null)
			send_to_both_id = "N";
		if(send_to_bcc_id == null)
			send_to_bcc_id = "N";
		if(smtp_ssl_port == null)
			smtp_ssl_port = 463;
		if(db_workers == null)
			db_workers = 1;
		if(send_workers == null)
			send_workers = 6;
		if(mails_queue_size == null)
			mails_queue_size = 10000;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(do_not_mail != null)
			map.put("do_not_mail", do_not_mail);
		if(unique_id != null)
			map.put("unique_id", unique_id);
		if(bcc_id != null)
			map.put("bcc_id", bcc_id);
		if(send_to_unique_id != null)
			map.put("send_to_unique_id", send_to_unique_id);
		if(send_to_right_id != null)
			map.put("send_to_right_id", send_to_right_id);
		if(send_to_both_id != null)
			map.put("send_to_both_id", send_to_both_id);
		if(send_to_bcc_id != null)
			map.put("send_to_bcc_id", send_to_bcc_id);
		if(domain != null)
			map.put("domain", domain);
		if(smtp_server != null)
			map.put("smtp_server", smtp_server);
		if(smtp_ssl_port != null)
			map.put("smtp_ssl_port", smtp_ssl_port);
		if(smtp_username != null)
			map.put("smtp_username", smtp_username);
		if(smtp_password != null)
			map.put("smtp_password", smtp_password);
		if(admin_mail != null)
			map.put("admin_mail", admin_mail);
		if(db_workers != null)
			map.put("db_workers", db_workers);
		if(send_workers != null)
			map.put("send_workers", send_workers);
		if(mails_queue_size != null)
			map.put("mails_queue_size", mails_queue_size);
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
		if(validateName(add))
			map.put("name", name);
		if(do_not_mail != null)
			map.put("do_not_mail", do_not_mail);
		if(unique_id != null)
			map.put("unique_id", unique_id);
		if(bcc_id != null)
			map.put("bcc_id", bcc_id);
		if(send_to_unique_id != null)
			map.put("send_to_unique_id", send_to_unique_id);
		if(send_to_right_id != null)
			map.put("send_to_right_id", send_to_right_id);
		if(send_to_both_id != null)
			map.put("send_to_both_id", send_to_both_id);
		if(send_to_bcc_id != null)
			map.put("send_to_bcc_id", send_to_bcc_id);
		if(domain != null)
			map.put("domain", domain);
		if(smtp_server != null)
			map.put("smtp_server", smtp_server);
		if(smtp_ssl_port != null)
			map.put("smtp_ssl_port", smtp_ssl_port);
		if(smtp_username != null)
			map.put("smtp_username", smtp_username);
		if(smtp_password != null)
			map.put("smtp_password", smtp_password);
		if(admin_mail != null)
			map.put("admin_mail", admin_mail);
		if(db_workers != null)
			map.put("db_workers", db_workers);
		if(send_workers != null)
			map.put("send_workers", send_workers);
		if(mails_queue_size != null)
			map.put("mails_queue_size", mails_queue_size);
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
		do_not_mail = (String) map.get("do_not_mail");
		unique_id = (String) map.get("unique_id");
		bcc_id = (String) map.get("bcc_id");
		send_to_unique_id = (String) map.get("send_to_unique_id");
		send_to_right_id = (String) map.get("send_to_right_id");
		send_to_both_id = (String) map.get("send_to_both_id");
		send_to_bcc_id = (String) map.get("send_to_bcc_id");
		domain = (String) map.get("domain");
		smtp_server = (String) map.get("smtp_server");
		smtp_ssl_port = (Integer) map.get("smtp_ssl_port");
		smtp_username = (String) map.get("smtp_username");
		smtp_password = (String) map.get("smtp_password");
		admin_mail = (String) map.get("admin_mail");
		db_workers = (Integer) map.get("db_workers");
		send_workers = (Integer) map.get("send_workers");
		mails_queue_size = (Integer) map.get("mails_queue_size");
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

		Object do_not_mailObj = map.get("do_not_mail");
		if(do_not_mailObj != null)
			do_not_mail = do_not_mailObj.toString();

		Object unique_idObj = map.get("unique_id");
		if(unique_idObj != null)
			unique_id = unique_idObj.toString();

		Object bcc_idObj = map.get("bcc_id");
		if(bcc_idObj != null)
			bcc_id = bcc_idObj.toString();

		Object send_to_unique_idObj = map.get("send_to_unique_id");
		if(send_to_unique_idObj != null)
			send_to_unique_id = send_to_unique_idObj.toString();

		Object send_to_right_idObj = map.get("send_to_right_id");
		if(send_to_right_idObj != null)
			send_to_right_id = send_to_right_idObj.toString();

		Object send_to_both_idObj = map.get("send_to_both_id");
		if(send_to_both_idObj != null)
			send_to_both_id = send_to_both_idObj.toString();

		Object send_to_bcc_idObj = map.get("send_to_bcc_id");
		if(send_to_bcc_idObj != null)
			send_to_bcc_id = send_to_bcc_idObj.toString();

		Object domainObj = map.get("domain");
		if(domainObj != null)
			domain = domainObj.toString();

		Object smtp_serverObj = map.get("smtp_server");
		if(smtp_serverObj != null)
			smtp_server = smtp_serverObj.toString();

		Object smtp_ssl_portObj = map.get("smtp_ssl_port");
		if(smtp_ssl_portObj != null)
			smtp_ssl_port = new Integer(smtp_ssl_portObj.toString());

		Object smtp_usernameObj = map.get("smtp_username");
		if(smtp_usernameObj != null)
			smtp_username = smtp_usernameObj.toString();

		Object smtp_passwordObj = map.get("smtp_password");
		if(smtp_passwordObj != null)
			smtp_password = smtp_passwordObj.toString();

		Object admin_mailObj = map.get("admin_mail");
		if(admin_mailObj != null)
			admin_mail = admin_mailObj.toString();

		Object db_workersObj = map.get("db_workers");
		if(db_workersObj != null)
			db_workers = new Integer(db_workersObj.toString());

		Object send_workersObj = map.get("send_workers");
		if(send_workersObj != null)
			send_workers = new Integer(send_workersObj.toString());

		Object mails_queue_sizeObj = map.get("mails_queue_size");
		if(mails_queue_sizeObj != null)
			mails_queue_size = new Integer(mails_queue_sizeObj.toString());

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

	public boolean validateName(boolean add) throws ApplicationException {
		if(add && name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[name]");
		return name != null;
	}

	public String getDo_not_mail() {
		return do_not_mail != null ? do_not_mail : "N";
	}

	public void setDo_not_mail(String do_not_mail) {
		this.do_not_mail = do_not_mail;
	}

	public void unSetDo_not_mail() {
		this.do_not_mail = "N";
	}

	public String getUnique_id() {
		return unique_id;
	}

	public String getUnique_idEx() {
		return unique_id != null ? unique_id : "";
	}

	public void setUnique_id(String unique_id) {
		this.unique_id = unique_id;
	}

	public void unSetUnique_id() {
		this.unique_id = null;
	}

	public String getBcc_id() {
		return bcc_id;
	}

	public String getBcc_idEx() {
		return bcc_id != null ? bcc_id : "";
	}

	public void setBcc_id(String bcc_id) {
		this.bcc_id = bcc_id;
	}

	public void unSetBcc_id() {
		this.bcc_id = null;
	}

	public String getSend_to_unique_id() {
		return send_to_unique_id != null ? send_to_unique_id : "Y";
	}

	public void setSend_to_unique_id(String send_to_unique_id) {
		this.send_to_unique_id = send_to_unique_id;
	}

	public void unSetSend_to_unique_id() {
		this.send_to_unique_id = "Y";
	}

	public String getSend_to_right_id() {
		return send_to_right_id != null ? send_to_right_id : "N";
	}

	public void setSend_to_right_id(String send_to_right_id) {
		this.send_to_right_id = send_to_right_id;
	}

	public void unSetSend_to_right_id() {
		this.send_to_right_id = "N";
	}

	public String getSend_to_both_id() {
		return send_to_both_id != null ? send_to_both_id : "N";
	}

	public void setSend_to_both_id(String send_to_both_id) {
		this.send_to_both_id = send_to_both_id;
	}

	public void unSetSend_to_both_id() {
		this.send_to_both_id = "N";
	}

	public String getSend_to_bcc_id() {
		return send_to_bcc_id != null ? send_to_bcc_id : "N";
	}

	public void setSend_to_bcc_id(String send_to_bcc_id) {
		this.send_to_bcc_id = send_to_bcc_id;
	}

	public void unSetSend_to_bcc_id() {
		this.send_to_bcc_id = "N";
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

	public String getSmtp_server() {
		return smtp_server;
	}

	public String getSmtp_serverEx() {
		return smtp_server != null ? smtp_server : "";
	}

	public void setSmtp_server(String smtp_server) {
		this.smtp_server = smtp_server;
	}

	public void unSetSmtp_server() {
		this.smtp_server = null;
	}

	public Integer getSmtp_ssl_port() {
		return smtp_ssl_port != null ? smtp_ssl_port : 463;
	}

	public void setSmtp_ssl_port(int smtp_ssl_port) {
		this.smtp_ssl_port = smtp_ssl_port;
	}

	public void setSmtp_ssl_port(Integer smtp_ssl_port) {
		this.smtp_ssl_port = smtp_ssl_port;
	}

	public void unSetSmtp_ssl_port() {
		this.smtp_ssl_port = 463;
	}

	public String getSmtp_username() {
		return smtp_username;
	}

	public String getSmtp_usernameEx() {
		return smtp_username != null ? smtp_username : "";
	}

	public void setSmtp_username(String smtp_username) {
		this.smtp_username = smtp_username;
	}

	public void unSetSmtp_username() {
		this.smtp_username = null;
	}

	public String getSmtp_password() {
		return smtp_password;
	}

	public String getSmtp_passwordEx() {
		return smtp_password != null ? smtp_password : "";
	}

	public void setSmtp_password(String smtp_password) {
		this.smtp_password = smtp_password;
	}

	public void unSetSmtp_password() {
		this.smtp_password = null;
	}

	public String getAdmin_mail() {
		return admin_mail;
	}

	public String getAdmin_mailEx() {
		return admin_mail != null ? admin_mail : "";
	}

	public void setAdmin_mail(String admin_mail) {
		this.admin_mail = admin_mail;
	}

	public void unSetAdmin_mail() {
		this.admin_mail = null;
	}

	public Integer getDb_workers() {
		return db_workers != null ? db_workers : 1;
	}

	public void setDb_workers(int db_workers) {
		this.db_workers = db_workers;
	}

	public void setDb_workers(Integer db_workers) {
		this.db_workers = db_workers;
	}

	public void unSetDb_workers() {
		this.db_workers = 1;
	}

	public Integer getSend_workers() {
		return send_workers != null ? send_workers : 6;
	}

	public void setSend_workers(int send_workers) {
		this.send_workers = send_workers;
	}

	public void setSend_workers(Integer send_workers) {
		this.send_workers = send_workers;
	}

	public void unSetSend_workers() {
		this.send_workers = 6;
	}

	public Integer getMails_queue_size() {
		return mails_queue_size != null ? mails_queue_size : 10000;
	}

	public void setMails_queue_size(int mails_queue_size) {
		this.mails_queue_size = mails_queue_size;
	}

	public void setMails_queue_size(Integer mails_queue_size) {
		this.mails_queue_size = mails_queue_size;
	}

	public void unSetMails_queue_size() {
		this.mails_queue_size = 10000;
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