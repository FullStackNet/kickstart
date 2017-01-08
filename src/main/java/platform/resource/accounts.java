package platform.resource;

import platform.defined.resource.Baseaccounts;
import platform.util.Util;

public class accounts extends Baseaccounts {

    /**
     *
     */

    private static final long serialVersionUID = 1L;

    public accounts() {
        this.setId(Util.getUniqueId());
    }

    public accounts(String id) {
        this.setId(id);
    }

    @Override
    public Class<?> getResultClass() {
        // TODO Auto-generated method stub
        return null;
    }


}
