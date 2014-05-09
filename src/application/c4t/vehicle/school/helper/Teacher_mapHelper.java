package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
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
}
