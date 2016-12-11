package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.objective_question_answers;


public class Objective_question_answersHelper extends BaseHelper {
	
	Objective_question_answersHelper() {
		super(new objective_question_answers());
		// TODO Auto-generated constructor stub
	}
	private static Objective_question_answersHelper instance;
	
	public static Objective_question_answersHelper getInstance() {
		if (instance == null)
			instance = new Objective_question_answersHelper();
		return instance;
	}
}
