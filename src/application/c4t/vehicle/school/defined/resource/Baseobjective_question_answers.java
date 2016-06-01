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
public abstract class Baseobjective_question_answers extends BaseResource {
	private String id = null;
	private String allocated_test_id = null;
	private List<application.c4t.vehicle.school.resource.objective_question> answers = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ALLOCATED_TEST_ID = "allocated_test_id";
	public static String FIELD_ANSWERS = "answers";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("objective_question_answers");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field allocated_test_idField = new Field("allocated_test_id", "String");
		allocated_test_idField.setLength(128);
		metaData.addField(allocated_test_idField);

		Field answersField = new Field("answers", "Array");
		metaData.addField(answersField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("objective_question_answers");

		metaData.setCluster("DB_SCHOLL");
	}

	public Baseobjective_question_answers() {}

	public Baseobjective_question_answers(Baseobjective_question_answers obj) {
		this.id = obj.id;
		this.allocated_test_id = obj.allocated_test_id;
		this.answers = obj.answers;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(allocated_test_id != null)
			map.put("allocated_test_id", allocated_test_id);
		if(answers != null)
			map.put("answers", answers);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(allocated_test_id != null)
			map.put("allocated_test_id", allocated_test_id);
		if(answers != null)
			map.put("answers", answers);
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
		allocated_test_id = (String) map.get("allocated_test_id");
		answers = (List<application.c4t.vehicle.school.resource.objective_question>) map.get("answers");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object allocated_test_idObj = map.get("allocated_test_id");
		if(allocated_test_idObj != null)
			allocated_test_id = allocated_test_idObj.toString();

		answers = (List<application.c4t.vehicle.school.resource.objective_question>) map.get("answers");
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

	public String getAllocated_test_id() {
		return allocated_test_id;
	}

	public String getAllocated_test_idEx() {
		return allocated_test_id != null ? allocated_test_id : "";
	}

	public void setAllocated_test_id(String allocated_test_id) {
		this.allocated_test_id = allocated_test_id;
	}

	public void unSetAllocated_test_id() {
		this.allocated_test_id = null;
	}

	public List<application.c4t.vehicle.school.resource.objective_question> getAnswers() {
		return answers;
	}


	public void setAnswers(List<application.c4t.vehicle.school.resource.objective_question> answers) {
		this.answers = answers;
	}

	public void addAnswers(application.c4t.vehicle.school.resource.objective_question value) {
		if(answers == null)
			answers = new ArrayList<>();
		answers.add(value);
	}

	public void unSetAnswers() {
		this.answers = null;
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
		return "DB_SCHOLL";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}