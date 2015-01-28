package platform.helper;

import platform.resource.BaseResource;
import platform.resource.sms_log;
import platform.util.ApplicationException;



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
	
	public void updateSent(String id)  {
		sms_log _log = new sms_log(id);
		_log.setSent_status("S");
		try {
			update(_log);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateSentFail(String id)  {
		sms_log _log = new sms_log(id);
		_log.setSent_status("F");
		try {
			update(_log);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
