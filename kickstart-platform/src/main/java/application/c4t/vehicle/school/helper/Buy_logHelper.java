package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.buy_log;


public class Buy_logHelper extends BaseHelper {
	Buy_logHelper() {
		super(new buy_log());
		// TODO Auto-generated constructor stub
	}
	private static Buy_logHelper instance;
	
	public static Buy_logHelper getInstance() {
		if (instance == null)
			instance = new Buy_logHelper();
		return instance;
	}
}
