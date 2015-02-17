package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.student;
import application.c4t.vehicle.school.resource.student_tutorial;
import application.c4t.vehicle.school.resource.tutorial;


public class TutorialHelper extends BaseHelper {
	
	TutorialHelper() {
		super(new tutorial());
		// TODO Auto-generated constructor stub
	}
	private static TutorialHelper instance;
	
	public static TutorialHelper getInstance() {
		if (instance == null)
			instance = new TutorialHelper();
		return instance;
	}
	
	public BaseResource[] getByClass(String className,String customerId) {
		Expression e1 = new Expression(student_tutorial.FIELD_CLASS_NAME, REL_OP.EQ, className);
		Expression e2 = new Expression(student.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e, new String[]{tutorial.FIELD_TITLE});	
	}
}
