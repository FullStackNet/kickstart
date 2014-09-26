package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.Conversation_summaryHelper;
import platform.resource.BaseResource;
import platform.resource.conversation_summary;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;

public class Conversation_summaryService extends BaseService{
	public Conversation_summaryService() {
		super(Conversation_summaryHelper.getInstance(), new conversation_summary());
	}
	
	private enum QueryTypes {
		//Expects emailId. Returns the profile associated with this emailId.
		QUERY_GET_CONVERSATION_SUMMARY,
	};
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_GET_CONVERSATION_SUMMARY.toString().equals(queryId)) {
			String userId = ctx.getUserId();
			String last_conversation_time = (String)map.get("last_conversation_time");
			return Conversation_summaryHelper.getInstance().getConversation(userId,last_conversation_time);
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
