package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.util.Util;
import application.c4t.vehicle.school.resource.fee_discount;


public class Fee_discountHelper extends BaseSchoolHelper {
	
	Fee_discountHelper() {
		super(new fee_discount());
		// TODO Auto-generated constructor stub
	}
	private static Fee_discountHelper instance;
	
	public static Fee_discountHelper getInstance() {
		if (instance == null)
			instance = new Fee_discountHelper();
		return instance;
	}
	
	public Double getTotalDiscount4Year(long start_date,String studentId) {
		double total_fee_discount = 0.0;
		Expression e1 = new Expression(fee_discount.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		Expression e2 = new Expression(fee_discount.FIELD_DISCOUNT_DATE, REL_OP.GTEQ, start_date);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		BaseResource[] discounts = getByExpression(e);
		if (Util.isEmpty(discounts))
			return total_fee_discount;
		for(int i=0; i < discounts.length ; i++) {
			fee_discount _discount = (fee_discount) discounts[i];
				total_fee_discount = total_fee_discount + _discount.getAmountEx(); 
		}
		return total_fee_discount;
	}
}
