package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basehomepage_link;

public class homepage_link extends Basehomepage_link {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public homepage_link() {
		this.setId(Util.getUniqueId());
	}
	
	public homepage_link(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
