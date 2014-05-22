package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.homework;
import application.c4t.vehicle.school.resource.teacher;


public class HomeworkHelper extends BaseHelper {
	
	HomeworkHelper() {
		super(new homework());
		// TODO Auto-generated constructor stub
	}
	private static HomeworkHelper instance;
	
	public static HomeworkHelper getInstance() {
		if (instance == null)
			instance = new HomeworkHelper();
		return instance;
	}
}
