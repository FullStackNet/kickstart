package application.c4t.vehicle.school.notification;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import platform.helper.Sms_logHelper;
import platform.helper.User_mapHelper;
import platform.manager.ApplicationManager;
import platform.message.SendEmail;
import platform.message.SendNotification;
import platform.message.SendSMS;
import platform.notification.NotificationFactory;
import platform.notification.NotificationTask;
import platform.resource.BaseResource;
import platform.resource.notification;
import platform.resource.sms_log;
import platform.resource.user;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.Json;
import platform.util.TimeUtil;
import platform.util.Util;
import application.c4t.vehicle.school.helper.SchoolHelper;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.school;
import application.c4t.vehicle.school.resource.student;

public class SchoolEntryNotificationTask extends NotificationTask {
	public SchoolEntryNotificationTask() {
		super(NotificationFactory.NOTIFICATION_SCHOOL_ENTRY);
		// TODO Auto-generated constructor stub
	}
	
	void sendSMS2Users(notification _notification, 
			Map<String, student> smsAlertMap,
			String customer_id) {

		for(Map.Entry<String, student> entry : smsAlertMap.entrySet()) {
			student _student = entry.getValue();
			if (_student == null)
				continue;
			school _school = (school)SchoolHelper.getInstance().getById(_student.getSchool_id());
			if (_school == null)
				continue;
			String currentDate = TimeUtil.getDateString(_school.getTimezone(), new Date().getTime());
			sms_log _log = Sms_logHelper.getInstance().logSchoolActivity(_school.getId(), 
					_school.getName(), 
					_student.getId(), 
					_student.getName(), 
					_student.getClass_name(), 
					_student.getSection_name(),
					entry.getKey(), 
					sms_log.REASON_SCHOOL_ENTRY,
					currentDate, _notification.getNotification_time(), null, null);
			SendSMS smsMessage = new SendSMS();
			smsMessage.setMobile_no(entry.getKey());
			smsMessage.setType(ApplicationConstants.SMS_TYPE_SEND_SCHOOL_ENTRY);
			Map<String, String> map = new HashMap<String, String>();
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_LOG_ID, _log.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_NAME, _student.getShort_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customer_id);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DISPLAY_TIME, (String)_notification.getNotification_data().get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DISPLAY_TIME));
			map.put("BRAND_NAME", (String)_notification.getNotification_data().get("BRAND_NAME"));
			
			String params = Json.maptoString(map);
			smsMessage.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
					smsMessage);
	
		}
	}

	void sendEmail2Users(notification _notification, 
			Map<String, student> emailAlertMap,
			String customer_id) {

		for(Map.Entry<String, student> entry : emailAlertMap.entrySet()) {
			student _student = entry.getValue();
			SendEmail resendMail = new SendEmail();
			resendMail.setSubject("School Attendance Message from " +  _student.getShort_name() + "'s school");
			resendMail.setTo(entry.getKey());
			resendMail.setType(ApplicationConstants.MAIL_TYPE_SEND_SCHOOL_ENTRY);
			Map<String, String> map = new HashMap<String, String>();
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_NAME, _student.getShort_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customer_id);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DISPLAY_TIME, (String)_notification.getNotification_data().get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DISPLAY_TIME));
			map.put("BRAND_NAME", (String)_notification.getNotification_data().get("BRAND_NAME"));
			
			String params = Json.maptoString(map);
			resendMail.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
					resendMail);
	
		}
	}

	void sendNotification2Users(notification _notification, Map<String, BaseResource> userMap,
			String appAlert,
			String student_name,String customerId,student _student) {
		for(Map.Entry<String, BaseResource> entry : userMap.entrySet()) {
			user _user = (user)entry.getValue();
			if ("Y".equals(appAlert) && (_user.getMobile_no() != null)) {
				SendNotification notificationMessage = new SendNotification();
				notificationMessage.setNotify_id(_user.getId());
				notificationMessage.setTitle("SCHOOL ATTENDANCE MESSAGE FROM "+student_name.toUpperCase()+ " SCHOOL ");
				notificationMessage.setType(ApplicationConstants.NOTIFICATION_TYPE_SEND_SCHOOL_ENTRY);
				Map<String, String> map = new HashMap<String, String>();
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
			String customerId) {
		
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		String smsAlert = "N";
		String emailAlert = "N";
		String appAlert = "N";
		Map<String, student> smsAlertMap = new HashMap<String, student>();
		Map<String, student> emailAlertMap = new HashMap<String, student>();;
		
		
		student _student = (student)StudentHelper.getInstance().getById(student_id);
		if (_student == null)
			return ;
		
		school _school = (school) SchoolHelper.getInstance().getById(_student.getSchool_id());
		if (_school == null)
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
		
		if (!"Y".equals(_school.getFeature_school_entry_sms())) {
			smsAlert = "N";
		}
		
		if (!"Y".equals(_school.getFeature_school_entry_email())) {
			emailAlert = "N";
		}
		
		ArrayList<BaseResource> _users = Student_mapHelper.getInstance().getUsersList(_student.getId());
		for(int j=0; j < _users.size(); j++) {
			userMap.put(_users.get(j).getId(), _users.get(j));
		}
		try {
			StudentHelper.getInstance().incrementCounter(_student.getId(), student.FIELD_PRESENT_REPORT_COUNT, 1);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if ("Y".equals(smsAlert)) {
			if ((!Util.isEmpty(_student.getFather_mobile_no())) && 
					("FATHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
				smsAlertMap.put(_student.getFather_mobile_no(),  _student);
			}
			if ((!Util.isEmpty(_student.getMother_mobile_no())) && 
					("MOTHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
				smsAlertMap.put(_student.getMother_mobile_no(), _student);
			}
			if ((!Util.isEmpty(_student.getOther_mobile_no())) && 
					("OTHER".equals(_student.getPrimary_contact()) || "OTHER".equals(_student.getPrimary_contact()))) {
				smsAlertMap.put(_student.getOther_mobile_no(), _student);
			}
		}

		if ("Y".equals(emailAlert)) {
			if ((!Util.isEmpty(_student.getFather_email_id())) && 
					("FATHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
				emailAlertMap.put(_student.getFather_email_id(), _student);
			}
			if ((!Util.isEmpty(_student.getMother_email_id())) && 
					("MOTHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
				emailAlertMap.put(_student.getMother_email_id(), _student);
			}
			if ((!Util.isEmpty(_student.getOther_email_id())) && 
					("OTHER".equals(_student.getPrimary_contact()) || "OTHER".equals(_student.getPrimary_contact()))) {
				emailAlertMap.put(_student.getOther_email_id(), _student);
			}
		}

		sendNotification2Users(_notification, userMap,appAlert,
				_student.getShort_name(),
				customerId,_student);
		
		sendSMS2Users(_notification,smsAlertMap,
				customerId);
	
		sendEmail2Users(_notification,emailAlertMap,
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
			String student_id = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_ID);
			String customerId = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID);
			sendNotification(_notification,student_id,customerId);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
