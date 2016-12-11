package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.provider;


public class ProviderHelper extends BaseHelper {
	
	ProviderHelper() {
		super(new provider());
		// TODO Auto-generated constructor stub
	}
	private static ProviderHelper instance;
	
	public static ProviderHelper getInstance() {
		if (instance == null)
			instance = new ProviderHelper();
		return instance;
	}
	
}
