package platform.resource;

import platform.defined.resource.Baseactivity;
import platform.defined.resource.Baseserver;
import platform.util.Util;

public class server extends Baseserver {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public server() {
		this.setId(Util.getUniqueId());
	}

	public server(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
