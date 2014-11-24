package platform.resource;

import platform.util.Util;

public class schedule extends platform.defined.resource.Baseschedule {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public schedule() {
		this.setId(Util.getUniqueId());
	}
	
	public schedule(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
