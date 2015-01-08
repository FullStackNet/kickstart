package application.account.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.Util;
import application.account.resource.account;

public class AccountHelper extends BaseHelper{

	private static AccountHelper instance;

	public static AccountHelper getInstance() {
		if (instance == null)
			instance = new AccountHelper();
		return instance;
	}
	
	public AccountHelper() {
		super(new account());
		// TODO Auto-generated constructor stub
	}
	
	public account getAccount(String customer_id,String accountId) {
		Expression e1 = new Expression(account.FIELD_CUSTOMER_ID, REL_OP.EQ, customer_id);
		Expression e2 = new Expression(account.FIELD_ACCOUNT_CUSTOMER_ID, REL_OP.EQ, accountId);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		BaseResource[] resourcs = getByExpression(e);
		if (Util.isEmpty(resourcs))
			return null;
		return (account)resourcs[0];

	}
}
