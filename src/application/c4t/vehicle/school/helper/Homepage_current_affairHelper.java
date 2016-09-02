package application.c4t.vehicle.school.helper;

import application.c4t.vehicle.school.resource.homepage_current_affair;
import platform.helper.BaseHelper;


public class Homepage_current_affairHelper extends BaseHelper {
	
	Homepage_current_affairHelper() {
		super(new homepage_current_affair());
		// TODO Auto-generated constructor stub
	}
	private static Homepage_current_affairHelper instance;
	
	public static Homepage_current_affairHelper getInstance() {
		if (instance == null)
			instance = new Homepage_current_affairHelper();
		return instance;
	}
	
}
