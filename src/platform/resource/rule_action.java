package platform.resource;

import platform.defined.resource.Baserule_action;
import platform.util.Util;

public class rule_action extends Baserule_action {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public rule_action() {
		this.setId(Util.getUniqueId());
	}
	
	public rule_action(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
