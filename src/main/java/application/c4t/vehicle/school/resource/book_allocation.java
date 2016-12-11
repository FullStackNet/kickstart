package application.c4t.vehicle.school.resource;

import platform.util.Util;
import platform.webservice.ui.definition.IdValue;
import application.c4t.vehicle.school.defined.resource.Basebook_allocation;

public class book_allocation extends Basebook_allocation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public book_allocation() {
		this.setId(Util.getUniqueId());
	}
	
	public book_allocation(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	public static String ALLOCATION_TYPE_BATCH_WISE = "BATCH_WISE";
	
	public final static IdValue[] ALLOCATION_TYPE_ENUM = new IdValue[] {
		new IdValue(ALLOCATION_TYPE_BATCH_WISE, "Batch wise"),
	};
}
