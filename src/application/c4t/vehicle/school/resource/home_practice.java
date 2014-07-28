package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basehome_practice;

public class home_practice extends Basehome_practice {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public home_practice() {
		this.setId(Util.getUniqueId());
	}
	
	public home_practice(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
