package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.doubt;
import application.c4t.vehicle.school.resource.news;


public class DoubtHelper extends BaseHelper {
	
	DoubtHelper() {
		super(new doubt());
		// TODO Auto-generated constructor stub
	}
	private static DoubtHelper instance;
	
	public static DoubtHelper getInstance() {
		if (instance == null)
			instance = new DoubtHelper();
		return instance;
	}
	
	public void updateSent(String id) throws ApplicationException {
		news object = new news(id);
		object.setSent("Y");
		DoubtHelper.getInstance().update(object);
	}
}
