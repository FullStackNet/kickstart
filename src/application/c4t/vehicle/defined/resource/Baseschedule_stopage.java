/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseschedule_stopage extends BaseResource {
	private String id = null;
	private String name = null;
	private String customer_id = null;
	private String user_id = null;
	private String schedule_id = null;
	private String stopage_id = null;
	private String scheduleTime = null;
	private Integer stopage_order = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_SCHEDULE_ID = "schedule_id";
	public static String FIELD_STOPAGE_ID = "stopage_id";
	public static String FIELD_SCHEDULETIME = "scheduleTime";
	public static String FIELD_STOPAGE_ORDER = "stopage_order";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("schedule_stopage");

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

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setRequired(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field schedule_idField = new Field("schedule_id", "String");
		schedule_idField.setLength(128);
		metaData.addField(schedule_idField);

		Field stopage_idField = new Field("stopage_id", "String");
		stopage_idField.setLength(128);
		metaData.addField(stopage_idField);

		Field scheduleTimeField = new Field("scheduleTime", "String");
		scheduleTimeField.setLength(6);
		metaData.addField(scheduleTimeField);

		Field stopage_orderField = new Field("stopage_order", "int");
		metaData.addField(stopage_orderField);


		metaData.setTableName("schedule_stopage");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseschedule_stopage() {}

	public Baseschedule_stopage(Baseschedule_stopage obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.schedule_id = obj.schedule_id;
		this.stopage_id = obj.stopage_id;
		this.scheduleTime = obj.scheduleTime;
		this.stopage_order = obj.stopage_order;
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
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(schedule_id != null)
			map.put("schedule_id", schedule_id);
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(scheduleTime != null)
			map.put("scheduleTime", scheduleTime);
		if(stopage_order != null)
			map.put("stopage_order", stopage_order);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validateName(add))
			map.put("name", name);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(validateUser_id(add))
			map.put("user_id", user_id);
		if(schedule_id != null)
			map.put("schedule_id", schedule_id);
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(scheduleTime != null)
			map.put("scheduleTime", scheduleTime);
		if(stopage_order != null)
			map.put("stopage_order", stopage_order);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		name = (String) map.get("name");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		schedule_id = (String) map.get("schedule_id");
		stopage_id = (String) map.get("stopage_id");
		scheduleTime = (String) map.get("scheduleTime");
		stopage_order = (Integer) map.get("stopage_order");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object schedule_idObj = map.get("schedule_id");
		if(schedule_idObj != null)
			schedule_id = schedule_idObj.toString();

		Object stopage_idObj = map.get("stopage_id");
		if(stopage_idObj != null)
			stopage_id = stopage_idObj.toString();

		Object scheduleTimeObj = map.get("scheduleTime");
		if(scheduleTimeObj != null)
			scheduleTime = scheduleTimeObj.toString();

		Object stopage_orderObj = map.get("stopage_order");
		if(stopage_orderObj != null)
			stopage_order = new Integer(stopage_orderObj.toString());

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

	public boolean validateCustomer_id(boolean add) throws ApplicationException {
		if(add && customer_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[customer_id]");
		return customer_id != null;
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

	public boolean validateUser_id(boolean add) throws ApplicationException {
		if(add && user_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[user_id]");
		return user_id != null;
	}

	public String getSchedule_id() {
		return schedule_id;
	}

	public String getSchedule_idEx() {
		return schedule_id != null ? schedule_id : "";
	}

	public void setSchedule_id(String schedule_id) {
		this.schedule_id = schedule_id;
	}

	public void unSetSchedule_id() {
		this.schedule_id = null;
	}

	public String getStopage_id() {
		return stopage_id;
	}

	public String getStopage_idEx() {
		return stopage_id != null ? stopage_id : "";
	}

	public void setStopage_id(String stopage_id) {
		this.stopage_id = stopage_id;
	}

	public void unSetStopage_id() {
		this.stopage_id = null;
	}

	public String getScheduleTime() {
		return scheduleTime;
	}

	public String getScheduleTimeEx() {
		return scheduleTime != null ? scheduleTime : "";
	}

	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public void unSetScheduleTime() {
		this.scheduleTime = null;
	}

	public Integer getStopage_order() {
		return stopage_order;
	}

	public int getStopage_orderEx() {
		return stopage_order != null ? stopage_order : 0;
	}

	public void setStopage_order(int stopage_order) {
		this.stopage_order = stopage_order;
	}

	public void setStopage_order(Integer stopage_order) {
		this.stopage_order = stopage_order;
	}

	public void unSetStopage_order() {
		this.stopage_order = null;
	}
	public String getCluster() {
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}