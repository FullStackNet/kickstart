package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.student_map;


public class Student_mapHelper extends BaseHelper {
	
	Student_mapHelper() {
		super(new student_map());
		// TODO Auto-generated constructor stub
	}
	private static Student_mapHelper instance;
	
	public static Student_mapHelper getInstance() {
		if (instance == null)
			instance = new Student_mapHelper();
		return instance;
	}
	
	public void addUser(String studentId,String userId) throws ApplicationException {
		if (studentId == null) return;
		if (userId == null) return;
		student_map _map = new student_map();
		_map.setId(studentId);
		_map.addUsers(userId);
		AddOrUpdate(_map);
	}
}
