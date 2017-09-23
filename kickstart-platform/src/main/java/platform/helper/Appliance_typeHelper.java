package platform.helper;

import platform.resource.appliance_type;


public class Appliance_typeHelper extends BaseHelper {
	
	public Appliance_typeHelper() {
		super(new appliance_type());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_typeHelper instance;
	
	public static Appliance_typeHelper getInstance() {
		if (instance == null)
			instance = new Appliance_typeHelper();
		return instance;
	}
}
