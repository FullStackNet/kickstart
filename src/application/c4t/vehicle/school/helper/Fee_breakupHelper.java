package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.fee_breakup;


public class Fee_breakupHelper extends BaseHelper {
	Fee_breakupHelper() {
		super(new fee_breakup());
		// TODO Auto-generated constructor stub
	}
	private static Fee_breakupHelper instance;
	
	public static Fee_breakupHelper getInstance() {
		if (instance == null)
			instance = new Fee_breakupHelper();
		return instance;
	}
	
	public BaseResource[] getFee_breakups(String parentId) {
		Expression e = new Expression(fee_breakup.FIELD_PARENT_ID, REL_OP.EQ, parentId);
		return getByExpression(e);
	}
	
	public ArrayList<Map<String, Object>> getFeeBreakupListMap(String parentId,ArrayList<JoinField> joinFields) {
		Expression e = new Expression(fee_breakup.FIELD_PARENT_ID, REL_OP.EQ, parentId);
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			list = getByJoining(e,joinFields,null);
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return list;
		}
		return list;
	}
	
	public BaseResource[] getFee_breakups(String[] parentIds) {
		Expression e = new Expression(fee_breakup.FIELD_PARENT_ID, REL_OP.IN, parentIds);
		return getByExpression(e);
	}
	
}
