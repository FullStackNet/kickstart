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
public abstract class Basemember_flat extends BaseResource {
	private String id = null;
	private String member_name = null;
	private String member_id = null;
	private String flat_id = null;
	private String flat_no = null;
	private String resident = null;
	private String type = null;
	private String tenant_lease_started_str = null;
	private Long tenant_lease_started = null;
	private String tenant_lease_ended_str = null;
	private Long tenant_lease_ended = null;
	private String tenant_stay_status = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_MEMBER_NAME = "member_name";
	public static String FIELD_MEMBER_ID = "member_id";
	public static String FIELD_FLAT_ID = "flat_id";
	public static String FIELD_FLAT_NO = "flat_no";
	public static String FIELD_RESIDENT = "resident";
	public static String FIELD_TYPE = "type";
	public static String FIELD_TENANT_LEASE_STARTED_STR = "tenant_lease_started_str";
	public static String FIELD_TENANT_LEASE_STARTED = "tenant_lease_started";
	public static String FIELD_TENANT_LEASE_ENDED_STR = "tenant_lease_ended_str";
	public static String FIELD_TENANT_LEASE_ENDED = "tenant_lease_ended";
	public static String FIELD_TENANT_STAY_STATUS = "tenant_stay_status";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("member_flat");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field member_nameField = new Field("member_name", "String");
		member_nameField.setIndexed(true);
		member_nameField.setLength(128);
		metaData.addField(member_nameField);

		Field member_idField = new Field("member_id", "String");
		member_idField.setIndexed(true);
		member_idField.setLength(128);
		metaData.addField(member_idField);

		Field flat_idField = new Field("flat_id", "String");
		flat_idField.setIndexed(true);
		flat_idField.setLength(128);
		metaData.addField(flat_idField);

		Field flat_noField = new Field("flat_no", "String");
		flat_noField.setIndexed(true);
		flat_noField.setLength(128);
		metaData.addField(flat_noField);

		Field residentField = new Field("resident", "String");
		residentField.setIndexed(true);
		residentField.setLength(128);
		metaData.addField(residentField);

		Field typeField = new Field("type", "String");
		typeField.setLength(128);
		metaData.addField(typeField);

		Field tenant_lease_started_strField = new Field("tenant_lease_started_str", "String");
		tenant_lease_started_strField.setLength(128);
		metaData.addField(tenant_lease_started_strField);

		Field tenant_lease_startedField = new Field("tenant_lease_started", "long");
		metaData.addField(tenant_lease_startedField);

		Field tenant_lease_ended_strField = new Field("tenant_lease_ended_str", "String");
		tenant_lease_ended_strField.setLength(128);
		metaData.addField(tenant_lease_ended_strField);

		Field tenant_lease_endedField = new Field("tenant_lease_ended", "long");
		metaData.addField(tenant_lease_endedField);

		Field tenant_stay_statusField = new Field("tenant_stay_status", "String");
		metaData.addField(tenant_stay_statusField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("member_flat");

		metaData.setCluster("DB_OBJECT");
	}

	public Basemember_flat() {}

	public Basemember_flat(Basemember_flat obj) {
		this.id = obj.id;
		this.member_name = obj.member_name;
		this.member_id = obj.member_id;
		this.flat_id = obj.flat_id;
		this.flat_no = obj.flat_no;
		this.resident = obj.resident;
		this.type = obj.type;
		this.tenant_lease_started_str = obj.tenant_lease_started_str;
		this.tenant_lease_started = obj.tenant_lease_started;
		this.tenant_lease_ended_str = obj.tenant_lease_ended_str;
		this.tenant_lease_ended = obj.tenant_lease_ended;
		this.tenant_stay_status = obj.tenant_stay_status;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(member_name != null)
			map.put("member_name", member_name);
		if(member_id != null)
			map.put("member_id", member_id);
		if(flat_id != null)
			map.put("flat_id", flat_id);
		if(flat_no != null)
			map.put("flat_no", flat_no);
		if(resident != null)
			map.put("resident", resident);
		if(type != null)
			map.put("type", type);
		if(tenant_lease_started_str != null)
			map.put("tenant_lease_started_str", tenant_lease_started_str);
		if(tenant_lease_started != null)
			map.put("tenant_lease_started", tenant_lease_started);
		if(tenant_lease_ended_str != null)
			map.put("tenant_lease_ended_str", tenant_lease_ended_str);
		if(tenant_lease_ended != null)
			map.put("tenant_lease_ended", tenant_lease_ended);
		if(tenant_stay_status != null)
			map.put("tenant_stay_status", tenant_stay_status);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(member_name != null)
			map.put("member_name", member_name);
		if(member_id != null)
			map.put("member_id", member_id);
		if(flat_id != null)
			map.put("flat_id", flat_id);
		if(flat_no != null)
			map.put("flat_no", flat_no);
		if(resident != null)
			map.put("resident", resident);
		if(type != null)
			map.put("type", type);
		if(tenant_lease_started_str != null)
			map.put("tenant_lease_started_str", tenant_lease_started_str);
		if(tenant_lease_started != null)
			map.put("tenant_lease_started", tenant_lease_started);
		if(tenant_lease_ended_str != null)
			map.put("tenant_lease_ended_str", tenant_lease_ended_str);
		if(tenant_lease_ended != null)
			map.put("tenant_lease_ended", tenant_lease_ended);
		if(tenant_stay_status != null)
			map.put("tenant_stay_status", tenant_stay_status);
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
		member_name = (String) map.get("member_name");
		member_id = (String) map.get("member_id");
		flat_id = (String) map.get("flat_id");
		flat_no = (String) map.get("flat_no");
		resident = (String) map.get("resident");
		type = (String) map.get("type");
		tenant_lease_started_str = (String) map.get("tenant_lease_started_str");
		tenant_lease_started = (Long) map.get("tenant_lease_started");
		tenant_lease_ended_str = (String) map.get("tenant_lease_ended_str");
		tenant_lease_ended = (Long) map.get("tenant_lease_ended");
		tenant_stay_status = (String) map.get("tenant_stay_status");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object member_nameObj = map.get("member_name");
		if(member_nameObj != null)
			member_name = member_nameObj.toString();

		Object member_idObj = map.get("member_id");
		if(member_idObj != null)
			member_id = member_idObj.toString();

		Object flat_idObj = map.get("flat_id");
		if(flat_idObj != null)
			flat_id = flat_idObj.toString();

		Object flat_noObj = map.get("flat_no");
		if(flat_noObj != null)
			flat_no = flat_noObj.toString();

		Object residentObj = map.get("resident");
		if(residentObj != null)
			resident = residentObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object tenant_lease_started_strObj = map.get("tenant_lease_started_str");
		if(tenant_lease_started_strObj != null)
			tenant_lease_started_str = tenant_lease_started_strObj.toString();

		Object tenant_lease_startedObj = map.get("tenant_lease_started");
		if(tenant_lease_startedObj != null)
			tenant_lease_started = new Long(tenant_lease_startedObj.toString());

		Object tenant_lease_ended_strObj = map.get("tenant_lease_ended_str");
		if(tenant_lease_ended_strObj != null)
			tenant_lease_ended_str = tenant_lease_ended_strObj.toString();

		Object tenant_lease_endedObj = map.get("tenant_lease_ended");
		if(tenant_lease_endedObj != null)
			tenant_lease_ended = new Long(tenant_lease_endedObj.toString());

		Object tenant_stay_statusObj = map.get("tenant_stay_status");
		if(tenant_stay_statusObj != null)
			tenant_stay_status = tenant_stay_statusObj.toString();

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

	public String getMember_name() {
		return member_name;
	}

	public String getMember_nameEx() {
		return member_name != null ? member_name : "";
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public void unSetMember_name() {
		this.member_name = null;
	}

	public String getMember_id() {
		return member_id;
	}

	public String getMember_idEx() {
		return member_id != null ? member_id : "";
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public void unSetMember_id() {
		this.member_id = null;
	}

	public String getFlat_id() {
		return flat_id;
	}

	public String getFlat_idEx() {
		return flat_id != null ? flat_id : "";
	}

	public void setFlat_id(String flat_id) {
		this.flat_id = flat_id;
	}

	public void unSetFlat_id() {
		this.flat_id = null;
	}

	public String getFlat_no() {
		return flat_no;
	}

	public String getFlat_noEx() {
		return flat_no != null ? flat_no : "";
	}

	public void setFlat_no(String flat_no) {
		this.flat_no = flat_no;
	}

	public void unSetFlat_no() {
		this.flat_no = null;
	}

	public String getResident() {
		return resident;
	}

	public String getResidentEx() {
		return resident != null ? resident : "";
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	public void unSetResident() {
		this.resident = null;
	}

	public String getType() {
		return type;
	}

	public String getTypeEx() {
		return type != null ? type : "";
	}

	public void setType(String type) {
		this.type = type;
	}

	public void unSetType() {
		this.type = null;
	}

	public String getTenant_lease_started_str() {
		return tenant_lease_started_str;
	}

	public String getTenant_lease_started_strEx() {
		return tenant_lease_started_str != null ? tenant_lease_started_str : "";
	}

	public void setTenant_lease_started_str(String tenant_lease_started_str) {
		this.tenant_lease_started_str = tenant_lease_started_str;
	}

	public void unSetTenant_lease_started_str() {
		this.tenant_lease_started_str = null;
	}

	public Long getTenant_lease_started() {
		return tenant_lease_started;
	}

	public long getTenant_lease_startedEx() {
		return tenant_lease_started != null ? tenant_lease_started : 0L;
	}

	public void setTenant_lease_started(long tenant_lease_started) {
		this.tenant_lease_started = tenant_lease_started;
	}

	public void setTenant_lease_started(Long tenant_lease_started) {
		this.tenant_lease_started = tenant_lease_started;
	}

	public void unSetTenant_lease_started() {
		this.tenant_lease_started = null;
	}

	public String getTenant_lease_ended_str() {
		return tenant_lease_ended_str;
	}

	public String getTenant_lease_ended_strEx() {
		return tenant_lease_ended_str != null ? tenant_lease_ended_str : "";
	}

	public void setTenant_lease_ended_str(String tenant_lease_ended_str) {
		this.tenant_lease_ended_str = tenant_lease_ended_str;
	}

	public void unSetTenant_lease_ended_str() {
		this.tenant_lease_ended_str = null;
	}

	public Long getTenant_lease_ended() {
		return tenant_lease_ended;
	}

	public long getTenant_lease_endedEx() {
		return tenant_lease_ended != null ? tenant_lease_ended : 0L;
	}

	public void setTenant_lease_ended(long tenant_lease_ended) {
		this.tenant_lease_ended = tenant_lease_ended;
	}

	public void setTenant_lease_ended(Long tenant_lease_ended) {
		this.tenant_lease_ended = tenant_lease_ended;
	}

	public void unSetTenant_lease_ended() {
		this.tenant_lease_ended = null;
	}

	public String getTenant_stay_status() {
		return tenant_stay_status;
	}

	public String getTenant_stay_statusEx() {
		return tenant_stay_status != null ? tenant_stay_status : "";
	}

	public void setTenant_stay_status(String tenant_stay_status) {
		this.tenant_stay_status = tenant_stay_status;
	}

	public void unSetTenant_stay_status() {
		this.tenant_stay_status = null;
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