package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basestudent_photo;

public class student_photo extends Basestudent_photo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public student_photo() {
		this.setId(Util.getUniqueId());
	}
	
	public student_photo(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
