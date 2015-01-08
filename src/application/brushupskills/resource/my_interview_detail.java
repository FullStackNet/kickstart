package application.brushupskills.resource;

import platform.util.Util;
import application.brushupskills.defined.resource.Basemy_interview_detail;

public class my_interview_detail extends Basemy_interview_detail{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public my_interview_detail() {
		this.setId(Util.getUniqueId());
	}
	
	public my_interview_detail(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
