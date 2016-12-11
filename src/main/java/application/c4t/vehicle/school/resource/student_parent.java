package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basestudent_parent;

public class student_parent extends Basestudent_parent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public student_parent() {
		this.setId(Util.getUniqueId());
	}
	
	public student_parent(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
