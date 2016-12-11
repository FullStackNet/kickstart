package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basenews;

public class news extends Basenews {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public news() {
		this.setId(Util.getUniqueId());
	}
	
	public news(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
