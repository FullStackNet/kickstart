package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.school;
import application.c4t.vehicle.school.resource.student;


public class SchoolHelper extends BaseHelper {
	
	SchoolHelper() {
		super(new school());
		// TODO Auto-generated constructor stub
	}
	private static SchoolHelper instance;
	
	public static SchoolHelper getInstance() {
		if (instance == null)
			instance = new SchoolHelper();
		return instance;
	}
	
}
