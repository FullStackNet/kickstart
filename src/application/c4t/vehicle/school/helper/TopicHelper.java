package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.topic;


public class TopicHelper extends BaseHelper {
	
	TopicHelper() {
		super(new topic());
		// TODO Auto-generated constructor stub
	}
	private static TopicHelper instance;
	
	public static TopicHelper getInstance() {
		if (instance == null)
			instance = new TopicHelper();
		return instance;
	}
}
