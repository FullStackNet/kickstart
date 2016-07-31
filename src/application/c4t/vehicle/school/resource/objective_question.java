package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseobjective_question;

public class objective_question extends Baseobjective_question {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static String QUESTION_TYPE_OBJECTIVE = "OBJECTIVE";
	public static String QUESTION_TYPE_SUBJECTIVE = "SUBJECTIVE";
	
	public final static String[] QUESTION_TYPE_ENUM = new String[] {
		QUESTION_TYPE_OBJECTIVE,
		QUESTION_TYPE_SUBJECTIVE
	};
	
	public objective_question() {
		this.setId(Util.getUniqueId());
	}
	
	public objective_question(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
