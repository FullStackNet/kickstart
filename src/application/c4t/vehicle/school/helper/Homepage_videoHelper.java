package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.homepage_video;


public class Homepage_videoHelper extends BaseHelper {
	
	Homepage_videoHelper() {
		super(new homepage_video());
		// TODO Auto-generated constructor stub
	}
	private static Homepage_videoHelper instance;
	
	public static Homepage_videoHelper getInstance() {
		if (instance == null)
			instance = new Homepage_videoHelper();
		return instance;
	}
	
}
