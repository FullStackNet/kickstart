package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.practical_master;


public class Practical_masterHelper extends BaseHelper {
	
	Practical_masterHelper() {
		super(new practical_master());
		// TODO Auto-generated constructor stub
	}
	private static Practical_masterHelper instance;
	
	public static Practical_masterHelper getInstance() {
		if (instance == null)
			instance = new Practical_masterHelper();
		return instance;
	}
	
	public BaseResource[] getForClass(String classname, String customerId) {
		Expression e1 = new Expression(practical_master.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e2 = new Expression(practical_master.FIELD_CLASS_NAME, REL_OP.EQ, classname);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e, new String[]{practical_master.FIELD_TITLE});
	}
}
