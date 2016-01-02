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
public abstract class Basec4t_record_detail extends BaseResource {
	private String id = null;
	private String parent_id = null;
	private String customer_id = null;
	private String community_id = null;
	private String record_type = null;
	private String record_status = null;
	private String message = null;
	private String product_id = null;
	private String product_name = null;
	private String size = null;
	private String pattern = null;
	private String product_short_name = null;
	private String title = null;
	private String description = null;
	private String mom_id = null;
	private String remark = null;
	private String product_unit = null;
	private Double quantity = null;
	private Double free_quantity = null;
	private Double rate = null;
	private Double service_tax = null;
	private Double vat = null;
	private Double amount = null;
	private String user_id = null;
	private String user_name = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_PARENT_ID = "parent_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_RECORD_TYPE = "record_type";
	public static String FIELD_RECORD_STATUS = "record_status";
	public static String FIELD_MESSAGE = "message";
	public static String FIELD_PRODUCT_ID = "product_id";
	public static String FIELD_PRODUCT_NAME = "product_name";
	public static String FIELD_SIZE = "size";
	public static String FIELD_PATTERN = "pattern";
	public static String FIELD_PRODUCT_SHORT_NAME = "product_short_name";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_MOM_ID = "mom_id";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_PRODUCT_UNIT = "product_unit";
	public static String FIELD_QUANTITY = "quantity";
	public static String FIELD_FREE_QUANTITY = "free_quantity";
	public static String FIELD_RATE = "rate";
	public static String FIELD_SERVICE_TAX = "service_tax";
	public static String FIELD_VAT = "vat";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_record_detail");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field parent_idField = new Field("parent_id", "String");
		parent_idField.setIndexed(true);
		parent_idField.setLength(128);
		metaData.addField(parent_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setIndexed(true);
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field record_typeField = new Field("record_type", "String");
		record_typeField.setLength(512);
		metaData.addField(record_typeField);

		Field record_statusField = new Field("record_status", "String");
		record_statusField.setLength(128);
		metaData.addField(record_statusField);

		Field messageField = new Field("message", "String");
		messageField.setLength(512);
		metaData.addField(messageField);

		Field product_idField = new Field("product_id", "String");
		product_idField.setLength(512);
		metaData.addField(product_idField);

		Field product_nameField = new Field("product_name", "String");
		product_nameField.setLength(512);
		metaData.addField(product_nameField);

		Field sizeField = new Field("size", "String");
		sizeField.setLength(128);
		metaData.addField(sizeField);

		Field patternField = new Field("pattern", "String");
		patternField.setLength(128);
		metaData.addField(patternField);

		Field product_short_nameField = new Field("product_short_name", "String");
		product_short_nameField.setLength(512);
		metaData.addField(product_short_nameField);

		Field titleField = new Field("title", "String");
		titleField.setLength(512);
		metaData.addField(titleField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(512);
		metaData.addField(descriptionField);

		Field mom_idField = new Field("mom_id", "String");
		mom_idField.setLength(512);
		metaData.addField(mom_idField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(512);
		metaData.addField(remarkField);

		Field product_unitField = new Field("product_unit", "String");
		product_unitField.setLength(128);
		metaData.addField(product_unitField);

		Field quantityField = new Field("quantity", "Double");
		metaData.addField(quantityField);

		Field free_quantityField = new Field("free_quantity", "Double");
		metaData.addField(free_quantityField);

		Field rateField = new Field("rate", "Double");
		metaData.addField(rateField);

		Field service_taxField = new Field("service_tax", "Double");
		metaData.addField(service_taxField);

		Field vatField = new Field("vat", "Double");
		metaData.addField(vatField);

		Field amountField = new Field("amount", "Double");
		metaData.addField(amountField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(512);
		metaData.addField(user_idField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(512);
		metaData.addField(user_nameField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_record_detail");

		metaData.setCluster("DB_RECORD");
	}

	public Basec4t_record_detail() {}

	public Basec4t_record_detail(Basec4t_record_detail obj) {
		this.id = obj.id;
		this.parent_id = obj.parent_id;
		this.customer_id = obj.customer_id;
		this.community_id = obj.community_id;
		this.record_type = obj.record_type;
		this.record_status = obj.record_status;
		this.message = obj.message;
		this.product_id = obj.product_id;
		this.product_name = obj.product_name;
		this.size = obj.size;
		this.pattern = obj.pattern;
		this.product_short_name = obj.product_short_name;
		this.title = obj.title;
		this.description = obj.description;
		this.mom_id = obj.mom_id;
		this.remark = obj.remark;
		this.product_unit = obj.product_unit;
		this.quantity = obj.quantity;
		this.free_quantity = obj.free_quantity;
		this.rate = obj.rate;
		this.service_tax = obj.service_tax;
		this.vat = obj.vat;
		this.amount = obj.amount;
		this.user_id = obj.user_id;
		this.user_name = obj.user_name;
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
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(record_type != null)
			map.put("record_type", record_type);
		if(record_status != null)
			map.put("record_status", record_status);
		if(message != null)
			map.put("message", message);
		if(product_id != null)
			map.put("product_id", product_id);
		if(product_name != null)
			map.put("product_name", product_name);
		if(size != null)
			map.put("size", size);
		if(pattern != null)
			map.put("pattern", pattern);
		if(product_short_name != null)
			map.put("product_short_name", product_short_name);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(mom_id != null)
			map.put("mom_id", mom_id);
		if(remark != null)
			map.put("remark", remark);
		if(product_unit != null)
			map.put("product_unit", product_unit);
		if(quantity != null)
			map.put("quantity", quantity);
		if(free_quantity != null)
			map.put("free_quantity", free_quantity);
		if(rate != null)
			map.put("rate", rate);
		if(service_tax != null)
			map.put("service_tax", service_tax);
		if(vat != null)
			map.put("vat", vat);
		if(amount != null)
			map.put("amount", amount);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
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
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(record_type != null)
			map.put("record_type", record_type);
		if(record_status != null)
			map.put("record_status", record_status);
		if(message != null)
			map.put("message", message);
		if(product_id != null)
			map.put("product_id", product_id);
		if(product_name != null)
			map.put("product_name", product_name);
		if(size != null)
			map.put("size", size);
		if(pattern != null)
			map.put("pattern", pattern);
		if(product_short_name != null)
			map.put("product_short_name", product_short_name);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(mom_id != null)
			map.put("mom_id", mom_id);
		if(remark != null)
			map.put("remark", remark);
		if(product_unit != null)
			map.put("product_unit", product_unit);
		if(quantity != null)
			map.put("quantity", quantity);
		if(free_quantity != null)
			map.put("free_quantity", free_quantity);
		if(rate != null)
			map.put("rate", rate);
		if(service_tax != null)
			map.put("service_tax", service_tax);
		if(vat != null)
			map.put("vat", vat);
		if(amount != null)
			map.put("amount", amount);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
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
		parent_id = (String) map.get("parent_id");
		customer_id = (String) map.get("customer_id");
		community_id = (String) map.get("community_id");
		record_type = (String) map.get("record_type");
		record_status = (String) map.get("record_status");
		message = (String) map.get("message");
		product_id = (String) map.get("product_id");
		product_name = (String) map.get("product_name");
		size = (String) map.get("size");
		pattern = (String) map.get("pattern");
		product_short_name = (String) map.get("product_short_name");
		title = (String) map.get("title");
		description = (String) map.get("description");
		mom_id = (String) map.get("mom_id");
		remark = (String) map.get("remark");
		product_unit = (String) map.get("product_unit");
		quantity = (Double) map.get("quantity");
		free_quantity = (Double) map.get("free_quantity");
		rate = (Double) map.get("rate");
		service_tax = (Double) map.get("service_tax");
		vat = (Double) map.get("vat");
		amount = (Double) map.get("amount");
		user_id = (String) map.get("user_id");
		user_name = (String) map.get("user_name");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object parent_idObj = map.get("parent_id");
		if(parent_idObj != null)
			parent_id = parent_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object record_typeObj = map.get("record_type");
		if(record_typeObj != null)
			record_type = record_typeObj.toString();

		Object record_statusObj = map.get("record_status");
		if(record_statusObj != null)
			record_status = record_statusObj.toString();

		Object messageObj = map.get("message");
		if(messageObj != null)
			message = messageObj.toString();

		Object product_idObj = map.get("product_id");
		if(product_idObj != null)
			product_id = product_idObj.toString();

		Object product_nameObj = map.get("product_name");
		if(product_nameObj != null)
			product_name = product_nameObj.toString();

		Object sizeObj = map.get("size");
		if(sizeObj != null)
			size = sizeObj.toString();

		Object patternObj = map.get("pattern");
		if(patternObj != null)
			pattern = patternObj.toString();

		Object product_short_nameObj = map.get("product_short_name");
		if(product_short_nameObj != null)
			product_short_name = product_short_nameObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object mom_idObj = map.get("mom_id");
		if(mom_idObj != null)
			mom_id = mom_idObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

		Object product_unitObj = map.get("product_unit");
		if(product_unitObj != null)
			product_unit = product_unitObj.toString();

		Object quantityObj = map.get("quantity");
		if(quantityObj != null)
			quantity = new Double(quantityObj.toString());

		Object free_quantityObj = map.get("free_quantity");
		if(free_quantityObj != null)
			free_quantity = new Double(free_quantityObj.toString());

		Object rateObj = map.get("rate");
		if(rateObj != null)
			rate = new Double(rateObj.toString());

		Object service_taxObj = map.get("service_tax");
		if(service_taxObj != null)
			service_tax = new Double(service_taxObj.toString());

		Object vatObj = map.get("vat");
		if(vatObj != null)
			vat = new Double(vatObj.toString());

		Object amountObj = map.get("amount");
		if(amountObj != null)
			amount = new Double(amountObj.toString());

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

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

	public String getParent_id() {
		return parent_id;
	}

	public String getParent_idEx() {
		return parent_id != null ? parent_id : "";
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public void unSetParent_id() {
		this.parent_id = null;
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

	public String getCommunity_id() {
		return community_id;
	}

	public String getCommunity_idEx() {
		return community_id != null ? community_id : "";
	}

	public void setCommunity_id(String community_id) {
		this.community_id = community_id;
	}

	public void unSetCommunity_id() {
		this.community_id = null;
	}

	public String getRecord_type() {
		return record_type;
	}

	public String getRecord_typeEx() {
		return record_type != null ? record_type : "";
	}

	public void setRecord_type(String record_type) {
		this.record_type = record_type;
	}

	public void unSetRecord_type() {
		this.record_type = null;
	}

	public String getRecord_status() {
		return record_status;
	}

	public String getRecord_statusEx() {
		return record_status != null ? record_status : "";
	}

	public void setRecord_status(String record_status) {
		this.record_status = record_status;
	}

	public void unSetRecord_status() {
		this.record_status = null;
	}

	public String getMessage() {
		return message;
	}

	public String getMessageEx() {
		return message != null ? message : "";
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void unSetMessage() {
		this.message = null;
	}

	public String getProduct_id() {
		return product_id;
	}

	public String getProduct_idEx() {
		return product_id != null ? product_id : "";
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public void unSetProduct_id() {
		this.product_id = null;
	}

	public String getProduct_name() {
		return product_name;
	}

	public String getProduct_nameEx() {
		return product_name != null ? product_name : "";
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void unSetProduct_name() {
		this.product_name = null;
	}

	public String getSize() {
		return size;
	}

	public String getSizeEx() {
		return size != null ? size : "";
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void unSetSize() {
		this.size = null;
	}

	public String getPattern() {
		return pattern;
	}

	public String getPatternEx() {
		return pattern != null ? pattern : "";
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public void unSetPattern() {
		this.pattern = null;
	}

	public String getProduct_short_name() {
		return product_short_name;
	}

	public String getProduct_short_nameEx() {
		return product_short_name != null ? product_short_name : "";
	}

	public void setProduct_short_name(String product_short_name) {
		this.product_short_name = product_short_name;
	}

	public void unSetProduct_short_name() {
		this.product_short_name = null;
	}

	public String getTitle() {
		return title;
	}

	public String getTitleEx() {
		return title != null ? title : "";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void unSetTitle() {
		this.title = null;
	}

	public String getDescription() {
		return description;
	}

	public String getDescriptionEx() {
		return description != null ? description : "";
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void unSetDescription() {
		this.description = null;
	}

	public String getMom_id() {
		return mom_id;
	}

	public String getMom_idEx() {
		return mom_id != null ? mom_id : "";
	}

	public void setMom_id(String mom_id) {
		this.mom_id = mom_id;
	}

	public void unSetMom_id() {
		this.mom_id = null;
	}

	public String getRemark() {
		return remark;
	}

	public String getRemarkEx() {
		return remark != null ? remark : "";
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void unSetRemark() {
		this.remark = null;
	}

	public String getProduct_unit() {
		return product_unit;
	}

	public String getProduct_unitEx() {
		return product_unit != null ? product_unit : "";
	}

	public void setProduct_unit(String product_unit) {
		this.product_unit = product_unit;
	}

	public void unSetProduct_unit() {
		this.product_unit = null;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public void unSetQuantity() {
		this.quantity = null;
	}

	public Double getFree_quantity() {
		return free_quantity;
	}

	public void setFree_quantity(Double free_quantity) {
		this.free_quantity = free_quantity;
	}

	public void unSetFree_quantity() {
		this.free_quantity = null;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public void unSetRate() {
		this.rate = null;
	}

	public Double getService_tax() {
		return service_tax;
	}

	public void setService_tax(Double service_tax) {
		this.service_tax = service_tax;
	}

	public void unSetService_tax() {
		this.service_tax = null;
	}

	public Double getVat() {
		return vat;
	}

	public void setVat(Double vat) {
		this.vat = vat;
	}

	public void unSetVat() {
		this.vat = null;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void unSetAmount() {
		this.amount = null;
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

	public String getUser_name() {
		return user_name;
	}

	public String getUser_nameEx() {
		return user_name != null ? user_name : "";
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void unSetUser_name() {
		this.user_name = null;
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
		return "DB_RECORD";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}