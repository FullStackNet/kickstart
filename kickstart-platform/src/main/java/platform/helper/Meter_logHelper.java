package platform.helper;

import platform.resource.activity;


public class Meter_logHelper extends BaseHelper {

	public Meter_logHelper() {
		super(new activity());
		// TODO Auto-generated constructor stub
	}
	private static Meter_logHelper instance;
	
	public static Meter_logHelper getInstance() {
		if (instance == null)
			instance = new Meter_logHelper();
		return instance;
	}
}
