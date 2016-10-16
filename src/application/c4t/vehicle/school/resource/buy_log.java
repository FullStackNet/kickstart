package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basebuy_log;

public class buy_log extends Basebuy_log {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public buy_log() {
		this.setId(Util.getUniqueId());
	}
	
	public buy_log(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
