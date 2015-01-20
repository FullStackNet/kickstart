package platform.schedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.manager.ApplicationManager;
import platform.message.SendSMS;
import platform.notification.NotificationFactory;
import platform.resource.BaseResource;
import platform.resource.schedule;
import platform.util.ApplicationConstants;
import platform.util.Json;
import platform.util.Util;
import application.c4t.vehicle.school.helper.SchoolHelper;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.school;
import application.c4t.vehicle.school.resource.student;

public class BirthDayScheduleTask extends ScheduleTask {

	public BirthDayScheduleTask() {
		super(ScheduleFactory.BIRTHDAY);
		// TODO Auto-generated constructor stub
	}
	
	void sendNotification(String customer_id,student _student,school _school) {
	
		Map<String, BaseResource> userMap = new HashMap<String, BaseResource>();
		String smsAlert = "Y";
		Map<String, String> smsAlertMap = new HashMap<String, String>();
		ArrayList<BaseResource> _users = Student_mapHelper.getInstance().getUsersList(_student.getId());
		for(int j=0; j < _users.size(); j++) {
			userMap.put(_users.get(j).getId(), _users.get(j));
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

		sendSMS2Users(smsAlertMap,customer_id,_student,_school);
	}

	void sendSMS2Users(Map<String, String> smsAlertMap,
			String customer_id,student _student, school _school) {

		for(Map.Entry<String, String> entry : smsAlertMap.entrySet()) {
			SendSMS smsMessage = new SendSMS();
			smsMessage.setMobile_no(entry.getKey());
			smsMessage.setType(ApplicationConstants.SMS_TYPE_SEND_BIRTHDAY);
			Map<String, String> map = new HashMap<String, String>();
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_NAME, _student.getShort_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID, customer_id);
			String brandName = "School";
			if (_school.getBrand_name() == null) {
				brandName = _school.getBrand_name();
			}
			map.put("BRAND_NAME", brandName);
			
			String params = Json.maptoString(map);
			smsMessage.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
					smsMessage);
	
		}
	}
	@Override
	public void process(schedule _schedule) {
		// TODO Auto-generated method stub
		//try {
			System.out.println("Need to process the birthday task " + _schedule.getId());
			String student_id = _schedule.getReference_id();
			student _student = (student)StudentHelper.getInstance().getById(student_id);
			if (_student == null)
					return;
			school _school = (school)SchoolHelper.getInstance().getById(_student.getSchool_id());
			sendNotification(_schedule.getCustomer_id(),_student,_school);
			//} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}

	}

}
