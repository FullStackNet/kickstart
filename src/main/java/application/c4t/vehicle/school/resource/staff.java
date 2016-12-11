package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basestaff;

public class staff extends Basestaff {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public staff() {
		this.setId(Util.getUniqueId());
	}
	
	public staff(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
