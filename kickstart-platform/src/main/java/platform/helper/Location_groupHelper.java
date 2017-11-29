package platform.helper;

import platform.resource.activity;
import platform.resource.location_group;


public class Location_groupHelper extends BaseHelper {

	public Location_groupHelper() {
		super(new location_group());
		// TODO Auto-generated constructor stub
	}
	private static Location_groupHelper instance;
	
	public static Location_groupHelper getInstance() {
		if (instance == null)
			instance = new Location_groupHelper();
		return instance;
	}
}
