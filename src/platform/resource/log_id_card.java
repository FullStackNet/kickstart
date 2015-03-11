package platform.resource;

import platform.defined.resource.Baselog_id_card;
import platform.util.Util;

public class log_id_card extends Baselog_id_card {
	public static String REASON_NO_STUDENT = "NO_STUDENT";
	public static String REASON_MUTIPLE_STUDENT = "MUTIPLE_STUDENT";
	public static String REASON_INCORRECT_ROUTE = "INCORRECT_ROUTE";
	public static String REASON_INVALID_CONTROLLER = "WRONG_CONTROLLER";
	public static String REASON_INVALID_APPLIANCE = "INVALID APPLIANCE";
	public static String REASON_INVALID_DEVICE = "INVALID DEVICE";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public log_id_card() {
		this.setId(Util.getUniqueId());
	}
	
	public log_id_card(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
