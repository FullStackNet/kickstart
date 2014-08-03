package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.notice;
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
	
	public void addNotice(String studentId,String noticeId) throws ApplicationException {
		if (studentId == null) return;
		if (noticeId == null) return;
		student_map _map = new student_map();
		_map.setId(studentId);
		_map.addNotices(noticeId);
		AddOrUpdate(_map);
	}
	
	public void addParent(String studentId,String parentId) throws ApplicationException {
		if (studentId == null) return;
		if (parentId == null) return;
		student_map _map = new student_map();
		_map.setId(studentId);
		_map.addParents(parentId);
		AddOrUpdate(_map);
	}
	
	public ArrayList<BaseResource> getUsersList(String studentId) {
		ArrayList<BaseResource>  map = new ArrayList<BaseResource>();
		student_map _map = (student_map)getById(studentId);
		if ((_map == null) || (_map.getUsers() == null))
			return map;
		return UserHelper.getInstance().getListById(_map.getUsers().toArray(new String[_map.getUsers().size()]));
	}
	
	public BaseResource[] getNotices(String studentId) {
		student_map _map = (student_map)getById(studentId);
		if ((_map == null) || (_map.getNotices() == null))
			return null;
		return NoticeHelper.getInstance().getById(_map.getNotices().toArray(new String[_map.getNotices().size()]),new String[]{notice.FIELD_NOTICE_DATE + " desc"});
	}
	
	public Map<String,BaseResource> getUsersMap(String studentId) {
		Map<String,BaseResource>  map = new HashMap<String,BaseResource>();
		student_map _map = (student_map)getById(studentId);
		if ((_map == null) || (_map.getUsers() == null))
			return map;
		return UserHelper.getInstance().getMapById(_map.getUsers().toArray(new String[_map.getUsers().size()]));
	}
}
