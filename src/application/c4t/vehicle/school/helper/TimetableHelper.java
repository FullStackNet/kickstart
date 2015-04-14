package application.c4t.vehicle.school.helper;

import application.c4t.vehicle.school.resource.timetable;


public class TimetableHelper extends BaseSchoolHelper {
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
