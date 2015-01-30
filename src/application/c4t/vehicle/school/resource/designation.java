package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basedesignation;

public class designation extends Basedesignation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public designation() {
		this.setId(Util.getUniqueId());
	}
	
	public designation(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
