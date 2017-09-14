package platform.helper;

import platform.resource.mobile_map;


public class Mobile_mapHelper extends BaseHelper {
	
	public Mobile_mapHelper() {
		super(new mobile_map());
		// TODO Auto-generated constructor stub
	}
	private static Mobile_mapHelper instance;
	
	public static Mobile_mapHelper getInstance() {
		if (instance == null)
			instance = new Mobile_mapHelper();
		return instance;
	}
}
