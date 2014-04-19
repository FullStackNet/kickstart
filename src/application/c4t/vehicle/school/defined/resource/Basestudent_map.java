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
	private ArrayList<Object> users = null;
	private ArrayList<Object> parents = null;

	public static String FIELD_ID = "id";
	public static String FIELD_USERS = "users";
	public static String FIELD_PARENTS = "parents";

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


		metaData.setTableName("student_map");

		metaData.setCluster("DB_PROFILE");
	}

	public Basestudent_map() {}

	public Basestudent_map(Basestudent_map obj) {
		this.id = obj.id;
		this.users = obj.users;
		this.parents = obj.parents;
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
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		users = (ArrayList<Object>) map.get("users");
		parents = (ArrayList<Object>) map.get("parents");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		users = (ArrayList<Object>) map.get("users");
		parents = (ArrayList<Object>) map.get("parents");
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

	public ArrayList<Object> getUsers() {
		return users;
	}


	public void setUsers(ArrayList<Object> users) {
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

	public ArrayList<Object> getParents() {
		return parents;
	}


	public void setParents(ArrayList<Object> parents) {
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
	public String getCluster() {
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}