package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basephoto_collection;

public class photo_collection extends Basephoto_collection {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public photo_collection() {
		this.setId(Util.getUniqueId());
	}
	
	public photo_collection(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
