package platform.resource;

import platform.defined.resource.Baseid_card;
import platform.util.Util;
import platform.webservice.ui.definition.IdValue;

public class id_card extends Baseid_card {
	public static String STATUS_NEW = "NEW";
	public static String STATUS_USED = "USED";
	
	public static IdValue[] CARD_USED_TYPE = {new IdValue("STUDENT", "STUDENT"),
			new IdValue("STAFF", "STAFF"),new IdValue("OTHERS", "OTHERS")};
	
	
	public static IdValue[] CARD_STATUS_ENUM = new IdValue[] {
			new IdValue(STATUS_NEW, STATUS_NEW),
			new IdValue(STATUS_USED, STATUS_USED),
	};
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public id_card() {
		this.setId(Util.getUniqueId());
	}
	
	public id_card(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
