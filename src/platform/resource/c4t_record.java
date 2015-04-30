package platform.resource;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.defined.resource.Basec4t_record;
import platform.util.Util;

public class c4t_record extends Basec4t_record {
	
	/**
	 * 
	 */
	public static String C4T_RECORD_TYPE_COMMUNITY_COMMUNICATION  = "COMMUNITY_COMMUNICATION";
	
	private static final long serialVersionUID = 1L;
	
	public c4t_record() {
		this.setId(Util.getUniqueId());
	}
	
	public c4t_record(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
