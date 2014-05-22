package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.class_section;


public class Class_sectionHelper extends BaseHelper {
	
	Class_sectionHelper() {
		super(new class_section());
		// TODO Auto-generated constructor stub
	}
	private static Class_sectionHelper instance;
	
	public static Class_sectionHelper getInstance() {
		if (instance == null)
			instance = new Class_sectionHelper();
		return instance;
	}
}
