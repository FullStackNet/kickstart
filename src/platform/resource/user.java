package platform.resource;

import platform.defined.resource.Baseuser;
import platform.util.Util;

public class user extends Baseuser {
	
	public static String USER_TYPE_C4T_ADMIN = "C4T_ADMIN";
	public static String USER_TYPE_ACCOUNT_MANAGER = "ACCOUNT_MANAGER";
	public static String USER_TYPE_CUSTOMER_ADMIN = "CUSTOMER_ADMIN";
	public static String USER_TYPE_FLEET_MANAGER = "FLEET_MANAGER";
	public static String USER_TYPE_HARDWARE_VENDOR = "HARDWARE_VENDOR";
	public static String USER_TYPE_SERVICING_ADMIN = "SERVICE_ADMIN";
	public static String USER_TYPE_FLEET_OWNER = "FLEET_OWNER";
	public static String USER_TYPE_USER = "USER";
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public user() {
		this.setId(Util.getUniqueId());
	}
	
	public user(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean isHomeAutomationEnabled() {
		if ("Y".equalsIgnoreCase(getHomeAutomationService())) {
			return true;
		}
		return false;
	}
	
	public boolean isBrushupSkillEnabled() {
		if ("Y".equalsIgnoreCase(getBrushUpSkillService())) {
			return true;
		}
		return false;
	}
	public boolean isFleetServiceEnable() {
		if ("Y".equalsIgnoreCase(getFleetService())) {
			return true;
		}
		return false;
	}
	
	public boolean isDGServiceEnable() {
		if ("Y".equalsIgnoreCase(getDgService())) {
			return true;
		}
		return false;
	}
	
	public boolean isSchoolTrackerServiceEnable() {
		if ("Y".equalsIgnoreCase(getSchoolTrackerService())) {
			return true;
		}
		return false;
	}

}
