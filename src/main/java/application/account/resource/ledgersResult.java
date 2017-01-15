package application.account.resource;

import platform.defined.resource.Baseresult;
import platform.util.Util;


public class ledgersResult extends Baseresult {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public ledgersResult() {

    }

    public ledgersResult[] resource;

    public ledgersResult[] getResource() {
        return resource;
    }

    public void setResource(ledgersResult[] resources) {
        this.resource = resources;
    }

    public ledgersResult getFirstResource() {
        if (Util.isEmpty(resource))
            return null;
        return resource[0];
    }

    @Override
    public Class<?> getResultClass() {
        // TODO Auto-generated method stub
        return null;
    }
}
