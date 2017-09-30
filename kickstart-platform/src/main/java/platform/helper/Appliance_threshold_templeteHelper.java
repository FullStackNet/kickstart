package platform.helper;

import platform.resource.appliance_threshold_templete;


public class Appliance_threshold_templeteHelper extends BaseHelper {

	public Appliance_threshold_templeteHelper() {
		super(new appliance_threshold_templete());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_threshold_templeteHelper instance;
	
	public static Appliance_threshold_templeteHelper getInstance() {
		if (instance == null)
			instance = new Appliance_threshold_templeteHelper();
		return instance;
	}
}
