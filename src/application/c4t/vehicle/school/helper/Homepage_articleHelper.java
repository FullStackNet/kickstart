package application.c4t.vehicle.school.helper;

import application.c4t.vehicle.school.resource.homepage_article;
import platform.helper.BaseHelper;


public class Homepage_articleHelper extends BaseHelper {
	
	Homepage_articleHelper() {
		super(new homepage_article());
		// TODO Auto-generated constructor stub
	}
	private static Homepage_articleHelper instance;
	
	public static Homepage_articleHelper getInstance() {
		if (instance == null)
			instance = new Homepage_articleHelper();
		return instance;
	}
	
}
