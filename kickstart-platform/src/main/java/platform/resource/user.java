package platform.resource;

import platform.defined.resource.Baseuser;
import platform.util.Util;

public class user extends Baseuser {
	
	public static String USER_TYPE_C4T_ADMIN = "C4T_ADMIN";
	public static String USER_TYPE_BS_CONTRIBUTER = "BS_CONTRIBUTER";
	public static String USER_TYPE_ACCOUNT_MANAGER = "ACCOUNT_MANAGER";
	public static String USER_TYPE_CUSTOMER_ADMIN = "CUSTOMER_ADMIN";
	public static String USER_TYPE_FLEET_MANAGER = "FLEET_MANAGER";
	public static String USER_TYPE_HARDWARE_VENDOR = "HARDWARE_VENDOR";
	public static String USER_TYPE_SERVICING_ADMIN = "SERVICE_ADMIN";
	public static String USER_TYPE_FLEET_OWNER = "FLEET_OWNER";
	public static String USER_TYPE_USER = "USER";
	public static String USER_TYPE_PARENT = "PARENT";
	public static String USER_TYPE_STUDENT = "STUDENT";
	public static String USER_TYPE_PROVIDER = "PROVIDER";
	public static String USER_TYPE_PARTNER = "PARTNER";

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
	public boolean isAmrServiceEnabled() {
		if ("Y".equalsIgnoreCase(getAmrService())) {
			return true;
		}
		return false;
	}
	
	public boolean isGameServiceEnabled() {
		if ("Y".equalsIgnoreCase(getGameService())) {
			return true;
		}
		return false;
	}
	
	public boolean isCommunityServiceEnabled() {
		if ("Y".equalsIgnoreCase(getCommunityService())) {
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

	public boolean isDailyActivityFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_daily_activity())) {
			return true;
		}
		return false;
	}
	
	public boolean isSMSEnable() {
		if ("Y".equalsIgnoreCase(getSend_sms())) {
			return true;
		}
		return false;
	}
	
	public boolean isNoticeFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_notice())) {
			return true;
		}
		return false;
	}
	
	public boolean isAbsentReportFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_absent_report())) {
			return true;
		}
		return false;
	}
	
	public boolean isAttendanceFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_present_report())) {
			return true;
		}
		return false;
	}
	
	public boolean isProficiencyFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_proficiency())) {
			return true;
		}
		return false;
	}
	
	public boolean isWorksheetFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_work_sheet())) {
			return true;
		}
		return false;
	}
	
	public boolean isReportCardFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_report_card())) {
			return true;
		}
		return false;
	}
	
	public boolean isHomeworkFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_homework())) {
			return true;
		}
		return false;
	}
	
	public boolean isHome_practiceFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_home_practice())) {
			return true;
		}
		return false;
	}
	
	public boolean isTutorialFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_tutorial())) {
			return true;
		}
		return false;
	}
	
	public boolean isSuperAdmin() {
		if ("Y".equalsIgnoreCase(getSuper_user())) {
			return true;
		}
		return false;
	}
	
	public boolean isTransportEnable() {
		if ("Y".equalsIgnoreCase(getFeature_pick_drop())) {
			return true;
		}
		return false;
	}
	public boolean isAttendanceEnable() {
		if ("Y".equalsIgnoreCase(getFeature_present_report())) {
			return true;
		}
		return false;
	}
	public boolean isMessage2ParentFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_message2parent())) {
			return true;
		}
		return false;
	}
	
	public boolean isMessage2SchoolFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_message2school())) {
			return true;
		}
		return false;
	}
	
	public boolean isParentServiceEnable() {
		if ("Y".equalsIgnoreCase(getParentService())) {
			return true;
		}
		return false;
	}
	
	public boolean isStudentServiceEnable() {
		if ("Y".equalsIgnoreCase(getStudentService())) {
			return true;
		}
		return false;
	}
	
	public boolean isPracticalAttendanceFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_practical_attendance())) {
			return true;
		}
		return false;
	}
	
	public boolean isTimeTableFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_timetable())) {
			return true;
		}
		return false;
	}
	
	public boolean isFeesFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_fees())) {
			return true;
		}
		return false;
	}
	public boolean isAccountFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_account())) {
			return true;
		}
		return false;
	}
}


