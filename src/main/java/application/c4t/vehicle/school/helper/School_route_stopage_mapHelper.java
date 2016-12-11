package application.c4t.vehicle.school.helper;

import java.util.ArrayList;

import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.school_route_storage_map;
import application.c4t.vehicle.school.resource.student;

public class School_route_stopage_mapHelper extends BaseHelper {
	public School_route_stopage_mapHelper() {
		super(new school_route_storage_map());
		// TODO Auto-generated constructor stub
	}

	private static School_route_stopage_mapHelper instance;

	public static School_route_stopage_mapHelper getInstance() {
		if (instance == null)
			instance = new School_route_stopage_mapHelper();
		return instance;
	}

	public void addStudent(String routeStopageId,String studentId) throws ApplicationException {
		if (studentId == null) return;
		if (routeStopageId == null) return;
		school_route_storage_map _map = new school_route_storage_map();
		_map.setId(routeStopageId);
		_map.addStudents(studentId);
		AddOrUpdate(_map);
	}
	
	public void removeStudent(String routeStopageId,String studentId) throws ApplicationException {
		if (studentId == null) return;
		if (routeStopageId == null) return;
		school_route_storage_map _map = new school_route_storage_map();
		_map.setId(routeStopageId);
		_map.addStudents(studentId);
		unset(_map);
	}

	public void addAlertStudent(String routeStopageId,String studentId) throws ApplicationException {
		if (studentId == null) return;
		if (routeStopageId == null) return;
		school_route_storage_map _map = new school_route_storage_map();
		_map.setId(routeStopageId);
		_map.addAlert_students(studentId);
		AddOrUpdate(_map);
	}
	
	public void removeAlertStudent(String routeStopageId,String studentId) throws ApplicationException {
		if (studentId == null) return;
		if (routeStopageId == null) return;
		school_route_storage_map _map = new school_route_storage_map();
		_map.setId(routeStopageId);
		_map.addAlert_students(studentId);
		unset(_map);
	}
	public ArrayList<BaseResource> getStudentList(String routeStopageId) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		school_route_storage_map _customer_map = (school_route_storage_map)getById(routeStopageId);
		if ((_customer_map == null) || (_customer_map.getStudents() == null))
			return list;
		return StudentHelper.getInstance().getListById(_customer_map.getStudents().toArray(new String[_customer_map.getStudents().size()]),
				new String[]{student.FIELD_NAME});
	}
	
	public ArrayList<BaseResource> getAlertStudentList(String routeStopageId) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		school_route_storage_map _map = (school_route_storage_map)getById(routeStopageId);
		if ((_map == null) || (_map.getAlert_students() == null))
			return list;
		return StudentHelper.getInstance().getListById(_map.getAlert_students().toArray(new String[_map.getAlert_students().size()]),
				new String[]{student.FIELD_NAME});
	}
	
	public ArrayList<BaseResource> getStudentUserList(String routeStopageId) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		school_route_storage_map _customer_map = (school_route_storage_map)getById(routeStopageId);
		if ((_customer_map == null) || (_customer_map.getStudents() == null))
			return list;
		
		return StudentHelper.getInstance().getListById(_customer_map.getStudents().toArray(new String[_customer_map.getStudents().size()]),
				new String[]{student.FIELD_NAME});
	}
}
