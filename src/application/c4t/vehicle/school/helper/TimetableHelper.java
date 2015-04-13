package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.timetable;


public class TimetableHelper extends BaseHelper {
	TimetableHelper() {
		super(new timetable());
		// TODO Auto-generated constructor stub
	}
	private static TimetableHelper instance;
	
	public static TimetableHelper getInstance() {
		if (instance == null)
			instance = new TimetableHelper();
		return instance;
	}
}
