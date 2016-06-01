package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basetest_allocation_student;

public class test_allocation_student extends Basetest_allocation_student {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public test_allocation_student() {
		this.setId(Util.getUniqueId());
	}
	
	public test_allocation_student(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static String TEST_STATUS_NOT_STARTED = "NOT_STARTED";	
	public static String TEST_STATUS_STARTED = "STARTED";
	public static String TEST_STATUS_COMPLETED = "COMPLETED";
	public static String TEST_STATUS_RESULT_DECLARE = "RESULT_DECLARED";
	
	
	

}
