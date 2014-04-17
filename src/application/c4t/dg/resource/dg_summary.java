package application.c4t.dg.resource;

import platform.util.Util;
import application.c4t.dg.defined.resource.Basedg_summary;

public class dg_summary extends Basedg_summary {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public dg_summary() {
		this.setId(Util.getUniqueId());
	}
	
	public dg_summary(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
