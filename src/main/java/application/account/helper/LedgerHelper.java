package application.account.helper;

import application.account.resource.ledger;
import platform.helper.BaseHelper;

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
}
