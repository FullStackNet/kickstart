package platform.resource;

import platform.defined.resource.Basebilling_slab_detail;
import platform.defined.resource.Basebilling_slab_master;
import platform.util.Util;

public class billing_slab_detail extends Basebilling_slab_detail {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public billing_slab_detail() {
		this.setId(Util.getUniqueId());
	}

	public billing_slab_detail(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
