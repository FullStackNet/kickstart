package platform.helper;

import platform.resource.appliance_make;


public class Appliance_makeHelper extends BaseHelper {
	
	public Appliance_makeHelper() {
		super(new appliance_make());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_makeHelper instance;
	
	public static Appliance_makeHelper getInstance() {
		if (instance == null)
			instance = new Appliance_makeHelper();
		return instance;
	}
}
