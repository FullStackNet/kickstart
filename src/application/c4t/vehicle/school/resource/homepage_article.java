package application.c4t.vehicle.school.resource;

import application.c4t.vehicle.school.defined.resource.Basehomepage_article;
import platform.util.Util;

public class homepage_article extends Basehomepage_article {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public homepage_article() {
		this.setId(Util.getUniqueId());
	}
	
	public homepage_article(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
