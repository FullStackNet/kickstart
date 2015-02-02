package platform.resource;

import platform.defined.resource.Baseid_card;
import platform.util.Util;

public class id_card extends Baseid_card {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public id_card() {
		this.setId(Util.getUniqueId());
	}
	
	public id_card(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
