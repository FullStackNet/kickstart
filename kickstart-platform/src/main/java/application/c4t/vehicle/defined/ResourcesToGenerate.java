/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.defined;

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
		new ResourceMap("customer_vehicle_map", "application.c4t.vehicle.resource.customer_vehicle_map"),
		new ResourceMap("driver", "application.c4t.vehicle.resource.driver"),
		new ResourceMap("route", "application.c4t.vehicle.resource.route"),
		new ResourceMap("route_map", "application.c4t.vehicle.resource.route_map"),
		new ResourceMap("trip", "application.c4t.vehicle.resource.trip"),
		new ResourceMap("vehicle_summary", "application.c4t.vehicle.resource.vehicle_summary"),
		new ResourceMap("stopage", "application.c4t.vehicle.resource.stopage"),
		new ResourceMap("route_stopage", "application.c4t.vehicle.resource.route_stopage"),
		new ResourceMap("route_stopage_map", "application.c4t.vehicle.resource.route_stopage_map"),
		new ResourceMap("route_cordinate", "application.c4t.vehicle.resource.route_cordinate"),
		new ResourceMap("route_cordinate_raw", "application.c4t.vehicle.resource.route_cordinate_raw"),
		new ResourceMap("vehicle_map", "application.c4t.vehicle.resource.vehicle_map"),
		new ResourceMap("trip_detail", "application.c4t.vehicle.resource.trip_detail"),
		new ResourceMap("trip_overspeed_detail", "application.c4t.vehicle.resource.trip_overspeed_detail"),
		new ResourceMap("attendent", "application.c4t.vehicle.resource.attendent"),
		
	};
}
