package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basebook_allocation_student;

public class book_allocation_student extends Basebook_allocation_student {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public book_allocation_student() {
		this.setId(Util.getUniqueId());
	}
	
	public book_allocation_student(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
}
