package application.c4t.vehicle.school.helper;



import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.homework_master;


public class Homework_masterHelper extends BaseHelper {
	
	Homework_masterHelper() {
		super(new homework_master());
		// TODO Auto-generated constructor stub
	}
	private static Homework_masterHelper instance;
	
	public static Homework_masterHelper getInstance() {
		if (instance == null)
			instance = new Homework_masterHelper();
		return instance;
	}	
	
	public BaseResource[] getHomeworkForClass(String customerId, String subject, String class_name) {
		Expression e1 = new Expression(homework_master.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e2 = new Expression(homework_master.FIELD_CLASS_NAME, REL_OP.EQ, class_name);
		Expression e3 = new Expression(homework_master.FIELD_SUBJECT_ID, REL_OP.EQ, subject);
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e5 = new Expression(e4, LOG_OP.AND, e3);
		return getByExpression(e5, new String[]{homework_master.FIELD_TITLE});
	}
}
