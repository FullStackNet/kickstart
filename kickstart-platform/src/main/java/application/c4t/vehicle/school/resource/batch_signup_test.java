package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basebatch_signup_test;

public class batch_signup_test extends Basebatch_signup_test {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public batch_signup_test() {
		this.setId(Util.getUniqueId());
	}
	
	public batch_signup_test(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
