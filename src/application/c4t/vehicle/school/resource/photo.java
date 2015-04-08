package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basephoto;

public class photo extends Basephoto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public photo() {
		this.setId(Util.getUniqueId());
	}
	
	public photo(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
