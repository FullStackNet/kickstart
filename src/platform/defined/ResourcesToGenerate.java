/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined;


public class ResourcesToGenerate {
	/*
	 * Define each element in the format of {"<json_file_name>", "<fully_qualified_resource_path_name>","<db_name>"}
	 * json_file_name - specify only the file name without extension
	 * fully_qualified_resource_path_name - not that of generated class but that of extending class. If there is no extending class, leave it null (Ex: Sample)
	 * db_name - instance of DBNameEnum where this resource will stored. null if resource is transient (not stored in DB)
	 * Make sure there is a default constructor (with no args) in the extending class.
	 */
	public static ResourceMap[] resourceMaps =  {
		new ResourceMap("activity", "platform.resource.activity"),
		new ResourceMap("alert", "platform.resource.alert"),
		new ResourceMap("appliance", "platform.resource.appliance"),
		new ResourceMap("appliance_make", "platform.resource.appliance_make"),
		new ResourceMap("appliance_model", "platform.resource.appliance_model"),
		new ResourceMap("appliance_map", "platform.resource.appliance_map"),
		new ResourceMap("appliance_part", "platform.resource.appliance_part"),
		new ResourceMap("appliance_type", "platform.resource.appliance_type"),
		new ResourceMap("appliance_time_series", "platform.resource.appliance_time_series"),
		new ResourceMap("appliance_running_log", "platform.resource.appliance_running_log"),
		new ResourceMap("cluster", "platform.resource.cluster"),
		new ResourceMap("controller", "platform.resource.controller"),
		new ResourceMap("customer", "platform.resource.customer"),
		new ResourceMap("customer_map", "platform.resource.customer_map"),
		new ResourceMap("conductor", "platform.resource.conductor"),
		new ResourceMap("device", "platform.resource.device"),
		new ResourceMap("email", "platform.resource.email"),
		new ResourceMap("email_account", "platform.resource.email_account"),
		new ResourceMap("email_map", "platform.resource.email_map"),
		new ResourceMap("feed", "platform.resource.feed"),
		new ResourceMap("gateway", "platform.resource.gateway"),
		new ResourceMap("hardware_vendor", "platform.resource.hardware_vendor"),
		new ResourceMap("mobile_map", "platform.resource.mobile_map"),
		new ResourceMap("profile", "platform.resource.profile"),
		new ResourceMap("register", "platform.resource.register"),
		new ResourceMap("login", "platform.resource.login"),
		new ResourceMap("location", "platform.resource.location"),
		new ResourceMap("managed_object", "platform.resource.managed_object"),
		new ResourceMap("notification", "platform.resource.notification"),
		new ResourceMap("packet", "platform.resource.packet"),
		new ResourceMap("rule", "platform.resource.rule"),
		new ResourceMap("rule_action", "platform.resource.rule_action"),
		new ResourceMap("rule_condition", "platform.resource.rule_condition"),
		new ResourceMap("result", "platform.resource.result"),
		new ResourceMap("sensor", "platform.resource.sensor"),
		new ResourceMap("session", "platform.resource.session"),
		new ResourceMap("sms_account", "platform.resource.sms_account"),
		new ResourceMap("user", "platform.resource.user"),
		new ResourceMap("user_map", "platform.resource.user_map"),
		new ResourceMap("invite", "platform.resource.invite"),
		new ResourceMap("service", "platform.resource.service"),
		new ResourceMap("sim", "platform.resource.sim"),
		new ResourceMap("conversation", "platform.resource.conversation"),
		new ResourceMap("conversation_summary", "platform.resource.conversation_summary"),
		new ResourceMap("feedback", "platform.resource.feedback"),
		new ResourceMap("unsubscribe_email", "platform.resource.unsubscribe_email"),
		new ResourceMap("schedule", "platform.resource.schedule"),
		new ResourceMap("sms_log", "platform.resource.sms_log"),
		new ResourceMap("sms_daily_analysis", "platform.resource.sms_daily_analysis"),
		new ResourceMap("id_card", "platform.resource.id_card"),
					
	};
}
