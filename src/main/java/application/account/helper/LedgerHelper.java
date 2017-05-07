package application.account.helper;

import application.account.resource.ledger;
import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;

public class LedgerHelper extends BaseHelper {

    private static LedgerHelper instance;

    public static LedgerHelper getInstance() {
        if (instance == null)
            instance = new LedgerHelper();
        return instance;
    }

    public LedgerHelper() {
        super(new ledger());
        // TODO Auto-generated constructor stub
    }
    
    public BaseResource[] getSalesVouchers(String accountId) {
    	Expression e1 = new Expression(ledger.FIELD_VOUCHER_TYPE, REL_OP.EQ,"SALES");
    	Expression e2 = new Expression(ledger.FIELD_VOUCHER_TYPE, REL_OP.EQ,"Sales");
    	Expression e = new Expression(e1, LOG_OP.AND,e2);
    	return getByExpression(e,new String[]{ledger.FIELD_EVENT_DATE});
    }
    
    public BaseResource[] getNonSalesVouchers(String accountId) {
    	Expression e1 = new Expression(ledger.FIELD_VOUCHER_TYPE, REL_OP.NEQ,"SALES");
    	Expression e2 = new Expression(ledger.FIELD_VOUCHER_TYPE, REL_OP.NEQ,"Sales");
    	Expression e = new Expression(e1, LOG_OP.AND,e2);
    	return getByExpression(e,new String[]{ledger.FIELD_EVENT_DATE});
    }
}
