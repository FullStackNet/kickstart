/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basestaff_timing extends BaseResource {
	private String id = null;
	private String name = null;
	private String school_id = null;
	private String customer_id = null;
	private Integer entry_buffer_beforeInMin = null;
	private Integer entry_buffer_afterInMin = null;
	private Integer exit_buffer_beforeInMin = null;
	private Integer exit_buffer_afterInMin = null;
	private String start_time = null;
	private String end_time = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_ENTRY_BUFFER_BEFOREINMIN = "entry_buffer_beforeInMin";
	public static String FIELD_ENTRY_BUFFER_AFTERINMIN = "entry_buffer_afterInMin";
	public static String FIELD_EXIT_BUFFER_BEFOREINMIN = "exit_buffer_beforeInMin";
	public static String FIELD_EXIT_BUFFER_AFTERINMIN = "exit_buffer_afterInMin";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_END_TIME = "end_time";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("staff_timing");

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

		Field school_idField = new Field("school_id", "String");
		school_idField.setRequired(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field entry_buffer_beforeInMinField = new Field("entry_buffer_beforeInMin", "int");
		metaData.addField(entry_buffer_beforeInMinField);

		Field entry_buffer_afterInMinField = new Field("entry_buffer_afterInMin", "int");
		metaData.addField(entry_buffer_afterInMinField);

		Field exit_buffer_beforeInMinField = new Field("exit_buffer_beforeInMin", "int");
		metaData.addField(exit_buffer_beforeInMinField);

		Field exit_buffer_afterInMinField = new Field("exit_buffer_afterInMin", "int");
		metaData.addField(exit_buffer_afterInMinField);

		Field start_timeField = new Field("start_time", "String");
		start_timeField.setLength(16);
		metaData.addField(start_timeField);

		Field end_timeField = new Field("end_time", "String");
		end_timeField.setLength(16);
		metaData.addField(end_timeField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("staff_timing");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basestaff_timing() {}

	public Basestaff_timing(Basestaff_timing obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.school_id = obj.school_id;
		this.customer_id = obj.customer_id;
		this.entry_buffer_beforeInMin = obj.entry_buffer_beforeInMin;
		this.entry_buffer_afterInMin = obj.entry_buffer_afterInMin;
		this.exit_buffer_beforeInMin = obj.exit_buffer_beforeInMin;
		this.exit_buffer_afterInMin = obj.exit_buffer_afterInMin;
		this.start_time = obj.start_time;
		this.end_time = obj.end_time;
		this.creation_time = obj.creation_time;
		this.extra_data = obj.extra_data;
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
		if(school_id != null)
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(entry_buffer_beforeInMin != null)
			map.put("entry_buffer_beforeInMin", entry_buffer_beforeInMin);
		if(entry_buffer_afterInMin != null)
			map.put("entry_buffer_afterInMin", entry_buffer_afterInMin);
		if(exit_buffer_beforeInMin != null)
			map.put("exit_buffer_beforeInMin", exit_buffer_beforeInMin);
		if(exit_buffer_afterInMin != null)
			map.put("exit_buffer_afterInMin", exit_buffer_afterInMin);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(validateSchool_id(add))
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(entry_buffer_beforeInMin != null)
			map.put("entry_buffer_beforeInMin", entry_buffer_beforeInMin);
		if(entry_buffer_afterInMin != null)
			map.put("entry_buffer_afterInMin", entry_buffer_afterInMin);
		if(exit_buffer_beforeInMin != null)
			map.put("exit_buffer_beforeInMin", exit_buffer_beforeInMin);
		if(exit_buffer_afterInMin != null)
			map.put("exit_buffer_afterInMin", exit_buffer_afterInMin);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(creation_time != null)
			map.put("creation_time", creation_time);
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
		school_id = (String) map.get("school_id");
		customer_id = (String) map.get("customer_id");
		entry_buffer_beforeInMin = (Integer) map.get("entry_buffer_beforeInMin");
		entry_buffer_afterInMin = (Integer) map.get("entry_buffer_afterInMin");
		exit_buffer_beforeInMin = (Integer) map.get("exit_buffer_beforeInMin");
		exit_buffer_afterInMin = (Integer) map.get("exit_buffer_afterInMin");
		start_time = (String) map.get("start_time");
		end_time = (String) map.get("end_time");
		creation_time = (Long) map.get("creation_time");
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

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object entry_buffer_beforeInMinObj = map.get("entry_buffer_beforeInMin");
		if(entry_buffer_beforeInMinObj != null)
			entry_buffer_beforeInMin = new Integer(entry_buffer_beforeInMinObj.toString());

		Object entry_buffer_afterInMinObj = map.get("entry_buffer_afterInMin");
		if(entry_buffer_afterInMinObj != null)
			entry_buffer_afterInMin = new Integer(entry_buffer_afterInMinObj.toString());

		Object exit_buffer_beforeInMinObj = map.get("exit_buffer_beforeInMin");
		if(exit_buffer_beforeInMinObj != null)
			exit_buffer_beforeInMin = new Integer(exit_buffer_beforeInMinObj.toString());

		Object exit_buffer_afterInMinObj = map.get("exit_buffer_afterInMin");
		if(exit_buffer_afterInMinObj != null)
			exit_buffer_afterInMin = new Integer(exit_buffer_afterInMinObj.toString());

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = start_timeObj.toString();

		Object end_timeObj = map.get("end_time");
		if(end_timeObj != null)
			end_time = end_timeObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

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

	public boolean validateSchool_id(boolean add) throws ApplicationException {
		if(add && school_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[school_id]");
		return school_id != null;
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

	public Integer getEntry_buffer_beforeInMin() {
		return entry_buffer_beforeInMin;
	}

	public int getEntry_buffer_beforeInMinEx() {
		return entry_buffer_beforeInMin != null ? entry_buffer_beforeInMin : 0;
	}

	public void setEntry_buffer_beforeInMin(int entry_buffer_beforeInMin) {
		this.entry_buffer_beforeInMin = entry_buffer_beforeInMin;
	}

	public void setEntry_buffer_beforeInMin(Integer entry_buffer_beforeInMin) {
		this.entry_buffer_beforeInMin = entry_buffer_beforeInMin;
	}

	public void unSetEntry_buffer_beforeInMin() {
		this.entry_buffer_beforeInMin = null;
	}

	public Integer getEntry_buffer_afterInMin() {
		return entry_buffer_afterInMin;
	}

	public int getEntry_buffer_afterInMinEx() {
		return entry_buffer_afterInMin != null ? entry_buffer_afterInMin : 0;
	}

	public void setEntry_buffer_afterInMin(int entry_buffer_afterInMin) {
		this.entry_buffer_afterInMin = entry_buffer_afterInMin;
	}

	public void setEntry_buffer_afterInMin(Integer entry_buffer_afterInMin) {
		this.entry_buffer_afterInMin = entry_buffer_afterInMin;
	}

	public void unSetEntry_buffer_afterInMin() {
		this.entry_buffer_afterInMin = null;
	}

	public Integer getExit_buffer_beforeInMin() {
		return exit_buffer_beforeInMin;
	}

	public int getExit_buffer_beforeInMinEx() {
		return exit_buffer_beforeInMin != null ? exit_buffer_beforeInMin : 0;
	}

	public void setExit_buffer_beforeInMin(int exit_buffer_beforeInMin) {
		this.exit_buffer_beforeInMin = exit_buffer_beforeInMin;
	}

	public void setExit_buffer_beforeInMin(Integer exit_buffer_beforeInMin) {
		this.exit_buffer_beforeInMin = exit_buffer_beforeInMin;
	}

	public void unSetExit_buffer_beforeInMin() {
		this.exit_buffer_beforeInMin = null;
	}

	public Integer getExit_buffer_afterInMin() {
		return exit_buffer_afterInMin;
	}

	public int getExit_buffer_afterInMinEx() {
		return exit_buffer_afterInMin != null ? exit_buffer_afterInMin : 0;
	}

	public void setExit_buffer_afterInMin(int exit_buffer_afterInMin) {
		this.exit_buffer_afterInMin = exit_buffer_afterInMin;
	}

	public void setExit_buffer_afterInMin(Integer exit_buffer_afterInMin) {
		this.exit_buffer_afterInMin = exit_buffer_afterInMin;
	}

	public void unSetExit_buffer_afterInMin() {
		this.exit_buffer_afterInMin = null;
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

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
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
		return "DB_SCHOOL";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}