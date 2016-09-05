/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import java.util.HashMap;
import java.util.Map;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

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
	private Double grade_quantity_1_6 = null;
	private Double grade_quantity_1_7 = null;
	private Double grade_quantity_1_8 = null;
	private Double grade_quantity_1_9 = null;
	private String farmer2 = null;
	private Double farmer_quantity_2 = null;
	private Double grade_quantity_2_1 = null;
	private Double grade_quantity_2_2 = null;
	private Double grade_quantity_2_3 = null;
	private Double grade_quantity_2_4 = null;
	private Double grade_quantity_2_5 = null;
	private Double grade_quantity_2_6 = null;
	private Double grade_quantity_2_7 = null;
	private Double grade_quantity_2_8 = null;
	private Double grade_quantity_2_9 = null;
	private String farmer3 = null;
	private Double farmer_quantity_3 = null;
	private Double grade_quantity_3_1 = null;
	private Double grade_quantity_3_2 = null;
	private Double grade_quantity_3_3 = null;
	private Double grade_quantity_3_4 = null;
	private Double grade_quantity_3_5 = null;
	private Double grade_quantity_3_6 = null;
	private Double grade_quantity_3_7 = null;
	private Double grade_quantity_3_8 = null;
	private Double grade_quantity_3_9 = null;
	private String farmer4 = null;
	private Double farmer_quantity_4 = null;
	private Double grade_quantity_4_1 = null;
	private Double grade_quantity_4_2 = null;
	private Double grade_quantity_4_3 = null;
	private Double grade_quantity_4_4 = null;
	private Double grade_quantity_4_5 = null;
	private Double grade_quantity_4_6 = null;
	private Double grade_quantity_4_7 = null;
	private Double grade_quantity_4_8 = null;
	private Double grade_quantity_4_9 = null;
	private String farmer5 = null;
	private Double farmer_quantity_5 = null;
	private Double grade_quantity_5_1 = null;
	private Double grade_quantity_5_2 = null;
	private Double grade_quantity_5_3 = null;
	private Double grade_quantity_5_4 = null;
	private Double grade_quantity_5_5 = null;
	private Double grade_quantity_5_6 = null;
	private Double grade_quantity_5_7 = null;
	private Double grade_quantity_5_8 = null;
	private Double grade_quantity_5_9 = null;
	private String farmer6 = null;
	private Double farmer_quantity_6 = null;
	private Double grade_quantity_6_1 = null;
	private Double grade_quantity_6_2 = null;
	private Double grade_quantity_6_3 = null;
	private Double grade_quantity_6_4 = null;
	private Double grade_quantity_6_5 = null;
	private Double grade_quantity_6_6 = null;
	private Double grade_quantity_6_7 = null;
	private Double grade_quantity_6_8 = null;
	private Double grade_quantity_6_9 = null;
	private String farmer7 = null;
	private Double farmer_quantity_7 = null;
	private Double grade_quantity_7_1 = null;
	private Double grade_quantity_7_2 = null;
	private Double grade_quantity_7_3 = null;
	private Double grade_quantity_7_4 = null;
	private Double grade_quantity_7_5 = null;
	private Double grade_quantity_7_6 = null;
	private Double grade_quantity_7_7 = null;
	private Double grade_quantity_7_8 = null;
	private Double grade_quantity_7_9 = null;
	private String farmer8 = null;
	private Double farmer_quantity_8 = null;
	private Double grade_quantity_8_1 = null;
	private Double grade_quantity_8_2 = null;
	private Double grade_quantity_8_3 = null;
	private Double grade_quantity_8_4 = null;
	private Double grade_quantity_8_5 = null;
	private Double grade_quantity_8_6 = null;
	private Double grade_quantity_8_7 = null;
	private Double grade_quantity_8_8 = null;
	private Double grade_quantity_8_9 = null;
	private String farmer9 = null;
	private Double farmer_quantity_9 = null;
	private Double grade_quantity_9_1 = null;
	private Double grade_quantity_9_2 = null;
	private Double grade_quantity_9_3 = null;
	private Double grade_quantity_9_4 = null;
	private Double grade_quantity_9_5 = null;
	private Double grade_quantity_9_6 = null;
	private Double grade_quantity_9_7 = null;
	private Double grade_quantity_9_8 = null;
	private Double grade_quantity_9_9 = null;
	private String farmer10 = null;
	private Double farmer_quantity_10 = null;
	private Double grade_quantity_10_1 = null;
	private Double grade_quantity_10_2 = null;
	private Double grade_quantity_10_3 = null;
	private Double grade_quantity_10_4 = null;
	private Double grade_quantity_10_5 = null;
	private Double grade_quantity_10_6 = null;
	private Double grade_quantity_10_7 = null;
	private Double grade_quantity_10_8 = null;
	private Double grade_quantity_10_9 = null;
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
	public static String FIELD_GRADE_QUANTITY_1_6 = "grade_quantity_1_6";
	public static String FIELD_GRADE_QUANTITY_1_7 = "grade_quantity_1_7";
	public static String FIELD_GRADE_QUANTITY_1_8 = "grade_quantity_1_8";
	public static String FIELD_GRADE_QUANTITY_1_9 = "grade_quantity_1_9";
	public static String FIELD_FARMER2 = "farmer2";
	public static String FIELD_FARMER_QUANTITY_2 = "farmer_quantity_2";
	public static String FIELD_GRADE_QUANTITY_2_1 = "grade_quantity_2_1";
	public static String FIELD_GRADE_QUANTITY_2_2 = "grade_quantity_2_2";
	public static String FIELD_GRADE_QUANTITY_2_3 = "grade_quantity_2_3";
	public static String FIELD_GRADE_QUANTITY_2_4 = "grade_quantity_2_4";
	public static String FIELD_GRADE_QUANTITY_2_5 = "grade_quantity_2_5";
	public static String FIELD_GRADE_QUANTITY_2_6 = "grade_quantity_2_6";
	public static String FIELD_GRADE_QUANTITY_2_7 = "grade_quantity_2_7";
	public static String FIELD_GRADE_QUANTITY_2_8 = "grade_quantity_2_8";
	public static String FIELD_GRADE_QUANTITY_2_9 = "grade_quantity_2_9";
	public static String FIELD_FARMER3 = "farmer3";
	public static String FIELD_FARMER_QUANTITY_3 = "farmer_quantity_3";
	public static String FIELD_GRADE_QUANTITY_3_1 = "grade_quantity_3_1";
	public static String FIELD_GRADE_QUANTITY_3_2 = "grade_quantity_3_2";
	public static String FIELD_GRADE_QUANTITY_3_3 = "grade_quantity_3_3";
	public static String FIELD_GRADE_QUANTITY_3_4 = "grade_quantity_3_4";
	public static String FIELD_GRADE_QUANTITY_3_5 = "grade_quantity_3_5";
	public static String FIELD_GRADE_QUANTITY_3_6 = "grade_quantity_3_6";
	public static String FIELD_GRADE_QUANTITY_3_7 = "grade_quantity_3_7";
	public static String FIELD_GRADE_QUANTITY_3_8 = "grade_quantity_3_8";
	public static String FIELD_GRADE_QUANTITY_3_9 = "grade_quantity_3_9";
	public static String FIELD_FARMER4 = "farmer4";
	public static String FIELD_FARMER_QUANTITY_4 = "farmer_quantity_4";
	public static String FIELD_GRADE_QUANTITY_4_1 = "grade_quantity_4_1";
	public static String FIELD_GRADE_QUANTITY_4_2 = "grade_quantity_4_2";
	public static String FIELD_GRADE_QUANTITY_4_3 = "grade_quantity_4_3";
	public static String FIELD_GRADE_QUANTITY_4_4 = "grade_quantity_4_4";
	public static String FIELD_GRADE_QUANTITY_4_5 = "grade_quantity_4_5";
	public static String FIELD_GRADE_QUANTITY_4_6 = "grade_quantity_4_6";
	public static String FIELD_GRADE_QUANTITY_4_7 = "grade_quantity_4_7";
	public static String FIELD_GRADE_QUANTITY_4_8 = "grade_quantity_4_8";
	public static String FIELD_GRADE_QUANTITY_4_9 = "grade_quantity_4_9";
	public static String FIELD_FARMER5 = "farmer5";
	public static String FIELD_FARMER_QUANTITY_5 = "farmer_quantity_5";
	public static String FIELD_GRADE_QUANTITY_5_1 = "grade_quantity_5_1";
	public static String FIELD_GRADE_QUANTITY_5_2 = "grade_quantity_5_2";
	public static String FIELD_GRADE_QUANTITY_5_3 = "grade_quantity_5_3";
	public static String FIELD_GRADE_QUANTITY_5_4 = "grade_quantity_5_4";
	public static String FIELD_GRADE_QUANTITY_5_5 = "grade_quantity_5_5";
	public static String FIELD_GRADE_QUANTITY_5_6 = "grade_quantity_5_6";
	public static String FIELD_GRADE_QUANTITY_5_7 = "grade_quantity_5_7";
	public static String FIELD_GRADE_QUANTITY_5_8 = "grade_quantity_5_8";
	public static String FIELD_GRADE_QUANTITY_5_9 = "grade_quantity_5_9";
	public static String FIELD_FARMER6 = "farmer6";
	public static String FIELD_FARMER_QUANTITY_6 = "farmer_quantity_6";
	public static String FIELD_GRADE_QUANTITY_6_1 = "grade_quantity_6_1";
	public static String FIELD_GRADE_QUANTITY_6_2 = "grade_quantity_6_2";
	public static String FIELD_GRADE_QUANTITY_6_3 = "grade_quantity_6_3";
	public static String FIELD_GRADE_QUANTITY_6_4 = "grade_quantity_6_4";
	public static String FIELD_GRADE_QUANTITY_6_5 = "grade_quantity_6_5";
	public static String FIELD_GRADE_QUANTITY_6_6 = "grade_quantity_6_6";
	public static String FIELD_GRADE_QUANTITY_6_7 = "grade_quantity_6_7";
	public static String FIELD_GRADE_QUANTITY_6_8 = "grade_quantity_6_8";
	public static String FIELD_GRADE_QUANTITY_6_9 = "grade_quantity_6_9";
	public static String FIELD_FARMER7 = "farmer7";
	public static String FIELD_FARMER_QUANTITY_7 = "farmer_quantity_7";
	public static String FIELD_GRADE_QUANTITY_7_1 = "grade_quantity_7_1";
	public static String FIELD_GRADE_QUANTITY_7_2 = "grade_quantity_7_2";
	public static String FIELD_GRADE_QUANTITY_7_3 = "grade_quantity_7_3";
	public static String FIELD_GRADE_QUANTITY_7_4 = "grade_quantity_7_4";
	public static String FIELD_GRADE_QUANTITY_7_5 = "grade_quantity_7_5";
	public static String FIELD_GRADE_QUANTITY_7_6 = "grade_quantity_7_6";
	public static String FIELD_GRADE_QUANTITY_7_7 = "grade_quantity_7_7";
	public static String FIELD_GRADE_QUANTITY_7_8 = "grade_quantity_7_8";
	public static String FIELD_GRADE_QUANTITY_7_9 = "grade_quantity_7_9";
	public static String FIELD_FARMER8 = "farmer8";
	public static String FIELD_FARMER_QUANTITY_8 = "farmer_quantity_8";
	public static String FIELD_GRADE_QUANTITY_8_1 = "grade_quantity_8_1";
	public static String FIELD_GRADE_QUANTITY_8_2 = "grade_quantity_8_2";
	public static String FIELD_GRADE_QUANTITY_8_3 = "grade_quantity_8_3";
	public static String FIELD_GRADE_QUANTITY_8_4 = "grade_quantity_8_4";
	public static String FIELD_GRADE_QUANTITY_8_5 = "grade_quantity_8_5";
	public static String FIELD_GRADE_QUANTITY_8_6 = "grade_quantity_8_6";
	public static String FIELD_GRADE_QUANTITY_8_7 = "grade_quantity_8_7";
	public static String FIELD_GRADE_QUANTITY_8_8 = "grade_quantity_8_8";
	public static String FIELD_GRADE_QUANTITY_8_9 = "grade_quantity_8_9";
	public static String FIELD_FARMER9 = "farmer9";
	public static String FIELD_FARMER_QUANTITY_9 = "farmer_quantity_9";
	public static String FIELD_GRADE_QUANTITY_9_1 = "grade_quantity_9_1";
	public static String FIELD_GRADE_QUANTITY_9_2 = "grade_quantity_9_2";
	public static String FIELD_GRADE_QUANTITY_9_3 = "grade_quantity_9_3";
	public static String FIELD_GRADE_QUANTITY_9_4 = "grade_quantity_9_4";
	public static String FIELD_GRADE_QUANTITY_9_5 = "grade_quantity_9_5";
	public static String FIELD_GRADE_QUANTITY_9_6 = "grade_quantity_9_6";
	public static String FIELD_GRADE_QUANTITY_9_7 = "grade_quantity_9_7";
	public static String FIELD_GRADE_QUANTITY_9_8 = "grade_quantity_9_8";
	public static String FIELD_GRADE_QUANTITY_9_9 = "grade_quantity_9_9";
	public static String FIELD_FARMER10 = "farmer10";
	public static String FIELD_FARMER_QUANTITY_10 = "farmer_quantity_10";
	public static String FIELD_GRADE_QUANTITY_10_1 = "grade_quantity_10_1";
	public static String FIELD_GRADE_QUANTITY_10_2 = "grade_quantity_10_2";
	public static String FIELD_GRADE_QUANTITY_10_3 = "grade_quantity_10_3";
	public static String FIELD_GRADE_QUANTITY_10_4 = "grade_quantity_10_4";
	public static String FIELD_GRADE_QUANTITY_10_5 = "grade_quantity_10_5";
	public static String FIELD_GRADE_QUANTITY_10_6 = "grade_quantity_10_6";
	public static String FIELD_GRADE_QUANTITY_10_7 = "grade_quantity_10_7";
	public static String FIELD_GRADE_QUANTITY_10_8 = "grade_quantity_10_8";
	public static String FIELD_GRADE_QUANTITY_10_9 = "grade_quantity_10_9";
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

		Field grade_quantity_1_6Field = new Field("grade_quantity_1_6", "double");
		metaData.addField(grade_quantity_1_6Field);

		Field grade_quantity_1_7Field = new Field("grade_quantity_1_7", "double");
		metaData.addField(grade_quantity_1_7Field);

		Field grade_quantity_1_8Field = new Field("grade_quantity_1_8", "double");
		metaData.addField(grade_quantity_1_8Field);

		Field grade_quantity_1_9Field = new Field("grade_quantity_1_9", "double");
		metaData.addField(grade_quantity_1_9Field);

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

		Field grade_quantity_2_6Field = new Field("grade_quantity_2_6", "double");
		metaData.addField(grade_quantity_2_6Field);

		Field grade_quantity_2_7Field = new Field("grade_quantity_2_7", "double");
		metaData.addField(grade_quantity_2_7Field);

		Field grade_quantity_2_8Field = new Field("grade_quantity_2_8", "double");
		metaData.addField(grade_quantity_2_8Field);

		Field grade_quantity_2_9Field = new Field("grade_quantity_2_9", "double");
		metaData.addField(grade_quantity_2_9Field);

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

		Field grade_quantity_3_6Field = new Field("grade_quantity_3_6", "double");
		metaData.addField(grade_quantity_3_6Field);

		Field grade_quantity_3_7Field = new Field("grade_quantity_3_7", "double");
		metaData.addField(grade_quantity_3_7Field);

		Field grade_quantity_3_8Field = new Field("grade_quantity_3_8", "double");
		metaData.addField(grade_quantity_3_8Field);

		Field grade_quantity_3_9Field = new Field("grade_quantity_3_9", "double");
		metaData.addField(grade_quantity_3_9Field);

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

		Field grade_quantity_4_6Field = new Field("grade_quantity_4_6", "double");
		metaData.addField(grade_quantity_4_6Field);

		Field grade_quantity_4_7Field = new Field("grade_quantity_4_7", "double");
		metaData.addField(grade_quantity_4_7Field);

		Field grade_quantity_4_8Field = new Field("grade_quantity_4_8", "double");
		metaData.addField(grade_quantity_4_8Field);

		Field grade_quantity_4_9Field = new Field("grade_quantity_4_9", "double");
		metaData.addField(grade_quantity_4_9Field);

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

		Field grade_quantity_5_6Field = new Field("grade_quantity_5_6", "double");
		metaData.addField(grade_quantity_5_6Field);

		Field grade_quantity_5_7Field = new Field("grade_quantity_5_7", "double");
		metaData.addField(grade_quantity_5_7Field);

		Field grade_quantity_5_8Field = new Field("grade_quantity_5_8", "double");
		metaData.addField(grade_quantity_5_8Field);

		Field grade_quantity_5_9Field = new Field("grade_quantity_5_9", "double");
		metaData.addField(grade_quantity_5_9Field);

		Field farmer6Field = new Field("farmer6", "String");
		farmer6Field.setLength(512);
		metaData.addField(farmer6Field);

		Field farmer_quantity_6Field = new Field("farmer_quantity_6", "double");
		metaData.addField(farmer_quantity_6Field);

		Field grade_quantity_6_1Field = new Field("grade_quantity_6_1", "double");
		metaData.addField(grade_quantity_6_1Field);

		Field grade_quantity_6_2Field = new Field("grade_quantity_6_2", "double");
		metaData.addField(grade_quantity_6_2Field);

		Field grade_quantity_6_3Field = new Field("grade_quantity_6_3", "double");
		metaData.addField(grade_quantity_6_3Field);

		Field grade_quantity_6_4Field = new Field("grade_quantity_6_4", "double");
		metaData.addField(grade_quantity_6_4Field);

		Field grade_quantity_6_5Field = new Field("grade_quantity_6_5", "double");
		metaData.addField(grade_quantity_6_5Field);

		Field grade_quantity_6_6Field = new Field("grade_quantity_6_6", "double");
		metaData.addField(grade_quantity_6_6Field);

		Field grade_quantity_6_7Field = new Field("grade_quantity_6_7", "double");
		metaData.addField(grade_quantity_6_7Field);

		Field grade_quantity_6_8Field = new Field("grade_quantity_6_8", "double");
		metaData.addField(grade_quantity_6_8Field);

		Field grade_quantity_6_9Field = new Field("grade_quantity_6_9", "double");
		metaData.addField(grade_quantity_6_9Field);

		Field farmer7Field = new Field("farmer7", "String");
		farmer7Field.setLength(512);
		metaData.addField(farmer7Field);

		Field farmer_quantity_7Field = new Field("farmer_quantity_7", "double");
		metaData.addField(farmer_quantity_7Field);

		Field grade_quantity_7_1Field = new Field("grade_quantity_7_1", "double");
		metaData.addField(grade_quantity_7_1Field);

		Field grade_quantity_7_2Field = new Field("grade_quantity_7_2", "double");
		metaData.addField(grade_quantity_7_2Field);

		Field grade_quantity_7_3Field = new Field("grade_quantity_7_3", "double");
		metaData.addField(grade_quantity_7_3Field);

		Field grade_quantity_7_4Field = new Field("grade_quantity_7_4", "double");
		metaData.addField(grade_quantity_7_4Field);

		Field grade_quantity_7_5Field = new Field("grade_quantity_7_5", "double");
		metaData.addField(grade_quantity_7_5Field);

		Field grade_quantity_7_6Field = new Field("grade_quantity_7_6", "double");
		metaData.addField(grade_quantity_7_6Field);

		Field grade_quantity_7_7Field = new Field("grade_quantity_7_7", "double");
		metaData.addField(grade_quantity_7_7Field);

		Field grade_quantity_7_8Field = new Field("grade_quantity_7_8", "double");
		metaData.addField(grade_quantity_7_8Field);

		Field grade_quantity_7_9Field = new Field("grade_quantity_7_9", "double");
		metaData.addField(grade_quantity_7_9Field);

		Field farmer8Field = new Field("farmer8", "String");
		farmer8Field.setLength(512);
		metaData.addField(farmer8Field);

		Field farmer_quantity_8Field = new Field("farmer_quantity_8", "double");
		metaData.addField(farmer_quantity_8Field);

		Field grade_quantity_8_1Field = new Field("grade_quantity_8_1", "double");
		metaData.addField(grade_quantity_8_1Field);

		Field grade_quantity_8_2Field = new Field("grade_quantity_8_2", "double");
		metaData.addField(grade_quantity_8_2Field);

		Field grade_quantity_8_3Field = new Field("grade_quantity_8_3", "double");
		metaData.addField(grade_quantity_8_3Field);

		Field grade_quantity_8_4Field = new Field("grade_quantity_8_4", "double");
		metaData.addField(grade_quantity_8_4Field);

		Field grade_quantity_8_5Field = new Field("grade_quantity_8_5", "double");
		metaData.addField(grade_quantity_8_5Field);

		Field grade_quantity_8_6Field = new Field("grade_quantity_8_6", "double");
		metaData.addField(grade_quantity_8_6Field);

		Field grade_quantity_8_7Field = new Field("grade_quantity_8_7", "double");
		metaData.addField(grade_quantity_8_7Field);

		Field grade_quantity_8_8Field = new Field("grade_quantity_8_8", "double");
		metaData.addField(grade_quantity_8_8Field);

		Field grade_quantity_8_9Field = new Field("grade_quantity_8_9", "double");
		metaData.addField(grade_quantity_8_9Field);

		Field farmer9Field = new Field("farmer9", "String");
		farmer9Field.setLength(512);
		metaData.addField(farmer9Field);

		Field farmer_quantity_9Field = new Field("farmer_quantity_9", "double");
		metaData.addField(farmer_quantity_9Field);

		Field grade_quantity_9_1Field = new Field("grade_quantity_9_1", "double");
		metaData.addField(grade_quantity_9_1Field);

		Field grade_quantity_9_2Field = new Field("grade_quantity_9_2", "double");
		metaData.addField(grade_quantity_9_2Field);

		Field grade_quantity_9_3Field = new Field("grade_quantity_9_3", "double");
		metaData.addField(grade_quantity_9_3Field);

		Field grade_quantity_9_4Field = new Field("grade_quantity_9_4", "double");
		metaData.addField(grade_quantity_9_4Field);

		Field grade_quantity_9_5Field = new Field("grade_quantity_9_5", "double");
		metaData.addField(grade_quantity_9_5Field);

		Field grade_quantity_9_6Field = new Field("grade_quantity_9_6", "double");
		metaData.addField(grade_quantity_9_6Field);

		Field grade_quantity_9_7Field = new Field("grade_quantity_9_7", "double");
		metaData.addField(grade_quantity_9_7Field);

		Field grade_quantity_9_8Field = new Field("grade_quantity_9_8", "double");
		metaData.addField(grade_quantity_9_8Field);

		Field grade_quantity_9_9Field = new Field("grade_quantity_9_9", "double");
		metaData.addField(grade_quantity_9_9Field);

		Field farmer10Field = new Field("farmer10", "String");
		farmer10Field.setLength(512);
		metaData.addField(farmer10Field);

		Field farmer_quantity_10Field = new Field("farmer_quantity_10", "double");
		metaData.addField(farmer_quantity_10Field);

		Field grade_quantity_10_1Field = new Field("grade_quantity_10_1", "double");
		metaData.addField(grade_quantity_10_1Field);

		Field grade_quantity_10_2Field = new Field("grade_quantity_10_2", "double");
		metaData.addField(grade_quantity_10_2Field);

		Field grade_quantity_10_3Field = new Field("grade_quantity_10_3", "double");
		metaData.addField(grade_quantity_10_3Field);

		Field grade_quantity_10_4Field = new Field("grade_quantity_10_4", "double");
		metaData.addField(grade_quantity_10_4Field);

		Field grade_quantity_10_5Field = new Field("grade_quantity_10_5", "double");
		metaData.addField(grade_quantity_10_5Field);

		Field grade_quantity_10_6Field = new Field("grade_quantity_10_6", "double");
		metaData.addField(grade_quantity_10_6Field);

		Field grade_quantity_10_7Field = new Field("grade_quantity_10_7", "double");
		metaData.addField(grade_quantity_10_7Field);

		Field grade_quantity_10_8Field = new Field("grade_quantity_10_8", "double");
		metaData.addField(grade_quantity_10_8Field);

		Field grade_quantity_10_9Field = new Field("grade_quantity_10_9", "double");
		metaData.addField(grade_quantity_10_9Field);

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
		this.grade_quantity_1_6 = obj.grade_quantity_1_6;
		this.grade_quantity_1_7 = obj.grade_quantity_1_7;
		this.grade_quantity_1_8 = obj.grade_quantity_1_8;
		this.grade_quantity_1_9 = obj.grade_quantity_1_9;
		this.farmer2 = obj.farmer2;
		this.farmer_quantity_2 = obj.farmer_quantity_2;
		this.grade_quantity_2_1 = obj.grade_quantity_2_1;
		this.grade_quantity_2_2 = obj.grade_quantity_2_2;
		this.grade_quantity_2_3 = obj.grade_quantity_2_3;
		this.grade_quantity_2_4 = obj.grade_quantity_2_4;
		this.grade_quantity_2_5 = obj.grade_quantity_2_5;
		this.grade_quantity_2_6 = obj.grade_quantity_2_6;
		this.grade_quantity_2_7 = obj.grade_quantity_2_7;
		this.grade_quantity_2_8 = obj.grade_quantity_2_8;
		this.grade_quantity_2_9 = obj.grade_quantity_2_9;
		this.farmer3 = obj.farmer3;
		this.farmer_quantity_3 = obj.farmer_quantity_3;
		this.grade_quantity_3_1 = obj.grade_quantity_3_1;
		this.grade_quantity_3_2 = obj.grade_quantity_3_2;
		this.grade_quantity_3_3 = obj.grade_quantity_3_3;
		this.grade_quantity_3_4 = obj.grade_quantity_3_4;
		this.grade_quantity_3_5 = obj.grade_quantity_3_5;
		this.grade_quantity_3_6 = obj.grade_quantity_3_6;
		this.grade_quantity_3_7 = obj.grade_quantity_3_7;
		this.grade_quantity_3_8 = obj.grade_quantity_3_8;
		this.grade_quantity_3_9 = obj.grade_quantity_3_9;
		this.farmer4 = obj.farmer4;
		this.farmer_quantity_4 = obj.farmer_quantity_4;
		this.grade_quantity_4_1 = obj.grade_quantity_4_1;
		this.grade_quantity_4_2 = obj.grade_quantity_4_2;
		this.grade_quantity_4_3 = obj.grade_quantity_4_3;
		this.grade_quantity_4_4 = obj.grade_quantity_4_4;
		this.grade_quantity_4_5 = obj.grade_quantity_4_5;
		this.grade_quantity_4_6 = obj.grade_quantity_4_6;
		this.grade_quantity_4_7 = obj.grade_quantity_4_7;
		this.grade_quantity_4_8 = obj.grade_quantity_4_8;
		this.grade_quantity_4_9 = obj.grade_quantity_4_9;
		this.farmer5 = obj.farmer5;
		this.farmer_quantity_5 = obj.farmer_quantity_5;
		this.grade_quantity_5_1 = obj.grade_quantity_5_1;
		this.grade_quantity_5_2 = obj.grade_quantity_5_2;
		this.grade_quantity_5_3 = obj.grade_quantity_5_3;
		this.grade_quantity_5_4 = obj.grade_quantity_5_4;
		this.grade_quantity_5_5 = obj.grade_quantity_5_5;
		this.grade_quantity_5_6 = obj.grade_quantity_5_6;
		this.grade_quantity_5_7 = obj.grade_quantity_5_7;
		this.grade_quantity_5_8 = obj.grade_quantity_5_8;
		this.grade_quantity_5_9 = obj.grade_quantity_5_9;
		this.farmer6 = obj.farmer6;
		this.farmer_quantity_6 = obj.farmer_quantity_6;
		this.grade_quantity_6_1 = obj.grade_quantity_6_1;
		this.grade_quantity_6_2 = obj.grade_quantity_6_2;
		this.grade_quantity_6_3 = obj.grade_quantity_6_3;
		this.grade_quantity_6_4 = obj.grade_quantity_6_4;
		this.grade_quantity_6_5 = obj.grade_quantity_6_5;
		this.grade_quantity_6_6 = obj.grade_quantity_6_6;
		this.grade_quantity_6_7 = obj.grade_quantity_6_7;
		this.grade_quantity_6_8 = obj.grade_quantity_6_8;
		this.grade_quantity_6_9 = obj.grade_quantity_6_9;
		this.farmer7 = obj.farmer7;
		this.farmer_quantity_7 = obj.farmer_quantity_7;
		this.grade_quantity_7_1 = obj.grade_quantity_7_1;
		this.grade_quantity_7_2 = obj.grade_quantity_7_2;
		this.grade_quantity_7_3 = obj.grade_quantity_7_3;
		this.grade_quantity_7_4 = obj.grade_quantity_7_4;
		this.grade_quantity_7_5 = obj.grade_quantity_7_5;
		this.grade_quantity_7_6 = obj.grade_quantity_7_6;
		this.grade_quantity_7_7 = obj.grade_quantity_7_7;
		this.grade_quantity_7_8 = obj.grade_quantity_7_8;
		this.grade_quantity_7_9 = obj.grade_quantity_7_9;
		this.farmer8 = obj.farmer8;
		this.farmer_quantity_8 = obj.farmer_quantity_8;
		this.grade_quantity_8_1 = obj.grade_quantity_8_1;
		this.grade_quantity_8_2 = obj.grade_quantity_8_2;
		this.grade_quantity_8_3 = obj.grade_quantity_8_3;
		this.grade_quantity_8_4 = obj.grade_quantity_8_4;
		this.grade_quantity_8_5 = obj.grade_quantity_8_5;
		this.grade_quantity_8_6 = obj.grade_quantity_8_6;
		this.grade_quantity_8_7 = obj.grade_quantity_8_7;
		this.grade_quantity_8_8 = obj.grade_quantity_8_8;
		this.grade_quantity_8_9 = obj.grade_quantity_8_9;
		this.farmer9 = obj.farmer9;
		this.farmer_quantity_9 = obj.farmer_quantity_9;
		this.grade_quantity_9_1 = obj.grade_quantity_9_1;
		this.grade_quantity_9_2 = obj.grade_quantity_9_2;
		this.grade_quantity_9_3 = obj.grade_quantity_9_3;
		this.grade_quantity_9_4 = obj.grade_quantity_9_4;
		this.grade_quantity_9_5 = obj.grade_quantity_9_5;
		this.grade_quantity_9_6 = obj.grade_quantity_9_6;
		this.grade_quantity_9_7 = obj.grade_quantity_9_7;
		this.grade_quantity_9_8 = obj.grade_quantity_9_8;
		this.grade_quantity_9_9 = obj.grade_quantity_9_9;
		this.farmer10 = obj.farmer10;
		this.farmer_quantity_10 = obj.farmer_quantity_10;
		this.grade_quantity_10_1 = obj.grade_quantity_10_1;
		this.grade_quantity_10_2 = obj.grade_quantity_10_2;
		this.grade_quantity_10_3 = obj.grade_quantity_10_3;
		this.grade_quantity_10_4 = obj.grade_quantity_10_4;
		this.grade_quantity_10_5 = obj.grade_quantity_10_5;
		this.grade_quantity_10_6 = obj.grade_quantity_10_6;
		this.grade_quantity_10_7 = obj.grade_quantity_10_7;
		this.grade_quantity_10_8 = obj.grade_quantity_10_8;
		this.grade_quantity_10_9 = obj.grade_quantity_10_9;
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
		if(grade_quantity_1_6 != null)
			map.put("grade_quantity_1_6", grade_quantity_1_6);
		if(grade_quantity_1_7 != null)
			map.put("grade_quantity_1_7", grade_quantity_1_7);
		if(grade_quantity_1_8 != null)
			map.put("grade_quantity_1_8", grade_quantity_1_8);
		if(grade_quantity_1_9 != null)
			map.put("grade_quantity_1_9", grade_quantity_1_9);
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
		if(grade_quantity_2_6 != null)
			map.put("grade_quantity_2_6", grade_quantity_2_6);
		if(grade_quantity_2_7 != null)
			map.put("grade_quantity_2_7", grade_quantity_2_7);
		if(grade_quantity_2_8 != null)
			map.put("grade_quantity_2_8", grade_quantity_2_8);
		if(grade_quantity_2_9 != null)
			map.put("grade_quantity_2_9", grade_quantity_2_9);
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
		if(grade_quantity_3_6 != null)
			map.put("grade_quantity_3_6", grade_quantity_3_6);
		if(grade_quantity_3_7 != null)
			map.put("grade_quantity_3_7", grade_quantity_3_7);
		if(grade_quantity_3_8 != null)
			map.put("grade_quantity_3_8", grade_quantity_3_8);
		if(grade_quantity_3_9 != null)
			map.put("grade_quantity_3_9", grade_quantity_3_9);
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
		if(grade_quantity_4_6 != null)
			map.put("grade_quantity_4_6", grade_quantity_4_6);
		if(grade_quantity_4_7 != null)
			map.put("grade_quantity_4_7", grade_quantity_4_7);
		if(grade_quantity_4_8 != null)
			map.put("grade_quantity_4_8", grade_quantity_4_8);
		if(grade_quantity_4_9 != null)
			map.put("grade_quantity_4_9", grade_quantity_4_9);
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
		if(grade_quantity_5_6 != null)
			map.put("grade_quantity_5_6", grade_quantity_5_6);
		if(grade_quantity_5_7 != null)
			map.put("grade_quantity_5_7", grade_quantity_5_7);
		if(grade_quantity_5_8 != null)
			map.put("grade_quantity_5_8", grade_quantity_5_8);
		if(grade_quantity_5_9 != null)
			map.put("grade_quantity_5_9", grade_quantity_5_9);
		if(farmer6 != null)
			map.put("farmer6", farmer6);
		if(farmer_quantity_6 != null)
			map.put("farmer_quantity_6", farmer_quantity_6);
		if(grade_quantity_6_1 != null)
			map.put("grade_quantity_6_1", grade_quantity_6_1);
		if(grade_quantity_6_2 != null)
			map.put("grade_quantity_6_2", grade_quantity_6_2);
		if(grade_quantity_6_3 != null)
			map.put("grade_quantity_6_3", grade_quantity_6_3);
		if(grade_quantity_6_4 != null)
			map.put("grade_quantity_6_4", grade_quantity_6_4);
		if(grade_quantity_6_5 != null)
			map.put("grade_quantity_6_5", grade_quantity_6_5);
		if(grade_quantity_6_6 != null)
			map.put("grade_quantity_6_6", grade_quantity_6_6);
		if(grade_quantity_6_7 != null)
			map.put("grade_quantity_6_7", grade_quantity_6_7);
		if(grade_quantity_6_8 != null)
			map.put("grade_quantity_6_8", grade_quantity_6_8);
		if(grade_quantity_6_9 != null)
			map.put("grade_quantity_6_9", grade_quantity_6_9);
		if(farmer7 != null)
			map.put("farmer7", farmer7);
		if(farmer_quantity_7 != null)
			map.put("farmer_quantity_7", farmer_quantity_7);
		if(grade_quantity_7_1 != null)
			map.put("grade_quantity_7_1", grade_quantity_7_1);
		if(grade_quantity_7_2 != null)
			map.put("grade_quantity_7_2", grade_quantity_7_2);
		if(grade_quantity_7_3 != null)
			map.put("grade_quantity_7_3", grade_quantity_7_3);
		if(grade_quantity_7_4 != null)
			map.put("grade_quantity_7_4", grade_quantity_7_4);
		if(grade_quantity_7_5 != null)
			map.put("grade_quantity_7_5", grade_quantity_7_5);
		if(grade_quantity_7_6 != null)
			map.put("grade_quantity_7_6", grade_quantity_7_6);
		if(grade_quantity_7_7 != null)
			map.put("grade_quantity_7_7", grade_quantity_7_7);
		if(grade_quantity_7_8 != null)
			map.put("grade_quantity_7_8", grade_quantity_7_8);
		if(grade_quantity_7_9 != null)
			map.put("grade_quantity_7_9", grade_quantity_7_9);
		if(farmer8 != null)
			map.put("farmer8", farmer8);
		if(farmer_quantity_8 != null)
			map.put("farmer_quantity_8", farmer_quantity_8);
		if(grade_quantity_8_1 != null)
			map.put("grade_quantity_8_1", grade_quantity_8_1);
		if(grade_quantity_8_2 != null)
			map.put("grade_quantity_8_2", grade_quantity_8_2);
		if(grade_quantity_8_3 != null)
			map.put("grade_quantity_8_3", grade_quantity_8_3);
		if(grade_quantity_8_4 != null)
			map.put("grade_quantity_8_4", grade_quantity_8_4);
		if(grade_quantity_8_5 != null)
			map.put("grade_quantity_8_5", grade_quantity_8_5);
		if(grade_quantity_8_6 != null)
			map.put("grade_quantity_8_6", grade_quantity_8_6);
		if(grade_quantity_8_7 != null)
			map.put("grade_quantity_8_7", grade_quantity_8_7);
		if(grade_quantity_8_8 != null)
			map.put("grade_quantity_8_8", grade_quantity_8_8);
		if(grade_quantity_8_9 != null)
			map.put("grade_quantity_8_9", grade_quantity_8_9);
		if(farmer9 != null)
			map.put("farmer9", farmer9);
		if(farmer_quantity_9 != null)
			map.put("farmer_quantity_9", farmer_quantity_9);
		if(grade_quantity_9_1 != null)
			map.put("grade_quantity_9_1", grade_quantity_9_1);
		if(grade_quantity_9_2 != null)
			map.put("grade_quantity_9_2", grade_quantity_9_2);
		if(grade_quantity_9_3 != null)
			map.put("grade_quantity_9_3", grade_quantity_9_3);
		if(grade_quantity_9_4 != null)
			map.put("grade_quantity_9_4", grade_quantity_9_4);
		if(grade_quantity_9_5 != null)
			map.put("grade_quantity_9_5", grade_quantity_9_5);
		if(grade_quantity_9_6 != null)
			map.put("grade_quantity_9_6", grade_quantity_9_6);
		if(grade_quantity_9_7 != null)
			map.put("grade_quantity_9_7", grade_quantity_9_7);
		if(grade_quantity_9_8 != null)
			map.put("grade_quantity_9_8", grade_quantity_9_8);
		if(grade_quantity_9_9 != null)
			map.put("grade_quantity_9_9", grade_quantity_9_9);
		if(farmer10 != null)
			map.put("farmer10", farmer10);
		if(farmer_quantity_10 != null)
			map.put("farmer_quantity_10", farmer_quantity_10);
		if(grade_quantity_10_1 != null)
			map.put("grade_quantity_10_1", grade_quantity_10_1);
		if(grade_quantity_10_2 != null)
			map.put("grade_quantity_10_2", grade_quantity_10_2);
		if(grade_quantity_10_3 != null)
			map.put("grade_quantity_10_3", grade_quantity_10_3);
		if(grade_quantity_10_4 != null)
			map.put("grade_quantity_10_4", grade_quantity_10_4);
		if(grade_quantity_10_5 != null)
			map.put("grade_quantity_10_5", grade_quantity_10_5);
		if(grade_quantity_10_6 != null)
			map.put("grade_quantity_10_6", grade_quantity_10_6);
		if(grade_quantity_10_7 != null)
			map.put("grade_quantity_10_7", grade_quantity_10_7);
		if(grade_quantity_10_8 != null)
			map.put("grade_quantity_10_8", grade_quantity_10_8);
		if(grade_quantity_10_9 != null)
			map.put("grade_quantity_10_9", grade_quantity_10_9);
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
		if(grade_quantity_1_6 != null)
			map.put("grade_quantity_1_6", grade_quantity_1_6);
		if(grade_quantity_1_7 != null)
			map.put("grade_quantity_1_7", grade_quantity_1_7);
		if(grade_quantity_1_8 != null)
			map.put("grade_quantity_1_8", grade_quantity_1_8);
		if(grade_quantity_1_9 != null)
			map.put("grade_quantity_1_9", grade_quantity_1_9);
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
		if(grade_quantity_2_6 != null)
			map.put("grade_quantity_2_6", grade_quantity_2_6);
		if(grade_quantity_2_7 != null)
			map.put("grade_quantity_2_7", grade_quantity_2_7);
		if(grade_quantity_2_8 != null)
			map.put("grade_quantity_2_8", grade_quantity_2_8);
		if(grade_quantity_2_9 != null)
			map.put("grade_quantity_2_9", grade_quantity_2_9);
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
		if(grade_quantity_3_6 != null)
			map.put("grade_quantity_3_6", grade_quantity_3_6);
		if(grade_quantity_3_7 != null)
			map.put("grade_quantity_3_7", grade_quantity_3_7);
		if(grade_quantity_3_8 != null)
			map.put("grade_quantity_3_8", grade_quantity_3_8);
		if(grade_quantity_3_9 != null)
			map.put("grade_quantity_3_9", grade_quantity_3_9);
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
		if(grade_quantity_4_6 != null)
			map.put("grade_quantity_4_6", grade_quantity_4_6);
		if(grade_quantity_4_7 != null)
			map.put("grade_quantity_4_7", grade_quantity_4_7);
		if(grade_quantity_4_8 != null)
			map.put("grade_quantity_4_8", grade_quantity_4_8);
		if(grade_quantity_4_9 != null)
			map.put("grade_quantity_4_9", grade_quantity_4_9);
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
		if(grade_quantity_5_6 != null)
			map.put("grade_quantity_5_6", grade_quantity_5_6);
		if(grade_quantity_5_7 != null)
			map.put("grade_quantity_5_7", grade_quantity_5_7);
		if(grade_quantity_5_8 != null)
			map.put("grade_quantity_5_8", grade_quantity_5_8);
		if(grade_quantity_5_9 != null)
			map.put("grade_quantity_5_9", grade_quantity_5_9);
		if(farmer6 != null)
			map.put("farmer6", farmer6);
		if(farmer_quantity_6 != null)
			map.put("farmer_quantity_6", farmer_quantity_6);
		if(grade_quantity_6_1 != null)
			map.put("grade_quantity_6_1", grade_quantity_6_1);
		if(grade_quantity_6_2 != null)
			map.put("grade_quantity_6_2", grade_quantity_6_2);
		if(grade_quantity_6_3 != null)
			map.put("grade_quantity_6_3", grade_quantity_6_3);
		if(grade_quantity_6_4 != null)
			map.put("grade_quantity_6_4", grade_quantity_6_4);
		if(grade_quantity_6_5 != null)
			map.put("grade_quantity_6_5", grade_quantity_6_5);
		if(grade_quantity_6_6 != null)
			map.put("grade_quantity_6_6", grade_quantity_6_6);
		if(grade_quantity_6_7 != null)
			map.put("grade_quantity_6_7", grade_quantity_6_7);
		if(grade_quantity_6_8 != null)
			map.put("grade_quantity_6_8", grade_quantity_6_8);
		if(grade_quantity_6_9 != null)
			map.put("grade_quantity_6_9", grade_quantity_6_9);
		if(farmer7 != null)
			map.put("farmer7", farmer7);
		if(farmer_quantity_7 != null)
			map.put("farmer_quantity_7", farmer_quantity_7);
		if(grade_quantity_7_1 != null)
			map.put("grade_quantity_7_1", grade_quantity_7_1);
		if(grade_quantity_7_2 != null)
			map.put("grade_quantity_7_2", grade_quantity_7_2);
		if(grade_quantity_7_3 != null)
			map.put("grade_quantity_7_3", grade_quantity_7_3);
		if(grade_quantity_7_4 != null)
			map.put("grade_quantity_7_4", grade_quantity_7_4);
		if(grade_quantity_7_5 != null)
			map.put("grade_quantity_7_5", grade_quantity_7_5);
		if(grade_quantity_7_6 != null)
			map.put("grade_quantity_7_6", grade_quantity_7_6);
		if(grade_quantity_7_7 != null)
			map.put("grade_quantity_7_7", grade_quantity_7_7);
		if(grade_quantity_7_8 != null)
			map.put("grade_quantity_7_8", grade_quantity_7_8);
		if(grade_quantity_7_9 != null)
			map.put("grade_quantity_7_9", grade_quantity_7_9);
		if(farmer8 != null)
			map.put("farmer8", farmer8);
		if(farmer_quantity_8 != null)
			map.put("farmer_quantity_8", farmer_quantity_8);
		if(grade_quantity_8_1 != null)
			map.put("grade_quantity_8_1", grade_quantity_8_1);
		if(grade_quantity_8_2 != null)
			map.put("grade_quantity_8_2", grade_quantity_8_2);
		if(grade_quantity_8_3 != null)
			map.put("grade_quantity_8_3", grade_quantity_8_3);
		if(grade_quantity_8_4 != null)
			map.put("grade_quantity_8_4", grade_quantity_8_4);
		if(grade_quantity_8_5 != null)
			map.put("grade_quantity_8_5", grade_quantity_8_5);
		if(grade_quantity_8_6 != null)
			map.put("grade_quantity_8_6", grade_quantity_8_6);
		if(grade_quantity_8_7 != null)
			map.put("grade_quantity_8_7", grade_quantity_8_7);
		if(grade_quantity_8_8 != null)
			map.put("grade_quantity_8_8", grade_quantity_8_8);
		if(grade_quantity_8_9 != null)
			map.put("grade_quantity_8_9", grade_quantity_8_9);
		if(farmer9 != null)
			map.put("farmer9", farmer9);
		if(farmer_quantity_9 != null)
			map.put("farmer_quantity_9", farmer_quantity_9);
		if(grade_quantity_9_1 != null)
			map.put("grade_quantity_9_1", grade_quantity_9_1);
		if(grade_quantity_9_2 != null)
			map.put("grade_quantity_9_2", grade_quantity_9_2);
		if(grade_quantity_9_3 != null)
			map.put("grade_quantity_9_3", grade_quantity_9_3);
		if(grade_quantity_9_4 != null)
			map.put("grade_quantity_9_4", grade_quantity_9_4);
		if(grade_quantity_9_5 != null)
			map.put("grade_quantity_9_5", grade_quantity_9_5);
		if(grade_quantity_9_6 != null)
			map.put("grade_quantity_9_6", grade_quantity_9_6);
		if(grade_quantity_9_7 != null)
			map.put("grade_quantity_9_7", grade_quantity_9_7);
		if(grade_quantity_9_8 != null)
			map.put("grade_quantity_9_8", grade_quantity_9_8);
		if(grade_quantity_9_9 != null)
			map.put("grade_quantity_9_9", grade_quantity_9_9);
		if(farmer10 != null)
			map.put("farmer10", farmer10);
		if(farmer_quantity_10 != null)
			map.put("farmer_quantity_10", farmer_quantity_10);
		if(grade_quantity_10_1 != null)
			map.put("grade_quantity_10_1", grade_quantity_10_1);
		if(grade_quantity_10_2 != null)
			map.put("grade_quantity_10_2", grade_quantity_10_2);
		if(grade_quantity_10_3 != null)
			map.put("grade_quantity_10_3", grade_quantity_10_3);
		if(grade_quantity_10_4 != null)
			map.put("grade_quantity_10_4", grade_quantity_10_4);
		if(grade_quantity_10_5 != null)
			map.put("grade_quantity_10_5", grade_quantity_10_5);
		if(grade_quantity_10_6 != null)
			map.put("grade_quantity_10_6", grade_quantity_10_6);
		if(grade_quantity_10_7 != null)
			map.put("grade_quantity_10_7", grade_quantity_10_7);
		if(grade_quantity_10_8 != null)
			map.put("grade_quantity_10_8", grade_quantity_10_8);
		if(grade_quantity_10_9 != null)
			map.put("grade_quantity_10_9", grade_quantity_10_9);
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
		grade_quantity_1_6 = (Double) map.get("grade_quantity_1_6");
		grade_quantity_1_7 = (Double) map.get("grade_quantity_1_7");
		grade_quantity_1_8 = (Double) map.get("grade_quantity_1_8");
		grade_quantity_1_9 = (Double) map.get("grade_quantity_1_9");
		farmer2 = (String) map.get("farmer2");
		farmer_quantity_2 = (Double) map.get("farmer_quantity_2");
		grade_quantity_2_1 = (Double) map.get("grade_quantity_2_1");
		grade_quantity_2_2 = (Double) map.get("grade_quantity_2_2");
		grade_quantity_2_3 = (Double) map.get("grade_quantity_2_3");
		grade_quantity_2_4 = (Double) map.get("grade_quantity_2_4");
		grade_quantity_2_5 = (Double) map.get("grade_quantity_2_5");
		grade_quantity_2_6 = (Double) map.get("grade_quantity_2_6");
		grade_quantity_2_7 = (Double) map.get("grade_quantity_2_7");
		grade_quantity_2_8 = (Double) map.get("grade_quantity_2_8");
		grade_quantity_2_9 = (Double) map.get("grade_quantity_2_9");
		farmer3 = (String) map.get("farmer3");
		farmer_quantity_3 = (Double) map.get("farmer_quantity_3");
		grade_quantity_3_1 = (Double) map.get("grade_quantity_3_1");
		grade_quantity_3_2 = (Double) map.get("grade_quantity_3_2");
		grade_quantity_3_3 = (Double) map.get("grade_quantity_3_3");
		grade_quantity_3_4 = (Double) map.get("grade_quantity_3_4");
		grade_quantity_3_5 = (Double) map.get("grade_quantity_3_5");
		grade_quantity_3_6 = (Double) map.get("grade_quantity_3_6");
		grade_quantity_3_7 = (Double) map.get("grade_quantity_3_7");
		grade_quantity_3_8 = (Double) map.get("grade_quantity_3_8");
		grade_quantity_3_9 = (Double) map.get("grade_quantity_3_9");
		farmer4 = (String) map.get("farmer4");
		farmer_quantity_4 = (Double) map.get("farmer_quantity_4");
		grade_quantity_4_1 = (Double) map.get("grade_quantity_4_1");
		grade_quantity_4_2 = (Double) map.get("grade_quantity_4_2");
		grade_quantity_4_3 = (Double) map.get("grade_quantity_4_3");
		grade_quantity_4_4 = (Double) map.get("grade_quantity_4_4");
		grade_quantity_4_5 = (Double) map.get("grade_quantity_4_5");
		grade_quantity_4_6 = (Double) map.get("grade_quantity_4_6");
		grade_quantity_4_7 = (Double) map.get("grade_quantity_4_7");
		grade_quantity_4_8 = (Double) map.get("grade_quantity_4_8");
		grade_quantity_4_9 = (Double) map.get("grade_quantity_4_9");
		farmer5 = (String) map.get("farmer5");
		farmer_quantity_5 = (Double) map.get("farmer_quantity_5");
		grade_quantity_5_1 = (Double) map.get("grade_quantity_5_1");
		grade_quantity_5_2 = (Double) map.get("grade_quantity_5_2");
		grade_quantity_5_3 = (Double) map.get("grade_quantity_5_3");
		grade_quantity_5_4 = (Double) map.get("grade_quantity_5_4");
		grade_quantity_5_5 = (Double) map.get("grade_quantity_5_5");
		grade_quantity_5_6 = (Double) map.get("grade_quantity_5_6");
		grade_quantity_5_7 = (Double) map.get("grade_quantity_5_7");
		grade_quantity_5_8 = (Double) map.get("grade_quantity_5_8");
		grade_quantity_5_9 = (Double) map.get("grade_quantity_5_9");
		farmer6 = (String) map.get("farmer6");
		farmer_quantity_6 = (Double) map.get("farmer_quantity_6");
		grade_quantity_6_1 = (Double) map.get("grade_quantity_6_1");
		grade_quantity_6_2 = (Double) map.get("grade_quantity_6_2");
		grade_quantity_6_3 = (Double) map.get("grade_quantity_6_3");
		grade_quantity_6_4 = (Double) map.get("grade_quantity_6_4");
		grade_quantity_6_5 = (Double) map.get("grade_quantity_6_5");
		grade_quantity_6_6 = (Double) map.get("grade_quantity_6_6");
		grade_quantity_6_7 = (Double) map.get("grade_quantity_6_7");
		grade_quantity_6_8 = (Double) map.get("grade_quantity_6_8");
		grade_quantity_6_9 = (Double) map.get("grade_quantity_6_9");
		farmer7 = (String) map.get("farmer7");
		farmer_quantity_7 = (Double) map.get("farmer_quantity_7");
		grade_quantity_7_1 = (Double) map.get("grade_quantity_7_1");
		grade_quantity_7_2 = (Double) map.get("grade_quantity_7_2");
		grade_quantity_7_3 = (Double) map.get("grade_quantity_7_3");
		grade_quantity_7_4 = (Double) map.get("grade_quantity_7_4");
		grade_quantity_7_5 = (Double) map.get("grade_quantity_7_5");
		grade_quantity_7_6 = (Double) map.get("grade_quantity_7_6");
		grade_quantity_7_7 = (Double) map.get("grade_quantity_7_7");
		grade_quantity_7_8 = (Double) map.get("grade_quantity_7_8");
		grade_quantity_7_9 = (Double) map.get("grade_quantity_7_9");
		farmer8 = (String) map.get("farmer8");
		farmer_quantity_8 = (Double) map.get("farmer_quantity_8");
		grade_quantity_8_1 = (Double) map.get("grade_quantity_8_1");
		grade_quantity_8_2 = (Double) map.get("grade_quantity_8_2");
		grade_quantity_8_3 = (Double) map.get("grade_quantity_8_3");
		grade_quantity_8_4 = (Double) map.get("grade_quantity_8_4");
		grade_quantity_8_5 = (Double) map.get("grade_quantity_8_5");
		grade_quantity_8_6 = (Double) map.get("grade_quantity_8_6");
		grade_quantity_8_7 = (Double) map.get("grade_quantity_8_7");
		grade_quantity_8_8 = (Double) map.get("grade_quantity_8_8");
		grade_quantity_8_9 = (Double) map.get("grade_quantity_8_9");
		farmer9 = (String) map.get("farmer9");
		farmer_quantity_9 = (Double) map.get("farmer_quantity_9");
		grade_quantity_9_1 = (Double) map.get("grade_quantity_9_1");
		grade_quantity_9_2 = (Double) map.get("grade_quantity_9_2");
		grade_quantity_9_3 = (Double) map.get("grade_quantity_9_3");
		grade_quantity_9_4 = (Double) map.get("grade_quantity_9_4");
		grade_quantity_9_5 = (Double) map.get("grade_quantity_9_5");
		grade_quantity_9_6 = (Double) map.get("grade_quantity_9_6");
		grade_quantity_9_7 = (Double) map.get("grade_quantity_9_7");
		grade_quantity_9_8 = (Double) map.get("grade_quantity_9_8");
		grade_quantity_9_9 = (Double) map.get("grade_quantity_9_9");
		farmer10 = (String) map.get("farmer10");
		farmer_quantity_10 = (Double) map.get("farmer_quantity_10");
		grade_quantity_10_1 = (Double) map.get("grade_quantity_10_1");
		grade_quantity_10_2 = (Double) map.get("grade_quantity_10_2");
		grade_quantity_10_3 = (Double) map.get("grade_quantity_10_3");
		grade_quantity_10_4 = (Double) map.get("grade_quantity_10_4");
		grade_quantity_10_5 = (Double) map.get("grade_quantity_10_5");
		grade_quantity_10_6 = (Double) map.get("grade_quantity_10_6");
		grade_quantity_10_7 = (Double) map.get("grade_quantity_10_7");
		grade_quantity_10_8 = (Double) map.get("grade_quantity_10_8");
		grade_quantity_10_9 = (Double) map.get("grade_quantity_10_9");
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

		Object grade_quantity_1_6Obj = map.get("grade_quantity_1_6");
		if(grade_quantity_1_6Obj != null)
			grade_quantity_1_6 = new Double(grade_quantity_1_6Obj.toString());

		Object grade_quantity_1_7Obj = map.get("grade_quantity_1_7");
		if(grade_quantity_1_7Obj != null)
			grade_quantity_1_7 = new Double(grade_quantity_1_7Obj.toString());

		Object grade_quantity_1_8Obj = map.get("grade_quantity_1_8");
		if(grade_quantity_1_8Obj != null)
			grade_quantity_1_8 = new Double(grade_quantity_1_8Obj.toString());

		Object grade_quantity_1_9Obj = map.get("grade_quantity_1_9");
		if(grade_quantity_1_9Obj != null)
			grade_quantity_1_9 = new Double(grade_quantity_1_9Obj.toString());

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

		Object grade_quantity_2_6Obj = map.get("grade_quantity_2_6");
		if(grade_quantity_2_6Obj != null)
			grade_quantity_2_6 = new Double(grade_quantity_2_6Obj.toString());

		Object grade_quantity_2_7Obj = map.get("grade_quantity_2_7");
		if(grade_quantity_2_7Obj != null)
			grade_quantity_2_7 = new Double(grade_quantity_2_7Obj.toString());

		Object grade_quantity_2_8Obj = map.get("grade_quantity_2_8");
		if(grade_quantity_2_8Obj != null)
			grade_quantity_2_8 = new Double(grade_quantity_2_8Obj.toString());

		Object grade_quantity_2_9Obj = map.get("grade_quantity_2_9");
		if(grade_quantity_2_9Obj != null)
			grade_quantity_2_9 = new Double(grade_quantity_2_9Obj.toString());

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

		Object grade_quantity_3_6Obj = map.get("grade_quantity_3_6");
		if(grade_quantity_3_6Obj != null)
			grade_quantity_3_6 = new Double(grade_quantity_3_6Obj.toString());

		Object grade_quantity_3_7Obj = map.get("grade_quantity_3_7");
		if(grade_quantity_3_7Obj != null)
			grade_quantity_3_7 = new Double(grade_quantity_3_7Obj.toString());

		Object grade_quantity_3_8Obj = map.get("grade_quantity_3_8");
		if(grade_quantity_3_8Obj != null)
			grade_quantity_3_8 = new Double(grade_quantity_3_8Obj.toString());

		Object grade_quantity_3_9Obj = map.get("grade_quantity_3_9");
		if(grade_quantity_3_9Obj != null)
			grade_quantity_3_9 = new Double(grade_quantity_3_9Obj.toString());

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

		Object grade_quantity_4_6Obj = map.get("grade_quantity_4_6");
		if(grade_quantity_4_6Obj != null)
			grade_quantity_4_6 = new Double(grade_quantity_4_6Obj.toString());

		Object grade_quantity_4_7Obj = map.get("grade_quantity_4_7");
		if(grade_quantity_4_7Obj != null)
			grade_quantity_4_7 = new Double(grade_quantity_4_7Obj.toString());

		Object grade_quantity_4_8Obj = map.get("grade_quantity_4_8");
		if(grade_quantity_4_8Obj != null)
			grade_quantity_4_8 = new Double(grade_quantity_4_8Obj.toString());

		Object grade_quantity_4_9Obj = map.get("grade_quantity_4_9");
		if(grade_quantity_4_9Obj != null)
			grade_quantity_4_9 = new Double(grade_quantity_4_9Obj.toString());

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

		Object grade_quantity_5_6Obj = map.get("grade_quantity_5_6");
		if(grade_quantity_5_6Obj != null)
			grade_quantity_5_6 = new Double(grade_quantity_5_6Obj.toString());

		Object grade_quantity_5_7Obj = map.get("grade_quantity_5_7");
		if(grade_quantity_5_7Obj != null)
			grade_quantity_5_7 = new Double(grade_quantity_5_7Obj.toString());

		Object grade_quantity_5_8Obj = map.get("grade_quantity_5_8");
		if(grade_quantity_5_8Obj != null)
			grade_quantity_5_8 = new Double(grade_quantity_5_8Obj.toString());

		Object grade_quantity_5_9Obj = map.get("grade_quantity_5_9");
		if(grade_quantity_5_9Obj != null)
			grade_quantity_5_9 = new Double(grade_quantity_5_9Obj.toString());

		Object farmer6Obj = map.get("farmer6");
		if(farmer6Obj != null)
			farmer6 = farmer6Obj.toString();

		Object farmer_quantity_6Obj = map.get("farmer_quantity_6");
		if(farmer_quantity_6Obj != null)
			farmer_quantity_6 = new Double(farmer_quantity_6Obj.toString());

		Object grade_quantity_6_1Obj = map.get("grade_quantity_6_1");
		if(grade_quantity_6_1Obj != null)
			grade_quantity_6_1 = new Double(grade_quantity_6_1Obj.toString());

		Object grade_quantity_6_2Obj = map.get("grade_quantity_6_2");
		if(grade_quantity_6_2Obj != null)
			grade_quantity_6_2 = new Double(grade_quantity_6_2Obj.toString());

		Object grade_quantity_6_3Obj = map.get("grade_quantity_6_3");
		if(grade_quantity_6_3Obj != null)
			grade_quantity_6_3 = new Double(grade_quantity_6_3Obj.toString());

		Object grade_quantity_6_4Obj = map.get("grade_quantity_6_4");
		if(grade_quantity_6_4Obj != null)
			grade_quantity_6_4 = new Double(grade_quantity_6_4Obj.toString());

		Object grade_quantity_6_5Obj = map.get("grade_quantity_6_5");
		if(grade_quantity_6_5Obj != null)
			grade_quantity_6_5 = new Double(grade_quantity_6_5Obj.toString());

		Object grade_quantity_6_6Obj = map.get("grade_quantity_6_6");
		if(grade_quantity_6_6Obj != null)
			grade_quantity_6_6 = new Double(grade_quantity_6_6Obj.toString());

		Object grade_quantity_6_7Obj = map.get("grade_quantity_6_7");
		if(grade_quantity_6_7Obj != null)
			grade_quantity_6_7 = new Double(grade_quantity_6_7Obj.toString());

		Object grade_quantity_6_8Obj = map.get("grade_quantity_6_8");
		if(grade_quantity_6_8Obj != null)
			grade_quantity_6_8 = new Double(grade_quantity_6_8Obj.toString());

		Object grade_quantity_6_9Obj = map.get("grade_quantity_6_9");
		if(grade_quantity_6_9Obj != null)
			grade_quantity_6_9 = new Double(grade_quantity_6_9Obj.toString());

		Object farmer7Obj = map.get("farmer7");
		if(farmer7Obj != null)
			farmer7 = farmer7Obj.toString();

		Object farmer_quantity_7Obj = map.get("farmer_quantity_7");
		if(farmer_quantity_7Obj != null)
			farmer_quantity_7 = new Double(farmer_quantity_7Obj.toString());

		Object grade_quantity_7_1Obj = map.get("grade_quantity_7_1");
		if(grade_quantity_7_1Obj != null)
			grade_quantity_7_1 = new Double(grade_quantity_7_1Obj.toString());

		Object grade_quantity_7_2Obj = map.get("grade_quantity_7_2");
		if(grade_quantity_7_2Obj != null)
			grade_quantity_7_2 = new Double(grade_quantity_7_2Obj.toString());

		Object grade_quantity_7_3Obj = map.get("grade_quantity_7_3");
		if(grade_quantity_7_3Obj != null)
			grade_quantity_7_3 = new Double(grade_quantity_7_3Obj.toString());

		Object grade_quantity_7_4Obj = map.get("grade_quantity_7_4");
		if(grade_quantity_7_4Obj != null)
			grade_quantity_7_4 = new Double(grade_quantity_7_4Obj.toString());

		Object grade_quantity_7_5Obj = map.get("grade_quantity_7_5");
		if(grade_quantity_7_5Obj != null)
			grade_quantity_7_5 = new Double(grade_quantity_7_5Obj.toString());

		Object grade_quantity_7_6Obj = map.get("grade_quantity_7_6");
		if(grade_quantity_7_6Obj != null)
			grade_quantity_7_6 = new Double(grade_quantity_7_6Obj.toString());

		Object grade_quantity_7_7Obj = map.get("grade_quantity_7_7");
		if(grade_quantity_7_7Obj != null)
			grade_quantity_7_7 = new Double(grade_quantity_7_7Obj.toString());

		Object grade_quantity_7_8Obj = map.get("grade_quantity_7_8");
		if(grade_quantity_7_8Obj != null)
			grade_quantity_7_8 = new Double(grade_quantity_7_8Obj.toString());

		Object grade_quantity_7_9Obj = map.get("grade_quantity_7_9");
		if(grade_quantity_7_9Obj != null)
			grade_quantity_7_9 = new Double(grade_quantity_7_9Obj.toString());

		Object farmer8Obj = map.get("farmer8");
		if(farmer8Obj != null)
			farmer8 = farmer8Obj.toString();

		Object farmer_quantity_8Obj = map.get("farmer_quantity_8");
		if(farmer_quantity_8Obj != null)
			farmer_quantity_8 = new Double(farmer_quantity_8Obj.toString());

		Object grade_quantity_8_1Obj = map.get("grade_quantity_8_1");
		if(grade_quantity_8_1Obj != null)
			grade_quantity_8_1 = new Double(grade_quantity_8_1Obj.toString());

		Object grade_quantity_8_2Obj = map.get("grade_quantity_8_2");
		if(grade_quantity_8_2Obj != null)
			grade_quantity_8_2 = new Double(grade_quantity_8_2Obj.toString());

		Object grade_quantity_8_3Obj = map.get("grade_quantity_8_3");
		if(grade_quantity_8_3Obj != null)
			grade_quantity_8_3 = new Double(grade_quantity_8_3Obj.toString());

		Object grade_quantity_8_4Obj = map.get("grade_quantity_8_4");
		if(grade_quantity_8_4Obj != null)
			grade_quantity_8_4 = new Double(grade_quantity_8_4Obj.toString());

		Object grade_quantity_8_5Obj = map.get("grade_quantity_8_5");
		if(grade_quantity_8_5Obj != null)
			grade_quantity_8_5 = new Double(grade_quantity_8_5Obj.toString());

		Object grade_quantity_8_6Obj = map.get("grade_quantity_8_6");
		if(grade_quantity_8_6Obj != null)
			grade_quantity_8_6 = new Double(grade_quantity_8_6Obj.toString());

		Object grade_quantity_8_7Obj = map.get("grade_quantity_8_7");
		if(grade_quantity_8_7Obj != null)
			grade_quantity_8_7 = new Double(grade_quantity_8_7Obj.toString());

		Object grade_quantity_8_8Obj = map.get("grade_quantity_8_8");
		if(grade_quantity_8_8Obj != null)
			grade_quantity_8_8 = new Double(grade_quantity_8_8Obj.toString());

		Object grade_quantity_8_9Obj = map.get("grade_quantity_8_9");
		if(grade_quantity_8_9Obj != null)
			grade_quantity_8_9 = new Double(grade_quantity_8_9Obj.toString());

		Object farmer9Obj = map.get("farmer9");
		if(farmer9Obj != null)
			farmer9 = farmer9Obj.toString();

		Object farmer_quantity_9Obj = map.get("farmer_quantity_9");
		if(farmer_quantity_9Obj != null)
			farmer_quantity_9 = new Double(farmer_quantity_9Obj.toString());

		Object grade_quantity_9_1Obj = map.get("grade_quantity_9_1");
		if(grade_quantity_9_1Obj != null)
			grade_quantity_9_1 = new Double(grade_quantity_9_1Obj.toString());

		Object grade_quantity_9_2Obj = map.get("grade_quantity_9_2");
		if(grade_quantity_9_2Obj != null)
			grade_quantity_9_2 = new Double(grade_quantity_9_2Obj.toString());

		Object grade_quantity_9_3Obj = map.get("grade_quantity_9_3");
		if(grade_quantity_9_3Obj != null)
			grade_quantity_9_3 = new Double(grade_quantity_9_3Obj.toString());

		Object grade_quantity_9_4Obj = map.get("grade_quantity_9_4");
		if(grade_quantity_9_4Obj != null)
			grade_quantity_9_4 = new Double(grade_quantity_9_4Obj.toString());

		Object grade_quantity_9_5Obj = map.get("grade_quantity_9_5");
		if(grade_quantity_9_5Obj != null)
			grade_quantity_9_5 = new Double(grade_quantity_9_5Obj.toString());

		Object grade_quantity_9_6Obj = map.get("grade_quantity_9_6");
		if(grade_quantity_9_6Obj != null)
			grade_quantity_9_6 = new Double(grade_quantity_9_6Obj.toString());

		Object grade_quantity_9_7Obj = map.get("grade_quantity_9_7");
		if(grade_quantity_9_7Obj != null)
			grade_quantity_9_7 = new Double(grade_quantity_9_7Obj.toString());

		Object grade_quantity_9_8Obj = map.get("grade_quantity_9_8");
		if(grade_quantity_9_8Obj != null)
			grade_quantity_9_8 = new Double(grade_quantity_9_8Obj.toString());

		Object grade_quantity_9_9Obj = map.get("grade_quantity_9_9");
		if(grade_quantity_9_9Obj != null)
			grade_quantity_9_9 = new Double(grade_quantity_9_9Obj.toString());

		Object farmer10Obj = map.get("farmer10");
		if(farmer10Obj != null)
			farmer10 = farmer10Obj.toString();

		Object farmer_quantity_10Obj = map.get("farmer_quantity_10");
		if(farmer_quantity_10Obj != null)
			farmer_quantity_10 = new Double(farmer_quantity_10Obj.toString());

		Object grade_quantity_10_1Obj = map.get("grade_quantity_10_1");
		if(grade_quantity_10_1Obj != null)
			grade_quantity_10_1 = new Double(grade_quantity_10_1Obj.toString());

		Object grade_quantity_10_2Obj = map.get("grade_quantity_10_2");
		if(grade_quantity_10_2Obj != null)
			grade_quantity_10_2 = new Double(grade_quantity_10_2Obj.toString());

		Object grade_quantity_10_3Obj = map.get("grade_quantity_10_3");
		if(grade_quantity_10_3Obj != null)
			grade_quantity_10_3 = new Double(grade_quantity_10_3Obj.toString());

		Object grade_quantity_10_4Obj = map.get("grade_quantity_10_4");
		if(grade_quantity_10_4Obj != null)
			grade_quantity_10_4 = new Double(grade_quantity_10_4Obj.toString());

		Object grade_quantity_10_5Obj = map.get("grade_quantity_10_5");
		if(grade_quantity_10_5Obj != null)
			grade_quantity_10_5 = new Double(grade_quantity_10_5Obj.toString());

		Object grade_quantity_10_6Obj = map.get("grade_quantity_10_6");
		if(grade_quantity_10_6Obj != null)
			grade_quantity_10_6 = new Double(grade_quantity_10_6Obj.toString());

		Object grade_quantity_10_7Obj = map.get("grade_quantity_10_7");
		if(grade_quantity_10_7Obj != null)
			grade_quantity_10_7 = new Double(grade_quantity_10_7Obj.toString());

		Object grade_quantity_10_8Obj = map.get("grade_quantity_10_8");
		if(grade_quantity_10_8Obj != null)
			grade_quantity_10_8 = new Double(grade_quantity_10_8Obj.toString());

		Object grade_quantity_10_9Obj = map.get("grade_quantity_10_9");
		if(grade_quantity_10_9Obj != null)
			grade_quantity_10_9 = new Double(grade_quantity_10_9Obj.toString());

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

	public Double getGrade_quantity_1_6() {
		return grade_quantity_1_6;
	}

	public double getGrade_quantity_1_6Ex() {
		return grade_quantity_1_6 != null ? grade_quantity_1_6 : 0;
	}

	public void setGrade_quantity_1_6(double grade_quantity_1_6) {
		this.grade_quantity_1_6 = grade_quantity_1_6;
	}

	public void setGrade_quantity_1_6(Double grade_quantity_1_6) {
		this.grade_quantity_1_6 = grade_quantity_1_6;
	}

	public void unSetGrade_quantity_1_6() {
		this.grade_quantity_1_6 = null;
	}

	public Double getGrade_quantity_1_7() {
		return grade_quantity_1_7;
	}

	public double getGrade_quantity_1_7Ex() {
		return grade_quantity_1_7 != null ? grade_quantity_1_7 : 0;
	}

	public void setGrade_quantity_1_7(double grade_quantity_1_7) {
		this.grade_quantity_1_7 = grade_quantity_1_7;
	}

	public void setGrade_quantity_1_7(Double grade_quantity_1_7) {
		this.grade_quantity_1_7 = grade_quantity_1_7;
	}

	public void unSetGrade_quantity_1_7() {
		this.grade_quantity_1_7 = null;
	}

	public Double getGrade_quantity_1_8() {
		return grade_quantity_1_8;
	}

	public double getGrade_quantity_1_8Ex() {
		return grade_quantity_1_8 != null ? grade_quantity_1_8 : 0;
	}

	public void setGrade_quantity_1_8(double grade_quantity_1_8) {
		this.grade_quantity_1_8 = grade_quantity_1_8;
	}

	public void setGrade_quantity_1_8(Double grade_quantity_1_8) {
		this.grade_quantity_1_8 = grade_quantity_1_8;
	}

	public void unSetGrade_quantity_1_8() {
		this.grade_quantity_1_8 = null;
	}

	public Double getGrade_quantity_1_9() {
		return grade_quantity_1_9;
	}

	public double getGrade_quantity_1_9Ex() {
		return grade_quantity_1_9 != null ? grade_quantity_1_9 : 0;
	}

	public void setGrade_quantity_1_9(double grade_quantity_1_9) {
		this.grade_quantity_1_9 = grade_quantity_1_9;
	}

	public void setGrade_quantity_1_9(Double grade_quantity_1_9) {
		this.grade_quantity_1_9 = grade_quantity_1_9;
	}

	public void unSetGrade_quantity_1_9() {
		this.grade_quantity_1_9 = null;
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

	public Double getGrade_quantity_2_6() {
		return grade_quantity_2_6;
	}

	public double getGrade_quantity_2_6Ex() {
		return grade_quantity_2_6 != null ? grade_quantity_2_6 : 0;
	}

	public void setGrade_quantity_2_6(double grade_quantity_2_6) {
		this.grade_quantity_2_6 = grade_quantity_2_6;
	}

	public void setGrade_quantity_2_6(Double grade_quantity_2_6) {
		this.grade_quantity_2_6 = grade_quantity_2_6;
	}

	public void unSetGrade_quantity_2_6() {
		this.grade_quantity_2_6 = null;
	}

	public Double getGrade_quantity_2_7() {
		return grade_quantity_2_7;
	}

	public double getGrade_quantity_2_7Ex() {
		return grade_quantity_2_7 != null ? grade_quantity_2_7 : 0;
	}

	public void setGrade_quantity_2_7(double grade_quantity_2_7) {
		this.grade_quantity_2_7 = grade_quantity_2_7;
	}

	public void setGrade_quantity_2_7(Double grade_quantity_2_7) {
		this.grade_quantity_2_7 = grade_quantity_2_7;
	}

	public void unSetGrade_quantity_2_7() {
		this.grade_quantity_2_7 = null;
	}

	public Double getGrade_quantity_2_8() {
		return grade_quantity_2_8;
	}

	public double getGrade_quantity_2_8Ex() {
		return grade_quantity_2_8 != null ? grade_quantity_2_8 : 0;
	}

	public void setGrade_quantity_2_8(double grade_quantity_2_8) {
		this.grade_quantity_2_8 = grade_quantity_2_8;
	}

	public void setGrade_quantity_2_8(Double grade_quantity_2_8) {
		this.grade_quantity_2_8 = grade_quantity_2_8;
	}

	public void unSetGrade_quantity_2_8() {
		this.grade_quantity_2_8 = null;
	}

	public Double getGrade_quantity_2_9() {
		return grade_quantity_2_9;
	}

	public double getGrade_quantity_2_9Ex() {
		return grade_quantity_2_9 != null ? grade_quantity_2_9 : 0;
	}

	public void setGrade_quantity_2_9(double grade_quantity_2_9) {
		this.grade_quantity_2_9 = grade_quantity_2_9;
	}

	public void setGrade_quantity_2_9(Double grade_quantity_2_9) {
		this.grade_quantity_2_9 = grade_quantity_2_9;
	}

	public void unSetGrade_quantity_2_9() {
		this.grade_quantity_2_9 = null;
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

	public Double getGrade_quantity_3_6() {
		return grade_quantity_3_6;
	}

	public double getGrade_quantity_3_6Ex() {
		return grade_quantity_3_6 != null ? grade_quantity_3_6 : 0;
	}

	public void setGrade_quantity_3_6(double grade_quantity_3_6) {
		this.grade_quantity_3_6 = grade_quantity_3_6;
	}

	public void setGrade_quantity_3_6(Double grade_quantity_3_6) {
		this.grade_quantity_3_6 = grade_quantity_3_6;
	}

	public void unSetGrade_quantity_3_6() {
		this.grade_quantity_3_6 = null;
	}

	public Double getGrade_quantity_3_7() {
		return grade_quantity_3_7;
	}

	public double getGrade_quantity_3_7Ex() {
		return grade_quantity_3_7 != null ? grade_quantity_3_7 : 0;
	}

	public void setGrade_quantity_3_7(double grade_quantity_3_7) {
		this.grade_quantity_3_7 = grade_quantity_3_7;
	}

	public void setGrade_quantity_3_7(Double grade_quantity_3_7) {
		this.grade_quantity_3_7 = grade_quantity_3_7;
	}

	public void unSetGrade_quantity_3_7() {
		this.grade_quantity_3_7 = null;
	}

	public Double getGrade_quantity_3_8() {
		return grade_quantity_3_8;
	}

	public double getGrade_quantity_3_8Ex() {
		return grade_quantity_3_8 != null ? grade_quantity_3_8 : 0;
	}

	public void setGrade_quantity_3_8(double grade_quantity_3_8) {
		this.grade_quantity_3_8 = grade_quantity_3_8;
	}

	public void setGrade_quantity_3_8(Double grade_quantity_3_8) {
		this.grade_quantity_3_8 = grade_quantity_3_8;
	}

	public void unSetGrade_quantity_3_8() {
		this.grade_quantity_3_8 = null;
	}

	public Double getGrade_quantity_3_9() {
		return grade_quantity_3_9;
	}

	public double getGrade_quantity_3_9Ex() {
		return grade_quantity_3_9 != null ? grade_quantity_3_9 : 0;
	}

	public void setGrade_quantity_3_9(double grade_quantity_3_9) {
		this.grade_quantity_3_9 = grade_quantity_3_9;
	}

	public void setGrade_quantity_3_9(Double grade_quantity_3_9) {
		this.grade_quantity_3_9 = grade_quantity_3_9;
	}

	public void unSetGrade_quantity_3_9() {
		this.grade_quantity_3_9 = null;
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

	public Double getGrade_quantity_4_6() {
		return grade_quantity_4_6;
	}

	public double getGrade_quantity_4_6Ex() {
		return grade_quantity_4_6 != null ? grade_quantity_4_6 : 0;
	}

	public void setGrade_quantity_4_6(double grade_quantity_4_6) {
		this.grade_quantity_4_6 = grade_quantity_4_6;
	}

	public void setGrade_quantity_4_6(Double grade_quantity_4_6) {
		this.grade_quantity_4_6 = grade_quantity_4_6;
	}

	public void unSetGrade_quantity_4_6() {
		this.grade_quantity_4_6 = null;
	}

	public Double getGrade_quantity_4_7() {
		return grade_quantity_4_7;
	}

	public double getGrade_quantity_4_7Ex() {
		return grade_quantity_4_7 != null ? grade_quantity_4_7 : 0;
	}

	public void setGrade_quantity_4_7(double grade_quantity_4_7) {
		this.grade_quantity_4_7 = grade_quantity_4_7;
	}

	public void setGrade_quantity_4_7(Double grade_quantity_4_7) {
		this.grade_quantity_4_7 = grade_quantity_4_7;
	}

	public void unSetGrade_quantity_4_7() {
		this.grade_quantity_4_7 = null;
	}

	public Double getGrade_quantity_4_8() {
		return grade_quantity_4_8;
	}

	public double getGrade_quantity_4_8Ex() {
		return grade_quantity_4_8 != null ? grade_quantity_4_8 : 0;
	}

	public void setGrade_quantity_4_8(double grade_quantity_4_8) {
		this.grade_quantity_4_8 = grade_quantity_4_8;
	}

	public void setGrade_quantity_4_8(Double grade_quantity_4_8) {
		this.grade_quantity_4_8 = grade_quantity_4_8;
	}

	public void unSetGrade_quantity_4_8() {
		this.grade_quantity_4_8 = null;
	}

	public Double getGrade_quantity_4_9() {
		return grade_quantity_4_9;
	}

	public double getGrade_quantity_4_9Ex() {
		return grade_quantity_4_9 != null ? grade_quantity_4_9 : 0;
	}

	public void setGrade_quantity_4_9(double grade_quantity_4_9) {
		this.grade_quantity_4_9 = grade_quantity_4_9;
	}

	public void setGrade_quantity_4_9(Double grade_quantity_4_9) {
		this.grade_quantity_4_9 = grade_quantity_4_9;
	}

	public void unSetGrade_quantity_4_9() {
		this.grade_quantity_4_9 = null;
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

	public Double getGrade_quantity_5_6() {
		return grade_quantity_5_6;
	}

	public double getGrade_quantity_5_6Ex() {
		return grade_quantity_5_6 != null ? grade_quantity_5_6 : 0;
	}

	public void setGrade_quantity_5_6(double grade_quantity_5_6) {
		this.grade_quantity_5_6 = grade_quantity_5_6;
	}

	public void setGrade_quantity_5_6(Double grade_quantity_5_6) {
		this.grade_quantity_5_6 = grade_quantity_5_6;
	}

	public void unSetGrade_quantity_5_6() {
		this.grade_quantity_5_6 = null;
	}

	public Double getGrade_quantity_5_7() {
		return grade_quantity_5_7;
	}

	public double getGrade_quantity_5_7Ex() {
		return grade_quantity_5_7 != null ? grade_quantity_5_7 : 0;
	}

	public void setGrade_quantity_5_7(double grade_quantity_5_7) {
		this.grade_quantity_5_7 = grade_quantity_5_7;
	}

	public void setGrade_quantity_5_7(Double grade_quantity_5_7) {
		this.grade_quantity_5_7 = grade_quantity_5_7;
	}

	public void unSetGrade_quantity_5_7() {
		this.grade_quantity_5_7 = null;
	}

	public Double getGrade_quantity_5_8() {
		return grade_quantity_5_8;
	}

	public double getGrade_quantity_5_8Ex() {
		return grade_quantity_5_8 != null ? grade_quantity_5_8 : 0;
	}

	public void setGrade_quantity_5_8(double grade_quantity_5_8) {
		this.grade_quantity_5_8 = grade_quantity_5_8;
	}

	public void setGrade_quantity_5_8(Double grade_quantity_5_8) {
		this.grade_quantity_5_8 = grade_quantity_5_8;
	}

	public void unSetGrade_quantity_5_8() {
		this.grade_quantity_5_8 = null;
	}

	public Double getGrade_quantity_5_9() {
		return grade_quantity_5_9;
	}

	public double getGrade_quantity_5_9Ex() {
		return grade_quantity_5_9 != null ? grade_quantity_5_9 : 0;
	}

	public void setGrade_quantity_5_9(double grade_quantity_5_9) {
		this.grade_quantity_5_9 = grade_quantity_5_9;
	}

	public void setGrade_quantity_5_9(Double grade_quantity_5_9) {
		this.grade_quantity_5_9 = grade_quantity_5_9;
	}

	public void unSetGrade_quantity_5_9() {
		this.grade_quantity_5_9 = null;
	}

	public String getFarmer6() {
		return farmer6;
	}

	public String getFarmer6Ex() {
		return farmer6 != null ? farmer6 : "";
	}

	public void setFarmer6(String farmer6) {
		this.farmer6 = farmer6;
	}

	public void unSetFarmer6() {
		this.farmer6 = null;
	}

	public Double getFarmer_quantity_6() {
		return farmer_quantity_6;
	}

	public double getFarmer_quantity_6Ex() {
		return farmer_quantity_6 != null ? farmer_quantity_6 : 0;
	}

	public void setFarmer_quantity_6(double farmer_quantity_6) {
		this.farmer_quantity_6 = farmer_quantity_6;
	}

	public void setFarmer_quantity_6(Double farmer_quantity_6) {
		this.farmer_quantity_6 = farmer_quantity_6;
	}

	public void unSetFarmer_quantity_6() {
		this.farmer_quantity_6 = null;
	}

	public Double getGrade_quantity_6_1() {
		return grade_quantity_6_1;
	}

	public double getGrade_quantity_6_1Ex() {
		return grade_quantity_6_1 != null ? grade_quantity_6_1 : 0;
	}

	public void setGrade_quantity_6_1(double grade_quantity_6_1) {
		this.grade_quantity_6_1 = grade_quantity_6_1;
	}

	public void setGrade_quantity_6_1(Double grade_quantity_6_1) {
		this.grade_quantity_6_1 = grade_quantity_6_1;
	}

	public void unSetGrade_quantity_6_1() {
		this.grade_quantity_6_1 = null;
	}

	public Double getGrade_quantity_6_2() {
		return grade_quantity_6_2;
	}

	public double getGrade_quantity_6_2Ex() {
		return grade_quantity_6_2 != null ? grade_quantity_6_2 : 0;
	}

	public void setGrade_quantity_6_2(double grade_quantity_6_2) {
		this.grade_quantity_6_2 = grade_quantity_6_2;
	}

	public void setGrade_quantity_6_2(Double grade_quantity_6_2) {
		this.grade_quantity_6_2 = grade_quantity_6_2;
	}

	public void unSetGrade_quantity_6_2() {
		this.grade_quantity_6_2 = null;
	}

	public Double getGrade_quantity_6_3() {
		return grade_quantity_6_3;
	}

	public double getGrade_quantity_6_3Ex() {
		return grade_quantity_6_3 != null ? grade_quantity_6_3 : 0;
	}

	public void setGrade_quantity_6_3(double grade_quantity_6_3) {
		this.grade_quantity_6_3 = grade_quantity_6_3;
	}

	public void setGrade_quantity_6_3(Double grade_quantity_6_3) {
		this.grade_quantity_6_3 = grade_quantity_6_3;
	}

	public void unSetGrade_quantity_6_3() {
		this.grade_quantity_6_3 = null;
	}

	public Double getGrade_quantity_6_4() {
		return grade_quantity_6_4;
	}

	public double getGrade_quantity_6_4Ex() {
		return grade_quantity_6_4 != null ? grade_quantity_6_4 : 0;
	}

	public void setGrade_quantity_6_4(double grade_quantity_6_4) {
		this.grade_quantity_6_4 = grade_quantity_6_4;
	}

	public void setGrade_quantity_6_4(Double grade_quantity_6_4) {
		this.grade_quantity_6_4 = grade_quantity_6_4;
	}

	public void unSetGrade_quantity_6_4() {
		this.grade_quantity_6_4 = null;
	}

	public Double getGrade_quantity_6_5() {
		return grade_quantity_6_5;
	}

	public double getGrade_quantity_6_5Ex() {
		return grade_quantity_6_5 != null ? grade_quantity_6_5 : 0;
	}

	public void setGrade_quantity_6_5(double grade_quantity_6_5) {
		this.grade_quantity_6_5 = grade_quantity_6_5;
	}

	public void setGrade_quantity_6_5(Double grade_quantity_6_5) {
		this.grade_quantity_6_5 = grade_quantity_6_5;
	}

	public void unSetGrade_quantity_6_5() {
		this.grade_quantity_6_5 = null;
	}

	public Double getGrade_quantity_6_6() {
		return grade_quantity_6_6;
	}

	public double getGrade_quantity_6_6Ex() {
		return grade_quantity_6_6 != null ? grade_quantity_6_6 : 0;
	}

	public void setGrade_quantity_6_6(double grade_quantity_6_6) {
		this.grade_quantity_6_6 = grade_quantity_6_6;
	}

	public void setGrade_quantity_6_6(Double grade_quantity_6_6) {
		this.grade_quantity_6_6 = grade_quantity_6_6;
	}

	public void unSetGrade_quantity_6_6() {
		this.grade_quantity_6_6 = null;
	}

	public Double getGrade_quantity_6_7() {
		return grade_quantity_6_7;
	}

	public double getGrade_quantity_6_7Ex() {
		return grade_quantity_6_7 != null ? grade_quantity_6_7 : 0;
	}

	public void setGrade_quantity_6_7(double grade_quantity_6_7) {
		this.grade_quantity_6_7 = grade_quantity_6_7;
	}

	public void setGrade_quantity_6_7(Double grade_quantity_6_7) {
		this.grade_quantity_6_7 = grade_quantity_6_7;
	}

	public void unSetGrade_quantity_6_7() {
		this.grade_quantity_6_7 = null;
	}

	public Double getGrade_quantity_6_8() {
		return grade_quantity_6_8;
	}

	public double getGrade_quantity_6_8Ex() {
		return grade_quantity_6_8 != null ? grade_quantity_6_8 : 0;
	}

	public void setGrade_quantity_6_8(double grade_quantity_6_8) {
		this.grade_quantity_6_8 = grade_quantity_6_8;
	}

	public void setGrade_quantity_6_8(Double grade_quantity_6_8) {
		this.grade_quantity_6_8 = grade_quantity_6_8;
	}

	public void unSetGrade_quantity_6_8() {
		this.grade_quantity_6_8 = null;
	}

	public Double getGrade_quantity_6_9() {
		return grade_quantity_6_9;
	}

	public double getGrade_quantity_6_9Ex() {
		return grade_quantity_6_9 != null ? grade_quantity_6_9 : 0;
	}

	public void setGrade_quantity_6_9(double grade_quantity_6_9) {
		this.grade_quantity_6_9 = grade_quantity_6_9;
	}

	public void setGrade_quantity_6_9(Double grade_quantity_6_9) {
		this.grade_quantity_6_9 = grade_quantity_6_9;
	}

	public void unSetGrade_quantity_6_9() {
		this.grade_quantity_6_9 = null;
	}

	public String getFarmer7() {
		return farmer7;
	}

	public String getFarmer7Ex() {
		return farmer7 != null ? farmer7 : "";
	}

	public void setFarmer7(String farmer7) {
		this.farmer7 = farmer7;
	}

	public void unSetFarmer7() {
		this.farmer7 = null;
	}

	public Double getFarmer_quantity_7() {
		return farmer_quantity_7;
	}

	public double getFarmer_quantity_7Ex() {
		return farmer_quantity_7 != null ? farmer_quantity_7 : 0;
	}

	public void setFarmer_quantity_7(double farmer_quantity_7) {
		this.farmer_quantity_7 = farmer_quantity_7;
	}

	public void setFarmer_quantity_7(Double farmer_quantity_7) {
		this.farmer_quantity_7 = farmer_quantity_7;
	}

	public void unSetFarmer_quantity_7() {
		this.farmer_quantity_7 = null;
	}

	public Double getGrade_quantity_7_1() {
		return grade_quantity_7_1;
	}

	public double getGrade_quantity_7_1Ex() {
		return grade_quantity_7_1 != null ? grade_quantity_7_1 : 0;
	}

	public void setGrade_quantity_7_1(double grade_quantity_7_1) {
		this.grade_quantity_7_1 = grade_quantity_7_1;
	}

	public void setGrade_quantity_7_1(Double grade_quantity_7_1) {
		this.grade_quantity_7_1 = grade_quantity_7_1;
	}

	public void unSetGrade_quantity_7_1() {
		this.grade_quantity_7_1 = null;
	}

	public Double getGrade_quantity_7_2() {
		return grade_quantity_7_2;
	}

	public double getGrade_quantity_7_2Ex() {
		return grade_quantity_7_2 != null ? grade_quantity_7_2 : 0;
	}

	public void setGrade_quantity_7_2(double grade_quantity_7_2) {
		this.grade_quantity_7_2 = grade_quantity_7_2;
	}

	public void setGrade_quantity_7_2(Double grade_quantity_7_2) {
		this.grade_quantity_7_2 = grade_quantity_7_2;
	}

	public void unSetGrade_quantity_7_2() {
		this.grade_quantity_7_2 = null;
	}

	public Double getGrade_quantity_7_3() {
		return grade_quantity_7_3;
	}

	public double getGrade_quantity_7_3Ex() {
		return grade_quantity_7_3 != null ? grade_quantity_7_3 : 0;
	}

	public void setGrade_quantity_7_3(double grade_quantity_7_3) {
		this.grade_quantity_7_3 = grade_quantity_7_3;
	}

	public void setGrade_quantity_7_3(Double grade_quantity_7_3) {
		this.grade_quantity_7_3 = grade_quantity_7_3;
	}

	public void unSetGrade_quantity_7_3() {
		this.grade_quantity_7_3 = null;
	}

	public Double getGrade_quantity_7_4() {
		return grade_quantity_7_4;
	}

	public double getGrade_quantity_7_4Ex() {
		return grade_quantity_7_4 != null ? grade_quantity_7_4 : 0;
	}

	public void setGrade_quantity_7_4(double grade_quantity_7_4) {
		this.grade_quantity_7_4 = grade_quantity_7_4;
	}

	public void setGrade_quantity_7_4(Double grade_quantity_7_4) {
		this.grade_quantity_7_4 = grade_quantity_7_4;
	}

	public void unSetGrade_quantity_7_4() {
		this.grade_quantity_7_4 = null;
	}

	public Double getGrade_quantity_7_5() {
		return grade_quantity_7_5;
	}

	public double getGrade_quantity_7_5Ex() {
		return grade_quantity_7_5 != null ? grade_quantity_7_5 : 0;
	}

	public void setGrade_quantity_7_5(double grade_quantity_7_5) {
		this.grade_quantity_7_5 = grade_quantity_7_5;
	}

	public void setGrade_quantity_7_5(Double grade_quantity_7_5) {
		this.grade_quantity_7_5 = grade_quantity_7_5;
	}

	public void unSetGrade_quantity_7_5() {
		this.grade_quantity_7_5 = null;
	}

	public Double getGrade_quantity_7_6() {
		return grade_quantity_7_6;
	}

	public double getGrade_quantity_7_6Ex() {
		return grade_quantity_7_6 != null ? grade_quantity_7_6 : 0;
	}

	public void setGrade_quantity_7_6(double grade_quantity_7_6) {
		this.grade_quantity_7_6 = grade_quantity_7_6;
	}

	public void setGrade_quantity_7_6(Double grade_quantity_7_6) {
		this.grade_quantity_7_6 = grade_quantity_7_6;
	}

	public void unSetGrade_quantity_7_6() {
		this.grade_quantity_7_6 = null;
	}

	public Double getGrade_quantity_7_7() {
		return grade_quantity_7_7;
	}

	public double getGrade_quantity_7_7Ex() {
		return grade_quantity_7_7 != null ? grade_quantity_7_7 : 0;
	}

	public void setGrade_quantity_7_7(double grade_quantity_7_7) {
		this.grade_quantity_7_7 = grade_quantity_7_7;
	}

	public void setGrade_quantity_7_7(Double grade_quantity_7_7) {
		this.grade_quantity_7_7 = grade_quantity_7_7;
	}

	public void unSetGrade_quantity_7_7() {
		this.grade_quantity_7_7 = null;
	}

	public Double getGrade_quantity_7_8() {
		return grade_quantity_7_8;
	}

	public double getGrade_quantity_7_8Ex() {
		return grade_quantity_7_8 != null ? grade_quantity_7_8 : 0;
	}

	public void setGrade_quantity_7_8(double grade_quantity_7_8) {
		this.grade_quantity_7_8 = grade_quantity_7_8;
	}

	public void setGrade_quantity_7_8(Double grade_quantity_7_8) {
		this.grade_quantity_7_8 = grade_quantity_7_8;
	}

	public void unSetGrade_quantity_7_8() {
		this.grade_quantity_7_8 = null;
	}

	public Double getGrade_quantity_7_9() {
		return grade_quantity_7_9;
	}

	public double getGrade_quantity_7_9Ex() {
		return grade_quantity_7_9 != null ? grade_quantity_7_9 : 0;
	}

	public void setGrade_quantity_7_9(double grade_quantity_7_9) {
		this.grade_quantity_7_9 = grade_quantity_7_9;
	}

	public void setGrade_quantity_7_9(Double grade_quantity_7_9) {
		this.grade_quantity_7_9 = grade_quantity_7_9;
	}

	public void unSetGrade_quantity_7_9() {
		this.grade_quantity_7_9 = null;
	}

	public String getFarmer8() {
		return farmer8;
	}

	public String getFarmer8Ex() {
		return farmer8 != null ? farmer8 : "";
	}

	public void setFarmer8(String farmer8) {
		this.farmer8 = farmer8;
	}

	public void unSetFarmer8() {
		this.farmer8 = null;
	}

	public Double getFarmer_quantity_8() {
		return farmer_quantity_8;
	}

	public double getFarmer_quantity_8Ex() {
		return farmer_quantity_8 != null ? farmer_quantity_8 : 0;
	}

	public void setFarmer_quantity_8(double farmer_quantity_8) {
		this.farmer_quantity_8 = farmer_quantity_8;
	}

	public void setFarmer_quantity_8(Double farmer_quantity_8) {
		this.farmer_quantity_8 = farmer_quantity_8;
	}

	public void unSetFarmer_quantity_8() {
		this.farmer_quantity_8 = null;
	}

	public Double getGrade_quantity_8_1() {
		return grade_quantity_8_1;
	}

	public double getGrade_quantity_8_1Ex() {
		return grade_quantity_8_1 != null ? grade_quantity_8_1 : 0;
	}

	public void setGrade_quantity_8_1(double grade_quantity_8_1) {
		this.grade_quantity_8_1 = grade_quantity_8_1;
	}

	public void setGrade_quantity_8_1(Double grade_quantity_8_1) {
		this.grade_quantity_8_1 = grade_quantity_8_1;
	}

	public void unSetGrade_quantity_8_1() {
		this.grade_quantity_8_1 = null;
	}

	public Double getGrade_quantity_8_2() {
		return grade_quantity_8_2;
	}

	public double getGrade_quantity_8_2Ex() {
		return grade_quantity_8_2 != null ? grade_quantity_8_2 : 0;
	}

	public void setGrade_quantity_8_2(double grade_quantity_8_2) {
		this.grade_quantity_8_2 = grade_quantity_8_2;
	}

	public void setGrade_quantity_8_2(Double grade_quantity_8_2) {
		this.grade_quantity_8_2 = grade_quantity_8_2;
	}

	public void unSetGrade_quantity_8_2() {
		this.grade_quantity_8_2 = null;
	}

	public Double getGrade_quantity_8_3() {
		return grade_quantity_8_3;
	}

	public double getGrade_quantity_8_3Ex() {
		return grade_quantity_8_3 != null ? grade_quantity_8_3 : 0;
	}

	public void setGrade_quantity_8_3(double grade_quantity_8_3) {
		this.grade_quantity_8_3 = grade_quantity_8_3;
	}

	public void setGrade_quantity_8_3(Double grade_quantity_8_3) {
		this.grade_quantity_8_3 = grade_quantity_8_3;
	}

	public void unSetGrade_quantity_8_3() {
		this.grade_quantity_8_3 = null;
	}

	public Double getGrade_quantity_8_4() {
		return grade_quantity_8_4;
	}

	public double getGrade_quantity_8_4Ex() {
		return grade_quantity_8_4 != null ? grade_quantity_8_4 : 0;
	}

	public void setGrade_quantity_8_4(double grade_quantity_8_4) {
		this.grade_quantity_8_4 = grade_quantity_8_4;
	}

	public void setGrade_quantity_8_4(Double grade_quantity_8_4) {
		this.grade_quantity_8_4 = grade_quantity_8_4;
	}

	public void unSetGrade_quantity_8_4() {
		this.grade_quantity_8_4 = null;
	}

	public Double getGrade_quantity_8_5() {
		return grade_quantity_8_5;
	}

	public double getGrade_quantity_8_5Ex() {
		return grade_quantity_8_5 != null ? grade_quantity_8_5 : 0;
	}

	public void setGrade_quantity_8_5(double grade_quantity_8_5) {
		this.grade_quantity_8_5 = grade_quantity_8_5;
	}

	public void setGrade_quantity_8_5(Double grade_quantity_8_5) {
		this.grade_quantity_8_5 = grade_quantity_8_5;
	}

	public void unSetGrade_quantity_8_5() {
		this.grade_quantity_8_5 = null;
	}

	public Double getGrade_quantity_8_6() {
		return grade_quantity_8_6;
	}

	public double getGrade_quantity_8_6Ex() {
		return grade_quantity_8_6 != null ? grade_quantity_8_6 : 0;
	}

	public void setGrade_quantity_8_6(double grade_quantity_8_6) {
		this.grade_quantity_8_6 = grade_quantity_8_6;
	}

	public void setGrade_quantity_8_6(Double grade_quantity_8_6) {
		this.grade_quantity_8_6 = grade_quantity_8_6;
	}

	public void unSetGrade_quantity_8_6() {
		this.grade_quantity_8_6 = null;
	}

	public Double getGrade_quantity_8_7() {
		return grade_quantity_8_7;
	}

	public double getGrade_quantity_8_7Ex() {
		return grade_quantity_8_7 != null ? grade_quantity_8_7 : 0;
	}

	public void setGrade_quantity_8_7(double grade_quantity_8_7) {
		this.grade_quantity_8_7 = grade_quantity_8_7;
	}

	public void setGrade_quantity_8_7(Double grade_quantity_8_7) {
		this.grade_quantity_8_7 = grade_quantity_8_7;
	}

	public void unSetGrade_quantity_8_7() {
		this.grade_quantity_8_7 = null;
	}

	public Double getGrade_quantity_8_8() {
		return grade_quantity_8_8;
	}

	public double getGrade_quantity_8_8Ex() {
		return grade_quantity_8_8 != null ? grade_quantity_8_8 : 0;
	}

	public void setGrade_quantity_8_8(double grade_quantity_8_8) {
		this.grade_quantity_8_8 = grade_quantity_8_8;
	}

	public void setGrade_quantity_8_8(Double grade_quantity_8_8) {
		this.grade_quantity_8_8 = grade_quantity_8_8;
	}

	public void unSetGrade_quantity_8_8() {
		this.grade_quantity_8_8 = null;
	}

	public Double getGrade_quantity_8_9() {
		return grade_quantity_8_9;
	}

	public double getGrade_quantity_8_9Ex() {
		return grade_quantity_8_9 != null ? grade_quantity_8_9 : 0;
	}

	public void setGrade_quantity_8_9(double grade_quantity_8_9) {
		this.grade_quantity_8_9 = grade_quantity_8_9;
	}

	public void setGrade_quantity_8_9(Double grade_quantity_8_9) {
		this.grade_quantity_8_9 = grade_quantity_8_9;
	}

	public void unSetGrade_quantity_8_9() {
		this.grade_quantity_8_9 = null;
	}

	public String getFarmer9() {
		return farmer9;
	}

	public String getFarmer9Ex() {
		return farmer9 != null ? farmer9 : "";
	}

	public void setFarmer9(String farmer9) {
		this.farmer9 = farmer9;
	}

	public void unSetFarmer9() {
		this.farmer9 = null;
	}

	public Double getFarmer_quantity_9() {
		return farmer_quantity_9;
	}

	public double getFarmer_quantity_9Ex() {
		return farmer_quantity_9 != null ? farmer_quantity_9 : 0;
	}

	public void setFarmer_quantity_9(double farmer_quantity_9) {
		this.farmer_quantity_9 = farmer_quantity_9;
	}

	public void setFarmer_quantity_9(Double farmer_quantity_9) {
		this.farmer_quantity_9 = farmer_quantity_9;
	}

	public void unSetFarmer_quantity_9() {
		this.farmer_quantity_9 = null;
	}

	public Double getGrade_quantity_9_1() {
		return grade_quantity_9_1;
	}

	public double getGrade_quantity_9_1Ex() {
		return grade_quantity_9_1 != null ? grade_quantity_9_1 : 0;
	}

	public void setGrade_quantity_9_1(double grade_quantity_9_1) {
		this.grade_quantity_9_1 = grade_quantity_9_1;
	}

	public void setGrade_quantity_9_1(Double grade_quantity_9_1) {
		this.grade_quantity_9_1 = grade_quantity_9_1;
	}

	public void unSetGrade_quantity_9_1() {
		this.grade_quantity_9_1 = null;
	}

	public Double getGrade_quantity_9_2() {
		return grade_quantity_9_2;
	}

	public double getGrade_quantity_9_2Ex() {
		return grade_quantity_9_2 != null ? grade_quantity_9_2 : 0;
	}

	public void setGrade_quantity_9_2(double grade_quantity_9_2) {
		this.grade_quantity_9_2 = grade_quantity_9_2;
	}

	public void setGrade_quantity_9_2(Double grade_quantity_9_2) {
		this.grade_quantity_9_2 = grade_quantity_9_2;
	}

	public void unSetGrade_quantity_9_2() {
		this.grade_quantity_9_2 = null;
	}

	public Double getGrade_quantity_9_3() {
		return grade_quantity_9_3;
	}

	public double getGrade_quantity_9_3Ex() {
		return grade_quantity_9_3 != null ? grade_quantity_9_3 : 0;
	}

	public void setGrade_quantity_9_3(double grade_quantity_9_3) {
		this.grade_quantity_9_3 = grade_quantity_9_3;
	}

	public void setGrade_quantity_9_3(Double grade_quantity_9_3) {
		this.grade_quantity_9_3 = grade_quantity_9_3;
	}

	public void unSetGrade_quantity_9_3() {
		this.grade_quantity_9_3 = null;
	}

	public Double getGrade_quantity_9_4() {
		return grade_quantity_9_4;
	}

	public double getGrade_quantity_9_4Ex() {
		return grade_quantity_9_4 != null ? grade_quantity_9_4 : 0;
	}

	public void setGrade_quantity_9_4(double grade_quantity_9_4) {
		this.grade_quantity_9_4 = grade_quantity_9_4;
	}

	public void setGrade_quantity_9_4(Double grade_quantity_9_4) {
		this.grade_quantity_9_4 = grade_quantity_9_4;
	}

	public void unSetGrade_quantity_9_4() {
		this.grade_quantity_9_4 = null;
	}

	public Double getGrade_quantity_9_5() {
		return grade_quantity_9_5;
	}

	public double getGrade_quantity_9_5Ex() {
		return grade_quantity_9_5 != null ? grade_quantity_9_5 : 0;
	}

	public void setGrade_quantity_9_5(double grade_quantity_9_5) {
		this.grade_quantity_9_5 = grade_quantity_9_5;
	}

	public void setGrade_quantity_9_5(Double grade_quantity_9_5) {
		this.grade_quantity_9_5 = grade_quantity_9_5;
	}

	public void unSetGrade_quantity_9_5() {
		this.grade_quantity_9_5 = null;
	}

	public Double getGrade_quantity_9_6() {
		return grade_quantity_9_6;
	}

	public double getGrade_quantity_9_6Ex() {
		return grade_quantity_9_6 != null ? grade_quantity_9_6 : 0;
	}

	public void setGrade_quantity_9_6(double grade_quantity_9_6) {
		this.grade_quantity_9_6 = grade_quantity_9_6;
	}

	public void setGrade_quantity_9_6(Double grade_quantity_9_6) {
		this.grade_quantity_9_6 = grade_quantity_9_6;
	}

	public void unSetGrade_quantity_9_6() {
		this.grade_quantity_9_6 = null;
	}

	public Double getGrade_quantity_9_7() {
		return grade_quantity_9_7;
	}

	public double getGrade_quantity_9_7Ex() {
		return grade_quantity_9_7 != null ? grade_quantity_9_7 : 0;
	}

	public void setGrade_quantity_9_7(double grade_quantity_9_7) {
		this.grade_quantity_9_7 = grade_quantity_9_7;
	}

	public void setGrade_quantity_9_7(Double grade_quantity_9_7) {
		this.grade_quantity_9_7 = grade_quantity_9_7;
	}

	public void unSetGrade_quantity_9_7() {
		this.grade_quantity_9_7 = null;
	}

	public Double getGrade_quantity_9_8() {
		return grade_quantity_9_8;
	}

	public double getGrade_quantity_9_8Ex() {
		return grade_quantity_9_8 != null ? grade_quantity_9_8 : 0;
	}

	public void setGrade_quantity_9_8(double grade_quantity_9_8) {
		this.grade_quantity_9_8 = grade_quantity_9_8;
	}

	public void setGrade_quantity_9_8(Double grade_quantity_9_8) {
		this.grade_quantity_9_8 = grade_quantity_9_8;
	}

	public void unSetGrade_quantity_9_8() {
		this.grade_quantity_9_8 = null;
	}

	public Double getGrade_quantity_9_9() {
		return grade_quantity_9_9;
	}

	public double getGrade_quantity_9_9Ex() {
		return grade_quantity_9_9 != null ? grade_quantity_9_9 : 0;
	}

	public void setGrade_quantity_9_9(double grade_quantity_9_9) {
		this.grade_quantity_9_9 = grade_quantity_9_9;
	}

	public void setGrade_quantity_9_9(Double grade_quantity_9_9) {
		this.grade_quantity_9_9 = grade_quantity_9_9;
	}

	public void unSetGrade_quantity_9_9() {
		this.grade_quantity_9_9 = null;
	}

	public String getFarmer10() {
		return farmer10;
	}

	public String getFarmer10Ex() {
		return farmer10 != null ? farmer10 : "";
	}

	public void setFarmer10(String farmer10) {
		this.farmer10 = farmer10;
	}

	public void unSetFarmer10() {
		this.farmer10 = null;
	}

	public Double getFarmer_quantity_10() {
		return farmer_quantity_10;
	}

	public double getFarmer_quantity_10Ex() {
		return farmer_quantity_10 != null ? farmer_quantity_10 : 0;
	}

	public void setFarmer_quantity_10(double farmer_quantity_10) {
		this.farmer_quantity_10 = farmer_quantity_10;
	}

	public void setFarmer_quantity_10(Double farmer_quantity_10) {
		this.farmer_quantity_10 = farmer_quantity_10;
	}

	public void unSetFarmer_quantity_10() {
		this.farmer_quantity_10 = null;
	}

	public Double getGrade_quantity_10_1() {
		return grade_quantity_10_1;
	}

	public double getGrade_quantity_10_1Ex() {
		return grade_quantity_10_1 != null ? grade_quantity_10_1 : 0;
	}

	public void setGrade_quantity_10_1(double grade_quantity_10_1) {
		this.grade_quantity_10_1 = grade_quantity_10_1;
	}

	public void setGrade_quantity_10_1(Double grade_quantity_10_1) {
		this.grade_quantity_10_1 = grade_quantity_10_1;
	}

	public void unSetGrade_quantity_10_1() {
		this.grade_quantity_10_1 = null;
	}

	public Double getGrade_quantity_10_2() {
		return grade_quantity_10_2;
	}

	public double getGrade_quantity_10_2Ex() {
		return grade_quantity_10_2 != null ? grade_quantity_10_2 : 0;
	}

	public void setGrade_quantity_10_2(double grade_quantity_10_2) {
		this.grade_quantity_10_2 = grade_quantity_10_2;
	}

	public void setGrade_quantity_10_2(Double grade_quantity_10_2) {
		this.grade_quantity_10_2 = grade_quantity_10_2;
	}

	public void unSetGrade_quantity_10_2() {
		this.grade_quantity_10_2 = null;
	}

	public Double getGrade_quantity_10_3() {
		return grade_quantity_10_3;
	}

	public double getGrade_quantity_10_3Ex() {
		return grade_quantity_10_3 != null ? grade_quantity_10_3 : 0;
	}

	public void setGrade_quantity_10_3(double grade_quantity_10_3) {
		this.grade_quantity_10_3 = grade_quantity_10_3;
	}

	public void setGrade_quantity_10_3(Double grade_quantity_10_3) {
		this.grade_quantity_10_3 = grade_quantity_10_3;
	}

	public void unSetGrade_quantity_10_3() {
		this.grade_quantity_10_3 = null;
	}

	public Double getGrade_quantity_10_4() {
		return grade_quantity_10_4;
	}

	public double getGrade_quantity_10_4Ex() {
		return grade_quantity_10_4 != null ? grade_quantity_10_4 : 0;
	}

	public void setGrade_quantity_10_4(double grade_quantity_10_4) {
		this.grade_quantity_10_4 = grade_quantity_10_4;
	}

	public void setGrade_quantity_10_4(Double grade_quantity_10_4) {
		this.grade_quantity_10_4 = grade_quantity_10_4;
	}

	public void unSetGrade_quantity_10_4() {
		this.grade_quantity_10_4 = null;
	}

	public Double getGrade_quantity_10_5() {
		return grade_quantity_10_5;
	}

	public double getGrade_quantity_10_5Ex() {
		return grade_quantity_10_5 != null ? grade_quantity_10_5 : 0;
	}

	public void setGrade_quantity_10_5(double grade_quantity_10_5) {
		this.grade_quantity_10_5 = grade_quantity_10_5;
	}

	public void setGrade_quantity_10_5(Double grade_quantity_10_5) {
		this.grade_quantity_10_5 = grade_quantity_10_5;
	}

	public void unSetGrade_quantity_10_5() {
		this.grade_quantity_10_5 = null;
	}

	public Double getGrade_quantity_10_6() {
		return grade_quantity_10_6;
	}

	public double getGrade_quantity_10_6Ex() {
		return grade_quantity_10_6 != null ? grade_quantity_10_6 : 0;
	}

	public void setGrade_quantity_10_6(double grade_quantity_10_6) {
		this.grade_quantity_10_6 = grade_quantity_10_6;
	}

	public void setGrade_quantity_10_6(Double grade_quantity_10_6) {
		this.grade_quantity_10_6 = grade_quantity_10_6;
	}

	public void unSetGrade_quantity_10_6() {
		this.grade_quantity_10_6 = null;
	}

	public Double getGrade_quantity_10_7() {
		return grade_quantity_10_7;
	}

	public double getGrade_quantity_10_7Ex() {
		return grade_quantity_10_7 != null ? grade_quantity_10_7 : 0;
	}

	public void setGrade_quantity_10_7(double grade_quantity_10_7) {
		this.grade_quantity_10_7 = grade_quantity_10_7;
	}

	public void setGrade_quantity_10_7(Double grade_quantity_10_7) {
		this.grade_quantity_10_7 = grade_quantity_10_7;
	}

	public void unSetGrade_quantity_10_7() {
		this.grade_quantity_10_7 = null;
	}

	public Double getGrade_quantity_10_8() {
		return grade_quantity_10_8;
	}

	public double getGrade_quantity_10_8Ex() {
		return grade_quantity_10_8 != null ? grade_quantity_10_8 : 0;
	}

	public void setGrade_quantity_10_8(double grade_quantity_10_8) {
		this.grade_quantity_10_8 = grade_quantity_10_8;
	}

	public void setGrade_quantity_10_8(Double grade_quantity_10_8) {
		this.grade_quantity_10_8 = grade_quantity_10_8;
	}

	public void unSetGrade_quantity_10_8() {
		this.grade_quantity_10_8 = null;
	}

	public Double getGrade_quantity_10_9() {
		return grade_quantity_10_9;
	}

	public double getGrade_quantity_10_9Ex() {
		return grade_quantity_10_9 != null ? grade_quantity_10_9 : 0;
	}

	public void setGrade_quantity_10_9(double grade_quantity_10_9) {
		this.grade_quantity_10_9 = grade_quantity_10_9;
	}

	public void setGrade_quantity_10_9(Double grade_quantity_10_9) {
		this.grade_quantity_10_9 = grade_quantity_10_9;
	}

	public void unSetGrade_quantity_10_9() {
		this.grade_quantity_10_9 = null;
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