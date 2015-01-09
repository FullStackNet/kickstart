package application.c4t.vehicle.school.notification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.helper.User_mapHelper;
import platform.log.ApplicationLogger;
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
import platform.util.Util;
import application.c4t.vehicle.school.helper.Home_practiceHelper;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.home_practice;
import application.c4t.vehicle.school.resource.student;

public class Home_practiceNotificationTask extends NotificationTask {
	public Home_practiceNotificationTask() {
		super(NotificationFactory.NOTIFICATION_HOME_PRACTICE);
		// TODO Auto-generated constructor stub
	}

	void sendSMS2Users(notification _notification, 
			Map<String, String> smsAlertMap,
			String class_section_name,
			String title,
			String description,String customer_id) {

		for(Map.Entry<String, String> entry : smsAlertMap.entrySet()) {
			SendSMS smsMessage = new SendSMS();
			smsMessage.setMobile_no(entry.getKey());
			smsMessage.setType(ApplicationConstants.SMS_TYPE_SEND_HOME_PRACTICE);
			Map<String, String> map = new HashMap<String, String>();
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_TITLE, title);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DESCRIPTION, description);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENTS, entry.getValue());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customer_id);

			String params = Json.maptoString(map);
			smsMessage.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
					smsMessage);

		}
	}

	void sendEmail2Users(notification _notification, 
			Map<String, String> emailAlertMap,
			String class_section_name,
			String title,
			String description,String customer_id) {

		for(Map.Entry<String, String> entry : emailAlertMap.entrySet()) {
			SendEmail resendMail = new SendEmail();
			resendMail.setSubject(title);
			resendMail.setTo(entry.getKey());
			resendMail.setType(ApplicationConstants.MAIL_TYPE_HOME_PRACTICE);
			Map<String, String> map = new HashMap<String, String>();
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_TITLE, title);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DESCRIPTION, description);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENTS, entry.getValue());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customer_id);
			String params = Json.maptoString(map);
			resendMail.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
					resendMail);
	
		}
	}

	void sendNotification2Users(notification _notification, Map<String, BaseResource> userMap,
			Map<String, String> studentMap,
			Map<String, String> smsAlertMap,
			Map<String, String> emailAlertMap,
			Map<String, String> appAlertMap,
			String class_section_name,
			String title,
			String description,String customerId) {
		for(Map.Entry<String, BaseResource> entry : userMap.entrySet()) {
			user _user = (user)entry.getValue();
			String students = studentMap.get(entry.getKey());
			String appAlert = appAlertMap.get(_user.getId());
			if ("Y".equals(appAlert) && (_user.getMobile_no() != null)) {
				SendNotification notificationMessage = new SendNotification();
				notificationMessage.setNotify_id(_user.getId());
				notificationMessage.setTitle("HOME PRACTICE");
				notificationMessage.setType(ApplicationConstants.NOTIFICATION_TYPE_HOME_PRACTICE);
				Map<String, String> map = new HashMap<String, String>();
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_TITLE, title);
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DESCRIPTION, description);
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENTS, students);
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customerId);
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
			String class_section_name,
			String title,
			String description,String customerId,
			home_practice activity) {
		if (Util.isEmpty(activity.getSchools())) {
			return;
		}
		String[] ids = activity.getSchools().toArray(new String[activity.getSchools().size()]);
		
		BaseResource[] students = StudentHelper.getInstance().getSectionStudent(ids,class_section_name);
		if ((students == null) || (students.length == 0)) 
			return;
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		Map<String, String> studentMap = new HashMap<String, String>();
		Map<String, String> smsAlertMap = new HashMap<String, String>();
		Map<String, String> emailAlertMap = new HashMap<String, String>();;
		Map<String, String> appAlertMap = new HashMap<String, String>();;
	
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
			if (!"Y".equals(activity.getSend_sms())) {
				smsAlert = "N";
			}
			if (!"Y".equals(activity.getSend_email())) {
				emailAlert = "N";
			}
			ArrayList<BaseResource> _users = Student_mapHelper.getInstance().getUsersList(_student.getId());
			for(int j=0; j < _users.size(); j++) {
				userMap.put(_users.get(j).getId(), _users.get(j));
				appAlertMap.put(_users.get(j).getId(), appAlert);
				String str = studentMap.get(_users.get(j).getId());
				if (str == null) {
					str = _student.getNameEx(); 
				} else {
					str = str +","+_student.getNameEx();
				}
				studentMap.put(_users.get(j).getId(), str);
			}
			if ("Y".equals(smsAlert)) {
				if ((!Util.isEmpty(_student.getFather_mobile_no())) && 
						("FATHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
					smsAlertMap.put(_student.getFather_mobile_no(),  _student.getNameEx());
				}
				if ((!Util.isEmpty(_student.getMother_mobile_no())) && 
						("MOTHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
					smsAlertMap.put(_student.getMother_mobile_no(), _student.getNameEx());
				}
				if ((!Util.isEmpty(_student.getOther_mobile_no())) && 
						("OTHER".equals(_student.getPrimary_contact()) || "OTHER".equals(_student.getPrimary_contact()))) {
					smsAlertMap.put(_student.getOther_mobile_no(), _student.getNameEx());
				}
			}

			if ("Y".equals(emailAlert)) {
				if ((!Util.isEmpty(_student.getFather_email_id())) && 
						("FATHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
					emailAlertMap.put(_student.getFather_email_id(), _student.getNameEx());
				}
				if ((!Util.isEmpty(_student.getMother_email_id())) && 
						("MOTHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
					emailAlertMap.put(_student.getMother_email_id(), _student.getNameEx());
				}
				if ((!Util.isEmpty(_student.getOther_email_id())) && 
						("OTHER".equals(_student.getPrimary_contact()) || "OTHER".equals(_student.getPrimary_contact()))) {
					emailAlertMap.put(_student.getOther_email_id(), _student.getNameEx());
				}
			}

			try {
				StudentHelper.getInstance().incrementCounter(_student.getId(), student.FIELD_HOME_PRACTICE_COUNT, 1);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sendNotification2Users(_notification, userMap, studentMap,
				smsAlertMap,
				emailAlertMap,
				appAlertMap,
				class_section_name,
				title,
				description,customerId);
		
		sendSMS2Users(_notification, 
				smsAlertMap,
				class_section_name,
				title,
				description,
				customerId);
		
		sendEmail2Users(_notification, 
				emailAlertMap,
				class_section_name,
				title,
				description,
				customerId);
	}
	@Override
	public void process(notification _notification) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Processing the Notification " + _notification.getId() + "::"+_notification.getNotification_id() + "::" +_notification.getNotification_data());
			Map<String, Object> data = _notification.getNotification_data();
			if (data == null)
				return;
			String class_section_name = (String)data.get("CLASS_SECTION_NAME");
			String title = (String)data.get("TITLE");
			String description = (String)data.get("DESCRIPTION");
			String customerId = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID);
			String activity_id = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_ID);
			
			home_practice activity = (home_practice)Home_practiceHelper.getInstance().getById(activity_id);
			if (activity == null) {
				ApplicationLogger.error("Unable to process Notice, because it doesn't exists " +activity_id, this.getClass());
				return;
			}
		
			sendNotification(_notification,
					class_section_name, title,description,customerId,activity);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
