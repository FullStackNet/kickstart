package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.C4t_relationHelper;
import platform.resource.BaseResource;
import platform.resource.c4t_relation;
import application.c4t.vehicle.school.resource.objective_question;


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
		String[] questionIds = C4t_relationHelper.getInstance().getByRelation(testId, "TEST->QUESTION", new String[]{c4t_relation.FIELD_ORDER});
		return Objective_questionHelper.getInstance().getById(questionIds);
	}
}
