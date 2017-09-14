package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basehomework;

public class homework extends Basehomework {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public homework() {
		this.setId(Util.getUniqueId());
	}
	
	public homework(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
