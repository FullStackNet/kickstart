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
