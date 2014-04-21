package platform.resource;

import platform.defined.resource.Baseservice;
import platform.util.Util;

public class service extends Baseservice {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public service() {
		this.setId(Util.getUniqueId());
	}
	
	public service(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
