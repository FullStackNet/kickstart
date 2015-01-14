package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.medical_record;


public class Medical_recordHelper extends BaseHelper {
	
	Medical_recordHelper() {
		super(new medical_record());
		// TODO Auto-generated constructor stub
	}
	private static Medical_recordHelper instance;
	
	public static Medical_recordHelper getInstance() {
		if (instance == null)
			instance = new Medical_recordHelper();
		return instance;
	}
}
