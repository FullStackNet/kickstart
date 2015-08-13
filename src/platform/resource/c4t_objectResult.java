package platform.resource;

import platform.defined.resource.Baseresult;
import platform.util.Util;


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

	public c4t_object getFirstResource() {
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
