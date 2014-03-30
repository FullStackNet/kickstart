package platform.resource;

import platform.defined.resource.Basesession;
import platform.util.Util;

public class session extends Basesession {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public session() {
		this.setId(Util.getUniqueId());
	}
	
	public session(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
