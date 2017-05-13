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
public abstract class Basec4t_cart_item extends BaseResource {
	private String id = null;
	private String product_id = null;
	private String unit = null;
	private Double quantity = null;
	private Double free_quantity = null;
	private Double rate = null;
	private String size = null;
	private String from_date = null;
	private String to_date = null;
	private String pattern = null;
	private Double amount = null;
	private String remark = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_PRODUCT_ID = "product_id";
	public static String FIELD_UNIT = "unit";
	public static String FIELD_QUANTITY = "quantity";
	public static String FIELD_FREE_QUANTITY = "free_quantity";
	public static String FIELD_RATE = "rate";
	public static String FIELD_SIZE = "size";
	public static String FIELD_FROM_DATE = "from_date";
	public static String FIELD_TO_DATE = "to_date";
	public static String FIELD_PATTERN = "pattern";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_cart_item");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field product_idField = new Field("product_id", "String");
		product_idField.setRequired(true);
		product_idField.setLength(128);
		metaData.addField(product_idField);

		Field unitField = new Field("unit", "String");
		unitField.setRequired(true);
		unitField.setLength(128);
		metaData.addField(unitField);

		Field quantityField = new Field("quantity", "double");
		metaData.addField(quantityField);

		Field free_quantityField = new Field("free_quantity", "double");
		metaData.addField(free_quantityField);

		Field rateField = new Field("rate", "Double");
		metaData.addField(rateField);

		Field sizeField = new Field("size", "String");
		sizeField.setLength(128);
		metaData.addField(sizeField);

		Field from_dateField = new Field("from_date", "String");
		from_dateField.setLength(512);
		metaData.addField(from_dateField);

		Field to_dateField = new Field("to_date", "String");
		to_dateField.setLength(512);
		metaData.addField(to_dateField);

		Field patternField = new Field("pattern", "String");
		patternField.setLength(128);
		metaData.addField(patternField);

		Field amountField = new Field("amount", "double");
		metaData.addField(amountField);

		Field remarkField = new Field("remark", "String");
		remarkField.setRequired(true);
		remarkField.setLength(128);
		metaData.addField(remarkField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_cart_item");

		metaData.setCluster("DB_RECORD");
	}

	public Basec4t_cart_item() {}

	public Basec4t_cart_item(Basec4t_cart_item obj) {
		this.id = obj.id;
		this.product_id = obj.product_id;
		this.unit = obj.unit;
		this.quantity = obj.quantity;
		this.free_quantity = obj.free_quantity;
		this.rate = obj.rate;
		this.size = obj.size;
		this.from_date = obj.from_date;
		this.to_date = obj.to_date;
		this.pattern = obj.pattern;
		this.amount = obj.amount;
		this.remark = obj.remark;
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
		if(product_id != null)
			map.put("product_id", product_id);
		if(unit != null)
			map.put("unit", unit);
		if(quantity != null)
			map.put("quantity", quantity);
		if(free_quantity != null)
			map.put("free_quantity", free_quantity);
		if(rate != null)
			map.put("rate", rate);
		if(size != null)
			map.put("size", size);
		if(from_date != null)
			map.put("from_date", from_date);
		if(to_date != null)
			map.put("to_date", to_date);
		if(pattern != null)
			map.put("pattern", pattern);
		if(amount != null)
			map.put("amount", amount);
		if(remark != null)
			map.put("remark", remark);
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
		if(validateProduct_id(add))
			map.put("product_id", product_id);
		if(validateUnit(add))
			map.put("unit", unit);
		if(quantity != null)
			map.put("quantity", quantity);
		if(free_quantity != null)
			map.put("free_quantity", free_quantity);
		if(rate != null)
			map.put("rate", rate);
		if(size != null)
			map.put("size", size);
		if(from_date != null)
			map.put("from_date", from_date);
		if(to_date != null)
			map.put("to_date", to_date);
		if(pattern != null)
			map.put("pattern", pattern);
		if(amount != null)
			map.put("amount", amount);
		if(validateRemark(add))
			map.put("remark", remark);
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
		product_id = (String) map.get("product_id");
		unit = (String) map.get("unit");
		quantity = (Double) map.get("quantity");
		free_quantity = (Double) map.get("free_quantity");
		rate = (Double) map.get("rate");
		size = (String) map.get("size");
		from_date = (String) map.get("from_date");
		to_date = (String) map.get("to_date");
		pattern = (String) map.get("pattern");
		amount = (Double) map.get("amount");
		remark = (String) map.get("remark");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object product_idObj = map.get("product_id");
		if(product_idObj != null)
			product_id = product_idObj.toString();

		Object unitObj = map.get("unit");
		if(unitObj != null)
			unit = unitObj.toString();

		Object quantityObj = map.get("quantity");
		if(quantityObj != null)
			quantity = new Double(quantityObj.toString());

		Object free_quantityObj = map.get("free_quantity");
		if(free_quantityObj != null)
			free_quantity = new Double(free_quantityObj.toString());

		Object rateObj = map.get("rate");
		if(rateObj != null)
			rate = new Double(rateObj.toString());

		Object sizeObj = map.get("size");
		if(sizeObj != null)
			size = sizeObj.toString();

		Object from_dateObj = map.get("from_date");
		if(from_dateObj != null)
			from_date = from_dateObj.toString();

		Object to_dateObj = map.get("to_date");
		if(to_dateObj != null)
			to_date = to_dateObj.toString();

		Object patternObj = map.get("pattern");
		if(patternObj != null)
			pattern = patternObj.toString();

		Object amountObj = map.get("amount");
		if(amountObj != null)
			amount = new Double(amountObj.toString());

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

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

	public boolean validateProduct_id(boolean add) throws ApplicationException {
		if(add && product_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[product_id]");
		return product_id != null;
	}

	public String getUnit() {
		return unit;
	}

	public String getUnitEx() {
		return unit != null ? unit : "";
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void unSetUnit() {
		this.unit = null;
	}

	public boolean validateUnit(boolean add) throws ApplicationException {
		if(add && unit == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[unit]");
		return unit != null;
	}

	public Double getQuantity() {
		return quantity;
	}

	public double getQuantityEx() {
		return quantity != null ? quantity : 0;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
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

	public double getFree_quantityEx() {
		return free_quantity != null ? free_quantity : 0;
	}

	public void setFree_quantity(double free_quantity) {
		this.free_quantity = free_quantity;
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

	public String getFrom_date() {
		return from_date;
	}

	public String getFrom_dateEx() {
		return from_date != null ? from_date : "";
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public void unSetFrom_date() {
		this.from_date = null;
	}

	public String getTo_date() {
		return to_date;
	}

	public String getTo_dateEx() {
		return to_date != null ? to_date : "";
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public void unSetTo_date() {
		this.to_date = null;
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

	public Double getAmount() {
		return amount;
	}

	public double getAmountEx() {
		return amount != null ? amount : 0;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void unSetAmount() {
		this.amount = null;
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

	public boolean validateRemark(boolean add) throws ApplicationException {
		if(add && remark == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[remark]");
		return remark != null;
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