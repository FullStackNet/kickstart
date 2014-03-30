package platform.resource;

import platform.defined.resource.Basegateway;
import platform.util.Util;

public class gateway extends Basegateway {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public gateway() {
		this.setId(Util.getUniqueId());
	}
	
	public gateway(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
