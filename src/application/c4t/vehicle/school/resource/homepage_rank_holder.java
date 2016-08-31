package application.c4t.vehicle.school.resource;

import application.c4t.vehicle.school.defined.resource.Basehomepage_rank_holder;
import platform.util.Util;

public class homepage_rank_holder extends Basehomepage_rank_holder {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public homepage_rank_holder() {
		this.setId(Util.getUniqueId());
	}
	
	public homepage_rank_holder(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
