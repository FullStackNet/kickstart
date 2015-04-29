package application.game.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Baseattendent;
import application.c4t.vehicle.defined.resource.Basedriver;
import application.game.defined.resource.Baselog_money_load;

public class log_money_load extends Baselog_money_load  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public log_money_load() {
		this.setId(Util.getUniqueId());
	}
	
	public log_money_load(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
