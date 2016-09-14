package application.c4t.vehicle.school.resource;

import platform.util.Util;
import platform.webservice.ui.definition.IdValue;
import application.c4t.vehicle.school.defined.resource.Baseschool;

public class school extends Baseschool {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public school() {
		this.setId(Util.getUniqueId());
	}
	
	public school(String id) {
		this.setId(id);
	}	
	
	public String getShort_name() {
		if (super.getShort_name() != null) {
			return super.getShort_name();
		}
		return getName();
	}
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean isDailyActivityFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_daily_activity())) {
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
	
	public boolean isPracticalAttendanceFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_practical_attendance())) {
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
	
	public boolean isAccountFeatureEnable() {
		if ("Y".equalsIgnoreCase(getFeature_account())) {
			return true;
		}
		return false;
	}
	
	public static String SCHOOL_TYPE_PRESCHOOL = "PRESCHOOL";
	public static String SCHOOL_TYPE_COMPTATIVE_EXAM_COACHING = "COMPTATIVE_EXAM_COACHING";
	public static String SCHOOL_TYPE_COPORATE_TEST = "COPORATE_TEST";
	
	
	public static IdValue[] getTypeOption() {
		IdValue[] options = {new IdValue(SCHOOL_TYPE_PRESCHOOL, "Pre School"), 
				new IdValue(SCHOOL_TYPE_COMPTATIVE_EXAM_COACHING, "COMPTATIVE EXAMS COACHING"),
				new IdValue(SCHOOL_TYPE_COPORATE_TEST, "Corporate Test"),
				new IdValue("SCHOOL", "SCHOOL")};
		return options;
	}
}
