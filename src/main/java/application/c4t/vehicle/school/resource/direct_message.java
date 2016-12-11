package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basedirect_message;

public class direct_message extends Basedirect_message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public direct_message() {
		this.setId(Util.getUniqueId());
	}
	
	public direct_message(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
