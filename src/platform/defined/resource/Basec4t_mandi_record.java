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
public abstract class Basec4t_mandi_record extends BaseResource {
	private String id = null;
	private Long event_date = null;
	private String event_date_str = null;
	private String community_id = null;
	private String community_name = null;
	private String customer_id = null;
	private String user_id = null;
	private String city = null;
	private String user_name = null;
	private String record_type = null;
	private String record_no = null;
	private String vehicle_no = null;
	private String product_id = null;
	private String product_name = null;
	private Double total_quantity = null;
	private Double total_product_quantity = null;
	private Long creation_time = null;
	private String farmer1 = null;
	private Double farmer_quantity_1 = null;
	private Double grade_quantity_1_1 = null;
	private Double grade_quantity_1_2 = null;
	private Double grade_quantity_1_3 = null;
	private Double grade_quantity_1_4 = null;
	private Double grade_quantity_1_5 = null;
	private String farmer2 = null;
	private Double farmer_quantity_2 = null;
	private Double grade_quantity_2_1 = null;
	private Double grade_quantity_2_2 = null;
	private Double grade_quantity_2_3 = null;
	private Double grade_quantity_2_4 = null;
	private Double grade_quantity_2_5 = null;
	private String farmer3 = null;
	private Double farmer_quantity_3 = null;
	private Double grade_quantity_3_1 = null;
	private Double grade_quantity_3_2 = null;
	private Double grade_quantity_3_3 = null;
	private Double grade_quantity_3_4 = null;
	private Double grade_quantity_3_5 = null;
	private String farmer4 = null;
	private Double farmer_quantity_4 = null;
	private Double grade_quantity_4_1 = null;
	private Double grade_quantity_4_2 = null;
	private Double grade_quantity_4_3 = null;
	private Double grade_quantity_4_4 = null;
	private Double grade_quantity_4_5 = null;
	private String farmer5 = null;
	private Double farmer_quantity_5 = null;
	private Double grade_quantity_5_1 = null;
	private Double grade_quantity_5_2 = null;
	private Double grade_quantity_5_3 = null;
	private Double grade_quantity_5_4 = null;
	private Double grade_quantity_5_5 = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_EVENT_DATE = "event_date";
	public static String FIELD_EVENT_DATE_STR = "event_date_str";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_COMMUNITY_NAME = "community_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_CITY = "city";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_RECORD_TYPE = "record_type";
	public static String FIELD_RECORD_NO = "record_no";
	public static String FIELD_VEHICLE_NO = "vehicle_no";
	public static String FIELD_PRODUCT_ID = "product_id";
	public static String FIELD_PRODUCT_NAME = "product_name";
	public static String FIELD_TOTAL_QUANTITY = "total_quantity";
	public static String FIELD_TOTAL_PRODUCT_QUANTITY = "total_product_quantity";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_FARMER1 = "farmer1";
	public static String FIELD_FARMER_QUANTITY_1 = "farmer_quantity_1";
	public static String FIELD_GRADE_QUANTITY_1_1 = "grade_quantity_1_1";
	public static String FIELD_GRADE_QUANTITY_1_2 = "grade_quantity_1_2";
	public static String FIELD_GRADE_QUANTITY_1_3 = "grade_quantity_1_3";
	public static String FIELD_GRADE_QUANTITY_1_4 = "grade_quantity_1_4";
	public static String FIELD_GRADE_QUANTITY_1_5 = "grade_quantity_1_5";
	public static String FIELD_FARMER2 = "farmer2";
	public static String FIELD_FARMER_QUANTITY_2 = "farmer_quantity_2";
	public static String FIELD_GRADE_QUANTITY_2_1 = "grade_quantity_2_1";
	public static String FIELD_GRADE_QUANTITY_2_2 = "grade_quantity_2_2";
	public static String FIELD_GRADE_QUANTITY_2_3 = "grade_quantity_2_3";
	public static String FIELD_GRADE_QUANTITY_2_4 = "grade_quantity_2_4";
	public static String FIELD_GRADE_QUANTITY_2_5 = "grade_quantity_2_5";
	public static String FIELD_FARMER3 = "farmer3";
	public static String FIELD_FARMER_QUANTITY_3 = "farmer_quantity_3";
	public static String FIELD_GRADE_QUANTITY_3_1 = "grade_quantity_3_1";
	public static String FIELD_GRADE_QUANTITY_3_2 = "grade_quantity_3_2";
	public static String FIELD_GRADE_QUANTITY_3_3 = "grade_quantity_3_3";
	public static String FIELD_GRADE_QUANTITY_3_4 = "grade_quantity_3_4";
	public static String FIELD_GRADE_QUANTITY_3_5 = "grade_quantity_3_5";
	public static String FIELD_FARMER4 = "farmer4";
	public static String FIELD_FARMER_QUANTITY_4 = "farmer_quantity_4";
	public static String FIELD_GRADE_QUANTITY_4_1 = "grade_quantity_4_1";
	public static String FIELD_GRADE_QUANTITY_4_2 = "grade_quantity_4_2";
	public static String FIELD_GRADE_QUANTITY_4_3 = "grade_quantity_4_3";
	public static String FIELD_GRADE_QUANTITY_4_4 = "grade_quantity_4_4";
	public static String FIELD_GRADE_QUANTITY_4_5 = "grade_quantity_4_5";
	public static String FIELD_FARMER5 = "farmer5";
	public static String FIELD_FARMER_QUANTITY_5 = "farmer_quantity_5";
	public static String FIELD_GRADE_QUANTITY_5_1 = "grade_quantity_5_1";
	public static String FIELD_GRADE_QUANTITY_5_2 = "grade_quantity_5_2";
	public static String FIELD_GRADE_QUANTITY_5_3 = "grade_quantity_5_3";
	public static String FIELD_GRADE_QUANTITY_5_4 = "grade_quantity_5_4";
	public static String FIELD_GRADE_QUANTITY_5_5 = "grade_quantity_5_5";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_mandi_record");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field event_dateField = new Field("event_date", "timestamp");
		event_dateField.setIndexed(true);
		metaData.addField(event_dateField);

		Field event_date_strField = new Field("event_date_str", "String");
		event_date_strField.setLength(32);
		metaData.addField(event_date_strField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setIndexed(true);
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field community_nameField = new Field("community_name", "String");
		community_nameField.setIndexed(true);
		community_nameField.setLength(128);
		metaData.addField(community_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field cityField = new Field("city", "String");
		cityField.setLength(128);
		metaData.addField(cityField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(128);
		metaData.addField(user_nameField);

		Field record_typeField = new Field("record_type", "String");
		record_typeField.setLength(512);
		metaData.addField(record_typeField);

		Field record_noField = new Field("record_no", "String");
		record_noField.setLength(512);
		metaData.addField(record_noField);

		Field vehicle_noField = new Field("vehicle_no", "String");
		vehicle_noField.setLength(512);
		metaData.addField(vehicle_noField);

		Field product_idField = new Field("product_id", "String");
		product_idField.setLength(512);
		metaData.addField(product_idField);

		Field product_nameField = new Field("product_name", "String");
		product_nameField.setLength(512);
		metaData.addField(product_nameField);

		Field total_quantityField = new Field("total_quantity", "double");
		metaData.addField(total_quantityField);

		Field total_product_quantityField = new Field("total_product_quantity", "double");
		metaData.addField(total_product_quantityField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field farmer1Field = new Field("farmer1", "String");
		farmer1Field.setLength(512);
		metaData.addField(farmer1Field);

		Field farmer_quantity_1Field = new Field("farmer_quantity_1", "double");
		metaData.addField(farmer_quantity_1Field);

		Field grade_quantity_1_1Field = new Field("grade_quantity_1_1", "double");
		metaData.addField(grade_quantity_1_1Field);

		Field grade_quantity_1_2Field = new Field("grade_quantity_1_2", "double");
		metaData.addField(grade_quantity_1_2Field);

		Field grade_quantity_1_3Field = new Field("grade_quantity_1_3", "double");
		metaData.addField(grade_quantity_1_3Field);

		Field grade_quantity_1_4Field = new Field("grade_quantity_1_4", "double");
		metaData.addField(grade_quantity_1_4Field);

		Field grade_quantity_1_5Field = new Field("grade_quantity_1_5", "double");
		metaData.addField(grade_quantity_1_5Field);

		Field farmer2Field = new Field("farmer2", "String");
		farmer2Field.setLength(512);
		metaData.addField(farmer2Field);

		Field farmer_quantity_2Field = new Field("farmer_quantity_2", "double");
		metaData.addField(farmer_quantity_2Field);

		Field grade_quantity_2_1Field = new Field("grade_quantity_2_1", "double");
		metaData.addField(grade_quantity_2_1Field);

		Field grade_quantity_2_2Field = new Field("grade_quantity_2_2", "double");
		metaData.addField(grade_quantity_2_2Field);

		Field grade_quantity_2_3Field = new Field("grade_quantity_2_3", "double");
		metaData.addField(grade_quantity_2_3Field);

		Field grade_quantity_2_4Field = new Field("grade_quantity_2_4", "double");
		metaData.addField(grade_quantity_2_4Field);

		Field grade_quantity_2_5Field = new Field("grade_quantity_2_5", "double");
		metaData.addField(grade_quantity_2_5Field);

		Field farmer3Field = new Field("farmer3", "String");
		farmer3Field.setLength(512);
		metaData.addField(farmer3Field);

		Field farmer_quantity_3Field = new Field("farmer_quantity_3", "double");
		metaData.addField(farmer_quantity_3Field);

		Field grade_quantity_3_1Field = new Field("grade_quantity_3_1", "double");
		metaData.addField(grade_quantity_3_1Field);

		Field grade_quantity_3_2Field = new Field("grade_quantity_3_2", "double");
		metaData.addField(grade_quantity_3_2Field);

		Field grade_quantity_3_3Field = new Field("grade_quantity_3_3", "double");
		metaData.addField(grade_quantity_3_3Field);

		Field grade_quantity_3_4Field = new Field("grade_quantity_3_4", "double");
		metaData.addField(grade_quantity_3_4Field);

		Field grade_quantity_3_5Field = new Field("grade_quantity_3_5", "double");
		metaData.addField(grade_quantity_3_5Field);

		Field farmer4Field = new Field("farmer4", "String");
		farmer4Field.setLength(512);
		metaData.addField(farmer4Field);

		Field farmer_quantity_4Field = new Field("farmer_quantity_4", "double");
		metaData.addField(farmer_quantity_4Field);

		Field grade_quantity_4_1Field = new Field("grade_quantity_4_1", "double");
		metaData.addField(grade_quantity_4_1Field);

		Field grade_quantity_4_2Field = new Field("grade_quantity_4_2", "double");
		metaData.addField(grade_quantity_4_2Field);

		Field grade_quantity_4_3Field = new Field("grade_quantity_4_3", "double");
		metaData.addField(grade_quantity_4_3Field);

		Field grade_quantity_4_4Field = new Field("grade_quantity_4_4", "double");
		metaData.addField(grade_quantity_4_4Field);

		Field grade_quantity_4_5Field = new Field("grade_quantity_4_5", "double");
		metaData.addField(grade_quantity_4_5Field);

		Field farmer5Field = new Field("farmer5", "String");
		farmer5Field.setLength(512);
		metaData.addField(farmer5Field);

		Field farmer_quantity_5Field = new Field("farmer_quantity_5", "double");
		metaData.addField(farmer_quantity_5Field);

		Field grade_quantity_5_1Field = new Field("grade_quantity_5_1", "double");
		metaData.addField(grade_quantity_5_1Field);

		Field grade_quantity_5_2Field = new Field("grade_quantity_5_2", "double");
		metaData.addField(grade_quantity_5_2Field);

		Field grade_quantity_5_3Field = new Field("grade_quantity_5_3", "double");
		metaData.addField(grade_quantity_5_3Field);

		Field grade_quantity_5_4Field = new Field("grade_quantity_5_4", "double");
		metaData.addField(grade_quantity_5_4Field);

		Field grade_quantity_5_5Field = new Field("grade_quantity_5_5", "double");
		metaData.addField(grade_quantity_5_5Field);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_mandi_record");

		metaData.setCluster("DB_RECORD");
	}

	public Basec4t_mandi_record() {}

	public Basec4t_mandi_record(Basec4t_mandi_record obj) {
		this.id = obj.id;
		this.event_date = obj.event_date;
		this.event_date_str = obj.event_date_str;
		this.community_id = obj.community_id;
		this.community_name = obj.community_name;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.city = obj.city;
		this.user_name = obj.user_name;
		this.record_type = obj.record_type;
		this.record_no = obj.record_no;
		this.vehicle_no = obj.vehicle_no;
		this.product_id = obj.product_id;
		this.product_name = obj.product_name;
		this.total_quantity = obj.total_quantity;
		this.total_product_quantity = obj.total_product_quantity;
		this.creation_time = obj.creation_time;
		this.farmer1 = obj.farmer1;
		this.farmer_quantity_1 = obj.farmer_quantity_1;
		this.grade_quantity_1_1 = obj.grade_quantity_1_1;
		this.grade_quantity_1_2 = obj.grade_quantity_1_2;
		this.grade_quantity_1_3 = obj.grade_quantity_1_3;
		this.grade_quantity_1_4 = obj.grade_quantity_1_4;
		this.grade_quantity_1_5 = obj.grade_quantity_1_5;
		this.farmer2 = obj.farmer2;
		this.farmer_quantity_2 = obj.farmer_quantity_2;
		this.grade_quantity_2_1 = obj.grade_quantity_2_1;
		this.grade_quantity_2_2 = obj.grade_quantity_2_2;
		this.grade_quantity_2_3 = obj.grade_quantity_2_3;
		this.grade_quantity_2_4 = obj.grade_quantity_2_4;
		this.grade_quantity_2_5 = obj.grade_quantity_2_5;
		this.farmer3 = obj.farmer3;
		this.farmer_quantity_3 = obj.farmer_quantity_3;
		this.grade_quantity_3_1 = obj.grade_quantity_3_1;
		this.grade_quantity_3_2 = obj.grade_quantity_3_2;
		this.grade_quantity_3_3 = obj.grade_quantity_3_3;
		this.grade_quantity_3_4 = obj.grade_quantity_3_4;
		this.grade_quantity_3_5 = obj.grade_quantity_3_5;
		this.farmer4 = obj.farmer4;
		this.farmer_quantity_4 = obj.farmer_quantity_4;
		this.grade_quantity_4_1 = obj.grade_quantity_4_1;
		this.grade_quantity_4_2 = obj.grade_quantity_4_2;
		this.grade_quantity_4_3 = obj.grade_quantity_4_3;
		this.grade_quantity_4_4 = obj.grade_quantity_4_4;
		this.grade_quantity_4_5 = obj.grade_quantity_4_5;
		this.farmer5 = obj.farmer5;
		this.farmer_quantity_5 = obj.farmer_quantity_5;
		this.grade_quantity_5_1 = obj.grade_quantity_5_1;
		this.grade_quantity_5_2 = obj.grade_quantity_5_2;
		this.grade_quantity_5_3 = obj.grade_quantity_5_3;
		this.grade_quantity_5_4 = obj.grade_quantity_5_4;
		this.grade_quantity_5_5 = obj.grade_quantity_5_5;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(event_date != null)
			map.put("event_date", event_date);
		if(event_date_str != null)
			map.put("event_date_str", event_date_str);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(city != null)
			map.put("city", city);
		if(user_name != null)
			map.put("user_name", user_name);
		if(record_type != null)
			map.put("record_type", record_type);
		if(record_no != null)
			map.put("record_no", record_no);
		if(vehicle_no != null)
			map.put("vehicle_no", vehicle_no);
		if(product_id != null)
			map.put("product_id", product_id);
		if(product_name != null)
			map.put("product_name", product_name);
		if(total_quantity != null)
			map.put("total_quantity", total_quantity);
		if(total_product_quantity != null)
			map.put("total_product_quantity", total_product_quantity);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(farmer1 != null)
			map.put("farmer1", farmer1);
		if(farmer_quantity_1 != null)
			map.put("farmer_quantity_1", farmer_quantity_1);
		if(grade_quantity_1_1 != null)
			map.put("grade_quantity_1_1", grade_quantity_1_1);
		if(grade_quantity_1_2 != null)
			map.put("grade_quantity_1_2", grade_quantity_1_2);
		if(grade_quantity_1_3 != null)
			map.put("grade_quantity_1_3", grade_quantity_1_3);
		if(grade_quantity_1_4 != null)
			map.put("grade_quantity_1_4", grade_quantity_1_4);
		if(grade_quantity_1_5 != null)
			map.put("grade_quantity_1_5", grade_quantity_1_5);
		if(farmer2 != null)
			map.put("farmer2", farmer2);
		if(farmer_quantity_2 != null)
			map.put("farmer_quantity_2", farmer_quantity_2);
		if(grade_quantity_2_1 != null)
			map.put("grade_quantity_2_1", grade_quantity_2_1);
		if(grade_quantity_2_2 != null)
			map.put("grade_quantity_2_2", grade_quantity_2_2);
		if(grade_quantity_2_3 != null)
			map.put("grade_quantity_2_3", grade_quantity_2_3);
		if(grade_quantity_2_4 != null)
			map.put("grade_quantity_2_4", grade_quantity_2_4);
		if(grade_quantity_2_5 != null)
			map.put("grade_quantity_2_5", grade_quantity_2_5);
		if(farmer3 != null)
			map.put("farmer3", farmer3);
		if(farmer_quantity_3 != null)
			map.put("farmer_quantity_3", farmer_quantity_3);
		if(grade_quantity_3_1 != null)
			map.put("grade_quantity_3_1", grade_quantity_3_1);
		if(grade_quantity_3_2 != null)
			map.put("grade_quantity_3_2", grade_quantity_3_2);
		if(grade_quantity_3_3 != null)
			map.put("grade_quantity_3_3", grade_quantity_3_3);
		if(grade_quantity_3_4 != null)
			map.put("grade_quantity_3_4", grade_quantity_3_4);
		if(grade_quantity_3_5 != null)
			map.put("grade_quantity_3_5", grade_quantity_3_5);
		if(farmer4 != null)
			map.put("farmer4", farmer4);
		if(farmer_quantity_4 != null)
			map.put("farmer_quantity_4", farmer_quantity_4);
		if(grade_quantity_4_1 != null)
			map.put("grade_quantity_4_1", grade_quantity_4_1);
		if(grade_quantity_4_2 != null)
			map.put("grade_quantity_4_2", grade_quantity_4_2);
		if(grade_quantity_4_3 != null)
			map.put("grade_quantity_4_3", grade_quantity_4_3);
		if(grade_quantity_4_4 != null)
			map.put("grade_quantity_4_4", grade_quantity_4_4);
		if(grade_quantity_4_5 != null)
			map.put("grade_quantity_4_5", grade_quantity_4_5);
		if(farmer5 != null)
			map.put("farmer5", farmer5);
		if(farmer_quantity_5 != null)
			map.put("farmer_quantity_5", farmer_quantity_5);
		if(grade_quantity_5_1 != null)
			map.put("grade_quantity_5_1", grade_quantity_5_1);
		if(grade_quantity_5_2 != null)
			map.put("grade_quantity_5_2", grade_quantity_5_2);
		if(grade_quantity_5_3 != null)
			map.put("grade_quantity_5_3", grade_quantity_5_3);
		if(grade_quantity_5_4 != null)
			map.put("grade_quantity_5_4", grade_quantity_5_4);
		if(grade_quantity_5_5 != null)
			map.put("grade_quantity_5_5", grade_quantity_5_5);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(event_date != null)
			map.put("event_date", event_date);
		if(event_date_str != null)
			map.put("event_date_str", event_date_str);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(city != null)
			map.put("city", city);
		if(user_name != null)
			map.put("user_name", user_name);
		if(record_type != null)
			map.put("record_type", record_type);
		if(record_no != null)
			map.put("record_no", record_no);
		if(vehicle_no != null)
			map.put("vehicle_no", vehicle_no);
		if(product_id != null)
			map.put("product_id", product_id);
		if(product_name != null)
			map.put("product_name", product_name);
		if(total_quantity != null)
			map.put("total_quantity", total_quantity);
		if(total_product_quantity != null)
			map.put("total_product_quantity", total_product_quantity);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(farmer1 != null)
			map.put("farmer1", farmer1);
		if(farmer_quantity_1 != null)
			map.put("farmer_quantity_1", farmer_quantity_1);
		if(grade_quantity_1_1 != null)
			map.put("grade_quantity_1_1", grade_quantity_1_1);
		if(grade_quantity_1_2 != null)
			map.put("grade_quantity_1_2", grade_quantity_1_2);
		if(grade_quantity_1_3 != null)
			map.put("grade_quantity_1_3", grade_quantity_1_3);
		if(grade_quantity_1_4 != null)
			map.put("grade_quantity_1_4", grade_quantity_1_4);
		if(grade_quantity_1_5 != null)
			map.put("grade_quantity_1_5", grade_quantity_1_5);
		if(farmer2 != null)
			map.put("farmer2", farmer2);
		if(farmer_quantity_2 != null)
			map.put("farmer_quantity_2", farmer_quantity_2);
		if(grade_quantity_2_1 != null)
			map.put("grade_quantity_2_1", grade_quantity_2_1);
		if(grade_quantity_2_2 != null)
			map.put("grade_quantity_2_2", grade_quantity_2_2);
		if(grade_quantity_2_3 != null)
			map.put("grade_quantity_2_3", grade_quantity_2_3);
		if(grade_quantity_2_4 != null)
			map.put("grade_quantity_2_4", grade_quantity_2_4);
		if(grade_quantity_2_5 != null)
			map.put("grade_quantity_2_5", grade_quantity_2_5);
		if(farmer3 != null)
			map.put("farmer3", farmer3);
		if(farmer_quantity_3 != null)
			map.put("farmer_quantity_3", farmer_quantity_3);
		if(grade_quantity_3_1 != null)
			map.put("grade_quantity_3_1", grade_quantity_3_1);
		if(grade_quantity_3_2 != null)
			map.put("grade_quantity_3_2", grade_quantity_3_2);
		if(grade_quantity_3_3 != null)
			map.put("grade_quantity_3_3", grade_quantity_3_3);
		if(grade_quantity_3_4 != null)
			map.put("grade_quantity_3_4", grade_quantity_3_4);
		if(grade_quantity_3_5 != null)
			map.put("grade_quantity_3_5", grade_quantity_3_5);
		if(farmer4 != null)
			map.put("farmer4", farmer4);
		if(farmer_quantity_4 != null)
			map.put("farmer_quantity_4", farmer_quantity_4);
		if(grade_quantity_4_1 != null)
			map.put("grade_quantity_4_1", grade_quantity_4_1);
		if(grade_quantity_4_2 != null)
			map.put("grade_quantity_4_2", grade_quantity_4_2);
		if(grade_quantity_4_3 != null)
			map.put("grade_quantity_4_3", grade_quantity_4_3);
		if(grade_quantity_4_4 != null)
			map.put("grade_quantity_4_4", grade_quantity_4_4);
		if(grade_quantity_4_5 != null)
			map.put("grade_quantity_4_5", grade_quantity_4_5);
		if(farmer5 != null)
			map.put("farmer5", farmer5);
		if(farmer_quantity_5 != null)
			map.put("farmer_quantity_5", farmer_quantity_5);
		if(grade_quantity_5_1 != null)
			map.put("grade_quantity_5_1", grade_quantity_5_1);
		if(grade_quantity_5_2 != null)
			map.put("grade_quantity_5_2", grade_quantity_5_2);
		if(grade_quantity_5_3 != null)
			map.put("grade_quantity_5_3", grade_quantity_5_3);
		if(grade_quantity_5_4 != null)
			map.put("grade_quantity_5_4", grade_quantity_5_4);
		if(grade_quantity_5_5 != null)
			map.put("grade_quantity_5_5", grade_quantity_5_5);
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
		event_date = (Long) map.get("event_date");
		event_date_str = (String) map.get("event_date_str");
		community_id = (String) map.get("community_id");
		community_name = (String) map.get("community_name");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		city = (String) map.get("city");
		user_name = (String) map.get("user_name");
		record_type = (String) map.get("record_type");
		record_no = (String) map.get("record_no");
		vehicle_no = (String) map.get("vehicle_no");
		product_id = (String) map.get("product_id");
		product_name = (String) map.get("product_name");
		total_quantity = (Double) map.get("total_quantity");
		total_product_quantity = (Double) map.get("total_product_quantity");
		creation_time = (Long) map.get("creation_time");
		farmer1 = (String) map.get("farmer1");
		farmer_quantity_1 = (Double) map.get("farmer_quantity_1");
		grade_quantity_1_1 = (Double) map.get("grade_quantity_1_1");
		grade_quantity_1_2 = (Double) map.get("grade_quantity_1_2");
		grade_quantity_1_3 = (Double) map.get("grade_quantity_1_3");
		grade_quantity_1_4 = (Double) map.get("grade_quantity_1_4");
		grade_quantity_1_5 = (Double) map.get("grade_quantity_1_5");
		farmer2 = (String) map.get("farmer2");
		farmer_quantity_2 = (Double) map.get("farmer_quantity_2");
		grade_quantity_2_1 = (Double) map.get("grade_quantity_2_1");
		grade_quantity_2_2 = (Double) map.get("grade_quantity_2_2");
		grade_quantity_2_3 = (Double) map.get("grade_quantity_2_3");
		grade_quantity_2_4 = (Double) map.get("grade_quantity_2_4");
		grade_quantity_2_5 = (Double) map.get("grade_quantity_2_5");
		farmer3 = (String) map.get("farmer3");
		farmer_quantity_3 = (Double) map.get("farmer_quantity_3");
		grade_quantity_3_1 = (Double) map.get("grade_quantity_3_1");
		grade_quantity_3_2 = (Double) map.get("grade_quantity_3_2");
		grade_quantity_3_3 = (Double) map.get("grade_quantity_3_3");
		grade_quantity_3_4 = (Double) map.get("grade_quantity_3_4");
		grade_quantity_3_5 = (Double) map.get("grade_quantity_3_5");
		farmer4 = (String) map.get("farmer4");
		farmer_quantity_4 = (Double) map.get("farmer_quantity_4");
		grade_quantity_4_1 = (Double) map.get("grade_quantity_4_1");
		grade_quantity_4_2 = (Double) map.get("grade_quantity_4_2");
		grade_quantity_4_3 = (Double) map.get("grade_quantity_4_3");
		grade_quantity_4_4 = (Double) map.get("grade_quantity_4_4");
		grade_quantity_4_5 = (Double) map.get("grade_quantity_4_5");
		farmer5 = (String) map.get("farmer5");
		farmer_quantity_5 = (Double) map.get("farmer_quantity_5");
		grade_quantity_5_1 = (Double) map.get("grade_quantity_5_1");
		grade_quantity_5_2 = (Double) map.get("grade_quantity_5_2");
		grade_quantity_5_3 = (Double) map.get("grade_quantity_5_3");
		grade_quantity_5_4 = (Double) map.get("grade_quantity_5_4");
		grade_quantity_5_5 = (Double) map.get("grade_quantity_5_5");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object event_dateObj = map.get("event_date");
		if(event_dateObj != null)
			event_date = (Long) event_dateObj;

		Object event_date_strObj = map.get("event_date_str");
		if(event_date_strObj != null)
			event_date_str = event_date_strObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object community_nameObj = map.get("community_name");
		if(community_nameObj != null)
			community_name = community_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object cityObj = map.get("city");
		if(cityObj != null)
			city = cityObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

		Object record_typeObj = map.get("record_type");
		if(record_typeObj != null)
			record_type = record_typeObj.toString();

		Object record_noObj = map.get("record_no");
		if(record_noObj != null)
			record_no = record_noObj.toString();

		Object vehicle_noObj = map.get("vehicle_no");
		if(vehicle_noObj != null)
			vehicle_no = vehicle_noObj.toString();

		Object product_idObj = map.get("product_id");
		if(product_idObj != null)
			product_id = product_idObj.toString();

		Object product_nameObj = map.get("product_name");
		if(product_nameObj != null)
			product_name = product_nameObj.toString();

		Object total_quantityObj = map.get("total_quantity");
		if(total_quantityObj != null)
			total_quantity = new Double(total_quantityObj.toString());

		Object total_product_quantityObj = map.get("total_product_quantity");
		if(total_product_quantityObj != null)
			total_product_quantity = new Double(total_product_quantityObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object farmer1Obj = map.get("farmer1");
		if(farmer1Obj != null)
			farmer1 = farmer1Obj.toString();

		Object farmer_quantity_1Obj = map.get("farmer_quantity_1");
		if(farmer_quantity_1Obj != null)
			farmer_quantity_1 = new Double(farmer_quantity_1Obj.toString());

		Object grade_quantity_1_1Obj = map.get("grade_quantity_1_1");
		if(grade_quantity_1_1Obj != null)
			grade_quantity_1_1 = new Double(grade_quantity_1_1Obj.toString());

		Object grade_quantity_1_2Obj = map.get("grade_quantity_1_2");
		if(grade_quantity_1_2Obj != null)
			grade_quantity_1_2 = new Double(grade_quantity_1_2Obj.toString());

		Object grade_quantity_1_3Obj = map.get("grade_quantity_1_3");
		if(grade_quantity_1_3Obj != null)
			grade_quantity_1_3 = new Double(grade_quantity_1_3Obj.toString());

		Object grade_quantity_1_4Obj = map.get("grade_quantity_1_4");
		if(grade_quantity_1_4Obj != null)
			grade_quantity_1_4 = new Double(grade_quantity_1_4Obj.toString());

		Object grade_quantity_1_5Obj = map.get("grade_quantity_1_5");
		if(grade_quantity_1_5Obj != null)
			grade_quantity_1_5 = new Double(grade_quantity_1_5Obj.toString());

		Object farmer2Obj = map.get("farmer2");
		if(farmer2Obj != null)
			farmer2 = farmer2Obj.toString();

		Object farmer_quantity_2Obj = map.get("farmer_quantity_2");
		if(farmer_quantity_2Obj != null)
			farmer_quantity_2 = new Double(farmer_quantity_2Obj.toString());

		Object grade_quantity_2_1Obj = map.get("grade_quantity_2_1");
		if(grade_quantity_2_1Obj != null)
			grade_quantity_2_1 = new Double(grade_quantity_2_1Obj.toString());

		Object grade_quantity_2_2Obj = map.get("grade_quantity_2_2");
		if(grade_quantity_2_2Obj != null)
			grade_quantity_2_2 = new Double(grade_quantity_2_2Obj.toString());

		Object grade_quantity_2_3Obj = map.get("grade_quantity_2_3");
		if(grade_quantity_2_3Obj != null)
			grade_quantity_2_3 = new Double(grade_quantity_2_3Obj.toString());

		Object grade_quantity_2_4Obj = map.get("grade_quantity_2_4");
		if(grade_quantity_2_4Obj != null)
			grade_quantity_2_4 = new Double(grade_quantity_2_4Obj.toString());

		Object grade_quantity_2_5Obj = map.get("grade_quantity_2_5");
		if(grade_quantity_2_5Obj != null)
			grade_quantity_2_5 = new Double(grade_quantity_2_5Obj.toString());

		Object farmer3Obj = map.get("farmer3");
		if(farmer3Obj != null)
			farmer3 = farmer3Obj.toString();

		Object farmer_quantity_3Obj = map.get("farmer_quantity_3");
		if(farmer_quantity_3Obj != null)
			farmer_quantity_3 = new Double(farmer_quantity_3Obj.toString());

		Object grade_quantity_3_1Obj = map.get("grade_quantity_3_1");
		if(grade_quantity_3_1Obj != null)
			grade_quantity_3_1 = new Double(grade_quantity_3_1Obj.toString());

		Object grade_quantity_3_2Obj = map.get("grade_quantity_3_2");
		if(grade_quantity_3_2Obj != null)
			grade_quantity_3_2 = new Double(grade_quantity_3_2Obj.toString());

		Object grade_quantity_3_3Obj = map.get("grade_quantity_3_3");
		if(grade_quantity_3_3Obj != null)
			grade_quantity_3_3 = new Double(grade_quantity_3_3Obj.toString());

		Object grade_quantity_3_4Obj = map.get("grade_quantity_3_4");
		if(grade_quantity_3_4Obj != null)
			grade_quantity_3_4 = new Double(grade_quantity_3_4Obj.toString());

		Object grade_quantity_3_5Obj = map.get("grade_quantity_3_5");
		if(grade_quantity_3_5Obj != null)
			grade_quantity_3_5 = new Double(grade_quantity_3_5Obj.toString());

		Object farmer4Obj = map.get("farmer4");
		if(farmer4Obj != null)
			farmer4 = farmer4Obj.toString();

		Object farmer_quantity_4Obj = map.get("farmer_quantity_4");
		if(farmer_quantity_4Obj != null)
			farmer_quantity_4 = new Double(farmer_quantity_4Obj.toString());

		Object grade_quantity_4_1Obj = map.get("grade_quantity_4_1");
		if(grade_quantity_4_1Obj != null)
			grade_quantity_4_1 = new Double(grade_quantity_4_1Obj.toString());

		Object grade_quantity_4_2Obj = map.get("grade_quantity_4_2");
		if(grade_quantity_4_2Obj != null)
			grade_quantity_4_2 = new Double(grade_quantity_4_2Obj.toString());

		Object grade_quantity_4_3Obj = map.get("grade_quantity_4_3");
		if(grade_quantity_4_3Obj != null)
			grade_quantity_4_3 = new Double(grade_quantity_4_3Obj.toString());

		Object grade_quantity_4_4Obj = map.get("grade_quantity_4_4");
		if(grade_quantity_4_4Obj != null)
			grade_quantity_4_4 = new Double(grade_quantity_4_4Obj.toString());

		Object grade_quantity_4_5Obj = map.get("grade_quantity_4_5");
		if(grade_quantity_4_5Obj != null)
			grade_quantity_4_5 = new Double(grade_quantity_4_5Obj.toString());

		Object farmer5Obj = map.get("farmer5");
		if(farmer5Obj != null)
			farmer5 = farmer5Obj.toString();

		Object farmer_quantity_5Obj = map.get("farmer_quantity_5");
		if(farmer_quantity_5Obj != null)
			farmer_quantity_5 = new Double(farmer_quantity_5Obj.toString());

		Object grade_quantity_5_1Obj = map.get("grade_quantity_5_1");
		if(grade_quantity_5_1Obj != null)
			grade_quantity_5_1 = new Double(grade_quantity_5_1Obj.toString());

		Object grade_quantity_5_2Obj = map.get("grade_quantity_5_2");
		if(grade_quantity_5_2Obj != null)
			grade_quantity_5_2 = new Double(grade_quantity_5_2Obj.toString());

		Object grade_quantity_5_3Obj = map.get("grade_quantity_5_3");
		if(grade_quantity_5_3Obj != null)
			grade_quantity_5_3 = new Double(grade_quantity_5_3Obj.toString());

		Object grade_quantity_5_4Obj = map.get("grade_quantity_5_4");
		if(grade_quantity_5_4Obj != null)
			grade_quantity_5_4 = new Double(grade_quantity_5_4Obj.toString());

		Object grade_quantity_5_5Obj = map.get("grade_quantity_5_5");
		if(grade_quantity_5_5Obj != null)
			grade_quantity_5_5 = new Double(grade_quantity_5_5Obj.toString());

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

	public Long getEvent_date() {
		return event_date;
	}

	public void setEvent_date(Long event_date) {
		this.event_date = event_date;
	}


	public String getEvent_date_str() {
		return event_date_str;
	}

	public String getEvent_date_strEx() {
		return event_date_str != null ? event_date_str : "";
	}

	public void setEvent_date_str(String event_date_str) {
		this.event_date_str = event_date_str;
	}

	public void unSetEvent_date_str() {
		this.event_date_str = null;
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

	public String getCommunity_name() {
		return community_name;
	}

	public String getCommunity_nameEx() {
		return community_name != null ? community_name : "";
	}

	public void setCommunity_name(String community_name) {
		this.community_name = community_name;
	}

	public void unSetCommunity_name() {
		this.community_name = null;
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

	public String getCity() {
		return city;
	}

	public String getCityEx() {
		return city != null ? city : "";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void unSetCity() {
		this.city = null;
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

	public String getRecord_no() {
		return record_no;
	}

	public String getRecord_noEx() {
		return record_no != null ? record_no : "";
	}

	public void setRecord_no(String record_no) {
		this.record_no = record_no;
	}

	public void unSetRecord_no() {
		this.record_no = null;
	}

	public String getVehicle_no() {
		return vehicle_no;
	}

	public String getVehicle_noEx() {
		return vehicle_no != null ? vehicle_no : "";
	}

	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}

	public void unSetVehicle_no() {
		this.vehicle_no = null;
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

	public Double getTotal_quantity() {
		return total_quantity;
	}

	public double getTotal_quantityEx() {
		return total_quantity != null ? total_quantity : 0;
	}

	public void setTotal_quantity(double total_quantity) {
		this.total_quantity = total_quantity;
	}

	public void setTotal_quantity(Double total_quantity) {
		this.total_quantity = total_quantity;
	}

	public void unSetTotal_quantity() {
		this.total_quantity = null;
	}

	public Double getTotal_product_quantity() {
		return total_product_quantity;
	}

	public double getTotal_product_quantityEx() {
		return total_product_quantity != null ? total_product_quantity : 0;
	}

	public void setTotal_product_quantity(double total_product_quantity) {
		this.total_product_quantity = total_product_quantity;
	}

	public void setTotal_product_quantity(Double total_product_quantity) {
		this.total_product_quantity = total_product_quantity;
	}

	public void unSetTotal_product_quantity() {
		this.total_product_quantity = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public String getFarmer1() {
		return farmer1;
	}

	public String getFarmer1Ex() {
		return farmer1 != null ? farmer1 : "";
	}

	public void setFarmer1(String farmer1) {
		this.farmer1 = farmer1;
	}

	public void unSetFarmer1() {
		this.farmer1 = null;
	}

	public Double getFarmer_quantity_1() {
		return farmer_quantity_1;
	}

	public double getFarmer_quantity_1Ex() {
		return farmer_quantity_1 != null ? farmer_quantity_1 : 0;
	}

	public void setFarmer_quantity_1(double farmer_quantity_1) {
		this.farmer_quantity_1 = farmer_quantity_1;
	}

	public void setFarmer_quantity_1(Double farmer_quantity_1) {
		this.farmer_quantity_1 = farmer_quantity_1;
	}

	public void unSetFarmer_quantity_1() {
		this.farmer_quantity_1 = null;
	}

	public Double getGrade_quantity_1_1() {
		return grade_quantity_1_1;
	}

	public double getGrade_quantity_1_1Ex() {
		return grade_quantity_1_1 != null ? grade_quantity_1_1 : 0;
	}

	public void setGrade_quantity_1_1(double grade_quantity_1_1) {
		this.grade_quantity_1_1 = grade_quantity_1_1;
	}

	public void setGrade_quantity_1_1(Double grade_quantity_1_1) {
		this.grade_quantity_1_1 = grade_quantity_1_1;
	}

	public void unSetGrade_quantity_1_1() {
		this.grade_quantity_1_1 = null;
	}

	public Double getGrade_quantity_1_2() {
		return grade_quantity_1_2;
	}

	public double getGrade_quantity_1_2Ex() {
		return grade_quantity_1_2 != null ? grade_quantity_1_2 : 0;
	}

	public void setGrade_quantity_1_2(double grade_quantity_1_2) {
		this.grade_quantity_1_2 = grade_quantity_1_2;
	}

	public void setGrade_quantity_1_2(Double grade_quantity_1_2) {
		this.grade_quantity_1_2 = grade_quantity_1_2;
	}

	public void unSetGrade_quantity_1_2() {
		this.grade_quantity_1_2 = null;
	}

	public Double getGrade_quantity_1_3() {
		return grade_quantity_1_3;
	}

	public double getGrade_quantity_1_3Ex() {
		return grade_quantity_1_3 != null ? grade_quantity_1_3 : 0;
	}

	public void setGrade_quantity_1_3(double grade_quantity_1_3) {
		this.grade_quantity_1_3 = grade_quantity_1_3;
	}

	public void setGrade_quantity_1_3(Double grade_quantity_1_3) {
		this.grade_quantity_1_3 = grade_quantity_1_3;
	}

	public void unSetGrade_quantity_1_3() {
		this.grade_quantity_1_3 = null;
	}

	public Double getGrade_quantity_1_4() {
		return grade_quantity_1_4;
	}

	public double getGrade_quantity_1_4Ex() {
		return grade_quantity_1_4 != null ? grade_quantity_1_4 : 0;
	}

	public void setGrade_quantity_1_4(double grade_quantity_1_4) {
		this.grade_quantity_1_4 = grade_quantity_1_4;
	}

	public void setGrade_quantity_1_4(Double grade_quantity_1_4) {
		this.grade_quantity_1_4 = grade_quantity_1_4;
	}

	public void unSetGrade_quantity_1_4() {
		this.grade_quantity_1_4 = null;
	}

	public Double getGrade_quantity_1_5() {
		return grade_quantity_1_5;
	}

	public double getGrade_quantity_1_5Ex() {
		return grade_quantity_1_5 != null ? grade_quantity_1_5 : 0;
	}

	public void setGrade_quantity_1_5(double grade_quantity_1_5) {
		this.grade_quantity_1_5 = grade_quantity_1_5;
	}

	public void setGrade_quantity_1_5(Double grade_quantity_1_5) {
		this.grade_quantity_1_5 = grade_quantity_1_5;
	}

	public void unSetGrade_quantity_1_5() {
		this.grade_quantity_1_5 = null;
	}

	public String getFarmer2() {
		return farmer2;
	}

	public String getFarmer2Ex() {
		return farmer2 != null ? farmer2 : "";
	}

	public void setFarmer2(String farmer2) {
		this.farmer2 = farmer2;
	}

	public void unSetFarmer2() {
		this.farmer2 = null;
	}

	public Double getFarmer_quantity_2() {
		return farmer_quantity_2;
	}

	public double getFarmer_quantity_2Ex() {
		return farmer_quantity_2 != null ? farmer_quantity_2 : 0;
	}

	public void setFarmer_quantity_2(double farmer_quantity_2) {
		this.farmer_quantity_2 = farmer_quantity_2;
	}

	public void setFarmer_quantity_2(Double farmer_quantity_2) {
		this.farmer_quantity_2 = farmer_quantity_2;
	}

	public void unSetFarmer_quantity_2() {
		this.farmer_quantity_2 = null;
	}

	public Double getGrade_quantity_2_1() {
		return grade_quantity_2_1;
	}

	public double getGrade_quantity_2_1Ex() {
		return grade_quantity_2_1 != null ? grade_quantity_2_1 : 0;
	}

	public void setGrade_quantity_2_1(double grade_quantity_2_1) {
		this.grade_quantity_2_1 = grade_quantity_2_1;
	}

	public void setGrade_quantity_2_1(Double grade_quantity_2_1) {
		this.grade_quantity_2_1 = grade_quantity_2_1;
	}

	public void unSetGrade_quantity_2_1() {
		this.grade_quantity_2_1 = null;
	}

	public Double getGrade_quantity_2_2() {
		return grade_quantity_2_2;
	}

	public double getGrade_quantity_2_2Ex() {
		return grade_quantity_2_2 != null ? grade_quantity_2_2 : 0;
	}

	public void setGrade_quantity_2_2(double grade_quantity_2_2) {
		this.grade_quantity_2_2 = grade_quantity_2_2;
	}

	public void setGrade_quantity_2_2(Double grade_quantity_2_2) {
		this.grade_quantity_2_2 = grade_quantity_2_2;
	}

	public void unSetGrade_quantity_2_2() {
		this.grade_quantity_2_2 = null;
	}

	public Double getGrade_quantity_2_3() {
		return grade_quantity_2_3;
	}

	public double getGrade_quantity_2_3Ex() {
		return grade_quantity_2_3 != null ? grade_quantity_2_3 : 0;
	}

	public void setGrade_quantity_2_3(double grade_quantity_2_3) {
		this.grade_quantity_2_3 = grade_quantity_2_3;
	}

	public void setGrade_quantity_2_3(Double grade_quantity_2_3) {
		this.grade_quantity_2_3 = grade_quantity_2_3;
	}

	public void unSetGrade_quantity_2_3() {
		this.grade_quantity_2_3 = null;
	}

	public Double getGrade_quantity_2_4() {
		return grade_quantity_2_4;
	}

	public double getGrade_quantity_2_4Ex() {
		return grade_quantity_2_4 != null ? grade_quantity_2_4 : 0;
	}

	public void setGrade_quantity_2_4(double grade_quantity_2_4) {
		this.grade_quantity_2_4 = grade_quantity_2_4;
	}

	public void setGrade_quantity_2_4(Double grade_quantity_2_4) {
		this.grade_quantity_2_4 = grade_quantity_2_4;
	}

	public void unSetGrade_quantity_2_4() {
		this.grade_quantity_2_4 = null;
	}

	public Double getGrade_quantity_2_5() {
		return grade_quantity_2_5;
	}

	public double getGrade_quantity_2_5Ex() {
		return grade_quantity_2_5 != null ? grade_quantity_2_5 : 0;
	}

	public void setGrade_quantity_2_5(double grade_quantity_2_5) {
		this.grade_quantity_2_5 = grade_quantity_2_5;
	}

	public void setGrade_quantity_2_5(Double grade_quantity_2_5) {
		this.grade_quantity_2_5 = grade_quantity_2_5;
	}

	public void unSetGrade_quantity_2_5() {
		this.grade_quantity_2_5 = null;
	}

	public String getFarmer3() {
		return farmer3;
	}

	public String getFarmer3Ex() {
		return farmer3 != null ? farmer3 : "";
	}

	public void setFarmer3(String farmer3) {
		this.farmer3 = farmer3;
	}

	public void unSetFarmer3() {
		this.farmer3 = null;
	}

	public Double getFarmer_quantity_3() {
		return farmer_quantity_3;
	}

	public double getFarmer_quantity_3Ex() {
		return farmer_quantity_3 != null ? farmer_quantity_3 : 0;
	}

	public void setFarmer_quantity_3(double farmer_quantity_3) {
		this.farmer_quantity_3 = farmer_quantity_3;
	}

	public void setFarmer_quantity_3(Double farmer_quantity_3) {
		this.farmer_quantity_3 = farmer_quantity_3;
	}

	public void unSetFarmer_quantity_3() {
		this.farmer_quantity_3 = null;
	}

	public Double getGrade_quantity_3_1() {
		return grade_quantity_3_1;
	}

	public double getGrade_quantity_3_1Ex() {
		return grade_quantity_3_1 != null ? grade_quantity_3_1 : 0;
	}

	public void setGrade_quantity_3_1(double grade_quantity_3_1) {
		this.grade_quantity_3_1 = grade_quantity_3_1;
	}

	public void setGrade_quantity_3_1(Double grade_quantity_3_1) {
		this.grade_quantity_3_1 = grade_quantity_3_1;
	}

	public void unSetGrade_quantity_3_1() {
		this.grade_quantity_3_1 = null;
	}

	public Double getGrade_quantity_3_2() {
		return grade_quantity_3_2;
	}

	public double getGrade_quantity_3_2Ex() {
		return grade_quantity_3_2 != null ? grade_quantity_3_2 : 0;
	}

	public void setGrade_quantity_3_2(double grade_quantity_3_2) {
		this.grade_quantity_3_2 = grade_quantity_3_2;
	}

	public void setGrade_quantity_3_2(Double grade_quantity_3_2) {
		this.grade_quantity_3_2 = grade_quantity_3_2;
	}

	public void unSetGrade_quantity_3_2() {
		this.grade_quantity_3_2 = null;
	}

	public Double getGrade_quantity_3_3() {
		return grade_quantity_3_3;
	}

	public double getGrade_quantity_3_3Ex() {
		return grade_quantity_3_3 != null ? grade_quantity_3_3 : 0;
	}

	public void setGrade_quantity_3_3(double grade_quantity_3_3) {
		this.grade_quantity_3_3 = grade_quantity_3_3;
	}

	public void setGrade_quantity_3_3(Double grade_quantity_3_3) {
		this.grade_quantity_3_3 = grade_quantity_3_3;
	}

	public void unSetGrade_quantity_3_3() {
		this.grade_quantity_3_3 = null;
	}

	public Double getGrade_quantity_3_4() {
		return grade_quantity_3_4;
	}

	public double getGrade_quantity_3_4Ex() {
		return grade_quantity_3_4 != null ? grade_quantity_3_4 : 0;
	}

	public void setGrade_quantity_3_4(double grade_quantity_3_4) {
		this.grade_quantity_3_4 = grade_quantity_3_4;
	}

	public void setGrade_quantity_3_4(Double grade_quantity_3_4) {
		this.grade_quantity_3_4 = grade_quantity_3_4;
	}

	public void unSetGrade_quantity_3_4() {
		this.grade_quantity_3_4 = null;
	}

	public Double getGrade_quantity_3_5() {
		return grade_quantity_3_5;
	}

	public double getGrade_quantity_3_5Ex() {
		return grade_quantity_3_5 != null ? grade_quantity_3_5 : 0;
	}

	public void setGrade_quantity_3_5(double grade_quantity_3_5) {
		this.grade_quantity_3_5 = grade_quantity_3_5;
	}

	public void setGrade_quantity_3_5(Double grade_quantity_3_5) {
		this.grade_quantity_3_5 = grade_quantity_3_5;
	}

	public void unSetGrade_quantity_3_5() {
		this.grade_quantity_3_5 = null;
	}

	public String getFarmer4() {
		return farmer4;
	}

	public String getFarmer4Ex() {
		return farmer4 != null ? farmer4 : "";
	}

	public void setFarmer4(String farmer4) {
		this.farmer4 = farmer4;
	}

	public void unSetFarmer4() {
		this.farmer4 = null;
	}

	public Double getFarmer_quantity_4() {
		return farmer_quantity_4;
	}

	public double getFarmer_quantity_4Ex() {
		return farmer_quantity_4 != null ? farmer_quantity_4 : 0;
	}

	public void setFarmer_quantity_4(double farmer_quantity_4) {
		this.farmer_quantity_4 = farmer_quantity_4;
	}

	public void setFarmer_quantity_4(Double farmer_quantity_4) {
		this.farmer_quantity_4 = farmer_quantity_4;
	}

	public void unSetFarmer_quantity_4() {
		this.farmer_quantity_4 = null;
	}

	public Double getGrade_quantity_4_1() {
		return grade_quantity_4_1;
	}

	public double getGrade_quantity_4_1Ex() {
		return grade_quantity_4_1 != null ? grade_quantity_4_1 : 0;
	}

	public void setGrade_quantity_4_1(double grade_quantity_4_1) {
		this.grade_quantity_4_1 = grade_quantity_4_1;
	}

	public void setGrade_quantity_4_1(Double grade_quantity_4_1) {
		this.grade_quantity_4_1 = grade_quantity_4_1;
	}

	public void unSetGrade_quantity_4_1() {
		this.grade_quantity_4_1 = null;
	}

	public Double getGrade_quantity_4_2() {
		return grade_quantity_4_2;
	}

	public double getGrade_quantity_4_2Ex() {
		return grade_quantity_4_2 != null ? grade_quantity_4_2 : 0;
	}

	public void setGrade_quantity_4_2(double grade_quantity_4_2) {
		this.grade_quantity_4_2 = grade_quantity_4_2;
	}

	public void setGrade_quantity_4_2(Double grade_quantity_4_2) {
		this.grade_quantity_4_2 = grade_quantity_4_2;
	}

	public void unSetGrade_quantity_4_2() {
		this.grade_quantity_4_2 = null;
	}

	public Double getGrade_quantity_4_3() {
		return grade_quantity_4_3;
	}

	public double getGrade_quantity_4_3Ex() {
		return grade_quantity_4_3 != null ? grade_quantity_4_3 : 0;
	}

	public void setGrade_quantity_4_3(double grade_quantity_4_3) {
		this.grade_quantity_4_3 = grade_quantity_4_3;
	}

	public void setGrade_quantity_4_3(Double grade_quantity_4_3) {
		this.grade_quantity_4_3 = grade_quantity_4_3;
	}

	public void unSetGrade_quantity_4_3() {
		this.grade_quantity_4_3 = null;
	}

	public Double getGrade_quantity_4_4() {
		return grade_quantity_4_4;
	}

	public double getGrade_quantity_4_4Ex() {
		return grade_quantity_4_4 != null ? grade_quantity_4_4 : 0;
	}

	public void setGrade_quantity_4_4(double grade_quantity_4_4) {
		this.grade_quantity_4_4 = grade_quantity_4_4;
	}

	public void setGrade_quantity_4_4(Double grade_quantity_4_4) {
		this.grade_quantity_4_4 = grade_quantity_4_4;
	}

	public void unSetGrade_quantity_4_4() {
		this.grade_quantity_4_4 = null;
	}

	public Double getGrade_quantity_4_5() {
		return grade_quantity_4_5;
	}

	public double getGrade_quantity_4_5Ex() {
		return grade_quantity_4_5 != null ? grade_quantity_4_5 : 0;
	}

	public void setGrade_quantity_4_5(double grade_quantity_4_5) {
		this.grade_quantity_4_5 = grade_quantity_4_5;
	}

	public void setGrade_quantity_4_5(Double grade_quantity_4_5) {
		this.grade_quantity_4_5 = grade_quantity_4_5;
	}

	public void unSetGrade_quantity_4_5() {
		this.grade_quantity_4_5 = null;
	}

	public String getFarmer5() {
		return farmer5;
	}

	public String getFarmer5Ex() {
		return farmer5 != null ? farmer5 : "";
	}

	public void setFarmer5(String farmer5) {
		this.farmer5 = farmer5;
	}

	public void unSetFarmer5() {
		this.farmer5 = null;
	}

	public Double getFarmer_quantity_5() {
		return farmer_quantity_5;
	}

	public double getFarmer_quantity_5Ex() {
		return farmer_quantity_5 != null ? farmer_quantity_5 : 0;
	}

	public void setFarmer_quantity_5(double farmer_quantity_5) {
		this.farmer_quantity_5 = farmer_quantity_5;
	}

	public void setFarmer_quantity_5(Double farmer_quantity_5) {
		this.farmer_quantity_5 = farmer_quantity_5;
	}

	public void unSetFarmer_quantity_5() {
		this.farmer_quantity_5 = null;
	}

	public Double getGrade_quantity_5_1() {
		return grade_quantity_5_1;
	}

	public double getGrade_quantity_5_1Ex() {
		return grade_quantity_5_1 != null ? grade_quantity_5_1 : 0;
	}

	public void setGrade_quantity_5_1(double grade_quantity_5_1) {
		this.grade_quantity_5_1 = grade_quantity_5_1;
	}

	public void setGrade_quantity_5_1(Double grade_quantity_5_1) {
		this.grade_quantity_5_1 = grade_quantity_5_1;
	}

	public void unSetGrade_quantity_5_1() {
		this.grade_quantity_5_1 = null;
	}

	public Double getGrade_quantity_5_2() {
		return grade_quantity_5_2;
	}

	public double getGrade_quantity_5_2Ex() {
		return grade_quantity_5_2 != null ? grade_quantity_5_2 : 0;
	}

	public void setGrade_quantity_5_2(double grade_quantity_5_2) {
		this.grade_quantity_5_2 = grade_quantity_5_2;
	}

	public void setGrade_quantity_5_2(Double grade_quantity_5_2) {
		this.grade_quantity_5_2 = grade_quantity_5_2;
	}

	public void unSetGrade_quantity_5_2() {
		this.grade_quantity_5_2 = null;
	}

	public Double getGrade_quantity_5_3() {
		return grade_quantity_5_3;
	}

	public double getGrade_quantity_5_3Ex() {
		return grade_quantity_5_3 != null ? grade_quantity_5_3 : 0;
	}

	public void setGrade_quantity_5_3(double grade_quantity_5_3) {
		this.grade_quantity_5_3 = grade_quantity_5_3;
	}

	public void setGrade_quantity_5_3(Double grade_quantity_5_3) {
		this.grade_quantity_5_3 = grade_quantity_5_3;
	}

	public void unSetGrade_quantity_5_3() {
		this.grade_quantity_5_3 = null;
	}

	public Double getGrade_quantity_5_4() {
		return grade_quantity_5_4;
	}

	public double getGrade_quantity_5_4Ex() {
		return grade_quantity_5_4 != null ? grade_quantity_5_4 : 0;
	}

	public void setGrade_quantity_5_4(double grade_quantity_5_4) {
		this.grade_quantity_5_4 = grade_quantity_5_4;
	}

	public void setGrade_quantity_5_4(Double grade_quantity_5_4) {
		this.grade_quantity_5_4 = grade_quantity_5_4;
	}

	public void unSetGrade_quantity_5_4() {
		this.grade_quantity_5_4 = null;
	}

	public Double getGrade_quantity_5_5() {
		return grade_quantity_5_5;
	}

	public double getGrade_quantity_5_5Ex() {
		return grade_quantity_5_5 != null ? grade_quantity_5_5 : 0;
	}

	public void setGrade_quantity_5_5(double grade_quantity_5_5) {
		this.grade_quantity_5_5 = grade_quantity_5_5;
	}

	public void setGrade_quantity_5_5(Double grade_quantity_5_5) {
		this.grade_quantity_5_5 = grade_quantity_5_5;
	}

	public void unSetGrade_quantity_5_5() {
		this.grade_quantity_5_5 = null;
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