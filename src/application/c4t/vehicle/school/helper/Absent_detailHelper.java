package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
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
}
