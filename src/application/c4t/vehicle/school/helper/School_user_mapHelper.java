package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.ApplianceHelper;
import platform.helper.BaseHelper;
import platform.helper.HelperUtils;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.Util;
import application.c4t.vehicle.school.resource.school_user_map;
import application.c4t.vehicle.school.resource.teacher;


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
	
	public void addSchool(String userId,String schoolId) throws ApplicationException {
		if (schoolId == null) return;
		if (userId == null) return;
		school_user_map _map = new school_user_map();
		_map.setId(userId);
		_map.addSchools(schoolId);
		AddOrUpdate(_map);
	}
	
	public void addAppliance(String userId,String applianceId) throws ApplicationException {
		if (applianceId == null) return;
		if (userId == null) return;
		school_user_map _map = new school_user_map();
		_map.setId(userId);
		_map.addAppliances(applianceId);
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
	
	public BaseResource[] getUsersForSchool(String schoolId) {
		Expression e = new Expression(school_user_map.FIELD_SCHOOLS, REL_OP.EACH_ELEMENT_IN, new String[]{schoolId});
		BaseResource[] resources =  getByExpression(e);
		String[] userIds = HelperUtils.convertResource2IdArray(resources);
		return UserHelper.getInstance().getById(userIds,null);
	}
	
	public BaseResource[] getSchools(String userId) {
		school_user_map _map = (school_user_map)getById(userId);
		if ((_map == null) || (_map.getSchools() == null))
			return null;
		return SchoolHelper.getInstance().getById(_map.getSchools().toArray(new String[_map.getSchools().size()]),
				new String[]{user.FIELD_NAME});
	}
	
	public BaseResource[] getAppliances(String userId) {
		school_user_map _map = (school_user_map)getById(userId);
		if ((_map == null) || (_map.getAppliances() == null))
			return null;
		return ApplianceHelper.getInstance().getById(_map.getAppliances().toArray(new String[_map.getAppliances().size()]),
				new String[]{user.FIELD_NAME});
	}
	
	public String[] getSchoolIds(String userId) {
		school_user_map _map = (school_user_map)getById(userId);
		if ((_map == null) || (_map.getSchools() == null))
			return null;
		String[] ids = new String[_map.getSchools().size()];
		for(int i =0; i < _map.getSchools().size(); i++) {
				ids[i] = _map.getSchools().get(i).toString();
		}
		return ids;
	}
	
	public void removeStudent(String userId,String studentId) throws ApplicationException {
		school_user_map _map = new school_user_map();
		_map.setId(userId);
		_map.addStudents(studentId);
		unset(_map);
	}
	
	public String getTeacherIdFromUserId(String userId) {
		school_user_map _map = (school_user_map)getById(userId);
		if ((_map == null) || (_map.getTeachers() == null) || (Util.isEmpty(_map.getTeachers())))
			return null;
		
		teacher _teacher = (teacher)TeacherHelper.getInstance().getById((String)_map.getTeachers().get(0));
		if (_teacher == null) {
			return null;
		}
		
		return _teacher.getId();
	}
	

	public teacher getTeacherFromUserId(String userId) {
		school_user_map _map = (school_user_map)getById(userId);
		if ((_map == null) || (_map.getTeachers() == null) || (Util.isEmpty(_map.getTeachers())))
			return null;
		return (teacher)TeacherHelper.getInstance().getById((String)_map.getTeachers().get(0));
	}
}
