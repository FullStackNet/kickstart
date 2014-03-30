package platform.helper;

import platform.resource.appliance_model;


public class Appliance_partHelper extends BaseHelper {
	
	public Appliance_partHelper() {
		super(new appliance_model());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_partHelper instance;
	
	public static Appliance_partHelper getInstance() {
		if (instance == null)
			instance = new Appliance_partHelper();
		return instance;
	}
}
