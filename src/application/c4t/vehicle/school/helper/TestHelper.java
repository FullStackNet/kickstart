package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.test;


public class TestHelper extends BaseHelper {
	
	TestHelper() {
		super(new test());
		// TODO Auto-generated constructor stub
	}
	private static TestHelper instance;
	
	public static TestHelper getInstance() {
		if (instance == null)
			instance = new TestHelper();
		return instance;
	}
}
