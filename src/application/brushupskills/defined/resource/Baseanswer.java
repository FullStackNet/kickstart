/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.brushupskills.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseanswer extends BaseResource {
	private String id = null;
	private String question_id = null;
	private String name = null;
	private Long order = null;
	private String answer = null;
	private String code = null;
	private String algorithm = null;
	private String complexity = null;
	private String hints = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_QUESTION_ID = "question_id";
	public static String FIELD_NAME = "name";
	public static String FIELD_ORDER = "order";
	public static String FIELD_ANSWER = "answer";
	public static String FIELD_CODE = "code";
	public static String FIELD_ALGORITHM = "algorithm";
	public static String FIELD_COMPLEXITY = "complexity";
	public static String FIELD_HINTS = "hints";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("answer");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field question_idField = new Field("question_id", "String");
		question_idField.setIndexed(true);
		question_idField.setLength(128);
		metaData.addField(question_idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field orderField = new Field("order", "long");
		metaData.addField(orderField);

		Field answerField = new Field("answer", "String");
		answerField.setLength(4096);
		metaData.addField(answerField);

		Field codeField = new Field("code", "String");
		codeField.setLength(4096);
		metaData.addField(codeField);

		Field algorithmField = new Field("algorithm", "String");
		algorithmField.setLength(4096);
		metaData.addField(algorithmField);

		Field complexityField = new Field("complexity", "String");
		complexityField.setLength(4096);
		metaData.addField(complexityField);

		Field hintsField = new Field("hints", "String");
		hintsField.setLength(4096);
		metaData.addField(hintsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("answer");

		metaData.setCluster("DB_QUESTION");
	}

	public Baseanswer() {}

	public Baseanswer(Baseanswer obj) {
		this.id = obj.id;
		this.question_id = obj.question_id;
		this.name = obj.name;
		this.order = obj.order;
		this.answer = obj.answer;
		this.code = obj.code;
		this.algorithm = obj.algorithm;
		this.complexity = obj.complexity;
		this.hints = obj.hints;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(question_id != null)
			map.put("question_id", question_id);
		if(name != null)
			map.put("name", name);
		if(order != null)
			map.put("order", order);
		if(answer != null)
			map.put("answer", answer);
		if(code != null)
			map.put("code", code);
		if(algorithm != null)
			map.put("algorithm", algorithm);
		if(complexity != null)
			map.put("complexity", complexity);
		if(hints != null)
			map.put("hints", hints);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(question_id != null)
			map.put("question_id", question_id);
		if(name != null)
			map.put("name", name);
		if(order != null)
			map.put("order", order);
		if(answer != null)
			map.put("answer", answer);
		if(code != null)
			map.put("code", code);
		if(algorithm != null)
			map.put("algorithm", algorithm);
		if(complexity != null)
			map.put("complexity", complexity);
		if(hints != null)
			map.put("hints", hints);
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
		question_id = (String) map.get("question_id");
		name = (String) map.get("name");
		order = (Long) map.get("order");
		answer = (String) map.get("answer");
		code = (String) map.get("code");
		algorithm = (String) map.get("algorithm");
		complexity = (String) map.get("complexity");
		hints = (String) map.get("hints");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object question_idObj = map.get("question_id");
		if(question_idObj != null)
			question_id = question_idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object orderObj = map.get("order");
		if(orderObj != null)
			order = new Long(orderObj.toString());

		Object answerObj = map.get("answer");
		if(answerObj != null)
			answer = answerObj.toString();

		Object codeObj = map.get("code");
		if(codeObj != null)
			code = codeObj.toString();

		Object algorithmObj = map.get("algorithm");
		if(algorithmObj != null)
			algorithm = algorithmObj.toString();

		Object complexityObj = map.get("complexity");
		if(complexityObj != null)
			complexity = complexityObj.toString();

		Object hintsObj = map.get("hints");
		if(hintsObj != null)
			hints = hintsObj.toString();

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

	public String getQuestion_id() {
		return question_id;
	}

	public String getQuestion_idEx() {
		return question_id != null ? question_id : "";
	}

	public void setQuestion_id(String question_id) {
		this.question_id = question_id;
	}

	public void unSetQuestion_id() {
		this.question_id = null;
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

	public Long getOrder() {
		return order;
	}

	public long getOrderEx() {
		return order != null ? order : 0L;
	}

	public void setOrder(long order) {
		this.order = order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public void unSetOrder() {
		this.order = null;
	}

	public String getAnswer() {
		return answer;
	}

	public String getAnswerEx() {
		return answer != null ? answer : "";
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void unSetAnswer() {
		this.answer = null;
	}

	public String getCode() {
		return code;
	}

	public String getCodeEx() {
		return code != null ? code : "";
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void unSetCode() {
		this.code = null;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public String getAlgorithmEx() {
		return algorithm != null ? algorithm : "";
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public void unSetAlgorithm() {
		this.algorithm = null;
	}

	public String getComplexity() {
		return complexity;
	}

	public String getComplexityEx() {
		return complexity != null ? complexity : "";
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	public void unSetComplexity() {
		this.complexity = null;
	}

	public String getHints() {
		return hints;
	}

	public String getHintsEx() {
		return hints != null ? hints : "";
	}

	public void setHints(String hints) {
		this.hints = hints;
	}

	public void unSetHints() {
		this.hints = null;
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
		return "DB_QUESTION";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}