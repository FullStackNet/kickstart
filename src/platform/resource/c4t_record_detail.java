package platform.resource;

import platform.defined.resource.Basec4t_record_detail;
import platform.util.Util;

public class c4t_record_detail extends Basec4t_record_detail {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public c4t_record_detail() {
		this.setId(Util.getUniqueId());
	}
	
	public c4t_record_detail(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setId(String id,String communityId) {
		this.setId(id+"^"+communityId);
	}	
	
}
