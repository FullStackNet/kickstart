package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.tutorial_category;


public class Tutorial_catgoeryHelper extends BaseHelper {
	
	Tutorial_catgoeryHelper() {
		super(new tutorial_category());
		// TODO Auto-generated constructor stub
	}
	private static Tutorial_catgoeryHelper instance;
	
	public static Tutorial_catgoeryHelper getInstance() {
		if (instance == null)
			instance = new Tutorial_catgoeryHelper();
		return instance;
	}
}
