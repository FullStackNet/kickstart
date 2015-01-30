package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.department;


public class DepartmentHelper extends BaseHelper {
	DepartmentHelper() {
		super(new department());
		// TODO Auto-generated constructor stub
	}
	private static DepartmentHelper instance;
	
	public static DepartmentHelper getInstance() {
		if (instance == null)
			instance = new DepartmentHelper();
		return instance;
	}
	
	
}
