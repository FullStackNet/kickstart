package application.c4t.vehicle.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.resource.driver;


public class DriverHelper extends BaseHelper {
	
	public DriverHelper() {
		super(new driver());
		// TODO Auto-generated constructor stub
	}
	private static DriverHelper instance;
	
	public static DriverHelper getInstance() {
		if (instance == null)
			instance = new DriverHelper();
		return instance;
	}
}
