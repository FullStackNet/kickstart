package platform.resource;

import platform.defined.resource.Baseaccount;
import platform.util.Util;

public class account extends Baseaccount {

    /**
     *
     */

    private static final long serialVersionUID = 1L;

    public account() {
        this.setId(Util.getUniqueId());
    }

    public account(String id) {
        this.setId(id);
    }

    @Override
    public Class<?> getResultClass() {
        // TODO Auto-generated method stub
        return null;
    }


}
