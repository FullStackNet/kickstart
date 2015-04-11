package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.fee_master;
import application.c4t.vehicle.school.resource.notice;


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
