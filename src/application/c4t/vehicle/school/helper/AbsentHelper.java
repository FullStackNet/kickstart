package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.absent;


public class AbsentHelper extends BaseHelper {
	AbsentHelper() {
		super(new absent());
		// TODO Auto-generated constructor stub
	}
	private static AbsentHelper instance;
	
	public static AbsentHelper getInstance() {
		if (instance == null)
			instance = new AbsentHelper();
		return instance;
	}
	
	public void updateSend(String id) throws ApplicationException {
		absent _absent = new absent(id);
		_absent.setSent("Y");
		AbsentHelper.getInstance().update(_absent);
	}
	
	public BaseResource[] getDaily_activiyForClass(String customerId, String class_section_name) {
		Expression e1 = new Expression(absent.FIELD_SCHOOL_ID, REL_OP.EQ, customerId);
		Expression e2 = new Expression(absent.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e3 = new Expression(e1, LOG_OP.AND, e2);
		Expression e4 = new Expression(absent.FIELD_SENT, REL_OP.EQ, "Y");
		Expression e5 = new Expression(e3, LOG_OP.AND, e4);
		
		return getByExpression(e5, new String[]{absent.FIELD_DATE+ " desc"});
	}
	
	public BaseResource[] getForSchools(String[] schools) {
		Expression e = new Expression(absent.FIELD_SCHOOL_ID, REL_OP.IN, schools);
		return getByExpression(e, new String[]{absent.FIELD_DATE + " desc"});
	}
}
