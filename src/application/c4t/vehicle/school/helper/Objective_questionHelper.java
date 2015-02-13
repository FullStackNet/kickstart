package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.objective_question;


public class Objective_questionHelper extends BaseHelper {
	
	Objective_questionHelper() {
		super(new objective_question());
		// TODO Auto-generated constructor stub
	}
	private static Objective_questionHelper instance;
	
	public static Objective_questionHelper getInstance() {
		if (instance == null)
			instance = new Objective_questionHelper();
		return instance;
	}
}
