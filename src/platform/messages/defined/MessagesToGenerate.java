/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.messages.defined;

public class MessagesToGenerate {
	/*
	 * Define each element in the format of {"<json_file_name>", "<fully_qualified_resource_path_name>","<db_name>"}
	 * json_file_name - specify only the file name without extension
	 * fully_qualified_resource_path_name - not that of generated class but that of extending class. If there is no extending class, leave it null (Ex: Sample)
	 * db_name - instance of DBNameEnum where this resource will stored. null if resource is transient (not stored in DB)
	 * Make sure there is a default constructor (with no args) in the extending class.
	 */
	public static MessageMap[] messageMaps =  {
		
		/* HAN Messages */
		new MessageMap("Authentication"),  //0,0 ,1
		new MessageMap("AuthenticationResponse"), //0,0,3
		new MessageMap("HeartBeat"), //9,0, 1
		new MessageMap("GatewayConfiguration"), // 1/3/1
		//new MessageMap("GatewayUpgrade"), // 1/4/1
		new MessageMap("GatewayReady"), // 1/6/1

		new MessageMap("DeviceAction"), // 20/1/1
		new MessageMap("DeviceAlert"), // 20/2/1
		new MessageMap("GetSensor"), // 20/3/1
		new MessageMap("RegisteredSensor"), // 20/4/1
		new MessageMap("DeviceNotification"), // 20/5/1
		new MessageMap("DevicePortData"), // 20/6/1
		new MessageMap("RegisteredController"), // 20/8/1
		new MessageMap("UnRegisterController"), // 20/9/1
		new MessageMap("DeviceConfiguration"), // 20/10/1
		new MessageMap("Alert"), // 20/11/1
		new MessageMap("Notification"), // 20/12/1
		new MessageMap("ControllerPacketCapture"), // 20/13/1
		
		new MessageMap("MORegister"), // 6/1/1
		new MessageMap("MOHeartbeat"), // 6/2/1
		new MessageMap("MOShutdown"), // 6/3/1
		new MessageMap("MORefresh"), // 6/4/1
		new MessageMap("MOProcessStop"), // 6/5/1
		new MessageMap("MOProcessStart"), // 6/6/1
		new MessageMap("MOUpgrade"), // 6/7/1
		new MessageMap("MOConfigureManager"), // 6/8/1
		new MessageMap("MOConfigureAlertManager"), // 6/9/1
		new MessageMap("MOConfigureGateway"), // 6/10/1
		new MessageMap("MOConfigureAgent"), // 6/11/1
		new MessageMap("MOConfigureMonitor"), // 6/12/1
		new MessageMap("MOStatsAgent"), // 6/13/1
		

	};
}
