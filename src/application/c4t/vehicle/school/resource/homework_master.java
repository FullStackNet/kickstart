package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basehomework_master;

public class homework_master extends Basehomework_master {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public homework_master() {
		this.setId(Util.getUniqueId());
	}
	
	public homework_master(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
