package application.account.resource;

import application.account.defined.resource.Baseledgers;
import platform.util.Util;

public class ledgers extends Baseledgers {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ledgers() {
        this.setId(Util.getUniqueId());
    }

    public ledgers(String id) {
        this.setId(id);
    }

    @Override
    public Class<?> getResultClass() {
        // TODO Auto-generated method stub
        return null;
    }

}
