package application.brushupskills.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.brushupskills.resource.ask_question;

public class Ask_questionHelper extends BaseHelper {

	private static Ask_questionHelper instance;

	public static Ask_questionHelper getInstance() {
		if (instance == null)
			instance = new Ask_questionHelper();
		return instance;
	}
	
	public Ask_questionHelper() {
		super(new ask_question());
		// TODO Auto-generated constructor stub
	}
	
	public BaseResource[] getbyCandidateId(String candidateId) {
		Expression e = new Expression(ask_question.FIELD_CANDIDATE_ID, REL_OP.EQ, candidateId);
		return getByExpression(e, new String[]{ask_question.FIELD_CREATION_TIME+" desc"});
	}
}
