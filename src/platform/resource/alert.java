package platform.resource;

import platform.defined.resource.Basealert;
import platform.util.Util;

public class alert extends Basealert {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public alert() {
		this.setId(Util.getUniqueId());
	}
	
	public alert(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
