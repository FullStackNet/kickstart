package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperUtils;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.objective_question;
import application.c4t.vehicle.school.resource.test_question;


public class Objective_questionHelper extends BaseHelper {
	
	Objective_questionHelper() {
		super(new objective_question());
		// TODO Auto-generated constructor stub
	}
	private static Objective_questionHelper instance;
	
	public static Objective_questionHelper getInstance() {
		if (instance == null)
			instance = new Objective_questionHelper();
		return instance;
	}
	
	public BaseResource[] getByTutorial(String tutorialId) {
		Expression e = new Expression(objective_question.FIELD_TUTORIAL_ID,REL_OP.EQ, tutorialId);
		return getByExpression(e);
	}
	
	public BaseResource[] getByTest(String testId) {
		BaseResource[]  resources = Test_questionHelper.getInstance().getByTestId(testId);
		String[] questionIds = HelperUtils.convertResource2IdArray(resources, test_question.FIELD_QUESTION_ID);
		return Objective_questionHelper.getInstance().getById(questionIds);
	}
}
