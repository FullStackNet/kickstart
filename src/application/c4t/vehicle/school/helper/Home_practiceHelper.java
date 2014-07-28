package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.home_practice;


public class Home_practiceHelper extends BaseHelper {
	
	Home_practiceHelper() {
		super(new home_practice());
		// TODO Auto-generated constructor stub
	}
	private static Home_practiceHelper instance;
	
	public static Home_practiceHelper getInstance() {
		if (instance == null)
			instance = new Home_practiceHelper();
		return instance;
	}
	
}
