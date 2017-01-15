package application.account.resource;

import application.account.defined.resource.Baseledger;
import platform.util.Util;

public class ledger extends Baseledger {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ledger() {
        this.setId(Util.getUniqueId());
    }

    public ledger(String id) {
        this.setId(id);
    }

    @Override
    public Class<?> getResultClass() {
        // TODO Auto-generated method stub
        return null;
    }

}
