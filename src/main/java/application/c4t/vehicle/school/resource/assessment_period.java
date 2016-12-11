package application.c4t.vehicle.school.resource;

import platform.util.ApplicationConstants;
import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseassessment_period;

public class assessment_period extends Baseassessment_period {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public assessment_period() {
		this.setId(Util.getUniqueId());
	}
	
	public assessment_period(String id) {
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
