package platform.resource;

import platform.defined.resource.Basesensor;
import platform.util.Util;

public class sensor extends Basesensor {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public sensor() {
		this.setId(Util.getUniqueId());
	}
	
	public sensor(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
