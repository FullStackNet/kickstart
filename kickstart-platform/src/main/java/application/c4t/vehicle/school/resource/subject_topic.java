package application.c4t.vehicle.school.resource;

import application.c4t.vehicle.school.defined.resource.Basesubject_topic;
import platform.util.Util;

public class subject_topic extends Basesubject_topic {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public subject_topic() {
		this.setId(Util.getUniqueId());
	}
	
	public subject_topic(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
