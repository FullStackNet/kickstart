package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basestudent;

public class student extends Basestudent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public student() {
		this.setId(Util.getUniqueId());
	}
	
	public student(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getShort_name() {
		if (super.getShort_name() != null)
			return super.getShort_name();
		return getNameEx();
	}

}
