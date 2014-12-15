package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseschool_event;

public class school_event extends Baseschool_event {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public school_event() {
		this.setId(Util.getUniqueId());
	}
	
	public school_event(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
