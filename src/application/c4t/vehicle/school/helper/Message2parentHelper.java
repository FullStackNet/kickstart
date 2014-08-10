package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.message2parent;


public class Message2parentHelper extends BaseHelper {
	
	Message2parentHelper() {
		super(new message2parent());
		// TODO Auto-generated constructor stub
	}
	private static Message2parentHelper instance;
	
	public static Message2parentHelper getInstance() {
		if (instance == null)
			instance = new Message2parentHelper();
		return instance;
	}
	
	
	
}
