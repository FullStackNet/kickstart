package application.c4t.vehicle.school.helper;

import application.c4t.vehicle.school.resource.test_group;
import platform.helper.BaseHelper;


public class Test_groupHelper extends BaseHelper {
	
	Test_groupHelper() {
		super(new test_group());
		// TODO Auto-generated constructor stub
	}
	private static Test_groupHelper instance;
	
	public static Test_groupHelper getInstance() {
		if (instance == null)
			instance = new Test_groupHelper();
		return instance;
	}
}
