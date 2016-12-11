package platform.helper;

import platform.resource.session;


public class SessionHelper extends BaseHelper {
	
	public SessionHelper() {
		super(new session());
		// TODO Auto-generated constructor stub
	}
	private static SessionHelper instance;
	
	public static SessionHelper getInstance() {
		if (instance == null)
			instance = new SessionHelper();
		return instance;
	}
}
