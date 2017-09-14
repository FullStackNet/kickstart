package platform.resource;

import platform.defined.resource.Basemandi_auction_weight;
import platform.util.Util;

public class mandi_auction_weight extends Basemandi_auction_weight {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public mandi_auction_weight() {
		this.setId(Util.getUniqueId());
	}
	
	public mandi_auction_weight(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
