package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import platform.helper.ApplianceHelper;
import platform.helper.BaseHelper;
import platform.log.ApplicationLogger;
import platform.manager.ApplicationManager;
import platform.message.SendSMS;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.user;
import platform.util.ApplicationConstants;
import platform.util.Json;
import platform.util.TimeUtil;
import platform.util.Util;
import platform.util.location.LocationUtil;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.stopage;
import application.c4t.vehicle.school.helper.School_route_stopage_mapHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
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
	
	
	void sendNotification2Users(Map<String, BaseResource> userMap,
			Map<String, String> studentMap,
			appliance _appliance, route_stopage _route_stopage) {
		stopage _stopage = (stopage)StopageHelper.getInstance().getById(_route_stopage.getStopage_id());
		if (_stopage == null) return;
		for(Map.Entry<String, BaseResource> entry : userMap.entrySet()) {
			user _user = (user)entry.getValue();
			String students = studentMap.get(entry.getKey());
			SendSMS smsMessage = new SendSMS();
			smsMessage.setMobile_no(_user.getMobile_no());
			smsMessage.setType(ApplicationConstants.SMS_TYPE_SEND_STOPAGE_REACHED);
			Map<String, String> smsMap = new HashMap<String, String>();
			smsMap.put("STOPAGE", _stopage.getName());
			smsMap.put("VEHICLE_NAME", _appliance.getName());
			smsMap.put("STUDENTS", students);
			String params = Json.maptoString(smsMap);
			smsMessage.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
					smsMessage);
		}
	}
	
	void sendNotification(appliance _appliance, route_stopage _route_stopage) {
		sendStopageReachedNotification(_appliance, _route_stopage);
		sendPreviousStopageNotification(_appliance, _route_stopage);
	}
	
	void sendPreviousStopageNotification(appliance _appliance, route_stopage _route_stopage) {
		ArrayList<BaseResource> list = School_route_stopage_mapHelper.getInstance().getAlertStudentList(_route_stopage.getId());
		if ((list == null) || (list.size() == 0)) 
			return;
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		Map<String, String> studentMap = new HashMap<String, String>();
		for(int i=0; i< list.size(); i++) {
			student _student = (student)list.get(i);
			ArrayList<BaseResource> _users = Student_mapHelper.getInstance().getUsersList(_student.getId());
			for(int j=0; j < _users.size(); j++) {
				userMap.put(_users.get(j).getId(), _users.get(j));
				String str = studentMap.get(_users.get(j).getId());
				if (str == null) {
					str = _student.getName(); 
				} else {
					str = str +","+_student.getName();
				}
				studentMap.put(_users.get(j).getId(), str);
			}
		}
		sendNotification2Users(userMap, studentMap,_appliance, _route_stopage);
	}
	
	void sendStopageReachedNotification(appliance _appliance, route_stopage _route_stopage) {
		ArrayList<BaseResource> list = School_route_stopage_mapHelper.getInstance().getStudentList(_route_stopage.getId());
		if ((list == null) || (list.size() == 0)) 
			return;
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		Map<String, String> studentMap = new HashMap<String, String>();
		for(int i=0; i< list.size(); i++) {
			student _student = (student)list.get(i);
			ArrayList<BaseResource> _users = Student_mapHelper.getInstance().getUsersList(_student.getId());
			for(int j=0; j < _users.size(); j++) {
				userMap.put(_users.get(j).getId(), _users.get(j));
				String str = studentMap.get(_users.get(j).getId());
				if (str == null) {
					str = _student.getName(); 
				} else {
					str = str +","+_student.getName();
				}
				studentMap.put(_users.get(j).getId(), str);
			}
		}
		sendNotification2Users(userMap, studentMap,_appliance, _route_stopage);
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
	
		BaseResource[] route_stopages = Route_stopageHelper.getInstance().getRouteStopageByRouteId(current_route.getId());
		if (Util.isEmpty(route_stopages))
			return;
		for(int i=0; i < route_stopages.length; i++) {
			route_stopage _route_stopage = (route_stopage) route_stopages[i];
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
			double stopage_radius = ApplicationConstants.STOPAGE_RADIUS_KM;
			if (_route_stopage.getStopage_radius() != null)
				stopage_radius = _route_stopage.getStopage_radius();
			
			ApplicationLogger.info("distance from stopage "+stopageLatitude+":"+stopageLongitude + _stopage.getName() +" for "+ latitude + ":"+longitude + "-> " + distance, this.getClass());
			if (distance  < stopage_radius) {
				sendNotification(_fetched_appliance, _route_stopage);
				ApplianceHelper.getInstance().updateLastStopage(_fetched_appliance.getId(), 
						_stopage.getId());
				Route_stopageHelper.getInstance().updateReachedTime(_route_stopage.getId());
				break;
			}
		}
	}
}
