package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseschool_user_map;

public class school_user_map extends Baseschool_user_map{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public school_user_map() {
		this.setId(Util.getUniqueId());
	}
	
	public school_user_map(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
