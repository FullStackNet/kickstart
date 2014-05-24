package application.c4t.vehicle.school.notification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.helper.ApplianceHelper;
import platform.helper.Appliance_mapHelper;
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
import application.c4t.vehicle.helper.Route_stopageHelper;
import application.c4t.vehicle.helper.StopageHelper;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.stopage;
import application.c4t.vehicle.school.helper.School_route_stopage_mapHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.student;

public class StopReachedNotificationTask extends NotificationTask {
	public StopReachedNotificationTask() {
		super(NotificationFactory.NOTIFICATION_STOP_REACHED);
		// TODO Auto-generated constructor stub
	}

	void sendNotification2Users(notification _notification, Map<String, BaseResource> userMap,
			Map<String, String> studentMap,
			appliance _appliance, route_stopage _route_stopage,
			String appAlert,String smsAlert,String emailAlert) {
		stopage _stopage = (stopage)StopageHelper.getInstance().getById(_route_stopage.getStopage_id());
		if (_stopage == null) return;
		for(Map.Entry<String, BaseResource> entry : userMap.entrySet()) {
			user _user = (user)entry.getValue();
			String students = studentMap.get(entry.getKey());
			if ("Y".equals(smsAlert) && (_user.getMobile_no() != null)) {
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
			if ("Y".equals(emailAlert) && (_user.getEmail_id() != null)) {
				SendEmail resendMail = new SendEmail();
				resendMail.setSubject(ApplicationConstants.MAIL_SUBJECT_INVITE_PARENT);
				resendMail.setTo(_user.getEmail_id());
				resendMail.setType(ApplicationConstants.MAIL_TYPE_STOPAGE_REACHED);
				Map<String, String> map = new HashMap<String, String>();
				map.put("STOPAGE", _stopage.getName());
				map.put("VEHICLE_NAME", _appliance.getName());
				map.put("STUDENTS", students);
				String params = Json.maptoString(map);
				resendMail.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
						resendMail);
			}
			
			if ("Y".equals(appAlert) && (_user.getMobile_no() != null)) {
				SendNotification notificationMessage = new SendNotification();
				notificationMessage.setNotify_id(_user.getId());
				notificationMessage.setTitle("Stopage Reached");
				notificationMessage.setType(ApplicationConstants.NOTIFICATION_TYPE_STOPAGE_REACHED);
				Map<String, String> map = new HashMap<String, String>();
				map.put("STOPAGE", _stopage.getName());
				map.put("VEHICLE_NAME", _appliance.getName());
				map.put("STUDENTS", students);
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

	void sendNotification(notification _notification, appliance _appliance, route_stopage _route_stopage) {
		sendStopageReachedNotification(_notification,_appliance, _route_stopage);
		sendPreviousStopageNotification(_notification,_appliance, _route_stopage);
	}

	void sendPreviousStopageNotification(notification _notification, appliance _appliance, route_stopage _route_stopage) {
		ArrayList<BaseResource> list = School_route_stopage_mapHelper.getInstance().getAlertStudentList(_route_stopage.getId());
		if ((list == null) || (list.size() == 0)) 
			return;
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		Map<String, String> studentMap = new HashMap<String, String>();
		String smsAlert = "N";
		String emailAlert = "N";
		String appAlert = "N";

		for(int i=0; i< list.size(); i++) {
			student _student = (student)list.get(i);
			if ("Y".equals(_student.getStopage_alert_sms())) {
				smsAlert = "Y";
			}
			if ("Y".equals(_student.getStopage_alert_email())) {
				emailAlert = "Y";
			}
			if ("Y".equals(_student.getStopage_alert_mobile_app())) {
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
		sendNotification2Users(_notification, userMap, studentMap,_appliance, _route_stopage,appAlert,smsAlert,emailAlert);
	}

	void sendStopageReachedNotification(notification _notification,appliance _appliance, route_stopage _route_stopage) {
		ArrayList<BaseResource> list = School_route_stopage_mapHelper.getInstance().getStudentList(_route_stopage.getId());
		if ((list == null) || (list.size() == 0)) 
			return;
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		Map<String, String> studentMap = new HashMap<String, String>();
		String smsAlert = "N";
		String emailAlert = "N";
		String appAlert = "N";
		
		for(int i=0; i< list.size(); i++) {
			student _student = (student)list.get(i);
			if ("Y".equals(_student.getStopage_alert_sms())) {
				smsAlert = "Y";
			}
			if ("Y".equals(_student.getStopage_alert_email())) {
				emailAlert = "Y";
			}
			if ("Y".equals(_student.getStopage_alert_mobile_app())) {
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
		sendNotification2Users(_notification, userMap, studentMap,_appliance, _route_stopage,appAlert,smsAlert,emailAlert);
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
			String routeStopageId = (String)data.get("ROUTE_STOPAGE_ID");
			if (routeStopageId == null)
				return;
			route_stopage _route_stopge = (route_stopage)Route_stopageHelper.getInstance().getById(routeStopageId);
			sendNotification(_notification, _appliance, _route_stopge);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
