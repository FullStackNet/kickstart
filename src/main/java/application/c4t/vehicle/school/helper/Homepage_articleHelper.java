package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.homepage_article;


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
