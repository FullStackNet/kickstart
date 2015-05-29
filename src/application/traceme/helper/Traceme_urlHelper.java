package application.traceme.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
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
	public void updateStatus(String url,String status) {
		traceme_url _url = new traceme_url(url);
		_url.setStatus(status);
		try {
			Traceme_urlHelper.getInstance().update(_url);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void updateLocation(String url,String latitude,String longitude) {
		traceme_url _url = new traceme_url(url);
		_url.setLatitude(latitude);
		_url.setLongitude(longitude);
		try {
			Traceme_urlHelper.getInstance().update(_url);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BaseResource[] getByDeviceId(String deviceId) {
		Expression e1 = new Expression(traceme_url.FIELD_DEVICE_ID, REL_OP.EQ, deviceId);
		Expression e2 = new Expression(traceme_url.FIELD_STATUS, REL_OP.EQ, traceme_url.TRACEME_URL_STATUS_ACTIVE);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}
}
