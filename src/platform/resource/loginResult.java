package platform.resource;

import platform.defined.resource.Baseresult;


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

	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
}
