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
		new ResourceMap("student_parent", "application.c4t.vehicle.school.resource.student_parent"),
		new ResourceMap("student_detail", "application.c4t.vehicle.school.resource.student_detail"),
		new ResourceMap("school", "application.c4t.vehicle.school.resource.school"),
	};
}
