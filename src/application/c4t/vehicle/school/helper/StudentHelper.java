package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.helper.BaseHelper;
import application.c4t.vehicle.helper.Customer_vehicle_mapHelper;
import application.c4t.vehicle.resource.customer_vehicle_map;
import application.c4t.vehicle.school.resource.student;


public class StudentHelper extends BaseHelper {
	
	StudentHelper() {
		super(new student());
		// TODO Auto-generated constructor stub
	}
	private static StudentHelper instance;
	
	public static StudentHelper getInstance() {
		if (instance == null)
			instance = new StudentHelper();
		return instance;
	}
	
	public ArrayList<Map<String, Object>> getCustomerStudentsMap(String customerId) {
		customer_vehicle_map _customer = 
				(customer_vehicle_map)Customer_vehicle_mapHelper.getInstance().getSelectedFieldsById(customerId,
						customer_vehicle_map.FIELD_STUDENTS);
		if ((_customer == null) || (_customer.getStudents() == null))
			return null;
		return getListMapById(_customer.getStudents().toArray(new String[_customer.getStudents().size()]),
				new String[]{student.FIELD_NAME});
	}
}
