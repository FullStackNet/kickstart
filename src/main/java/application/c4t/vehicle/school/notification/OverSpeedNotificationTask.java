package application.c4t.vehicle.school.notification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.helper.ApplianceHelper;
import platform.helper.Appliance_mapHelper;
import platform.helper.UserHelper;
import platform.helper.User_mapHelper;
import platform.manager.ApplicationManager;
import platform.message.SendEmail;
import platform.message.SendNotification;
import platform.message.SendSMS;
import platform.notification.NotificationFactory;
import platform.notification.NotificationTask;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.notification;
import platform.resource.user;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.Json;
import application.c4t.vehicle.helper.RouteHelper;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.student;

public class OverSpeedNotificationTask extends NotificationTask {
	public OverSpeedNotificationTask() {
		super(NotificationFactory.NOTIFICATION_OVER_SPEED);
		// TODO Auto-generated constructor stub
	}

	void sendNotification2Admin(notification _notification, appliance _appliance, 
			route _route) {
		String customerId = _route.getCustomer_id();
		BaseResource[] admins = UserHelper.getInstance().getCustomerAdmin(customerId);
		if ((admins == null) || (admins.length == 0))
			return;
		for( BaseResource resource : admins) {
			user _user = (user)resource;
			SendNotification notificationMessage = new SendNotification();
			notificationMessage.setNotify_id(_user.getId());
			notificationMessage.setTitle("Overspeed Alert");
			notificationMessage.setType(ApplicationConstants.NOTIFICATION_TYPE_OVERSPEED);
			Map<String, String> map = new HashMap<String, String>();
			map.put("VEHICLE_NAME", _appliance.getName());
			map.put("ROUTE_NAME", _route.getName());
			map.put("SPEED", ""+_notification.getNotification_data().get("SPEED"));
			String params = Json.maptoString(map);
			notificationMessage.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_NOTIFICATION_MANAGER, 
					notificationMessage);
			try {
				User_mapHelper.getInstance().addNotification(_user.getId(), _notification.getId());
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	void sendNotification2Users(notification _notification, Map<String, BaseResource> userMap,
			Map<String, String> studentMap,
			appliance _appliance, route _route,
			String appAlert,String smsAlert,String emailAlert) {

		for(Map.Entry<String, BaseResource> entry : userMap.entrySet()) {
			user _user = (user)entry.getValue();
			String students = studentMap.get(entry.getKey());
			if ("Y".equals(smsAlert) && (_user.getMobile_no() != null)) {
				SendSMS smsMessage = new SendSMS();
				smsMessage.setMobile_no(_user.getMobile_no());
				smsMessage.setType(ApplicationConstants.SMS_TYPE_SEND_OVERSPEED);
				Map<String, String> map = new HashMap<String, String>();
				map.put("VEHICLE_NAME", _appliance.getName());
				map.put("STUDENTS", students);
				map.put("SPEED", ""+_notification.getNotification_data().get("SPEED"));
				String params = Json.maptoString(map);
				smsMessage.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
						smsMessage);
			}
			if ("Y".equals(emailAlert) && (_user.getEmail_id() != null)) {
				SendEmail resendMail = new SendEmail();
				resendMail.setSubject(ApplicationConstants.MAIL_SUBJECT_OVERSPEED);
				resendMail.setTo(_user.getEmail_id());
				resendMail.setType(ApplicationConstants.MAIL_TYPE_OVERSPEED);
				Map<String, String> map = new HashMap<String, String>();
				map.put("VEHICLE_NAME", _appliance.getName());
				map.put("STUDENTS", students);
				map.put("SPEED", ""+_notification.getNotification_data().get("SPEED"));
				String params = Json.maptoString(map);
				resendMail.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
						resendMail);
			}

			if ("Y".equals(appAlert) && (_user.getMobile_no() != null)) {
				SendNotification notificationMessage = new SendNotification();
				notificationMessage.setNotify_id(_user.getId());
				notificationMessage.setTitle("Overspeed Alert");
				notificationMessage.setType(ApplicationConstants.NOTIFICATION_TYPE_OVERSPEED);
				Map<String, String> map = new HashMap<String, String>();
				map.put("VEHICLE_NAME", _appliance.getName());
				map.put("STUDENTS", students);
				map.put("SPEED", ""+_notification.getNotification_data().get("SPEED"));
				String params = Json.maptoString(map);
				notificationMessage.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_NOTIFICATION_MANAGER, 
						notificationMessage);
			}
			try {
				User_mapHelper.getInstance().addNotification(_user.getId(), _notification.getId());
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	void sendNotification(notification _notification, appliance _appliance, route _route) {
		sendNotification2Admin(_notification, _appliance, _route);
		BaseResource[] students = StudentHelper.getInstance().getStudentByRouteId(_route.getId());
		if ((students == null) || (students.length == 0)) 
			return;
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		Map<String, String> studentMap = new HashMap<String, String>();
		String smsAlert = "N";
		String emailAlert = "N";
		String appAlert = "N";

		for(int i=0; i< students.length; i++) {
			student _student = (student)students[i];
			if ("Y".equals(_student.getOverspeed_alert_sms())) {
				smsAlert = "Y";
			}
			if ("Y".equals(_student.getOverspeed_alert_email())) {
				emailAlert = "Y";
			}
			if ("Y".equals(_student.getOverspeed_alert_mobile_app())) {
				appAlert = "Y";
			}
			ArrayList<BaseResource> _users = Student_mapHelper.getInstance().getUsersList(_student.getId());
			for(int j=0; j < _users.size(); j++) {
				userMap.put(_users.get(j).getId(), _users.get(j));
				String str = studentMap.get(_users.get(j).getId());
				if (str == null) {
					str = _student.getNameEx(); 
				} else {
					str = str +","+_student.getNameEx();
				}
				studentMap.put(_users.get(j).getId(), str);
			}
		}
		sendNotification2Users(_notification, userMap, studentMap,_appliance, _route,appAlert,smsAlert,emailAlert);
	}

	@Override
	public void process(notification _notification) {
		// TODO Auto-generated method stub
		String applianceId = _notification.getApplinace_id();
		appliance _appliance = ApplianceHelper.getInstance().getById(applianceId);
		if (_appliance == null) return;
		try {
			Appliance_mapHelper.getInstance().addNotification(applianceId, _notification.getId());
			//User_mapHelper.getInstance().addNotification(admin.getId(), notification.getId());
			Map<String, Object> data = _notification.getNotification_data();
			if (data == null)
				return;
			String routeId = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_ROUTE_ID);
			if (routeId == null)
				return;
			route _route = (route)RouteHelper.getInstance().getById(routeId);
			if (_route == null)
				return;
			sendNotification(_notification, _appliance, _route);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
