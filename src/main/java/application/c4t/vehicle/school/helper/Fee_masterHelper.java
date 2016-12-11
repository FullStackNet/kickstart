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
import platform.util.Util;
import application.c4t.vehicle.school.resource.fee_master;


public class Fee_masterHelper extends BaseHelper {
	Fee_masterHelper() {
		super(new fee_master());
		// TODO Auto-generated constructor stub
	}
	private static Fee_masterHelper instance;
	
	public static Fee_masterHelper getInstance() {
		if (instance == null)
			instance = new Fee_masterHelper();
		return instance;
	}
	public fee_master getByClassCourse(String school_id,String class_name,String courseId)  {
		Expression e1 = new Expression(fee_master.FIELD_SCHOOL_ID, REL_OP.EQ, school_id);
		Expression e2 = new Expression(fee_master.FIELD_CLASS_NAME, REL_OP.EQ, class_name);
		Expression e3 = new Expression(fee_master.FIELD_COURSE_ID, REL_OP.EQ, courseId);
		Expression e4 = new Expression(e2, LOG_OP.AND, e3);
		Expression e = new Expression(e1, LOG_OP.AND, e4);
		BaseResource[] resources =  getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (fee_master)resources[0];
		}
		return null;
	}
	
	public BaseResource[] getForSchoolsResources(String[] schools,String[] order)  {
		try {
			Expression e = new Expression(fee_master.FIELD_SCHOOL_ID, REL_OP.IN, schools);
			return getByExpression(e,order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools,String[] order)  {
		try {
			HelperFactory.getInstance().register(SchoolHelper.getInstance());
			HelperFactory.getInstance().register(Fee_masterHelper.getInstance());
			ArrayList<JoinField> list = new ArrayList<JoinField>();
			JoinField field = new JoinField("school", "school_id", "school_name");
			list.add(field);
			Expression e = new Expression(fee_master.FIELD_SCHOOL_ID, REL_OP.IN, schools);
			return getByJoining(e,list,order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();		
	}
}
