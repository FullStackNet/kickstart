package application.traceme.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import application.traceme.resource.traceme_url;


public class Traceme_urlHelper extends BaseHelper {
	Traceme_urlHelper() {
		super(new traceme_url());
		// TODO Auto-generated constructor stub
	}
	private static Traceme_urlHelper instance;
	
	public static Traceme_urlHelper getInstance() {
		if (instance == null)
			instance = new Traceme_urlHelper();
		return instance;
	}
	
	/*BaseResource[] getByDeviceId(String deviceId) {
		Expression e = new Expression(traceme_url.FIELD_DEVICE_ID, REL_OP.EQ, );
	}*/
}
