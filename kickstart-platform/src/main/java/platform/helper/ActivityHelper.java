package platform.helper;

import platform.resource.activity;


public class ActivityHelper extends BaseHelper {
	
	public ActivityHelper() {
		super(new activity());
		// TODO Auto-generated constructor stub
	}
	private static ActivityHelper instance;
	
	public static ActivityHelper getInstance() {
		if (instance == null)
			instance = new ActivityHelper();
		return instance;
	}
}
