package application.c4t.vehicle.school.resource;

import application.c4t.vehicle.school.defined.resource.Basereferral_log;
import platform.util.Util;

public class referral_log extends Basereferral_log {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public referral_log() {
        this.setId(Util.getUniqueId());
    }

    public referral_log(String id) {
        this.setId(id);
    }

    @Override
    public Class<?> getResultClass() {
        // TODO Auto-generated method stub
        return null;
    }

}
