package application.c4t.vehicle.school.helper;



import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.report_card;


public class Report_cardHelper extends BaseHelper {
	
	Report_cardHelper() {
		super(new report_card());
		// TODO Auto-generated constructor stub
	}
	private static Report_cardHelper instance;
	
	public static Report_cardHelper getInstance() {
		if (instance == null)
			instance = new Report_cardHelper();
		return instance;
	}	
	
	public BaseResource[] getByStudent(String studentId) {
		Expression e = new Expression(report_card.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		return getByExpression(e, new String[]{report_card.FIELD_ASSESSMENT_DATE + " desc "});
	}
	
	
}
