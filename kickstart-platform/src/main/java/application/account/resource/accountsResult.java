package application.account.resource;

import platform.defined.resource.Baseresult;
import platform.util.Util;


public class accountsResult extends Baseresult {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public accountsResult() {

    }

    public accountsResult[] resource;

    public accountsResult[] getResource() {
        return resource;
    }

    public void setResource(accountsResult[] resources) {
        this.resource = resources;
    }

    public accountsResult getFirstResource() {
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
