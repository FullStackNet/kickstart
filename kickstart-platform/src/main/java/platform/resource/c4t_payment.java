package platform.resource;

import platform.defined.resource.Basec4t_payment;
import platform.util.Util;

public class c4t_payment extends Basec4t_payment {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public c4t_payment() {
		this.setId(Util.getUniqueId());
	}
	
	public c4t_payment(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
