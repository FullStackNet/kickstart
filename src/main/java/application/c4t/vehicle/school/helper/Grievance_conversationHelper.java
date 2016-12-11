package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.grievance_conversation;


public class Grievance_conversationHelper extends BaseHelper {
	
	Grievance_conversationHelper() {
		super(new grievance_conversation());
		// TODO Auto-generated constructor stub
	}
	private static Grievance_conversationHelper instance;
	
	public static Grievance_conversationHelper getInstance() {
		if (instance == null)
			instance = new Grievance_conversationHelper();
		return instance;
	}
	
	public BaseResource[] getByThreadId(String threadId) {
		Expression e = new Expression(grievance_conversation.FIELD_THREAD_ID, REL_OP.EQ, threadId);
		return getByExpression(e, new String[]{grievance_conversation.FIELD_MESSAGE_TIME});
	}
	
}
