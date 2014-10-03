package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.assessment_period;


public class Assessment_periodHelper extends BaseHelper {
	
	Assessment_periodHelper() {
		super(new assessment_period());
		// TODO Auto-generated constructor stub
	}
	private static Assessment_periodHelper instance;
	
	public static Assessment_periodHelper getInstance() {
		if (instance == null)
			instance = new Assessment_periodHelper();
		return instance;
	}
}
