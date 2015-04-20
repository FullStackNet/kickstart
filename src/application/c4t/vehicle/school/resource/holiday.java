package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseholiday;

public class holiday extends Baseholiday {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public holiday() {
		this.setId(Util.getUniqueId());
	}
	
	public holiday(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
