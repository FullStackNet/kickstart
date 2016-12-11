package application.c4t.vehicle.school.resource;

import platform.util.ApplicationConstants;
import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basework_sheet_result;

public class work_sheet_result extends Basework_sheet_result {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public work_sheet_result() {
		this.setId(Util.getUniqueId());
	}
	
	public work_sheet_result(String id) {
		this.setId(id);
	}	
	
	public static String id(String studentId,String worksheetId) {
		return studentId+ApplicationConstants.ID_SEPERATOR+worksheetId;
	}
	
	public static String work_sheet_id(String id) {
		if (Util.isEmpty(id))
			return null;
		String[] tokens = id.split("\\"+ApplicationConstants.ID_SEPERATOR);
		if (tokens.length > 1) {
			return tokens[1];
		}
		return null;
	}
	public static String student_id(String id) {
		if (Util.isEmpty(id))
			return null;
		String[] tokens = id.split(ApplicationConstants.ID_SEPERATOR);
		if (tokens.length > 0) {
			return tokens[0];
		}
		return null;
	}
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
