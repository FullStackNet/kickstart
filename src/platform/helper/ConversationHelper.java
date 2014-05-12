package platform.helper;

import java.util.ArrayList;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.conversation;
import platform.util.Util;


public class ConversationHelper extends BaseHelper {
	
	public ConversationHelper() {
		super(new conversation());
		// TODO Auto-generated constructor stub
	}
	private static ConversationHelper instance;
	
	public static ConversationHelper getInstance() {
		if (instance == null)
			instance = new ConversationHelper();
		return instance;
	}
	
	public void deleteConversation(String id) {
		Expression e = new Expression(conversation.FIELD_ID, REL_OP.EQ, id);
		deleteByExpression(e);
	}
	
	public BaseResource[] getConversation(String userId, String toUserID,String last_conversation_time) {
		String id = conversation.id(userId, toUserID);
		conversation _resource = (conversation)getById(id);
		if ((_resource == null ) || Util.isEmpty(_resource.getMessages()))
				return null;
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		for(int i =0; i < _resource.getMessages().size() ; i++) {
			String message = (String)_resource.getMessages().get(i);
			int pos = message.indexOf(":");
			String direction = message.substring(0, pos);
			message = message.substring(pos+1);
			pos = message.indexOf(":");
			String time = message.substring(0, pos);
			message = message.substring(pos+1);
					
			if (last_conversation_time != null) {
				long l_last_conversation_time = Long.parseLong(last_conversation_time);
				long message_time =  Long.parseLong(time);
				if (message_time <= l_last_conversation_time)
					continue;
			}
			conversation messageResource = new conversation();
			messageResource.setMessage_time(Long.parseLong(time));
			messageResource.setMessage_text(message);
			messageResource.setDirection(direction);
			list.add(messageResource);
		}
		return list.toArray(new conversation[list.size()]);
	}
}
