package platform.resource;

import platform.defined.resource.Basec4t_transient_object;
import platform.util.Util;

public class c4t_transient_object extends Basec4t_transient_object {
	/**
	 * 
	 */
	public static String OBJECT_TYPE_GAME = "GAME";
	
	private static final long serialVersionUID = 1L;
	
	public c4t_transient_object() {
		this.setId(Util.getUniqueId());
	}
	
	public c4t_transient_object(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
