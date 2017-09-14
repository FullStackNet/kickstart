package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basestudent_detail;

public class student_detail extends Basestudent_detail {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public student_detail() {
		this.setId(Util.getUniqueId());
	}
	
	public student_detail(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
