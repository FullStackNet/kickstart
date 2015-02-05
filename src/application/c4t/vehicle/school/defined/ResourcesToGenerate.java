/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined;

import platform.defined.ResourceMap;


public class ResourcesToGenerate {
	/*
	 * Define each element in the format of {"<json_file_name>", "<fully_qualified_resource_path_name>","<db_name>"}
	 * json_file_name - specify only the file name without extension
	 * fully_qualified_resource_path_name - not that of generated class but that of extending class. If there is no extending class, leave it null (Ex: Sample)
	 * db_name - instance of DBNameEnum where this resource will stored. null if resource is transient (not stored in DB)
	 * Make sure there is a default constructor (with no args) in the extending class.
	 */
	public static ResourceMap[] resourceMaps =  {
		new ResourceMap("student", "application.c4t.vehicle.school.resource.student"),
		new ResourceMap("school_route_map", "application.c4t.vehicle.school.resource.school_route_map"),
		new ResourceMap("school_route_stopage_map", "application.c4t.vehicle.school.resource.school_route__stopage_map"),
		new ResourceMap("student_map", "application.c4t.vehicle.school.resource.student_map"),
		new ResourceMap("school_user_map", "application.c4t.vehicle.school.resource.school_user_map"),
		new ResourceMap("school_customer_map", "application.c4t.vehicle.school.resource.school_customer_map"),
		new ResourceMap("student_parent", "application.c4t.vehicle.school.resource.student_parent"),
		new ResourceMap("student_detail", "application.c4t.vehicle.school.resource .student_detail"),
		new ResourceMap("school", "application.c4t.vehicle.school.resource.school"),
		new ResourceMap("school_group", "application.c4t.vehicle.school.resource.school_group"),
		new ResourceMap("school_customer", "application.c4t.vehicle.school.resource.school_customer"),
		new ResourceMap("school_customer_admin", "application.c4t.vehicle.school.resource.school_customer_admin"),
		new ResourceMap("school_map", "application.c4t.vehicle.school.resource.school_map"),
		new ResourceMap("teacher", "application.c4t.vehicle.school.resource.teacher"),
		new ResourceMap("teacher_map", "application.c4t.vehicle.school.resource.teacher_map"),
		new ResourceMap("class_section", "application.c4t.vehicle.school.resource.class_section"),
		new ResourceMap("subject", "application.c4t.vehicle.school.resource.subject"),
		new ResourceMap("teacher_subject", "application.c4t.vehicle.school.resource.teacher_subject"),
		new ResourceMap("homework", "application.c4t.vehicle.school.resource.homework"),
		new ResourceMap("home_practice", "application.c4t.vehicle.school.resource.home_practice"),
		new ResourceMap("homework_master", "application.c4t.vehicle.school.resource.homework_master"),
		new ResourceMap("daily_activity", "application.c4t.vehicle.school.resource.daily_activity"),
		new ResourceMap("notice", "application.c4t.vehicle.school.resource.notice"),
		new ResourceMap("absent", "application.c4t.vehicle.school.resource.absent"),
		new ResourceMap("absent_detail", "application.c4t.vehicle.school.resource.absent_detail"),
		new ResourceMap("message2parent", "application.c4t.vehicle.school.resource.message2parent"),
		new ResourceMap("message2parent_conversation", "application.c4t.vehicle.school.resource.message2parent_conversation"),
		new ResourceMap("message2school", "application.c4t.vehicle.school.resource.message2parent"),
		new ResourceMap("message2school_conversation", "application.c4t.vehicle.school.resource.message2parent_conversation"),
		new ResourceMap("proficiency_master", "application.c4t.vehicle.school.resource.proficiency_master"),
		new ResourceMap("proficiency", "application.c4t.vehicle.school.resource.proficiency"),
		new ResourceMap("report_card", "application.c4t.vehicle.school.resource.report_card"),
		new ResourceMap("report_card_generation_request", "application.c4t.vehicle.school.resource.report_card_geneartion_request"),
		new ResourceMap("school_class_section", "application.c4t.vehicle.school.resource.school_class_section"),
		new ResourceMap("topic", "application.c4t.vehicle.school.resource.topic"),
		new ResourceMap("chapter", "application.c4t.vehicle.school.resource.chapter"),
		new ResourceMap("work_sheet", "application.c4t.vehicle.school.resource.work_sheet"),
		new ResourceMap("work_sheet_result", "application.c4t.vehicle.school.resource.work_sheet_result"),
		new ResourceMap("assessment_period", "application.c4t.vehicle.school.resource.assessment_period"),
		new ResourceMap("signature", "application.c4t.vehicle.school.resource.signature"),
		new ResourceMap("school_event", "application.c4t.vehicle.school.resource.school_event"),
		new ResourceMap("present", "application.c4t.vehicle.school.resource.present"),
		new ResourceMap("present_detail", "application.c4t.vehicle.school.resource.present_detail"),
		new ResourceMap("news", "application.c4t.vehicle.school.resource.news"),		
		new ResourceMap("parenting", "application.c4t.vehicle.school.resource.parenting"),		
		new ResourceMap("medical_record", "application.c4t.vehicle.school.resource.medical_record"),		
		new ResourceMap("medical_record_date_wise", "application.c4t.vehicle.school.resource.medical_record_date_wise"),		
		new ResourceMap("school_timing", "application.c4t.vehicle.school.resource.school_timing"),		
		new ResourceMap("trip_student_detail", "application.c4t.vehicle.school.resource.trip_student_detail"),		
		new ResourceMap("staff", "application.c4t.vehicle.school.resource.staff"),		
		new ResourceMap("designation", "application.c4t.vehicle.school.resource.designation"),		
		new ResourceMap("department", "application.c4t.vehicle.school.resource.department"),		
		new ResourceMap("staff_present", "application.c4t.vehicle.school.resource.staff_present"),		
		new ResourceMap("staff_present_detail", "application.c4t.vehicle.school.resource.staff_present_detail"),		
		new ResourceMap("staff_timing", "application.c4t.vehicle.school.resource.staff_timing"),		
		new ResourceMap("direct_message", "application.c4t.vehicle.school.resource.direct_message"),		

	};
}
