package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.test_allocation_student;


public class Test_allocation_studentHelper extends BaseHelper {
	
	Test_allocation_studentHelper() {
		super(new test_allocation_student());
		// TODO Auto-generated constructor stub
	}
	private static Test_allocation_studentHelper instance;
	
	public static Test_allocation_studentHelper getInstance() {
		if (instance == null)
			instance = new Test_allocation_studentHelper();
		return instance;
	}
}
