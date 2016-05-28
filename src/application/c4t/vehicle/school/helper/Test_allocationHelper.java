package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.test_allocation;


public class Test_allocationHelper extends BaseHelper {
	
	Test_allocationHelper() {
		super(new test_allocation());
		// TODO Auto-generated constructor stub
	}
	private static Test_allocationHelper instance;
	
	public static Test_allocationHelper getInstance() {
		if (instance == null)
			instance = new Test_allocationHelper();
		return instance;
	}
}
