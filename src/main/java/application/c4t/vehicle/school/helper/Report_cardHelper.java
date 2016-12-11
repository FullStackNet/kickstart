package application.c4t.vehicle.school.helper;



import platform.db.Expression;
import platform.db.LOG_OP;
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
	
	public BaseResource[] getReport_card(String school_id,String accessment_period,
			String accessment_type,String classname, String sectionName) {
		Expression e1 = new Expression(report_card.FIELD_SCHOOL_ID, REL_OP.EQ, school_id);
		Expression e2 = new Expression(report_card.FIELD_ACCESSMENT_FOR, REL_OP.EQ, accessment_period);
		Expression e3 = new Expression(report_card.FIELD_ACCESSMENT_TYPE, REL_OP.EQ, accessment_type);
		Expression e4 = new Expression(report_card.FIELD_CLASS_NAME, REL_OP.EQ, classname);
		Expression e5 = new Expression(report_card.FIELD_SECTION_NAME, REL_OP.EQ, sectionName);
		Expression e6 = new Expression(e1, LOG_OP.AND, e2);
		Expression e7 = new Expression(e3, LOG_OP.AND, e4);
		Expression e8 = new Expression(e5, LOG_OP.AND, e6);
		Expression e9 = new Expression(e7, LOG_OP.AND, e8);
		return getByExpression(e9);
			
	}
}
