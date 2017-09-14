package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.util.Util;
import application.c4t.vehicle.school.resource.fee_additional_charge;


public class Fee_additioanl_chargeHelper extends BaseSchoolHelper {
	Fee_additioanl_chargeHelper() {
		super(new fee_additional_charge());
		// TODO Auto-generated constructor stub
	}
	private static Fee_additioanl_chargeHelper instance;
	
	public static Fee_additioanl_chargeHelper getInstance() {
		if (instance == null)
			instance = new Fee_additioanl_chargeHelper();
		return instance;
	}
	public Double getTotalcharges4Year(long start_date,String studentId) {
		double total = 0.0;
		Expression e1 = new Expression(fee_additional_charge.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		Expression e2 = new Expression(fee_additional_charge.FIELD_CHARGE_DATE, REL_OP.GTEQ, start_date);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		BaseResource[] charges = getByExpression(e);
		if (Util.isEmpty(charges))
			return total;
		for(int i=0; i < charges.length ; i++) {
			fee_additional_charge _discount = (fee_additional_charge) charges[i];
			total = total + _discount.getAmountEx(); 
		}
		return total;
	}
}
