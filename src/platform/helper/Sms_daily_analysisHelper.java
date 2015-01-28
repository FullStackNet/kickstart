package platform.helper;

import platform.resource.BaseResource;
import platform.resource.sms_daily_analysis;



public class Sms_daily_analysisHelper extends BaseHelper {
	public Sms_daily_analysisHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	private static Sms_daily_analysisHelper instance;

	public static Sms_daily_analysisHelper getInstance() {
		if (instance == null)
			instance = new Sms_daily_analysisHelper();
		return instance;
	}

	Sms_daily_analysisHelper() {
		super(new sms_daily_analysis());
		// TODO Auto-generated constructor stub
	}
}
