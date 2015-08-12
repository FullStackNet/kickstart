package platform.resource;

import platform.defined.resource.Baselogin;
import platform.util.Util;

public class login extends Baselogin {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public login() {
		this.setId(Util.getUniqueId());
	}
	
	public login(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return loginResult.class;
	}

}
