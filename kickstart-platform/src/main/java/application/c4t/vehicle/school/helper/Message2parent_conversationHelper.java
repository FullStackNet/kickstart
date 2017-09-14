package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.message2parent_conversation;
import application.c4t.vehicle.school.resource.message2school_conversation;


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
	
	public BaseResource[] getByThreadId(String threadId) {
		Expression e = new Expression(message2parent_conversation.FIELD_THREAD_ID, REL_OP.EQ, threadId);
		return getByExpression(e, new String[]{message2school_conversation.FIELD_MESSAGE_TIME});
	}
	
}
