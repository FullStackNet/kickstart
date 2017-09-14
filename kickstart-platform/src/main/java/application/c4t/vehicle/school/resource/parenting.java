package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseparenting;

public class parenting extends Baseparenting {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public parenting() {
		this.setId(Util.getUniqueId());
	}
	
	public parenting(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
