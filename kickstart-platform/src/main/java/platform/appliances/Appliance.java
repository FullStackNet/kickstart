package platform.appliances;

public class  Appliance {
	public static String APPLIANCE_READER = "READER";
	public static String APPLIANCE_VEHICLE = "VEHICLE";
	public static String APPLIANCE_GAME_UNIT = "GAME_UNIT";
	public static String APPLIANCE_METER = "METER";
	public static String APPLIANCE_DG = "DG";
	public static String APPLIANCE_HOME_APPLAINCE = "HOME_APPLAINCE";
	
	public static String[] getList() {
		String[] list = {
				APPLIANCE_VEHICLE,
				APPLIANCE_DG,
				APPLIANCE_HOME_APPLAINCE
		};
		return list;
	}
}
