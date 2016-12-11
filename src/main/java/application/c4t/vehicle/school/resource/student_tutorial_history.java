package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basestudent_tutorial_history;

public class student_tutorial_history extends Basestudent_tutorial_history {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public student_tutorial_history() {
		this.setId(Util.getUniqueId());
	}
	
	public student_tutorial_history(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
