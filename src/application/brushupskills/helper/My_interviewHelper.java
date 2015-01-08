package application.brushupskills.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.brushupskills.resource.my_interview;

public class My_interviewHelper extends BaseHelper {

	private static My_interviewHelper instance;

	public static My_interviewHelper getInstance() {
		if (instance == null)
			instance = new My_interviewHelper();
		return instance;
	}
	
	public My_interviewHelper() {
		super(new my_interview());
		// TODO Auto-generated constructor stub
	}
	
	public BaseResource[] getInterviewsForCandidateId(String candidateId) {
		Expression e = new Expression(my_interview.FIELD_CANDIDATE_ID,REL_OP.EQ, candidateId);
		return getByExpression(e, new String[]{my_interview.FIELD_DATE});
	}
}
