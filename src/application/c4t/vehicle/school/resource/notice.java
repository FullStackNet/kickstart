package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basenotice;

public class notice extends Basenotice {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public notice() {
		this.setId(Util.getUniqueId());
	}
	
	public notice(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
