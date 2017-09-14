package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basechapter;

public class chapter extends Basechapter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public chapter() {
		this.setId(Util.getUniqueId());
	}
	
	public chapter(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
