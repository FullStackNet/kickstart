package platform.resource;

import platform.defined.resource.Basealert;
import platform.defined.resource.Basebilling_plan;
import platform.util.Util;

public class billing_plan extends Basebilling_plan {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public billing_plan() {
		this.setId(Util.getUniqueId());
	}

	public billing_plan(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
