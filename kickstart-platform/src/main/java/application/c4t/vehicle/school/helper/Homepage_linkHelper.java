package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.homepage_link;


public class Homepage_linkHelper extends BaseHelper {
	
	Homepage_linkHelper() {
		super(new homepage_link());
		// TODO Auto-generated constructor stub
	}
	private static Homepage_linkHelper instance;
	
	public static Homepage_linkHelper getInstance() {
		if (instance == null)
			instance = new Homepage_linkHelper();
		return instance;
	}
	
}
