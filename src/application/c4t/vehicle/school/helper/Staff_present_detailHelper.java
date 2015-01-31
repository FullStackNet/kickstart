package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Util;
import application.c4t.vehicle.school.resource.staff_present_detail;


public class Staff_present_detailHelper extends BaseHelper {
	Staff_present_detailHelper() {
		super(new staff_present_detail());
		// TODO Auto-generated constructor stub
	}
	private static Staff_present_detailHelper instance;
	
	public static Staff_present_detailHelper getInstance() {
		if (instance == null)
			instance = new Staff_present_detailHelper();
		return instance;
	}
	
	public BaseResource[] getDetail(String parentId) {
		Expression e = new Expression(staff_present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.EQ, parentId);
		return getByExpression(e);
	}
	
	public BaseResource[] getStaff(String parentId) {
		Expression e = new Expression(staff_present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.EQ, parentId);
		BaseResource[] resources = getByExpression(e);
		if (Util.isEmpty(resources)) {
			return null;
		}
		String[] ids = new String[resources.length];
		for(int i=0; i < resources.length; i++) {
			staff_present_detail detail = (staff_present_detail)resources[i];
			ids[i] = detail.getStaff_id();
		}
		return StaffHelper.getInstance().getById(ids, null);
	}
	

	public BaseResource[] getByStaff(String staffId) {
		Expression e = new Expression(staff_present_detail.FIELD_STAFF_ID, REL_OP.EQ, staffId);
		return getByExpression(e,new String[]{staff_present_detail.FIELD_DATE +" desc"});
	}
	public BaseResource[] getByBusStaff(String staffId) {
		Expression e1 = new Expression(staff_present_detail.FIELD_STAFF_ID, REL_OP.EQ, staffId);
		Expression e2 = new Expression(staff_present_detail.FIELD_PRESENT_TYPE, REL_OP.EQ, "BUS");
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,new String[]{staff_present_detail.FIELD_DATE +" desc" , staff_present_detail.FIELD_CREATION_TIME + " desc"});
	}

	public BaseResource[] getBySchoolStaff(String staffId) {
		Expression e1 = new Expression(staff_present_detail.FIELD_STAFF_ID, REL_OP.EQ, staffId);
		Expression e2 = new Expression(staff_present_detail.FIELD_PRESENT_TYPE, REL_OP.EQ, "SCHOOL");
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,new String[]{staff_present_detail.FIELD_DATE +" desc", staff_present_detail.FIELD_CREATION_TIME + " desc"});
	}
	
	public ArrayList<Map<String, Object>> getDetailListMap(String absent_parent_id,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression expression = new Expression(staff_present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.EQ,absent_parent_id);
		try {
			list = getByJoining(expression,joinFields,null);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
