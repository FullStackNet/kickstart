package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.news;
import application.c4t.vehicle.school.resource.parenting;


public class ParentingHelper extends BaseHelper {
	
	ParentingHelper() {
		super(new parenting());
		// TODO Auto-generated constructor stub
	}
	private static ParentingHelper instance;
	
	public static ParentingHelper getInstance() {
		if (instance == null)
			instance = new ParentingHelper();
		return instance;
	}
	
	public void updateSent(String id) throws ApplicationException {
		news object = new news(id);
		object.setSent("Y");
		ParentingHelper.getInstance().update(object);
	}
}
