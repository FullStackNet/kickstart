package platform.resource;

import platform.defined.resource.Baseactivity;
import platform.defined.resource.Basemeter_bill_log;
import platform.util.Util;

public class meter_bill_log extends Basemeter_bill_log {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public meter_bill_log() {
		this.setId(Util.getUniqueId());
	}

	public meter_bill_log(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
