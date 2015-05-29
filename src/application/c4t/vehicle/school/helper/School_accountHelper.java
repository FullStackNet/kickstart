package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.school_account;


public class School_accountHelper extends BaseHelper {
	
	School_accountHelper() {
		super(new school_account());
		// TODO Auto-generated constructor stub
	}
	private static School_accountHelper instance;
	
	public static School_accountHelper getInstance() {
		if (instance == null)
			instance = new School_accountHelper();
		return instance;
	}
}
