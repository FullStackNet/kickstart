package platform.resource;

import platform.defined.resource.Basemandi_arrival;
import platform.util.Util;

public class mandi_arrival extends Basemandi_arrival {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public mandi_arrival() {
        this.setId(Util.getUniqueId());
    }

    public mandi_arrival(String id) {
        this.setId(id);
    }

    @Override
    public Class<?> getResultClass() {
        // TODO Auto-generated method stub
        return null;
    }

}
