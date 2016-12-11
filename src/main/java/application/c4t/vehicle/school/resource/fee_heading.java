package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basefee_heading;

public class fee_heading extends Basefee_heading {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public fee_heading() {
		this.setId(Util.getUniqueId());
	}
	
	public fee_heading(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
