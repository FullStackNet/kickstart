package application.brushupskills.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.brushupskills.resource.answer;

public class AnswerHelper extends BaseHelper {

	private static AnswerHelper instance;

	public static AnswerHelper getInstance() {
		if (instance == null)
			instance = new AnswerHelper();
		return instance;
	}
	
	public AnswerHelper() {
		super(new answer());
		// TODO Auto-generated constructor stub
	}
	
	public BaseResource[] getAnswerForQuestionId(String questionId) {
		Expression e = new Expression(answer.FIELD_QUESTION_ID,REL_OP.EQ, questionId);
		return getByExpression(e, new String[]{answer.FIELD_ORDER});
	}
}
