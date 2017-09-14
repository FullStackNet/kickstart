package platform.helper;

import java.util.ArrayList;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.conversation_summary;
import platform.util.Util;


public class Conversation_summaryHelper extends BaseHelper {
	
	public Conversation_summaryHelper() {
		super(new conversation_summary());
		// TODO Auto-generated constructor stub
	}
	private static Conversation_summaryHelper instance;
	
	public static Conversation_summaryHelper getInstance() {
		if (instance == null)
			instance = new Conversation_summaryHelper();
		return instance;
	}
	
	public BaseResource[] getConversation(String userId,String last_conversation_time) {
		Expression e= new Expression(conversation_summary.FIELD_USER_ID, REL_OP.EQ, userId);
		BaseResource[] resources = getByExpression(e);
		if (Util.isEmpty(resources))
				return null;
		
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		for(int i =0; i < resources.length ; i++) {
			conversation_summary summary = (conversation_summary) resources[i];
			if (last_conversation_time != null) {
				long l_last_conversation_time = Long.parseLong(last_conversation_time);
				if (summary.getMessage_time() <= l_last_conversation_time)
					continue;
			}
			list.add(summary);
		}
		return list.toArray(new conversation_summary[list.size()]);
	}
}
