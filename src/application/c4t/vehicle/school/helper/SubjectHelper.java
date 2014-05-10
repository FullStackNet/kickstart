package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.subject;


public class SubjectHelper extends BaseHelper {
	
	SubjectHelper() {
		super(new subject());
		// TODO Auto-generated constructor stub
	}
	private static SubjectHelper instance;
	
	public static SubjectHelper getInstance() {
		if (instance == null)
			instance = new SubjectHelper();
		return instance;
	}
}
