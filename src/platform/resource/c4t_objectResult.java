package platform.resource;

import platform.defined.resource.Baseresult;


public class c4t_objectResult extends Baseresult  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public c4t_objectResult() {
		
	}
	public c4t_object[] resource;
	
	public c4t_object[] getResource() {
		return resource;
	}

	public void setResource(c4t_object[] resources) {
		this.resource = resources;
	}

	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
}
