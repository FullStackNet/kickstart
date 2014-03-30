package platform.helper;

import platform.resource.appliance_model;


public class Appliance_modelHelper extends BaseHelper {
	
	public Appliance_modelHelper() {
		super(new appliance_model());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_modelHelper instance;
	
	public static Appliance_modelHelper getInstance() {
		if (instance == null)
			instance = new Appliance_modelHelper();
		return instance;
	}
}
