package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basetopic;

public class topic extends Basetopic {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public topic() {
		this.setId(Util.getUniqueId());
	}
	
	public topic(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
