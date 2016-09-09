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
public abstract class Basebook_allocation extends BaseResource {
	private String id = null;
	private String allocation_type = null;
	private String book_id = null;
	private String book_name = null;
	private String subject_id = null;
	private String subject_name = null;
	private String course_id = null;
	private String batch_id = null;
	private String batch_name = null;
	private String course_name = null;
	private String allocated = null;
	private String customer_id = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ALLOCATION_TYPE = "allocation_type";
	public static String FIELD_BOOK_ID = "book_id";
	public static String FIELD_BOOK_NAME = "book_name";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_SUBJECT_NAME = "subject_name";
	public static String FIELD_COURSE_ID = "course_id";
	public static String FIELD_BATCH_ID = "batch_id";
	public static String FIELD_BATCH_NAME = "batch_name";
	public static String FIELD_COURSE_NAME = "course_name";
	public static String FIELD_ALLOCATED = "allocated";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("book_allocation");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field allocation_typeField = new Field("allocation_type", "String");
		allocation_typeField.setLength(128);
		metaData.addField(allocation_typeField);

		Field book_idField = new Field("book_id", "String");
		book_idField.setLength(128);
		metaData.addField(book_idField);

		Field book_nameField = new Field("book_name", "String");
		book_nameField.setLength(128);
		metaData.addField(book_nameField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setLength(128);
		metaData.addField(subject_idField);

		Field subject_nameField = new Field("subject_name", "String");
		subject_nameField.setLength(128);
		metaData.addField(subject_nameField);

		Field course_idField = new Field("course_id", "String");
		course_idField.setLength(128);
		metaData.addField(course_idField);

		Field batch_idField = new Field("batch_id", "String");
		batch_idField.setLength(128);
		metaData.addField(batch_idField);

		Field batch_nameField = new Field("batch_name", "String");
		batch_nameField.setLength(128);
		metaData.addField(batch_nameField);

		Field course_nameField = new Field("course_name", "String");
		course_nameField.setLength(128);
		metaData.addField(course_nameField);

		Field allocatedField = new Field("allocated", "String");
		allocatedField.setLength(1);
		metaData.addField(allocatedField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("book_allocation");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basebook_allocation() {}

	public Basebook_allocation(Basebook_allocation obj) {
		this.id = obj.id;
		this.allocation_type = obj.allocation_type;
		this.book_id = obj.book_id;
		this.book_name = obj.book_name;
		this.subject_id = obj.subject_id;
		this.subject_name = obj.subject_name;
		this.course_id = obj.course_id;
		this.batch_id = obj.batch_id;
		this.batch_name = obj.batch_name;
		this.course_name = obj.course_name;
		this.allocated = obj.allocated;
		this.customer_id = obj.customer_id;
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
		if(allocation_type != null)
			map.put("allocation_type", allocation_type);
		if(book_id != null)
			map.put("book_id", book_id);
		if(book_name != null)
			map.put("book_name", book_name);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(course_id != null)
			map.put("course_id", course_id);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(course_name != null)
			map.put("course_name", course_name);
		if(allocated != null)
			map.put("allocated", allocated);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		if(allocation_type != null)
			map.put("allocation_type", allocation_type);
		if(book_id != null)
			map.put("book_id", book_id);
		if(book_name != null)
			map.put("book_name", book_name);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(course_id != null)
			map.put("course_id", course_id);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(course_name != null)
			map.put("course_name", course_name);
		if(allocated != null)
			map.put("allocated", allocated);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		allocation_type = (String) map.get("allocation_type");
		book_id = (String) map.get("book_id");
		book_name = (String) map.get("book_name");
		subject_id = (String) map.get("subject_id");
		subject_name = (String) map.get("subject_name");
		course_id = (String) map.get("course_id");
		batch_id = (String) map.get("batch_id");
		batch_name = (String) map.get("batch_name");
		course_name = (String) map.get("course_name");
		allocated = (String) map.get("allocated");
		customer_id = (String) map.get("customer_id");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object allocation_typeObj = map.get("allocation_type");
		if(allocation_typeObj != null)
			allocation_type = allocation_typeObj.toString();

		Object book_idObj = map.get("book_id");
		if(book_idObj != null)
			book_id = book_idObj.toString();

		Object book_nameObj = map.get("book_name");
		if(book_nameObj != null)
			book_name = book_nameObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object subject_nameObj = map.get("subject_name");
		if(subject_nameObj != null)
			subject_name = subject_nameObj.toString();

		Object course_idObj = map.get("course_id");
		if(course_idObj != null)
			course_id = course_idObj.toString();

		Object batch_idObj = map.get("batch_id");
		if(batch_idObj != null)
			batch_id = batch_idObj.toString();

		Object batch_nameObj = map.get("batch_name");
		if(batch_nameObj != null)
			batch_name = batch_nameObj.toString();

		Object course_nameObj = map.get("course_name");
		if(course_nameObj != null)
			course_name = course_nameObj.toString();

		Object allocatedObj = map.get("allocated");
		if(allocatedObj != null)
			allocated = allocatedObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

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

	public String getAllocation_type() {
		return allocation_type;
	}

	public String getAllocation_typeEx() {
		return allocation_type != null ? allocation_type : "";
	}

	public void setAllocation_type(String allocation_type) {
		this.allocation_type = allocation_type;
	}

	public void unSetAllocation_type() {
		this.allocation_type = null;
	}

	public String getBook_id() {
		return book_id;
	}

	public String getBook_idEx() {
		return book_id != null ? book_id : "";
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public void unSetBook_id() {
		this.book_id = null;
	}

	public String getBook_name() {
		return book_name;
	}

	public String getBook_nameEx() {
		return book_name != null ? book_name : "";
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public void unSetBook_name() {
		this.book_name = null;
	}

	public String getSubject_id() {
		return subject_id;
	}

	public String getSubject_idEx() {
		return subject_id != null ? subject_id : "";
	}

	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}

	public void unSetSubject_id() {
		this.subject_id = null;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public String getSubject_nameEx() {
		return subject_name != null ? subject_name : "";
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public void unSetSubject_name() {
		this.subject_name = null;
	}

	public String getCourse_id() {
		return course_id;
	}

	public String getCourse_idEx() {
		return course_id != null ? course_id : "";
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public void unSetCourse_id() {
		this.course_id = null;
	}

	public String getBatch_id() {
		return batch_id;
	}

	public String getBatch_idEx() {
		return batch_id != null ? batch_id : "";
	}

	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}

	public void unSetBatch_id() {
		this.batch_id = null;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public String getBatch_nameEx() {
		return batch_name != null ? batch_name : "";
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public void unSetBatch_name() {
		this.batch_name = null;
	}

	public String getCourse_name() {
		return course_name;
	}

	public String getCourse_nameEx() {
		return course_name != null ? course_name : "";
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public void unSetCourse_name() {
		this.course_name = null;
	}

	public String getAllocated() {
		return allocated;
	}

	public String getAllocatedEx() {
		return allocated != null ? allocated : "";
	}

	public void setAllocated(String allocated) {
		this.allocated = allocated;
	}

	public void unSetAllocated() {
		this.allocated = null;
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