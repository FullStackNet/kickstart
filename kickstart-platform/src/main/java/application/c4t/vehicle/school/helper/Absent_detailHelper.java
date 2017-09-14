package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Util;
import application.c4t.vehicle.school.resource.absent_detail;


public class Absent_detailHelper extends BaseHelper {
	Absent_detailHelper() {
		super(new absent_detail());
		// TODO Auto-generated constructor stub
	}
	private static Absent_detailHelper instance;
	
	public static Absent_detailHelper getInstance() {
		if (instance == null)
			instance = new Absent_detailHelper();
		return instance;
	}
	
	public BaseResource[] getDetail(String parentId) {
		Expression e = new Expression(absent_detail.FIELD_ABSENT_PARENT_ID, REL_OP.EQ, parentId);
		return getByExpression(e);
	}
	
	public BaseResource[] getStudent(String parentId) {
		Expression e = new Expression(absent_detail.FIELD_ABSENT_PARENT_ID, REL_OP.EQ, parentId);
		BaseResource[] resources = getByExpression(e);
		if (Util.isEmpty(resources)) {
			return null;
		}
		String[] ids = new String[resources.length];
		for(int i=0; i < resources.length; i++) {
			absent_detail detail = (absent_detail)resources[i];
			ids[i] = detail.getStudent_id();
		}
		return StudentHelper.getInstance().getById(ids, null);
	}
	

	public BaseResource[] getByStudent(String studentId) {
		Expression e = new Expression(absent_detail.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		return getByExpression(e,new String[]{absent_detail.FIELD_DATE +" desc"});
	}

	public ArrayList<Map<String, Object>> getDetailListMap(String absent_parent_id,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression expression = new Expression(absent_detail.FIELD_ABSENT_PARENT_ID, REL_OP.EQ,absent_parent_id);
		try {
			list = getByJoining(expression,joinFields,null);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
