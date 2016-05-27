package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Util;
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
	
	public BaseResource[] getByTestId(String testId) {
		Expression e = new Expression(objective_question.FIELD_TEST_ID,REL_OP.EQ, testId);
		return getByExpression(e, new String[]{objective_question.FIELD_ORDER_NO});
	}
	
	public void reorder(String testId, String orderId, long order) {
		Expression e1 = new Expression(objective_question.FIELD_TEST_ID,REL_OP.EQ, testId);
		Expression e2 = new Expression(objective_question.FIELD_ID,REL_OP.NEQ, orderId);
		Expression e3 = new Expression(objective_question.FIELD_ORDER_NO,REL_OP.GTEQ, order);
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		BaseResource[] _resources = getByExpression(e, new String[]{objective_question.FIELD_ORDER_NO});
		if (!Util.isEmpty(_resources)) {
			long index = order+1;
			for(BaseResource resource : _resources) {
				objective_question _question = new objective_question(resource.getId());
				_question.setOrder_no(index);
				try {
					Objective_questionHelper.getInstance().update(_question);
				} catch (ApplicationException e5) {
					// TODO Auto-generated catch block
					e5.printStackTrace();
				}
				index++;
			}
		}
	}
}
