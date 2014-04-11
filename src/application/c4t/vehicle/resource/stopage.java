package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Basestopage;

public class stopage extends Basestopage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public stopage() {
		this.setId(Util.getUniqueId());
	}
	
	public stopage(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
