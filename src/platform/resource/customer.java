package platform.resource;

import platform.defined.resource.Basecustomer;
import platform.util.Util;

public class customer extends Basecustomer {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public customer() {
		this.setId(Util.getUniqueId());
	}
	
	public customer(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
