package application.helper;

import application.resource.$resourcename;
import platform.helper.BaseHelper;

public class $ResourcenameHelper extends BaseHelper {

    private $ResourcenameHelper() {
        super(new $resourcename());
    }

    private static $ResourcenameHelper instance;

    public static $ResourcenameHelper getInstance() {
        if (instance == null)
            instance = new $ResourcenameHelper();
        return instance;
    }
}
