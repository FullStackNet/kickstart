package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.school_class_section;


public class School_class_sectionHelper extends BaseHelper {
	School_class_sectionHelper() {
		super(new school_class_section());
		// TODO Auto-generated constructor stub
	}
	private static School_class_sectionHelper instance;
	
	public static School_class_sectionHelper getInstance() {
		if (instance == null)
			instance = new School_class_sectionHelper();
		return instance;
	}
}
