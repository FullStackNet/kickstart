package platform.helper;

import platform.resource.BaseResource;
import platform.resource.sms_log;



public class Sms_logHelper extends BaseHelper {
	public Sms_logHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	private static Sms_logHelper instance;

	public static Sms_logHelper getInstance() {
		if (instance == null)
			instance = new Sms_logHelper();
		return instance;
	}

	Sms_logHelper() {
		super(new sms_log());
		// TODO Auto-generated constructor stub
	}
}
