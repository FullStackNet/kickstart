package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import platform.db.JoinField;
import platform.helper.ApplianceHelper;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.util.ApplicationConstants;
import platform.util.TimeUtil;
import platform.util.Util;
import platform.util.location.LocationUtil;
import application.c4t.vehicle.resource.customer_vehicle_map;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.stopage;
import application.c4t.vehicle.school.helper.School_route_stopage_mapHelper;
import application.c4t.vehicle.school.resource.student;


public class RouteHelper extends BaseHelper {
	
	public RouteHelper() {
		super(new route());
		// TODO Auto-generated constructor stub
	}
	private static RouteHelper instance;
	
	public static RouteHelper getInstance() {
		if (instance == null)
			instance = new RouteHelper();
		return instance;
	}
	
	
	public ArrayList<Map<String, Object>> getCustomerRoutesMap(String customerId) {
		customer_vehicle_map _customer_map = (customer_vehicle_map)Customer_vehicle_mapHelper.getInstance().getById(customerId);
		if ((_customer_map == null) || (_customer_map.getRoutes() == null))
			return null;
		return getListMapById(_customer_map.getRoutes().toArray(new String[_customer_map.getRoutes().size()]),
				new String[]{route.FIELD_NAME});
	}

	public ArrayList<Map<String, Object>> getCustomerRoutesMap(String customerId,ArrayList<JoinField> joinFields) {
		customer_vehicle_map _customer_map = (customer_vehicle_map)Customer_vehicle_mapHelper.getInstance().getById(customerId);
		if ((_customer_map == null) || (_customer_map.getRoutes() == null))
			return null;
		return getByJoining(_customer_map.getRoutes().toArray(new String[_customer_map.getRoutes().size()]),joinFields,new String[]{route.FIELD_NAME});
	}
	
	void sendNotification(appliance _appliance, route_stopage _route_stopage) {
		ArrayList<BaseResource> list = School_route_stopage_mapHelper.getInstance().getStudentList(_route_stopage.getId());
		if ((list == null) || (list.size() == 0)) 
			return;
		for(int i=0; i< list.size(); i++) {
			student _student = (student)list.get(i);
			System.out.println("Sending notification of the "+_student.getName());
		}
	}
	
	boolean isValidRoute(route _route, Date logTime , String timeZone) {
		long logDaytime = TimeUtil.getDayTime(timeZone,logTime);
		long routeStartDayTime = TimeUtil.getDayTime(_route.getStart_time());
		long routeEndDayTime = TimeUtil.getDayTime(_route.getEnd_time());
		if ((logDaytime >= routeStartDayTime) &&
				(logDaytime <= routeEndDayTime)) {
				return true;	
		}
		return false;
	}
	
	route getValidRoute(appliance _fetched_appliance, Date logTime) {
		ArrayList<BaseResource> routeList = Vehicle_mapHelper.getInstance().getRouteList(_fetched_appliance.getId());
		for(int i= 0; i <  routeList.size(); i++) {
			route _route = (route)routeList.get(i);
			if (isValidRoute(_route, logTime, _fetched_appliance.getTimeZone())) {
				return _route;
			}
		}
		return null;
	}
	
	public void checkStopageAndSendNotification(String applianceId,String latitude, 
			String longitude,Date logTime) {
		appliance _appliance = ApplianceHelper.getInstance().getById(applianceId);
		checkStopageAndSendNotification(_appliance, latitude, longitude, logTime);
	}
	
	public void checkStopageAndSendNotification(appliance _fetched_appliance,String latitude, 
			String longitude,Date logTime) {
		if (latitude == null) return;
		if (longitude ==null) return;

		route current_route = (route)RouteHelper.getInstance().getById(_fetched_appliance.getCurrentRouteId());
		if (current_route != null) {
			if (!isValidRoute(current_route,logTime, _fetched_appliance.getTimeZone()))
				current_route = null;
		} 
		
		if (current_route == null) {
			current_route = getValidRoute(_fetched_appliance,logTime);
		}
		if (current_route == null) {
			return ;
		}
		ApplianceHelper.getInstance().updateCurrentRoute(_fetched_appliance.getId(),
				current_route.getId());
	
		ArrayList<BaseResource> list = Route_mapHelper.getInstance().getRouteStopageList(current_route.getId());
		if (Util.isEmpty(list))
			return;
		for(int i=0; i < list.size(); i++) {
			route_stopage _route_stopage = (route_stopage) list.get(i);
			stopage _stopage = (stopage)StopageHelper.getInstance().getById(_route_stopage.getStopage_id());
			if (_stopage == null)
				continue;
			if (_stopage.getLatitude() == null) 
				continue;
			if (_stopage.getLongitude() == null) 
				continue;
			if (_stopage.getId().equals(_fetched_appliance.getLastStopageId())) {
				continue;
			}
			double dLatitude = Double.parseDouble(latitude);
			double dLongitude = Double.parseDouble(longitude);
			double stopageLatitude = Double.parseDouble(_stopage.getLatitude());
			double stopageLongitude = Double.parseDouble(_stopage.getLongitude());
			double distance = LocationUtil.getDistance(dLatitude, dLongitude, stopageLatitude, stopageLongitude);
			if (distance < 0) {
				distance = distance*(-1);
			}
			if (distance  < ApplicationConstants.STOPAGE_RADIUS_KM) {
				sendNotification(_fetched_appliance, _route_stopage);
				ApplianceHelper.getInstance().updateLastStopage(_fetched_appliance.getId(), 
						_stopage.getId());
				return;
			}
		}
	}
}
