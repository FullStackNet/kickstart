package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.school_user_map;


public class School_user_mapHelper extends BaseHelper {
	
	School_user_mapHelper() {
		super(new school_user_map());
		// TODO Auto-generated constructor stub
	}
	private static School_user_mapHelper instance;
	
	public static School_user_mapHelper getInstance() {
		if (instance == null)
			instance = new School_user_mapHelper();
		return instance;
	}
	
	public void addStudent(String userId,String studentId) throws ApplicationException {
		if (studentId == null) return;
		if (userId == null) return;
		school_user_map _map = new school_user_map();
		_map.setId(userId);
		_map.addStudents(studentId);
		AddOrUpdate(_map);
	}
}
