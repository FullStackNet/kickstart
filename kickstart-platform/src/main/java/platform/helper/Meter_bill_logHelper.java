package platform.helper;

import platform.resource.meter_bill_log;
import platform.resource.meter_daily_log;


public class Meter_bill_logHelper extends BaseHelper {

	public Meter_bill_logHelper() {
		super(new meter_bill_log());
		// TODO Auto-generated constructor stub
	}
	private static Meter_bill_logHelper instance;
	
	public static Meter_bill_logHelper getInstance() {
		if (instance == null)
			instance = new Meter_bill_logHelper();
		return instance;
	}
}
