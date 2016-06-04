package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.objective_question_answer;
import application.c4t.vehicle.school.resource.test_allocation;
import application.c4t.vehicle.school.resource.test_allocation_student;


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
	
	public BaseResource[] getAnswersByAllocationId(String allocationId) {
		Expression e = new Expression(objective_question_answer.FIELD_ALLOCATED_TEST_ID, REL_OP.EQ, allocationId);
		return getByExpression(e);
	}
	
}
