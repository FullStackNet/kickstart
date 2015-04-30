package platform.resource;


import platform.defined.resource.Basec4t_record_map;
import platform.util.Util;

public class c4t_record_map extends Basec4t_record_map {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public c4t_record_map() {
		this.setId(Util.getUniqueId());
	}
	
	public c4t_record_map(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
