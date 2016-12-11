package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basebook;

public class book extends Basebook {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public book() {
		this.setId(Util.getUniqueId());
	}
	
	public book(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
