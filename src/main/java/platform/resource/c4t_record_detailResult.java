package platform.resource;

import platform.defined.resource.Baseresult;
import platform.util.Util;

public class c4t_record_detailResult extends Baseresult  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public c4t_record_detailResult() {
		
	}
	public c4t_record_detail[] resource;
	
	public c4t_record_detail[] getResource() {
		return resource;
	}
	
	public c4t_record_detail getFirstResource() {
		if (Util.isEmpty(resource))
			return null;
		return resource[0];
	}

	public void setResource(c4t_record_detail[] resources) {
		this.resource = resources;
	}

	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
}
