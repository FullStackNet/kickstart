package platform.resource;

import platform.defined.resource.Basesms_account;
import platform.util.Util;

public class sms_account extends Basesms_account {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public sms_account() {
		this.setId(Util.getUniqueId());
	}
	
	public sms_account(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
