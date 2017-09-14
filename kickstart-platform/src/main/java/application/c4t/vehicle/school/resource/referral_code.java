package application.c4t.vehicle.school.resource;

import application.c4t.vehicle.school.defined.resource.Basereferral_code;
import platform.util.Util;

public class referral_code extends Basereferral_code {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public referral_code() {
        this.setId(Util.getUniqueId());
    }

    public referral_code(String id) {
        this.setId(id);
    }

    @Override
    public Class<?> getResultClass() {
        // TODO Auto-generated method stub
        return null;
    }

}
