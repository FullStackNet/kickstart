package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basetutorial;

public class tutorial extends Basetutorial {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public tutorial() {
		this.setId(Util.getUniqueId());
	}
	
	public tutorial(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
