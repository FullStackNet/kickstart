package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.TimeUtil;
import application.c4t.vehicle.school.resource.account_transaction;
import application.c4t.vehicle.school.resource.school_account;


public class Account_transactionHelper extends BaseHelper {
	
	Account_transactionHelper() {
		super(new account_transaction());
		// TODO Auto-generated constructor stub
	}
	private static Account_transactionHelper instance;
	
	public static Account_transactionHelper getInstance() {
		if (instance == null)
			instance = new Account_transactionHelper();
		return instance;
	}
	public BaseResource[] getForAccount(String accountId) {
		school_account _account = (school_account)School_accountHelper.getInstance().getById(accountId);
		if (_account == null)
			return null;
		long fromTime = TimeUtil.getTimeFromDateString(null, "01-04-"+_account.getCurrent_from_year());
		long toTime = TimeUtil.getTimeFromDateString(null, "31-03-"+_account.getCurrent_to_year())+60*24*60*1000L;
		
		Expression e1 = new Expression(account_transaction.FIELD_ACCOUNT_ID,REL_OP.EQ, accountId);
		Expression e2 = new Expression(account_transaction.FIELD_TRANSACTION_DATE,REL_OP.GTEQ, fromTime);
		Expression e3 = new Expression(account_transaction.FIELD_TRANSACTION_DATE,REL_OP.LT, toTime);
		Expression e4 = new Expression(e2, LOG_OP.AND, e3);
		Expression e = new Expression(e1, LOG_OP.AND, e4);
		
		return getByExpression(e, new String[]{account_transaction.FIELD_TRANSACTION_DATE});		
	}
}
