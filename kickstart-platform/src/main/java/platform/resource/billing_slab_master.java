package platform.resource;

import platform.defined.resource.Basebilling_plan;
import platform.defined.resource.Basebilling_slab_master;
import platform.util.Util;

public class billing_slab_master extends Basebilling_slab_master {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public billing_slab_master() {
		this.setId(Util.getUniqueId());
	}

	public billing_slab_master(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
