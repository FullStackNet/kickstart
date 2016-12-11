package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basevideo_collection;

public class video_collection extends Basevideo_collection {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public video_collection() {
		this.setId(Util.getUniqueId());
	}
	
	public video_collection(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
