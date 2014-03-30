package platform.resource;

import platform.defined.resource.Basemanaged_object;
import platform.util.Util;

public class managed_object extends Basemanaged_object {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public managed_object() {
		this.setId(Util.getUniqueId());
	}
	
	public managed_object(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
