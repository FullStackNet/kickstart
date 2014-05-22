package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseclass_section;

public class class_section extends Baseclass_section {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public class_section() {
		this.setId(Util.getUniqueId());
	}
	
	public class_section(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
