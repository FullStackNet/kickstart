package platform.helper;

import platform.resource.mandi_arrival;


public class Mandi_arrivalHelper extends BaseHelper {

    public Mandi_arrivalHelper() {
        super(new mandi_arrival());
        // TODO Auto-generated constructor stub
    }

    private static Mandi_arrivalHelper instance;

    public static Mandi_arrivalHelper getInstance() {
        if (instance == null)
            instance = new Mandi_arrivalHelper();
        return instance;
    }

}
