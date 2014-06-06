package application.c4t.vehicle.school.notification;

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
import application.c4t.vehicle.school.resource.student;

public class ParentInviteNotificationTask extends NotificationTask {
	public ParentInviteNotificationTask() {
		super(NotificationFactory.NOTIFICATION_INVITE_TO_JOIN_PARENT_CONNECT);
		// TODO Auto-generated constructor stub
	}

	void sendNotification2Users(notification _notification, Map<String, BaseResource> userMap,
			String appAlert,String smsAlert,String emailAlert,
			String student_id,String student_name) {
		for(Map.Entry<String, BaseResource> entry : userMap.entrySet()) {
			user _user = (user)entry.getValue();
			if ("Y".equals(smsAlert) && (_user.getMobile_no() != null)) {
				SendSMS smsMessage = new SendSMS();
				smsMessage.setMobile_no(_user.getMobile_no());
				smsMessage.setType(ApplicationConstants.SMS_TYPE_INVITE_TO_JOIN_PARENT_CONNECT);
				Map<String, String> map = new HashMap<String, String>();
				map.put("STDEUNT_NAME", student_name);
				map.put("STDEUNT_ID", student_id);
				String params = Json.maptoString(map);
				smsMessage.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
						smsMessage);
			}
			if ("Y".equals(emailAlert) && (_user.getEmail_id() != null)) {
				SendEmail resendMail = new SendEmail();
				resendMail.setSubject(ApplicationConstants.MAIL_SUBJECT_INVITE_TO_JOIN_PARENT_CONNECT);
				resendMail.setTo(_user.getEmail_id());
				resendMail.setType(ApplicationConstants.MAIL_TYPE_INVITE_TO_JOIN_PARENT_CONNECT);
				Map<String, String> map = new HashMap<String, String>();
				map.put("STDEUNT_NAME", student_name);
				map.put("STDEUNT_ID", student_id);
				String params = Json.maptoString(map);
				resendMail.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
						resendMail);
			}

			if ("Y".equals(appAlert) && (_user.getMobile_no() != null)) {
				SendNotification notificationMessage = new SendNotification();
				notificationMessage.setNotify_id(_user.getId());
				notificationMessage.setTitle("HOMEWORK");
				notificationMessage.setType(ApplicationConstants.NOTIFICATION_TYPE_INVITE_TO_JOIN_PARENT_CONNECT);
				Map<String, String> map = new HashMap<String, String>();
				map.put("STDEUNT_NAME", student_name);
				map.put("STDEUNT_ID", student_id);
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

	void sendNotification(notification _notification,String student_id,String student_name) {
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		String smsAlert = "N";
		String emailAlert = "N";
		String appAlert = "N";

		student _student = (student)StudentHelper.getInstance().getById(student_id);
		if (_student == null) 
			return;
		
		if ("Y".equals(_student.getStopage_alert_sms())) {
			smsAlert = "Y";
		}
		if ("Y".equals(_student.getStopage_alert_email())) {
			emailAlert = "Y";
		}
		if ("Y".equals(_student.getStopage_alert_mobile_app())) {
			appAlert = "Y";
		}
		sendNotification2Users(_notification, userMap, appAlert,smsAlert,emailAlert,
				student_id,student_name);
	}
	@Override
	public void process(notification _notification) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Processing the Notification " + _notification.getId() + "::"+_notification.getNotification_id() + "::" +_notification.getNotification_data());
			Map<String, Object> data = _notification.getNotification_data();
			if (data == null)
				return;
			String student_id = (String)data.get("STDEUNT_ID");
			String student_name = (String)data.get("STDEUNT_NAME");
			sendNotification(_notification,student_id,student_name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
