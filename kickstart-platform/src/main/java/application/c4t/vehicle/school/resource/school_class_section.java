package application.c4t.vehicle.school.resource;

import platform.util.ApplicationConstants;
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
	
	public static String id(String school_id, String class_name,String section_name) {
		return school_id+ApplicationConstants.ID_SEPERATOR+class_name+ApplicationConstants.ID_SEPERATOR+section_name;
	}
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
