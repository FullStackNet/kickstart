package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
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
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools) {
		HelperFactory.getInstance().register(SchoolHelper.getInstance());
		HelperFactory.getInstance().register(AbsentHelper.getInstance());
		ArrayList<JoinField> list = new ArrayList<JoinField>();
		JoinField field = new JoinField("school", "school_id", "school_name");
		list.add(field);
		Expression e = new Expression(absent.FIELD_SCHOOL_ID, REL_OP.IN, schools);
		try {
			return getByJoining(e,list, new String[]{absent.FIELD_DATE+ " desc"});
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();
	}
}
