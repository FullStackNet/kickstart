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
import platform.util.Util;
import application.c4t.vehicle.school.helper.SchoolHelper;
import application.c4t.vehicle.school.helper.School_user_mapHelper;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.school;
import application.c4t.vehicle.school.resource.student;

public class Message2ParentNotificationTask extends NotificationTask {
	public Message2ParentNotificationTask() {
		super(NotificationFactory.NOTIFICATION_MESSAGE2PARENT);
		// TODO Auto-generated constructor stub
	}
	
	void sendSMS2Users(notification _notification, 
			Map<String, String> smsAlertMap,
			String message,
			String customer_id) {

		for(Map.Entry<String, String> entry : smsAlertMap.entrySet()) {
			SendSMS smsMessage = new SendSMS();
			smsMessage.setMobile_no(entry.getKey());
			smsMessage.setType(ApplicationConstants.SMS_TYPE_SEND_MESSAGE2PARENT);
			Map<String, String> map = new HashMap<String, String>();
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_NAME, entry.getValue());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_MESSAGE, message);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customer_id);
			String params = Json.maptoString(map);
			smsMessage.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
					smsMessage);
	
		}
	}

	void sendEmail2Users(notification _notification, 
			Map<String, String> emailAlertMap,
			String message,
			String customer_id) {

		for(Map.Entry<String, String> entry : emailAlertMap.entrySet()) {
			SendEmail resendMail = new SendEmail();
			resendMail.setSubject("Message from " + entry.getValue() + "'s school");
			resendMail.setTo(entry.getKey());
			resendMail.setType(ApplicationConstants.MAIL_TYPE_MESSAGE2PARENT);
			Map<String, String> map = new HashMap<String, String>();
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_MESSAGE, message);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_NAME, entry.getValue());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customer_id);
			
			String params = Json.maptoString(map);
			resendMail.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
					resendMail);
	
		}
	}

	void sendEmail2Admin(notification _notification, 
			Map<String, String> emailAlertMap,
			String message,
			String customer_id,student _student) {

		school _school = (school)SchoolHelper.getInstance().getById(_student.getSchool_id());
		for(Map.Entry<String, String> entry : emailAlertMap.entrySet()) {
			SendEmail resendMail = new SendEmail();
			resendMail.setSubject("Message from school to parent ("+_student.getShort_name()+","+_student.getClass_section_name()+","+_school.getShort_name()+")");
			resendMail.setTo(entry.getKey());
			resendMail.setType(ApplicationConstants.MAIL_TYPE_MESSAGE2PARENT_ADMIN);
			Map<String, String> map = new HashMap<String, String>();
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_MESSAGE, message);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_NAME, _student.getName());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customer_id);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CLASS_SECTION_NAME, _student.getClass_section_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_SCHOOL_NAME, _school.getShort_name());
			String params = Json.maptoString(map);
			resendMail.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
					resendMail);
	
		}
	}
	
	void sendNotification2Users(notification _notification, Map<String, BaseResource> userMap,
			String appAlert,
			String student_name,String message,String customerId,student _student) {
		for(Map.Entry<String, BaseResource> entry : userMap.entrySet()) {
			user _user = (user)entry.getValue();
			if ("Y".equals(appAlert) && (_user.getMobile_no() != null)) {
				SendNotification notificationMessage = new SendNotification();
				notificationMessage.setNotify_id(_user.getId());
				notificationMessage.setTitle("MESSAGE FROM "+student_name.toUpperCase()+ " SCHOOL ");
				notificationMessage.setType(ApplicationConstants.NOTIFICATION_TYPE_MESSAGE2PARENT);
				Map<String, String> map = new HashMap<String, String>();
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_MESSAGE, message);
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_NAME, student_name);
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
			String student_id,
			String message,String customerId) {
		
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		String smsAlert = "N";
		String emailAlert = "N";
		String appAlert = "N";
		Map<String, String> smsAlertMap = new HashMap<String, String>();
		Map<String, String> emailAlertMap = new HashMap<String, String>();;
		Map<String, String> emailAdminAlertMap = new HashMap<String, String>();;
		
		
		student _student = (student)StudentHelper.getInstance().getById(student_id);
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
		}
		try {
			StudentHelper.getInstance().incrementCounter(_student.getId(), student.FIELD_NOTICE_COUNT, 1);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if ("Y".equals(smsAlert)) {
			if ((!Util.isEmpty(_student.getFather_mobile_no())) && 
					("FATHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
				smsAlertMap.put(_student.getFather_mobile_no(),  _student.getShort_name());
			}
			if ((!Util.isEmpty(_student.getMother_mobile_no())) && 
					("MOTHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
				smsAlertMap.put(_student.getMother_mobile_no(), _student.getShort_name());
			}
			if ((!Util.isEmpty(_student.getOther_mobile_no())) && 
					("OTHER".equals(_student.getPrimary_contact()) || "OTHER".equals(_student.getPrimary_contact()))) {
				smsAlertMap.put(_student.getOther_mobile_no(), _student.getShort_name());
			}
		}

		if ("Y".equals(emailAlert)) {
			if ((!Util.isEmpty(_student.getFather_email_id())) && 
					("FATHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
				emailAlertMap.put(_student.getFather_email_id(), _student.getShort_name());
			}
			if ((!Util.isEmpty(_student.getMother_email_id())) && 
					("MOTHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
				emailAlertMap.put(_student.getMother_email_id(), _student.getShort_name());
			}
			if ((!Util.isEmpty(_student.getOther_email_id())) && 
					("OTHER".equals(_student.getPrimary_contact()) || "OTHER".equals(_student.getPrimary_contact()))) {
				emailAlertMap.put(_student.getOther_email_id(), _student.getShort_name());
			}
		}

		sendNotification2Users(_notification, userMap,appAlert,
				_student.getShort_name(),
				message,customerId,_student);
		
		sendSMS2Users(_notification,smsAlertMap,
				message,customerId);
	
		sendEmail2Users(_notification,emailAlertMap,
				message,customerId);
		
		BaseResource[] users = School_user_mapHelper.getInstance().getUsersForSchool(_student.getSchool_id());
		for (int i=0 ; i < users.length ;i ++) {
			user _user = (user) users[i];
			if (Util.isEmpty(_user.getEmail_id()))
				continue;
			emailAdminAlertMap.put(_user.getEmail_id(), _user.getEmail_id());
		}
		sendEmail2Admin(_notification,emailAdminAlertMap,
				message,customerId,_student);
	}
	@Override
	public void process(notification _notification) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Processing the Notification " + _notification.getId() + "::"+_notification.getNotification_id() + "::" +_notification.getNotification_data());
			Map<String, Object> data = _notification.getNotification_data();
			if (data == null)
				return;
			String student_id = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_ID);
			String message = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_MESSAGE);
			String customerId = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID);
				
			sendNotification(_notification,student_id,message,customerId);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
