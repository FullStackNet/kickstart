package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basecourse;
import application.c4t.vehicle.school.defined.resource.Basecourse_category;

public class course_category extends Basecourse_category {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public course_category() {
		this.setId(Util.getUniqueId());
	}
	
	public course_category(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
