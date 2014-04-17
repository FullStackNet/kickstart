package application.c4t.vehicle.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.resource.stopage;


public class StopageHelper extends BaseHelper {
	
	public StopageHelper() {
		super(new stopage());
		// TODO Auto-generated constructor stub
	}
	private static StopageHelper instance;
	
	public static StopageHelper getInstance() {
		if (instance == null)
			instance = new StopageHelper();
		return instance;
	}
}
