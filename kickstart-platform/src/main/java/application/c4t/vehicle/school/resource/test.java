package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basetest;

public class test extends Basetest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public test() {
		this.setId(Util.getUniqueId());
	}
	
	public test(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
