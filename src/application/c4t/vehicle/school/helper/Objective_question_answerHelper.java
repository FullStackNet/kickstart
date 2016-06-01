package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.objective_question_answer;


public class Objective_question_answerHelper extends BaseHelper {
	
	Objective_question_answerHelper() {
		super(new objective_question_answer());
		// TODO Auto-generated constructor stub
	}
	private static Objective_question_answerHelper instance;
	
	public static Objective_question_answerHelper getInstance() {
		if (instance == null)
			instance = new Objective_question_answerHelper();
		return instance;
	}
}
