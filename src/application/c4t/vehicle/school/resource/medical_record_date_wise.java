package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basemedical_record_date_wise;

public class medical_record_date_wise extends Basemedical_record_date_wise {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public medical_record_date_wise() {
		this.setId(Util.getUniqueId());
	}
	
	public medical_record_date_wise(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
