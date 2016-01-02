package platform.resource;

import platform.defined.resource.Basec4t_objects;
import platform.util.Util;

public class c4t_objects extends Basec4t_objects {
	/**
	 * 
	 */
	public static String OBJECT_TYPE_GAME = "GAME";
	
	private static final long serialVersionUID = 1L;
	
	public c4t_objects() {
		this.setId(Util.getUniqueId());
	}
	
	public c4t_objects(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return c4t_objectResult.class;
	}

}
