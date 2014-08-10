package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.message2parent_conversation;


public class Message2parent_conversationHelper extends BaseHelper {
	
	Message2parent_conversationHelper() {
		super(new message2parent_conversation());
		// TODO Auto-generated constructor stub
	}
	private static Message2parent_conversationHelper instance;
	
	public static Message2parent_conversationHelper getInstance() {
		if (instance == null)
			instance = new Message2parent_conversationHelper();
		return instance;
	}
	
	
	
}
