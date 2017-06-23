package application.account.helper;

import application.account.resource.ledger;
import application.account.resource.ledger_detail;
import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;

public class Ledger_detailHelper extends BaseHelper {

    private static Ledger_detailHelper instance;

    public static Ledger_detailHelper getInstance() {
        if (instance == null)
            instance = new Ledger_detailHelper();
        return instance;
    }

    public Ledger_detailHelper() {
        super(new ledger_detail());
        // TODO Auto-generated constructor stub
    }

}
