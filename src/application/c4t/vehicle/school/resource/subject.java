package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basesubject;

public class subject extends Basesubject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public subject() {
		this.setId(Util.getUniqueId());
	}
	
	public subject(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
