package platform.helper;

import platform.resource.activity;
import platform.resource.meter_log;


public class Meter_logHelper extends BaseHelper {

	public Meter_logHelper() {
		super(new meter_log());
		// TODO Auto-generated constructor stub
	}
	private static Meter_logHelper instance;
	
	public static Meter_logHelper getInstance() {
		if (instance == null)
			instance = new Meter_logHelper();
		return instance;
	}
}
