package platform.resource;

import platform.defined.resource.Basemeter_daily_log;
import platform.defined.resource.Basemeter_monthly_log;
import platform.util.Util;

public class meter_monthly_log extends Basemeter_monthly_log {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public meter_monthly_log() {
		this.setId(Util.getUniqueId());
	}

	public meter_monthly_log(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
