package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.batch;


public class BatchHelper extends BaseHelper {
	
	BatchHelper() {
		super(new batch());
		// TODO Auto-generated constructor stub
	}
	private static BatchHelper instance;
	
	public static BatchHelper getInstance() {
		if (instance == null)
			instance = new BatchHelper();
		return instance;
	}
}
