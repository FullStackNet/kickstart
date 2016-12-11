package platform.resource;

import platform.defined.resource.Basecustomer_map;
import platform.util.Util;

public class customer_map extends Basecustomer_map {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public customer_map() {
		this.setId(Util.getUniqueId());
	}
	
	public customer_map(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
}
