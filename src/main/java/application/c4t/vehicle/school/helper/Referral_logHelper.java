package application.c4t.vehicle.school.helper;

import application.c4t.vehicle.school.resource.referral_log;
import platform.helper.BaseHelper;


public class Referral_logHelper extends BaseHelper {
    Referral_logHelper() {
        super(new referral_log());
        // TODO Auto-generated constructor stub
    }

    private static Referral_logHelper instance;

    public static Referral_logHelper getInstance() {
        if (instance == null)
            instance = new Referral_logHelper();
        return instance;
    }


}
