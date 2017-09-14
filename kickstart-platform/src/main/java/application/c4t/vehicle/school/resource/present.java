package application.c4t.vehicle.school.resource;

import platform.util.ApplicationConstants;
import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basepresent;

public class present extends Basepresent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public present() {
		this.setId(Util.getUniqueId());
	}
	
	public present(String id) {
		this.setId(id);
	}	
	
	public static String id(String date,String school_id,String class_section_name) {
		return date+ApplicationConstants.ID_SEPERATOR+school_id+ApplicationConstants.ID_SEPERATOR+class_section_name;
	}
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
