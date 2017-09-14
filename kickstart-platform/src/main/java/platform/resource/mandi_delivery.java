package platform.resource;

import platform.defined.resource.Basemandi_delivery;
import platform.util.Util;

public class mandi_delivery extends Basemandi_delivery {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public mandi_delivery() {
		this.setId(Util.getUniqueId());
	}
	
	public mandi_delivery(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
