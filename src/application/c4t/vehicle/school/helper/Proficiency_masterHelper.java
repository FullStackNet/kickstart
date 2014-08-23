package application.c4t.vehicle.school.helper;



import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.proficiency_master;
import application.c4t.vehicle.school.resource.student;


public class Proficiency_masterHelper extends BaseHelper {
	
	Proficiency_masterHelper() {
		super(new proficiency_master());
		// TODO Auto-generated constructor stub
	}
	private static Proficiency_masterHelper instance;
	
	public static Proficiency_masterHelper getInstance() {
		if (instance == null)
			instance = new Proficiency_masterHelper();
		return instance;
	}	
	
	public BaseResource[] getByStudent(String customerId,String studentId) {
		student _student = (student)StudentHelper.getInstance().getById(studentId);
		if (_student == null) 
			return null;
		Expression e1 = new Expression(proficiency_master.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e2 = new Expression(proficiency_master.FIELD_CLASS_NAME, REL_OP.EQ, _student.getClass_name());
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e4, new String[]{proficiency_master.FIELD_TITLE});
	}
	
	public BaseResource[] getForClass(String customerId, String class_name) {
		Expression e1 = new Expression(proficiency_master.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e2 = new Expression(proficiency_master.FIELD_CLASS_NAME, REL_OP.EQ, class_name);
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e4, new String[]{proficiency_master.FIELD_TITLE});
	}
}
