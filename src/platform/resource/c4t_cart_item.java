package platform.resource;

import platform.defined.resource.Basec4t_cart_item;
import platform.util.Util;

public class c4t_cart_item extends Basec4t_cart_item {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public c4t_cart_item() {
		this.setId(Util.getUniqueId());
	}
	
	public c4t_cart_item(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
