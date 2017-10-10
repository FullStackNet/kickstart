package platform.helper;

import platform.resource.meter_hourly_log;
import platform.resource.meter_monthly_log;


public class Meter_monthly_logHelper extends BaseHelper {

	public Meter_monthly_logHelper() {
		super(new meter_monthly_log());
		// TODO Auto-generated constructor stub
	}
	private static Meter_monthly_logHelper instance;
	
	public static Meter_monthly_logHelper getInstance() {
		if (instance == null)
			instance = new Meter_monthly_logHelper();
		return instance;
	}
}
