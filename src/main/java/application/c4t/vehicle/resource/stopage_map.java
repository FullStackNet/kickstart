package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Basestopage_map;

public class stopage_map extends Basestopage_map {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public stopage_map() {
		this.setId(Util.getUniqueId());
	}
	
	public stopage_map(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
