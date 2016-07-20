package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basebook;
import application.c4t.vehicle.school.defined.resource.Basebook_chapter;

public class book_chapter extends Basebook_chapter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public book_chapter() {
		this.setId(Util.getUniqueId());
	}
	
	public book_chapter(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
