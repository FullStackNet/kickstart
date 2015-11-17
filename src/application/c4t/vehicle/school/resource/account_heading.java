package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseaccount_heading;

public class account_heading extends Baseaccount_heading {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public account_heading() {
		this.setId(Util.getUniqueId());
	}
	
	public account_heading(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
