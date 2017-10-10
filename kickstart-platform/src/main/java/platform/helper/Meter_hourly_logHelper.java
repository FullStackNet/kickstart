package platform.helper;

import platform.resource.activity;
import platform.resource.meter_hourly_log;


public class Meter_hourly_logHelper extends BaseHelper {

	public Meter_hourly_logHelper() {
		super(new meter_hourly_log());
		// TODO Auto-generated constructor stub
	}
	private static Meter_hourly_logHelper instance;
	
	public static Meter_hourly_logHelper getInstance() {
		if (instance == null)
			instance = new Meter_hourly_logHelper();
		return instance;
	}
}
