package platform.resource;

import platform.defined.resource.Baserule_condition;
import platform.util.Util;

public class rule_condition extends Baserule_condition {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public rule_condition() {
		this.setId(Util.getUniqueId());
	}
	
	public rule_condition(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
