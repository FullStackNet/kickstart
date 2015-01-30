package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basedepartment;

public class department extends Basedepartment {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public department() {
		this.setId(Util.getUniqueId());
	}
	
	public department(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
