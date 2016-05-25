package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.test_question;


public class Test_questionHelper extends BaseHelper {
	
	Test_questionHelper() {
		super(new test_question());
		// TODO Auto-generated constructor stub
	}
	private static Test_questionHelper instance;
	
	public static Test_questionHelper getInstance() {
		if (instance == null)
			instance = new Test_questionHelper();
		return instance;
	}
	public BaseResource[] getByTestId(String testId) {
		Expression e = new Expression(test_question.FIELD_TEST_ID, REL_OP.EQ, testId);
		return getByExpression(e);
	}
}
