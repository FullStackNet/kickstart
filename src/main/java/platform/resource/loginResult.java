package platform.resource;

import platform.defined.resource.Baseresult;
import platform.util.Util;


public class loginResult extends Baseresult  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public loginResult() {
		
	}
	public login[] resource;
	
	public login[] getResource() {
		return resource;
	}

	public void setResources(login[] resources) {
		this.resource = resources;
	}

	public login getFirstResource() {
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
