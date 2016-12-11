package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basemessage2parent;

public class message2parent extends Basemessage2parent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public message2parent() {
		this.setId(Util.getUniqueId());
	}
	
	public message2parent(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
