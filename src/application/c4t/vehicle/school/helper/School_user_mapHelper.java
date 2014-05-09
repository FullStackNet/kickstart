package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.resource.user;
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
	
	public void addTeacher(String userId,String teacherId) throws ApplicationException {
		if (teacherId == null) return;
		if (userId == null) return;
		school_user_map _map = new school_user_map();
		_map.setId(userId);
		_map.addTeachers(teacherId);
		AddOrUpdate(_map);
	}
	
	public BaseResource[] getStudents(String userId) {
		school_user_map _map = (school_user_map)getById(userId);
		if ((_map == null) || (_map.getStudents() == null))
			return null;
		return StudentHelper.getInstance().getById(_map.getStudents().toArray(new String[_map.getStudents().size()]),
				new String[]{user.FIELD_NAME});
	}
	
	public BaseResource[] getTeachers(String userId) {
		school_user_map _map = (school_user_map)getById(userId);
		if ((_map == null) || (_map.getTeachers() == null))
			return null;
		return TeacherHelper.getInstance().getById(_map.getTeachers().toArray(new String[_map.getTeachers().size()]),
				new String[]{user.FIELD_NAME});
	}
}
