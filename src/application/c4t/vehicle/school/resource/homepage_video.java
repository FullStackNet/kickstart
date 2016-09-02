package application.c4t.vehicle.school.resource;

import application.c4t.vehicle.school.defined.resource.Basehomepage_video;
import platform.util.Util;

public class homepage_video extends Basehomepage_video {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public homepage_video() {
		this.setId(Util.getUniqueId());
	}
	
	public homepage_video(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
