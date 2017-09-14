package platform.resource;

import platform.defined.resource.Baseresult;
import platform.util.Util;


public class mandi_auctionResult extends Baseresult  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public mandi_auctionResult() {
		
	}
	public mandi_auction[] resource;
	
	public mandi_auction[] getResource() {
		return resource;
	}

	public void setResource(mandi_auction[] resources) {
		this.resource = resources;
	}

	public mandi_auction getFirstResource() {
		if (Util.isEmpty(resource))
			return null;
		return resource[0];
	}
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
}
