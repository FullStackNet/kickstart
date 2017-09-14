package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.doubt_conversation;
import application.c4t.vehicle.school.resource.news;


public class Doubt_conversationHelper extends BaseHelper {
	
	Doubt_conversationHelper() {
		super(new doubt_conversation());
		// TODO Auto-generated constructor stub
	}
	private static Doubt_conversationHelper instance;
	
	public static Doubt_conversationHelper getInstance() {
		if (instance == null)
			instance = new Doubt_conversationHelper();
		return instance;
	}
	
	public void updateSent(String id) throws ApplicationException {
		news object = new news(id);
		object.setSent("Y");
		Doubt_conversationHelper.getInstance().update(object);
	}
}
