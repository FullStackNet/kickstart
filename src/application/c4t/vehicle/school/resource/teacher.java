package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseteacher;

public class teacher extends Baseteacher {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public teacher() {
		this.setId(Util.getUniqueId());
	}
	
	public teacher(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
