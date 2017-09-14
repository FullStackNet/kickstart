package application.account.resource;

import application.account.defined.resource.Baseledger;
import application.account.defined.resource.Baseledger_detail;
import platform.util.Util;

public class ledger_detail extends Baseledger_detail {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ledger_detail() {
        this.setId(Util.getUniqueId());
    }

    public ledger_detail(String id) {
        this.setId(id);
    }

    @Override
    public Class<?> getResultClass() {
        // TODO Auto-generated method stub
        return null;
    }

}
