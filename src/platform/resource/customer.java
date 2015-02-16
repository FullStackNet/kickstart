package platform.resource;

import platform.defined.resource.Basecustomer;
import platform.util.Util;

public class customer extends Basecustomer {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public customer() {
		this.setId(Util.getUniqueId());
	}
	
	public customer(String id) {
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
	
	public boolean isSchoolServiceEnable() {
		if ("Y".equalsIgnoreCase(getSchoolTrackerService())) {
			return true;
		}
		return false;
	}

}
