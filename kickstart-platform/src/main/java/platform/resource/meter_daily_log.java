package platform.resource;

import platform.defined.resource.Basemeter_daily_log;
import platform.defined.resource.Basemeter_hourly_log;
import platform.util.Util;

public class meter_daily_log extends Basemeter_daily_log {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public meter_daily_log() {
		this.setId(Util.getUniqueId());
	}

	public meter_daily_log(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
