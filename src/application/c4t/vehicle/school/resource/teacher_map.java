package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseteacher_map;

public class teacher_map extends Baseteacher_map {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public teacher_map() {
		this.setId(Util.getUniqueId());
	}
	
	public teacher_map(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
