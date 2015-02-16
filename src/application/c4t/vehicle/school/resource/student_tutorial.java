package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basestudent_tutorial;

public class student_tutorial extends Basestudent_tutorial {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public student_tutorial() {
		this.setId(Util.getUniqueId());
	}
	
	public student_tutorial(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
