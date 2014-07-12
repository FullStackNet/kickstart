package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basedaily_activity;

public class daily_activity extends Basedaily_activity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public daily_activity() {
		this.setId(Util.getUniqueId());
	}
	
	public daily_activity(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
