package platform.appliances;

public class  Appliance {
	public static String APPLIANCE_READER = "READER";
	public static String APPLIANCE_VEHICLE = "VEHICLE";
	public static String APPLIANCE_DG = "DG";
	
	public static String[] getList() {
		String[] list = {
				APPLIANCE_VEHICLE,
				APPLIANCE_DG		
		};
		return list;
	}
}
