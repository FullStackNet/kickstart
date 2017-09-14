package application.c4t.vehicle.helper;

import application.c4t.vehicle.school.resource.referral_code;
import platform.helper.BaseHelper;


public class Referral_codeHelper extends BaseHelper {

    public Referral_codeHelper() {
        super(new referral_code());
        // TODO Auto-generated constructor stub
    }

    private static Referral_codeHelper instance;

    public static Referral_codeHelper getInstance() {
        if (instance == null)
            instance = new Referral_codeHelper();
        return instance;
    }
}
