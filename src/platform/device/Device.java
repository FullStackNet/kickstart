package platform.device;

public class Device {
	public static String DEVICE_TYPE_GATEWAY = "GATEWAY";
	public static String DEVICE_TYPE_CONTROLLER = "CONTROLLER";
	public static String DEVICE_TYPE_CLOUD_CONNECTOR = "CLOUD_CONNECTOR";
	public static String DEVICE_TYPE_OBD = "OBD";
	public static String DEVICE_TYPE_PROBE = "PROBE";
	
	public static String DEVICE_MODEL_V3_DG_SNG_01 = "V3-DG-SNG-01";
	public static String DEVICE_MODEL_CIS_TRACKER_SNG_01 = "CIS-TRACKER-SNG-01";
	public static String DEVICE_MODEL_C4T_BLUETOOTH_OBD_01 = "C4T-BLUETOOTH-OBD-01";
	public static String DEVICE_MODEL_NETVOX_SWITCH_01 = "DEVICE_MODEL_NETVOX_SWITCH_01";
	public static String DEVICE_MODEL_V3_TRACKER_SNG_01 = "V3-TRACKER-SNG-01";
	public static String DEVICE_MODEL_ACPTRACKER_1500 = "ACP-1500";
	public static String DEVICE_MANAGER_ACPREADER_1500 = "ACP-READER-1500";
	public static String DEVICE_MODEL_C4T_DG_SNG_01 = "C4T-DG-SNG-01";
	public static String DEVICE_MODEL_JMN_TRACKER_1000 = "JMN-TRACKER-1000";
	
	
	public static String DEVICE_MANAGER_V3 = "V3";
	public static String DEVICE_MANAGER_C4T = "C4T";
	public static String DEVICE_MANAGER_V3TRACKER = "V3TRACKER";
	public static String DEVICE_MANAGER_CISTRACKER = "CISTRACKER";
	public static String DEVICE_MANAGER_ACPTRACKER = "ACPTRACKER";
	public static String DEVICE_MANAGER_JMNTRACKER = "JMNTRACKER";
	public static String DEVICE_MANAGER_ACPREADER = "ACPREADER";
	
	public static String DEVICE_MANAGER_DIC = "DIC";
	public static String DEVICE_MANAGER_NETVOX = "NETVOX";
	public static String DEVICE_MANAGER_MOBD = "MOBD";
	public static String DEVICE_MANAGER_OBD = "OBD";
	public static String DEVICE_TYPE_DEPLOYMENT_SCHOOL="SCHOOL";
	public static String DEVICE_TYPE_DEPLOYMENT_BUS="BUS";
	public static String DEVICE_TYPE_DEPLOYMENT_OFFICE="OFFICE";
	public static String DEVICE_TYPE_DEPLOYMENT_OTHER="OTHER";
			
	public static String[] getDeploymentType() {
		String[] list = {
				DEVICE_TYPE_DEPLOYMENT_SCHOOL,
				DEVICE_TYPE_DEPLOYMENT_BUS,
				DEVICE_TYPE_DEPLOYMENT_OFFICE,
				DEVICE_TYPE_DEPLOYMENT_OTHER
		};
		return list;
	}
	
	public static String[] getList() {
		String[] list = {
				DEVICE_TYPE_GATEWAY,
				DEVICE_TYPE_CONTROLLER,
				DEVICE_TYPE_CLOUD_CONNECTOR,
				DEVICE_TYPE_OBD,
				DEVICE_TYPE_PROBE
		};
		return list;
	}
	
	public static String[] getManagerList() {
		String[] list = {
				DEVICE_MANAGER_ACPTRACKER,
				DEVICE_MANAGER_C4T,
				DEVICE_MANAGER_CISTRACKER,
				DEVICE_MANAGER_DIC,
				DEVICE_MANAGER_MOBD,
				DEVICE_MANAGER_NETVOX,
				DEVICE_MANAGER_OBD,
				DEVICE_MANAGER_V3TRACKER,
				DEVICE_MANAGER_V3,
				DEVICE_MANAGER_ACPREADER,
				DEVICE_MANAGER_JMNTRACKER
		};
		return list;
	}
	public static String[] getModelList() {
		String[] list = {
				DEVICE_MODEL_ACPTRACKER_1500,
				DEVICE_MODEL_V3_TRACKER_SNG_01,
				DEVICE_MODEL_CIS_TRACKER_SNG_01,
				DEVICE_MODEL_V3_DG_SNG_01,
				DEVICE_MODEL_C4T_BLUETOOTH_OBD_01,
				DEVICE_MODEL_NETVOX_SWITCH_01,
				DEVICE_MODEL_C4T_DG_SNG_01,
				DEVICE_MANAGER_ACPREADER_1500,
				DEVICE_MODEL_JMN_TRACKER_1000
		};
		return list;
	}
}
