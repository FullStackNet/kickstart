package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basedoubt;

public class doubt extends Basedoubt {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public doubt() {
		this.setId(Util.getUniqueId());
	}
	
	public doubt(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
