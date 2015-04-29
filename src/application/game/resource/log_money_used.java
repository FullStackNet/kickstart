package application.game.resource;

import platform.util.Util;
import application.game.defined.resource.Baselog_money_used;

public class log_money_used extends Baselog_money_used  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public log_money_used() {
		this.setId(Util.getUniqueId());
	}
	
	public log_money_used(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
