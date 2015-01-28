package application.c4t.vehicle.school.resource;

import platform.util.ApplicationConstants;
import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseschool_timing;

public class school_timing extends Baseschool_timing {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public school_timing() {
		this.setId(Util.getUniqueId());
	}
	
	public school_timing(String id) {
		this.setId(id);
	}	
	
	public static String id(String school_id,String class_name,String section_name) {
		return school_id+ApplicationConstants.ID_SEPERATOR+class_name+ApplicationConstants.ID_SEPERATOR+section_name;
	}
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
