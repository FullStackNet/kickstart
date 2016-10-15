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
public abstract class Basestudent_map extends BaseResource {
	private String id = null; //student id
	private List<Object> users = null;
	private List<Object> parents = null;
	private List<Object> pickup_alert_stopages = null;
	private List<Object> drop_alert_stopages = null;
	private List<Object> notices = null;
	private List<Object> courses = null;
	private List<Object> batches = null;
	private List<Object> photos = null;
	private List<Object> interested_subjects = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_USERS = "users";
	public static String FIELD_PARENTS = "parents";
	public static String FIELD_PICKUP_ALERT_STOPAGES = "pickup_alert_stopages";
	public static String FIELD_DROP_ALERT_STOPAGES = "drop_alert_stopages";
	public static String FIELD_NOTICES = "notices";
	public static String FIELD_COURSES = "courses";
	public static String FIELD_BATCHES = "batches";
	public static String FIELD_PHOTOS = "photos";
	public static String FIELD_INTERESTED_SUBJECTS = "interested_subjects";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("student_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field usersField = new Field("users", "Array");
		metaData.addField(usersField);

		Field parentsField = new Field("parents", "Array");
		metaData.addField(parentsField);

		Field pickup_alert_stopagesField = new Field("pickup_alert_stopages", "Array");
		metaData.addField(pickup_alert_stopagesField);

		Field drop_alert_stopagesField = new Field("drop_alert_stopages", "Array");
		metaData.addField(drop_alert_stopagesField);

		Field noticesField = new Field("notices", "Array");
		metaData.addField(noticesField);

		Field coursesField = new Field("courses", "Array");
		metaData.addField(coursesField);

		Field batchesField = new Field("batches", "Array");
		metaData.addField(batchesField);

		Field photosField = new Field("photos", "Array");
		metaData.addField(photosField);

		Field interested_subjectsField = new Field("interested_subjects", "Array");
		metaData.addField(interested_subjectsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("student_map");

		metaData.setCluster("DB_PROFILE");
	}

	public Basestudent_map() {}

	public Basestudent_map(Basestudent_map obj) {
		this.id = obj.id;
		this.users = obj.users;
		this.parents = obj.parents;
		this.pickup_alert_stopages = obj.pickup_alert_stopages;
		this.drop_alert_stopages = obj.drop_alert_stopages;
		this.notices = obj.notices;
		this.courses = obj.courses;
		this.batches = obj.batches;
		this.photos = obj.photos;
		this.interested_subjects = obj.interested_subjects;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(users != null)
			map.put("users", users);
		if(parents != null)
			map.put("parents", parents);
		if(pickup_alert_stopages != null)
			map.put("pickup_alert_stopages", pickup_alert_stopages);
		if(drop_alert_stopages != null)
			map.put("drop_alert_stopages", drop_alert_stopages);
		if(notices != null)
			map.put("notices", notices);
		if(courses != null)
			map.put("courses", courses);
		if(batches != null)
			map.put("batches", batches);
		if(photos != null)
			map.put("photos", photos);
		if(interested_subjects != null)
			map.put("interested_subjects", interested_subjects);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(users != null)
			map.put("users", users);
		if(parents != null)
			map.put("parents", parents);
		if(pickup_alert_stopages != null)
			map.put("pickup_alert_stopages", pickup_alert_stopages);
		if(drop_alert_stopages != null)
			map.put("drop_alert_stopages", drop_alert_stopages);
		if(notices != null)
			map.put("notices", notices);
		if(courses != null)
			map.put("courses", courses);
		if(batches != null)
			map.put("batches", batches);
		if(photos != null)
			map.put("photos", photos);
		if(interested_subjects != null)
			map.put("interested_subjects", interested_subjects);
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
		users = (List<Object>) map.get("users");
		parents = (List<Object>) map.get("parents");
		pickup_alert_stopages = (List<Object>) map.get("pickup_alert_stopages");
		drop_alert_stopages = (List<Object>) map.get("drop_alert_stopages");
		notices = (List<Object>) map.get("notices");
		courses = (List<Object>) map.get("courses");
		batches = (List<Object>) map.get("batches");
		photos = (List<Object>) map.get("photos");
		interested_subjects = (List<Object>) map.get("interested_subjects");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		users = (List<Object>) map.get("users");
		parents = (List<Object>) map.get("parents");
		pickup_alert_stopages = (List<Object>) map.get("pickup_alert_stopages");
		drop_alert_stopages = (List<Object>) map.get("drop_alert_stopages");
		notices = (List<Object>) map.get("notices");
		courses = (List<Object>) map.get("courses");
		batches = (List<Object>) map.get("batches");
		photos = (List<Object>) map.get("photos");
		interested_subjects = (List<Object>) map.get("interested_subjects");
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

	public List<Object> getUsers() {
		return users;
	}


	public void setUsers(List<Object> users) {
		this.users = users;
	}

	public void addUsers(Object value) {
		if(users == null)
			users = new ArrayList<Object>();
		users.add(value);
	}

	public void unSetUsers() {
		this.users = null;
	}

	public List<Object> getParents() {
		return parents;
	}


	public void setParents(List<Object> parents) {
		this.parents = parents;
	}

	public void addParents(Object value) {
		if(parents == null)
			parents = new ArrayList<Object>();
		parents.add(value);
	}

	public void unSetParents() {
		this.parents = null;
	}

	public List<Object> getPickup_alert_stopages() {
		return pickup_alert_stopages;
	}


	public void setPickup_alert_stopages(List<Object> pickup_alert_stopages) {
		this.pickup_alert_stopages = pickup_alert_stopages;
	}

	public void addPickup_alert_stopages(Object value) {
		if(pickup_alert_stopages == null)
			pickup_alert_stopages = new ArrayList<Object>();
		pickup_alert_stopages.add(value);
	}

	public void unSetPickup_alert_stopages() {
		this.pickup_alert_stopages = null;
	}

	public List<Object> getDrop_alert_stopages() {
		return drop_alert_stopages;
	}


	public void setDrop_alert_stopages(List<Object> drop_alert_stopages) {
		this.drop_alert_stopages = drop_alert_stopages;
	}

	public void addDrop_alert_stopages(Object value) {
		if(drop_alert_stopages == null)
			drop_alert_stopages = new ArrayList<Object>();
		drop_alert_stopages.add(value);
	}

	public void unSetDrop_alert_stopages() {
		this.drop_alert_stopages = null;
	}

	public List<Object> getNotices() {
		return notices;
	}


	public void setNotices(List<Object> notices) {
		this.notices = notices;
	}

	public void addNotices(Object value) {
		if(notices == null)
			notices = new ArrayList<Object>();
		notices.add(value);
	}

	public void unSetNotices() {
		this.notices = null;
	}

	public List<Object> getCourses() {
		return courses;
	}


	public void setCourses(List<Object> courses) {
		this.courses = courses;
	}

	public void addCourses(Object value) {
		if(courses == null)
			courses = new ArrayList<Object>();
		courses.add(value);
	}

	public void unSetCourses() {
		this.courses = null;
	}

	public List<Object> getBatches() {
		return batches;
	}


	public void setBatches(List<Object> batches) {
		this.batches = batches;
	}

	public void addBatches(Object value) {
		if(batches == null)
			batches = new ArrayList<Object>();
		batches.add(value);
	}

	public void unSetBatches() {
		this.batches = null;
	}

	public List<Object> getPhotos() {
		return photos;
	}


	public void setPhotos(List<Object> photos) {
		this.photos = photos;
	}

	public void addPhotos(Object value) {
		if(photos == null)
			photos = new ArrayList<Object>();
		photos.add(value);
	}

	public void unSetPhotos() {
		this.photos = null;
	}

	public List<Object> getInterested_subjects() {
		return interested_subjects;
	}


	public void setInterested_subjects(List<Object> interested_subjects) {
		this.interested_subjects = interested_subjects;
	}

	public void addInterested_subjects(Object value) {
		if(interested_subjects == null)
			interested_subjects = new ArrayList<Object>();
		interested_subjects.add(value);
	}

	public void unSetInterested_subjects() {
		this.interested_subjects = null;
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
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}