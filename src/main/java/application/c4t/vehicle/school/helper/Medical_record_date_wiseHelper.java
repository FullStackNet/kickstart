package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.medical_record_date_wise;


public class Medical_record_date_wiseHelper extends BaseHelper {
	
	Medical_record_date_wiseHelper() {
		super(new medical_record_date_wise());
		// TODO Auto-generated constructor stub
	}
	private static Medical_record_date_wiseHelper instance;
	
	public static Medical_record_date_wiseHelper getInstance() {
		if (instance == null)
			instance = new Medical_record_date_wiseHelper();
		return instance;
	}
}
