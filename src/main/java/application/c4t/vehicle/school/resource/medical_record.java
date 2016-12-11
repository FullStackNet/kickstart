package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basemedical_record;

public class medical_record extends Basemedical_record {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public medical_record() {
		this.setId(Util.getUniqueId());
	}
	
	public medical_record(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
