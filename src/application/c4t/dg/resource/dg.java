package application.c4t.dg.resource;

import platform.util.Util;
import application.c4t.dg.defined.resource.Basedg;

public class dg extends Basedg {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public dg() {
		this.setId(Util.getUniqueId());
	}
	
	public dg(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
