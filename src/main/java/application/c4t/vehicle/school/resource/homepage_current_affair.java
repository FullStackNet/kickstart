package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basehomepage_current_affair;

public class homepage_current_affair extends Basehomepage_current_affair {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public homepage_current_affair() {
		this.setId(Util.getUniqueId());
	}
	
	public homepage_current_affair(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
