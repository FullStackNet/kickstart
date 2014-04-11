package application.c4t.vehicle.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.resource.trip;


public class TripHelper extends BaseHelper {
	
	public TripHelper() {
		super(new trip());
		// TODO Auto-generated constructor stub
	}
	private static TripHelper instance;
	
	public static TripHelper getInstance() {
		if (instance == null)
			instance = new TripHelper();
		return instance;
	}
}
