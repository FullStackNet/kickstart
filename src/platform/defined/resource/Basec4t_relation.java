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
public abstract class Basec4t_relation extends BaseResource {
	private String id = null;
	private String from_id = null;
	private String to_id = null;
	private String relation_type = null;
	private String role = null;
	private String order = null;
	private List<String> object_map = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_FROM_ID = "from_id";
	public static String FIELD_TO_ID = "to_id";
	public static String FIELD_RELATION_TYPE = "relation_type";
	public static String FIELD_ROLE = "role";
	public static String FIELD_ORDER = "order";
	public static String FIELD_OBJECT_MAP = "object_map";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_relation");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field from_idField = new Field("from_id", "String");
		from_idField.setRequired(true);
		from_idField.setLength(128);
		metaData.addField(from_idField);

		Field to_idField = new Field("to_id", "String");
		to_idField.setRequired(true);
		to_idField.setLength(128);
		metaData.addField(to_idField);

		Field relation_typeField = new Field("relation_type", "String");
		relation_typeField.setRequired(true);
		relation_typeField.setLength(128);
		metaData.addField(relation_typeField);

		Field roleField = new Field("role", "String");
		roleField.setRequired(true);
		roleField.setLength(128);
		metaData.addField(roleField);

		Field orderField = new Field("order", "String");
		metaData.addField(orderField);

		Field object_mapField = new Field("object_map", "Array");
		metaData.addField(object_mapField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_relation");

		metaData.setCluster("DB_OBJECT");
	}

	public Basec4t_relation() {}

	public Basec4t_relation(Basec4t_relation obj) {
		this.id = obj.id;
		this.from_id = obj.from_id;
		this.to_id = obj.to_id;
		this.relation_type = obj.relation_type;
		this.role = obj.role;
		this.order = obj.order;
		this.object_map = obj.object_map;
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
		if(from_id != null)
			map.put("from_id", from_id);
		if(to_id != null)
			map.put("to_id", to_id);
		if(relation_type != null)
			map.put("relation_type", relation_type);
		if(role != null)
			map.put("role", role);
		if(order != null)
			map.put("order", order);
		if(object_map != null)
			map.put("object_map", object_map);
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
		if(validateFrom_id(add))
			map.put("from_id", from_id);
		if(validateTo_id(add))
			map.put("to_id", to_id);
		if(validateRelation_type(add))
			map.put("relation_type", relation_type);
		if(validateRole(add))
			map.put("role", role);
		if(order != null)
			map.put("order", order);
		if(object_map != null)
			map.put("object_map", object_map);
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
		from_id = (String) map.get("from_id");
		to_id = (String) map.get("to_id");
		relation_type = (String) map.get("relation_type");
		role = (String) map.get("role");
		order = (String) map.get("order");
		object_map = (List<String>) map.get("object_map");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object from_idObj = map.get("from_id");
		if(from_idObj != null)
			from_id = from_idObj.toString();

		Object to_idObj = map.get("to_id");
		if(to_idObj != null)
			to_id = to_idObj.toString();

		Object relation_typeObj = map.get("relation_type");
		if(relation_typeObj != null)
			relation_type = relation_typeObj.toString();

		Object roleObj = map.get("role");
		if(roleObj != null)
			role = roleObj.toString();

		Object orderObj = map.get("order");
		if(orderObj != null)
			order = orderObj.toString();

		object_map = (List<String>) map.get("object_map");
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

	public String getFrom_id() {
		return from_id;
	}

	public String getFrom_idEx() {
		return from_id != null ? from_id : "";
	}

	public void setFrom_id(String from_id) {
		this.from_id = from_id;
	}

	public void unSetFrom_id() {
		this.from_id = null;
	}

	public boolean validateFrom_id(boolean add) throws ApplicationException {
		if(add && from_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[from_id]");
		return from_id != null;
	}

	public String getTo_id() {
		return to_id;
	}

	public String getTo_idEx() {
		return to_id != null ? to_id : "";
	}

	public void setTo_id(String to_id) {
		this.to_id = to_id;
	}

	public void unSetTo_id() {
		this.to_id = null;
	}

	public boolean validateTo_id(boolean add) throws ApplicationException {
		if(add && to_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[to_id]");
		return to_id != null;
	}

	public String getRelation_type() {
		return relation_type;
	}

	public String getRelation_typeEx() {
		return relation_type != null ? relation_type : "";
	}

	public void setRelation_type(String relation_type) {
		this.relation_type = relation_type;
	}

	public void unSetRelation_type() {
		this.relation_type = null;
	}

	public boolean validateRelation_type(boolean add) throws ApplicationException {
		if(add && relation_type == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[relation_type]");
		return relation_type != null;
	}

	public String getRole() {
		return role;
	}

	public String getRoleEx() {
		return role != null ? role : "";
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void unSetRole() {
		this.role = null;
	}

	public boolean validateRole(boolean add) throws ApplicationException {
		if(add && role == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[role]");
		return role != null;
	}

	public String getOrder() {
		return order;
	}

	public String getOrderEx() {
		return order != null ? order : "";
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public void unSetOrder() {
		this.order = null;
	}

	public List<String> getObject_map() {
		return object_map;
	}


	public void setObject_map(List<String> object_map) {
		this.object_map = object_map;
	}

	public void addObject_map(String value) {
		if(object_map == null)
			object_map = new ArrayList<>();
		object_map.add(value);
	}

	public void unSetObject_map() {
		this.object_map = null;
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
		return "DB_OBJECT";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}