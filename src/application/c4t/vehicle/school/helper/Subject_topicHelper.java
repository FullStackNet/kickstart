package application.c4t.vehicle.school.helper;

import application.c4t.vehicle.school.resource.subject_topic;
import platform.helper.BaseHelper;


public class Subject_topicHelper extends BaseHelper {
	
	Subject_topicHelper() {
		super(new subject_topic());
		// TODO Auto-generated constructor stub
	}
	private static Subject_topicHelper instance;
	
	public static Subject_topicHelper getInstance() {
		if (instance == null)
			instance = new Subject_topicHelper();
		return instance;
	}
}
