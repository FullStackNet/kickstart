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
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.student;

public class HomeWorkNotificationTask extends NotificationTask {
	public HomeWorkNotificationTask() {
		super(NotificationFactory.NOTIFICATION_HOMEWORK);
		// TODO Auto-generated constructor stub
	}

	void sendNotification2Users(notification _notification, Map<String, BaseResource> userMap,
			Map<String, String> studentMap,
			String appAlert,String smsAlert,String emailAlert,
			String school_id,
			String subject_id,
			String class_section_name,
			String title,
			String description, String customerId) {
		for(Map.Entry<String, BaseResource> entry : userMap.entrySet()) {
			user _user = (user)entry.getValue();
			String students = studentMap.get(entry.getKey());
			if ("Y".equals(smsAlert) && (_user.getMobile_no() != null)) {
				SendSMS smsMessage = new SendSMS();
				smsMessage.setMobile_no(_user.getMobile_no());
				smsMessage.setType(ApplicationConstants.SMS_TYPE_SEND_HOMEWORK);
				Map<String, String> smsMap = new HashMap<String, String>();
				smsMap.put("SUBJECT", subject_id);
				smsMap.put("TITLE", title);
				smsMap.put("DESCRIPTION", description);
				smsMap.put("STUDENTS", students);
				smsMap.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customerId);
				
				String params = Json.maptoString(smsMap);
				smsMessage.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
						smsMessage);
			}
			if ("Y".equals(emailAlert) && (_user.getEmail_id() != null)) {
				SendEmail resendMail = new SendEmail();
				resendMail.setSubject(ApplicationConstants.MAIL_SUBJECT_HOMEWORK);
				resendMail.setTo(_user.getEmail_id());
				resendMail.setType(ApplicationConstants.MAIL_TYPE_HOMEWORK);
				Map<String, String> map = new HashMap<String, String>();
				map.put("SUBJECT", subject_id);
				map.put("TITLE", title);
				map.put("DESCRIPTION", description);
				map.put("STUDENTS", students);
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customerId);
								
				String params = Json.maptoString(map);
				resendMail.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
						resendMail);
			}
			
			if ("Y".equals(appAlert) && (_user.getMobile_no() != null)) {
				SendNotification notificationMessage = new SendNotification();
				notificationMessage.setNotify_id(_user.getId());
				notificationMessage.setTitle("HOMEWORK");
				notificationMessage.setType(ApplicationConstants.NOTIFICATION_TYPE_HOMEWORK);
				Map<String, String> map = new HashMap<String, String>();
				map.put("SUBJECT", subject_id);
				map.put("TITLE", title);
				map.put("DESCRIPTION", description);
				map.put("STUDENTS", students);
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
			String school_id,
			String subject_id,
			String class_section_name,
			String title,
			String description,String customerId) {
		BaseResource[] students = StudentHelper.getInstance().getSectionStudent(school_id,class_section_name);
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
			try {
				StudentHelper.getInstance().incrementCounter(_student.getId(), student.FIELD_HOMEWORK_COUNT, 1);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sendNotification2Users(_notification, userMap, studentMap,appAlert,smsAlert,emailAlert,
				school_id,
				subject_id,
				class_section_name,
				title,
				description,customerId);
	}
	@Override
	public void process(notification _notification) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Processing the Notification " + _notification.getId() + "::"+_notification.getNotification_id() + "::" +_notification.getNotification_data());
			Map<String, Object> data = _notification.getNotification_data();
			if (data == null)
				return;
			String school_id = (String)data.get("SCHOOL_ID");
			String class_section_name = (String)data.get("CLASS_SECTION_NAME");
			String subject_id = (String)data.get("SUBJECT_ID");
			String title = (String)data.get("TITLE");
			String description = (String)data.get("DESCRIPTION");
			String customerId = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID);
					
			sendNotification(_notification,school_id,
					subject_id,
					class_section_name, title,description,customerId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
