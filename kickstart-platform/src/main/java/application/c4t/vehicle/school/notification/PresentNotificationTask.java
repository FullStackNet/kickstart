package application.c4t.vehicle.school.notification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.helper.User_mapHelper;
import platform.manager.ApplicationManager;
import platform.message.SendEmail;
import platform.message.SendNotification;
import platform.message.SendSMS;
import platform.notification.NotificationFactory;
import platform.notification.NotificationTask;
import platform.resource.BaseResource;
import platform.resource.notification;
import platform.resource.user;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.Json;
import application.c4t.vehicle.school.helper.Absent_detailHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.student;

public class PresentNotificationTask extends NotificationTask {
	public PresentNotificationTask() {
		super(NotificationFactory.NOTIFICATION_PRESENT);
		// TODO Auto-generated constructor stub
	}
	void sendNotification2Users(notification _notification, Map<String, BaseResource> userMap,
			Map<String, String> studentMap,
			String appAlert,String smsAlert,String emailAlert,
			String absent_parent_id,String date,String brand_name) {
		for(Map.Entry<String, BaseResource> entry : userMap.entrySet()) {
			user _user = (user)entry.getValue();
			String students = studentMap.get(entry.getKey());
			if ("Y".equals(smsAlert) && (_user.getMobile_no() != null)) {
				SendSMS smsMessage = new SendSMS();
				smsMessage.setMobile_no(_user.getMobile_no());
				smsMessage.setType(ApplicationConstants.SMS_TYPE_SEND_PRESENT);
				Map<String, String> map = new HashMap<String, String>();
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENTS, students);
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE, date);
				map.put("BRAND_NAME", brand_name);
				String params = Json.maptoString(map);
				smsMessage.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
						smsMessage);
			}
			if ("Y".equals(emailAlert) && (_user.getEmail_id() != null)) {
				SendEmail resendMail = new SendEmail();
				resendMail.setSubject(ApplicationConstants.MAIL_SUBJECT_PRESENT);
				resendMail.setTo(_user.getEmail_id());
				resendMail.setType(ApplicationConstants.MAIL_TYPE_PRESENT);
				Map<String, String> map = new HashMap<String, String>();
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENTS, students);
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE, date);
				String params = Json.maptoString(map);
				resendMail.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
						resendMail);
			}
			
			if ("Y".equals(appAlert) && (_user.getMobile_no() != null)) {
				SendNotification notificationMessage = new SendNotification();
				notificationMessage.setNotify_id(_user.getId());
				notificationMessage.setTitle("PRESENT");
				notificationMessage.setType(ApplicationConstants.NOTIFICATION_TYPE_PRESENT);
				Map<String, String> map = new HashMap<String, String>();
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENTS, students);
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE, date);
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

	void sendNotification(notification _notification, 
			String absent_parent_id,
			String date,
			String brand_name) {
		
		BaseResource[] students = Absent_detailHelper.getInstance().getStudent(absent_parent_id);
		if ((students == null) || (students.length == 0)) 
			return;
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		Map<String, String> studentMap = new HashMap<String, String>();
		String smsAlert = "N";
		String emailAlert = "N";
		String appAlert = "N";

		for(int i=0; i< students.length; i++) {
			student _student = (student)students[i];
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
		sendNotification2Users(_notification, userMap, studentMap,appAlert,smsAlert,emailAlert,
				absent_parent_id,
				date,brand_name);
	}
	@Override
	public void process(notification _notification) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Processing the Notification " + _notification.getId() + "::"+_notification.getNotification_id() + "::" +_notification.getNotification_data());
			Map<String, Object> data = _notification.getNotification_data();
			if (data == null)
				return;
			String absent_parent_id = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_ID);
			String date = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE);
			String brand_name = (String)data.get("BRAND_NAME");
			sendNotification(_notification,absent_parent_id,date,brand_name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
