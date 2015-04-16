package application.c4t.vehicle.school.resource;

import platform.util.Util;
import platform.webservice.ui.definition.IdValue;
import application.c4t.vehicle.school.defined.resource.Basefee_receipt;

public class fee_receipt extends Basefee_receipt {

	/**
	 * 
	 */
	public static IdValue[] PAYMENT_TYPE_ENUM = {new IdValue("CASH", "Cash"),
			new IdValue("CHEQUE", "Cheque"),new IdValue("OTHER", "Other")};	
	public static IdValue[] CHEQUE_STATUS_ENUM = {new IdValue("RECEIVED", "Received"),
		new IdValue("DEPOSITED", "Deposited"),
		new IdValue("CLEARED", "Cleared"),
		new IdValue("BOUNCED", "Bounced"),};
	
	private static final long serialVersionUID = 1L;
	
	public fee_receipt() {
		this.setId(Util.getUniqueId());
	}
	
	public fee_receipt(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
