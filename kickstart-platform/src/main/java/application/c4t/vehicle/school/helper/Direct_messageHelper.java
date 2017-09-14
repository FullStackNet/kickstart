package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.direct_message;


public class Direct_messageHelper extends BaseHelper {
	
	Direct_messageHelper() {
		super(new direct_message());
		// TODO Auto-generated constructor stub
	}
	private static Direct_messageHelper instance;
	
	public static Direct_messageHelper getInstance() {
		if (instance == null)
			instance = new Direct_messageHelper();
		return instance;
	}
}
