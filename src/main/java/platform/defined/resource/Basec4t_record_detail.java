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
public abstract class Basec4t_record_detail extends BaseResource {
	private String id = null;
	private String parent_id = null;
	private String customer_id = null;
	private String community_id = null;
	private String record_type = null;
	private String record_status = null;
	private String message = null;
	private String grade_id = null;
	private String grade_name = null;
	private String product_id = null;
	private String product_name = null;
	private String size = null;
	private String pattern = null;
	private String reference_id = null;
	private Long reference_date = null;
	private String reference_date_str = null;
	private String reference_no = null;
	private String farmer_id = null;
	private String farmer_name = null;
	private String place = null;
	private String product_short_name = null;
	private String title = null;
	private String description = null;
	private String mom_id = null;
	private String remark = null;
	private String product_unit = null;
	private Double quantity = null;
	private Double allocation = null;
	private Double pending_billing = null;
	private Double free_quantity = null;
	private Double weight = null;
	private Double rate_weight = null;
	private Double rate = null;
	private Double muc_percentage = null;
	private Double muc_amount = null;
	private Double commission_percentage = null;
	private Double commission = null;
	private Double service_tax = null;
	private Double vat = null;
	private Double amount = null;
	private String user_id = null;
	private String from_date_str = null;
	private String to_date_str = null;
	private Long from_date = null;
	private Long to_date = null;
	private Long payment_pending_amount = null;
	private Long payment_amount = null;
	private String user_name = null;
	private String skill_id = null;
	private Double rating = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_PARENT_ID = "parent_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_RECORD_TYPE = "record_type";
	public static String FIELD_RECORD_STATUS = "record_status";
	public static String FIELD_MESSAGE = "message";
	public static String FIELD_GRADE_ID = "grade_id";
	public static String FIELD_GRADE_NAME = "grade_name";
	public static String FIELD_PRODUCT_ID = "product_id";
	public static String FIELD_PRODUCT_NAME = "product_name";
	public static String FIELD_SIZE = "size";
	public static String FIELD_PATTERN = "pattern";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_REFERENCE_DATE = "reference_date";
	public static String FIELD_REFERENCE_DATE_STR = "reference_date_str";
	public static String FIELD_REFERENCE_NO = "reference_no";
	public static String FIELD_FARMER_ID = "farmer_id";
	public static String FIELD_FARMER_NAME = "farmer_name";
	public static String FIELD_PLACE = "place";
	public static String FIELD_PRODUCT_SHORT_NAME = "product_short_name";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_MOM_ID = "mom_id";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_PRODUCT_UNIT = "product_unit";
	public static String FIELD_QUANTITY = "quantity";
	public static String FIELD_ALLOCATION = "allocation";
	public static String FIELD_PENDING_BILLING = "pending_billing";
	public static String FIELD_FREE_QUANTITY = "free_quantity";
	public static String FIELD_WEIGHT = "weight";
	public static String FIELD_RATE_WEIGHT = "rate_weight";
	public static String FIELD_RATE = "rate";
	public static String FIELD_MUC_PERCENTAGE = "muc_percentage";
	public static String FIELD_MUC_AMOUNT = "muc_amount";
	public static String FIELD_COMMISSION_PERCENTAGE = "commission_percentage";
	public static String FIELD_COMMISSION = "commission";
	public static String FIELD_SERVICE_TAX = "service_tax";
	public static String FIELD_VAT = "vat";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_FROM_DATE_STR = "from_date_str";
	public static String FIELD_TO_DATE_STR = "to_date_str";
	public static String FIELD_FROM_DATE = "from_date";
	public static String FIELD_TO_DATE = "to_date";
	public static String FIELD_PAYMENT_PENDING_AMOUNT = "payment_pending_amount";
	public static String FIELD_PAYMENT_AMOUNT = "payment_amount";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_SKILL_ID = "skill_id";
	public static String FIELD_RATING = "rating";
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

		Field grade_idField = new Field("grade_id", "String");
		grade_idField.setLength(512);
		metaData.addField(grade_idField);

		Field grade_nameField = new Field("grade_name", "String");
		grade_nameField.setLength(512);
		metaData.addField(grade_nameField);

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

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(512);
		metaData.addField(reference_idField);

		Field reference_dateField = new Field("reference_date", "timestamp");
		metaData.addField(reference_dateField);

		Field reference_date_strField = new Field("reference_date_str", "String");
		reference_date_strField.setLength(512);
		metaData.addField(reference_date_strField);

		Field reference_noField = new Field("reference_no", "String");
		reference_noField.setLength(512);
		metaData.addField(reference_noField);

		Field farmer_idField = new Field("farmer_id", "String");
		farmer_idField.setLength(512);
		metaData.addField(farmer_idField);

		Field farmer_nameField = new Field("farmer_name", "String");
		farmer_nameField.setLength(512);
		metaData.addField(farmer_nameField);

		Field placeField = new Field("place", "String");
		placeField.setLength(512);
		metaData.addField(placeField);

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

		Field allocationField = new Field("allocation", "Double");
		metaData.addField(allocationField);

		Field pending_billingField = new Field("pending_billing", "Double");
		metaData.addField(pending_billingField);

		Field free_quantityField = new Field("free_quantity", "Double");
		metaData.addField(free_quantityField);

		Field weightField = new Field("weight", "Double");
		metaData.addField(weightField);

		Field rate_weightField = new Field("rate_weight", "Double");
		metaData.addField(rate_weightField);

		Field rateField = new Field("rate", "Double");
		metaData.addField(rateField);

		Field muc_percentageField = new Field("muc_percentage", "Double");
		metaData.addField(muc_percentageField);

		Field muc_amountField = new Field("muc_amount", "Double");
		metaData.addField(muc_amountField);

		Field commission_percentageField = new Field("commission_percentage", "Double");
		metaData.addField(commission_percentageField);

		Field commissionField = new Field("commission", "Double");
		metaData.addField(commissionField);

		Field service_taxField = new Field("service_tax", "Double");
		metaData.addField(service_taxField);

		Field vatField = new Field("vat", "Double");
		metaData.addField(vatField);

		Field amountField = new Field("amount", "Double");
		metaData.addField(amountField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(512);
		metaData.addField(user_idField);

		Field from_date_strField = new Field("from_date_str", "String");
		from_date_strField.setLength(512);
		metaData.addField(from_date_strField);

		Field to_date_strField = new Field("to_date_str", "String");
		to_date_strField.setLength(512);
		metaData.addField(to_date_strField);

		Field from_dateField = new Field("from_date", "long");
		metaData.addField(from_dateField);

		Field to_dateField = new Field("to_date", "long");
		metaData.addField(to_dateField);

		Field payment_pending_amountField = new Field("payment_pending_amount", "long");
		metaData.addField(payment_pending_amountField);

		Field payment_amountField = new Field("payment_amount", "long");
		metaData.addField(payment_amountField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(512);
		metaData.addField(user_nameField);

		Field skill_idField = new Field("skill_id", "String");
		skill_idField.setLength(512);
		metaData.addField(skill_idField);

		Field ratingField = new Field("rating", "double");
		metaData.addField(ratingField);

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
		this.grade_id = obj.grade_id;
		this.grade_name = obj.grade_name;
		this.product_id = obj.product_id;
		this.product_name = obj.product_name;
		this.size = obj.size;
		this.pattern = obj.pattern;
		this.reference_id = obj.reference_id;
		this.reference_date = obj.reference_date;
		this.reference_date_str = obj.reference_date_str;
		this.reference_no = obj.reference_no;
		this.farmer_id = obj.farmer_id;
		this.farmer_name = obj.farmer_name;
		this.place = obj.place;
		this.product_short_name = obj.product_short_name;
		this.title = obj.title;
		this.description = obj.description;
		this.mom_id = obj.mom_id;
		this.remark = obj.remark;
		this.product_unit = obj.product_unit;
		this.quantity = obj.quantity;
		this.allocation = obj.allocation;
		this.pending_billing = obj.pending_billing;
		this.free_quantity = obj.free_quantity;
		this.weight = obj.weight;
		this.rate_weight = obj.rate_weight;
		this.rate = obj.rate;
		this.muc_percentage = obj.muc_percentage;
		this.muc_amount = obj.muc_amount;
		this.commission_percentage = obj.commission_percentage;
		this.commission = obj.commission;
		this.service_tax = obj.service_tax;
		this.vat = obj.vat;
		this.amount = obj.amount;
		this.user_id = obj.user_id;
		this.from_date_str = obj.from_date_str;
		this.to_date_str = obj.to_date_str;
		this.from_date = obj.from_date;
		this.to_date = obj.to_date;
		this.payment_pending_amount = obj.payment_pending_amount;
		this.payment_amount = obj.payment_amount;
		this.user_name = obj.user_name;
		this.skill_id = obj.skill_id;
		this.rating = obj.rating;
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
		if(grade_id != null)
			map.put("grade_id", grade_id);
		if(grade_name != null)
			map.put("grade_name", grade_name);
		if(product_id != null)
			map.put("product_id", product_id);
		if(product_name != null)
			map.put("product_name", product_name);
		if(size != null)
			map.put("size", size);
		if(pattern != null)
			map.put("pattern", pattern);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_date != null)
			map.put("reference_date", reference_date);
		if(reference_date_str != null)
			map.put("reference_date_str", reference_date_str);
		if(reference_no != null)
			map.put("reference_no", reference_no);
		if(farmer_id != null)
			map.put("farmer_id", farmer_id);
		if(farmer_name != null)
			map.put("farmer_name", farmer_name);
		if(place != null)
			map.put("place", place);
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
		if(allocation != null)
			map.put("allocation", allocation);
		if(pending_billing != null)
			map.put("pending_billing", pending_billing);
		if(free_quantity != null)
			map.put("free_quantity", free_quantity);
		if(weight != null)
			map.put("weight", weight);
		if(rate_weight != null)
			map.put("rate_weight", rate_weight);
		if(rate != null)
			map.put("rate", rate);
		if(muc_percentage != null)
			map.put("muc_percentage", muc_percentage);
		if(muc_amount != null)
			map.put("muc_amount", muc_amount);
		if(commission_percentage != null)
			map.put("commission_percentage", commission_percentage);
		if(commission != null)
			map.put("commission", commission);
		if(service_tax != null)
			map.put("service_tax", service_tax);
		if(vat != null)
			map.put("vat", vat);
		if(amount != null)
			map.put("amount", amount);
		if(user_id != null)
			map.put("user_id", user_id);
		if(from_date_str != null)
			map.put("from_date_str", from_date_str);
		if(to_date_str != null)
			map.put("to_date_str", to_date_str);
		if(from_date != null)
			map.put("from_date", from_date);
		if(to_date != null)
			map.put("to_date", to_date);
		if(payment_pending_amount != null)
			map.put("payment_pending_amount", payment_pending_amount);
		if(payment_amount != null)
			map.put("payment_amount", payment_amount);
		if(user_name != null)
			map.put("user_name", user_name);
		if(skill_id != null)
			map.put("skill_id", skill_id);
		if(rating != null)
			map.put("rating", rating);
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
		if(grade_id != null)
			map.put("grade_id", grade_id);
		if(grade_name != null)
			map.put("grade_name", grade_name);
		if(product_id != null)
			map.put("product_id", product_id);
		if(product_name != null)
			map.put("product_name", product_name);
		if(size != null)
			map.put("size", size);
		if(pattern != null)
			map.put("pattern", pattern);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_date != null)
			map.put("reference_date", reference_date);
		if(reference_date_str != null)
			map.put("reference_date_str", reference_date_str);
		if(reference_no != null)
			map.put("reference_no", reference_no);
		if(farmer_id != null)
			map.put("farmer_id", farmer_id);
		if(farmer_name != null)
			map.put("farmer_name", farmer_name);
		if(place != null)
			map.put("place", place);
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
		if(allocation != null)
			map.put("allocation", allocation);
		if(pending_billing != null)
			map.put("pending_billing", pending_billing);
		if(free_quantity != null)
			map.put("free_quantity", free_quantity);
		if(weight != null)
			map.put("weight", weight);
		if(rate_weight != null)
			map.put("rate_weight", rate_weight);
		if(rate != null)
			map.put("rate", rate);
		if(muc_percentage != null)
			map.put("muc_percentage", muc_percentage);
		if(muc_amount != null)
			map.put("muc_amount", muc_amount);
		if(commission_percentage != null)
			map.put("commission_percentage", commission_percentage);
		if(commission != null)
			map.put("commission", commission);
		if(service_tax != null)
			map.put("service_tax", service_tax);
		if(vat != null)
			map.put("vat", vat);
		if(amount != null)
			map.put("amount", amount);
		if(user_id != null)
			map.put("user_id", user_id);
		if(from_date_str != null)
			map.put("from_date_str", from_date_str);
		if(to_date_str != null)
			map.put("to_date_str", to_date_str);
		if(from_date != null)
			map.put("from_date", from_date);
		if(to_date != null)
			map.put("to_date", to_date);
		if(payment_pending_amount != null)
			map.put("payment_pending_amount", payment_pending_amount);
		if(payment_amount != null)
			map.put("payment_amount", payment_amount);
		if(user_name != null)
			map.put("user_name", user_name);
		if(skill_id != null)
			map.put("skill_id", skill_id);
		if(rating != null)
			map.put("rating", rating);
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
		grade_id = (String) map.get("grade_id");
		grade_name = (String) map.get("grade_name");
		product_id = (String) map.get("product_id");
		product_name = (String) map.get("product_name");
		size = (String) map.get("size");
		pattern = (String) map.get("pattern");
		reference_id = (String) map.get("reference_id");
		reference_date = (Long) map.get("reference_date");
		reference_date_str = (String) map.get("reference_date_str");
		reference_no = (String) map.get("reference_no");
		farmer_id = (String) map.get("farmer_id");
		farmer_name = (String) map.get("farmer_name");
		place = (String) map.get("place");
		product_short_name = (String) map.get("product_short_name");
		title = (String) map.get("title");
		description = (String) map.get("description");
		mom_id = (String) map.get("mom_id");
		remark = (String) map.get("remark");
		product_unit = (String) map.get("product_unit");
		quantity = (Double) map.get("quantity");
		allocation = (Double) map.get("allocation");
		pending_billing = (Double) map.get("pending_billing");
		free_quantity = (Double) map.get("free_quantity");
		weight = (Double) map.get("weight");
		rate_weight = (Double) map.get("rate_weight");
		rate = (Double) map.get("rate");
		muc_percentage = (Double) map.get("muc_percentage");
		muc_amount = (Double) map.get("muc_amount");
		commission_percentage = (Double) map.get("commission_percentage");
		commission = (Double) map.get("commission");
		service_tax = (Double) map.get("service_tax");
		vat = (Double) map.get("vat");
		amount = (Double) map.get("amount");
		user_id = (String) map.get("user_id");
		from_date_str = (String) map.get("from_date_str");
		to_date_str = (String) map.get("to_date_str");
		from_date = (Long) map.get("from_date");
		to_date = (Long) map.get("to_date");
		payment_pending_amount = (Long) map.get("payment_pending_amount");
		payment_amount = (Long) map.get("payment_amount");
		user_name = (String) map.get("user_name");
		skill_id = (String) map.get("skill_id");
		rating = (Double) map.get("rating");
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

		Object grade_idObj = map.get("grade_id");
		if(grade_idObj != null)
			grade_id = grade_idObj.toString();

		Object grade_nameObj = map.get("grade_name");
		if(grade_nameObj != null)
			grade_name = grade_nameObj.toString();

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

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

		Object reference_dateObj = map.get("reference_date");
		if(reference_dateObj != null)
			reference_date = new Long(reference_dateObj.toString());

		Object reference_date_strObj = map.get("reference_date_str");
		if(reference_date_strObj != null)
			reference_date_str = reference_date_strObj.toString();

		Object reference_noObj = map.get("reference_no");
		if(reference_noObj != null)
			reference_no = reference_noObj.toString();

		Object farmer_idObj = map.get("farmer_id");
		if(farmer_idObj != null)
			farmer_id = farmer_idObj.toString();

		Object farmer_nameObj = map.get("farmer_name");
		if(farmer_nameObj != null)
			farmer_name = farmer_nameObj.toString();

		Object placeObj = map.get("place");
		if(placeObj != null)
			place = placeObj.toString();

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

		Object allocationObj = map.get("allocation");
		if(allocationObj != null)
			allocation = new Double(allocationObj.toString());

		Object pending_billingObj = map.get("pending_billing");
		if(pending_billingObj != null)
			pending_billing = new Double(pending_billingObj.toString());

		Object free_quantityObj = map.get("free_quantity");
		if(free_quantityObj != null)
			free_quantity = new Double(free_quantityObj.toString());

		Object weightObj = map.get("weight");
		if(weightObj != null)
			weight = new Double(weightObj.toString());

		Object rate_weightObj = map.get("rate_weight");
		if(rate_weightObj != null)
			rate_weight = new Double(rate_weightObj.toString());

		Object rateObj = map.get("rate");
		if(rateObj != null)
			rate = new Double(rateObj.toString());

		Object muc_percentageObj = map.get("muc_percentage");
		if(muc_percentageObj != null)
			muc_percentage = new Double(muc_percentageObj.toString());

		Object muc_amountObj = map.get("muc_amount");
		if(muc_amountObj != null)
			muc_amount = new Double(muc_amountObj.toString());

		Object commission_percentageObj = map.get("commission_percentage");
		if(commission_percentageObj != null)
			commission_percentage = new Double(commission_percentageObj.toString());

		Object commissionObj = map.get("commission");
		if(commissionObj != null)
			commission = new Double(commissionObj.toString());

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

		Object from_date_strObj = map.get("from_date_str");
		if(from_date_strObj != null)
			from_date_str = from_date_strObj.toString();

		Object to_date_strObj = map.get("to_date_str");
		if(to_date_strObj != null)
			to_date_str = to_date_strObj.toString();

		Object from_dateObj = map.get("from_date");
		if(from_dateObj != null)
			from_date = new Long(from_dateObj.toString());

		Object to_dateObj = map.get("to_date");
		if(to_dateObj != null)
			to_date = new Long(to_dateObj.toString());

		Object payment_pending_amountObj = map.get("payment_pending_amount");
		if(payment_pending_amountObj != null)
			payment_pending_amount = new Long(payment_pending_amountObj.toString());

		Object payment_amountObj = map.get("payment_amount");
		if(payment_amountObj != null)
			payment_amount = new Long(payment_amountObj.toString());

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

		Object skill_idObj = map.get("skill_id");
		if(skill_idObj != null)
			skill_id = skill_idObj.toString();

		Object ratingObj = map.get("rating");
		if(ratingObj != null)
			rating = new Double(ratingObj.toString());

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

	public String getGrade_id() {
		return grade_id;
	}

	public String getGrade_idEx() {
		return grade_id != null ? grade_id : "";
	}

	public void setGrade_id(String grade_id) {
		this.grade_id = grade_id;
	}

	public void unSetGrade_id() {
		this.grade_id = null;
	}

	public String getGrade_name() {
		return grade_name;
	}

	public String getGrade_nameEx() {
		return grade_name != null ? grade_name : "";
	}

	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}

	public void unSetGrade_name() {
		this.grade_name = null;
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

	public String getReference_id() {
		return reference_id;
	}

	public String getReference_idEx() {
		return reference_id != null ? reference_id : "";
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public void unSetReference_id() {
		this.reference_id = null;
	}

	public Long getReference_date() {
		return reference_date;
	}

	public void setReference_date(Long reference_date) {
		this.reference_date = reference_date;
	}


	public String getReference_date_str() {
		return reference_date_str;
	}

	public String getReference_date_strEx() {
		return reference_date_str != null ? reference_date_str : "";
	}

	public void setReference_date_str(String reference_date_str) {
		this.reference_date_str = reference_date_str;
	}

	public void unSetReference_date_str() {
		this.reference_date_str = null;
	}

	public String getReference_no() {
		return reference_no;
	}

	public String getReference_noEx() {
		return reference_no != null ? reference_no : "";
	}

	public void setReference_no(String reference_no) {
		this.reference_no = reference_no;
	}

	public void unSetReference_no() {
		this.reference_no = null;
	}

	public String getFarmer_id() {
		return farmer_id;
	}

	public String getFarmer_idEx() {
		return farmer_id != null ? farmer_id : "";
	}

	public void setFarmer_id(String farmer_id) {
		this.farmer_id = farmer_id;
	}

	public void unSetFarmer_id() {
		this.farmer_id = null;
	}

	public String getFarmer_name() {
		return farmer_name;
	}

	public String getFarmer_nameEx() {
		return farmer_name != null ? farmer_name : "";
	}

	public void setFarmer_name(String farmer_name) {
		this.farmer_name = farmer_name;
	}

	public void unSetFarmer_name() {
		this.farmer_name = null;
	}

	public String getPlace() {
		return place;
	}

	public String getPlaceEx() {
		return place != null ? place : "";
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void unSetPlace() {
		this.place = null;
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

	public Double getAllocation() {
		return allocation;
	}

	public void setAllocation(Double allocation) {
		this.allocation = allocation;
	}

	public void unSetAllocation() {
		this.allocation = null;
	}

	public Double getPending_billing() {
		return pending_billing;
	}

	public void setPending_billing(Double pending_billing) {
		this.pending_billing = pending_billing;
	}

	public void unSetPending_billing() {
		this.pending_billing = null;
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

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void unSetWeight() {
		this.weight = null;
	}

	public Double getRate_weight() {
		return rate_weight;
	}

	public void setRate_weight(Double rate_weight) {
		this.rate_weight = rate_weight;
	}

	public void unSetRate_weight() {
		this.rate_weight = null;
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

	public Double getMuc_percentage() {
		return muc_percentage;
	}

	public void setMuc_percentage(Double muc_percentage) {
		this.muc_percentage = muc_percentage;
	}

	public void unSetMuc_percentage() {
		this.muc_percentage = null;
	}

	public Double getMuc_amount() {
		return muc_amount;
	}

	public void setMuc_amount(Double muc_amount) {
		this.muc_amount = muc_amount;
	}

	public void unSetMuc_amount() {
		this.muc_amount = null;
	}

	public Double getCommission_percentage() {
		return commission_percentage;
	}

	public void setCommission_percentage(Double commission_percentage) {
		this.commission_percentage = commission_percentage;
	}

	public void unSetCommission_percentage() {
		this.commission_percentage = null;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public void unSetCommission() {
		this.commission = null;
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

	public String getFrom_date_str() {
		return from_date_str;
	}

	public String getFrom_date_strEx() {
		return from_date_str != null ? from_date_str : "";
	}

	public void setFrom_date_str(String from_date_str) {
		this.from_date_str = from_date_str;
	}

	public void unSetFrom_date_str() {
		this.from_date_str = null;
	}

	public String getTo_date_str() {
		return to_date_str;
	}

	public String getTo_date_strEx() {
		return to_date_str != null ? to_date_str : "";
	}

	public void setTo_date_str(String to_date_str) {
		this.to_date_str = to_date_str;
	}

	public void unSetTo_date_str() {
		this.to_date_str = null;
	}

	public Long getFrom_date() {
		return from_date;
	}

	public long getFrom_dateEx() {
		return from_date != null ? from_date : 0L;
	}

	public void setFrom_date(long from_date) {
		this.from_date = from_date;
	}

	public void setFrom_date(Long from_date) {
		this.from_date = from_date;
	}

	public void unSetFrom_date() {
		this.from_date = null;
	}

	public Long getTo_date() {
		return to_date;
	}

	public long getTo_dateEx() {
		return to_date != null ? to_date : 0L;
	}

	public void setTo_date(long to_date) {
		this.to_date = to_date;
	}

	public void setTo_date(Long to_date) {
		this.to_date = to_date;
	}

	public void unSetTo_date() {
		this.to_date = null;
	}

	public Long getPayment_pending_amount() {
		return payment_pending_amount;
	}

	public long getPayment_pending_amountEx() {
		return payment_pending_amount != null ? payment_pending_amount : 0L;
	}

	public void setPayment_pending_amount(long payment_pending_amount) {
		this.payment_pending_amount = payment_pending_amount;
	}

	public void setPayment_pending_amount(Long payment_pending_amount) {
		this.payment_pending_amount = payment_pending_amount;
	}

	public void unSetPayment_pending_amount() {
		this.payment_pending_amount = null;
	}

	public Long getPayment_amount() {
		return payment_amount;
	}

	public long getPayment_amountEx() {
		return payment_amount != null ? payment_amount : 0L;
	}

	public void setPayment_amount(long payment_amount) {
		this.payment_amount = payment_amount;
	}

	public void setPayment_amount(Long payment_amount) {
		this.payment_amount = payment_amount;
	}

	public void unSetPayment_amount() {
		this.payment_amount = null;
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

	public String getSkill_id() {
		return skill_id;
	}

	public String getSkill_idEx() {
		return skill_id != null ? skill_id : "";
	}

	public void setSkill_id(String skill_id) {
		this.skill_id = skill_id;
	}

	public void unSetSkill_id() {
		this.skill_id = null;
	}

	public Double getRating() {
		return rating;
	}

	public double getRatingEx() {
		return rating != null ? rating : 0;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public void unSetRating() {
		this.rating = null;
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