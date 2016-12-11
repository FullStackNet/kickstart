package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseprovider;

public class provider extends Baseprovider {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public provider() {
		this.setId(Util.getUniqueId());
	}
	
	public provider(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
