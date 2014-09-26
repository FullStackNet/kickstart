package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.ConversationHelper;
import platform.helper.Conversation_summaryHelper;
import platform.resource.BaseResource;
import platform.resource.conversation;
import platform.resource.conversation_summary;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class ConversationService extends BaseService{
	public ConversationService() {
		super(ConversationHelper.getInstance(), new conversation());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		conversation _resource = (conversation) resource;
		
		String id = conversation.id(ctx.getUserId(), _resource.getTo_user_id());
		conversation _update_resource =new conversation(id);
		_update_resource.addMessages("TO:"+System.currentTimeMillis()+":"+_resource.getMessage_text());
		getHelper().AddOrUpdate(_update_resource);
		
		id = conversation.id(_resource.getTo_user_id(),ctx.getUserId());
		_update_resource =new conversation(id);
		_update_resource.addMessages("FROM:"+System.currentTimeMillis()+":"+_resource.getMessage_text());
		getHelper().AddOrUpdate(_update_resource);
		
		
		conversation_summary summary = new conversation_summary(id);
		summary.setUser_id(_resource.getTo_user_id());
		summary.setFrom_user_id(ctx.getUserId());
		summary.setFrom_user_name(ctx.getUserName());
		summary.setMessage_time(System.currentTimeMillis());
		summary.setMessage_text(_resource.getMessage_text());
		Conversation_summaryHelper.getInstance().AddOrUpdate(summary);
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_DELETE)) {
			conversation _resource = (conversation) resource;
			String userId = ctx.getUserId();
			String toUser = (String)(_resource.getTo_user_id());
			String id = conversation.id(userId, toUser);
			conversation _conversation = (conversation) ConversationHelper.getInstance().getById(id);
			if (_conversation != null) {
				ConversationHelper.getInstance().deleteConversation(id);
			}			
			return;
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_ACTION);
	}
	
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().update(resource);
	}
	
	private enum QueryTypes {
		//Expects emailId. Returns the profile associated with this emailId.
		QUERY_GET_CONVERSATION,
	};
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_GET_CONVERSATION.toString().equals(queryId)) {
			String userId = ctx.getUserId();
			String toUser = (String)map.get("to_user_id");
			String last_conversation_time = (String)map.get("last_conversation_time");
			
			return ConversationHelper.getInstance().getConversation(userId,toUser,last_conversation_time);
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
