package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basestudent_map;

public class student_map extends Basestudent_map {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public student_map() {
		this.setId(Util.getUniqueId());
	}
	
	public student_map(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
