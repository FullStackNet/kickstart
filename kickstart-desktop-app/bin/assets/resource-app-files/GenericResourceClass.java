package application.resource;

import application.defined.resource.Base$resourcename;
import platform.util.Util;

public class $resourcename extends Base$resourcename {

    private static final long serialVersionUID = 1L;

    public $resourcename() {
        this.setId(Util.getUniqueId());
    }

    public $resourcename(String id) {
        this.setId(id);
    }

    @Override
    public Class<?> getResultClass() {
        // TODO Auto-generated method stub
        return null;
    }
}
