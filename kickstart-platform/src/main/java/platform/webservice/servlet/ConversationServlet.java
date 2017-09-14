package platform.webservice.servlet;

import platform.resource.conversation;
import platform.webservice.BaseServlet;
import platform.webservice.service.ConversationService;

public class ConversationServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ConversationServlet() {
		super(new conversation(), new ConversationService());
	}
}
