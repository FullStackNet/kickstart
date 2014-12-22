/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.brushupskills.defined;

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
		new ResourceMap("candidate", "application.brushupskills.resource.candidate"),
		new ResourceMap("question", "application.brushupskills.resource.question"),
		new ResourceMap("answer", "application.brushupskills.resource.answer"),
		new ResourceMap("question_category", "application.brushupskills.resource.question_category"),		
		new ResourceMap("ask_question", "application.brushupskills.resource.ask_question"),		
		new ResourceMap("workshop", "application.brushupskills.resource.workshop"),		
		new ResourceMap("online_session", "application.brushupskills.resource.online_session"),		
		new ResourceMap("transaction", "application.brushupskills.resource.transaction"),		

	};
}
