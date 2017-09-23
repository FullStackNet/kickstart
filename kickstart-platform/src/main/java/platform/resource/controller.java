package platform.resource;

import platform.defined.resource.Basecontroller;
import platform.util.Util;

public class controller extends Basecontroller {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public controller() {
		this.setId(Util.getUniqueId());
	}
	
	public controller(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
