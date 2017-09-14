package platform.resource;

import platform.defined.resource.Basesim;
import platform.util.Util;

public class sim extends Basesim{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public sim() {
		this.setId(Util.getUniqueId());
	}
	
	public sim(String id) {
		this.setId(id);
	}
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
