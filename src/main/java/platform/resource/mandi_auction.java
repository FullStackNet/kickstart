package platform.resource;

import platform.defined.resource.Basemandi_auction;
import platform.util.Util;

public class mandi_auction extends Basemandi_auction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public mandi_auction() {
		this.setId(Util.getUniqueId());
	}
	
	public mandi_auction(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
