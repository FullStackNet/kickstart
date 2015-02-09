package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basetutorial_category;

public class tutorial_category extends Basetutorial_category {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public tutorial_category() {
		this.setId(Util.getUniqueId());
	}
	
	public tutorial_category(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
