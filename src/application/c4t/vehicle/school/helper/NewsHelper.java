package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.news;


public class NewsHelper extends BaseHelper {
	
	NewsHelper() {
		super(new news());
		// TODO Auto-generated constructor stub
	}
	private static NewsHelper instance;
	
	public static NewsHelper getInstance() {
		if (instance == null)
			instance = new NewsHelper();
		return instance;
	}
	
	public void updateSent(String id) throws ApplicationException {
		news object = new news(id);
		object.setSent("Y");
		NewsHelper.getInstance().update(object);
	}
}
