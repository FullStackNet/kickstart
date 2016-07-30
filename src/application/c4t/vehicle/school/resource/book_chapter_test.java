package application.c4t.vehicle.school.resource;

import application.c4t.vehicle.school.defined.resource.Basebook_chapter_test;
import platform.util.Util;

public class book_chapter_test extends Basebook_chapter_test {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public book_chapter_test() {
		this.setId(Util.getUniqueId());
	}
	
	public book_chapter_test(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
