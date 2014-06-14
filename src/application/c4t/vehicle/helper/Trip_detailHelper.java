package application.c4t.vehicle.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.resource.trip_detail;


public class Trip_detailHelper extends BaseHelper {
	
	public Trip_detailHelper() {
		super(new trip_detail());
		// TODO Auto-generated constructor stub
	}
	private static Trip_detailHelper instance;
	
	public static Trip_detailHelper getInstance() {
		if (instance == null)
			instance = new Trip_detailHelper();
		return instance;
	}
}
