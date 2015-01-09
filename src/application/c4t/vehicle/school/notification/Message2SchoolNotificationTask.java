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
import application.c4t.vehicle.school.helper.School_user_mapHelper;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.student;

public class Message2SchoolNotificationTask extends NotificationTask {
	public Message2SchoolNotificationTask() {
		super(NotificationFactory.NOTIFICATION_MESSAGE2SCHOOL);
		// TODO Auto-generated constructor stub
	}
	
	void sendEmail2Admin(notification _notification, 
			Map<String, String> emailAlertMap,
			String message,
			String customer_id) {

		for(Map.Entry<String, String> entry : emailAlertMap.entrySet()) {
			SendEmail resendMail = new SendEmail();
			resendMail.setSubject("Message from school to " + entry.getValue() + "'s parent");
			resendMail.setTo(entry.getKey());
			resendMail.setType(ApplicationConstants.MAIL_TYPE_MESSAGE2SCHOOL);
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
	
	void sendNotification(notification _notification, 
			String student_id,
			String message,String customerId) {
		
		Map<String, String> emailAdminAlertMap = new HashMap<String, String>();;
		student _student = (student)StudentHelper.getInstance().getById(student_id);
		BaseResource[] users = School_user_mapHelper.getInstance().getUsersForSchool(_student.getSchool_id());
		for (int i=0 ; i < users.length ;i ++) {
			user _user = (user) users[i];
			if (Util.isEmpty(_user.getEmail_id()))
				continue;
			emailAdminAlertMap.put(_user.getEmail_id(), _user.getEmail_id());
		}
		sendEmail2Admin(_notification,emailAdminAlertMap,
				message,customerId);
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
