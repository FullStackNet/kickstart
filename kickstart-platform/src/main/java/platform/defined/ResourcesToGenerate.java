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
		new ResourceMap("server", "platform.resource.server"),
		new ResourceMap("member_flat", "platform.resource.member_flat"),
		new ResourceMap("activity", "platform.resource.activity"),
		new ResourceMap("billing_plan", "platform.resource.billing_plan"),
		new ResourceMap("appliance_policy_detail", "platform.resource.appliance_policy_detail"),
		new ResourceMap("appliance_policy", "platform.resource.appliance_policy"),
		new ResourceMap("appliance_group", "platform.resource.appliance_group"),
		new ResourceMap("appliance_group_appliance", "platform.resource.appliance_group_appliance"),
		new ResourceMap("billing_slab_master", "platform.resource.billing_slab_master"),
		new ResourceMap("billing_slab_detail", "platform.resource.billing_slab_detail"),
		new ResourceMap("appliance_plan", "platform.resource.appliance_plan"),
		new ResourceMap("appliance_recharge", "platform.resource.appliance_recharge"),
		new ResourceMap("alert", "platform.resource.alert"),
		new ResourceMap("appliance_simulator", "platform.resource.appliance_simulator"),
		new ResourceMap("appliance_threshold_templete", "platform.resource.appliance_threshold_templete"),
		new ResourceMap("appliance", "platform.resource.appliance"),
		new ResourceMap("appliance_mf_profile", "platform.resource.appliance_mf_profile"),
		new ResourceMap("meter_log", "platform.resource.meter_log"),
		new ResourceMap("meter_hourly_log", "platform.resource.meter_hourly_log"),
		new ResourceMap("meter_daily_log", "platform.resource.meter_daily_log"),
		new ResourceMap("meter_monthly_log", "platform.resource.meter_monthly_log"),
			new ResourceMap("meter_bill_log", "platform.resource.meter_bill_log"),
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
		new ResourceMap("location_group", "platform.resource.location_group"),
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
		new ResourceMap("log_id_card", "platform.resource.log_id_card"),						
		new ResourceMap("c4t_object", "platform.resource.c4t_object"),						
		new ResourceMap("c4t_objects", "platform.resource.c4t_objects"),						
		new ResourceMap("c4t_relation", "platform.resource.c4t_relation"),	
		new ResourceMap("place", "platform.resource.place"),	
		new ResourceMap("c4t_record", "platform.resource.c4t_record"),	
		new ResourceMap("c4t_mandi_record", "platform.resource.c4t_mandi_record"),	
		new ResourceMap("c4t_record_map", "platform.resource.c4t_record_map"),	
		new ResourceMap("c4t_record_detail", "platform.resource.c4t_record_detail"),	
		new ResourceMap("c4t_transient_object", "platform.resource.c4t_transient_object"),	
		new ResourceMap("c4t_cart_item", "platform.resource.c4t_cart_item"),	
		new ResourceMap("c4t_cart", "platform.resource.c4t_cart"),
		new ResourceMap("mandi_auction", "platform.resource.mandi_auction"),
		new ResourceMap("mandi_auction_weight", "platform.resource.mandi_auction_weight"),
		new ResourceMap("c4t_payment", "platform.resource.c4t_payment"),
		new ResourceMap("app_summary", "platform.resource.app_summary"),
		new ResourceMap("mandi_delivery", "platform.resource.mandi_delivery"),
		new ResourceMap("mandi_arrival", "platform.resource.mandi_arrival"),

	};
}
