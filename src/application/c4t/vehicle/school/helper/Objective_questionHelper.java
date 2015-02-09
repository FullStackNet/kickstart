package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.news;


public class Objective_questionHelper extends BaseHelper {
	
	Objective_questionHelper() {
		super(new news());
		// TODO Auto-generated constructor stub
	}
	private static Objective_questionHelper instance;
	
	public static Objective_questionHelper getInstance() {
		if (instance == null)
			instance = new Objective_questionHelper();
		return instance;
	}
}
