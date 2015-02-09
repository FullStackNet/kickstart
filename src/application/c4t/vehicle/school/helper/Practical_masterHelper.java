package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.practical_master;


public class Practical_masterHelper extends BaseHelper {
	
	Practical_masterHelper() {
		super(new practical_master());
		// TODO Auto-generated constructor stub
	}
	private static Practical_masterHelper instance;
	
	public static Practical_masterHelper getInstance() {
		if (instance == null)
			instance = new Practical_masterHelper();
		return instance;
	}
}
