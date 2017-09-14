package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basecourse;

public class course extends Basecourse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public course() {
		this.setId(Util.getUniqueId());
	}
	
	public course(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
