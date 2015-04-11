package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basegrievance;

public class grievance extends Basegrievance {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public grievance() {
		this.setId(Util.getUniqueId());
	}
	
	public grievance(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
