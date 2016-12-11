package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
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
	
	public void updateCardId(String staffId,String cardId) {
		staff _staff = new staff(staffId);
		_staff.setCard_no(cardId);
		try {
			update(_staff);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public BaseResource[] getStaffByCardNo(String card_no) {
		Expression e = new Expression(staff.FIELD_CARD_NO, REL_OP.EQ, card_no);
		return getByExpression(e);
	}
	
	public BaseResource[] getSchoolstaff(String[] school_ids,String[] order)  {
		Expression e = new Expression(staff.FIELD_SCHOOL_ID, REL_OP.IN, school_ids);
		return getByExpression(e,order);
	}
}
