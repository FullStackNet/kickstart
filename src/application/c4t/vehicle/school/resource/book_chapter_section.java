package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basebook_chapter_section;

public class book_chapter_section extends Basebook_chapter_section {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public book_chapter_section() {
		this.setId(Util.getUniqueId());
	}
	
	public book_chapter_section(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
