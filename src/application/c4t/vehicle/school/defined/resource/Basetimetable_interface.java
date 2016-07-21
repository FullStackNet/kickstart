/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

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
public abstract class Basetimetable_interface extends BaseResource {
	private String id = null;
	private String class_name = null;
	private String school_id = null;
	private String section_name = null;
	private Integer days = null;
	private Integer periods = null;
	private String teacher_id1_1 = null;
	private String subject_id1_1 = null;
	private String teacher_id1_2 = null;
	private String subject_id1_2 = null;
	private String teacher_id1_3 = null;
	private String subject_id1_3 = null;
	private String teacher_id1_4 = null;
	private String subject_id1_4 = null;
	private String teacher_id1_5 = null;
	private String subject_id1_5 = null;
	private String teacher_id1_6 = null;
	private String subject_id1_6 = null;
	private String teacher_id1_7 = null;
	private String subject_id1_7 = null;
	private String teacher_id1_8 = null;
	private String subject_id1_8 = null;
	private String teacher_id1_9 = null;
	private String subject_id1_9 = null;
	private String teacher_id2_1 = null;
	private String subject_id2_1 = null;
	private String teacher_id2_2 = null;
	private String subject_id2_2 = null;
	private String teacher_id2_3 = null;
	private String subject_id2_3 = null;
	private String teacher_id2_4 = null;
	private String subject_id2_4 = null;
	private String teacher_id2_5 = null;
	private String subject_id2_5 = null;
	private String teacher_id2_6 = null;
	private String subject_id2_6 = null;
	private String teacher_id2_7 = null;
	private String subject_id2_7 = null;
	private String teacher_id2_8 = null;
	private String subject_id2_8 = null;
	private String teacher_id2_9 = null;
	private String subject_id2_9 = null;
	private String teacher_id3_1 = null;
	private String subject_id3_1 = null;
	private String teacher_id3_2 = null;
	private String subject_id3_2 = null;
	private String teacher_id3_3 = null;
	private String subject_id3_3 = null;
	private String teacher_id3_4 = null;
	private String subject_id3_4 = null;
	private String teacher_id3_5 = null;
	private String subject_id3_5 = null;
	private String teacher_id3_6 = null;
	private String subject_id3_6 = null;
	private String teacher_id3_7 = null;
	private String subject_id3_7 = null;
	private String teacher_id3_8 = null;
	private String subject_id3_8 = null;
	private String teacher_id3_9 = null;
	private String subject_id3_9 = null;
	private String teacher_id4_1 = null;
	private String subject_id4_1 = null;
	private String teacher_id4_2 = null;
	private String subject_id4_2 = null;
	private String teacher_id4_3 = null;
	private String subject_id4_3 = null;
	private String teacher_id4_4 = null;
	private String subject_id4_4 = null;
	private String teacher_id4_5 = null;
	private String subject_id4_5 = null;
	private String teacher_id4_6 = null;
	private String subject_id4_6 = null;
	private String teacher_id4_7 = null;
	private String subject_id4_7 = null;
	private String teacher_id4_8 = null;
	private String subject_id4_8 = null;
	private String teacher_id4_9 = null;
	private String subject_id4_9 = null;
	private String teacher_id5_1 = null;
	private String subject_id5_1 = null;
	private String teacher_id5_2 = null;
	private String subject_id5_2 = null;
	private String teacher_id5_3 = null;
	private String subject_id5_3 = null;
	private String teacher_id5_4 = null;
	private String subject_id5_4 = null;
	private String teacher_id5_5 = null;
	private String subject_id5_5 = null;
	private String teacher_id5_6 = null;
	private String subject_id5_6 = null;
	private String teacher_id5_7 = null;
	private String subject_id5_7 = null;
	private String teacher_id5_8 = null;
	private String subject_id5_8 = null;
	private String teacher_id5_9 = null;
	private String subject_id5_9 = null;
	private String teacher_id6_1 = null;
	private String subject_id6_1 = null;
	private String teacher_id6_2 = null;
	private String subject_id6_2 = null;
	private String teacher_id6_3 = null;
	private String subject_id6_3 = null;
	private String teacher_id6_4 = null;
	private String subject_id6_4 = null;
	private String teacher_id6_5 = null;
	private String subject_id6_5 = null;
	private String teacher_id6_6 = null;
	private String subject_id6_6 = null;
	private String teacher_id6_7 = null;
	private String subject_id6_7 = null;
	private String teacher_id6_8 = null;
	private String subject_id6_8 = null;
	private String teacher_id6_9 = null;
	private String subject_id6_9 = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_DAYS = "days";
	public static String FIELD_PERIODS = "periods";
	public static String FIELD_TEACHER_ID1_1 = "teacher_id1_1";
	public static String FIELD_SUBJECT_ID1_1 = "subject_id1_1";
	public static String FIELD_TEACHER_ID1_2 = "teacher_id1_2";
	public static String FIELD_SUBJECT_ID1_2 = "subject_id1_2";
	public static String FIELD_TEACHER_ID1_3 = "teacher_id1_3";
	public static String FIELD_SUBJECT_ID1_3 = "subject_id1_3";
	public static String FIELD_TEACHER_ID1_4 = "teacher_id1_4";
	public static String FIELD_SUBJECT_ID1_4 = "subject_id1_4";
	public static String FIELD_TEACHER_ID1_5 = "teacher_id1_5";
	public static String FIELD_SUBJECT_ID1_5 = "subject_id1_5";
	public static String FIELD_TEACHER_ID1_6 = "teacher_id1_6";
	public static String FIELD_SUBJECT_ID1_6 = "subject_id1_6";
	public static String FIELD_TEACHER_ID1_7 = "teacher_id1_7";
	public static String FIELD_SUBJECT_ID1_7 = "subject_id1_7";
	public static String FIELD_TEACHER_ID1_8 = "teacher_id1_8";
	public static String FIELD_SUBJECT_ID1_8 = "subject_id1_8";
	public static String FIELD_TEACHER_ID1_9 = "teacher_id1_9";
	public static String FIELD_SUBJECT_ID1_9 = "subject_id1_9";
	public static String FIELD_TEACHER_ID2_1 = "teacher_id2_1";
	public static String FIELD_SUBJECT_ID2_1 = "subject_id2_1";
	public static String FIELD_TEACHER_ID2_2 = "teacher_id2_2";
	public static String FIELD_SUBJECT_ID2_2 = "subject_id2_2";
	public static String FIELD_TEACHER_ID2_3 = "teacher_id2_3";
	public static String FIELD_SUBJECT_ID2_3 = "subject_id2_3";
	public static String FIELD_TEACHER_ID2_4 = "teacher_id2_4";
	public static String FIELD_SUBJECT_ID2_4 = "subject_id2_4";
	public static String FIELD_TEACHER_ID2_5 = "teacher_id2_5";
	public static String FIELD_SUBJECT_ID2_5 = "subject_id2_5";
	public static String FIELD_TEACHER_ID2_6 = "teacher_id2_6";
	public static String FIELD_SUBJECT_ID2_6 = "subject_id2_6";
	public static String FIELD_TEACHER_ID2_7 = "teacher_id2_7";
	public static String FIELD_SUBJECT_ID2_7 = "subject_id2_7";
	public static String FIELD_TEACHER_ID2_8 = "teacher_id2_8";
	public static String FIELD_SUBJECT_ID2_8 = "subject_id2_8";
	public static String FIELD_TEACHER_ID2_9 = "teacher_id2_9";
	public static String FIELD_SUBJECT_ID2_9 = "subject_id2_9";
	public static String FIELD_TEACHER_ID3_1 = "teacher_id3_1";
	public static String FIELD_SUBJECT_ID3_1 = "subject_id3_1";
	public static String FIELD_TEACHER_ID3_2 = "teacher_id3_2";
	public static String FIELD_SUBJECT_ID3_2 = "subject_id3_2";
	public static String FIELD_TEACHER_ID3_3 = "teacher_id3_3";
	public static String FIELD_SUBJECT_ID3_3 = "subject_id3_3";
	public static String FIELD_TEACHER_ID3_4 = "teacher_id3_4";
	public static String FIELD_SUBJECT_ID3_4 = "subject_id3_4";
	public static String FIELD_TEACHER_ID3_5 = "teacher_id3_5";
	public static String FIELD_SUBJECT_ID3_5 = "subject_id3_5";
	public static String FIELD_TEACHER_ID3_6 = "teacher_id3_6";
	public static String FIELD_SUBJECT_ID3_6 = "subject_id3_6";
	public static String FIELD_TEACHER_ID3_7 = "teacher_id3_7";
	public static String FIELD_SUBJECT_ID3_7 = "subject_id3_7";
	public static String FIELD_TEACHER_ID3_8 = "teacher_id3_8";
	public static String FIELD_SUBJECT_ID3_8 = "subject_id3_8";
	public static String FIELD_TEACHER_ID3_9 = "teacher_id3_9";
	public static String FIELD_SUBJECT_ID3_9 = "subject_id3_9";
	public static String FIELD_TEACHER_ID4_1 = "teacher_id4_1";
	public static String FIELD_SUBJECT_ID4_1 = "subject_id4_1";
	public static String FIELD_TEACHER_ID4_2 = "teacher_id4_2";
	public static String FIELD_SUBJECT_ID4_2 = "subject_id4_2";
	public static String FIELD_TEACHER_ID4_3 = "teacher_id4_3";
	public static String FIELD_SUBJECT_ID4_3 = "subject_id4_3";
	public static String FIELD_TEACHER_ID4_4 = "teacher_id4_4";
	public static String FIELD_SUBJECT_ID4_4 = "subject_id4_4";
	public static String FIELD_TEACHER_ID4_5 = "teacher_id4_5";
	public static String FIELD_SUBJECT_ID4_5 = "subject_id4_5";
	public static String FIELD_TEACHER_ID4_6 = "teacher_id4_6";
	public static String FIELD_SUBJECT_ID4_6 = "subject_id4_6";
	public static String FIELD_TEACHER_ID4_7 = "teacher_id4_7";
	public static String FIELD_SUBJECT_ID4_7 = "subject_id4_7";
	public static String FIELD_TEACHER_ID4_8 = "teacher_id4_8";
	public static String FIELD_SUBJECT_ID4_8 = "subject_id4_8";
	public static String FIELD_TEACHER_ID4_9 = "teacher_id4_9";
	public static String FIELD_SUBJECT_ID4_9 = "subject_id4_9";
	public static String FIELD_TEACHER_ID5_1 = "teacher_id5_1";
	public static String FIELD_SUBJECT_ID5_1 = "subject_id5_1";
	public static String FIELD_TEACHER_ID5_2 = "teacher_id5_2";
	public static String FIELD_SUBJECT_ID5_2 = "subject_id5_2";
	public static String FIELD_TEACHER_ID5_3 = "teacher_id5_3";
	public static String FIELD_SUBJECT_ID5_3 = "subject_id5_3";
	public static String FIELD_TEACHER_ID5_4 = "teacher_id5_4";
	public static String FIELD_SUBJECT_ID5_4 = "subject_id5_4";
	public static String FIELD_TEACHER_ID5_5 = "teacher_id5_5";
	public static String FIELD_SUBJECT_ID5_5 = "subject_id5_5";
	public static String FIELD_TEACHER_ID5_6 = "teacher_id5_6";
	public static String FIELD_SUBJECT_ID5_6 = "subject_id5_6";
	public static String FIELD_TEACHER_ID5_7 = "teacher_id5_7";
	public static String FIELD_SUBJECT_ID5_7 = "subject_id5_7";
	public static String FIELD_TEACHER_ID5_8 = "teacher_id5_8";
	public static String FIELD_SUBJECT_ID5_8 = "subject_id5_8";
	public static String FIELD_TEACHER_ID5_9 = "teacher_id5_9";
	public static String FIELD_SUBJECT_ID5_9 = "subject_id5_9";
	public static String FIELD_TEACHER_ID6_1 = "teacher_id6_1";
	public static String FIELD_SUBJECT_ID6_1 = "subject_id6_1";
	public static String FIELD_TEACHER_ID6_2 = "teacher_id6_2";
	public static String FIELD_SUBJECT_ID6_2 = "subject_id6_2";
	public static String FIELD_TEACHER_ID6_3 = "teacher_id6_3";
	public static String FIELD_SUBJECT_ID6_3 = "subject_id6_3";
	public static String FIELD_TEACHER_ID6_4 = "teacher_id6_4";
	public static String FIELD_SUBJECT_ID6_4 = "subject_id6_4";
	public static String FIELD_TEACHER_ID6_5 = "teacher_id6_5";
	public static String FIELD_SUBJECT_ID6_5 = "subject_id6_5";
	public static String FIELD_TEACHER_ID6_6 = "teacher_id6_6";
	public static String FIELD_SUBJECT_ID6_6 = "subject_id6_6";
	public static String FIELD_TEACHER_ID6_7 = "teacher_id6_7";
	public static String FIELD_SUBJECT_ID6_7 = "subject_id6_7";
	public static String FIELD_TEACHER_ID6_8 = "teacher_id6_8";
	public static String FIELD_SUBJECT_ID6_8 = "subject_id6_8";
	public static String FIELD_TEACHER_ID6_9 = "teacher_id6_9";
	public static String FIELD_SUBJECT_ID6_9 = "subject_id6_9";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("timetable_interface");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(32);
		metaData.addField(class_nameField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(32);
		metaData.addField(section_nameField);

		Field daysField = new Field("days", "int");
		metaData.addField(daysField);

		Field periodsField = new Field("periods", "int");
		metaData.addField(periodsField);

		Field teacher_id1_1Field = new Field("teacher_id1_1", "String");
		teacher_id1_1Field.setLength(128);
		metaData.addField(teacher_id1_1Field);

		Field subject_id1_1Field = new Field("subject_id1_1", "String");
		subject_id1_1Field.setLength(128);
		metaData.addField(subject_id1_1Field);

		Field teacher_id1_2Field = new Field("teacher_id1_2", "String");
		teacher_id1_2Field.setLength(128);
		metaData.addField(teacher_id1_2Field);

		Field subject_id1_2Field = new Field("subject_id1_2", "String");
		subject_id1_2Field.setLength(128);
		metaData.addField(subject_id1_2Field);

		Field teacher_id1_3Field = new Field("teacher_id1_3", "String");
		teacher_id1_3Field.setLength(128);
		metaData.addField(teacher_id1_3Field);

		Field subject_id1_3Field = new Field("subject_id1_3", "String");
		subject_id1_3Field.setLength(128);
		metaData.addField(subject_id1_3Field);

		Field teacher_id1_4Field = new Field("teacher_id1_4", "String");
		teacher_id1_4Field.setLength(128);
		metaData.addField(teacher_id1_4Field);

		Field subject_id1_4Field = new Field("subject_id1_4", "String");
		subject_id1_4Field.setLength(128);
		metaData.addField(subject_id1_4Field);

		Field teacher_id1_5Field = new Field("teacher_id1_5", "String");
		teacher_id1_5Field.setLength(128);
		metaData.addField(teacher_id1_5Field);

		Field subject_id1_5Field = new Field("subject_id1_5", "String");
		subject_id1_5Field.setLength(128);
		metaData.addField(subject_id1_5Field);

		Field teacher_id1_6Field = new Field("teacher_id1_6", "String");
		teacher_id1_6Field.setLength(128);
		metaData.addField(teacher_id1_6Field);

		Field subject_id1_6Field = new Field("subject_id1_6", "String");
		subject_id1_6Field.setLength(128);
		metaData.addField(subject_id1_6Field);

		Field teacher_id1_7Field = new Field("teacher_id1_7", "String");
		teacher_id1_7Field.setLength(128);
		metaData.addField(teacher_id1_7Field);

		Field subject_id1_7Field = new Field("subject_id1_7", "String");
		subject_id1_7Field.setLength(128);
		metaData.addField(subject_id1_7Field);

		Field teacher_id1_8Field = new Field("teacher_id1_8", "String");
		teacher_id1_8Field.setLength(128);
		metaData.addField(teacher_id1_8Field);

		Field subject_id1_8Field = new Field("subject_id1_8", "String");
		subject_id1_8Field.setLength(128);
		metaData.addField(subject_id1_8Field);

		Field teacher_id1_9Field = new Field("teacher_id1_9", "String");
		teacher_id1_9Field.setLength(128);
		metaData.addField(teacher_id1_9Field);

		Field subject_id1_9Field = new Field("subject_id1_9", "String");
		subject_id1_9Field.setLength(128);
		metaData.addField(subject_id1_9Field);

		Field teacher_id2_1Field = new Field("teacher_id2_1", "String");
		teacher_id2_1Field.setLength(128);
		metaData.addField(teacher_id2_1Field);

		Field subject_id2_1Field = new Field("subject_id2_1", "String");
		subject_id2_1Field.setLength(128);
		metaData.addField(subject_id2_1Field);

		Field teacher_id2_2Field = new Field("teacher_id2_2", "String");
		teacher_id2_2Field.setLength(128);
		metaData.addField(teacher_id2_2Field);

		Field subject_id2_2Field = new Field("subject_id2_2", "String");
		subject_id2_2Field.setLength(128);
		metaData.addField(subject_id2_2Field);

		Field teacher_id2_3Field = new Field("teacher_id2_3", "String");
		teacher_id2_3Field.setLength(128);
		metaData.addField(teacher_id2_3Field);

		Field subject_id2_3Field = new Field("subject_id2_3", "String");
		subject_id2_3Field.setLength(128);
		metaData.addField(subject_id2_3Field);

		Field teacher_id2_4Field = new Field("teacher_id2_4", "String");
		teacher_id2_4Field.setLength(128);
		metaData.addField(teacher_id2_4Field);

		Field subject_id2_4Field = new Field("subject_id2_4", "String");
		subject_id2_4Field.setLength(128);
		metaData.addField(subject_id2_4Field);

		Field teacher_id2_5Field = new Field("teacher_id2_5", "String");
		teacher_id2_5Field.setLength(128);
		metaData.addField(teacher_id2_5Field);

		Field subject_id2_5Field = new Field("subject_id2_5", "String");
		subject_id2_5Field.setLength(128);
		metaData.addField(subject_id2_5Field);

		Field teacher_id2_6Field = new Field("teacher_id2_6", "String");
		teacher_id2_6Field.setLength(128);
		metaData.addField(teacher_id2_6Field);

		Field subject_id2_6Field = new Field("subject_id2_6", "String");
		subject_id2_6Field.setLength(128);
		metaData.addField(subject_id2_6Field);

		Field teacher_id2_7Field = new Field("teacher_id2_7", "String");
		teacher_id2_7Field.setLength(128);
		metaData.addField(teacher_id2_7Field);

		Field subject_id2_7Field = new Field("subject_id2_7", "String");
		subject_id2_7Field.setLength(128);
		metaData.addField(subject_id2_7Field);

		Field teacher_id2_8Field = new Field("teacher_id2_8", "String");
		teacher_id2_8Field.setLength(128);
		metaData.addField(teacher_id2_8Field);

		Field subject_id2_8Field = new Field("subject_id2_8", "String");
		subject_id2_8Field.setLength(128);
		metaData.addField(subject_id2_8Field);

		Field teacher_id2_9Field = new Field("teacher_id2_9", "String");
		teacher_id2_9Field.setLength(128);
		metaData.addField(teacher_id2_9Field);

		Field subject_id2_9Field = new Field("subject_id2_9", "String");
		subject_id2_9Field.setLength(128);
		metaData.addField(subject_id2_9Field);

		Field teacher_id3_1Field = new Field("teacher_id3_1", "String");
		teacher_id3_1Field.setLength(128);
		metaData.addField(teacher_id3_1Field);

		Field subject_id3_1Field = new Field("subject_id3_1", "String");
		subject_id3_1Field.setLength(128);
		metaData.addField(subject_id3_1Field);

		Field teacher_id3_2Field = new Field("teacher_id3_2", "String");
		teacher_id3_2Field.setLength(128);
		metaData.addField(teacher_id3_2Field);

		Field subject_id3_2Field = new Field("subject_id3_2", "String");
		subject_id3_2Field.setLength(128);
		metaData.addField(subject_id3_2Field);

		Field teacher_id3_3Field = new Field("teacher_id3_3", "String");
		teacher_id3_3Field.setLength(128);
		metaData.addField(teacher_id3_3Field);

		Field subject_id3_3Field = new Field("subject_id3_3", "String");
		subject_id3_3Field.setLength(128);
		metaData.addField(subject_id3_3Field);

		Field teacher_id3_4Field = new Field("teacher_id3_4", "String");
		teacher_id3_4Field.setLength(128);
		metaData.addField(teacher_id3_4Field);

		Field subject_id3_4Field = new Field("subject_id3_4", "String");
		subject_id3_4Field.setLength(128);
		metaData.addField(subject_id3_4Field);

		Field teacher_id3_5Field = new Field("teacher_id3_5", "String");
		teacher_id3_5Field.setLength(128);
		metaData.addField(teacher_id3_5Field);

		Field subject_id3_5Field = new Field("subject_id3_5", "String");
		subject_id3_5Field.setLength(128);
		metaData.addField(subject_id3_5Field);

		Field teacher_id3_6Field = new Field("teacher_id3_6", "String");
		teacher_id3_6Field.setLength(128);
		metaData.addField(teacher_id3_6Field);

		Field subject_id3_6Field = new Field("subject_id3_6", "String");
		subject_id3_6Field.setLength(128);
		metaData.addField(subject_id3_6Field);

		Field teacher_id3_7Field = new Field("teacher_id3_7", "String");
		teacher_id3_7Field.setLength(128);
		metaData.addField(teacher_id3_7Field);

		Field subject_id3_7Field = new Field("subject_id3_7", "String");
		subject_id3_7Field.setLength(128);
		metaData.addField(subject_id3_7Field);

		Field teacher_id3_8Field = new Field("teacher_id3_8", "String");
		teacher_id3_8Field.setLength(128);
		metaData.addField(teacher_id3_8Field);

		Field subject_id3_8Field = new Field("subject_id3_8", "String");
		subject_id3_8Field.setLength(128);
		metaData.addField(subject_id3_8Field);

		Field teacher_id3_9Field = new Field("teacher_id3_9", "String");
		teacher_id3_9Field.setLength(128);
		metaData.addField(teacher_id3_9Field);

		Field subject_id3_9Field = new Field("subject_id3_9", "String");
		subject_id3_9Field.setLength(128);
		metaData.addField(subject_id3_9Field);

		Field teacher_id4_1Field = new Field("teacher_id4_1", "String");
		teacher_id4_1Field.setLength(128);
		metaData.addField(teacher_id4_1Field);

		Field subject_id4_1Field = new Field("subject_id4_1", "String");
		subject_id4_1Field.setLength(128);
		metaData.addField(subject_id4_1Field);

		Field teacher_id4_2Field = new Field("teacher_id4_2", "String");
		teacher_id4_2Field.setLength(128);
		metaData.addField(teacher_id4_2Field);

		Field subject_id4_2Field = new Field("subject_id4_2", "String");
		subject_id4_2Field.setLength(128);
		metaData.addField(subject_id4_2Field);

		Field teacher_id4_3Field = new Field("teacher_id4_3", "String");
		teacher_id4_3Field.setLength(128);
		metaData.addField(teacher_id4_3Field);

		Field subject_id4_3Field = new Field("subject_id4_3", "String");
		subject_id4_3Field.setLength(128);
		metaData.addField(subject_id4_3Field);

		Field teacher_id4_4Field = new Field("teacher_id4_4", "String");
		teacher_id4_4Field.setLength(128);
		metaData.addField(teacher_id4_4Field);

		Field subject_id4_4Field = new Field("subject_id4_4", "String");
		subject_id4_4Field.setLength(128);
		metaData.addField(subject_id4_4Field);

		Field teacher_id4_5Field = new Field("teacher_id4_5", "String");
		teacher_id4_5Field.setLength(128);
		metaData.addField(teacher_id4_5Field);

		Field subject_id4_5Field = new Field("subject_id4_5", "String");
		subject_id4_5Field.setLength(128);
		metaData.addField(subject_id4_5Field);

		Field teacher_id4_6Field = new Field("teacher_id4_6", "String");
		teacher_id4_6Field.setLength(128);
		metaData.addField(teacher_id4_6Field);

		Field subject_id4_6Field = new Field("subject_id4_6", "String");
		subject_id4_6Field.setLength(128);
		metaData.addField(subject_id4_6Field);

		Field teacher_id4_7Field = new Field("teacher_id4_7", "String");
		teacher_id4_7Field.setLength(128);
		metaData.addField(teacher_id4_7Field);

		Field subject_id4_7Field = new Field("subject_id4_7", "String");
		subject_id4_7Field.setLength(128);
		metaData.addField(subject_id4_7Field);

		Field teacher_id4_8Field = new Field("teacher_id4_8", "String");
		teacher_id4_8Field.setLength(128);
		metaData.addField(teacher_id4_8Field);

		Field subject_id4_8Field = new Field("subject_id4_8", "String");
		subject_id4_8Field.setLength(128);
		metaData.addField(subject_id4_8Field);

		Field teacher_id4_9Field = new Field("teacher_id4_9", "String");
		teacher_id4_9Field.setLength(128);
		metaData.addField(teacher_id4_9Field);

		Field subject_id4_9Field = new Field("subject_id4_9", "String");
		subject_id4_9Field.setLength(128);
		metaData.addField(subject_id4_9Field);

		Field teacher_id5_1Field = new Field("teacher_id5_1", "String");
		teacher_id5_1Field.setLength(128);
		metaData.addField(teacher_id5_1Field);

		Field subject_id5_1Field = new Field("subject_id5_1", "String");
		subject_id5_1Field.setLength(128);
		metaData.addField(subject_id5_1Field);

		Field teacher_id5_2Field = new Field("teacher_id5_2", "String");
		teacher_id5_2Field.setLength(128);
		metaData.addField(teacher_id5_2Field);

		Field subject_id5_2Field = new Field("subject_id5_2", "String");
		subject_id5_2Field.setLength(128);
		metaData.addField(subject_id5_2Field);

		Field teacher_id5_3Field = new Field("teacher_id5_3", "String");
		teacher_id5_3Field.setLength(128);
		metaData.addField(teacher_id5_3Field);

		Field subject_id5_3Field = new Field("subject_id5_3", "String");
		subject_id5_3Field.setLength(128);
		metaData.addField(subject_id5_3Field);

		Field teacher_id5_4Field = new Field("teacher_id5_4", "String");
		teacher_id5_4Field.setLength(128);
		metaData.addField(teacher_id5_4Field);

		Field subject_id5_4Field = new Field("subject_id5_4", "String");
		subject_id5_4Field.setLength(128);
		metaData.addField(subject_id5_4Field);

		Field teacher_id5_5Field = new Field("teacher_id5_5", "String");
		teacher_id5_5Field.setLength(128);
		metaData.addField(teacher_id5_5Field);

		Field subject_id5_5Field = new Field("subject_id5_5", "String");
		subject_id5_5Field.setLength(128);
		metaData.addField(subject_id5_5Field);

		Field teacher_id5_6Field = new Field("teacher_id5_6", "String");
		teacher_id5_6Field.setLength(128);
		metaData.addField(teacher_id5_6Field);

		Field subject_id5_6Field = new Field("subject_id5_6", "String");
		subject_id5_6Field.setLength(128);
		metaData.addField(subject_id5_6Field);

		Field teacher_id5_7Field = new Field("teacher_id5_7", "String");
		teacher_id5_7Field.setLength(128);
		metaData.addField(teacher_id5_7Field);

		Field subject_id5_7Field = new Field("subject_id5_7", "String");
		subject_id5_7Field.setLength(128);
		metaData.addField(subject_id5_7Field);

		Field teacher_id5_8Field = new Field("teacher_id5_8", "String");
		teacher_id5_8Field.setLength(128);
		metaData.addField(teacher_id5_8Field);

		Field subject_id5_8Field = new Field("subject_id5_8", "String");
		subject_id5_8Field.setLength(128);
		metaData.addField(subject_id5_8Field);

		Field teacher_id5_9Field = new Field("teacher_id5_9", "String");
		teacher_id5_9Field.setLength(128);
		metaData.addField(teacher_id5_9Field);

		Field subject_id5_9Field = new Field("subject_id5_9", "String");
		subject_id5_9Field.setLength(128);
		metaData.addField(subject_id5_9Field);

		Field teacher_id6_1Field = new Field("teacher_id6_1", "String");
		teacher_id6_1Field.setLength(128);
		metaData.addField(teacher_id6_1Field);

		Field subject_id6_1Field = new Field("subject_id6_1", "String");
		subject_id6_1Field.setLength(128);
		metaData.addField(subject_id6_1Field);

		Field teacher_id6_2Field = new Field("teacher_id6_2", "String");
		teacher_id6_2Field.setLength(128);
		metaData.addField(teacher_id6_2Field);

		Field subject_id6_2Field = new Field("subject_id6_2", "String");
		subject_id6_2Field.setLength(128);
		metaData.addField(subject_id6_2Field);

		Field teacher_id6_3Field = new Field("teacher_id6_3", "String");
		teacher_id6_3Field.setLength(128);
		metaData.addField(teacher_id6_3Field);

		Field subject_id6_3Field = new Field("subject_id6_3", "String");
		subject_id6_3Field.setLength(128);
		metaData.addField(subject_id6_3Field);

		Field teacher_id6_4Field = new Field("teacher_id6_4", "String");
		teacher_id6_4Field.setLength(128);
		metaData.addField(teacher_id6_4Field);

		Field subject_id6_4Field = new Field("subject_id6_4", "String");
		subject_id6_4Field.setLength(128);
		metaData.addField(subject_id6_4Field);

		Field teacher_id6_5Field = new Field("teacher_id6_5", "String");
		teacher_id6_5Field.setLength(128);
		metaData.addField(teacher_id6_5Field);

		Field subject_id6_5Field = new Field("subject_id6_5", "String");
		subject_id6_5Field.setLength(128);
		metaData.addField(subject_id6_5Field);

		Field teacher_id6_6Field = new Field("teacher_id6_6", "String");
		teacher_id6_6Field.setLength(128);
		metaData.addField(teacher_id6_6Field);

		Field subject_id6_6Field = new Field("subject_id6_6", "String");
		subject_id6_6Field.setLength(128);
		metaData.addField(subject_id6_6Field);

		Field teacher_id6_7Field = new Field("teacher_id6_7", "String");
		teacher_id6_7Field.setLength(128);
		metaData.addField(teacher_id6_7Field);

		Field subject_id6_7Field = new Field("subject_id6_7", "String");
		subject_id6_7Field.setLength(128);
		metaData.addField(subject_id6_7Field);

		Field teacher_id6_8Field = new Field("teacher_id6_8", "String");
		teacher_id6_8Field.setLength(128);
		metaData.addField(teacher_id6_8Field);

		Field subject_id6_8Field = new Field("subject_id6_8", "String");
		subject_id6_8Field.setLength(128);
		metaData.addField(subject_id6_8Field);

		Field teacher_id6_9Field = new Field("teacher_id6_9", "String");
		teacher_id6_9Field.setLength(128);
		metaData.addField(teacher_id6_9Field);

		Field subject_id6_9Field = new Field("subject_id6_9", "String");
		subject_id6_9Field.setLength(128);
		metaData.addField(subject_id6_9Field);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("timetable_interface");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basetimetable_interface() {}

	public Basetimetable_interface(Basetimetable_interface obj) {
		this.id = obj.id;
		this.class_name = obj.class_name;
		this.school_id = obj.school_id;
		this.section_name = obj.section_name;
		this.days = obj.days;
		this.periods = obj.periods;
		this.teacher_id1_1 = obj.teacher_id1_1;
		this.subject_id1_1 = obj.subject_id1_1;
		this.teacher_id1_2 = obj.teacher_id1_2;
		this.subject_id1_2 = obj.subject_id1_2;
		this.teacher_id1_3 = obj.teacher_id1_3;
		this.subject_id1_3 = obj.subject_id1_3;
		this.teacher_id1_4 = obj.teacher_id1_4;
		this.subject_id1_4 = obj.subject_id1_4;
		this.teacher_id1_5 = obj.teacher_id1_5;
		this.subject_id1_5 = obj.subject_id1_5;
		this.teacher_id1_6 = obj.teacher_id1_6;
		this.subject_id1_6 = obj.subject_id1_6;
		this.teacher_id1_7 = obj.teacher_id1_7;
		this.subject_id1_7 = obj.subject_id1_7;
		this.teacher_id1_8 = obj.teacher_id1_8;
		this.subject_id1_8 = obj.subject_id1_8;
		this.teacher_id1_9 = obj.teacher_id1_9;
		this.subject_id1_9 = obj.subject_id1_9;
		this.teacher_id2_1 = obj.teacher_id2_1;
		this.subject_id2_1 = obj.subject_id2_1;
		this.teacher_id2_2 = obj.teacher_id2_2;
		this.subject_id2_2 = obj.subject_id2_2;
		this.teacher_id2_3 = obj.teacher_id2_3;
		this.subject_id2_3 = obj.subject_id2_3;
		this.teacher_id2_4 = obj.teacher_id2_4;
		this.subject_id2_4 = obj.subject_id2_4;
		this.teacher_id2_5 = obj.teacher_id2_5;
		this.subject_id2_5 = obj.subject_id2_5;
		this.teacher_id2_6 = obj.teacher_id2_6;
		this.subject_id2_6 = obj.subject_id2_6;
		this.teacher_id2_7 = obj.teacher_id2_7;
		this.subject_id2_7 = obj.subject_id2_7;
		this.teacher_id2_8 = obj.teacher_id2_8;
		this.subject_id2_8 = obj.subject_id2_8;
		this.teacher_id2_9 = obj.teacher_id2_9;
		this.subject_id2_9 = obj.subject_id2_9;
		this.teacher_id3_1 = obj.teacher_id3_1;
		this.subject_id3_1 = obj.subject_id3_1;
		this.teacher_id3_2 = obj.teacher_id3_2;
		this.subject_id3_2 = obj.subject_id3_2;
		this.teacher_id3_3 = obj.teacher_id3_3;
		this.subject_id3_3 = obj.subject_id3_3;
		this.teacher_id3_4 = obj.teacher_id3_4;
		this.subject_id3_4 = obj.subject_id3_4;
		this.teacher_id3_5 = obj.teacher_id3_5;
		this.subject_id3_5 = obj.subject_id3_5;
		this.teacher_id3_6 = obj.teacher_id3_6;
		this.subject_id3_6 = obj.subject_id3_6;
		this.teacher_id3_7 = obj.teacher_id3_7;
		this.subject_id3_7 = obj.subject_id3_7;
		this.teacher_id3_8 = obj.teacher_id3_8;
		this.subject_id3_8 = obj.subject_id3_8;
		this.teacher_id3_9 = obj.teacher_id3_9;
		this.subject_id3_9 = obj.subject_id3_9;
		this.teacher_id4_1 = obj.teacher_id4_1;
		this.subject_id4_1 = obj.subject_id4_1;
		this.teacher_id4_2 = obj.teacher_id4_2;
		this.subject_id4_2 = obj.subject_id4_2;
		this.teacher_id4_3 = obj.teacher_id4_3;
		this.subject_id4_3 = obj.subject_id4_3;
		this.teacher_id4_4 = obj.teacher_id4_4;
		this.subject_id4_4 = obj.subject_id4_4;
		this.teacher_id4_5 = obj.teacher_id4_5;
		this.subject_id4_5 = obj.subject_id4_5;
		this.teacher_id4_6 = obj.teacher_id4_6;
		this.subject_id4_6 = obj.subject_id4_6;
		this.teacher_id4_7 = obj.teacher_id4_7;
		this.subject_id4_7 = obj.subject_id4_7;
		this.teacher_id4_8 = obj.teacher_id4_8;
		this.subject_id4_8 = obj.subject_id4_8;
		this.teacher_id4_9 = obj.teacher_id4_9;
		this.subject_id4_9 = obj.subject_id4_9;
		this.teacher_id5_1 = obj.teacher_id5_1;
		this.subject_id5_1 = obj.subject_id5_1;
		this.teacher_id5_2 = obj.teacher_id5_2;
		this.subject_id5_2 = obj.subject_id5_2;
		this.teacher_id5_3 = obj.teacher_id5_3;
		this.subject_id5_3 = obj.subject_id5_3;
		this.teacher_id5_4 = obj.teacher_id5_4;
		this.subject_id5_4 = obj.subject_id5_4;
		this.teacher_id5_5 = obj.teacher_id5_5;
		this.subject_id5_5 = obj.subject_id5_5;
		this.teacher_id5_6 = obj.teacher_id5_6;
		this.subject_id5_6 = obj.subject_id5_6;
		this.teacher_id5_7 = obj.teacher_id5_7;
		this.subject_id5_7 = obj.subject_id5_7;
		this.teacher_id5_8 = obj.teacher_id5_8;
		this.subject_id5_8 = obj.subject_id5_8;
		this.teacher_id5_9 = obj.teacher_id5_9;
		this.subject_id5_9 = obj.subject_id5_9;
		this.teacher_id6_1 = obj.teacher_id6_1;
		this.subject_id6_1 = obj.subject_id6_1;
		this.teacher_id6_2 = obj.teacher_id6_2;
		this.subject_id6_2 = obj.subject_id6_2;
		this.teacher_id6_3 = obj.teacher_id6_3;
		this.subject_id6_3 = obj.subject_id6_3;
		this.teacher_id6_4 = obj.teacher_id6_4;
		this.subject_id6_4 = obj.subject_id6_4;
		this.teacher_id6_5 = obj.teacher_id6_5;
		this.subject_id6_5 = obj.subject_id6_5;
		this.teacher_id6_6 = obj.teacher_id6_6;
		this.subject_id6_6 = obj.subject_id6_6;
		this.teacher_id6_7 = obj.teacher_id6_7;
		this.subject_id6_7 = obj.subject_id6_7;
		this.teacher_id6_8 = obj.teacher_id6_8;
		this.subject_id6_8 = obj.subject_id6_8;
		this.teacher_id6_9 = obj.teacher_id6_9;
		this.subject_id6_9 = obj.subject_id6_9;
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
		if(class_name != null)
			map.put("class_name", class_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(section_name != null)
			map.put("section_name", section_name);
		if(days != null)
			map.put("days", days);
		if(periods != null)
			map.put("periods", periods);
		if(teacher_id1_1 != null)
			map.put("teacher_id1_1", teacher_id1_1);
		if(subject_id1_1 != null)
			map.put("subject_id1_1", subject_id1_1);
		if(teacher_id1_2 != null)
			map.put("teacher_id1_2", teacher_id1_2);
		if(subject_id1_2 != null)
			map.put("subject_id1_2", subject_id1_2);
		if(teacher_id1_3 != null)
			map.put("teacher_id1_3", teacher_id1_3);
		if(subject_id1_3 != null)
			map.put("subject_id1_3", subject_id1_3);
		if(teacher_id1_4 != null)
			map.put("teacher_id1_4", teacher_id1_4);
		if(subject_id1_4 != null)
			map.put("subject_id1_4", subject_id1_4);
		if(teacher_id1_5 != null)
			map.put("teacher_id1_5", teacher_id1_5);
		if(subject_id1_5 != null)
			map.put("subject_id1_5", subject_id1_5);
		if(teacher_id1_6 != null)
			map.put("teacher_id1_6", teacher_id1_6);
		if(subject_id1_6 != null)
			map.put("subject_id1_6", subject_id1_6);
		if(teacher_id1_7 != null)
			map.put("teacher_id1_7", teacher_id1_7);
		if(subject_id1_7 != null)
			map.put("subject_id1_7", subject_id1_7);
		if(teacher_id1_8 != null)
			map.put("teacher_id1_8", teacher_id1_8);
		if(subject_id1_8 != null)
			map.put("subject_id1_8", subject_id1_8);
		if(teacher_id1_9 != null)
			map.put("teacher_id1_9", teacher_id1_9);
		if(subject_id1_9 != null)
			map.put("subject_id1_9", subject_id1_9);
		if(teacher_id2_1 != null)
			map.put("teacher_id2_1", teacher_id2_1);
		if(subject_id2_1 != null)
			map.put("subject_id2_1", subject_id2_1);
		if(teacher_id2_2 != null)
			map.put("teacher_id2_2", teacher_id2_2);
		if(subject_id2_2 != null)
			map.put("subject_id2_2", subject_id2_2);
		if(teacher_id2_3 != null)
			map.put("teacher_id2_3", teacher_id2_3);
		if(subject_id2_3 != null)
			map.put("subject_id2_3", subject_id2_3);
		if(teacher_id2_4 != null)
			map.put("teacher_id2_4", teacher_id2_4);
		if(subject_id2_4 != null)
			map.put("subject_id2_4", subject_id2_4);
		if(teacher_id2_5 != null)
			map.put("teacher_id2_5", teacher_id2_5);
		if(subject_id2_5 != null)
			map.put("subject_id2_5", subject_id2_5);
		if(teacher_id2_6 != null)
			map.put("teacher_id2_6", teacher_id2_6);
		if(subject_id2_6 != null)
			map.put("subject_id2_6", subject_id2_6);
		if(teacher_id2_7 != null)
			map.put("teacher_id2_7", teacher_id2_7);
		if(subject_id2_7 != null)
			map.put("subject_id2_7", subject_id2_7);
		if(teacher_id2_8 != null)
			map.put("teacher_id2_8", teacher_id2_8);
		if(subject_id2_8 != null)
			map.put("subject_id2_8", subject_id2_8);
		if(teacher_id2_9 != null)
			map.put("teacher_id2_9", teacher_id2_9);
		if(subject_id2_9 != null)
			map.put("subject_id2_9", subject_id2_9);
		if(teacher_id3_1 != null)
			map.put("teacher_id3_1", teacher_id3_1);
		if(subject_id3_1 != null)
			map.put("subject_id3_1", subject_id3_1);
		if(teacher_id3_2 != null)
			map.put("teacher_id3_2", teacher_id3_2);
		if(subject_id3_2 != null)
			map.put("subject_id3_2", subject_id3_2);
		if(teacher_id3_3 != null)
			map.put("teacher_id3_3", teacher_id3_3);
		if(subject_id3_3 != null)
			map.put("subject_id3_3", subject_id3_3);
		if(teacher_id3_4 != null)
			map.put("teacher_id3_4", teacher_id3_4);
		if(subject_id3_4 != null)
			map.put("subject_id3_4", subject_id3_4);
		if(teacher_id3_5 != null)
			map.put("teacher_id3_5", teacher_id3_5);
		if(subject_id3_5 != null)
			map.put("subject_id3_5", subject_id3_5);
		if(teacher_id3_6 != null)
			map.put("teacher_id3_6", teacher_id3_6);
		if(subject_id3_6 != null)
			map.put("subject_id3_6", subject_id3_6);
		if(teacher_id3_7 != null)
			map.put("teacher_id3_7", teacher_id3_7);
		if(subject_id3_7 != null)
			map.put("subject_id3_7", subject_id3_7);
		if(teacher_id3_8 != null)
			map.put("teacher_id3_8", teacher_id3_8);
		if(subject_id3_8 != null)
			map.put("subject_id3_8", subject_id3_8);
		if(teacher_id3_9 != null)
			map.put("teacher_id3_9", teacher_id3_9);
		if(subject_id3_9 != null)
			map.put("subject_id3_9", subject_id3_9);
		if(teacher_id4_1 != null)
			map.put("teacher_id4_1", teacher_id4_1);
		if(subject_id4_1 != null)
			map.put("subject_id4_1", subject_id4_1);
		if(teacher_id4_2 != null)
			map.put("teacher_id4_2", teacher_id4_2);
		if(subject_id4_2 != null)
			map.put("subject_id4_2", subject_id4_2);
		if(teacher_id4_3 != null)
			map.put("teacher_id4_3", teacher_id4_3);
		if(subject_id4_3 != null)
			map.put("subject_id4_3", subject_id4_3);
		if(teacher_id4_4 != null)
			map.put("teacher_id4_4", teacher_id4_4);
		if(subject_id4_4 != null)
			map.put("subject_id4_4", subject_id4_4);
		if(teacher_id4_5 != null)
			map.put("teacher_id4_5", teacher_id4_5);
		if(subject_id4_5 != null)
			map.put("subject_id4_5", subject_id4_5);
		if(teacher_id4_6 != null)
			map.put("teacher_id4_6", teacher_id4_6);
		if(subject_id4_6 != null)
			map.put("subject_id4_6", subject_id4_6);
		if(teacher_id4_7 != null)
			map.put("teacher_id4_7", teacher_id4_7);
		if(subject_id4_7 != null)
			map.put("subject_id4_7", subject_id4_7);
		if(teacher_id4_8 != null)
			map.put("teacher_id4_8", teacher_id4_8);
		if(subject_id4_8 != null)
			map.put("subject_id4_8", subject_id4_8);
		if(teacher_id4_9 != null)
			map.put("teacher_id4_9", teacher_id4_9);
		if(subject_id4_9 != null)
			map.put("subject_id4_9", subject_id4_9);
		if(teacher_id5_1 != null)
			map.put("teacher_id5_1", teacher_id5_1);
		if(subject_id5_1 != null)
			map.put("subject_id5_1", subject_id5_1);
		if(teacher_id5_2 != null)
			map.put("teacher_id5_2", teacher_id5_2);
		if(subject_id5_2 != null)
			map.put("subject_id5_2", subject_id5_2);
		if(teacher_id5_3 != null)
			map.put("teacher_id5_3", teacher_id5_3);
		if(subject_id5_3 != null)
			map.put("subject_id5_3", subject_id5_3);
		if(teacher_id5_4 != null)
			map.put("teacher_id5_4", teacher_id5_4);
		if(subject_id5_4 != null)
			map.put("subject_id5_4", subject_id5_4);
		if(teacher_id5_5 != null)
			map.put("teacher_id5_5", teacher_id5_5);
		if(subject_id5_5 != null)
			map.put("subject_id5_5", subject_id5_5);
		if(teacher_id5_6 != null)
			map.put("teacher_id5_6", teacher_id5_6);
		if(subject_id5_6 != null)
			map.put("subject_id5_6", subject_id5_6);
		if(teacher_id5_7 != null)
			map.put("teacher_id5_7", teacher_id5_7);
		if(subject_id5_7 != null)
			map.put("subject_id5_7", subject_id5_7);
		if(teacher_id5_8 != null)
			map.put("teacher_id5_8", teacher_id5_8);
		if(subject_id5_8 != null)
			map.put("subject_id5_8", subject_id5_8);
		if(teacher_id5_9 != null)
			map.put("teacher_id5_9", teacher_id5_9);
		if(subject_id5_9 != null)
			map.put("subject_id5_9", subject_id5_9);
		if(teacher_id6_1 != null)
			map.put("teacher_id6_1", teacher_id6_1);
		if(subject_id6_1 != null)
			map.put("subject_id6_1", subject_id6_1);
		if(teacher_id6_2 != null)
			map.put("teacher_id6_2", teacher_id6_2);
		if(subject_id6_2 != null)
			map.put("subject_id6_2", subject_id6_2);
		if(teacher_id6_3 != null)
			map.put("teacher_id6_3", teacher_id6_3);
		if(subject_id6_3 != null)
			map.put("subject_id6_3", subject_id6_3);
		if(teacher_id6_4 != null)
			map.put("teacher_id6_4", teacher_id6_4);
		if(subject_id6_4 != null)
			map.put("subject_id6_4", subject_id6_4);
		if(teacher_id6_5 != null)
			map.put("teacher_id6_5", teacher_id6_5);
		if(subject_id6_5 != null)
			map.put("subject_id6_5", subject_id6_5);
		if(teacher_id6_6 != null)
			map.put("teacher_id6_6", teacher_id6_6);
		if(subject_id6_6 != null)
			map.put("subject_id6_6", subject_id6_6);
		if(teacher_id6_7 != null)
			map.put("teacher_id6_7", teacher_id6_7);
		if(subject_id6_7 != null)
			map.put("subject_id6_7", subject_id6_7);
		if(teacher_id6_8 != null)
			map.put("teacher_id6_8", teacher_id6_8);
		if(subject_id6_8 != null)
			map.put("subject_id6_8", subject_id6_8);
		if(teacher_id6_9 != null)
			map.put("teacher_id6_9", teacher_id6_9);
		if(subject_id6_9 != null)
			map.put("subject_id6_9", subject_id6_9);
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
		if(class_name != null)
			map.put("class_name", class_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(section_name != null)
			map.put("section_name", section_name);
		if(days != null)
			map.put("days", days);
		if(periods != null)
			map.put("periods", periods);
		if(teacher_id1_1 != null)
			map.put("teacher_id1_1", teacher_id1_1);
		if(subject_id1_1 != null)
			map.put("subject_id1_1", subject_id1_1);
		if(teacher_id1_2 != null)
			map.put("teacher_id1_2", teacher_id1_2);
		if(subject_id1_2 != null)
			map.put("subject_id1_2", subject_id1_2);
		if(teacher_id1_3 != null)
			map.put("teacher_id1_3", teacher_id1_3);
		if(subject_id1_3 != null)
			map.put("subject_id1_3", subject_id1_3);
		if(teacher_id1_4 != null)
			map.put("teacher_id1_4", teacher_id1_4);
		if(subject_id1_4 != null)
			map.put("subject_id1_4", subject_id1_4);
		if(teacher_id1_5 != null)
			map.put("teacher_id1_5", teacher_id1_5);
		if(subject_id1_5 != null)
			map.put("subject_id1_5", subject_id1_5);
		if(teacher_id1_6 != null)
			map.put("teacher_id1_6", teacher_id1_6);
		if(subject_id1_6 != null)
			map.put("subject_id1_6", subject_id1_6);
		if(teacher_id1_7 != null)
			map.put("teacher_id1_7", teacher_id1_7);
		if(subject_id1_7 != null)
			map.put("subject_id1_7", subject_id1_7);
		if(teacher_id1_8 != null)
			map.put("teacher_id1_8", teacher_id1_8);
		if(subject_id1_8 != null)
			map.put("subject_id1_8", subject_id1_8);
		if(teacher_id1_9 != null)
			map.put("teacher_id1_9", teacher_id1_9);
		if(subject_id1_9 != null)
			map.put("subject_id1_9", subject_id1_9);
		if(teacher_id2_1 != null)
			map.put("teacher_id2_1", teacher_id2_1);
		if(subject_id2_1 != null)
			map.put("subject_id2_1", subject_id2_1);
		if(teacher_id2_2 != null)
			map.put("teacher_id2_2", teacher_id2_2);
		if(subject_id2_2 != null)
			map.put("subject_id2_2", subject_id2_2);
		if(teacher_id2_3 != null)
			map.put("teacher_id2_3", teacher_id2_3);
		if(subject_id2_3 != null)
			map.put("subject_id2_3", subject_id2_3);
		if(teacher_id2_4 != null)
			map.put("teacher_id2_4", teacher_id2_4);
		if(subject_id2_4 != null)
			map.put("subject_id2_4", subject_id2_4);
		if(teacher_id2_5 != null)
			map.put("teacher_id2_5", teacher_id2_5);
		if(subject_id2_5 != null)
			map.put("subject_id2_5", subject_id2_5);
		if(teacher_id2_6 != null)
			map.put("teacher_id2_6", teacher_id2_6);
		if(subject_id2_6 != null)
			map.put("subject_id2_6", subject_id2_6);
		if(teacher_id2_7 != null)
			map.put("teacher_id2_7", teacher_id2_7);
		if(subject_id2_7 != null)
			map.put("subject_id2_7", subject_id2_7);
		if(teacher_id2_8 != null)
			map.put("teacher_id2_8", teacher_id2_8);
		if(subject_id2_8 != null)
			map.put("subject_id2_8", subject_id2_8);
		if(teacher_id2_9 != null)
			map.put("teacher_id2_9", teacher_id2_9);
		if(subject_id2_9 != null)
			map.put("subject_id2_9", subject_id2_9);
		if(teacher_id3_1 != null)
			map.put("teacher_id3_1", teacher_id3_1);
		if(subject_id3_1 != null)
			map.put("subject_id3_1", subject_id3_1);
		if(teacher_id3_2 != null)
			map.put("teacher_id3_2", teacher_id3_2);
		if(subject_id3_2 != null)
			map.put("subject_id3_2", subject_id3_2);
		if(teacher_id3_3 != null)
			map.put("teacher_id3_3", teacher_id3_3);
		if(subject_id3_3 != null)
			map.put("subject_id3_3", subject_id3_3);
		if(teacher_id3_4 != null)
			map.put("teacher_id3_4", teacher_id3_4);
		if(subject_id3_4 != null)
			map.put("subject_id3_4", subject_id3_4);
		if(teacher_id3_5 != null)
			map.put("teacher_id3_5", teacher_id3_5);
		if(subject_id3_5 != null)
			map.put("subject_id3_5", subject_id3_5);
		if(teacher_id3_6 != null)
			map.put("teacher_id3_6", teacher_id3_6);
		if(subject_id3_6 != null)
			map.put("subject_id3_6", subject_id3_6);
		if(teacher_id3_7 != null)
			map.put("teacher_id3_7", teacher_id3_7);
		if(subject_id3_7 != null)
			map.put("subject_id3_7", subject_id3_7);
		if(teacher_id3_8 != null)
			map.put("teacher_id3_8", teacher_id3_8);
		if(subject_id3_8 != null)
			map.put("subject_id3_8", subject_id3_8);
		if(teacher_id3_9 != null)
			map.put("teacher_id3_9", teacher_id3_9);
		if(subject_id3_9 != null)
			map.put("subject_id3_9", subject_id3_9);
		if(teacher_id4_1 != null)
			map.put("teacher_id4_1", teacher_id4_1);
		if(subject_id4_1 != null)
			map.put("subject_id4_1", subject_id4_1);
		if(teacher_id4_2 != null)
			map.put("teacher_id4_2", teacher_id4_2);
		if(subject_id4_2 != null)
			map.put("subject_id4_2", subject_id4_2);
		if(teacher_id4_3 != null)
			map.put("teacher_id4_3", teacher_id4_3);
		if(subject_id4_3 != null)
			map.put("subject_id4_3", subject_id4_3);
		if(teacher_id4_4 != null)
			map.put("teacher_id4_4", teacher_id4_4);
		if(subject_id4_4 != null)
			map.put("subject_id4_4", subject_id4_4);
		if(teacher_id4_5 != null)
			map.put("teacher_id4_5", teacher_id4_5);
		if(subject_id4_5 != null)
			map.put("subject_id4_5", subject_id4_5);
		if(teacher_id4_6 != null)
			map.put("teacher_id4_6", teacher_id4_6);
		if(subject_id4_6 != null)
			map.put("subject_id4_6", subject_id4_6);
		if(teacher_id4_7 != null)
			map.put("teacher_id4_7", teacher_id4_7);
		if(subject_id4_7 != null)
			map.put("subject_id4_7", subject_id4_7);
		if(teacher_id4_8 != null)
			map.put("teacher_id4_8", teacher_id4_8);
		if(subject_id4_8 != null)
			map.put("subject_id4_8", subject_id4_8);
		if(teacher_id4_9 != null)
			map.put("teacher_id4_9", teacher_id4_9);
		if(subject_id4_9 != null)
			map.put("subject_id4_9", subject_id4_9);
		if(teacher_id5_1 != null)
			map.put("teacher_id5_1", teacher_id5_1);
		if(subject_id5_1 != null)
			map.put("subject_id5_1", subject_id5_1);
		if(teacher_id5_2 != null)
			map.put("teacher_id5_2", teacher_id5_2);
		if(subject_id5_2 != null)
			map.put("subject_id5_2", subject_id5_2);
		if(teacher_id5_3 != null)
			map.put("teacher_id5_3", teacher_id5_3);
		if(subject_id5_3 != null)
			map.put("subject_id5_3", subject_id5_3);
		if(teacher_id5_4 != null)
			map.put("teacher_id5_4", teacher_id5_4);
		if(subject_id5_4 != null)
			map.put("subject_id5_4", subject_id5_4);
		if(teacher_id5_5 != null)
			map.put("teacher_id5_5", teacher_id5_5);
		if(subject_id5_5 != null)
			map.put("subject_id5_5", subject_id5_5);
		if(teacher_id5_6 != null)
			map.put("teacher_id5_6", teacher_id5_6);
		if(subject_id5_6 != null)
			map.put("subject_id5_6", subject_id5_6);
		if(teacher_id5_7 != null)
			map.put("teacher_id5_7", teacher_id5_7);
		if(subject_id5_7 != null)
			map.put("subject_id5_7", subject_id5_7);
		if(teacher_id5_8 != null)
			map.put("teacher_id5_8", teacher_id5_8);
		if(subject_id5_8 != null)
			map.put("subject_id5_8", subject_id5_8);
		if(teacher_id5_9 != null)
			map.put("teacher_id5_9", teacher_id5_9);
		if(subject_id5_9 != null)
			map.put("subject_id5_9", subject_id5_9);
		if(teacher_id6_1 != null)
			map.put("teacher_id6_1", teacher_id6_1);
		if(subject_id6_1 != null)
			map.put("subject_id6_1", subject_id6_1);
		if(teacher_id6_2 != null)
			map.put("teacher_id6_2", teacher_id6_2);
		if(subject_id6_2 != null)
			map.put("subject_id6_2", subject_id6_2);
		if(teacher_id6_3 != null)
			map.put("teacher_id6_3", teacher_id6_3);
		if(subject_id6_3 != null)
			map.put("subject_id6_3", subject_id6_3);
		if(teacher_id6_4 != null)
			map.put("teacher_id6_4", teacher_id6_4);
		if(subject_id6_4 != null)
			map.put("subject_id6_4", subject_id6_4);
		if(teacher_id6_5 != null)
			map.put("teacher_id6_5", teacher_id6_5);
		if(subject_id6_5 != null)
			map.put("subject_id6_5", subject_id6_5);
		if(teacher_id6_6 != null)
			map.put("teacher_id6_6", teacher_id6_6);
		if(subject_id6_6 != null)
			map.put("subject_id6_6", subject_id6_6);
		if(teacher_id6_7 != null)
			map.put("teacher_id6_7", teacher_id6_7);
		if(subject_id6_7 != null)
			map.put("subject_id6_7", subject_id6_7);
		if(teacher_id6_8 != null)
			map.put("teacher_id6_8", teacher_id6_8);
		if(subject_id6_8 != null)
			map.put("subject_id6_8", subject_id6_8);
		if(teacher_id6_9 != null)
			map.put("teacher_id6_9", teacher_id6_9);
		if(subject_id6_9 != null)
			map.put("subject_id6_9", subject_id6_9);
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
		class_name = (String) map.get("class_name");
		school_id = (String) map.get("school_id");
		section_name = (String) map.get("section_name");
		days = (Integer) map.get("days");
		periods = (Integer) map.get("periods");
		teacher_id1_1 = (String) map.get("teacher_id1_1");
		subject_id1_1 = (String) map.get("subject_id1_1");
		teacher_id1_2 = (String) map.get("teacher_id1_2");
		subject_id1_2 = (String) map.get("subject_id1_2");
		teacher_id1_3 = (String) map.get("teacher_id1_3");
		subject_id1_3 = (String) map.get("subject_id1_3");
		teacher_id1_4 = (String) map.get("teacher_id1_4");
		subject_id1_4 = (String) map.get("subject_id1_4");
		teacher_id1_5 = (String) map.get("teacher_id1_5");
		subject_id1_5 = (String) map.get("subject_id1_5");
		teacher_id1_6 = (String) map.get("teacher_id1_6");
		subject_id1_6 = (String) map.get("subject_id1_6");
		teacher_id1_7 = (String) map.get("teacher_id1_7");
		subject_id1_7 = (String) map.get("subject_id1_7");
		teacher_id1_8 = (String) map.get("teacher_id1_8");
		subject_id1_8 = (String) map.get("subject_id1_8");
		teacher_id1_9 = (String) map.get("teacher_id1_9");
		subject_id1_9 = (String) map.get("subject_id1_9");
		teacher_id2_1 = (String) map.get("teacher_id2_1");
		subject_id2_1 = (String) map.get("subject_id2_1");
		teacher_id2_2 = (String) map.get("teacher_id2_2");
		subject_id2_2 = (String) map.get("subject_id2_2");
		teacher_id2_3 = (String) map.get("teacher_id2_3");
		subject_id2_3 = (String) map.get("subject_id2_3");
		teacher_id2_4 = (String) map.get("teacher_id2_4");
		subject_id2_4 = (String) map.get("subject_id2_4");
		teacher_id2_5 = (String) map.get("teacher_id2_5");
		subject_id2_5 = (String) map.get("subject_id2_5");
		teacher_id2_6 = (String) map.get("teacher_id2_6");
		subject_id2_6 = (String) map.get("subject_id2_6");
		teacher_id2_7 = (String) map.get("teacher_id2_7");
		subject_id2_7 = (String) map.get("subject_id2_7");
		teacher_id2_8 = (String) map.get("teacher_id2_8");
		subject_id2_8 = (String) map.get("subject_id2_8");
		teacher_id2_9 = (String) map.get("teacher_id2_9");
		subject_id2_9 = (String) map.get("subject_id2_9");
		teacher_id3_1 = (String) map.get("teacher_id3_1");
		subject_id3_1 = (String) map.get("subject_id3_1");
		teacher_id3_2 = (String) map.get("teacher_id3_2");
		subject_id3_2 = (String) map.get("subject_id3_2");
		teacher_id3_3 = (String) map.get("teacher_id3_3");
		subject_id3_3 = (String) map.get("subject_id3_3");
		teacher_id3_4 = (String) map.get("teacher_id3_4");
		subject_id3_4 = (String) map.get("subject_id3_4");
		teacher_id3_5 = (String) map.get("teacher_id3_5");
		subject_id3_5 = (String) map.get("subject_id3_5");
		teacher_id3_6 = (String) map.get("teacher_id3_6");
		subject_id3_6 = (String) map.get("subject_id3_6");
		teacher_id3_7 = (String) map.get("teacher_id3_7");
		subject_id3_7 = (String) map.get("subject_id3_7");
		teacher_id3_8 = (String) map.get("teacher_id3_8");
		subject_id3_8 = (String) map.get("subject_id3_8");
		teacher_id3_9 = (String) map.get("teacher_id3_9");
		subject_id3_9 = (String) map.get("subject_id3_9");
		teacher_id4_1 = (String) map.get("teacher_id4_1");
		subject_id4_1 = (String) map.get("subject_id4_1");
		teacher_id4_2 = (String) map.get("teacher_id4_2");
		subject_id4_2 = (String) map.get("subject_id4_2");
		teacher_id4_3 = (String) map.get("teacher_id4_3");
		subject_id4_3 = (String) map.get("subject_id4_3");
		teacher_id4_4 = (String) map.get("teacher_id4_4");
		subject_id4_4 = (String) map.get("subject_id4_4");
		teacher_id4_5 = (String) map.get("teacher_id4_5");
		subject_id4_5 = (String) map.get("subject_id4_5");
		teacher_id4_6 = (String) map.get("teacher_id4_6");
		subject_id4_6 = (String) map.get("subject_id4_6");
		teacher_id4_7 = (String) map.get("teacher_id4_7");
		subject_id4_7 = (String) map.get("subject_id4_7");
		teacher_id4_8 = (String) map.get("teacher_id4_8");
		subject_id4_8 = (String) map.get("subject_id4_8");
		teacher_id4_9 = (String) map.get("teacher_id4_9");
		subject_id4_9 = (String) map.get("subject_id4_9");
		teacher_id5_1 = (String) map.get("teacher_id5_1");
		subject_id5_1 = (String) map.get("subject_id5_1");
		teacher_id5_2 = (String) map.get("teacher_id5_2");
		subject_id5_2 = (String) map.get("subject_id5_2");
		teacher_id5_3 = (String) map.get("teacher_id5_3");
		subject_id5_3 = (String) map.get("subject_id5_3");
		teacher_id5_4 = (String) map.get("teacher_id5_4");
		subject_id5_4 = (String) map.get("subject_id5_4");
		teacher_id5_5 = (String) map.get("teacher_id5_5");
		subject_id5_5 = (String) map.get("subject_id5_5");
		teacher_id5_6 = (String) map.get("teacher_id5_6");
		subject_id5_6 = (String) map.get("subject_id5_6");
		teacher_id5_7 = (String) map.get("teacher_id5_7");
		subject_id5_7 = (String) map.get("subject_id5_7");
		teacher_id5_8 = (String) map.get("teacher_id5_8");
		subject_id5_8 = (String) map.get("subject_id5_8");
		teacher_id5_9 = (String) map.get("teacher_id5_9");
		subject_id5_9 = (String) map.get("subject_id5_9");
		teacher_id6_1 = (String) map.get("teacher_id6_1");
		subject_id6_1 = (String) map.get("subject_id6_1");
		teacher_id6_2 = (String) map.get("teacher_id6_2");
		subject_id6_2 = (String) map.get("subject_id6_2");
		teacher_id6_3 = (String) map.get("teacher_id6_3");
		subject_id6_3 = (String) map.get("subject_id6_3");
		teacher_id6_4 = (String) map.get("teacher_id6_4");
		subject_id6_4 = (String) map.get("subject_id6_4");
		teacher_id6_5 = (String) map.get("teacher_id6_5");
		subject_id6_5 = (String) map.get("subject_id6_5");
		teacher_id6_6 = (String) map.get("teacher_id6_6");
		subject_id6_6 = (String) map.get("subject_id6_6");
		teacher_id6_7 = (String) map.get("teacher_id6_7");
		subject_id6_7 = (String) map.get("subject_id6_7");
		teacher_id6_8 = (String) map.get("teacher_id6_8");
		subject_id6_8 = (String) map.get("subject_id6_8");
		teacher_id6_9 = (String) map.get("teacher_id6_9");
		subject_id6_9 = (String) map.get("subject_id6_9");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object daysObj = map.get("days");
		if(daysObj != null)
			days = new Integer(daysObj.toString());

		Object periodsObj = map.get("periods");
		if(periodsObj != null)
			periods = new Integer(periodsObj.toString());

		Object teacher_id1_1Obj = map.get("teacher_id1_1");
		if(teacher_id1_1Obj != null)
			teacher_id1_1 = teacher_id1_1Obj.toString();

		Object subject_id1_1Obj = map.get("subject_id1_1");
		if(subject_id1_1Obj != null)
			subject_id1_1 = subject_id1_1Obj.toString();

		Object teacher_id1_2Obj = map.get("teacher_id1_2");
		if(teacher_id1_2Obj != null)
			teacher_id1_2 = teacher_id1_2Obj.toString();

		Object subject_id1_2Obj = map.get("subject_id1_2");
		if(subject_id1_2Obj != null)
			subject_id1_2 = subject_id1_2Obj.toString();

		Object teacher_id1_3Obj = map.get("teacher_id1_3");
		if(teacher_id1_3Obj != null)
			teacher_id1_3 = teacher_id1_3Obj.toString();

		Object subject_id1_3Obj = map.get("subject_id1_3");
		if(subject_id1_3Obj != null)
			subject_id1_3 = subject_id1_3Obj.toString();

		Object teacher_id1_4Obj = map.get("teacher_id1_4");
		if(teacher_id1_4Obj != null)
			teacher_id1_4 = teacher_id1_4Obj.toString();

		Object subject_id1_4Obj = map.get("subject_id1_4");
		if(subject_id1_4Obj != null)
			subject_id1_4 = subject_id1_4Obj.toString();

		Object teacher_id1_5Obj = map.get("teacher_id1_5");
		if(teacher_id1_5Obj != null)
			teacher_id1_5 = teacher_id1_5Obj.toString();

		Object subject_id1_5Obj = map.get("subject_id1_5");
		if(subject_id1_5Obj != null)
			subject_id1_5 = subject_id1_5Obj.toString();

		Object teacher_id1_6Obj = map.get("teacher_id1_6");
		if(teacher_id1_6Obj != null)
			teacher_id1_6 = teacher_id1_6Obj.toString();

		Object subject_id1_6Obj = map.get("subject_id1_6");
		if(subject_id1_6Obj != null)
			subject_id1_6 = subject_id1_6Obj.toString();

		Object teacher_id1_7Obj = map.get("teacher_id1_7");
		if(teacher_id1_7Obj != null)
			teacher_id1_7 = teacher_id1_7Obj.toString();

		Object subject_id1_7Obj = map.get("subject_id1_7");
		if(subject_id1_7Obj != null)
			subject_id1_7 = subject_id1_7Obj.toString();

		Object teacher_id1_8Obj = map.get("teacher_id1_8");
		if(teacher_id1_8Obj != null)
			teacher_id1_8 = teacher_id1_8Obj.toString();

		Object subject_id1_8Obj = map.get("subject_id1_8");
		if(subject_id1_8Obj != null)
			subject_id1_8 = subject_id1_8Obj.toString();

		Object teacher_id1_9Obj = map.get("teacher_id1_9");
		if(teacher_id1_9Obj != null)
			teacher_id1_9 = teacher_id1_9Obj.toString();

		Object subject_id1_9Obj = map.get("subject_id1_9");
		if(subject_id1_9Obj != null)
			subject_id1_9 = subject_id1_9Obj.toString();

		Object teacher_id2_1Obj = map.get("teacher_id2_1");
		if(teacher_id2_1Obj != null)
			teacher_id2_1 = teacher_id2_1Obj.toString();

		Object subject_id2_1Obj = map.get("subject_id2_1");
		if(subject_id2_1Obj != null)
			subject_id2_1 = subject_id2_1Obj.toString();

		Object teacher_id2_2Obj = map.get("teacher_id2_2");
		if(teacher_id2_2Obj != null)
			teacher_id2_2 = teacher_id2_2Obj.toString();

		Object subject_id2_2Obj = map.get("subject_id2_2");
		if(subject_id2_2Obj != null)
			subject_id2_2 = subject_id2_2Obj.toString();

		Object teacher_id2_3Obj = map.get("teacher_id2_3");
		if(teacher_id2_3Obj != null)
			teacher_id2_3 = teacher_id2_3Obj.toString();

		Object subject_id2_3Obj = map.get("subject_id2_3");
		if(subject_id2_3Obj != null)
			subject_id2_3 = subject_id2_3Obj.toString();

		Object teacher_id2_4Obj = map.get("teacher_id2_4");
		if(teacher_id2_4Obj != null)
			teacher_id2_4 = teacher_id2_4Obj.toString();

		Object subject_id2_4Obj = map.get("subject_id2_4");
		if(subject_id2_4Obj != null)
			subject_id2_4 = subject_id2_4Obj.toString();

		Object teacher_id2_5Obj = map.get("teacher_id2_5");
		if(teacher_id2_5Obj != null)
			teacher_id2_5 = teacher_id2_5Obj.toString();

		Object subject_id2_5Obj = map.get("subject_id2_5");
		if(subject_id2_5Obj != null)
			subject_id2_5 = subject_id2_5Obj.toString();

		Object teacher_id2_6Obj = map.get("teacher_id2_6");
		if(teacher_id2_6Obj != null)
			teacher_id2_6 = teacher_id2_6Obj.toString();

		Object subject_id2_6Obj = map.get("subject_id2_6");
		if(subject_id2_6Obj != null)
			subject_id2_6 = subject_id2_6Obj.toString();

		Object teacher_id2_7Obj = map.get("teacher_id2_7");
		if(teacher_id2_7Obj != null)
			teacher_id2_7 = teacher_id2_7Obj.toString();

		Object subject_id2_7Obj = map.get("subject_id2_7");
		if(subject_id2_7Obj != null)
			subject_id2_7 = subject_id2_7Obj.toString();

		Object teacher_id2_8Obj = map.get("teacher_id2_8");
		if(teacher_id2_8Obj != null)
			teacher_id2_8 = teacher_id2_8Obj.toString();

		Object subject_id2_8Obj = map.get("subject_id2_8");
		if(subject_id2_8Obj != null)
			subject_id2_8 = subject_id2_8Obj.toString();

		Object teacher_id2_9Obj = map.get("teacher_id2_9");
		if(teacher_id2_9Obj != null)
			teacher_id2_9 = teacher_id2_9Obj.toString();

		Object subject_id2_9Obj = map.get("subject_id2_9");
		if(subject_id2_9Obj != null)
			subject_id2_9 = subject_id2_9Obj.toString();

		Object teacher_id3_1Obj = map.get("teacher_id3_1");
		if(teacher_id3_1Obj != null)
			teacher_id3_1 = teacher_id3_1Obj.toString();

		Object subject_id3_1Obj = map.get("subject_id3_1");
		if(subject_id3_1Obj != null)
			subject_id3_1 = subject_id3_1Obj.toString();

		Object teacher_id3_2Obj = map.get("teacher_id3_2");
		if(teacher_id3_2Obj != null)
			teacher_id3_2 = teacher_id3_2Obj.toString();

		Object subject_id3_2Obj = map.get("subject_id3_2");
		if(subject_id3_2Obj != null)
			subject_id3_2 = subject_id3_2Obj.toString();

		Object teacher_id3_3Obj = map.get("teacher_id3_3");
		if(teacher_id3_3Obj != null)
			teacher_id3_3 = teacher_id3_3Obj.toString();

		Object subject_id3_3Obj = map.get("subject_id3_3");
		if(subject_id3_3Obj != null)
			subject_id3_3 = subject_id3_3Obj.toString();

		Object teacher_id3_4Obj = map.get("teacher_id3_4");
		if(teacher_id3_4Obj != null)
			teacher_id3_4 = teacher_id3_4Obj.toString();

		Object subject_id3_4Obj = map.get("subject_id3_4");
		if(subject_id3_4Obj != null)
			subject_id3_4 = subject_id3_4Obj.toString();

		Object teacher_id3_5Obj = map.get("teacher_id3_5");
		if(teacher_id3_5Obj != null)
			teacher_id3_5 = teacher_id3_5Obj.toString();

		Object subject_id3_5Obj = map.get("subject_id3_5");
		if(subject_id3_5Obj != null)
			subject_id3_5 = subject_id3_5Obj.toString();

		Object teacher_id3_6Obj = map.get("teacher_id3_6");
		if(teacher_id3_6Obj != null)
			teacher_id3_6 = teacher_id3_6Obj.toString();

		Object subject_id3_6Obj = map.get("subject_id3_6");
		if(subject_id3_6Obj != null)
			subject_id3_6 = subject_id3_6Obj.toString();

		Object teacher_id3_7Obj = map.get("teacher_id3_7");
		if(teacher_id3_7Obj != null)
			teacher_id3_7 = teacher_id3_7Obj.toString();

		Object subject_id3_7Obj = map.get("subject_id3_7");
		if(subject_id3_7Obj != null)
			subject_id3_7 = subject_id3_7Obj.toString();

		Object teacher_id3_8Obj = map.get("teacher_id3_8");
		if(teacher_id3_8Obj != null)
			teacher_id3_8 = teacher_id3_8Obj.toString();

		Object subject_id3_8Obj = map.get("subject_id3_8");
		if(subject_id3_8Obj != null)
			subject_id3_8 = subject_id3_8Obj.toString();

		Object teacher_id3_9Obj = map.get("teacher_id3_9");
		if(teacher_id3_9Obj != null)
			teacher_id3_9 = teacher_id3_9Obj.toString();

		Object subject_id3_9Obj = map.get("subject_id3_9");
		if(subject_id3_9Obj != null)
			subject_id3_9 = subject_id3_9Obj.toString();

		Object teacher_id4_1Obj = map.get("teacher_id4_1");
		if(teacher_id4_1Obj != null)
			teacher_id4_1 = teacher_id4_1Obj.toString();

		Object subject_id4_1Obj = map.get("subject_id4_1");
		if(subject_id4_1Obj != null)
			subject_id4_1 = subject_id4_1Obj.toString();

		Object teacher_id4_2Obj = map.get("teacher_id4_2");
		if(teacher_id4_2Obj != null)
			teacher_id4_2 = teacher_id4_2Obj.toString();

		Object subject_id4_2Obj = map.get("subject_id4_2");
		if(subject_id4_2Obj != null)
			subject_id4_2 = subject_id4_2Obj.toString();

		Object teacher_id4_3Obj = map.get("teacher_id4_3");
		if(teacher_id4_3Obj != null)
			teacher_id4_3 = teacher_id4_3Obj.toString();

		Object subject_id4_3Obj = map.get("subject_id4_3");
		if(subject_id4_3Obj != null)
			subject_id4_3 = subject_id4_3Obj.toString();

		Object teacher_id4_4Obj = map.get("teacher_id4_4");
		if(teacher_id4_4Obj != null)
			teacher_id4_4 = teacher_id4_4Obj.toString();

		Object subject_id4_4Obj = map.get("subject_id4_4");
		if(subject_id4_4Obj != null)
			subject_id4_4 = subject_id4_4Obj.toString();

		Object teacher_id4_5Obj = map.get("teacher_id4_5");
		if(teacher_id4_5Obj != null)
			teacher_id4_5 = teacher_id4_5Obj.toString();

		Object subject_id4_5Obj = map.get("subject_id4_5");
		if(subject_id4_5Obj != null)
			subject_id4_5 = subject_id4_5Obj.toString();

		Object teacher_id4_6Obj = map.get("teacher_id4_6");
		if(teacher_id4_6Obj != null)
			teacher_id4_6 = teacher_id4_6Obj.toString();

		Object subject_id4_6Obj = map.get("subject_id4_6");
		if(subject_id4_6Obj != null)
			subject_id4_6 = subject_id4_6Obj.toString();

		Object teacher_id4_7Obj = map.get("teacher_id4_7");
		if(teacher_id4_7Obj != null)
			teacher_id4_7 = teacher_id4_7Obj.toString();

		Object subject_id4_7Obj = map.get("subject_id4_7");
		if(subject_id4_7Obj != null)
			subject_id4_7 = subject_id4_7Obj.toString();

		Object teacher_id4_8Obj = map.get("teacher_id4_8");
		if(teacher_id4_8Obj != null)
			teacher_id4_8 = teacher_id4_8Obj.toString();

		Object subject_id4_8Obj = map.get("subject_id4_8");
		if(subject_id4_8Obj != null)
			subject_id4_8 = subject_id4_8Obj.toString();

		Object teacher_id4_9Obj = map.get("teacher_id4_9");
		if(teacher_id4_9Obj != null)
			teacher_id4_9 = teacher_id4_9Obj.toString();

		Object subject_id4_9Obj = map.get("subject_id4_9");
		if(subject_id4_9Obj != null)
			subject_id4_9 = subject_id4_9Obj.toString();

		Object teacher_id5_1Obj = map.get("teacher_id5_1");
		if(teacher_id5_1Obj != null)
			teacher_id5_1 = teacher_id5_1Obj.toString();

		Object subject_id5_1Obj = map.get("subject_id5_1");
		if(subject_id5_1Obj != null)
			subject_id5_1 = subject_id5_1Obj.toString();

		Object teacher_id5_2Obj = map.get("teacher_id5_2");
		if(teacher_id5_2Obj != null)
			teacher_id5_2 = teacher_id5_2Obj.toString();

		Object subject_id5_2Obj = map.get("subject_id5_2");
		if(subject_id5_2Obj != null)
			subject_id5_2 = subject_id5_2Obj.toString();

		Object teacher_id5_3Obj = map.get("teacher_id5_3");
		if(teacher_id5_3Obj != null)
			teacher_id5_3 = teacher_id5_3Obj.toString();

		Object subject_id5_3Obj = map.get("subject_id5_3");
		if(subject_id5_3Obj != null)
			subject_id5_3 = subject_id5_3Obj.toString();

		Object teacher_id5_4Obj = map.get("teacher_id5_4");
		if(teacher_id5_4Obj != null)
			teacher_id5_4 = teacher_id5_4Obj.toString();

		Object subject_id5_4Obj = map.get("subject_id5_4");
		if(subject_id5_4Obj != null)
			subject_id5_4 = subject_id5_4Obj.toString();

		Object teacher_id5_5Obj = map.get("teacher_id5_5");
		if(teacher_id5_5Obj != null)
			teacher_id5_5 = teacher_id5_5Obj.toString();

		Object subject_id5_5Obj = map.get("subject_id5_5");
		if(subject_id5_5Obj != null)
			subject_id5_5 = subject_id5_5Obj.toString();

		Object teacher_id5_6Obj = map.get("teacher_id5_6");
		if(teacher_id5_6Obj != null)
			teacher_id5_6 = teacher_id5_6Obj.toString();

		Object subject_id5_6Obj = map.get("subject_id5_6");
		if(subject_id5_6Obj != null)
			subject_id5_6 = subject_id5_6Obj.toString();

		Object teacher_id5_7Obj = map.get("teacher_id5_7");
		if(teacher_id5_7Obj != null)
			teacher_id5_7 = teacher_id5_7Obj.toString();

		Object subject_id5_7Obj = map.get("subject_id5_7");
		if(subject_id5_7Obj != null)
			subject_id5_7 = subject_id5_7Obj.toString();

		Object teacher_id5_8Obj = map.get("teacher_id5_8");
		if(teacher_id5_8Obj != null)
			teacher_id5_8 = teacher_id5_8Obj.toString();

		Object subject_id5_8Obj = map.get("subject_id5_8");
		if(subject_id5_8Obj != null)
			subject_id5_8 = subject_id5_8Obj.toString();

		Object teacher_id5_9Obj = map.get("teacher_id5_9");
		if(teacher_id5_9Obj != null)
			teacher_id5_9 = teacher_id5_9Obj.toString();

		Object subject_id5_9Obj = map.get("subject_id5_9");
		if(subject_id5_9Obj != null)
			subject_id5_9 = subject_id5_9Obj.toString();

		Object teacher_id6_1Obj = map.get("teacher_id6_1");
		if(teacher_id6_1Obj != null)
			teacher_id6_1 = teacher_id6_1Obj.toString();

		Object subject_id6_1Obj = map.get("subject_id6_1");
		if(subject_id6_1Obj != null)
			subject_id6_1 = subject_id6_1Obj.toString();

		Object teacher_id6_2Obj = map.get("teacher_id6_2");
		if(teacher_id6_2Obj != null)
			teacher_id6_2 = teacher_id6_2Obj.toString();

		Object subject_id6_2Obj = map.get("subject_id6_2");
		if(subject_id6_2Obj != null)
			subject_id6_2 = subject_id6_2Obj.toString();

		Object teacher_id6_3Obj = map.get("teacher_id6_3");
		if(teacher_id6_3Obj != null)
			teacher_id6_3 = teacher_id6_3Obj.toString();

		Object subject_id6_3Obj = map.get("subject_id6_3");
		if(subject_id6_3Obj != null)
			subject_id6_3 = subject_id6_3Obj.toString();

		Object teacher_id6_4Obj = map.get("teacher_id6_4");
		if(teacher_id6_4Obj != null)
			teacher_id6_4 = teacher_id6_4Obj.toString();

		Object subject_id6_4Obj = map.get("subject_id6_4");
		if(subject_id6_4Obj != null)
			subject_id6_4 = subject_id6_4Obj.toString();

		Object teacher_id6_5Obj = map.get("teacher_id6_5");
		if(teacher_id6_5Obj != null)
			teacher_id6_5 = teacher_id6_5Obj.toString();

		Object subject_id6_5Obj = map.get("subject_id6_5");
		if(subject_id6_5Obj != null)
			subject_id6_5 = subject_id6_5Obj.toString();

		Object teacher_id6_6Obj = map.get("teacher_id6_6");
		if(teacher_id6_6Obj != null)
			teacher_id6_6 = teacher_id6_6Obj.toString();

		Object subject_id6_6Obj = map.get("subject_id6_6");
		if(subject_id6_6Obj != null)
			subject_id6_6 = subject_id6_6Obj.toString();

		Object teacher_id6_7Obj = map.get("teacher_id6_7");
		if(teacher_id6_7Obj != null)
			teacher_id6_7 = teacher_id6_7Obj.toString();

		Object subject_id6_7Obj = map.get("subject_id6_7");
		if(subject_id6_7Obj != null)
			subject_id6_7 = subject_id6_7Obj.toString();

		Object teacher_id6_8Obj = map.get("teacher_id6_8");
		if(teacher_id6_8Obj != null)
			teacher_id6_8 = teacher_id6_8Obj.toString();

		Object subject_id6_8Obj = map.get("subject_id6_8");
		if(subject_id6_8Obj != null)
			subject_id6_8 = subject_id6_8Obj.toString();

		Object teacher_id6_9Obj = map.get("teacher_id6_9");
		if(teacher_id6_9Obj != null)
			teacher_id6_9 = teacher_id6_9Obj.toString();

		Object subject_id6_9Obj = map.get("subject_id6_9");
		if(subject_id6_9Obj != null)
			subject_id6_9 = subject_id6_9Obj.toString();

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

	public String getClass_name() {
		return class_name;
	}

	public String getClass_nameEx() {
		return class_name != null ? class_name : "";
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public void unSetClass_name() {
		this.class_name = null;
	}

	public String getSchool_id() {
		return school_id;
	}

	public String getSchool_idEx() {
		return school_id != null ? school_id : "";
	}

	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}

	public void unSetSchool_id() {
		this.school_id = null;
	}

	public String getSection_name() {
		return section_name;
	}

	public String getSection_nameEx() {
		return section_name != null ? section_name : "";
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public void unSetSection_name() {
		this.section_name = null;
	}

	public Integer getDays() {
		return days;
	}

	public int getDaysEx() {
		return days != null ? days : 0;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public void unSetDays() {
		this.days = null;
	}

	public Integer getPeriods() {
		return periods;
	}

	public int getPeriodsEx() {
		return periods != null ? periods : 0;
	}

	public void setPeriods(int periods) {
		this.periods = periods;
	}

	public void setPeriods(Integer periods) {
		this.periods = periods;
	}

	public void unSetPeriods() {
		this.periods = null;
	}

	public String getTeacher_id1_1() {
		return teacher_id1_1;
	}

	public String getTeacher_id1_1Ex() {
		return teacher_id1_1 != null ? teacher_id1_1 : "";
	}

	public void setTeacher_id1_1(String teacher_id1_1) {
		this.teacher_id1_1 = teacher_id1_1;
	}

	public void unSetTeacher_id1_1() {
		this.teacher_id1_1 = null;
	}

	public String getSubject_id1_1() {
		return subject_id1_1;
	}

	public String getSubject_id1_1Ex() {
		return subject_id1_1 != null ? subject_id1_1 : "";
	}

	public void setSubject_id1_1(String subject_id1_1) {
		this.subject_id1_1 = subject_id1_1;
	}

	public void unSetSubject_id1_1() {
		this.subject_id1_1 = null;
	}

	public String getTeacher_id1_2() {
		return teacher_id1_2;
	}

	public String getTeacher_id1_2Ex() {
		return teacher_id1_2 != null ? teacher_id1_2 : "";
	}

	public void setTeacher_id1_2(String teacher_id1_2) {
		this.teacher_id1_2 = teacher_id1_2;
	}

	public void unSetTeacher_id1_2() {
		this.teacher_id1_2 = null;
	}

	public String getSubject_id1_2() {
		return subject_id1_2;
	}

	public String getSubject_id1_2Ex() {
		return subject_id1_2 != null ? subject_id1_2 : "";
	}

	public void setSubject_id1_2(String subject_id1_2) {
		this.subject_id1_2 = subject_id1_2;
	}

	public void unSetSubject_id1_2() {
		this.subject_id1_2 = null;
	}

	public String getTeacher_id1_3() {
		return teacher_id1_3;
	}

	public String getTeacher_id1_3Ex() {
		return teacher_id1_3 != null ? teacher_id1_3 : "";
	}

	public void setTeacher_id1_3(String teacher_id1_3) {
		this.teacher_id1_3 = teacher_id1_3;
	}

	public void unSetTeacher_id1_3() {
		this.teacher_id1_3 = null;
	}

	public String getSubject_id1_3() {
		return subject_id1_3;
	}

	public String getSubject_id1_3Ex() {
		return subject_id1_3 != null ? subject_id1_3 : "";
	}

	public void setSubject_id1_3(String subject_id1_3) {
		this.subject_id1_3 = subject_id1_3;
	}

	public void unSetSubject_id1_3() {
		this.subject_id1_3 = null;
	}

	public String getTeacher_id1_4() {
		return teacher_id1_4;
	}

	public String getTeacher_id1_4Ex() {
		return teacher_id1_4 != null ? teacher_id1_4 : "";
	}

	public void setTeacher_id1_4(String teacher_id1_4) {
		this.teacher_id1_4 = teacher_id1_4;
	}

	public void unSetTeacher_id1_4() {
		this.teacher_id1_4 = null;
	}

	public String getSubject_id1_4() {
		return subject_id1_4;
	}

	public String getSubject_id1_4Ex() {
		return subject_id1_4 != null ? subject_id1_4 : "";
	}

	public void setSubject_id1_4(String subject_id1_4) {
		this.subject_id1_4 = subject_id1_4;
	}

	public void unSetSubject_id1_4() {
		this.subject_id1_4 = null;
	}

	public String getTeacher_id1_5() {
		return teacher_id1_5;
	}

	public String getTeacher_id1_5Ex() {
		return teacher_id1_5 != null ? teacher_id1_5 : "";
	}

	public void setTeacher_id1_5(String teacher_id1_5) {
		this.teacher_id1_5 = teacher_id1_5;
	}

	public void unSetTeacher_id1_5() {
		this.teacher_id1_5 = null;
	}

	public String getSubject_id1_5() {
		return subject_id1_5;
	}

	public String getSubject_id1_5Ex() {
		return subject_id1_5 != null ? subject_id1_5 : "";
	}

	public void setSubject_id1_5(String subject_id1_5) {
		this.subject_id1_5 = subject_id1_5;
	}

	public void unSetSubject_id1_5() {
		this.subject_id1_5 = null;
	}

	public String getTeacher_id1_6() {
		return teacher_id1_6;
	}

	public String getTeacher_id1_6Ex() {
		return teacher_id1_6 != null ? teacher_id1_6 : "";
	}

	public void setTeacher_id1_6(String teacher_id1_6) {
		this.teacher_id1_6 = teacher_id1_6;
	}

	public void unSetTeacher_id1_6() {
		this.teacher_id1_6 = null;
	}

	public String getSubject_id1_6() {
		return subject_id1_6;
	}

	public String getSubject_id1_6Ex() {
		return subject_id1_6 != null ? subject_id1_6 : "";
	}

	public void setSubject_id1_6(String subject_id1_6) {
		this.subject_id1_6 = subject_id1_6;
	}

	public void unSetSubject_id1_6() {
		this.subject_id1_6 = null;
	}

	public String getTeacher_id1_7() {
		return teacher_id1_7;
	}

	public String getTeacher_id1_7Ex() {
		return teacher_id1_7 != null ? teacher_id1_7 : "";
	}

	public void setTeacher_id1_7(String teacher_id1_7) {
		this.teacher_id1_7 = teacher_id1_7;
	}

	public void unSetTeacher_id1_7() {
		this.teacher_id1_7 = null;
	}

	public String getSubject_id1_7() {
		return subject_id1_7;
	}

	public String getSubject_id1_7Ex() {
		return subject_id1_7 != null ? subject_id1_7 : "";
	}

	public void setSubject_id1_7(String subject_id1_7) {
		this.subject_id1_7 = subject_id1_7;
	}

	public void unSetSubject_id1_7() {
		this.subject_id1_7 = null;
	}

	public String getTeacher_id1_8() {
		return teacher_id1_8;
	}

	public String getTeacher_id1_8Ex() {
		return teacher_id1_8 != null ? teacher_id1_8 : "";
	}

	public void setTeacher_id1_8(String teacher_id1_8) {
		this.teacher_id1_8 = teacher_id1_8;
	}

	public void unSetTeacher_id1_8() {
		this.teacher_id1_8 = null;
	}

	public String getSubject_id1_8() {
		return subject_id1_8;
	}

	public String getSubject_id1_8Ex() {
		return subject_id1_8 != null ? subject_id1_8 : "";
	}

	public void setSubject_id1_8(String subject_id1_8) {
		this.subject_id1_8 = subject_id1_8;
	}

	public void unSetSubject_id1_8() {
		this.subject_id1_8 = null;
	}

	public String getTeacher_id1_9() {
		return teacher_id1_9;
	}

	public String getTeacher_id1_9Ex() {
		return teacher_id1_9 != null ? teacher_id1_9 : "";
	}

	public void setTeacher_id1_9(String teacher_id1_9) {
		this.teacher_id1_9 = teacher_id1_9;
	}

	public void unSetTeacher_id1_9() {
		this.teacher_id1_9 = null;
	}

	public String getSubject_id1_9() {
		return subject_id1_9;
	}

	public String getSubject_id1_9Ex() {
		return subject_id1_9 != null ? subject_id1_9 : "";
	}

	public void setSubject_id1_9(String subject_id1_9) {
		this.subject_id1_9 = subject_id1_9;
	}

	public void unSetSubject_id1_9() {
		this.subject_id1_9 = null;
	}

	public String getTeacher_id2_1() {
		return teacher_id2_1;
	}

	public String getTeacher_id2_1Ex() {
		return teacher_id2_1 != null ? teacher_id2_1 : "";
	}

	public void setTeacher_id2_1(String teacher_id2_1) {
		this.teacher_id2_1 = teacher_id2_1;
	}

	public void unSetTeacher_id2_1() {
		this.teacher_id2_1 = null;
	}

	public String getSubject_id2_1() {
		return subject_id2_1;
	}

	public String getSubject_id2_1Ex() {
		return subject_id2_1 != null ? subject_id2_1 : "";
	}

	public void setSubject_id2_1(String subject_id2_1) {
		this.subject_id2_1 = subject_id2_1;
	}

	public void unSetSubject_id2_1() {
		this.subject_id2_1 = null;
	}

	public String getTeacher_id2_2() {
		return teacher_id2_2;
	}

	public String getTeacher_id2_2Ex() {
		return teacher_id2_2 != null ? teacher_id2_2 : "";
	}

	public void setTeacher_id2_2(String teacher_id2_2) {
		this.teacher_id2_2 = teacher_id2_2;
	}

	public void unSetTeacher_id2_2() {
		this.teacher_id2_2 = null;
	}

	public String getSubject_id2_2() {
		return subject_id2_2;
	}

	public String getSubject_id2_2Ex() {
		return subject_id2_2 != null ? subject_id2_2 : "";
	}

	public void setSubject_id2_2(String subject_id2_2) {
		this.subject_id2_2 = subject_id2_2;
	}

	public void unSetSubject_id2_2() {
		this.subject_id2_2 = null;
	}

	public String getTeacher_id2_3() {
		return teacher_id2_3;
	}

	public String getTeacher_id2_3Ex() {
		return teacher_id2_3 != null ? teacher_id2_3 : "";
	}

	public void setTeacher_id2_3(String teacher_id2_3) {
		this.teacher_id2_3 = teacher_id2_3;
	}

	public void unSetTeacher_id2_3() {
		this.teacher_id2_3 = null;
	}

	public String getSubject_id2_3() {
		return subject_id2_3;
	}

	public String getSubject_id2_3Ex() {
		return subject_id2_3 != null ? subject_id2_3 : "";
	}

	public void setSubject_id2_3(String subject_id2_3) {
		this.subject_id2_3 = subject_id2_3;
	}

	public void unSetSubject_id2_3() {
		this.subject_id2_3 = null;
	}

	public String getTeacher_id2_4() {
		return teacher_id2_4;
	}

	public String getTeacher_id2_4Ex() {
		return teacher_id2_4 != null ? teacher_id2_4 : "";
	}

	public void setTeacher_id2_4(String teacher_id2_4) {
		this.teacher_id2_4 = teacher_id2_4;
	}

	public void unSetTeacher_id2_4() {
		this.teacher_id2_4 = null;
	}

	public String getSubject_id2_4() {
		return subject_id2_4;
	}

	public String getSubject_id2_4Ex() {
		return subject_id2_4 != null ? subject_id2_4 : "";
	}

	public void setSubject_id2_4(String subject_id2_4) {
		this.subject_id2_4 = subject_id2_4;
	}

	public void unSetSubject_id2_4() {
		this.subject_id2_4 = null;
	}

	public String getTeacher_id2_5() {
		return teacher_id2_5;
	}

	public String getTeacher_id2_5Ex() {
		return teacher_id2_5 != null ? teacher_id2_5 : "";
	}

	public void setTeacher_id2_5(String teacher_id2_5) {
		this.teacher_id2_5 = teacher_id2_5;
	}

	public void unSetTeacher_id2_5() {
		this.teacher_id2_5 = null;
	}

	public String getSubject_id2_5() {
		return subject_id2_5;
	}

	public String getSubject_id2_5Ex() {
		return subject_id2_5 != null ? subject_id2_5 : "";
	}

	public void setSubject_id2_5(String subject_id2_5) {
		this.subject_id2_5 = subject_id2_5;
	}

	public void unSetSubject_id2_5() {
		this.subject_id2_5 = null;
	}

	public String getTeacher_id2_6() {
		return teacher_id2_6;
	}

	public String getTeacher_id2_6Ex() {
		return teacher_id2_6 != null ? teacher_id2_6 : "";
	}

	public void setTeacher_id2_6(String teacher_id2_6) {
		this.teacher_id2_6 = teacher_id2_6;
	}

	public void unSetTeacher_id2_6() {
		this.teacher_id2_6 = null;
	}

	public String getSubject_id2_6() {
		return subject_id2_6;
	}

	public String getSubject_id2_6Ex() {
		return subject_id2_6 != null ? subject_id2_6 : "";
	}

	public void setSubject_id2_6(String subject_id2_6) {
		this.subject_id2_6 = subject_id2_6;
	}

	public void unSetSubject_id2_6() {
		this.subject_id2_6 = null;
	}

	public String getTeacher_id2_7() {
		return teacher_id2_7;
	}

	public String getTeacher_id2_7Ex() {
		return teacher_id2_7 != null ? teacher_id2_7 : "";
	}

	public void setTeacher_id2_7(String teacher_id2_7) {
		this.teacher_id2_7 = teacher_id2_7;
	}

	public void unSetTeacher_id2_7() {
		this.teacher_id2_7 = null;
	}

	public String getSubject_id2_7() {
		return subject_id2_7;
	}

	public String getSubject_id2_7Ex() {
		return subject_id2_7 != null ? subject_id2_7 : "";
	}

	public void setSubject_id2_7(String subject_id2_7) {
		this.subject_id2_7 = subject_id2_7;
	}

	public void unSetSubject_id2_7() {
		this.subject_id2_7 = null;
	}

	public String getTeacher_id2_8() {
		return teacher_id2_8;
	}

	public String getTeacher_id2_8Ex() {
		return teacher_id2_8 != null ? teacher_id2_8 : "";
	}

	public void setTeacher_id2_8(String teacher_id2_8) {
		this.teacher_id2_8 = teacher_id2_8;
	}

	public void unSetTeacher_id2_8() {
		this.teacher_id2_8 = null;
	}

	public String getSubject_id2_8() {
		return subject_id2_8;
	}

	public String getSubject_id2_8Ex() {
		return subject_id2_8 != null ? subject_id2_8 : "";
	}

	public void setSubject_id2_8(String subject_id2_8) {
		this.subject_id2_8 = subject_id2_8;
	}

	public void unSetSubject_id2_8() {
		this.subject_id2_8 = null;
	}

	public String getTeacher_id2_9() {
		return teacher_id2_9;
	}

	public String getTeacher_id2_9Ex() {
		return teacher_id2_9 != null ? teacher_id2_9 : "";
	}

	public void setTeacher_id2_9(String teacher_id2_9) {
		this.teacher_id2_9 = teacher_id2_9;
	}

	public void unSetTeacher_id2_9() {
		this.teacher_id2_9 = null;
	}

	public String getSubject_id2_9() {
		return subject_id2_9;
	}

	public String getSubject_id2_9Ex() {
		return subject_id2_9 != null ? subject_id2_9 : "";
	}

	public void setSubject_id2_9(String subject_id2_9) {
		this.subject_id2_9 = subject_id2_9;
	}

	public void unSetSubject_id2_9() {
		this.subject_id2_9 = null;
	}

	public String getTeacher_id3_1() {
		return teacher_id3_1;
	}

	public String getTeacher_id3_1Ex() {
		return teacher_id3_1 != null ? teacher_id3_1 : "";
	}

	public void setTeacher_id3_1(String teacher_id3_1) {
		this.teacher_id3_1 = teacher_id3_1;
	}

	public void unSetTeacher_id3_1() {
		this.teacher_id3_1 = null;
	}

	public String getSubject_id3_1() {
		return subject_id3_1;
	}

	public String getSubject_id3_1Ex() {
		return subject_id3_1 != null ? subject_id3_1 : "";
	}

	public void setSubject_id3_1(String subject_id3_1) {
		this.subject_id3_1 = subject_id3_1;
	}

	public void unSetSubject_id3_1() {
		this.subject_id3_1 = null;
	}

	public String getTeacher_id3_2() {
		return teacher_id3_2;
	}

	public String getTeacher_id3_2Ex() {
		return teacher_id3_2 != null ? teacher_id3_2 : "";
	}

	public void setTeacher_id3_2(String teacher_id3_2) {
		this.teacher_id3_2 = teacher_id3_2;
	}

	public void unSetTeacher_id3_2() {
		this.teacher_id3_2 = null;
	}

	public String getSubject_id3_2() {
		return subject_id3_2;
	}

	public String getSubject_id3_2Ex() {
		return subject_id3_2 != null ? subject_id3_2 : "";
	}

	public void setSubject_id3_2(String subject_id3_2) {
		this.subject_id3_2 = subject_id3_2;
	}

	public void unSetSubject_id3_2() {
		this.subject_id3_2 = null;
	}

	public String getTeacher_id3_3() {
		return teacher_id3_3;
	}

	public String getTeacher_id3_3Ex() {
		return teacher_id3_3 != null ? teacher_id3_3 : "";
	}

	public void setTeacher_id3_3(String teacher_id3_3) {
		this.teacher_id3_3 = teacher_id3_3;
	}

	public void unSetTeacher_id3_3() {
		this.teacher_id3_3 = null;
	}

	public String getSubject_id3_3() {
		return subject_id3_3;
	}

	public String getSubject_id3_3Ex() {
		return subject_id3_3 != null ? subject_id3_3 : "";
	}

	public void setSubject_id3_3(String subject_id3_3) {
		this.subject_id3_3 = subject_id3_3;
	}

	public void unSetSubject_id3_3() {
		this.subject_id3_3 = null;
	}

	public String getTeacher_id3_4() {
		return teacher_id3_4;
	}

	public String getTeacher_id3_4Ex() {
		return teacher_id3_4 != null ? teacher_id3_4 : "";
	}

	public void setTeacher_id3_4(String teacher_id3_4) {
		this.teacher_id3_4 = teacher_id3_4;
	}

	public void unSetTeacher_id3_4() {
		this.teacher_id3_4 = null;
	}

	public String getSubject_id3_4() {
		return subject_id3_4;
	}

	public String getSubject_id3_4Ex() {
		return subject_id3_4 != null ? subject_id3_4 : "";
	}

	public void setSubject_id3_4(String subject_id3_4) {
		this.subject_id3_4 = subject_id3_4;
	}

	public void unSetSubject_id3_4() {
		this.subject_id3_4 = null;
	}

	public String getTeacher_id3_5() {
		return teacher_id3_5;
	}

	public String getTeacher_id3_5Ex() {
		return teacher_id3_5 != null ? teacher_id3_5 : "";
	}

	public void setTeacher_id3_5(String teacher_id3_5) {
		this.teacher_id3_5 = teacher_id3_5;
	}

	public void unSetTeacher_id3_5() {
		this.teacher_id3_5 = null;
	}

	public String getSubject_id3_5() {
		return subject_id3_5;
	}

	public String getSubject_id3_5Ex() {
		return subject_id3_5 != null ? subject_id3_5 : "";
	}

	public void setSubject_id3_5(String subject_id3_5) {
		this.subject_id3_5 = subject_id3_5;
	}

	public void unSetSubject_id3_5() {
		this.subject_id3_5 = null;
	}

	public String getTeacher_id3_6() {
		return teacher_id3_6;
	}

	public String getTeacher_id3_6Ex() {
		return teacher_id3_6 != null ? teacher_id3_6 : "";
	}

	public void setTeacher_id3_6(String teacher_id3_6) {
		this.teacher_id3_6 = teacher_id3_6;
	}

	public void unSetTeacher_id3_6() {
		this.teacher_id3_6 = null;
	}

	public String getSubject_id3_6() {
		return subject_id3_6;
	}

	public String getSubject_id3_6Ex() {
		return subject_id3_6 != null ? subject_id3_6 : "";
	}

	public void setSubject_id3_6(String subject_id3_6) {
		this.subject_id3_6 = subject_id3_6;
	}

	public void unSetSubject_id3_6() {
		this.subject_id3_6 = null;
	}

	public String getTeacher_id3_7() {
		return teacher_id3_7;
	}

	public String getTeacher_id3_7Ex() {
		return teacher_id3_7 != null ? teacher_id3_7 : "";
	}

	public void setTeacher_id3_7(String teacher_id3_7) {
		this.teacher_id3_7 = teacher_id3_7;
	}

	public void unSetTeacher_id3_7() {
		this.teacher_id3_7 = null;
	}

	public String getSubject_id3_7() {
		return subject_id3_7;
	}

	public String getSubject_id3_7Ex() {
		return subject_id3_7 != null ? subject_id3_7 : "";
	}

	public void setSubject_id3_7(String subject_id3_7) {
		this.subject_id3_7 = subject_id3_7;
	}

	public void unSetSubject_id3_7() {
		this.subject_id3_7 = null;
	}

	public String getTeacher_id3_8() {
		return teacher_id3_8;
	}

	public String getTeacher_id3_8Ex() {
		return teacher_id3_8 != null ? teacher_id3_8 : "";
	}

	public void setTeacher_id3_8(String teacher_id3_8) {
		this.teacher_id3_8 = teacher_id3_8;
	}

	public void unSetTeacher_id3_8() {
		this.teacher_id3_8 = null;
	}

	public String getSubject_id3_8() {
		return subject_id3_8;
	}

	public String getSubject_id3_8Ex() {
		return subject_id3_8 != null ? subject_id3_8 : "";
	}

	public void setSubject_id3_8(String subject_id3_8) {
		this.subject_id3_8 = subject_id3_8;
	}

	public void unSetSubject_id3_8() {
		this.subject_id3_8 = null;
	}

	public String getTeacher_id3_9() {
		return teacher_id3_9;
	}

	public String getTeacher_id3_9Ex() {
		return teacher_id3_9 != null ? teacher_id3_9 : "";
	}

	public void setTeacher_id3_9(String teacher_id3_9) {
		this.teacher_id3_9 = teacher_id3_9;
	}

	public void unSetTeacher_id3_9() {
		this.teacher_id3_9 = null;
	}

	public String getSubject_id3_9() {
		return subject_id3_9;
	}

	public String getSubject_id3_9Ex() {
		return subject_id3_9 != null ? subject_id3_9 : "";
	}

	public void setSubject_id3_9(String subject_id3_9) {
		this.subject_id3_9 = subject_id3_9;
	}

	public void unSetSubject_id3_9() {
		this.subject_id3_9 = null;
	}

	public String getTeacher_id4_1() {
		return teacher_id4_1;
	}

	public String getTeacher_id4_1Ex() {
		return teacher_id4_1 != null ? teacher_id4_1 : "";
	}

	public void setTeacher_id4_1(String teacher_id4_1) {
		this.teacher_id4_1 = teacher_id4_1;
	}

	public void unSetTeacher_id4_1() {
		this.teacher_id4_1 = null;
	}

	public String getSubject_id4_1() {
		return subject_id4_1;
	}

	public String getSubject_id4_1Ex() {
		return subject_id4_1 != null ? subject_id4_1 : "";
	}

	public void setSubject_id4_1(String subject_id4_1) {
		this.subject_id4_1 = subject_id4_1;
	}

	public void unSetSubject_id4_1() {
		this.subject_id4_1 = null;
	}

	public String getTeacher_id4_2() {
		return teacher_id4_2;
	}

	public String getTeacher_id4_2Ex() {
		return teacher_id4_2 != null ? teacher_id4_2 : "";
	}

	public void setTeacher_id4_2(String teacher_id4_2) {
		this.teacher_id4_2 = teacher_id4_2;
	}

	public void unSetTeacher_id4_2() {
		this.teacher_id4_2 = null;
	}

	public String getSubject_id4_2() {
		return subject_id4_2;
	}

	public String getSubject_id4_2Ex() {
		return subject_id4_2 != null ? subject_id4_2 : "";
	}

	public void setSubject_id4_2(String subject_id4_2) {
		this.subject_id4_2 = subject_id4_2;
	}

	public void unSetSubject_id4_2() {
		this.subject_id4_2 = null;
	}

	public String getTeacher_id4_3() {
		return teacher_id4_3;
	}

	public String getTeacher_id4_3Ex() {
		return teacher_id4_3 != null ? teacher_id4_3 : "";
	}

	public void setTeacher_id4_3(String teacher_id4_3) {
		this.teacher_id4_3 = teacher_id4_3;
	}

	public void unSetTeacher_id4_3() {
		this.teacher_id4_3 = null;
	}

	public String getSubject_id4_3() {
		return subject_id4_3;
	}

	public String getSubject_id4_3Ex() {
		return subject_id4_3 != null ? subject_id4_3 : "";
	}

	public void setSubject_id4_3(String subject_id4_3) {
		this.subject_id4_3 = subject_id4_3;
	}

	public void unSetSubject_id4_3() {
		this.subject_id4_3 = null;
	}

	public String getTeacher_id4_4() {
		return teacher_id4_4;
	}

	public String getTeacher_id4_4Ex() {
		return teacher_id4_4 != null ? teacher_id4_4 : "";
	}

	public void setTeacher_id4_4(String teacher_id4_4) {
		this.teacher_id4_4 = teacher_id4_4;
	}

	public void unSetTeacher_id4_4() {
		this.teacher_id4_4 = null;
	}

	public String getSubject_id4_4() {
		return subject_id4_4;
	}

	public String getSubject_id4_4Ex() {
		return subject_id4_4 != null ? subject_id4_4 : "";
	}

	public void setSubject_id4_4(String subject_id4_4) {
		this.subject_id4_4 = subject_id4_4;
	}

	public void unSetSubject_id4_4() {
		this.subject_id4_4 = null;
	}

	public String getTeacher_id4_5() {
		return teacher_id4_5;
	}

	public String getTeacher_id4_5Ex() {
		return teacher_id4_5 != null ? teacher_id4_5 : "";
	}

	public void setTeacher_id4_5(String teacher_id4_5) {
		this.teacher_id4_5 = teacher_id4_5;
	}

	public void unSetTeacher_id4_5() {
		this.teacher_id4_5 = null;
	}

	public String getSubject_id4_5() {
		return subject_id4_5;
	}

	public String getSubject_id4_5Ex() {
		return subject_id4_5 != null ? subject_id4_5 : "";
	}

	public void setSubject_id4_5(String subject_id4_5) {
		this.subject_id4_5 = subject_id4_5;
	}

	public void unSetSubject_id4_5() {
		this.subject_id4_5 = null;
	}

	public String getTeacher_id4_6() {
		return teacher_id4_6;
	}

	public String getTeacher_id4_6Ex() {
		return teacher_id4_6 != null ? teacher_id4_6 : "";
	}

	public void setTeacher_id4_6(String teacher_id4_6) {
		this.teacher_id4_6 = teacher_id4_6;
	}

	public void unSetTeacher_id4_6() {
		this.teacher_id4_6 = null;
	}

	public String getSubject_id4_6() {
		return subject_id4_6;
	}

	public String getSubject_id4_6Ex() {
		return subject_id4_6 != null ? subject_id4_6 : "";
	}

	public void setSubject_id4_6(String subject_id4_6) {
		this.subject_id4_6 = subject_id4_6;
	}

	public void unSetSubject_id4_6() {
		this.subject_id4_6 = null;
	}

	public String getTeacher_id4_7() {
		return teacher_id4_7;
	}

	public String getTeacher_id4_7Ex() {
		return teacher_id4_7 != null ? teacher_id4_7 : "";
	}

	public void setTeacher_id4_7(String teacher_id4_7) {
		this.teacher_id4_7 = teacher_id4_7;
	}

	public void unSetTeacher_id4_7() {
		this.teacher_id4_7 = null;
	}

	public String getSubject_id4_7() {
		return subject_id4_7;
	}

	public String getSubject_id4_7Ex() {
		return subject_id4_7 != null ? subject_id4_7 : "";
	}

	public void setSubject_id4_7(String subject_id4_7) {
		this.subject_id4_7 = subject_id4_7;
	}

	public void unSetSubject_id4_7() {
		this.subject_id4_7 = null;
	}

	public String getTeacher_id4_8() {
		return teacher_id4_8;
	}

	public String getTeacher_id4_8Ex() {
		return teacher_id4_8 != null ? teacher_id4_8 : "";
	}

	public void setTeacher_id4_8(String teacher_id4_8) {
		this.teacher_id4_8 = teacher_id4_8;
	}

	public void unSetTeacher_id4_8() {
		this.teacher_id4_8 = null;
	}

	public String getSubject_id4_8() {
		return subject_id4_8;
	}

	public String getSubject_id4_8Ex() {
		return subject_id4_8 != null ? subject_id4_8 : "";
	}

	public void setSubject_id4_8(String subject_id4_8) {
		this.subject_id4_8 = subject_id4_8;
	}

	public void unSetSubject_id4_8() {
		this.subject_id4_8 = null;
	}

	public String getTeacher_id4_9() {
		return teacher_id4_9;
	}

	public String getTeacher_id4_9Ex() {
		return teacher_id4_9 != null ? teacher_id4_9 : "";
	}

	public void setTeacher_id4_9(String teacher_id4_9) {
		this.teacher_id4_9 = teacher_id4_9;
	}

	public void unSetTeacher_id4_9() {
		this.teacher_id4_9 = null;
	}

	public String getSubject_id4_9() {
		return subject_id4_9;
	}

	public String getSubject_id4_9Ex() {
		return subject_id4_9 != null ? subject_id4_9 : "";
	}

	public void setSubject_id4_9(String subject_id4_9) {
		this.subject_id4_9 = subject_id4_9;
	}

	public void unSetSubject_id4_9() {
		this.subject_id4_9 = null;
	}

	public String getTeacher_id5_1() {
		return teacher_id5_1;
	}

	public String getTeacher_id5_1Ex() {
		return teacher_id5_1 != null ? teacher_id5_1 : "";
	}

	public void setTeacher_id5_1(String teacher_id5_1) {
		this.teacher_id5_1 = teacher_id5_1;
	}

	public void unSetTeacher_id5_1() {
		this.teacher_id5_1 = null;
	}

	public String getSubject_id5_1() {
		return subject_id5_1;
	}

	public String getSubject_id5_1Ex() {
		return subject_id5_1 != null ? subject_id5_1 : "";
	}

	public void setSubject_id5_1(String subject_id5_1) {
		this.subject_id5_1 = subject_id5_1;
	}

	public void unSetSubject_id5_1() {
		this.subject_id5_1 = null;
	}

	public String getTeacher_id5_2() {
		return teacher_id5_2;
	}

	public String getTeacher_id5_2Ex() {
		return teacher_id5_2 != null ? teacher_id5_2 : "";
	}

	public void setTeacher_id5_2(String teacher_id5_2) {
		this.teacher_id5_2 = teacher_id5_2;
	}

	public void unSetTeacher_id5_2() {
		this.teacher_id5_2 = null;
	}

	public String getSubject_id5_2() {
		return subject_id5_2;
	}

	public String getSubject_id5_2Ex() {
		return subject_id5_2 != null ? subject_id5_2 : "";
	}

	public void setSubject_id5_2(String subject_id5_2) {
		this.subject_id5_2 = subject_id5_2;
	}

	public void unSetSubject_id5_2() {
		this.subject_id5_2 = null;
	}

	public String getTeacher_id5_3() {
		return teacher_id5_3;
	}

	public String getTeacher_id5_3Ex() {
		return teacher_id5_3 != null ? teacher_id5_3 : "";
	}

	public void setTeacher_id5_3(String teacher_id5_3) {
		this.teacher_id5_3 = teacher_id5_3;
	}

	public void unSetTeacher_id5_3() {
		this.teacher_id5_3 = null;
	}

	public String getSubject_id5_3() {
		return subject_id5_3;
	}

	public String getSubject_id5_3Ex() {
		return subject_id5_3 != null ? subject_id5_3 : "";
	}

	public void setSubject_id5_3(String subject_id5_3) {
		this.subject_id5_3 = subject_id5_3;
	}

	public void unSetSubject_id5_3() {
		this.subject_id5_3 = null;
	}

	public String getTeacher_id5_4() {
		return teacher_id5_4;
	}

	public String getTeacher_id5_4Ex() {
		return teacher_id5_4 != null ? teacher_id5_4 : "";
	}

	public void setTeacher_id5_4(String teacher_id5_4) {
		this.teacher_id5_4 = teacher_id5_4;
	}

	public void unSetTeacher_id5_4() {
		this.teacher_id5_4 = null;
	}

	public String getSubject_id5_4() {
		return subject_id5_4;
	}

	public String getSubject_id5_4Ex() {
		return subject_id5_4 != null ? subject_id5_4 : "";
	}

	public void setSubject_id5_4(String subject_id5_4) {
		this.subject_id5_4 = subject_id5_4;
	}

	public void unSetSubject_id5_4() {
		this.subject_id5_4 = null;
	}

	public String getTeacher_id5_5() {
		return teacher_id5_5;
	}

	public String getTeacher_id5_5Ex() {
		return teacher_id5_5 != null ? teacher_id5_5 : "";
	}

	public void setTeacher_id5_5(String teacher_id5_5) {
		this.teacher_id5_5 = teacher_id5_5;
	}

	public void unSetTeacher_id5_5() {
		this.teacher_id5_5 = null;
	}

	public String getSubject_id5_5() {
		return subject_id5_5;
	}

	public String getSubject_id5_5Ex() {
		return subject_id5_5 != null ? subject_id5_5 : "";
	}

	public void setSubject_id5_5(String subject_id5_5) {
		this.subject_id5_5 = subject_id5_5;
	}

	public void unSetSubject_id5_5() {
		this.subject_id5_5 = null;
	}

	public String getTeacher_id5_6() {
		return teacher_id5_6;
	}

	public String getTeacher_id5_6Ex() {
		return teacher_id5_6 != null ? teacher_id5_6 : "";
	}

	public void setTeacher_id5_6(String teacher_id5_6) {
		this.teacher_id5_6 = teacher_id5_6;
	}

	public void unSetTeacher_id5_6() {
		this.teacher_id5_6 = null;
	}

	public String getSubject_id5_6() {
		return subject_id5_6;
	}

	public String getSubject_id5_6Ex() {
		return subject_id5_6 != null ? subject_id5_6 : "";
	}

	public void setSubject_id5_6(String subject_id5_6) {
		this.subject_id5_6 = subject_id5_6;
	}

	public void unSetSubject_id5_6() {
		this.subject_id5_6 = null;
	}

	public String getTeacher_id5_7() {
		return teacher_id5_7;
	}

	public String getTeacher_id5_7Ex() {
		return teacher_id5_7 != null ? teacher_id5_7 : "";
	}

	public void setTeacher_id5_7(String teacher_id5_7) {
		this.teacher_id5_7 = teacher_id5_7;
	}

	public void unSetTeacher_id5_7() {
		this.teacher_id5_7 = null;
	}

	public String getSubject_id5_7() {
		return subject_id5_7;
	}

	public String getSubject_id5_7Ex() {
		return subject_id5_7 != null ? subject_id5_7 : "";
	}

	public void setSubject_id5_7(String subject_id5_7) {
		this.subject_id5_7 = subject_id5_7;
	}

	public void unSetSubject_id5_7() {
		this.subject_id5_7 = null;
	}

	public String getTeacher_id5_8() {
		return teacher_id5_8;
	}

	public String getTeacher_id5_8Ex() {
		return teacher_id5_8 != null ? teacher_id5_8 : "";
	}

	public void setTeacher_id5_8(String teacher_id5_8) {
		this.teacher_id5_8 = teacher_id5_8;
	}

	public void unSetTeacher_id5_8() {
		this.teacher_id5_8 = null;
	}

	public String getSubject_id5_8() {
		return subject_id5_8;
	}

	public String getSubject_id5_8Ex() {
		return subject_id5_8 != null ? subject_id5_8 : "";
	}

	public void setSubject_id5_8(String subject_id5_8) {
		this.subject_id5_8 = subject_id5_8;
	}

	public void unSetSubject_id5_8() {
		this.subject_id5_8 = null;
	}

	public String getTeacher_id5_9() {
		return teacher_id5_9;
	}

	public String getTeacher_id5_9Ex() {
		return teacher_id5_9 != null ? teacher_id5_9 : "";
	}

	public void setTeacher_id5_9(String teacher_id5_9) {
		this.teacher_id5_9 = teacher_id5_9;
	}

	public void unSetTeacher_id5_9() {
		this.teacher_id5_9 = null;
	}

	public String getSubject_id5_9() {
		return subject_id5_9;
	}

	public String getSubject_id5_9Ex() {
		return subject_id5_9 != null ? subject_id5_9 : "";
	}

	public void setSubject_id5_9(String subject_id5_9) {
		this.subject_id5_9 = subject_id5_9;
	}

	public void unSetSubject_id5_9() {
		this.subject_id5_9 = null;
	}

	public String getTeacher_id6_1() {
		return teacher_id6_1;
	}

	public String getTeacher_id6_1Ex() {
		return teacher_id6_1 != null ? teacher_id6_1 : "";
	}

	public void setTeacher_id6_1(String teacher_id6_1) {
		this.teacher_id6_1 = teacher_id6_1;
	}

	public void unSetTeacher_id6_1() {
		this.teacher_id6_1 = null;
	}

	public String getSubject_id6_1() {
		return subject_id6_1;
	}

	public String getSubject_id6_1Ex() {
		return subject_id6_1 != null ? subject_id6_1 : "";
	}

	public void setSubject_id6_1(String subject_id6_1) {
		this.subject_id6_1 = subject_id6_1;
	}

	public void unSetSubject_id6_1() {
		this.subject_id6_1 = null;
	}

	public String getTeacher_id6_2() {
		return teacher_id6_2;
	}

	public String getTeacher_id6_2Ex() {
		return teacher_id6_2 != null ? teacher_id6_2 : "";
	}

	public void setTeacher_id6_2(String teacher_id6_2) {
		this.teacher_id6_2 = teacher_id6_2;
	}

	public void unSetTeacher_id6_2() {
		this.teacher_id6_2 = null;
	}

	public String getSubject_id6_2() {
		return subject_id6_2;
	}

	public String getSubject_id6_2Ex() {
		return subject_id6_2 != null ? subject_id6_2 : "";
	}

	public void setSubject_id6_2(String subject_id6_2) {
		this.subject_id6_2 = subject_id6_2;
	}

	public void unSetSubject_id6_2() {
		this.subject_id6_2 = null;
	}

	public String getTeacher_id6_3() {
		return teacher_id6_3;
	}

	public String getTeacher_id6_3Ex() {
		return teacher_id6_3 != null ? teacher_id6_3 : "";
	}

	public void setTeacher_id6_3(String teacher_id6_3) {
		this.teacher_id6_3 = teacher_id6_3;
	}

	public void unSetTeacher_id6_3() {
		this.teacher_id6_3 = null;
	}

	public String getSubject_id6_3() {
		return subject_id6_3;
	}

	public String getSubject_id6_3Ex() {
		return subject_id6_3 != null ? subject_id6_3 : "";
	}

	public void setSubject_id6_3(String subject_id6_3) {
		this.subject_id6_3 = subject_id6_3;
	}

	public void unSetSubject_id6_3() {
		this.subject_id6_3 = null;
	}

	public String getTeacher_id6_4() {
		return teacher_id6_4;
	}

	public String getTeacher_id6_4Ex() {
		return teacher_id6_4 != null ? teacher_id6_4 : "";
	}

	public void setTeacher_id6_4(String teacher_id6_4) {
		this.teacher_id6_4 = teacher_id6_4;
	}

	public void unSetTeacher_id6_4() {
		this.teacher_id6_4 = null;
	}

	public String getSubject_id6_4() {
		return subject_id6_4;
	}

	public String getSubject_id6_4Ex() {
		return subject_id6_4 != null ? subject_id6_4 : "";
	}

	public void setSubject_id6_4(String subject_id6_4) {
		this.subject_id6_4 = subject_id6_4;
	}

	public void unSetSubject_id6_4() {
		this.subject_id6_4 = null;
	}

	public String getTeacher_id6_5() {
		return teacher_id6_5;
	}

	public String getTeacher_id6_5Ex() {
		return teacher_id6_5 != null ? teacher_id6_5 : "";
	}

	public void setTeacher_id6_5(String teacher_id6_5) {
		this.teacher_id6_5 = teacher_id6_5;
	}

	public void unSetTeacher_id6_5() {
		this.teacher_id6_5 = null;
	}

	public String getSubject_id6_5() {
		return subject_id6_5;
	}

	public String getSubject_id6_5Ex() {
		return subject_id6_5 != null ? subject_id6_5 : "";
	}

	public void setSubject_id6_5(String subject_id6_5) {
		this.subject_id6_5 = subject_id6_5;
	}

	public void unSetSubject_id6_5() {
		this.subject_id6_5 = null;
	}

	public String getTeacher_id6_6() {
		return teacher_id6_6;
	}

	public String getTeacher_id6_6Ex() {
		return teacher_id6_6 != null ? teacher_id6_6 : "";
	}

	public void setTeacher_id6_6(String teacher_id6_6) {
		this.teacher_id6_6 = teacher_id6_6;
	}

	public void unSetTeacher_id6_6() {
		this.teacher_id6_6 = null;
	}

	public String getSubject_id6_6() {
		return subject_id6_6;
	}

	public String getSubject_id6_6Ex() {
		return subject_id6_6 != null ? subject_id6_6 : "";
	}

	public void setSubject_id6_6(String subject_id6_6) {
		this.subject_id6_6 = subject_id6_6;
	}

	public void unSetSubject_id6_6() {
		this.subject_id6_6 = null;
	}

	public String getTeacher_id6_7() {
		return teacher_id6_7;
	}

	public String getTeacher_id6_7Ex() {
		return teacher_id6_7 != null ? teacher_id6_7 : "";
	}

	public void setTeacher_id6_7(String teacher_id6_7) {
		this.teacher_id6_7 = teacher_id6_7;
	}

	public void unSetTeacher_id6_7() {
		this.teacher_id6_7 = null;
	}

	public String getSubject_id6_7() {
		return subject_id6_7;
	}

	public String getSubject_id6_7Ex() {
		return subject_id6_7 != null ? subject_id6_7 : "";
	}

	public void setSubject_id6_7(String subject_id6_7) {
		this.subject_id6_7 = subject_id6_7;
	}

	public void unSetSubject_id6_7() {
		this.subject_id6_7 = null;
	}

	public String getTeacher_id6_8() {
		return teacher_id6_8;
	}

	public String getTeacher_id6_8Ex() {
		return teacher_id6_8 != null ? teacher_id6_8 : "";
	}

	public void setTeacher_id6_8(String teacher_id6_8) {
		this.teacher_id6_8 = teacher_id6_8;
	}

	public void unSetTeacher_id6_8() {
		this.teacher_id6_8 = null;
	}

	public String getSubject_id6_8() {
		return subject_id6_8;
	}

	public String getSubject_id6_8Ex() {
		return subject_id6_8 != null ? subject_id6_8 : "";
	}

	public void setSubject_id6_8(String subject_id6_8) {
		this.subject_id6_8 = subject_id6_8;
	}

	public void unSetSubject_id6_8() {
		this.subject_id6_8 = null;
	}

	public String getTeacher_id6_9() {
		return teacher_id6_9;
	}

	public String getTeacher_id6_9Ex() {
		return teacher_id6_9 != null ? teacher_id6_9 : "";
	}

	public void setTeacher_id6_9(String teacher_id6_9) {
		this.teacher_id6_9 = teacher_id6_9;
	}

	public void unSetTeacher_id6_9() {
		this.teacher_id6_9 = null;
	}

	public String getSubject_id6_9() {
		return subject_id6_9;
	}

	public String getSubject_id6_9Ex() {
		return subject_id6_9 != null ? subject_id6_9 : "";
	}

	public void setSubject_id6_9(String subject_id6_9) {
		this.subject_id6_9 = subject_id6_9;
	}

	public void unSetSubject_id6_9() {
		this.subject_id6_9 = null;
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
		return "DB_SCHOOL";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}