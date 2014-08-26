package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
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
	
	public BaseResource[] getBySchool(String schoolId) {
		Expression e = new Expression(school_class_section.FIELD_SCHOOL_ID, REL_OP.EQ,schoolId);
		return getByExpression(e);
	}
}
