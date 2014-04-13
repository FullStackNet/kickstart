package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.helper.Route_stopageHelper;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.school.resource.school_customer_map;
import application.c4t.vehicle.school.resource.student;

public class School_customer_mapHelper extends BaseHelper {
	public School_customer_mapHelper() {
		super(new school_customer_map());
		// TODO Auto-generated constructor stub
	}

	private static School_customer_mapHelper instance;

	public static School_customer_mapHelper getInstance() {
		if (instance == null)
			instance = new School_customer_mapHelper();
		return instance;
	}

	public void addStudent(String customerId,String student) throws ApplicationException {
		school_customer_map _map = new school_customer_map();
		_map.setId(customerId);
		_map.addStudents(student);
		AddOrUpdate(_map);
	}

	public void addRouteStopage(String customerId,String routeStopageId) throws ApplicationException {
		school_customer_map _map = new school_customer_map();
		_map.setId(customerId);
		_map.addRoute_stopages(routeStopageId);
		AddOrUpdate(_map);
	}

	public ArrayList<Map<String, Object>> getStudentListMap(String customerId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		school_customer_map _customer_map = (school_customer_map)getById(customerId);
		if ((_customer_map == null) || (_customer_map.getStudents() == null))
			return list;
		return StudentHelper.getInstance().getListMapById(_customer_map.getStudents().toArray(new String[_customer_map.getStudents().size()]),
				new String[]{student.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getRouteStopageListMap(String customerId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		school_customer_map _customer_map = (school_customer_map)getById(customerId);
		if ((_customer_map == null) || (_customer_map.getRoute_stopages() == null))
			return list;
		return Route_stopageHelper.getInstance().getListMapById(_customer_map.getRoute_stopages().toArray(new String[_customer_map.getRoute_stopages().size()]),
				new String[]{route_stopage.FIELD_NAME});
	}
}
