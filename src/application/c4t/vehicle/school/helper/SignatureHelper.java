package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.signature;


public class SignatureHelper extends BaseHelper {
	
	SignatureHelper() {
		super(new signature());
		// TODO Auto-generated constructor stub
	}
	private static SignatureHelper instance;
	
	public static SignatureHelper getInstance() {
		if (instance == null)
			instance = new SignatureHelper();
		return instance;
	}
}
