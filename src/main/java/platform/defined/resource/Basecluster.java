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
public abstract class Basecluster extends BaseResource {
	private String id = null;
	private String name = null;
	private String cluster_name = null;
	private String server = null;
	private Integer port = null;
	private String db_name = null;
	private String user_name = null;
	private String password = null;
	private String site_short_code = null;
	private String cluster_type = null;
	private String state = null;
	private Integer dbType = null;
	private String configName = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_CLUSTER_NAME = "cluster_name";
	public static String FIELD_SERVER = "server";
	public static String FIELD_PORT = "port";
	public static String FIELD_DB_NAME = "db_name";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_SITE_SHORT_CODE = "site_short_code";
	public static String FIELD_CLUSTER_TYPE = "cluster_type";
	public static String FIELD_STATE = "state";
	public static String FIELD_DBTYPE = "dbType";
	public static String FIELD_CONFIGNAME = "configName";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("cluster");

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

		Field cluster_nameField = new Field("cluster_name", "String");
		cluster_nameField.setRequired(true);
		cluster_nameField.setLength(128);
		metaData.addField(cluster_nameField);

		Field serverField = new Field("server", "String");
		serverField.setRequired(true);
		serverField.setLength(128);
		metaData.addField(serverField);

		Field portField = new Field("port", "int");
		metaData.addField(portField);

		Field db_nameField = new Field("db_name", "String");
		db_nameField.setRequired(true);
		db_nameField.setLength(32);
		metaData.addField(db_nameField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setRequired(true);
		user_nameField.setLength(32);
		metaData.addField(user_nameField);

		Field passwordField = new Field("password", "String");
		passwordField.setRequired(true);
		passwordField.setLength(32);
		metaData.addField(passwordField);

		Field site_short_codeField = new Field("site_short_code", "String");
		site_short_codeField.setLength(128);
		metaData.addField(site_short_codeField);

		Field cluster_typeField = new Field("cluster_type", "String");
		cluster_typeField.setLength(128);
		metaData.addField(cluster_typeField);

		Field stateField = new Field("state", "String");
		stateField.setDefaultValue("DOWN");
		stateField.setLength(16);
		metaData.addField(stateField);

		Field dbTypeField = new Field("dbType", "int");
		dbTypeField.setDefaultValue(4);
		metaData.addField(dbTypeField);

		Field configNameField = new Field("configName", "String");
		configNameField.setDefaultValue("local");
		configNameField.setLength(32);
		metaData.addField(configNameField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("cluster");

		metaData.setCluster("DB_CONFIG");
	}

	public Basecluster() {}

	public Basecluster(Basecluster obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.cluster_name = obj.cluster_name;
		this.server = obj.server;
		this.port = obj.port;
		this.db_name = obj.db_name;
		this.user_name = obj.user_name;
		this.password = obj.password;
		this.site_short_code = obj.site_short_code;
		this.cluster_type = obj.cluster_type;
		this.state = obj.state;
		this.dbType = obj.dbType;
		this.configName = obj.configName;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(state == null)
			state = "DOWN";
		if(dbType == null)
			dbType = 4;
		if(configName == null)
			configName = "local";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(cluster_name != null)
			map.put("cluster_name", cluster_name);
		if(server != null)
			map.put("server", server);
		if(port != null)
			map.put("port", port);
		if(db_name != null)
			map.put("db_name", db_name);
		if(user_name != null)
			map.put("user_name", user_name);
		if(password != null)
			map.put("password", password);
		if(site_short_code != null)
			map.put("site_short_code", site_short_code);
		if(cluster_type != null)
			map.put("cluster_type", cluster_type);
		if(state != null)
			map.put("state", state);
		if(dbType != null)
			map.put("dbType", dbType);
		if(configName != null)
			map.put("configName", configName);
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
		if(validateCluster_name(add))
			map.put("cluster_name", cluster_name);
		if(validateServer(add))
			map.put("server", server);
		if(port != null)
			map.put("port", port);
		if(validateDb_name(add))
			map.put("db_name", db_name);
		if(validateUser_name(add))
			map.put("user_name", user_name);
		if(validatePassword(add))
			map.put("password", password);
		if(site_short_code != null)
			map.put("site_short_code", site_short_code);
		if(cluster_type != null)
			map.put("cluster_type", cluster_type);
		if(state != null)
			map.put("state", state);
		if(dbType != null)
			map.put("dbType", dbType);
		if(configName != null)
			map.put("configName", configName);
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
		cluster_name = (String) map.get("cluster_name");
		server = (String) map.get("server");
		port = (Integer) map.get("port");
		db_name = (String) map.get("db_name");
		user_name = (String) map.get("user_name");
		password = (String) map.get("password");
		site_short_code = (String) map.get("site_short_code");
		cluster_type = (String) map.get("cluster_type");
		state = (String) map.get("state");
		dbType = (Integer) map.get("dbType");
		configName = (String) map.get("configName");
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

		Object cluster_nameObj = map.get("cluster_name");
		if(cluster_nameObj != null)
			cluster_name = cluster_nameObj.toString();

		Object serverObj = map.get("server");
		if(serverObj != null)
			server = serverObj.toString();

		Object portObj = map.get("port");
		if(portObj != null)
			port = new Integer(portObj.toString());

		Object db_nameObj = map.get("db_name");
		if(db_nameObj != null)
			db_name = db_nameObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

		Object passwordObj = map.get("password");
		if(passwordObj != null)
			password = passwordObj.toString();

		Object site_short_codeObj = map.get("site_short_code");
		if(site_short_codeObj != null)
			site_short_code = site_short_codeObj.toString();

		Object cluster_typeObj = map.get("cluster_type");
		if(cluster_typeObj != null)
			cluster_type = cluster_typeObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object dbTypeObj = map.get("dbType");
		if(dbTypeObj != null)
			dbType = new Integer(dbTypeObj.toString());

		Object configNameObj = map.get("configName");
		if(configNameObj != null)
			configName = configNameObj.toString();

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

	public String getCluster_name() {
		return cluster_name;
	}

	public String getCluster_nameEx() {
		return cluster_name != null ? cluster_name : "";
	}

	public void setCluster_name(String cluster_name) {
		this.cluster_name = cluster_name;
	}

	public void unSetCluster_name() {
		this.cluster_name = null;
	}

	public boolean validateCluster_name(boolean add) throws ApplicationException {
		if(add && cluster_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[cluster_name]");
		return cluster_name != null;
	}

	public String getServer() {
		return server;
	}

	public String getServerEx() {
		return server != null ? server : "";
	}

	public void setServer(String server) {
		this.server = server;
	}

	public void unSetServer() {
		this.server = null;
	}

	public boolean validateServer(boolean add) throws ApplicationException {
		if(add && server == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[server]");
		return server != null;
	}

	public Integer getPort() {
		return port;
	}

	public int getPortEx() {
		return port != null ? port : 0;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public void unSetPort() {
		this.port = null;
	}

	public String getDb_name() {
		return db_name;
	}

	public String getDb_nameEx() {
		return db_name != null ? db_name : "";
	}

	public void setDb_name(String db_name) {
		this.db_name = db_name;
	}

	public void unSetDb_name() {
		this.db_name = null;
	}

	public boolean validateDb_name(boolean add) throws ApplicationException {
		if(add && db_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[db_name]");
		return db_name != null;
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

	public boolean validateUser_name(boolean add) throws ApplicationException {
		if(add && user_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[user_name]");
		return user_name != null;
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

	public String getSite_short_code() {
		return site_short_code;
	}

	public String getSite_short_codeEx() {
		return site_short_code != null ? site_short_code : "";
	}

	public void setSite_short_code(String site_short_code) {
		this.site_short_code = site_short_code;
	}

	public void unSetSite_short_code() {
		this.site_short_code = null;
	}

	public String getCluster_type() {
		return cluster_type;
	}

	public String getCluster_typeEx() {
		return cluster_type != null ? cluster_type : "";
	}

	public void setCluster_type(String cluster_type) {
		this.cluster_type = cluster_type;
	}

	public void unSetCluster_type() {
		this.cluster_type = null;
	}

	public String getState() {
		return state != null ? state : "DOWN";
	}

	public void setState(String state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = "DOWN";
	}

	public Integer getDbType() {
		return dbType != null ? dbType : 4;
	}

	public void setDbType(int dbType) {
		this.dbType = dbType;
	}

	public void setDbType(Integer dbType) {
		this.dbType = dbType;
	}

	public void unSetDbType() {
		this.dbType = 4;
	}

	public String getConfigName() {
		return configName != null ? configName : "local";
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public void unSetConfigName() {
		this.configName = "local";
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