package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.tutorial;


public class TutorialHelper extends BaseHelper {
	
	TutorialHelper() {
		super(new tutorial());
		// TODO Auto-generated constructor stub
	}
	private static TutorialHelper instance;
	
	public static TutorialHelper getInstance() {
		if (instance == null)
			instance = new TutorialHelper();
		return instance;
	}
}
