package platform.resource;

import platform.defined.resource.Baseemail_account;
import platform.util.Util;

public class email_account extends Baseemail_account {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public email_account() {
		this.setId(Util.getUniqueId());
	}
	
	public email_account(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
