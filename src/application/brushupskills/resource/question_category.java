package application.brushupskills.resource;

import platform.util.Util;
import application.brushupskills.defined.resource.Basequestion_category;

public class question_category extends Basequestion_category{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public question_category() {
		this.setId(Util.getUniqueId());
	}
	
	public question_category(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
