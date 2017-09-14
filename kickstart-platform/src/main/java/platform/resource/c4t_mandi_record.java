package platform.resource;

import platform.defined.resource.Basec4t_mandi_record;
import platform.util.Util;

public class c4t_mandi_record extends Basec4t_mandi_record {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public c4t_mandi_record() {
		this.setId(Util.getUniqueId());
	}
	
	public c4t_mandi_record(String id) {
		this.setId(id);
	}	
	public c4t_mandi_record(String id,String communityId) {
		this.setId(id+"^"+communityId);
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
