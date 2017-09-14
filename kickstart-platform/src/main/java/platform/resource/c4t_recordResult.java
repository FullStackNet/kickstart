package platform.resource;

import platform.defined.resource.Baseresult;
import platform.util.Util;

public class c4t_recordResult extends Baseresult  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public c4t_recordResult() {
		
	}
	public c4t_record[] resource;
	
	public c4t_record[] getResource() {
		return resource;
	}
	
	public c4t_record getFirstResource() {
		if (Util.isEmpty(resource))
			return null;
		return resource[0];
	}

	public void setResource(c4t_record[] resources) {
		this.resource = resources;
	}

	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
}
