package application.traceme.helper;

import platform.helper.BaseHelper;
import application.traceme.resource.traceme_device;


public class Traceme_deviceHelper extends BaseHelper {
	Traceme_deviceHelper() {
		super(new traceme_device());
		// TODO Auto-generated constructor stub
	}
	private static Traceme_deviceHelper instance;
	
	public static Traceme_deviceHelper getInstance() {
		if (instance == null)
			instance = new Traceme_deviceHelper();
		return instance;
	}
}
