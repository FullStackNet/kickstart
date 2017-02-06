package application.c4t.vehicle.school.resource;

import application.c4t.vehicle.school.defined.resource.Baserecharge_log;
import platform.util.Util;

public class recharge_log extends Baserecharge_log {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public recharge_log() {
        this.setId(Util.getUniqueId());
    }

    public recharge_log(String id) {
        this.setId(id);
    }

    @Override
    public Class<?> getResultClass() {
        // TODO Auto-generated method stub
        return null;
    }

}
