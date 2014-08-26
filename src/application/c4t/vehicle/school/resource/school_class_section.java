package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseschool_class_section;

public class school_class_section extends Baseschool_class_section {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public school_class_section() {
		this.setId(Util.getUniqueId());
	}
	
	public school_class_section(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
