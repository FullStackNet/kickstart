package platform.resource;

import platform.defined.resource.Baserule;
import platform.util.Util;

public class rule extends Baserule {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public rule() {
		this.setId(Util.getUniqueId());
	}
	
	public rule(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
