package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.practical_attendance;


public class Practical_attendanceHelper extends BaseHelper {
	
	Practical_attendanceHelper() {
		super(new practical_attendance());
		// TODO Auto-generated constructor stub
	}
	private static Practical_attendanceHelper instance;
	
	public static Practical_attendanceHelper getInstance() {
		if (instance == null)
			instance = new Practical_attendanceHelper();
		return instance;
	}
}
