package platform.helper;

import platform.db.DbManager;


public class HelperFactory {
	public static String HELPER_APPLIANCE = "appliance";
	public static String HELPER_APPLIANCE_MAKE = "appliance_make";
	public static String HELPER_APPLIANCE_MODEL = "appliance_model";
	public static String HELPER_ROUTE = "route";
	public static String HELPER_DEVICE = "device";
	public static String HELPER_SENSOR= "sensor";
	public static String HELPER_CONTROLLER = "sensor";
	public static String HELPER_CUSTOMER = "customer";
	public static String HELPER_DRIVER = "driver";
	public static String HELPER_STOPAGE = "stopage";
	public static String HELPER_SCHOOL = "school";
	public static String HELPER_GATEWAY = "gateway";
	public static String HELPER_SUBJECT = "subject";
	public static String HELPER_C4T_OBJECT = "c4t_object";
	public static String HELPER_LOCATION = "location";
	
	
	public static HelperFactory instance;
	
	HelperFactory() {
		DbManager.getInstance().register(ApplianceHelper.getInstance());
		DbManager.getInstance().register(Appliance_makeHelper.getInstance());
		DbManager.getInstance().register(Appliance_modelHelper.getInstance());
		DbManager.getInstance().register(DeviceHelper.getInstance());
		DbManager.getInstance().register(ControllerHelper.getInstance());
		DbManager.getInstance().register(SensorHelper.getInstance());
		DbManager.getInstance().register(CustomerHelper.getInstance());
		DbManager.getInstance().register(UserHelper.getInstance());
		DbManager.getInstance().register(C4t_objectHelper.getInstance());
		DbManager.getInstance().register(LocationHelper.getInstance());
	}
	
	public void register(BaseHelper helper) {
		DbManager.getInstance().register(helper);
	}
	
 	public BaseHelper getHelper(String resource) {
 		return DbManager.getInstance().getHelper(resource);
	}
 	
	public static HelperFactory getInstance() {
		if (instance == null)
			instance = new HelperFactory();
		return instance;
	}
}
