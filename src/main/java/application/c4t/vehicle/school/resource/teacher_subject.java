package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseteacher_subject;

public class teacher_subject extends Baseteacher_subject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public teacher_subject() {
		this.setId(Util.getUniqueId());
	}
	
	public teacher_subject(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
