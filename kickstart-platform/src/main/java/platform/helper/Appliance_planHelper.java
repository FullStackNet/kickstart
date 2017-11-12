package platform.helper;

import platform.resource.appliance_make;
import platform.resource.appliance_plan;


public class Appliance_planHelper extends BaseHelper {

	public Appliance_planHelper() {
		super(new appliance_plan());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_planHelper instance;
	
	public static Appliance_planHelper getInstance() {
		if (instance == null)
			instance = new Appliance_planHelper();
		return instance;
	}
}
