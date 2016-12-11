package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basemessage2school;

public class message2school extends Basemessage2school {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public message2school() {
		this.setId(Util.getUniqueId());
	}
	
	public message2school(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
