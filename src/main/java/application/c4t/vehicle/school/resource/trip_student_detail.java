package application.c4t.vehicle.school.resource;

import platform.util.ApplicationConstants;
import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basetrip_student_detail;

public class trip_student_detail extends Basetrip_student_detail {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public trip_student_detail() {
		this.setId(Util.getUniqueId());
	}
	
	public trip_student_detail(String id) {
		this.setId(id);
	}	
	
	public static String id(String tripId,String studentId) {
		return tripId+ApplicationConstants.ID_SEPERATOR+studentId;
	}
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
