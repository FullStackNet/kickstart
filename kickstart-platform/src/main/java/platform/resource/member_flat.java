package platform.resource;

import platform.defined.resource.Baseactivity;
import platform.defined.resource.Basemember_flat;
import platform.util.Util;

public class member_flat extends Basemember_flat {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public member_flat() {
		this.setId(Util.getUniqueId());
	}

	public member_flat(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
