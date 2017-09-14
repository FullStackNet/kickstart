package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.school_map;
import application.c4t.vehicle.school.resource.student_map;


public class School_mapHelper extends BaseHelper {
	
	School_mapHelper() {
		super(new school_map());
		// TODO Auto-generated constructor stub
	}
	private static School_mapHelper instance;
	
	public static School_mapHelper getInstance() {
		if (instance == null)
			instance = new School_mapHelper();
		return instance;
	}
	
	public void addStudent(String schoolId,String studentId) throws ApplicationException {
		if (schoolId == null) return;
		if (studentId == null) return;
		school_map _map = new school_map();
		_map.setId(schoolId);
		_map.addStudents(studentId);
		AddOrUpdate(_map);
	}
	
	public void addClass_section(String schoolId,String class_section_name) throws ApplicationException {
		if (schoolId == null) return;
		if (class_section_name == null) return;
		school_map _map = new school_map();
		_map.setId(schoolId);
		_map.addClass_sections(class_section_name);
		AddOrUpdate(_map);
	}
	
	public void removeStudent(String schoolId,String studentId) throws ApplicationException {
		if (schoolId == null) return;
		if (studentId == null) return;
		school_map _map = new school_map();
		_map.setId(schoolId);
		_map.addStudents(studentId);
		unset(_map);
	}
	
	public ArrayList<BaseResource> getStudentsList(String studentId) {
		ArrayList<BaseResource>  map = new ArrayList<BaseResource>();
		school_map _map = (school_map)getSelectedFieldsById(studentId,school_map.FIELD_STUDENTS);
		if ((_map == null) || (_map.getStudents()== null))
			return map;
		return UserHelper.getInstance().getListById(_map.getStudents().toArray(new String[_map.getStudents().size()]));
	}
	
	public Map<String,BaseResource> getUsersMap(String studentId) {
		Map<String,BaseResource>  map = new HashMap<String,BaseResource>();
		student_map _map = (student_map)getById(studentId);
		if ((_map == null) || (_map.getUsers() == null))
			return map;
		return UserHelper.getInstance().getMapById(_map.getUsers().toArray(new String[_map.getUsers().size()]));
	}
}
