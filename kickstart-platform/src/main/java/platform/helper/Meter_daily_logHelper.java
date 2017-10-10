package platform.helper;

import platform.resource.meter_daily_log;
import platform.resource.meter_hourly_log;


public class Meter_daily_logHelper extends BaseHelper {

	public Meter_daily_logHelper() {
		super(new meter_daily_log());
		// TODO Auto-generated constructor stub
	}
	private static Meter_daily_logHelper instance;
	
	public static Meter_daily_logHelper getInstance() {
		if (instance == null)
			instance = new Meter_daily_logHelper();
		return instance;
	}
}
