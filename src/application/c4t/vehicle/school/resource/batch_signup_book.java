package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basebatch_signup_book;

public class batch_signup_book extends Basebatch_signup_book {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public batch_signup_book() {
		this.setId(Util.getUniqueId());
	}
	
	public batch_signup_book(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
