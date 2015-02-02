package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.staff;


public class StaffHelper extends BaseHelper {
	
	StaffHelper() {
		super(new  staff());
		// TODO Auto-generated constructor stub
	}
	private static StaffHelper instance;
	
	public static StaffHelper getInstance() {
		if (instance == null)
			instance = new StaffHelper();
		return instance;
	}
	
	public BaseResource[] getStaffByCardNo(String card_no) {
		Expression e = new Expression(staff.FIELD_CARD_NO, REL_OP.EQ, card_no);
		return getByExpression(e);
	}
}
