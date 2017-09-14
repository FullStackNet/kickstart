package application.account.helper;

import application.account.resource.ledgers;
import platform.helper.BaseHelper;

public class LedgersHelper extends BaseHelper {

    private static LedgersHelper instance;

    public static LedgersHelper getInstance() {
        if (instance == null)
            instance = new LedgersHelper();
        return instance;
    }

    public LedgersHelper() {
        super(new ledgers());
        // TODO Auto-generated constructor stub
    }
}
