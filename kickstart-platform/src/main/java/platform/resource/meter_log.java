package platform.resource;

import platform.defined.resource.Baseactivity;
import platform.defined.resource.Basemeter_log;
import platform.util.Util;

public class meter_log extends Basemeter_log {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public meter_log() {
		this.setId(Util.getUniqueId());
	}

	public meter_log(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
