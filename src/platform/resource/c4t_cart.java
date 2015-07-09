package platform.resource;

import platform.defined.resource.Basec4t_cart;
import platform.util.Util;

public class c4t_cart extends Basec4t_cart {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public c4t_cart() {
		this.setId(Util.getUniqueId());
	}
	
	public c4t_cart(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
