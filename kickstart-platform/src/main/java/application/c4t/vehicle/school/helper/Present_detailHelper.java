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
import application.c4t.vehicle.school.resource.present;
import application.c4t.vehicle.school.resource.present_detail;


public class Present_detailHelper extends BaseHelper {
	Present_detailHelper() {
		super(new present_detail());
		// TODO Auto-generated constructor stub
	}
	private static Present_detailHelper instance;
	
	public static Present_detailHelper getInstance() {
		if (instance == null)
			instance = new Present_detailHelper();
		return instance;
	}
	
	public BaseResource[] getDetail(String parentId) {
		Expression e = new Expression(present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.EQ, parentId);
		return getByExpression(e);
	}
	
	public BaseResource[] getDetail(String[] parentIds) {
		Expression e = new Expression(present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.IN, parentIds);
		return getByExpression(e);
	}
	
	public BaseResource[] getSchoolEntry(String[] parentIds) {
		Expression e1 = new Expression(present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.IN, parentIds);
		Expression e2 = new Expression(present_detail.FIELD_PRESENT_TYPE, REL_OP.EQ, "SCHOOL");
		Expression e3 = new Expression(present_detail.FIELD_PRESENT_RECORD_TYPE, REL_OP.EQ, "ENTRY");
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		return getByExpression(e);
	}
	
	public BaseResource[] getBusTapped(String[] parentIds) {
		Expression e1 = new Expression(present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.IN, parentIds);
		Expression e2 = new Expression(present_detail.FIELD_PRESENT_TYPE, REL_OP.EQ, "BUS");
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}
	
	public BaseResource[] getBusPickup(String[] parentIds) {
		Expression e1 = new Expression(present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.IN, parentIds);
		Expression e2 = new Expression(present_detail.FIELD_PRESENT_TYPE, REL_OP.EQ, "BUS");
		Expression e3 = new Expression(present_detail.FIELD_SUB_PRESENT_TYPE, REL_OP.EQ, "PICKUP");
		
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		return getByExpression(e);
	}
	
	public BaseResource[] getBusDrop(String[] parentIds) {
		Expression e1 = new Expression(present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.IN, parentIds);
		Expression e2 = new Expression(present_detail.FIELD_PRESENT_TYPE, REL_OP.EQ, "BUS");
		Expression e3 = new Expression(present_detail.FIELD_SUB_PRESENT_TYPE, REL_OP.EQ, "DROP");
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		return getByExpression(e);
	}
	
	public BaseResource[] getSchoolExit(String[] parentIds) {
		Expression e1 = new Expression(present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.IN, parentIds);
		Expression e2 = new Expression(present_detail.FIELD_PRESENT_TYPE, REL_OP.EQ, "SCHOOL");
		Expression e3 = new Expression(present_detail.FIELD_PRESENT_RECORD_TYPE, REL_OP.EQ, "EXIT");
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		return getByExpression(e);
	}
	public BaseResource[] getStudent(String parentId) {
		Expression e = new Expression(present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.EQ, parentId);
		BaseResource[] resources = getByExpression(e);
		if (Util.isEmpty(resources)) {
			return null;
		}
		String[] ids = new String[resources.length];
		for(int i=0; i < resources.length; i++) {
			present_detail detail = (present_detail)resources[i];
			ids[i] = detail.getStudent_id();
		}
		return StudentHelper.getInstance().getById(ids, null);
	}
	

	public BaseResource[] getByStudent(String studentId) {
		Expression e = new Expression(present_detail.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		return getByExpression(e,new String[]{present_detail.FIELD_DATE +" desc"});
	}
	public BaseResource[] getByBusStudent(String studentId) {
		Expression e1 = new Expression(present_detail.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		Expression e2 = new Expression(present_detail.FIELD_PRESENT_TYPE, REL_OP.EQ, "BUS");
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,new String[]{present_detail.FIELD_DATE +" desc" , present_detail.FIELD_CREATION_TIME + " desc"});
	}

	public BaseResource[] getBySchoolStudent(String studentId) {
		Expression e1 = new Expression(present_detail.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		Expression e2 = new Expression(present_detail.FIELD_PRESENT_TYPE, REL_OP.EQ, "SCHOOL");
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,new String[]{present_detail.FIELD_DATE +" desc", present_detail.FIELD_CREATION_TIME + " desc"});
	}
	
	public BaseResource[] getSchoolEntry(String[] schoolId,long fromTime,long toTime) {
		Expression e1 = new Expression(present_detail.FIELD_SCHOOL_ID, REL_OP.IN, schoolId);
		Expression e2 = new Expression(present_detail.FIELD_PRESENT_TYPE, REL_OP.EQ, "SCHOOL");
		Expression e3 = new Expression(present_detail.FIELD_PRESENT_RECORD_TYPE, REL_OP.EQ, "ENTRY");
		Expression e4 = new Expression(e2, LOG_OP.AND, e3);
		Expression e5 = new Expression(e1, LOG_OP.AND, e4);
	
		Expression e6 = new Expression(present.FIELD_DATE, REL_OP.GTEQ, fromTime);
		Expression e7 = new Expression(present.FIELD_DATE, REL_OP.LT, toTime);
		
		Expression e8 = new Expression(e6, LOG_OP.AND, e7);
	
		Expression e = new Expression(e5, LOG_OP.AND, e8);
		
		return getByExpression(e, null);
	}
	
	public ArrayList<Map<String, Object>> getDetailListMap(String absent_parent_id,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression expression = new Expression(present_detail.FIELD_PRESENT_PARENT_ID, REL_OP.EQ,absent_parent_id);
		try {
			list = getByJoining(expression,joinFields,null);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
