package platform.resource;

import platform.defined.resource.Basec4t_relation;
import platform.util.Util;

public class c4t_relation extends Basec4t_relation  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public c4t_relation() {
		this.setId(Util.getUniqueId());
	}
	
	public c4t_relation(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
