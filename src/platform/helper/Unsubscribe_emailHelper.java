package platform.helper;

import platform.resource.unsubscribe_email;


public class Unsubscribe_emailHelper extends BaseHelper {
	
	public Unsubscribe_emailHelper() {
		super(new unsubscribe_email());
		// TODO Auto-generated constructor stub
	}
	private static Unsubscribe_emailHelper instance;
	
	public static Unsubscribe_emailHelper getInstance() {
		if (instance == null)
			instance = new Unsubscribe_emailHelper();
		return instance;
	}
}
