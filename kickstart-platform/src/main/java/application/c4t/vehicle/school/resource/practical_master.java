package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basepractical_master;

public class practical_master extends Basepractical_master {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public practical_master() {
		this.setId(Util.getUniqueId());
	}
	
	public practical_master(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
