package platform.resource;

import platform.defined.resource.Basefeedback;
import platform.util.Util;

public class feedback extends Basefeedback {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public feedback() {
		this.setId(Util.getUniqueId());
	}
	
	public feedback(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
