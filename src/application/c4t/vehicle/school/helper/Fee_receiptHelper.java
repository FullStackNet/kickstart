package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.util.Util;
import application.c4t.vehicle.school.resource.fee_receipt;


public class Fee_receiptHelper extends BaseSchoolHelper{
	
	Fee_receiptHelper() {
		super(new fee_receipt());
		// TODO Auto-generated constructor stub
	}
	private static Fee_receiptHelper instance;
	
	public static Fee_receiptHelper getInstance() {
		if (instance == null)
			instance = new Fee_receiptHelper();
		return instance;
	}
	
	public Double getTotalFee4Year(long start_date,String studentId) {
		double total_fee_paid = 0.0;
		Expression e1 = new Expression(fee_receipt.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		Expression e2 = new Expression(fee_receipt.FIELD_PAYMENT_DATE, REL_OP.GTEQ, start_date);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		BaseResource[] receipts = getByExpression(e);
		if (Util.isEmpty(receipts))
			return total_fee_paid;
		for(int i=0; i < receipts.length ; i++) {
			fee_receipt _receipt = (fee_receipt) receipts[i];
			if ("CHEQUE".equals(_receipt.getPayment_method())) {
				if ("CLEARED".equals(_receipt.getCheque_status())) {
					total_fee_paid = total_fee_paid + _receipt.getAmountEx(); 
				}
			} else {
				total_fee_paid = total_fee_paid + _receipt.getAmountEx(); 
			}
		}
		return total_fee_paid;
	}
}
