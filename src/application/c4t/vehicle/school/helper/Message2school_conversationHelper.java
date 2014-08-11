package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.message2school_conversation;


public class Message2school_conversationHelper extends BaseHelper {
	
	Message2school_conversationHelper() {
		super(new message2school_conversation());
		// TODO Auto-generated constructor stub
	}
	private static Message2school_conversationHelper instance;
	
	public static Message2school_conversationHelper getInstance() {
		if (instance == null)
			instance = new Message2school_conversationHelper();
		return instance;
	}
	
	
	
}
