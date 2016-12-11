package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Util;
import application.c4t.vehicle.school.resource.class_section;
import application.c4t.vehicle.school.resource.teacher_map;


public class Teacher_mapHelper extends BaseHelper {
	
	Teacher_mapHelper() {
		super(new teacher_map());
		// TODO Auto-generated constructor stub
	}
	private static Teacher_mapHelper instance;
	
	public static Teacher_mapHelper getInstance() {
		if (instance == null)
			instance = new Teacher_mapHelper();
		return instance;
	}
	
	public void addUser(String teacherId,String userId) throws ApplicationException {
		if (teacherId == null) return;
		if (userId == null) return;
		teacher_map _map = new teacher_map();
		_map.setId(teacherId);
		_map.addUsers(userId);
		AddOrUpdate(_map);
	}
	
	public void addClass_section(String teacherId, String section) throws ApplicationException {
		if (teacherId == null) return;
		if (section == null) return;
		
		teacher_map _map = new teacher_map();
		_map.setId(teacherId);
		_map.addClass_sections(section);
		AddOrUpdate(_map);
	}
	
	public ArrayList<BaseResource> getUsersList(String teacherId) {
		ArrayList<BaseResource>  map = new ArrayList<BaseResource>();
		teacher_map _map = (teacher_map)getById(teacherId);
		if ((_map == null) || (_map.getUsers() == null))
			return map;
		return UserHelper.getInstance().getListById(_map.getUsers().toArray(new String[_map.getUsers().size()]));
	}
	
	public Map<String,BaseResource> getUsersMap(String teacherId) {
		Map<String,BaseResource>  map = new HashMap<String,BaseResource>();
		teacher_map _map = (teacher_map)getById(teacherId);
		if ((_map == null) || (_map.getUsers() == null))
			return map;
		return UserHelper.getInstance().getMapById(_map.getUsers().toArray(new String[_map.getUsers().size()]));
	}

	public BaseResource[] getClass_sectionsByTeacherId(String teacherId) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		if (teacherId == null)
			return null;
		
		teacher_map _map = (teacher_map)getById(teacherId);
		if ((_map == null) || (_map.getClass_sections() == null) || (Util.isEmpty(_map.getClass_sections())))
			return null;
		
		String[] sections = _map.getClass_sections().toArray(new String[_map.getClass_sections().size()]);
		for(String section: sections) {
			class_section _section = new class_section();
			_section.setId(section);
			list.add(_section);
		}
		
		return list.toArray(new class_section[list.size()]);
	}
}