package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.homework_master;


public class Homework_masterHelper extends BaseHelper {
	
	Homework_masterHelper() {
		super(new homework_master());
		// TODO Auto-generated constructor stub
	}
	private static Homework_masterHelper instance;
	
	public static Homework_masterHelper getInstance() {
		if (instance == null)
			instance = new Homework_masterHelper();
		return instance;
	}	
}
