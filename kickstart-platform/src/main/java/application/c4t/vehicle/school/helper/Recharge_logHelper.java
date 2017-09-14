package application.c4t.vehicle.school.helper;

import application.c4t.vehicle.school.resource.recharge_log;
import platform.helper.BaseHelper;


public class Recharge_logHelper extends BaseHelper {
    Recharge_logHelper() {
        super(new recharge_log());
        // TODO Auto-generated constructor stub
    }

    private static Recharge_logHelper instance;

    public static Recharge_logHelper getInstance() {
        if (instance == null)
            instance = new Recharge_logHelper();
        return instance;
    }


}
