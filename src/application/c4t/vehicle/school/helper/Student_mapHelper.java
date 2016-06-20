package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.batch;
import application.c4t.vehicle.school.resource.course;
import application.c4t.vehicle.school.resource.notice;
import application.c4t.vehicle.school.resource.school;
import application.c4t.vehicle.school.resource.student_map;
import application.c4t.vehicle.school.resource.student_photo;


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

	
	public void addCourse(String studentId,String courseId) throws ApplicationException {
		if (studentId == null) return;
		if (courseId == null) return;
		student_map _map = new student_map();
		_map.setId(studentId);
		_map.addCourses(courseId);
		AddOrUpdate(_map);
	}

	public void addBatch(String studentId,String batchId) throws ApplicationException {
		if (studentId == null) return;
		if (batchId == null) return;
		student_map _map = new student_map();
		_map.setId(studentId);
		_map.addBatches(batchId);
		AddOrUpdate(_map);
	}

	public void batchCourse(String studentId,String batchId) throws ApplicationException {
		if (studentId == null) return;
		if (batchId == null) return;
		student_map _map = new student_map();
		_map.setId(studentId);
		_map.addBatches(batchId);
		unset(_map);
	}
	
	public void removeCourse(String studentId,String courseId) throws ApplicationException {
		if (studentId == null) return;
		if (courseId == null) return;
		student_map _map = new student_map();
		_map.setId(studentId);
		_map.addCourses(courseId);
		unset(_map);
	}
	
	public void addPhoto(String studentId,String photoId) throws ApplicationException {
		if (studentId == null) return;
		if (photoId == null) return;
		student_map _map = new student_map();
		_map.setId(studentId);
		_map.addPhotos(photoId);
		AddOrUpdate(_map);
	}

	public void removePhoto(String studentId,String photoId) throws ApplicationException {
		if (studentId == null) return;
		if (photoId == null) return;
		student_map _map = new student_map();
		_map.setId(studentId);
		_map.addPhotos(photoId);
		unset(_map);
	}

	public void removeUser(String studentId,String userId) throws ApplicationException {
		if (studentId == null) return;
		if (userId == null) return;
		student_map _map = new student_map();
		_map.setId(studentId);
		_map.addUsers(userId);
		unset(_map);
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

	public BaseResource[] getNotices(String studentId,school _school) {
		student_map _map = (student_map)getById(studentId);
		if ((_map == null) || (_map.getNotices() == null))
			return null;
		Expression e = new Expression(notice.FIELD_NOTICE_DATE, REL_OP.GT, _school.getFee_starting_date());
		return NoticeHelper.getInstance().getArrayById(_map.getNotices().toArray(new String[_map.getNotices().size()]),new String[]{notice.FIELD_NOTICE_DATE + " desc"},e);
	}

	public Map<String,BaseResource> getUsersMap(String studentId) {
		Map<String,BaseResource>  map = new HashMap<String,BaseResource>();
		student_map _map = (student_map)getById(studentId);
		if ((_map == null) || (_map.getUsers() == null))
			return map;
		return UserHelper.getInstance().getMapById(_map.getUsers().toArray(new String[_map.getUsers().size()]));
	}

	public BaseResource[] getPhoto(String studentId) {
		student_map _map = (student_map)getById(studentId);
		if ((_map == null) || (_map.getPhotos() == null))
			return null;
		BaseResource[] resources = new student_photo[_map.getPhotos().size()];
		int i = 0;
		for(Object photo: _map.getPhotos()) { 
			student_photo _photo = new student_photo();
			_photo.setPhoto_id(photo.toString());
			resources[i] = _photo;
			i++;
		}
		return resources;	
	}
	public BaseResource[] getCourses(String studentId) {
		student_map _map = (student_map)getById(studentId);
		if ((_map == null) || (_map.getCourses() == null))
			return null;	
		return CourseHelper.getInstance().getById(_map.getCourses().toArray(new String[_map.getCourses().size()]), new String[]{course.FIELD_NAME});
	}
	public BaseResource[] getBatches(String studentId) {
		student_map _map = (student_map)getById(studentId);
		if ((_map == null) || (_map.getBatches() == null))
			return null;	
		return BatchHelper.getInstance().getById(_map.getBatches().toArray(new String[_map.getBatches().size()]), new String[]{batch.FIELD_NAME});
	}

}
