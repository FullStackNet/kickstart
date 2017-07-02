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
public abstract class Basesim extends BaseResource {
	private String id = null;
	private String name = null;
	private String mobile_no = null;
	private String service_provider = null;
	private Long last_recharge = null;
	private Long last_recharge_amount = null;
	private String active = null;
	private String Status = null;
	private String conttroller_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_SERVICE_PROVIDER = "service_provider";
	public static String FIELD_LAST_RECHARGE = "last_recharge";
	public static String FIELD_LAST_RECHARGE_AMOUNT = "last_recharge_amount";
	public static String FIELD_ACTIVE = "active";
	public static String FIELD_STATUS = "Status";
	public static String FIELD_CONTTROLLER_ID = "conttroller_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("sim");

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

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(128);
		metaData.addField(mobile_noField);

		Field service_providerField = new Field("service_provider", "String");
		service_providerField.setLength(128);
		metaData.addField(service_providerField);

		Field last_rechargeField = new Field("last_recharge", "long");
		metaData.addField(last_rechargeField);

		Field last_recharge_amountField = new Field("last_recharge_amount", "long");
		metaData.addField(last_recharge_amountField);

		Field activeField = new Field("active", "String");
		activeField.setDefaultValue("N");
		activeField.setLength(1);
		metaData.addField(activeField);

		Field StatusField = new Field("Status", "String");
		StatusField.setDefaultValue("WORKING");
		StatusField.setLength(32);
		metaData.addField(StatusField);

		Field conttroller_idField = new Field("conttroller_id", "String");
		conttroller_idField.setLength(128);
		metaData.addField(conttroller_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("sim");

		metaData.setCluster("DB_DEVICE");
	}

	public Basesim() {}

	public Basesim(Basesim obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.mobile_no = obj.mobile_no;
		this.service_provider = obj.service_provider;
		this.last_recharge = obj.last_recharge;
		this.last_recharge_amount = obj.last_recharge_amount;
		this.active = obj.active;
		this.Status = obj.Status;
		this.conttroller_id = obj.conttroller_id;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(active == null)
			active = "N";
		if(Status == null)
			Status = "WORKING";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(service_provider != null)
			map.put("service_provider", service_provider);
		if(last_recharge != null)
			map.put("last_recharge", last_recharge);
		if(last_recharge_amount != null)
			map.put("last_recharge_amount", last_recharge_amount);
		if(active != null)
			map.put("active", active);
		if(Status != null)
			map.put("Status", Status);
		if(conttroller_id != null)
			map.put("conttroller_id", conttroller_id);
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
		if(name != null)
			map.put("name", name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(service_provider != null)
			map.put("service_provider", service_provider);
		if(last_recharge != null)
			map.put("last_recharge", last_recharge);
		if(last_recharge_amount != null)
			map.put("last_recharge_amount", last_recharge_amount);
		if(active != null)
			map.put("active", active);
		if(Status != null)
			map.put("Status", Status);
		if(conttroller_id != null)
			map.put("conttroller_id", conttroller_id);
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
		mobile_no = (String) map.get("mobile_no");
		service_provider = (String) map.get("service_provider");
		last_recharge = (Long) map.get("last_recharge");
		last_recharge_amount = (Long) map.get("last_recharge_amount");
		active = (String) map.get("active");
		Status = (String) map.get("Status");
		conttroller_id = (String) map.get("conttroller_id");
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

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object service_providerObj = map.get("service_provider");
		if(service_providerObj != null)
			service_provider = service_providerObj.toString();

		Object last_rechargeObj = map.get("last_recharge");
		if(last_rechargeObj != null)
			last_recharge = new Long(last_rechargeObj.toString());

		Object last_recharge_amountObj = map.get("last_recharge_amount");
		if(last_recharge_amountObj != null)
			last_recharge_amount = new Long(last_recharge_amountObj.toString());

		Object activeObj = map.get("active");
		if(activeObj != null)
			active = activeObj.toString();

		Object StatusObj = map.get("Status");
		if(StatusObj != null)
			Status = StatusObj.toString();

		Object conttroller_idObj = map.get("conttroller_id");
		if(conttroller_idObj != null)
			conttroller_id = conttroller_idObj.toString();

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

	public String getMobile_no() {
		return mobile_no;
	}

	public String getMobile_noEx() {
		return mobile_no != null ? mobile_no : "";
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public void unSetMobile_no() {
		this.mobile_no = null;
	}

	public String getService_provider() {
		return service_provider;
	}

	public String getService_providerEx() {
		return service_provider != null ? service_provider : "";
	}

	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}

	public void unSetService_provider() {
		this.service_provider = null;
	}

	public Long getLast_recharge() {
		return last_recharge;
	}

	public long getLast_rechargeEx() {
		return last_recharge != null ? last_recharge : 0L;
	}

	public void setLast_recharge(long last_recharge) {
		this.last_recharge = last_recharge;
	}

	public void setLast_recharge(Long last_recharge) {
		this.last_recharge = last_recharge;
	}

	public void unSetLast_recharge() {
		this.last_recharge = null;
	}

	public Long getLast_recharge_amount() {
		return last_recharge_amount;
	}

	public long getLast_recharge_amountEx() {
		return last_recharge_amount != null ? last_recharge_amount : 0L;
	}

	public void setLast_recharge_amount(long last_recharge_amount) {
		this.last_recharge_amount = last_recharge_amount;
	}

	public void setLast_recharge_amount(Long last_recharge_amount) {
		this.last_recharge_amount = last_recharge_amount;
	}

	public void unSetLast_recharge_amount() {
		this.last_recharge_amount = null;
	}

	public String getActive() {
		return active != null ? active : "N";
	}

	public void setActive(String active) {
		this.active = active;
	}

	public void unSetActive() {
		this.active = "N";
	}

	public String getStatus() {
		return Status != null ? Status : "WORKING";
	}

	public void setStatus(String Status) {
		this.Status = Status;
	}

	public void unSetStatus() {
		this.Status = "WORKING";
	}

	public String getConttroller_id() {
		return conttroller_id;
	}

	public String getConttroller_idEx() {
		return conttroller_id != null ? conttroller_id : "";
	}

	public void setConttroller_id(String conttroller_id) {
		this.conttroller_id = conttroller_id;
	}

	public void unSetConttroller_id() {
		this.conttroller_id = null;
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
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}