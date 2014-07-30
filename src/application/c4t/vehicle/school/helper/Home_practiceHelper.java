package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.home_practice;


public class Home_practiceHelper extends BaseHelper {
	
	Home_practiceHelper() {
		super(new home_practice());
		// TODO Auto-generated constructor stub
	}
	private static Home_practiceHelper instance;
	
	public static Home_practiceHelper getInstance() {
		if (instance == null)
			instance = new Home_practiceHelper();
		return instance;
	}
	
	public BaseResource[] getHome_practiceForClass(String customerId, String class_section_name) {
		Expression e1 = new Expression(home_practice.FIELD_SCHOOL_ID, REL_OP.EQ, customerId);
		Expression e2 = new Expression(home_practice.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e3 = new Expression(e1, LOG_OP.AND, e2);
		Expression e4 = new Expression(home_practice.FIELD_SENT, REL_OP.EQ, "Y");
		Expression e5 = new Expression(e3, LOG_OP.AND, e4);
		
		return getByExpression(e5, new String[]{home_practice.FIELD_CREATION_TIMESTAMP + " desc"});
	}
	
	public void updateSend(String id) throws ApplicationException {
		home_practice _resource = new home_practice(id);
		_resource.setSent("Y");
		Home_practiceHelper.getInstance().update(_resource);
	}
	
}
