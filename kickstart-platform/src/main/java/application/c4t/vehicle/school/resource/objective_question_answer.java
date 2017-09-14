package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseobjective_question_answer;

public class objective_question_answer extends Baseobjective_question_answer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public objective_question_answer() {
		this.setId(Util.getUniqueId());
	}
	
	public objective_question_answer(String id) {
		this.setId(id);
	}	
	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
