package application.c4t.vehicle.school.notification;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import platform.helper.Sms_daily_analysisHelper;
import platform.helper.Sms_logHelper;
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
import platform.resource.sms_daily_analysis;
import platform.resource.sms_log;
import platform.resource.user;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.Json;
import platform.util.TimeUtil;
import platform.util.Util;
import application.c4t.vehicle.school.helper.NoticeHelper;
import application.c4t.vehicle.school.helper.SchoolHelper;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.notice;
import application.c4t.vehicle.school.resource.school;
import application.c4t.vehicle.school.resource.student;

public class NoticeNotificationTask extends NotificationTask {
	public NoticeNotificationTask() {
		super(NotificationFactory.NOTIFICATION_NOTICE);
		// TODO Auto-generated constructor stub
	}

	void sendSMS2Users(notice activity,notification _notification, 
			Map<String, student> smsAlertMap,
			String class_section_name,
			String title,
			String description,String date,String customer_id) {

		for(Map.Entry<String, student> entry : smsAlertMap.entrySet()) {
			student _student  = entry.getValue();
			if (_student == null)
				continue;
			school _school = (school)SchoolHelper.getInstance().getById(_student.getSchool_id());
			String currentDate = TimeUtil.getDateString(_school.getTimezone(), new Date().getTime());
			
			sms_log _log = new sms_log();
			_log.setSchool_id(_student.getSchool_id());
			_log.setMobile_no(entry.getKey());
			_log.setInvocation_time(new Date().getTime());
			_log.setStudent_id(_student.getId());
			_log.setStudent_name(_student.getName());
			_log.setClass_name(_student.getClass_name());
			_log.setDate(currentDate);
			_log.setSection_name(_student.getClass_name());
			if (_school != null) {
				_log.setSchool_name(_school.getName());
			}
			_log.setReason("NOTICE");
			_log.setReference_description(title);
			_log.setReference_id(activity.getId());	
			//_log.setPerson_name("");
			_log.setSent_status("N");
			_log.setProcessing_status("N");
			String key = sms_daily_analysis.id(currentDate, _log.getSchool_id(), _log.getReason());
			sms_daily_analysis _analysis = (sms_daily_analysis)Sms_daily_analysisHelper.getInstance().getById(key);
			if (_analysis == null) {
				_analysis = new sms_daily_analysis(key);
				_analysis.setDate(currentDate);
				_analysis.setReason("NOTICE");
				_analysis.setSchool_id(_log.getSchool_id());
				_analysis.setSchool_name(_log.getSchool_name());
				_analysis.setInvoke_count(1);
				try {
					Sms_daily_analysisHelper.getInstance().add(_analysis);
				} catch (ApplicationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					Sms_daily_analysisHelper.getInstance().incrementCounter(key, sms_daily_analysis.FIELD_INVOKE_COUNT, 1);
				} catch (ApplicationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			try {
				Sms_logHelper.getInstance().add(_log);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SendSMS smsMessage = new SendSMS();
			smsMessage.setMobile_no(entry.getKey());
			smsMessage.setType(ApplicationConstants.SMS_TYPE_SEND_NOTICE);
			Map<String, String> map = new HashMap<String, String>();
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_TITLE, title);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_LOG_ID, _log.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DESCRIPTION, description);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENTS, _student.getShort_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE, date);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customer_id);
			String params = Json.maptoString(map);
			smsMessage.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
					smsMessage);
		}
	}

	void sendEmail2Users(notice activity,notification _notification, 
			Map<String, String> emailAlertMap,
			String class_section_name,
			String title,
			String description,String date,String customer_id) {

		for(Map.Entry<String, String> entry : emailAlertMap.entrySet()) {
			SendEmail resendMail = new SendEmail();
			resendMail.setSubject(title);
			resendMail.setTo(entry.getKey());
			resendMail.setType(ApplicationConstants.MAIL_TYPE_NOTICE);
			Map<String, String> map = new HashMap<String, String>();
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_TITLE, title);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DESCRIPTION, description);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENTS, entry.getValue());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE, date);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customer_id);
			String params = Json.maptoString(map);
			resendMail.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
					resendMail);
	
		}
	}
	void sendNotification2Users(notice activity,notification _notification, Map<String, BaseResource> userMap,
			Map<String, student> studentMap,
			Map<String, String> appAlertMap,
			String class_section_name,
			String title,
			String description,String date,String customer_id) {
		for(Map.Entry<String, BaseResource> entry : userMap.entrySet()) {
			user _user = (user)entry.getValue();
			student student = studentMap.get(entry.getKey());
			String appAlert = appAlertMap.get(_user.getId());
					
			if ("Y".equals(appAlert) && (_user.getMobile_no() != null)) {
				SendNotification notificationMessage = new SendNotification();
				notificationMessage.setNotify_id(_user.getId());
				notificationMessage.setTitle("NOTICE");
				notificationMessage.setType(ApplicationConstants.NOTIFICATION_TYPE_NOTICE);
				Map<String, String> map = new HashMap<String, String>();
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_TITLE, title);
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DESCRIPTION, description);
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENTS, student.getShort_name());
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE, date);
				map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customer_id);

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
			String notice_id,
			String type,
			String class_name,
			String class_section_name,
			String title,
			String description,
			String date,
			notice activity,String customer_id) {

		BaseResource[] students = null;
		if ("SCHOOL".equals(type)) {
			if (Util.isEmpty(activity.getSchools())) {
				return;
			}
			String[] ids = activity.getSchools().toArray(new String[activity.getSchools().size()]);
			students = StudentHelper.getInstance().getStudentBySchools(ids);
		} else if ("CLASS".equals(type)) {
			if (Util.isEmpty(activity.getSchools())) {
				return;
			}
			String[] ids = activity.getSchools().toArray(new String[activity.getSchools().size()]);
			students = StudentHelper.getInstance().getClassStudent(ids,class_name);
		} else if ("SECTION".equals(type)) {
			if (Util.isEmpty(activity.getSchools())) {
				return;
			}
			String[] ids = activity.getSchools().toArray(new String[activity.getSchools().size()]);
			students = StudentHelper.getInstance().getSectionStudent(ids,class_section_name);
		} 
		if ((students == null) || (students.length == 0)) 
			return;
		ApplicationLogger.info("Sending notice to "+ students.length + " Students", this.getClass());
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		Map<String, student> studentMap = new HashMap<String, student>();
		String smsAlert = "N";
		String emailAlert = "N";
		String appAlert = "N";
		Map<String, student> smsAlertMap = new HashMap<String, student>();
		Map<String, String> emailAlertMap = new HashMap<String, String>();;
		Map<String, String> appAlertMap = new HashMap<String, String>();;

		for(int i=0; i< students.length; i++) {
			student _student = (student)students[i];
			school _school = (school)StudentHelper.getInstance().getById(_student.getSchool_id());
			try {
				Student_mapHelper.getInstance().addNotice(_student.getId(), notice_id);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
			
			if (!"Y".equals(_school.getFeature_notice_sms())) {
				smsAlert = "N";
			}
			
			if (!"Y".equals(_school.getFeature_notice_email())) {
				emailAlert = "N";
			}
			ArrayList<BaseResource> _users = Student_mapHelper.getInstance().getUsersList(_student.getId());
			for(int j=0; j < _users.size(); j++) {
				userMap.put(_users.get(j).getId(), _users.get(j));
				appAlertMap.put(_users.get(j).getId(), appAlert);
				studentMap.put(_users.get(j).getId(), _student);
			}

			if ("Y".equals(smsAlert)) {
				if ((!Util.isEmpty(_student.getFather_mobile_no())) && 
						("Y".equals(activity.getSend_father_mother()) || "FATHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
					smsAlertMap.put(_student.getFather_mobile_no(),  _student);
				}
				if ((!Util.isEmpty(_student.getMother_mobile_no())) && 
						("Y".equals(activity.getSend_father_mother()) || "MOTHER".equals(_student.getPrimary_contact()) || "BOTH".equals(_student.getPrimary_contact()))) {
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
			try {
				StudentHelper.getInstance().incrementCounter(_student.getId(), student.FIELD_NOTICE_COUNT, 1);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ApplicationLogger.info("Sending notice by SMS : "+ smsAlertMap.size() + "Email :"+ emailAlertMap.size() +" Notification " + appAlertMap.size()+ " Users and Total " + userMap.size() , this.getClass());
		NoticeHelper.getInstance().updateSentCounter(notice_id, 
				students.length, userMap.size(), smsAlertMap.size(), emailAlertMap.size(), appAlertMap.size());
		
		sendNotification2Users(activity,_notification, userMap, studentMap,
				appAlertMap,
				class_section_name,
				title,
				description,
				date,customer_id);
		
		sendSMS2Users(activity,_notification, 
				smsAlertMap,
				class_section_name,
				title,
				description,
				date,customer_id);
		
		sendEmail2Users(activity,_notification, 
				emailAlertMap,
				class_section_name,
				title,
				description,
				date,customer_id);
	}
	
	@Override
	public void process(notification _notification) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Processing the Notification " + _notification.getId() + "::"+_notification.getNotification_id() + "::" +_notification.getNotification_data());
			Map<String, Object> data = _notification.getNotification_data();
			if (data == null)
				return;
			String type = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_TYPE);
			String class_name = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CLASS_NAME);
			String section_name = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_SECTION_NAME);
			String class_section_name = class_name+" "+section_name;
			String title = (String)data.get("TITLE");
			String description = (String)data.get("DESCRIPTION");
			String date = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE);
			String notice_id = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_ID);
			String customer_id = (String)data.get(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID);

			notice activity = (notice)NoticeHelper.getInstance().getById(notice_id);
			if (activity == null) {
				ApplicationLogger.error("Unable to process Notice, because it doesn't exists " +notice_id, this.getClass());
				return;
			}
			sendNotification(_notification,notice_id,type,class_name,
					class_section_name, title,description,date,activity,customer_id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
