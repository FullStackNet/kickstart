package application.brushupskills.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.brushupskills.resource.my_interview_detail;

public class My_interview_detailHelper extends BaseHelper {

	private static My_interview_detailHelper instance;

	public static My_interview_detailHelper getInstance() {
		if (instance == null)
			instance = new My_interview_detailHelper();
		return instance;
	}
	
	public My_interview_detailHelper() {
		super(new my_interview_detail());
		// TODO Auto-generated constructor stub
	}
	
	public BaseResource[] getInterviewsForParentId(String parentId) {
		Expression e = new Expression(my_interview_detail.FIELD_PARENT_ID,REL_OP.EQ, parentId);
		return getByExpression(e);
	}
}
