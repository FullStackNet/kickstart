package platform.resource;

import platform.defined.resource.Baseplace;
import platform.util.Util;

public class place extends Baseplace{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public place() {
		this.setId(Util.getUniqueId());
	}
	
	public place(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
