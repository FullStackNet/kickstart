package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.designation;


public class DesignationHelper extends BaseHelper {
	DesignationHelper() {
		super(new designation());
		// TODO Auto-generated constructor stub
	}
	private static DesignationHelper instance;
	
	public static DesignationHelper getInstance() {
		if (instance == null)
			instance = new DesignationHelper();
		return instance;
	}
	
	
}
