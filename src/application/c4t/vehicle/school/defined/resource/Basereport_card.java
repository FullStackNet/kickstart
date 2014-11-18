/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basereport_card extends BaseResource {
	private String id = null;
	private String accessment_for = null;
	private String admission_no = null;
	private String admission_date_str = null;
	private String school_name = null;
	private String school_id = null;
	private String student_id = null;
	private String student_name = null;
	private String father_name = null;
	private String mother_name = null;
	private String other_name = null;
	private String class_name = null;
	private String section_name = null;
	private String dob = null;
	private String class_section_name = null;
	private String customer_id = null;
	private String assessment_date = null;
	private String report_card_date = null;
	private String accessment_type = null;
	private String literacy_and_langauage_development = null;
	private String numerical_and_logical_development = null;
	private String knowledge_and_social_development = null;
	private String art_and_craft = null;
	private String extersize_of_practical_life = null;
	private String classroom_methodology_remark = null;
	private String sensorial = null;
	private String arithmetic = null;
	private String language = null;
	private String science = null;
	private String montessory_methodology_remark = null;
	private String interactive_white_board = null;
	private String interactive_white_board_remark = null;
	private String thematic_teaching = null;
	private String thematic_teaching_remark = null;
	private String thematic_celebration = null;
	private String event = null;
	private String organized_games = null;
	private String music_and_dance = null;
	private String exercise_yoga_drill = null;
	private String extra_activity_remark = null;
	private String height = null;
	private String weight = null;
	private Integer attendance_total_days = null;
	private Integer attendance_present_days = null;
	private String general_remark = null;
	private String templete_type = null;
	private String teacher_signature_id = null;
	private String centre_head_signature_id = null;
	private String acedemic_counselor_signature_id = null;
	private String generated = null;
	private String generation_status = null;
	private String locked = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ACCESSMENT_FOR = "accessment_for";
	public static String FIELD_ADMISSION_NO = "admission_no";
	public static String FIELD_ADMISSION_DATE_STR = "admission_date_str";
	public static String FIELD_SCHOOL_NAME = "school_name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_STUDENT_NAME = "student_name";
	public static String FIELD_FATHER_NAME = "father_name";
	public static String FIELD_MOTHER_NAME = "mother_name";
	public static String FIELD_OTHER_NAME = "other_name";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_DOB = "dob";
	public static String FIELD_CLASS_SECTION_NAME = "class_section_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_ASSESSMENT_DATE = "assessment_date";
	public static String FIELD_REPORT_CARD_DATE = "report_card_date";
	public static String FIELD_ACCESSMENT_TYPE = "accessment_type";
	public static String FIELD_LITERACY_AND_LANGAUAGE_DEVELOPMENT = "literacy_and_langauage_development";
	public static String FIELD_NUMERICAL_AND_LOGICAL_DEVELOPMENT = "numerical_and_logical_development";
	public static String FIELD_KNOWLEDGE_AND_SOCIAL_DEVELOPMENT = "knowledge_and_social_development";
	public static String FIELD_ART_AND_CRAFT = "art_and_craft";
	public static String FIELD_EXTERSIZE_OF_PRACTICAL_LIFE = "extersize_of_practical_life";
	public static String FIELD_CLASSROOM_METHODOLOGY_REMARK = "classroom_methodology_remark";
	public static String FIELD_SENSORIAL = "sensorial";
	public static String FIELD_ARITHMETIC = "arithmetic";
	public static String FIELD_LANGUAGE = "language";
	public static String FIELD_SCIENCE = "science";
	public static String FIELD_MONTESSORY_METHODOLOGY_REMARK = "montessory_methodology_remark";
	public static String FIELD_INTERACTIVE_WHITE_BOARD = "interactive_white_board";
	public static String FIELD_INTERACTIVE_WHITE_BOARD_REMARK = "interactive_white_board_remark";
	public static String FIELD_THEMATIC_TEACHING = "thematic_teaching";
	public static String FIELD_THEMATIC_TEACHING_REMARK = "thematic_teaching_remark";
	public static String FIELD_THEMATIC_CELEBRATION = "thematic_celebration";
	public static String FIELD_EVENT = "event";
	public static String FIELD_ORGANIZED_GAMES = "organized_games";
	public static String FIELD_MUSIC_AND_DANCE = "music_and_dance";
	public static String FIELD_EXERCISE_YOGA_DRILL = "exercise_yoga_drill";
	public static String FIELD_EXTRA_ACTIVITY_REMARK = "extra_activity_remark";
	public static String FIELD_HEIGHT = "height";
	public static String FIELD_WEIGHT = "weight";
	public static String FIELD_ATTENDANCE_TOTAL_DAYS = "attendance_total_days";
	public static String FIELD_ATTENDANCE_PRESENT_DAYS = "attendance_present_days";
	public static String FIELD_GENERAL_REMARK = "general_remark";
	public static String FIELD_TEMPLETE_TYPE = "templete_type";
	public static String FIELD_TEACHER_SIGNATURE_ID = "teacher_signature_id";
	public static String FIELD_CENTRE_HEAD_SIGNATURE_ID = "centre_head_signature_id";
	public static String FIELD_ACEDEMIC_COUNSELOR_SIGNATURE_ID = "acedemic_counselor_signature_id";
	public static String FIELD_GENERATED = "generated";
	public static String FIELD_GENERATION_STATUS = "generation_status";
	public static String FIELD_LOCKED = "locked";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("report_card");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field accessment_forField = new Field("accessment_for", "String");
		accessment_forField.setLength(128);
		metaData.addField(accessment_forField);

		Field admission_noField = new Field("admission_no", "String");
		admission_noField.setLength(32);
		metaData.addField(admission_noField);

		Field admission_date_strField = new Field("admission_date_str", "String");
		admission_date_strField.setLength(32);
		metaData.addField(admission_date_strField);

		Field school_nameField = new Field("school_name", "String");
		school_nameField.setIndexed(true);
		school_nameField.setLength(128);
		metaData.addField(school_nameField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setIndexed(true);
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field student_nameField = new Field("student_name", "String");
		student_nameField.setIndexed(true);
		student_nameField.setLength(128);
		metaData.addField(student_nameField);

		Field father_nameField = new Field("father_name", "String");
		father_nameField.setLength(128);
		metaData.addField(father_nameField);

		Field mother_nameField = new Field("mother_name", "String");
		mother_nameField.setLength(128);
		metaData.addField(mother_nameField);

		Field other_nameField = new Field("other_name", "String");
		other_nameField.setLength(128);
		metaData.addField(other_nameField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(16);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(16);
		metaData.addField(section_nameField);

		Field dobField = new Field("dob", "String");
		dobField.setLength(16);
		metaData.addField(dobField);

		Field class_section_nameField = new Field("class_section_name", "String");
		class_section_nameField.setIndexed(true);
		class_section_nameField.setLength(32);
		metaData.addField(class_section_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field assessment_dateField = new Field("assessment_date", "String");
		assessment_dateField.setLength(32);
		metaData.addField(assessment_dateField);

		Field report_card_dateField = new Field("report_card_date", "String");
		report_card_dateField.setLength(32);
		metaData.addField(report_card_dateField);

		Field accessment_typeField = new Field("accessment_type", "String");
		accessment_typeField.setLength(32);
		metaData.addField(accessment_typeField);

		Field literacy_and_langauage_developmentField = new Field("literacy_and_langauage_development", "String");
		literacy_and_langauage_developmentField.setLength(32);
		metaData.addField(literacy_and_langauage_developmentField);

		Field numerical_and_logical_developmentField = new Field("numerical_and_logical_development", "String");
		numerical_and_logical_developmentField.setLength(32);
		metaData.addField(numerical_and_logical_developmentField);

		Field knowledge_and_social_developmentField = new Field("knowledge_and_social_development", "String");
		knowledge_and_social_developmentField.setLength(32);
		metaData.addField(knowledge_and_social_developmentField);

		Field art_and_craftField = new Field("art_and_craft", "String");
		art_and_craftField.setLength(32);
		metaData.addField(art_and_craftField);

		Field extersize_of_practical_lifeField = new Field("extersize_of_practical_life", "String");
		extersize_of_practical_lifeField.setLength(32);
		metaData.addField(extersize_of_practical_lifeField);

		Field classroom_methodology_remarkField = new Field("classroom_methodology_remark", "String");
		classroom_methodology_remarkField.setLength(512);
		metaData.addField(classroom_methodology_remarkField);

		Field sensorialField = new Field("sensorial", "String");
		sensorialField.setLength(32);
		metaData.addField(sensorialField);

		Field arithmeticField = new Field("arithmetic", "String");
		arithmeticField.setLength(32);
		metaData.addField(arithmeticField);

		Field languageField = new Field("language", "String");
		languageField.setLength(32);
		metaData.addField(languageField);

		Field scienceField = new Field("science", "String");
		scienceField.setLength(32);
		metaData.addField(scienceField);

		Field montessory_methodology_remarkField = new Field("montessory_methodology_remark", "String");
		montessory_methodology_remarkField.setLength(32);
		metaData.addField(montessory_methodology_remarkField);

		Field interactive_white_boardField = new Field("interactive_white_board", "String");
		interactive_white_boardField.setLength(32);
		metaData.addField(interactive_white_boardField);

		Field interactive_white_board_remarkField = new Field("interactive_white_board_remark", "String");
		interactive_white_board_remarkField.setLength(512);
		metaData.addField(interactive_white_board_remarkField);

		Field thematic_teachingField = new Field("thematic_teaching", "String");
		thematic_teachingField.setLength(32);
		metaData.addField(thematic_teachingField);

		Field thematic_teaching_remarkField = new Field("thematic_teaching_remark", "String");
		thematic_teaching_remarkField.setLength(512);
		metaData.addField(thematic_teaching_remarkField);

		Field thematic_celebrationField = new Field("thematic_celebration", "String");
		thematic_celebrationField.setLength(32);
		metaData.addField(thematic_celebrationField);

		Field eventField = new Field("event", "String");
		eventField.setLength(32);
		metaData.addField(eventField);

		Field organized_gamesField = new Field("organized_games", "String");
		organized_gamesField.setLength(32);
		metaData.addField(organized_gamesField);

		Field music_and_danceField = new Field("music_and_dance", "String");
		music_and_danceField.setLength(32);
		metaData.addField(music_and_danceField);

		Field exercise_yoga_drillField = new Field("exercise_yoga_drill", "String");
		exercise_yoga_drillField.setLength(32);
		metaData.addField(exercise_yoga_drillField);

		Field extra_activity_remarkField = new Field("extra_activity_remark", "String");
		extra_activity_remarkField.setLength(512);
		metaData.addField(extra_activity_remarkField);

		Field heightField = new Field("height", "String");
		heightField.setLength(32);
		metaData.addField(heightField);

		Field weightField = new Field("weight", "String");
		weightField.setLength(32);
		metaData.addField(weightField);

		Field attendance_total_daysField = new Field("attendance_total_days", "int");
		metaData.addField(attendance_total_daysField);

		Field attendance_present_daysField = new Field("attendance_present_days", "int");
		metaData.addField(attendance_present_daysField);

		Field general_remarkField = new Field("general_remark", "String");
		general_remarkField.setLength(512);
		metaData.addField(general_remarkField);

		Field templete_typeField = new Field("templete_type", "String");
		templete_typeField.setLength(128);
		metaData.addField(templete_typeField);

		Field teacher_signature_idField = new Field("teacher_signature_id", "String");
		teacher_signature_idField.setLength(128);
		metaData.addField(teacher_signature_idField);

		Field centre_head_signature_idField = new Field("centre_head_signature_id", "String");
		centre_head_signature_idField.setLength(128);
		metaData.addField(centre_head_signature_idField);

		Field acedemic_counselor_signature_idField = new Field("acedemic_counselor_signature_id", "String");
		acedemic_counselor_signature_idField.setLength(128);
		metaData.addField(acedemic_counselor_signature_idField);

		Field generatedField = new Field("generated", "String");
		generatedField.setLength(1);
		metaData.addField(generatedField);

		Field generation_statusField = new Field("generation_status", "String");
		generation_statusField.setLength(32);
		metaData.addField(generation_statusField);

		Field lockedField = new Field("locked", "String");
		lockedField.setLength(1);
		metaData.addField(lockedField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("report_card");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basereport_card() {}

	public Basereport_card(Basereport_card obj) {
		this.id = obj.id;
		this.accessment_for = obj.accessment_for;
		this.admission_no = obj.admission_no;
		this.admission_date_str = obj.admission_date_str;
		this.school_name = obj.school_name;
		this.school_id = obj.school_id;
		this.student_id = obj.student_id;
		this.student_name = obj.student_name;
		this.father_name = obj.father_name;
		this.mother_name = obj.mother_name;
		this.other_name = obj.other_name;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.dob = obj.dob;
		this.class_section_name = obj.class_section_name;
		this.customer_id = obj.customer_id;
		this.assessment_date = obj.assessment_date;
		this.report_card_date = obj.report_card_date;
		this.accessment_type = obj.accessment_type;
		this.literacy_and_langauage_development = obj.literacy_and_langauage_development;
		this.numerical_and_logical_development = obj.numerical_and_logical_development;
		this.knowledge_and_social_development = obj.knowledge_and_social_development;
		this.art_and_craft = obj.art_and_craft;
		this.extersize_of_practical_life = obj.extersize_of_practical_life;
		this.classroom_methodology_remark = obj.classroom_methodology_remark;
		this.sensorial = obj.sensorial;
		this.arithmetic = obj.arithmetic;
		this.language = obj.language;
		this.science = obj.science;
		this.montessory_methodology_remark = obj.montessory_methodology_remark;
		this.interactive_white_board = obj.interactive_white_board;
		this.interactive_white_board_remark = obj.interactive_white_board_remark;
		this.thematic_teaching = obj.thematic_teaching;
		this.thematic_teaching_remark = obj.thematic_teaching_remark;
		this.thematic_celebration = obj.thematic_celebration;
		this.event = obj.event;
		this.organized_games = obj.organized_games;
		this.music_and_dance = obj.music_and_dance;
		this.exercise_yoga_drill = obj.exercise_yoga_drill;
		this.extra_activity_remark = obj.extra_activity_remark;
		this.height = obj.height;
		this.weight = obj.weight;
		this.attendance_total_days = obj.attendance_total_days;
		this.attendance_present_days = obj.attendance_present_days;
		this.general_remark = obj.general_remark;
		this.templete_type = obj.templete_type;
		this.teacher_signature_id = obj.teacher_signature_id;
		this.centre_head_signature_id = obj.centre_head_signature_id;
		this.acedemic_counselor_signature_id = obj.acedemic_counselor_signature_id;
		this.generated = obj.generated;
		this.generation_status = obj.generation_status;
		this.locked = obj.locked;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(accessment_for != null)
			map.put("accessment_for", accessment_for);
		if(admission_no != null)
			map.put("admission_no", admission_no);
		if(admission_date_str != null)
			map.put("admission_date_str", admission_date_str);
		if(school_name != null)
			map.put("school_name", school_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(father_name != null)
			map.put("father_name", father_name);
		if(mother_name != null)
			map.put("mother_name", mother_name);
		if(other_name != null)
			map.put("other_name", other_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(dob != null)
			map.put("dob", dob);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(assessment_date != null)
			map.put("assessment_date", assessment_date);
		if(report_card_date != null)
			map.put("report_card_date", report_card_date);
		if(accessment_type != null)
			map.put("accessment_type", accessment_type);
		if(literacy_and_langauage_development != null)
			map.put("literacy_and_langauage_development", literacy_and_langauage_development);
		if(numerical_and_logical_development != null)
			map.put("numerical_and_logical_development", numerical_and_logical_development);
		if(knowledge_and_social_development != null)
			map.put("knowledge_and_social_development", knowledge_and_social_development);
		if(art_and_craft != null)
			map.put("art_and_craft", art_and_craft);
		if(extersize_of_practical_life != null)
			map.put("extersize_of_practical_life", extersize_of_practical_life);
		if(classroom_methodology_remark != null)
			map.put("classroom_methodology_remark", classroom_methodology_remark);
		if(sensorial != null)
			map.put("sensorial", sensorial);
		if(arithmetic != null)
			map.put("arithmetic", arithmetic);
		if(language != null)
			map.put("language", language);
		if(science != null)
			map.put("science", science);
		if(montessory_methodology_remark != null)
			map.put("montessory_methodology_remark", montessory_methodology_remark);
		if(interactive_white_board != null)
			map.put("interactive_white_board", interactive_white_board);
		if(interactive_white_board_remark != null)
			map.put("interactive_white_board_remark", interactive_white_board_remark);
		if(thematic_teaching != null)
			map.put("thematic_teaching", thematic_teaching);
		if(thematic_teaching_remark != null)
			map.put("thematic_teaching_remark", thematic_teaching_remark);
		if(thematic_celebration != null)
			map.put("thematic_celebration", thematic_celebration);
		if(event != null)
			map.put("event", event);
		if(organized_games != null)
			map.put("organized_games", organized_games);
		if(music_and_dance != null)
			map.put("music_and_dance", music_and_dance);
		if(exercise_yoga_drill != null)
			map.put("exercise_yoga_drill", exercise_yoga_drill);
		if(extra_activity_remark != null)
			map.put("extra_activity_remark", extra_activity_remark);
		if(height != null)
			map.put("height", height);
		if(weight != null)
			map.put("weight", weight);
		if(attendance_total_days != null)
			map.put("attendance_total_days", attendance_total_days);
		if(attendance_present_days != null)
			map.put("attendance_present_days", attendance_present_days);
		if(general_remark != null)
			map.put("general_remark", general_remark);
		if(templete_type != null)
			map.put("templete_type", templete_type);
		if(teacher_signature_id != null)
			map.put("teacher_signature_id", teacher_signature_id);
		if(centre_head_signature_id != null)
			map.put("centre_head_signature_id", centre_head_signature_id);
		if(acedemic_counselor_signature_id != null)
			map.put("acedemic_counselor_signature_id", acedemic_counselor_signature_id);
		if(generated != null)
			map.put("generated", generated);
		if(generation_status != null)
			map.put("generation_status", generation_status);
		if(locked != null)
			map.put("locked", locked);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(accessment_for != null)
			map.put("accessment_for", accessment_for);
		if(admission_no != null)
			map.put("admission_no", admission_no);
		if(admission_date_str != null)
			map.put("admission_date_str", admission_date_str);
		if(school_name != null)
			map.put("school_name", school_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(father_name != null)
			map.put("father_name", father_name);
		if(mother_name != null)
			map.put("mother_name", mother_name);
		if(other_name != null)
			map.put("other_name", other_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(dob != null)
			map.put("dob", dob);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(assessment_date != null)
			map.put("assessment_date", assessment_date);
		if(report_card_date != null)
			map.put("report_card_date", report_card_date);
		if(accessment_type != null)
			map.put("accessment_type", accessment_type);
		if(literacy_and_langauage_development != null)
			map.put("literacy_and_langauage_development", literacy_and_langauage_development);
		if(numerical_and_logical_development != null)
			map.put("numerical_and_logical_development", numerical_and_logical_development);
		if(knowledge_and_social_development != null)
			map.put("knowledge_and_social_development", knowledge_and_social_development);
		if(art_and_craft != null)
			map.put("art_and_craft", art_and_craft);
		if(extersize_of_practical_life != null)
			map.put("extersize_of_practical_life", extersize_of_practical_life);
		if(classroom_methodology_remark != null)
			map.put("classroom_methodology_remark", classroom_methodology_remark);
		if(sensorial != null)
			map.put("sensorial", sensorial);
		if(arithmetic != null)
			map.put("arithmetic", arithmetic);
		if(language != null)
			map.put("language", language);
		if(science != null)
			map.put("science", science);
		if(montessory_methodology_remark != null)
			map.put("montessory_methodology_remark", montessory_methodology_remark);
		if(interactive_white_board != null)
			map.put("interactive_white_board", interactive_white_board);
		if(interactive_white_board_remark != null)
			map.put("interactive_white_board_remark", interactive_white_board_remark);
		if(thematic_teaching != null)
			map.put("thematic_teaching", thematic_teaching);
		if(thematic_teaching_remark != null)
			map.put("thematic_teaching_remark", thematic_teaching_remark);
		if(thematic_celebration != null)
			map.put("thematic_celebration", thematic_celebration);
		if(event != null)
			map.put("event", event);
		if(organized_games != null)
			map.put("organized_games", organized_games);
		if(music_and_dance != null)
			map.put("music_and_dance", music_and_dance);
		if(exercise_yoga_drill != null)
			map.put("exercise_yoga_drill", exercise_yoga_drill);
		if(extra_activity_remark != null)
			map.put("extra_activity_remark", extra_activity_remark);
		if(height != null)
			map.put("height", height);
		if(weight != null)
			map.put("weight", weight);
		if(attendance_total_days != null)
			map.put("attendance_total_days", attendance_total_days);
		if(attendance_present_days != null)
			map.put("attendance_present_days", attendance_present_days);
		if(general_remark != null)
			map.put("general_remark", general_remark);
		if(templete_type != null)
			map.put("templete_type", templete_type);
		if(teacher_signature_id != null)
			map.put("teacher_signature_id", teacher_signature_id);
		if(centre_head_signature_id != null)
			map.put("centre_head_signature_id", centre_head_signature_id);
		if(acedemic_counselor_signature_id != null)
			map.put("acedemic_counselor_signature_id", acedemic_counselor_signature_id);
		if(generated != null)
			map.put("generated", generated);
		if(generation_status != null)
			map.put("generation_status", generation_status);
		if(locked != null)
			map.put("locked", locked);
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
		accessment_for = (String) map.get("accessment_for");
		admission_no = (String) map.get("admission_no");
		admission_date_str = (String) map.get("admission_date_str");
		school_name = (String) map.get("school_name");
		school_id = (String) map.get("school_id");
		student_id = (String) map.get("student_id");
		student_name = (String) map.get("student_name");
		father_name = (String) map.get("father_name");
		mother_name = (String) map.get("mother_name");
		other_name = (String) map.get("other_name");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		dob = (String) map.get("dob");
		class_section_name = (String) map.get("class_section_name");
		customer_id = (String) map.get("customer_id");
		assessment_date = (String) map.get("assessment_date");
		report_card_date = (String) map.get("report_card_date");
		accessment_type = (String) map.get("accessment_type");
		literacy_and_langauage_development = (String) map.get("literacy_and_langauage_development");
		numerical_and_logical_development = (String) map.get("numerical_and_logical_development");
		knowledge_and_social_development = (String) map.get("knowledge_and_social_development");
		art_and_craft = (String) map.get("art_and_craft");
		extersize_of_practical_life = (String) map.get("extersize_of_practical_life");
		classroom_methodology_remark = (String) map.get("classroom_methodology_remark");
		sensorial = (String) map.get("sensorial");
		arithmetic = (String) map.get("arithmetic");
		language = (String) map.get("language");
		science = (String) map.get("science");
		montessory_methodology_remark = (String) map.get("montessory_methodology_remark");
		interactive_white_board = (String) map.get("interactive_white_board");
		interactive_white_board_remark = (String) map.get("interactive_white_board_remark");
		thematic_teaching = (String) map.get("thematic_teaching");
		thematic_teaching_remark = (String) map.get("thematic_teaching_remark");
		thematic_celebration = (String) map.get("thematic_celebration");
		event = (String) map.get("event");
		organized_games = (String) map.get("organized_games");
		music_and_dance = (String) map.get("music_and_dance");
		exercise_yoga_drill = (String) map.get("exercise_yoga_drill");
		extra_activity_remark = (String) map.get("extra_activity_remark");
		height = (String) map.get("height");
		weight = (String) map.get("weight");
		attendance_total_days = (Integer) map.get("attendance_total_days");
		attendance_present_days = (Integer) map.get("attendance_present_days");
		general_remark = (String) map.get("general_remark");
		templete_type = (String) map.get("templete_type");
		teacher_signature_id = (String) map.get("teacher_signature_id");
		centre_head_signature_id = (String) map.get("centre_head_signature_id");
		acedemic_counselor_signature_id = (String) map.get("acedemic_counselor_signature_id");
		generated = (String) map.get("generated");
		generation_status = (String) map.get("generation_status");
		locked = (String) map.get("locked");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object accessment_forObj = map.get("accessment_for");
		if(accessment_forObj != null)
			accessment_for = accessment_forObj.toString();

		Object admission_noObj = map.get("admission_no");
		if(admission_noObj != null)
			admission_no = admission_noObj.toString();

		Object admission_date_strObj = map.get("admission_date_str");
		if(admission_date_strObj != null)
			admission_date_str = admission_date_strObj.toString();

		Object school_nameObj = map.get("school_name");
		if(school_nameObj != null)
			school_name = school_nameObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object student_nameObj = map.get("student_name");
		if(student_nameObj != null)
			student_name = student_nameObj.toString();

		Object father_nameObj = map.get("father_name");
		if(father_nameObj != null)
			father_name = father_nameObj.toString();

		Object mother_nameObj = map.get("mother_name");
		if(mother_nameObj != null)
			mother_name = mother_nameObj.toString();

		Object other_nameObj = map.get("other_name");
		if(other_nameObj != null)
			other_name = other_nameObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object dobObj = map.get("dob");
		if(dobObj != null)
			dob = dobObj.toString();

		Object class_section_nameObj = map.get("class_section_name");
		if(class_section_nameObj != null)
			class_section_name = class_section_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object assessment_dateObj = map.get("assessment_date");
		if(assessment_dateObj != null)
			assessment_date = assessment_dateObj.toString();

		Object report_card_dateObj = map.get("report_card_date");
		if(report_card_dateObj != null)
			report_card_date = report_card_dateObj.toString();

		Object accessment_typeObj = map.get("accessment_type");
		if(accessment_typeObj != null)
			accessment_type = accessment_typeObj.toString();

		Object literacy_and_langauage_developmentObj = map.get("literacy_and_langauage_development");
		if(literacy_and_langauage_developmentObj != null)
			literacy_and_langauage_development = literacy_and_langauage_developmentObj.toString();

		Object numerical_and_logical_developmentObj = map.get("numerical_and_logical_development");
		if(numerical_and_logical_developmentObj != null)
			numerical_and_logical_development = numerical_and_logical_developmentObj.toString();

		Object knowledge_and_social_developmentObj = map.get("knowledge_and_social_development");
		if(knowledge_and_social_developmentObj != null)
			knowledge_and_social_development = knowledge_and_social_developmentObj.toString();

		Object art_and_craftObj = map.get("art_and_craft");
		if(art_and_craftObj != null)
			art_and_craft = art_and_craftObj.toString();

		Object extersize_of_practical_lifeObj = map.get("extersize_of_practical_life");
		if(extersize_of_practical_lifeObj != null)
			extersize_of_practical_life = extersize_of_practical_lifeObj.toString();

		Object classroom_methodology_remarkObj = map.get("classroom_methodology_remark");
		if(classroom_methodology_remarkObj != null)
			classroom_methodology_remark = classroom_methodology_remarkObj.toString();

		Object sensorialObj = map.get("sensorial");
		if(sensorialObj != null)
			sensorial = sensorialObj.toString();

		Object arithmeticObj = map.get("arithmetic");
		if(arithmeticObj != null)
			arithmetic = arithmeticObj.toString();

		Object languageObj = map.get("language");
		if(languageObj != null)
			language = languageObj.toString();

		Object scienceObj = map.get("science");
		if(scienceObj != null)
			science = scienceObj.toString();

		Object montessory_methodology_remarkObj = map.get("montessory_methodology_remark");
		if(montessory_methodology_remarkObj != null)
			montessory_methodology_remark = montessory_methodology_remarkObj.toString();

		Object interactive_white_boardObj = map.get("interactive_white_board");
		if(interactive_white_boardObj != null)
			interactive_white_board = interactive_white_boardObj.toString();

		Object interactive_white_board_remarkObj = map.get("interactive_white_board_remark");
		if(interactive_white_board_remarkObj != null)
			interactive_white_board_remark = interactive_white_board_remarkObj.toString();

		Object thematic_teachingObj = map.get("thematic_teaching");
		if(thematic_teachingObj != null)
			thematic_teaching = thematic_teachingObj.toString();

		Object thematic_teaching_remarkObj = map.get("thematic_teaching_remark");
		if(thematic_teaching_remarkObj != null)
			thematic_teaching_remark = thematic_teaching_remarkObj.toString();

		Object thematic_celebrationObj = map.get("thematic_celebration");
		if(thematic_celebrationObj != null)
			thematic_celebration = thematic_celebrationObj.toString();

		Object eventObj = map.get("event");
		if(eventObj != null)
			event = eventObj.toString();

		Object organized_gamesObj = map.get("organized_games");
		if(organized_gamesObj != null)
			organized_games = organized_gamesObj.toString();

		Object music_and_danceObj = map.get("music_and_dance");
		if(music_and_danceObj != null)
			music_and_dance = music_and_danceObj.toString();

		Object exercise_yoga_drillObj = map.get("exercise_yoga_drill");
		if(exercise_yoga_drillObj != null)
			exercise_yoga_drill = exercise_yoga_drillObj.toString();

		Object extra_activity_remarkObj = map.get("extra_activity_remark");
		if(extra_activity_remarkObj != null)
			extra_activity_remark = extra_activity_remarkObj.toString();

		Object heightObj = map.get("height");
		if(heightObj != null)
			height = heightObj.toString();

		Object weightObj = map.get("weight");
		if(weightObj != null)
			weight = weightObj.toString();

		Object attendance_total_daysObj = map.get("attendance_total_days");
		if(attendance_total_daysObj != null)
			attendance_total_days = new Integer(attendance_total_daysObj.toString());

		Object attendance_present_daysObj = map.get("attendance_present_days");
		if(attendance_present_daysObj != null)
			attendance_present_days = new Integer(attendance_present_daysObj.toString());

		Object general_remarkObj = map.get("general_remark");
		if(general_remarkObj != null)
			general_remark = general_remarkObj.toString();

		Object templete_typeObj = map.get("templete_type");
		if(templete_typeObj != null)
			templete_type = templete_typeObj.toString();

		Object teacher_signature_idObj = map.get("teacher_signature_id");
		if(teacher_signature_idObj != null)
			teacher_signature_id = teacher_signature_idObj.toString();

		Object centre_head_signature_idObj = map.get("centre_head_signature_id");
		if(centre_head_signature_idObj != null)
			centre_head_signature_id = centre_head_signature_idObj.toString();

		Object acedemic_counselor_signature_idObj = map.get("acedemic_counselor_signature_id");
		if(acedemic_counselor_signature_idObj != null)
			acedemic_counselor_signature_id = acedemic_counselor_signature_idObj.toString();

		Object generatedObj = map.get("generated");
		if(generatedObj != null)
			generated = generatedObj.toString();

		Object generation_statusObj = map.get("generation_status");
		if(generation_statusObj != null)
			generation_status = generation_statusObj.toString();

		Object lockedObj = map.get("locked");
		if(lockedObj != null)
			locked = lockedObj.toString();

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

	public String getAccessment_for() {
		return accessment_for;
	}

	public String getAccessment_forEx() {
		return accessment_for != null ? accessment_for : "";
	}

	public void setAccessment_for(String accessment_for) {
		this.accessment_for = accessment_for;
	}

	public void unSetAccessment_for() {
		this.accessment_for = null;
	}

	public String getAdmission_no() {
		return admission_no;
	}

	public String getAdmission_noEx() {
		return admission_no != null ? admission_no : "";
	}

	public void setAdmission_no(String admission_no) {
		this.admission_no = admission_no;
	}

	public void unSetAdmission_no() {
		this.admission_no = null;
	}

	public String getAdmission_date_str() {
		return admission_date_str;
	}

	public String getAdmission_date_strEx() {
		return admission_date_str != null ? admission_date_str : "";
	}

	public void setAdmission_date_str(String admission_date_str) {
		this.admission_date_str = admission_date_str;
	}

	public void unSetAdmission_date_str() {
		this.admission_date_str = null;
	}

	public String getSchool_name() {
		return school_name;
	}

	public String getSchool_nameEx() {
		return school_name != null ? school_name : "";
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public void unSetSchool_name() {
		this.school_name = null;
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

	public String getStudent_id() {
		return student_id;
	}

	public String getStudent_idEx() {
		return student_id != null ? student_id : "";
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public void unSetStudent_id() {
		this.student_id = null;
	}

	public String getStudent_name() {
		return student_name;
	}

	public String getStudent_nameEx() {
		return student_name != null ? student_name : "";
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void unSetStudent_name() {
		this.student_name = null;
	}

	public String getFather_name() {
		return father_name;
	}

	public String getFather_nameEx() {
		return father_name != null ? father_name : "";
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public void unSetFather_name() {
		this.father_name = null;
	}

	public String getMother_name() {
		return mother_name;
	}

	public String getMother_nameEx() {
		return mother_name != null ? mother_name : "";
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public void unSetMother_name() {
		this.mother_name = null;
	}

	public String getOther_name() {
		return other_name;
	}

	public String getOther_nameEx() {
		return other_name != null ? other_name : "";
	}

	public void setOther_name(String other_name) {
		this.other_name = other_name;
	}

	public void unSetOther_name() {
		this.other_name = null;
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

	public String getDob() {
		return dob;
	}

	public String getDobEx() {
		return dob != null ? dob : "";
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void unSetDob() {
		this.dob = null;
	}

	public String getClass_section_name() {
		return class_section_name;
	}

	public String getClass_section_nameEx() {
		return class_section_name != null ? class_section_name : "";
	}

	public void setClass_section_name(String class_section_name) {
		this.class_section_name = class_section_name;
	}

	public void unSetClass_section_name() {
		this.class_section_name = null;
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

	public boolean validateCustomer_id(boolean add) throws ApplicationException {
		if(add && customer_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[customer_id]");
		return customer_id != null;
	}

	public String getAssessment_date() {
		return assessment_date;
	}

	public String getAssessment_dateEx() {
		return assessment_date != null ? assessment_date : "";
	}

	public void setAssessment_date(String assessment_date) {
		this.assessment_date = assessment_date;
	}

	public void unSetAssessment_date() {
		this.assessment_date = null;
	}

	public String getReport_card_date() {
		return report_card_date;
	}

	public String getReport_card_dateEx() {
		return report_card_date != null ? report_card_date : "";
	}

	public void setReport_card_date(String report_card_date) {
		this.report_card_date = report_card_date;
	}

	public void unSetReport_card_date() {
		this.report_card_date = null;
	}

	public String getAccessment_type() {
		return accessment_type;
	}

	public String getAccessment_typeEx() {
		return accessment_type != null ? accessment_type : "";
	}

	public void setAccessment_type(String accessment_type) {
		this.accessment_type = accessment_type;
	}

	public void unSetAccessment_type() {
		this.accessment_type = null;
	}

	public String getLiteracy_and_langauage_development() {
		return literacy_and_langauage_development;
	}

	public String getLiteracy_and_langauage_developmentEx() {
		return literacy_and_langauage_development != null ? literacy_and_langauage_development : "";
	}

	public void setLiteracy_and_langauage_development(String literacy_and_langauage_development) {
		this.literacy_and_langauage_development = literacy_and_langauage_development;
	}

	public void unSetLiteracy_and_langauage_development() {
		this.literacy_and_langauage_development = null;
	}

	public String getNumerical_and_logical_development() {
		return numerical_and_logical_development;
	}

	public String getNumerical_and_logical_developmentEx() {
		return numerical_and_logical_development != null ? numerical_and_logical_development : "";
	}

	public void setNumerical_and_logical_development(String numerical_and_logical_development) {
		this.numerical_and_logical_development = numerical_and_logical_development;
	}

	public void unSetNumerical_and_logical_development() {
		this.numerical_and_logical_development = null;
	}

	public String getKnowledge_and_social_development() {
		return knowledge_and_social_development;
	}

	public String getKnowledge_and_social_developmentEx() {
		return knowledge_and_social_development != null ? knowledge_and_social_development : "";
	}

	public void setKnowledge_and_social_development(String knowledge_and_social_development) {
		this.knowledge_and_social_development = knowledge_and_social_development;
	}

	public void unSetKnowledge_and_social_development() {
		this.knowledge_and_social_development = null;
	}

	public String getArt_and_craft() {
		return art_and_craft;
	}

	public String getArt_and_craftEx() {
		return art_and_craft != null ? art_and_craft : "";
	}

	public void setArt_and_craft(String art_and_craft) {
		this.art_and_craft = art_and_craft;
	}

	public void unSetArt_and_craft() {
		this.art_and_craft = null;
	}

	public String getExtersize_of_practical_life() {
		return extersize_of_practical_life;
	}

	public String getExtersize_of_practical_lifeEx() {
		return extersize_of_practical_life != null ? extersize_of_practical_life : "";
	}

	public void setExtersize_of_practical_life(String extersize_of_practical_life) {
		this.extersize_of_practical_life = extersize_of_practical_life;
	}

	public void unSetExtersize_of_practical_life() {
		this.extersize_of_practical_life = null;
	}

	public String getClassroom_methodology_remark() {
		return classroom_methodology_remark;
	}

	public String getClassroom_methodology_remarkEx() {
		return classroom_methodology_remark != null ? classroom_methodology_remark : "";
	}

	public void setClassroom_methodology_remark(String classroom_methodology_remark) {
		this.classroom_methodology_remark = classroom_methodology_remark;
	}

	public void unSetClassroom_methodology_remark() {
		this.classroom_methodology_remark = null;
	}

	public String getSensorial() {
		return sensorial;
	}

	public String getSensorialEx() {
		return sensorial != null ? sensorial : "";
	}

	public void setSensorial(String sensorial) {
		this.sensorial = sensorial;
	}

	public void unSetSensorial() {
		this.sensorial = null;
	}

	public String getArithmetic() {
		return arithmetic;
	}

	public String getArithmeticEx() {
		return arithmetic != null ? arithmetic : "";
	}

	public void setArithmetic(String arithmetic) {
		this.arithmetic = arithmetic;
	}

	public void unSetArithmetic() {
		this.arithmetic = null;
	}

	public String getLanguage() {
		return language;
	}

	public String getLanguageEx() {
		return language != null ? language : "";
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void unSetLanguage() {
		this.language = null;
	}

	public String getScience() {
		return science;
	}

	public String getScienceEx() {
		return science != null ? science : "";
	}

	public void setScience(String science) {
		this.science = science;
	}

	public void unSetScience() {
		this.science = null;
	}

	public String getMontessory_methodology_remark() {
		return montessory_methodology_remark;
	}

	public String getMontessory_methodology_remarkEx() {
		return montessory_methodology_remark != null ? montessory_methodology_remark : "";
	}

	public void setMontessory_methodology_remark(String montessory_methodology_remark) {
		this.montessory_methodology_remark = montessory_methodology_remark;
	}

	public void unSetMontessory_methodology_remark() {
		this.montessory_methodology_remark = null;
	}

	public String getInteractive_white_board() {
		return interactive_white_board;
	}

	public String getInteractive_white_boardEx() {
		return interactive_white_board != null ? interactive_white_board : "";
	}

	public void setInteractive_white_board(String interactive_white_board) {
		this.interactive_white_board = interactive_white_board;
	}

	public void unSetInteractive_white_board() {
		this.interactive_white_board = null;
	}

	public String getInteractive_white_board_remark() {
		return interactive_white_board_remark;
	}

	public String getInteractive_white_board_remarkEx() {
		return interactive_white_board_remark != null ? interactive_white_board_remark : "";
	}

	public void setInteractive_white_board_remark(String interactive_white_board_remark) {
		this.interactive_white_board_remark = interactive_white_board_remark;
	}

	public void unSetInteractive_white_board_remark() {
		this.interactive_white_board_remark = null;
	}

	public String getThematic_teaching() {
		return thematic_teaching;
	}

	public String getThematic_teachingEx() {
		return thematic_teaching != null ? thematic_teaching : "";
	}

	public void setThematic_teaching(String thematic_teaching) {
		this.thematic_teaching = thematic_teaching;
	}

	public void unSetThematic_teaching() {
		this.thematic_teaching = null;
	}

	public String getThematic_teaching_remark() {
		return thematic_teaching_remark;
	}

	public String getThematic_teaching_remarkEx() {
		return thematic_teaching_remark != null ? thematic_teaching_remark : "";
	}

	public void setThematic_teaching_remark(String thematic_teaching_remark) {
		this.thematic_teaching_remark = thematic_teaching_remark;
	}

	public void unSetThematic_teaching_remark() {
		this.thematic_teaching_remark = null;
	}

	public String getThematic_celebration() {
		return thematic_celebration;
	}

	public String getThematic_celebrationEx() {
		return thematic_celebration != null ? thematic_celebration : "";
	}

	public void setThematic_celebration(String thematic_celebration) {
		this.thematic_celebration = thematic_celebration;
	}

	public void unSetThematic_celebration() {
		this.thematic_celebration = null;
	}

	public String getEvent() {
		return event;
	}

	public String getEventEx() {
		return event != null ? event : "";
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void unSetEvent() {
		this.event = null;
	}

	public String getOrganized_games() {
		return organized_games;
	}

	public String getOrganized_gamesEx() {
		return organized_games != null ? organized_games : "";
	}

	public void setOrganized_games(String organized_games) {
		this.organized_games = organized_games;
	}

	public void unSetOrganized_games() {
		this.organized_games = null;
	}

	public String getMusic_and_dance() {
		return music_and_dance;
	}

	public String getMusic_and_danceEx() {
		return music_and_dance != null ? music_and_dance : "";
	}

	public void setMusic_and_dance(String music_and_dance) {
		this.music_and_dance = music_and_dance;
	}

	public void unSetMusic_and_dance() {
		this.music_and_dance = null;
	}

	public String getExercise_yoga_drill() {
		return exercise_yoga_drill;
	}

	public String getExercise_yoga_drillEx() {
		return exercise_yoga_drill != null ? exercise_yoga_drill : "";
	}

	public void setExercise_yoga_drill(String exercise_yoga_drill) {
		this.exercise_yoga_drill = exercise_yoga_drill;
	}

	public void unSetExercise_yoga_drill() {
		this.exercise_yoga_drill = null;
	}

	public String getExtra_activity_remark() {
		return extra_activity_remark;
	}

	public String getExtra_activity_remarkEx() {
		return extra_activity_remark != null ? extra_activity_remark : "";
	}

	public void setExtra_activity_remark(String extra_activity_remark) {
		this.extra_activity_remark = extra_activity_remark;
	}

	public void unSetExtra_activity_remark() {
		this.extra_activity_remark = null;
	}

	public String getHeight() {
		return height;
	}

	public String getHeightEx() {
		return height != null ? height : "";
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void unSetHeight() {
		this.height = null;
	}

	public String getWeight() {
		return weight;
	}

	public String getWeightEx() {
		return weight != null ? weight : "";
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void unSetWeight() {
		this.weight = null;
	}

	public Integer getAttendance_total_days() {
		return attendance_total_days;
	}

	public int getAttendance_total_daysEx() {
		return attendance_total_days != null ? attendance_total_days : 0;
	}

	public void setAttendance_total_days(int attendance_total_days) {
		this.attendance_total_days = attendance_total_days;
	}

	public void setAttendance_total_days(Integer attendance_total_days) {
		this.attendance_total_days = attendance_total_days;
	}

	public void unSetAttendance_total_days() {
		this.attendance_total_days = null;
	}

	public Integer getAttendance_present_days() {
		return attendance_present_days;
	}

	public int getAttendance_present_daysEx() {
		return attendance_present_days != null ? attendance_present_days : 0;
	}

	public void setAttendance_present_days(int attendance_present_days) {
		this.attendance_present_days = attendance_present_days;
	}

	public void setAttendance_present_days(Integer attendance_present_days) {
		this.attendance_present_days = attendance_present_days;
	}

	public void unSetAttendance_present_days() {
		this.attendance_present_days = null;
	}

	public String getGeneral_remark() {
		return general_remark;
	}

	public String getGeneral_remarkEx() {
		return general_remark != null ? general_remark : "";
	}

	public void setGeneral_remark(String general_remark) {
		this.general_remark = general_remark;
	}

	public void unSetGeneral_remark() {
		this.general_remark = null;
	}

	public String getTemplete_type() {
		return templete_type;
	}

	public String getTemplete_typeEx() {
		return templete_type != null ? templete_type : "";
	}

	public void setTemplete_type(String templete_type) {
		this.templete_type = templete_type;
	}

	public void unSetTemplete_type() {
		this.templete_type = null;
	}

	public String getTeacher_signature_id() {
		return teacher_signature_id;
	}

	public String getTeacher_signature_idEx() {
		return teacher_signature_id != null ? teacher_signature_id : "";
	}

	public void setTeacher_signature_id(String teacher_signature_id) {
		this.teacher_signature_id = teacher_signature_id;
	}

	public void unSetTeacher_signature_id() {
		this.teacher_signature_id = null;
	}

	public String getCentre_head_signature_id() {
		return centre_head_signature_id;
	}

	public String getCentre_head_signature_idEx() {
		return centre_head_signature_id != null ? centre_head_signature_id : "";
	}

	public void setCentre_head_signature_id(String centre_head_signature_id) {
		this.centre_head_signature_id = centre_head_signature_id;
	}

	public void unSetCentre_head_signature_id() {
		this.centre_head_signature_id = null;
	}

	public String getAcedemic_counselor_signature_id() {
		return acedemic_counselor_signature_id;
	}

	public String getAcedemic_counselor_signature_idEx() {
		return acedemic_counselor_signature_id != null ? acedemic_counselor_signature_id : "";
	}

	public void setAcedemic_counselor_signature_id(String acedemic_counselor_signature_id) {
		this.acedemic_counselor_signature_id = acedemic_counselor_signature_id;
	}

	public void unSetAcedemic_counselor_signature_id() {
		this.acedemic_counselor_signature_id = null;
	}

	public String getGenerated() {
		return generated;
	}

	public String getGeneratedEx() {
		return generated != null ? generated : "";
	}

	public void setGenerated(String generated) {
		this.generated = generated;
	}

	public void unSetGenerated() {
		this.generated = null;
	}

	public String getGeneration_status() {
		return generation_status;
	}

	public String getGeneration_statusEx() {
		return generation_status != null ? generation_status : "";
	}

	public void setGeneration_status(String generation_status) {
		this.generation_status = generation_status;
	}

	public void unSetGeneration_status() {
		this.generation_status = null;
	}

	public String getLocked() {
		return locked;
	}

	public String getLockedEx() {
		return locked != null ? locked : "";
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	public void unSetLocked() {
		this.locked = null;
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